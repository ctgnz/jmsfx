package io.github.ctgnz.jmsfx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import javafx.scene.paint.Color;

import org.junit.jupiter.api.Test;

import io.github.ctgnz.jmsfx.icon.IdentificationSymbol;

/**
 * The fill substitution a civilian frame is derived by, and the envelope an injected fragment is parsed inside.
 * <p>
 * Here rather than only in {@link InjectedMarkupContract} because the contract can only run where a library is on the classpath, and what these check is arithmetic on a string:
 * which attributes the substitution is allowed to touch. Getting that wrong would silently recolour the wrong part of a frame - the dashed outline rather than the fill - and the
 * frame would still render.
 */
class FragmentMarkupTest {

    private static final String FRAME = "<g id=\"frame\"><path d=\"M221,480z\" fill=\"#FFFF80\" stroke=\"#000000\" stroke-dasharray=\"5,5\" stroke-width=\"5\"/></g>";

    @Test
    void replacesTheIdentityFillWithTheOneItIsGiven() {
        String civilian = FragmentMarkup.replaceFill(FRAME, IdentificationSymbol.CIVILIAN_PURPLE);

        assertThat(civilian, is("<g id=\"frame\"><path d=\"M221,480z\" fill=\"#FFA1FF\" stroke=\"#000000\" stroke-dasharray=\"5,5\" stroke-width=\"5\"/></g>"));
    }

    /** The outline colour is a {@code stroke}, and a frame carries one on nearly every path. Substituting on the colour rather than the attribute would black out the drawing. */
    @Test
    void leavesTheStrokeAlone() {
        String civilian = FragmentMarkup.replaceFill(FRAME, IdentificationSymbol.CIVILIAN_PURPLE);

        assertThat(civilian.contains("stroke=\"#000000\""), is(true));
    }

    /**
     * {@code fill="none"} is how a frame says a path draws an outline only, and there are 317 of them against 123 fills across jmsfx-standard's frames. Recolouring one would flood
     * the pending and anticipated frames with solid colour.
     */
    @Test
    void leavesAnUnfilledPathUnfilled() {
        String outline = "<g id=\"frame\"><path fill=\"none\" stroke=\"#000000\"/></g>";

        assertThat(FragmentMarkup.replaceFill(outline, IdentificationSymbol.CIVILIAN_PURPLE), is(outline));
    }

    /** Lower-case hex is just as valid, and the fragment tree contains both. */
    @Test
    void matchesAFillWhateverCaseItIsWrittenIn() {
        assertThat(FragmentMarkup.replaceFill("<path fill=\"#ffff80\"/>", IdentificationSymbol.CIVILIAN_PURPLE), is("<path fill=\"#FFA1FF\"/>"));
    }

    /** Rounded, not truncated: a channel of 0.6313 is 161, and truncating would write #FFA0FF - one off, and wrong on every civilian frame. */
    @Test
    void writesTheColourItWasGivenExactly() {
        assertThat(FragmentMarkup.replaceFill("<path fill=\"#000000\"/>", Color.rgb(255, 161, 255)), is("<path fill=\"#FFA1FF\"/>"));
    }

    @Test
    void passesNullThrough() {
        assertThat(FragmentMarkup.replaceFill(null, IdentificationSymbol.CIVILIAN_PURPLE), is(nullValue()));
        assertThat(FragmentMarkup.document(null), is(nullValue()));
    }

    @Test
    void wrapsMarkupInAParseableEnvelope() {
        String document = FragmentMarkup.document("<g id=\"main\"/>");

        assertThat(document.startsWith("<svg xmlns=\"http://www.w3.org/2000/svg\""), is(true));
        assertThat(document.endsWith("<g id=\"main\"/></svg>"), is(true));
    }

}
