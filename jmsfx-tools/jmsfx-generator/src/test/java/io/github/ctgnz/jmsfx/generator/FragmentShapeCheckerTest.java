package io.github.ctgnz.jmsfx.generator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasSize;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * The build fails when a free canvas fragment is off the expected shape, so the rule has to hold in both directions: a fragment that drifts off it must be reported, and the 577
 * that are already on it must not be, or every build fails on nothing.
 * <p>
 * Each case here is a shape that was genuinely present in the tree before jmsfx#78, not an invented one.
 */
class FragmentShapeCheckerTest {

    private static final String HEAD = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + "<svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 612 792\">\n";
    private static final String MAIN = "  <g id=\"main\"><line x1=\"1\" y1=\"1\" x2=\"2\" y2=\"2\"/></g>\n";
    private static final String TEMPLATE = "  <g id=\"template\"><text x=\"1\" y=\"1\">T</text></g>\n";

    private static List<String> check(Path dir, String name, String... body) throws Exception {
        Path file = dir.resolve(name);
        Files.writeString(file, HEAD + String.join("", body) + "</svg>\n", StandardCharsets.UTF_8);
        return new FragmentShapeChecker().check(file);
    }

    @Test
    void acceptsMainAndTemplate(@TempDir Path dir) throws Exception {
        assertThat(check(dir, "a.svg", MAIN, TEMPLATE), is(empty()));
    }

    /** The 22 fragments that are content and nothing else - the Space Debris icons and the area measures with no fixed construction. */
    @Test
    void acceptsMainAlone(@TempDir Path dir) throws Exception {
        assertThat(check(dir, "b.svg", MAIN), is(empty()));
    }

    /** Numbered where a fragment has more than one, which five of them do; 25240805 has four. */
    @Test
    void acceptsAnyNumberOfExamples(@TempDir Path dir) throws Exception {
        assertThat(check(dir, "c.svg", MAIN, TEMPLATE, "  <g id=\"example\"/>\n", "  <g id=\"example1\"/>\n", "  <g id=\"example2\"/>\n"), is(empty()));
    }

    /** A pattern or a marker the main group references, which five fragments carry. */
    @Test
    void acceptsDefs(@TempDir Path dir) throws Exception {
        assertThat(check(dir, "d.svg", "  <defs><pattern id=\"slash1\"/></defs>\n", MAIN, TEMPLATE), is(empty()));
    }

    /** Order is paint order and varies across the tree - 16 fragments put an example first - so it is not what this rule is about. */
    @Test
    void acceptsAnyOrder(@TempDir Path dir) throws Exception {
        assertThat(check(dir, "e.svg", "  <g id=\"example\"/>\n", TEMPLATE, MAIN), is(empty()));
    }

    /** What 25218800 and 25281901 looked like: the id on the drawing element itself, with no group to hold it. */
    @Test
    void rejectsContentLooseAtTheRoot(@TempDir Path dir) throws Exception {
        assertThat(check(dir, "f.svg", "  <polygon id=\"main\" points=\"1,1 2,2 3,3\"/>\n", TEMPLATE),
            contains(containsString("<polygon> at the root"), containsString("no <g id=\"main\">")));
    }

    /** What 60200100 came back as after Inkscape, once the normaliser dropped the generated id its example group was carrying. */
    @Test
    void rejectsAnonymousGroup(@TempDir Path dir) throws Exception {
        assertThat(check(dir, "g.svg", MAIN, "  <g style=\"display:none\"/>\n", TEMPLATE), contains(containsString("a group with no id")));
    }

    /** What 25200600 was called before the grey backdrop was recognised as an example rather than part of the construction guide. */
    @Test
    void rejectsAGroupUnderAnotherName(@TempDir Path dir) throws Exception {
        assertThat(check(dir, "h.svg", MAIN, TEMPLATE, "  <g id=\"template2\"/>\n"), contains(containsString("a group called template2")));
    }

    @Test
    void rejectsNoMain(@TempDir Path dir) throws Exception {
        assertThat(check(dir, "i.svg", TEMPLATE), contains(containsString("no <g id=\"main\">")));
    }

    @Test
    void rejectsTwoMains(@TempDir Path dir) throws Exception {
        assertThat(check(dir, "j.svg", MAIN, MAIN, TEMPLATE), contains(containsString("2 <g id=\"main\">")));
    }

    @Test
    void rejectsTwoTemplates(@TempDir Path dir) throws Exception {
        assertThat(check(dir, "k.svg", MAIN, TEMPLATE, TEMPLATE), contains(containsString("2 <g id=\"template\">")));
    }

    /**
     * Inkscape's own elements sit at the root beside the content, and taking them out is {@link FragmentNormaliser}'s job. Its check is bound to the same phase, so a file still
     * carrying them is already failing the build with a message that says what to do; reporting it again here, for something that is not about its shape, would only be noise.
     */
    @Test
    void ignoresEditorMetadata(@TempDir Path dir) throws Exception {
        Path file = dir.resolve("l.svg");
        Files.writeString(file, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                                + "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:sodipodi=\"http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd\" viewBox=\"0 0 612 792\">\n"
                                + "  <sodipodi:namedview id=\"namedview1\"/>\n" + MAIN + TEMPLATE + "</svg>\n",
            StandardCharsets.UTF_8);
        assertThat(new FragmentShapeChecker().check(file), is(empty()));
    }

    /** Every fault at once, so a run reports a file a single time rather than once per thing wrong with it. */
    @Test
    void reportsEveryFaultOnOneFragment(@TempDir Path dir) throws Exception {
        assertThat(check(dir, "m.svg", "  <rect id=\"example2\" width=\"1\" height=\"1\"/>\n", "  <g id=\"scaffolding\"/>\n", TEMPLATE, TEMPLATE), hasSize(4));
    }

}
