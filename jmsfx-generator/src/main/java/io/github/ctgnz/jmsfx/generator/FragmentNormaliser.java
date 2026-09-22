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
 * Every rewrite is checked against {@link SvgFingerprint}: a file whose fingerprint would change is reported and left alone, never written. That makes "this reformat did not
 * change what anything draws" a property the run verifies rather than one the author asserts.
 * <p>
 * Numeric precision is deliberately <em>not</em> normalised here - {@code 303.51999} is left as it is rather than restored to {@code 303.52}. That is the one step that rewrites
 * content rather than layout, so it is kept separate to stay independently reviewable and revertible.
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
     * coordinate. {@link SvgFingerprint} would catch that, since it rounds each number it finds and two numbers do not round to the same string as their concatenation.
     */
    private static final Set<String> COORDINATE_ATTRIBUTES = Set.of("d", "points");

    public static void main(String[] args) {
        List<String> rest = new ArrayList<>(Arrays.asList(args));
        boolean apply = rest.remove("--apply");
        String show = null;
        int showAt = rest.indexOf("--show");
        if (showAt >= 0) {
            rest.remove(showAt);
            show = showAt < rest.size() ? rest.remove(showAt) : null;
        }
        String left = !rest.isEmpty() ? rest.remove(0) : "/config.yml";
        String right = !rest.isEmpty() ? rest.remove(0) : "/config-hallux.yml";
        try {
            FragmentNormaliser normaliser = new FragmentNormaliser();
            normaliser.run(left, apply, show);
            normaliser.run(right, apply, show);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final JmsfxParser parser = new JmsfxParser();

    public void run(String configFile, boolean apply, String show) throws Exception {
        Path root = svgRoot(configFile);
        System.out.format("%n%s%n%s%n", configFile, root);

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

            String before = SvgFingerprint.of(document);
            Tally tally = new Tally();
            strip(document, tally);
            String rendered = serialise(document);

            // The fingerprint has to be taken from the serialised text, not from the DOM we just edited - that
            // is what will actually be on disk, and it is re-parsing it that would catch a serialiser mangling
            // something the in-memory tree still holds correctly.
            String after;
            try (InputStream in = new ByteArrayInputStream(rendered.getBytes(StandardCharsets.UTF_8))) {
                after = SvgFingerprint.of(SvgFingerprint.parse(in));
            }
            if (name.equals(show)) {
                System.out.format("%n--- %s (normalised) ---%n%s%n", name, rendered);
                if (!before.equals(after)) {
                    System.out.format("fingerprint before: %s%nfingerprint after : %s%n", before, after);
                }
            }

            if (!before.equals(after)) {
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
            } else if (COORDINATE_ATTRIBUTES.contains(attribute.getLocalName())) {
                String tidied = attribute.getValue()
                    .trim()
                    .replaceAll("\\s+", " ");
                if (!tidied.equals(attribute.getValue())) {
                    attribute.setValue(tidied);
                    tally.count("coordinate whitespace");
                }
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

    private Path svgRoot(String configFile) throws Exception {
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
