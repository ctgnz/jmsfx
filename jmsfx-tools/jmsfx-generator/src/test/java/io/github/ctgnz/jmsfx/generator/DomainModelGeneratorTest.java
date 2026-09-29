package io.github.ctgnz.jmsfx.generator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;

/**
 * That a library is never composed onto a base it did not ask for.
 * <p>
 * A config declares what it extends by library prefix and the caller supplies where that library is, so the two can disagree. Composing an extension onto the wrong base produces a
 * library that generates, compiles and renders while meaning something different from what its codes say - the kind of mistake nothing downstream can catch, so it is refused here.
 * <p>
 * The real configs, since jmsfx#116 left them portable enough to read anywhere. Constructing the generator parses them and validates; it writes nothing until {@code generate}.
 */
class DomainModelGeneratorTest {

    private static final Path STANDARD = Path.of("../../library/jmsfx-standard/src/main/model/config.yml");
    private static final Path HISTORICAL = Path.of("../../library/jmsfx-historical/src/main/model/config.yml");
    private static final Path BATTLEORDER = Path.of("../../library/jmsfx-battleorder/src/main/model/config.yml");

    @Test
    void acceptsAnOverlayWithTheBaseItNames() {
        assertDoesNotThrow(() -> new DomainModelGenerator(BATTLEORDER, STANDARD));
    }

    @Test
    void acceptsACompleteModelWithNoBase() {
        assertDoesNotThrow(() -> new DomainModelGenerator(STANDARD));
    }

    /** jmsfx-historical became an overlay at jmsfx#137, so it needs its base for the same reasons jmsfx-battleorder does. */
    @Test
    void acceptsTheHistoricalOverlayWithItsBase() {
        assertDoesNotThrow(() -> new DomainModelGenerator(HISTORICAL, STANDARD));
    }

    /** And must be given it - without the base, every shared element and every shared fragment would be missing. */
    @Test
    void refusesAnExtensionWithoutItsBase() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new DomainModelGenerator(HISTORICAL));

        assertThat(thrown.getMessage(), containsString("must be given as the second argument"));
    }

    /** The one that matters: this is silent otherwise, and the result looks entirely healthy. */
    @Test
    void refusesAnOverlayGivenTheWrongBase() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new DomainModelGenerator(BATTLEORDER, HISTORICAL));

        assertThat(thrown.getMessage(), containsString("extends Standard, but the config given as its base is Historical"));
    }

}
