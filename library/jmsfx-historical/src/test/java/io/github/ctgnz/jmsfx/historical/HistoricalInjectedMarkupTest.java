package io.github.ctgnz.jmsfx.historical;

import java.nio.file.Path;

import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.InjectedMarkupContract;

/**
 * The injected-markup contract, against this library.
 * <p>
 * The checks live in jmsfx-core's test jar because they are the same for every library and reach everything through {@code IconLibrary.discover()}; what differs is only which
 * library is on the classpath, which is what this subclass supplies. See jmsfx#122.
 */
class HistoricalInjectedMarkupTest extends InjectedMarkupContract {

    /** jmsfx-historical carries only the fragments it adds; the rest are jmsfx-standard's. See jmsfx#133. */
    @Override
    protected Path baseModelRoot() {
        return Path.of("..", "jmsfx-standard", "src", "main", "model");
    }

    /** HistoricalIconLibrary counts its own fallbacks; the contract is written against IconLibrary, which does not carry that. See jmsfx#127. */
    @Override
    protected int classpathFallbacks() {
        return ((HistoricalIconLibrary) IconLibrary.discover()).getClasspathFallbacks();
    }

}
