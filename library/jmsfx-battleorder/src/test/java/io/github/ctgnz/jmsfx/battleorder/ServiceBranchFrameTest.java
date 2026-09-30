package io.github.ctgnz.jmsfx.battleorder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import java.util.concurrent.CountDownLatch;

import javafx.application.Platform;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import nz.co.ctg.foxglove.FoxgloveParser;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.amplifier.ServiceBranch;
import io.github.ctgnz.jmsfx.icon.IdentificationSymbol;

/**
 * That the composed frame amplifier actually draws.
 * <p>
 * This is the one thing this library exists to do, and it is the part of composition that needed a mechanism rather than a list append: a frame amplifier means an existing symbol
 * set gains a property it did not have, so {@code LandUnitsSymbolSet.getFrameAmplifierList()} returning the seven branches is what {@link ModelComposer} had to derive. Checking
 * the generated source says the right thing is not the same as checking a symbol comes out the right colour.
 * <p>
 * Needs a JavaFX toolkit, because reading a graphic means instantiating nodes. CI runs the build under xvfb for this reason.
 */
class ServiceBranchFrameTest {

    /** Two of Battle Order's published branch colours, and APP-6E's unknown yellow, which their palette does not use. */
    private static final String INFANTRY_GREEN = "5BAA5B";
    private static final String MARITIME_BLUE = "67C6EF";
    private static final String UNKNOWN_YELLOW = "FFFF80";

    private final FoxgloveParser parser = new FoxgloveParser();

    @BeforeAll
    static void startToolkit() throws InterruptedException {
        CountDownLatch started = new CountDownLatch(1);
        Platform.startup(started::countDown);
        started.await();
    }

    @Test
    void landUnitsOffersTheSevenBranchesAndUnknown() {
        assertThat(landUnits().getFrameAmplifierList().size(), is(8));
    }

    @Test
    void theFrameTakesTheBranchColour() throws Exception {
        String infantry = render(ServiceBranch.INFANTRY);
        String maritime = render(ServiceBranch.MARITIME);

        assertThat(infantry, containsString(INFANTRY_GREEN));
        assertThat(infantry, not(containsString(MARITIME_BLUE)));
        assertThat(maritime, containsString(MARITIME_BLUE));
        assertThat(maritime, not(containsString(INFANTRY_GREEN)));
    }

    /**
     * Code 0 is the prompt: APP-6E's unknown yellow, which Battle Order's palette does not use, so a unit whose branch nobody has chosen does not read as a branch.
     * <p>
     * It exists as a <em>value</em> rather than as the absence of one. SIDC position 27 carries the frame amplifier, and 0 means unspecified - which this library previously had no
     * value for at all, so a code with 27=0 could not be decoded. Selecting no frame amplifier is a different thing again, and leaves the frame its own fill.
     */
    @Test
    void unknownIsTheYellowPrompt() throws Exception {
        String unknown = render(ServiceBranch.UNKNOWN);

        assertThat(unknown, containsString(UNKNOWN_YELLOW));
        assertThat(unknown, not(containsString(INFANTRY_GREEN)));
    }

    /**
     * That a branch colour does not outlive the symbol it belonged to.
     * <p>
     * This could not be asserted before jmsfx#121. A frame amplifier used to be applied by mutating the graphic {@code FoxgloveParser} returned, and the parser caches by location
     * and hands back the same object - so one symbol's branch colour stayed on the shared frame and the next symbol inherited it. The colour now goes into the markup before it is
     * parsed, under a cache key carrying the amplifier, so a symbol with no frame amplifier gets the frame as drawn however many branch-coloured symbols preceded it.
     * <p>
     * Rendering the amplified symbol first is the whole point: reverse the two lines and the old behaviour passes.
     */
    @Test
    void aBranchColourDoesNotOutliveItsSymbol() throws Exception {
        render(ServiceBranch.INFANTRY);

        String unamplified = render(null);

        assertThat(unamplified, not(containsString(INFANTRY_GREEN)));
        assertThat(unamplified, not(containsString(MARITIME_BLUE)));
    }

    /** The other half of the same leak: an amplified symbol must not pick up the colour of the one before it either. */
    @Test
    void eachBranchGetsItsOwnFrameWhicheverOrderTheyAreDrawnIn() throws Exception {
        render(ServiceBranch.MARITIME);

        String infantry = render(ServiceBranch.INFANTRY);

        assertThat(infantry, containsString(INFANTRY_GREEN));
        assertThat(infantry, not(containsString(MARITIME_BLUE)));
    }

    private String render(AmplifierListItem frameAmplifier) throws Exception {
        SymbolSet landUnits = landUnits();
        IdentificationSymbol symbol = new IdentificationSymbol(IconLibrary.discover());
        symbol.symbolSetProperty().set(landUnits);
        symbol.entityProperty().set(landUnits.getEntities().getFirst());
        if (frameAmplifier != null) {
            symbol.frameAmplifierProperty().set(frameAmplifier);
        }
        return parser.write(symbol.getCombinedGraphic(), false);
    }

    private SymbolSet landUnits() {
        return IconLibrary.discover().getSymbolSets().stream().filter(set -> "LAND_UNIT".equals(set.getId()) || "Land Units".equals(set.getLabel())).findFirst().orElseThrow();
    }

}
