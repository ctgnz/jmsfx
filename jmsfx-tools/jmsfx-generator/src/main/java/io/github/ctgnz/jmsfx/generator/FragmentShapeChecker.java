package io.github.ctgnz.jmsfx.generator;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.yaml.JmsfxParser;

/**
 * Checks that every free canvas fragment holds the shape the rest of the tooling is entitled to assume.
 * <p>
 * A free canvas fragment carries illustrative scaffolding alongside the content it draws, which is what makes it different from every other fragment in the tree, and the reason
 * the rule is worth stating and worth enforcing:
 * <ul>
 * <li>exactly one {@code <g id="main">} - the content, and what a consumer renders;
 * <li>zero or one {@code <g id="template">} - the construction guide;
 * <li>zero or more {@code <g id="example">}, numbered {@code example1}, {@code example2} and so on where there is more than one;
 * <li>any {@code <defs>} the main group references.
 * </ul>
 * Nothing else at the root: no bare drawing elements, and no groups under any other name. The template is optional rather than required because two kinds of fragment have nothing
 * to construct - an area measure is defined by at least three control points the user places, so there is no fixed geometry a template could draw, and the Space Debris fragments
 * are whole symbols in the way an ordinary icon is. See jmsfx#78 and {@code docs/fragments.md}.
 * <p>
 * <strong>Bound to {@code verify}</strong>, because injecting fragments into the generated classes needs a rule for "which element is the content" and this is that rule. A
 * fragment that drifts off the shape - an editor leaving a group anonymous, a new icon arriving with its content loose at the root - fails the build where it is cheap to fix,
 * rather than surfacing much later as an injection that picks up construction scaffolding along with the drawing.
 *
 * <pre>
 * java io.github.ctgnz.jmsfx.generator.FragmentShapeChecker [--dir &lt;svg root&gt; [--model /model-standard.yml]] [/config.yml] [/config-historical.yml]
 * </pre>
 *
 * Only free canvas fragments are covered. Every other fragment holds a single content group, but the names it goes by are not yet consistent - {@code echelon}, {@code echelon_1_}
 * and {@code amplifier} all appear on the same kind of element - so there is nothing settled to check against yet. jmsfx#80 is that work, and this is where the check belongs once
 * it lands.
 */
public class FragmentShapeChecker {

    /** An example group, alone when a fragment has one and numbered when it has several. */
    private static final Pattern EXAMPLE = Pattern.compile("example\\d*");

    private static final String MAIN = "main";
    private static final String TEMPLATE = "template";
    private static final String GROUP_ELEMENT = "g";
    private static final String DEFS_ELEMENT = "defs";

    /** Which model the shape rules are read from when the build passes directories rather than configs. A filesystem path since jmsfx#116. */
    private static final String DEFAULT_MODEL = "library/jmsfx-standard/src/main/model/model.yml";

    private final JmsfxParser parser = new JmsfxParser();

    public static void main(String[] args) throws Exception {
        List<String> rest = new ArrayList<>(Arrays.asList(args));
        String model = take(rest, "--model");
        List<Path> directories = new ArrayList<>();
        for (String dir = take(rest, "--dir"); dir != null; dir = take(rest, "--dir")) {
            directories.add(Path.of(dir));
        }

        FragmentShapeChecker checker = new FragmentShapeChecker();
        List<String> wrong = new ArrayList<>();
        int checked = 0;
        if (directories.isEmpty()) {
            if (rest.isEmpty()) {
                throw new IllegalArgumentException("name the config files to check, or pass --dir: see docs/fragments.md");
            }
            List<GeneratorConfig> configs = new ArrayList<>();
            for (String config : rest) {
                configs.add(GeneratorConfig.load(Path.of(config)));
            }
            for (int at = 0; at < rest.size(); at++) {
                GeneratorConfig config = configs.get(at);
                Result result = checker.run(FragmentTree.of(config, baseOf(config, configs)), checker.model(config.getModelFile()), rest.get(at));
                checked += result.checked();
                wrong.addAll(result.wrong());
            }
        } else {
            LibraryModel library = checker.model(Path.of(model != null ? model : DEFAULT_MODEL));
            for (Path directory : directories) {
                // A directory that is not there is not a failure, for the same reason it is not one in
                // FragmentNormaliser: the build passes this in from the module layout, and a check bound
                // to it has to survive a partial reactor build or a checkout without its siblings.
                if (!Files.isDirectory(directory)) {
                    System.out.format("%nno such directory, skipping: %s%n", directory);
                    continue;
                }
                Result result = checker.run(FragmentTree.of(List.of(directory)), library, directory.toString());
                checked += result.checked();
                wrong.addAll(result.wrong());
            }
        }

        if (!wrong.isEmpty()) {
            // Thrown rather than exited, because this runs in Maven's own JVM under exec:java -
            // System.exit would take the build down without a message worth reading.
            throw new IllegalStateException(String.format("%d of %d free canvas fragment%s off the expected shape:%n    %s%n%nSee docs/fragments.md for the shape they should hold.%n",
                wrong.size(), checked, wrong.size() == 1 ? " is" : "s are", String.join(System.lineSeparator() + "    ", wrong)));
        }
    }

