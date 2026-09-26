package io.github.ctgnz.jmsfx.standard;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import io.github.ctgnz.jmsfx.IconLibrary;

/**
 * That the generated library is actually discoverable, which the unit tests of the selection logic cannot show.
 * <p>
 * Three things have to line up for this to pass, and each is generated rather than written: the {@code META-INF/services} declaration has to name the right class, the class has to
 * be constructible the way {@link java.util.ServiceLoader} requires on the classpath, and everything asking for the library has to arrive at the one instance. Getting any of them
 * wrong fails here rather than in a consumer.
 */
class StandardIconLibraryDiscoveryTest {

    @Test
    void theStandardLibraryIsFoundOnTheClasspath() {
        assertThat(IconLibrary.discover(), is(sameInstance(StandardIconLibrary.instance())));
    }

    @Test
    void discoveryIsStable() {
        // Held rather than re-scanned: some consumers ask per request.
        assertThat(IconLibrary.discover(), is(sameInstance(IconLibrary.discover())));
    }

    @Test
    void theDiscoveredLibraryWorks() {
        // Not just found, but usable - a provider method that returned a half-built instance would
        // satisfy the assertions above and fail here.
        assertThat(IconLibrary.discover()
            .getSymbolSets()
            .isEmpty(), is(false));
    }

}
