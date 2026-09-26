package io.github.ctgnz.jmsfx.generator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import io.github.ctgnz.jmsfx.generator.yaml.JmsfxParser;

/**
 * Rewrites the SVG fragments into a predictable form: the editor's own metadata stripped out, and the XML pretty-printed with real element nesting.
 * <p>
 * The fragments are edited in Inkscape, which rewrites a file on every save - injecting its metadata, re-serialising coordinates, and laying the result out either entirely on one
 * line or with every attribute on a line of its own. Neither nests elements, so a fragment of any size is hard to read, and a file's diff is dominated by changes that have nothing
 * to do with the drawing. See jmsfx#71.
 * <p>
 * <strong>Reports by default and writes nothing.</strong> Pass {@code --apply} to rewrite the files in place.
 *
 * <pre>
 * java io.github.ctgnz.jmsfx.generator.FragmentNormaliser [--apply] [--show &lt;path&gt;] [/config.yml] [/config-hallux.yml]
 * </pre>
 *
 * Every rewrite is checked against {@link SvgFingerprint}: a file that would come back describing a different drawing is reported and left alone, never written. That makes "this
 * reformat did not change what anything draws" a property the run verifies rather than one the author asserts. Structure, attributes and text have to match exactly; numbers are
 * compared numerically, within {@link #VERIFY_TOLERANCE}, since the one step here that touches them deliberately moves a few by a fraction of a thousandth of a unit.
 */
public class FragmentNormaliser {

    private static final int INDENT = 2;

    /** An id is worth keeping only if something in the same document points at it - {@code url(#x)} in a style or paint, or an {@code href} into the file itself. */
    private static final Pattern REFERENCE = Pattern.compile("url\\(\\s*#([^)\\s]+)\\s*\\)|^#(.+)$");

    /**
     * An id that is an editor's serial number rather than a name, and so carries no meaning to lose.
     * <p>
     * The fragments use ids for two quite different things. Most are what the editor stamped on whatever it happened to serialise - {@code path2999}, {@code line4},
     * {@code defs28}, Illustrator's {@code XMLID_1_} and its hex-encoded {@code _x3C_path_x3E_}. But a few hundred name parts of the icon construction - {@code main},
     * {@code octagon}, {@code outFrame}, {@code frame}, {@code mod1} / {@code mod2}, {@code Amplifier}, {@code echelon}, {@code HQTFFD}, {@code template}, the {@code varT} /
     * {@code varW} / {@code varAM} template variables - and those are worth keeping even though nothing resolves them in code today.
     * <p>
     * The test is deliberately conservative: an SVG element name followed by digits, and nothing else. A name like {@code mod2_1_} or {@code varW1} does not match, because
     * {@code mod} and {@code var} are not element names.
     */
    private static final Pattern GENERATED_ID = Pattern.compile("^(?:(?:svg|g|path|line|polyline|polygon|rect|circle|ellipse|text|tspan|use|defs|image|marker|stop"
                                                                + "|linearGradient|radialGradient|clipPath|mask|pattern|filter|symbol|title|desc|namedview|flowRoot|flowPara)"
                                                                + "[-_]?\\d+(?:[-_]\\d+)*_?|XMLID_\\d+_|_x3C_.*_x3E_.*)$");

    private static final String ID_ATTRIBUTE = "id";

    /**
     * Attributes whose value is a coordinate list, and whose internal whitespace is therefore layout rather than content.
     * <p>
     * Illustrator wraps its output at a fixed width and leaves the continuation's indentation inside the attribute, so a {@code d} arrives as
     * {@code "   M469.55,617.323c0.007,0,0.015,0,0.021,0...H142.429h0.02   -0.007,0,..."} - leading spaces, trailing spaces, and runs of three or four mid-value. Two files drawing
     * the same shape can differ purely in where that wrapping fell, which is exactly what makes duplicates hard to spot.
     * <p>
     * Runs collapse to one space and the ends are trimmed. Nothing else: a single space between two numbers is a separator and removing it would silently join them into one
     * coordinate. {@link SvgFingerprint#equivalent} would catch that, since the two sides stop lining up number for number as soon as one of them is lost.
     */
    private static final Set<String> COORDINATE_ATTRIBUTES = Set.of("d", "points");