    /** What one tree's check found: how much was looked at, and what was wrong with it. */
    record Result(int checked, List<String> wrong) {
    }

    /**
     * Checks one resource tree, reporting as it goes.
     * <p>
     * A fragment the model names but the disk does not hold is a failure rather than a skip. The identifier is derived rather than read, so a path that resolves nowhere means
     * either the derivation or the model is wrong, and neither should pass quietly. See jmsfx#52.
     */
    Result run(FragmentTree tree, LibraryModel model, String label) throws Exception {
        List<String> wrong = new ArrayList<>();
        List<FreeCanvasIcons.Icon> icons = FreeCanvasIcons.collect(model, tree);
        for (FreeCanvasIcons.Icon icon : icons) {
            if (!Files.isRegularFile(icon.fragment())) {
                wrong.add(String.format("%s: no such fragment (%s / %s)", icon.identifier(), icon.symbolSet(), icon.label()));
                continue;
            }
            List<String> faults = check(icon.fragment());
            if (!faults.isEmpty()) {
                wrong.add(String.format("%s: %s", icon.identifier(), String.join("; ", faults)));
            }
        }
        System.out.format("%n%s%n  free canvas fragments  %d%n  off the shape          %d%n", label, icons.size(), wrong.size());
        return new Result(icons.size(), wrong);
    }

    /** Everything wrong with one fragment, so a run reports a file once rather than once per fault. */
    List<String> check(Path fragment) throws Exception {
        List<String> faults = new ArrayList<>();
        int main = 0;
        int template = 0;
        for (Element child : roots(fragment)) {
            String name = child.getLocalName();
            String id = child.getAttribute("id");
            if (DEFS_ELEMENT.equals(name)) {
                continue;
            }
            if (!GROUP_ELEMENT.equals(name)) {
                faults.add(String.format("<%s> at the root, outside any group", name));
            } else if (MAIN.equals(id)) {
                main++;
            } else if (TEMPLATE.equals(id)) {
                template++;
            } else if (!EXAMPLE.matcher(id)
                .matches()) {
                faults.add(id.isEmpty() ? "a group with no id" : String.format("a group called %s", id));
            }
        }
        if (main != 1) {
            faults.add(main == 0 ? "no <g id=\"main\">" : String.format("%d <g id=\"main\">", main));
        }
        if (template > 1) {
            faults.add(String.format("%d <g id=\"template\">", template));
        }
        return faults;
    }

    /**
     * The fragment's root elements.
     * <p>
     * Editor metadata is skipped rather than reported. {@link FragmentNormaliser} takes it out and its own check is bound to the same phase, so a file that still carries any is
     * already failing the build with a message that says what to do about it; reporting the same file twice, for something that is not about its shape, would only be noise.
     */
    private List<Element> roots(Path fragment) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        List<Element> roots = new ArrayList<>();
        try (InputStream in = Files.newInputStream(fragment)) {
            NodeList children = factory.newDocumentBuilder()
                .parse(in)
                .getDocumentElement()
                .getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                Node child = children.item(i);
                if (child.getNodeType() == Node.ELEMENT_NODE && !SvgFingerprint.isEditorMetadata(child)) {
                    roots.add((Element) child);
                }
            }
        }
        return roots;
    }

    /** The model a config file sits beside. */
    private Path modelPath(Path configFile) throws Exception {
        return GeneratorConfig.load(configFile)
            .getModelFile();
    }

    private LibraryModel model(Path modelFile) throws Exception {
        try (InputStream in = Files.newInputStream(modelFile)) {
            return parser.readLibraryModel(in);
        }
    }

    /**
     * The base among the configs this run was given, or null when it names none.
     * <p>
     * Found among the configs already on the command line rather than taken as another argument. The build passes standard and historical together, which is exactly the pair a
     * search path needs, and a config naming a base that is not present is reported rather than silently checked against its own tree alone.
     */
    private static GeneratorConfig baseOf(GeneratorConfig config, List<GeneratorConfig> candidates) {
        if (!config.isOverlay()) {
            return null;
        }
        return candidates.stream()
            .filter(candidate -> config.getBaseLibrary()
                .equals(candidate.getLibraryPrefix()))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(
                                                            String.format("%s extends %s, so that library's config has to be named too", config.getLibraryPrefix(), config.getBaseLibrary())));
    }

    /** The value following a flag, removing both from the list - so what is left is the positional arguments. */
    private static String take(List<String> args, String flag) {
        int at = args.indexOf(flag);
        if (at < 0 || at + 1 >= args.size()) {
            return null;
        }
        args.remove(at);
        return args.remove(at);
    }

}
