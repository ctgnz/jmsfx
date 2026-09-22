package io.github.ctgnz.jmsfx.generator;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Stream;

import io.github.ctgnz.jmsfx.generator.yaml.JmsfxParser;

/**
 * Compares the SVG fragments of two models - jmsfx-standard and hallux's jmsfx-hallux - and reports how they differ.
 * <p>
 * The two trees are meant to relate by whole files being added or removed: hallux extends the base set, and renames a few where its own numbering differs. Anything present in both
 * should draw the same thing. This exists so that holds after a round of fragment edits, since those have to be carried across by hand.
 * <p>
 * Editor noise is deliberately ignored - {@link SvgFingerprint} carries the detail of what counts as noise. Comparing bytes reports dozens of differences that draw identically;
 * this compares the drawable content instead.
 * <p>
 * Reports only - nothing is copied or written. Run it with the two config files:
 *
 * <pre>
 * java io.github.ctgnz.jmsfx.generator.FragmentComparator [/config.yml] [/config-hallux.yml]
 * </pre>
 *
 * {@link FragmentNormaliser} addresses the same noise from the other end, by taking it out of the files.
 */
public class FragmentComparator {

    public static void main(String[] args) {
        String left = args.length > 0 ? args[0] : "/config.yml";
        String right = args.length > 1 ? args[1] : "/config-hallux.yml";
        try {
            new FragmentComparator().compare(left, right);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final JmsfxParser parser = new JmsfxParser();

    public void compare(String leftConfig, String rightConfig) throws Exception {
        Path left = svgRoot(leftConfig);
        Path right = svgRoot(rightConfig);
        System.out.format("left  %s%n", left);
        System.out.format("right %s%n%n", right);

        Map<String, Path> leftFiles = index(left);
        Map<String, Path> rightFiles = index(right);

        List<String> onlyLeft = new ArrayList<>();
        List<String> onlyRight = new ArrayList<>();
        List<String> differing = new ArrayList<>();
        List<String> unreadable = new ArrayList<>();
        int identical = 0;

        TreeSet<String> all = new TreeSet<>(leftFiles.keySet());
        all.addAll(rightFiles.keySet());
        for (String name : all) {
            Path a = leftFiles.get(name);
            Path b = rightFiles.get(name);
            if (b == null) {
                onlyLeft.add(name);
                continue;
            }
            if (a == null) {
                onlyRight.add(name);
                continue;
            }
            String left1 = SvgFingerprint.of(a);
            String right1 = SvgFingerprint.of(b);
            if (left1 == null || right1 == null) {
                unreadable.add(name + (left1 == null ? "  (left unreadable)" : "  (right unreadable)"));
            } else if (left1.equals(right1)) {
                identical++;
            } else {
                differing.add(name);
            }
        }

        System.out.format("shared and identical : %d%n", identical);
        System.out.format("only on the left     : %d%n", onlyLeft.size());
        System.out.format("only on the right    : %d%n", onlyRight.size());
        System.out.format("shared but differing : %d%n", differing.size());
        System.out.format("unreadable           : %d%n", unreadable.size());

        report("Only on the left", onlyLeft);
        report("Only on the right", onlyRight);
        report("Shared but drawing differently - these need reconciling", differing);
        report("Could not be parsed", unreadable);
    }

    private static void report(String heading, List<String> names) {
        if (names.isEmpty()) {
            return;
        }
        System.out.format("%n%s (%d):%n", heading, names.size());
        names.forEach(name -> System.out.format("   %s%n", name));
    }

    private Map<String, Path> index(Path root) throws Exception {
        Map<String, Path> files = new TreeMap<>();
        try (Stream<Path> tree = Files.walk(root)) {
            tree.filter(Files::isRegularFile)
                .filter(path -> path.getFileName()
                    .toString()
                    .endsWith(".svg"))
                .forEach(path -> files.put(root.relativize(path)
                    .toString()
                    .replace('\\', '/'), path));
        }
        return files;
    }

    private Path svgRoot(String configFile) throws Exception {
        try (InputStream in = FragmentComparator.class.getResourceAsStream(configFile)) {
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

}