    /** Attributes whose values are numbers, and so are worth writing at their shortest faithful length. */
    private static final Set<String> NUMERIC_ATTRIBUTES = Set.of("d", "points", "x", "y", "x1", "y1", "x2", "y2", "cx", "cy", "r", "rx", "ry", "width", "height", "viewBox",
        "transform", "stroke-width", "stroke-dasharray", "stroke-dashoffset", "stroke-miterlimit", "font-size", "offset", "opacity", "fill-opacity", "stroke-opacity", "style");

    /**
     * Only a number carrying a decimal point is a candidate, which is what keeps this away from everything else a value can hold.
     * <p>
     * A hex colour has no point, so {@code #0000ff} is never seen as a number - a trap worth naming, because {@link SvgFingerprint}'s own rounding does fall into it and reduces
     * that colour to {@code #0.000ff} internally. Harmless there, since it does the same to both sides of a comparison, but it must not reach a file.
     */
    private static final Pattern DECIMAL = Pattern.compile("\\d+\\.\\d+");

    /**
     * How far a number may be moved to write it more briefly, in user units on a 612x792 canvas.
     * <p>
     * Inkscape round-trips coordinates through 32-bit floats, which holds about seven significant decimal digits, so a value near 300 comes back perturbed in the fifth decimal:
     * {@code 303.52} returns as {@code 303.51999} and {@code 4.25} as {@code 4.24999996}. At 1e-5 the shortest faithful form recovers those, while a genuinely precise
     * {@code 24.0012} is left alone because writing it as {@code 24.001} would move it by 2e-4.
     * <p>
     * The bound is absolute rather than relative on purpose: what matters is where a point lands on a fixed canvas, not its magnitude. A relative bound let the largest coordinate
     * in the set, {@code 74808.3359}, move by 0.036 units, which is the wrong trade entirely.
     * <p>
     * 1e-5 of a 612-unit canvas is one part in 61 million - below a thousandth of a pixel at any size these are rendered at.
     */
    private static final double TOLERANCE = 1e-5;

    /**
     * The bound the rewrite is checked against afterwards, deliberately looser than the one it was made under.
     * <p>
     * The two are computed differently - {@link #shorten} compares a value against its own candidate string, while verification re-parses both documents and compares what it finds
     * - so a change made at exactly {@link #TOLERANCE} can measure a fraction above it on the way back: {@code 303.52 - 303.51999} is not 1e-5 in binary floating point but a few
     * ulps over. Verifying at the same number makes the check fail on arithmetic rather than on anything real.
     * <p>
     * Twice the rewrite bound leaves no room for that while giving nothing away: 2e-5 is still a fifty-thousandth of a user unit, and every mistake worth catching - a coordinate
     * genuinely moved, a separator lost, an element or a glyph gone - is orders of magnitude larger.
     */
    private static final double VERIFY_TOLERANCE = 2 * TOLERANCE;

    public static void main(String[] args) throws Exception {
        List<String> rest = new ArrayList<>(Arrays.asList(args));
        boolean apply = rest.remove("--apply");
        boolean check = rest.remove("--check");
        String show = take(rest, "--show");
        List<Path> directories = new ArrayList<>();
        for (String dir = take(rest, "--dir"); dir != null; dir = take(rest, "--dir")) {
            directories.add(Path.of(dir));
        }

        FragmentNormaliser normaliser = new FragmentNormaliser();
        List<String> dirty = new ArrayList<>();
        if (directories.isEmpty()) {
            String left = !rest.isEmpty() ? rest.remove(0) : "/config.yml";
            String right = !rest.isEmpty() ? rest.remove(0) : "/config-hallux.yml";
            for (String config : List.of(left, right)) {
                dirty.addAll(normaliser.run(normaliser.svgRoot(config), config, apply, show));
            }
        } else {
            for (Path directory : directories) {
                // A directory that is not there is not a failure. The build passes this in from the
                // module layout, and a check bound to it has to survive someone building a subset of
                // the reactor, or a checkout where a sibling repository simply is not present.
                if (!Files.isDirectory(directory)) {
                    System.out.format("%nno such directory, skipping: %s%n", directory);
                    continue;
                }
                dirty.addAll(normaliser.run(directory, directory.toString(), apply, show));
            }
        }

        if (check && !dirty.isEmpty()) {
            // Thrown rather than exited, because this runs in Maven's own JVM under exec:java -
            // System.exit would take the build down without a message worth reading.
            throw new IllegalStateException(String.format(
                "%d SVG fragment%s %s not normalised: %s%s%nRun the normaliser with --apply to bring %s into line:"
                                                          + "%n    mvn -q -pl jmsfx-generator exec:java -Dexec.mainClass=%s -Dexec.args=--apply%n",
                dirty.size(), dirty.size() == 1 ? "" : "s", dirty.size() == 1 ? "is" : "are",
                String.join(", ", dirty.subList(0, Math.min(5, dirty.size()))),
                dirty.size() > 5 ? String.format(" (and %d more)", dirty.size() - 5) : "",
                dirty.size() == 1 ? "it" : "them", FragmentNormaliser.class.getName()));
        }
    }

