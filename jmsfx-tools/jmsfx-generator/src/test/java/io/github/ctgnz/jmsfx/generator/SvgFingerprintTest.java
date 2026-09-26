package io.github.ctgnz.jmsfx.generator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

/**
 * {@link SvgFingerprint#equivalent(String, String, double)} is what lets {@link FragmentNormaliser} rewrite three thousand files and still claim none of them changed what they
 * draw, so it is worth knowing it says no when it should. A check that only ever passes would be worse than no check, because the reformat would be published on its word.
 * <p>
 * Each case here is a mistake a normaliser could plausibly make: moving a coordinate too far, losing an element, altering text, and dropping the separator between two numbers so
 * they run together into one.
 */
class SvgFingerprintTest {

    /** Mirrors FragmentNormaliser.VERIFY_TOLERANCE - the bound a rewrite is checked against, not the tighter one it is made under. */
    private static final double TOLERANCE = 2e-5;

    private static Document parse(String svg) throws Exception {
        try (InputStream in = new ByteArrayInputStream(svg.getBytes(StandardCharsets.UTF_8))) {
            return SvgFingerprint.parse(in);
        }
    }

    private static String exact(String svg) throws Exception {
        return SvgFingerprint.exact(parse(svg));
    }

    private static String svg(String body) {
        return "<svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 612 792\">" + body + "</svg>";
    }

    @Test
    void identicalDocumentsAreEquivalent() throws Exception {
        String one = exact(svg("<line x1=\"10.5\" y1=\"20.25\" x2=\"30\" y2=\"40\"/>"));
        assertThat(SvgFingerprint.equivalent(one, one, TOLERANCE), is(true));
    }

    @Test
    void aNumberWithinToleranceIsEquivalent() throws Exception {
        // The case the normaliser exists to make: 303.51999 is Inkscape's round trip of 303.52.
        String before = exact(svg("<line x1=\"303.51999\" y1=\"182.62601\"/>"));
        String after = exact(svg("<line x1=\"303.52\" y1=\"182.626\"/>"));
        assertThat(SvgFingerprint.equivalent(before, after, TOLERANCE), is(true));
    }

    @Test
    void aNumberBeyondToleranceIsNot() throws Exception {
        String before = exact(svg("<line x1=\"303.52\"/>"));
        String after = exact(svg("<line x1=\"303.521\"/>"));
        assertThat(SvgFingerprint.equivalent(before, after, TOLERANCE), is(false));
    }

    @Test
    void roundingBoundariesDoNotMatter() throws Exception {
        // 43.86149 -> 43.8615 moves by exactly the tolerance, but rounds to 43.861 and 43.862. The
        // rounded fingerprint refused twenty-six real fragments over this; the numeric one must not.
        String before = exact(svg("<path d=\"v 43.86149\"/>"));
        String after = exact(svg("<path d=\"v 43.8615\"/>"));
        assertThat(SvgFingerprint.equivalent(before, after, TOLERANCE), is(true));
    }

    @Test
    void aMissingElementIsNot() throws Exception {
        String before = exact(svg("<g><line x1=\"10\"/><line x1=\"20\"/></g>"));
        String after = exact(svg("<g><line x1=\"10\"/></g>"));
        assertThat(SvgFingerprint.equivalent(before, after, TOLERANCE), is(false));
    }

    @Test
    void changedTextIsNot() throws Exception {
        // #53 and #62 were both about which glyph a <text> draws, and the fingerprint used to ignore text entirely.
        String before = exact(svg("<text x=\"10\">?</text>"));
        String after = exact(svg("<text x=\"10\"></text>"));
        assertThat(SvgFingerprint.equivalent(before, after, TOLERANCE), is(false));
    }

    @Test
    void aLostCoordinateSeparatorIsNot() throws Exception {
        // Collapsing whitespace must never join two coordinates: "183 396" is not "183396".
        String before = exact(svg("<polyline points=\"183 396 220 309\"/>"));
        String after = exact(svg("<polyline points=\"183396 220 309\"/>"));
        assertThat(SvgFingerprint.equivalent(before, after, TOLERANCE), is(false));
    }

    @Test
    void aRemovedAttributeIsNot() throws Exception {
        String before = exact(svg("<line x1=\"10\" stroke=\"#000000\"/>"));
        String after = exact(svg("<line x1=\"10\"/>"));
        assertThat(SvgFingerprint.equivalent(before, after, TOLERANCE), is(false));
    }

    @Test
    void theSvgNamespaceIsPartOfTheFingerprint() throws Exception {
        // Deleting xmlns="http://www.w3.org/2000/svg" leaves every local name unchanged, so this has to
        // be what catches it - a normaliser once did exactly that and the check passed.
        String withNamespace = exact(svg("<line x1=\"10\"/>"));
        String without = SvgFingerprint.exact(parse("<svg viewBox=\"0 0 612 792\"><line x1=\"10\"/></svg>"));
        assertThat(SvgFingerprint.equivalent(withNamespace, without, TOLERANCE), is(false));
    }

    @Test
    void editorMetadataIsIgnored() throws Exception {
        String plain = exact(svg("<line x1=\"10\"/>"));
        String inkscaped = SvgFingerprint.exact(parse("<svg xmlns=\"http://www.w3.org/2000/svg\""
                                                      + " xmlns:sodipodi=\"http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd\""
                                                      + " xmlns:inkscape=\"http://www.inkscape.org/namespaces/inkscape\""
                                                      + " viewBox=\"0 0 612 792\">"
                                                      + "<defs id=\"defs2\"/>"
                                                      + "<sodipodi:namedview id=\"namedview1\" pagecolor=\"#ffffff\"/>"
                                                      + "<line x1=\"10\" id=\"line1\" inkscape:label=\"x\"/></svg>"));
        assertThat(SvgFingerprint.equivalent(plain, inkscaped, TOLERANCE), is(true));
    }

}
