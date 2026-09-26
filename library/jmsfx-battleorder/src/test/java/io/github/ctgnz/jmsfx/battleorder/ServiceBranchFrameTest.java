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

    /** Two of Battle Order's published branch colours. */
    private static final String INFANTRY_GREEN = "5BAA5B";
    private static final String MARITIME_BLUE = "67C6EF";

    private final FoxgloveParser parser = new FoxgloveParser();

    @BeforeAll
    static void startToolkit() throws InterruptedException {
        CountDownLatch started = new CountDownLatch(1);
        Platform.startup(started::countDown);
        started.await();
    }

    @Test
    void landUnitsOffersTheSevenBranches() {
        assertThat(landUnits().getFrameAmplifierList()
            .size(), is(7));
    }

    /**
     * Two branches, not one branch and none.
     * <p>
     * Selecting no frame amplifier does not give an uncoloured frame: a symbol set that has one defaults to its first value, so Land Units in this library is always coloured by
     * branch and Infantry green appears whether or not anything asked for it. That is consistent with what the extension is for - branch colour instead of affiliation colour - but
     * it does mean the absence of a colour proves nothing, and an assertion written that way passes for the wrong reason.
     */
    @Test
    void theFrameTakesTheBranchColour() throws Exception {
        String infantry = render(ServiceBranch.INFANTRY);
        String maritime = render(ServiceBranch.MARITIME);

        assertThat(infantry, containsString(INFANTRY_GREEN));
        assertThat(infantry, not(containsString(MARITIME_BLUE)));
        assertThat(maritime, containsString(MARITIME_BLUE));
        assertThat(maritime, not(containsString(INFANTRY_GREEN)));
    }

    private String render(AmplifierListItem frameAmplifier) throws Exception {
        SymbolSet landUnits = landUnits();
        IdentificationSymbol symbol = new IdentificationSymbol(IconLibrary.discover());
        symbol.symbolSetProperty()
            .set(landUnits);
        symbol.entityProperty()
            .set(landUnits.getEntities()
                .getFirst());
        if (frameAmplifier != null) {
            symbol.frameAmplifierProperty()
                .set(frameAmplifier);
        }
        return parser.write(symbol.getCombinedGraphic(), false);
    }

    private SymbolSet landUnits() {
        return IconLibrary.discover()
            .getSymbolSets()
            .stream()
            .filter(set -> "LAND_UNIT".equals(set.getId()) || "Land Units".equals(set.getLabel()))
            .findFirst()
            .orElseThrow();
    }

}