    /** Removes {@code flag} and the value after it from {@code args}, or returns null if the flag is not there. */
    private static String take(List<String> args, String flag) {
        int at = args.indexOf(flag);
        if (at < 0) {
            return null;
        }
        args.remove(at);
        return at < args.size() ? args.remove(at) : null;
    }

    private final JmsfxParser parser = new JmsfxParser();

    /** Normalises one tree, returning the fragments that changed - or that would have, when only reporting. */
    public List<String> run(Path root, String label, boolean apply, String show) throws Exception {
        System.out.format("%n%s%n%s%n", label, root);

        List<String> changed = new ArrayList<>();
        List<String> unreadable = new ArrayList<>();
        List<String> refused = new ArrayList<>();
        TreeMap<String, Integer> reasons = new TreeMap<>();
        int unchanged = 0;

        for (Path file : index(root)) {
            String name = root.relativize(file)
                .toString()
                .replace('\\', '/');
            byte[] original;
            Document document;
            try {
                original = Files.readAllBytes(file);
                try (InputStream in = new ByteArrayInputStream(original)) {
                    document = SvgFingerprint.parse(in);
                }
            } catch (Exception e) {
                unreadable.add(name);
                continue;
            }

            String before = SvgFingerprint.exact(document);
            Tally tally = new Tally();
            strip(document, tally);
            String rendered = serialise(document);

            // The fingerprint has to be taken from the serialised text, not from the DOM we just edited - that
            // is what will actually be on disk, and it is re-parsing it that would catch a serialiser mangling
            // something the in-memory tree still holds correctly.
            String after;
            try (InputStream in = new ByteArrayInputStream(rendered.getBytes(StandardCharsets.UTF_8))) {
                after = SvgFingerprint.exact(SvgFingerprint.parse(in));
            }
            boolean equivalent = SvgFingerprint.equivalent(before, after, VERIFY_TOLERANCE);
            if (name.equals(show)) {
                System.out.format("%n--- %s (normalised) ---%n%s%n", name, rendered);
                if (!equivalent) {
                    System.out.format("fingerprint before: %s%nfingerprint after : %s%n", before, after);
                }
            }

            if (!equivalent) {
                refused.add(name);
                continue;
            }

            if (rendered.equals(new String(original, StandardCharsets.UTF_8))) {
                unchanged++;
                continue;
            }
            changed.add(name);
            tally.reasons.forEach((reason, count) -> reasons.merge(reason, count, Integer::sum));
            if (apply) {
                Files.writeString(file, rendered, StandardCharsets.UTF_8);
            }
        }

        System.out.format("%s%n", apply ? "rewritten" : "would change (report only, nothing written)");
        System.out.format("  changed    : %d%n", changed.size());
        System.out.format("  unchanged  : %d%n", unchanged);
        System.out.format("  unreadable : %d%n", unreadable.size());
        System.out.format("  refused    : %d  (fingerprint would have changed)%n", refused.size());
        reasons.forEach((reason, count) -> System.out.format("     %-28s %d%n", reason, count));
        report("Could not be parsed", unreadable);
        report("REFUSED - normalising would have changed what these draw", refused);

        // A refusal is a failure too, and a louder one: the file is not normalised and cannot be
        // normalised without changing what it draws, so it needs a person rather than --apply.
        List<String> outstanding = new ArrayList<>(changed);
        outstanding.addAll(refused);
        outstanding.addAll(unreadable);
        return outstanding;
    }

