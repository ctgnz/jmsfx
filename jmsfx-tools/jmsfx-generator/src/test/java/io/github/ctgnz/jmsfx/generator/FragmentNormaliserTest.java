package io.github.ctgnz.jmsfx.generator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * The build fails when a fragment is not normalised (jmsfx#73), so what counts as "not normalised" has to be right in both directions: a file straight out of Inkscape must be
 * reported, and a file already in hand must not be, or every build fails on nothing.
 */
class FragmentNormaliserTest {

    /** What Inkscape writes: its own namespace and metadata element, an empty defs, and a generated id. */
    private static final String INKSCAPE = """
                    <?xml version="1.0" encoding="UTF-8" standalone="no"?>
                    <svg xmlns="http://www.w3.org/2000/svg"\
                     xmlns:sodipodi="http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd"\
                     xmlns:inkscape="http://www.inkscape.org/namespaces/inkscape"\
                     viewBox="0 0 612 792" width="612px" height="792px"><defs id="defs2"/><sodipodi:namedview id="namedview1" pagecolor="#ffffff"/><g
                       id="main"><line id="line1" inkscape:label="a" fill="none" stroke="#000000" x1="303.51999" y1="182.62601" x2="493.52" y2="372.626"/></g></svg>
                    """;

    private static Path write(Path dir, String name, String content) throws Exception {
        Path file = dir.resolve(name);
        Files.createDirectories(file.getParent());
        Files.writeString(file, content, StandardCharsets.UTF_8);
        return file;
    }

    private static List<String> run(Path root, boolean apply) throws Exception {
        return new FragmentNormaliser().run(root, root.toString(), apply, null);
    }

    @Test
    void anUnnormalisedFragmentIsReported(@TempDir Path dir) throws Exception {
        write(dir, "Appendices/Land/10120100.svg", INKSCAPE);
        assertThat(run(dir, false), contains("Appendices/Land/10120100.svg"));
    }

    @Test
    void reportingWritesNothing(@TempDir Path dir) throws Exception {
        Path file = write(dir, "a.svg", INKSCAPE);
        run(dir, false);
        assertThat(Files.readString(file, StandardCharsets.UTF_8), is(INKSCAPE));
    }

    @Test
    void applyingRewritesItAndLeavesNothingToDo(@TempDir Path dir) throws Exception {
        Path file = write(dir, "a.svg", INKSCAPE);
        assertThat(run(dir, true), contains("a.svg"));

        String rewritten = Files.readString(file, StandardCharsets.UTF_8);
        assertThat(rewritten.contains("sodipodi"), is(false));
        assertThat(rewritten.contains("inkscape"), is(false));
        assertThat(rewritten.contains("<defs"), is(false));
        assertThat(rewritten.contains("id=\"line1\""), is(false));
        // The content root's id is deliberate rather than editor noise, so it survives.
        assertThat(rewritten.contains("id=\"main\""), is(true));
        // Inkscape's round trip through 32-bit floats is undone.
        assertThat(rewritten.contains("303.52"), is(true));

        // The point of the check: a second pass has nothing to say, so a build that just fixed its
        // fragments passes rather than failing again on its own output.
        assertThat(run(dir, false), is(empty()));
    }

    @Test
    void anAlreadyNormalisedFragmentIsNotReported(@TempDir Path dir) throws Exception {
        write(dir, "a.svg", INKSCAPE);
        run(dir, true);
        assertThat(run(dir, false), is(empty()));
    }

    @Test
    void anEmptyTreeIsNotAFailure(@TempDir Path dir) throws Exception {
        assertThat(run(dir, false), is(empty()));
    }

    @Test
    void somethingThatIsNotSvgIsReportedRatherThanIgnored(@TempDir Path dir) throws Exception {
        // Left unreadable rather than quietly skipped: a fragment that cannot be parsed is not a
        // fragment that is fine, and the build should say so.
        write(dir, "broken.svg", "<svg><g id=\"main\"><line/></svg>");
        assertThat(run(dir, false), contains("broken.svg"));
    }

}
