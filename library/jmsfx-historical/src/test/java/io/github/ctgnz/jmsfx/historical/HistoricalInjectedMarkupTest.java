package io.github.ctgnz.jmsfx.historical;

import io.github.ctgnz.jmsfx.InjectedMarkupContract;

/**
 * The injected-markup contract, against this library.
 * <p>
 * Empty on purpose. The checks live in jmsfx-core's test jar because they are the same for every library and reach everything through {@code IconLibrary.discover()}; what differs
 * is only which library is on the classpath, which is what this subclass supplies. See jmsfx#122.
 */
class HistoricalInjectedMarkupTest extends InjectedMarkupContract {
}