    /** Removes everything the editor added and nothing else. */
    private void strip(Document document, Tally tally) {
        Set<String> referenced = referencedIds(document);
        strip(document.getDocumentElement(), referenced, tally);
    }

    private void strip(Node node, Set<String> referenced, Tally tally) {
        if (node.getNodeType() != Node.ELEMENT_NODE) {
            return;
        }
        Element element = (Element) node;

        List<Attr> doomed = new ArrayList<>();
        NamedNodeMap attributes = element.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            Attr attribute = (Attr) attributes.item(i);
            if (SvgFingerprint.isEditorNamespaceDeclaration(attribute)) {
                doomed.add(attribute);
                tally.count("editor namespace decls");
            } else if (attribute.getNodeName()
                .startsWith("xmlns")) {
                // Every other declaration stays. SVG's own is what makes the file SVG, and xlink's is what
                // makes an href resolve.
                continue;
            } else if (SvgFingerprint.isEditorMetadata(attribute)) {
                doomed.add(attribute);
                tally.count("editor attributes");
            } else if (ID_ATTRIBUTE.equals(attribute.getLocalName()) && !referenced.contains(attribute.getValue())
                       && GENERATED_ID.matcher(attribute.getValue())
                           .matches()) {
                doomed.add(attribute);
                tally.count("generated ids");
            } else {
                tidy(attribute, tally);
            }
        }
        doomed.forEach(attribute -> element.removeAttributeNode(attribute));

        List<Node> remove = new ArrayList<>();
        NodeList children = element.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (SvgFingerprint.isEditorMetadata(child)) {
                remove.add(child);
                tally.count("editor elements");
            } else if (SvgFingerprint.isEmptyDefs(child)) {
                remove.add(child);
                tally.count("empty <defs>");
            } else if (child.getNodeType() == Node.TEXT_NODE && child.getNodeValue()
                .isBlank()) {
                // The existing indentation, which would otherwise be indented again on output.
                remove.add(child);
            } else {
                strip(child, referenced, tally);
            }
        }
        remove.forEach(element::removeChild);
    }

    /** Collapses a coordinate list's layout whitespace, then writes each of its numbers at its shortest faithful length. */
    private void tidy(Attr attribute, Tally tally) {
        String name = attribute.getLocalName();
        String original = attribute.getValue();
        String value = original;

        if (COORDINATE_ATTRIBUTES.contains(name)) {
            value = value.trim()
                .replaceAll("\\s+", " ");
            if (!value.equals(original)) {
                tally.count("coordinate whitespace");
            }
        }
        if (NUMERIC_ATTRIBUTES.contains(name)) {
            String spaced = value;
            value = DECIMAL.matcher(value)
                .replaceAll(match -> Matcher.quoteReplacement(shorten(match.group())));
            if (!value.equals(spaced)) {
                tally.count("number precision");
            }
        }
        if (!value.equals(original)) {
            attribute.setValue(value);
        }
    }

    /**
     * The briefest way of writing a number that still lands within {@link #TOLERANCE} of it, and that cannot then be shortened again.
     * <p>
     * Most of what this does costs nothing at all: {@code 326.523000} is written {@code 326.523} and the value is untouched. Only where the editor perturbed a coordinate does it
     * actually move one, and never further than the tolerance allows.
     * <p>
     * That second condition is what makes running this twice a no-op, and it is not free. Each step measures against the value it was given, so a shortened value can be a step
     * away from being shortened once more, and the moves add up: {@code 50.695312} is within tolerance of {@code 50.69531}, which is in turn within tolerance of {@code 50.6953},
     * but the two together move it 1.2e-5 - past the bound this is supposed to hold. A first run wrote the middle form and a second run took the third, so the tree never settled.
     * Taking a shortening only when it is stable means such a value keeps the length it came with, which is the right trade: the point is a predictable tree, and a tree that
     * changes every time it is normalised is the opposite of one.
     */
    private String shorten(String token) {
        String candidate = step(token);
        if (candidate.equals(token)) {
            return token;
        }
        return step(candidate).equals(candidate) ? candidate : token;
    }

    /** The shortest representation within {@link #TOLERANCE} of {@code token}, or {@code token} if there is no shorter one. */
    private String step(String token) {
        double value = Double.parseDouble(token);
        for (int places = 0; places <= 9; places++) {
            String candidate = String.format(Locale.ROOT, "%." + places + "f", value);
            if (Math.abs(Double.parseDouble(candidate) - value) <= TOLERANCE) {
                return candidate.contains(".") ? candidate.replaceAll("0+$", "")
                    .replaceAll("\\.$", "") : candidate;
            }
        }
        return token;
    }

    /** Every id pointed at from within the same document, so those ids survive while the editor's generated ones do not. */
    private Set<String> referencedIds(Document document) {
        Set<String> referenced = new HashSet<>();
        collectReferences(document.getDocumentElement(), referenced);
        return referenced;
    }

    private void collectReferences(Node node, Set<String> referenced) {
        if (node.getNodeType() != Node.ELEMENT_NODE) {
            return;
        }
        NamedNodeMap attributes = node.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            Matcher matcher = REFERENCE.matcher(((Attr) attributes.item(i)).getValue()
                .trim());
            while (matcher.find()) {
                referenced.add(matcher.group(1) != null ? matcher.group(1) : matcher.group(2));
            }
        }
        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            collectReferences(children.item(i), referenced);
        }
    }

    /**
     * Writes the document out, indenting by nesting depth.
     * <p>
     * Hand-written rather than handed to an identity {@code Transformer} with {@code INDENT=yes}, because every one of these fragments carries {@code xml:space="preserve"} on its
     * root element. A conforming serialiser honours that and adds no whitespace anywhere, so the transformer returns the whole document on one line - and it is right to, because
     * 862 of the fragments contain {@code <text>}, where inserting indentation would change what is rendered.
     * <p>
     * The rule here is the one that makes both true at once: an element whose children are all elements gets its children indented onto their own lines; an element holding any
     * text is written inline exactly as it stands. So structure becomes readable and text is never touched.
     */
    private String serialise(Document document) {
        StringBuilder out = new StringBuilder();
        out.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        DocumentType doctype = document.getDoctype();
        if (doctype != null) {
            out.append("<!DOCTYPE ")
                .append(doctype.getName());
            if (doctype.getPublicId() != null) {
                out.append(" PUBLIC \"")
                    .append(doctype.getPublicId())
                    .append("\" \"")
                    .append(doctype.getSystemId())
                    .append('"');
            } else if (doctype.getSystemId() != null) {
                out.append(" SYSTEM \"")
                    .append(doctype.getSystemId())
                    .append('"');
            }
            out.append(">\n");
        }
        // Comments outside the root element - the Adobe Illustrator generator line sits here, and it is
        // the provenance of the original artwork rather than editor noise, so it stays.
        NodeList top = document.getChildNodes();
        for (int i = 0; i < top.getLength(); i++) {
            Node node = top.item(i);
            if (node.getNodeType() == Node.COMMENT_NODE) {
                out.append("<!--")
                    .append(node.getNodeValue())
                    .append("-->\n");
            }
        }
        write(document.getDocumentElement(), 0, out);
        out.append('\n');
        return out.toString();
    }

    private void write(Element element, int depth, StringBuilder out) {
        indent(depth, out);
        out.append('<')
            .append(element.getNodeName());
        NamedNodeMap attributes = element.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            Attr attribute = (Attr) attributes.item(i);
            out.append(' ')
                .append(attribute.getNodeName())
                .append("=\"")
                .append(escape(attribute.getValue(), true))
                .append('"');
        }
        List<Node> children = childrenOf(element);
        if (children.isEmpty()) {
            out.append("/>");
            return;
        }
        out.append('>');
        if (holdsText(children)) {
            children.forEach(child -> writeInline(child, out));
        } else {
            for (Node child : children) {
                out.append('\n');
                if (child.getNodeType() == Node.COMMENT_NODE) {
                    indent(depth + 1, out);
                    out.append("<!--")
                        .append(child.getNodeValue())
                        .append("-->");
                } else {
                    write((Element) child, depth + 1, out);
                }
            }
            out.append('\n');
            indent(depth, out);
        }
        out.append("</")
            .append(element.getNodeName())
            .append('>');
    }

    private void writeInline(Node node, StringBuilder out) {
        switch (node.getNodeType()) {
            case Node.TEXT_NODE, Node.CDATA_SECTION_NODE -> out.append(escape(node.getNodeValue(), false));
            case Node.COMMENT_NODE -> out.append("<!--")
                .append(node.getNodeValue())
                .append("-->");
            case Node.ELEMENT_NODE -> {
                Element element = (Element) node;
                out.append('<')
                    .append(element.getNodeName());
                NamedNodeMap attributes = element.getAttributes();
                for (int i = 0; i < attributes.getLength(); i++) {
                    Attr attribute = (Attr) attributes.item(i);
                    out.append(' ')
                        .append(attribute.getNodeName())
                        .append("=\"")
                        .append(escape(attribute.getValue(), true))
                        .append('"');
                }
                List<Node> children = childrenOf(element);
                if (children.isEmpty()) {
                    out.append("/>");
                } else {
                    out.append('>');
                    children.forEach(child -> writeInline(child, out));
                    out.append("</")
                        .append(element.getNodeName())
                        .append('>');
                }
            }
            default -> {
                // Processing instructions and the like: nothing in these fragments produces one.
            }
        }
    }

    /** Elements, comments and any text that is not pure layout whitespace. */
    private List<Node> childrenOf(Element element) {
        List<Node> children = new ArrayList<>();
        NodeList nodes = element.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE || node.getNodeType() == Node.COMMENT_NODE
                || ((node.getNodeType() == Node.TEXT_NODE || node.getNodeType() == Node.CDATA_SECTION_NODE) && !node.getNodeValue()
                    .isBlank())) {
                children.add(node);
            }
        }
        return children;
    }

    private boolean holdsText(List<Node> children) {
        return children.stream()
            .anyMatch(child -> child.getNodeType() == Node.TEXT_NODE || child.getNodeType() == Node.CDATA_SECTION_NODE);
    }

    private void indent(int depth, StringBuilder out) {
        out.append(" ".repeat(depth * INDENT));
    }

    private String escape(String value, boolean attribute) {
        StringBuilder out = new StringBuilder(value.length());
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            switch (c) {
                case '&' -> out.append("&amp;");
                case '<' -> out.append("&lt;");
                case '>' -> out.append("&gt;");
                case '"' -> out.append(attribute ? "&quot;" : "\"");
                // A literal newline inside an attribute is normalised to a space by any parser that reads it
                // back, so writing the entity keeps the value the one that was there.
                case '\n' -> out.append(attribute ? "&#10;" : "\n");
                case '\t' -> out.append(attribute ? "&#9;" : "\t");
                default -> out.append(c);
            }
        }
        return out.toString();
    }

    private List<Path> index(Path root) throws Exception {
        try (Stream<Path> tree = Files.walk(root)) {
            return tree.filter(Files::isRegularFile)
                .filter(path -> path.getFileName()
                    .toString()
                    .endsWith(".svg"))
                .sorted()
                .toList();
        }
    }

    private static void report(String heading, List<String> names) {
        if (names.isEmpty()) {
            return;
        }
        System.out.format("%n%s (%d):%n", heading, names.size());
        names.forEach(name -> System.out.format("   %s%n", name));
    }

    Path svgRoot(String configFile) throws Exception {
        try (InputStream in = FragmentNormaliser.class.getResourceAsStream(configFile)) {
            if (in == null) {
                throw new IllegalArgumentException("no such config on the classpath: " + configFile);
            }
            GeneratorConfig config = parser.readConfig(in);
            if (config.getResourceDir() == null) {
                throw new IllegalStateException(configFile + " has no resourceDir, so its fragments cannot be found");
            }
            return config.getResourceDir()
                .resolve("svg");
        }
    }

    /** What was removed, for the run's summary - so the report says why files changed, not just how many. */
    private static final class Tally {
        private final TreeMap<String, Integer> reasons = new TreeMap<>();

        void count(String reason) {
            reasons.merge(reason, 1, Integer::sum);
        }
    }

}
