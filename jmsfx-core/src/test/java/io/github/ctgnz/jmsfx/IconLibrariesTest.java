package io.github.ctgnz.jmsfx;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Proxy;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * What {@link IconLibraries#select} does with none, one and several implementations.
 * <p>
 * Worth testing directly rather than through {@link IconLibrary#discover()}: the outcomes that matter are the ones a working classpath cannot produce, and arranging two symbology
 * libraries or none at all just to exercise an error message is more trouble than the message is worth.
 */
class IconLibrariesTest {

    /**
     * Two implementations that differ only in type, which is all selection looks at.
     * <p>
     * Proxies rather than classes: {@link IconLibrary} has some forty methods and none of them are called here, so stubbing them would be forty lines of noise per implementation.
     * Each proxy is built from its own sub-interface, because two proxies over the same interface set share one generated class - and distinct class names are exactly what these
     * tests are about.
     */
    private interface First extends IconLibrary {
    }

    private interface Second extends IconLibrary {
    }

    private static IconLibrary stub(Class<? extends IconLibrary> type) {
        return (IconLibrary) Proxy.newProxyInstance(IconLibrariesTest.class.getClassLoader(), new Class<?>[] {
            type
        },
            (proxy, method, args) -> {
                throw new UnsupportedOperationException("selection should not call " + method.getName());
            });
    }

    private final IconLibrary one = stub(First.class);
    private final IconLibrary two = stub(Second.class);

    @Test
    void oneImplementationIsTheAnswer() {
        assertThat(IconLibraries.select(List.of(one), null), is(sameInstance(one)));
    }

    @Test
    void noneIsAMissingDependency() {
        IllegalStateException thrown = assertThrows(IllegalStateException.class, () -> IconLibraries.select(List.of(), null));
        assertThat(thrown.getMessage(), containsString("No io.github.ctgnz.jmsfx.IconLibrary on the classpath"));
        // The message has to say what to do about it, since "none found" tells a consumer nothing.
        assertThat(thrown.getMessage(), containsString("jmsfx-standard"));
    }

    @Test
    void moreThanOneIsAPackagingMistake() {
        IllegalStateException thrown = assertThrows(IllegalStateException.class, () -> IconLibraries.select(List.of(one, two), null));
        assertThat(thrown.getMessage(), containsString("More than one"));
        // Naming both is the point: the reader needs to know which dependency to drop.
        assertThat(thrown.getMessage(), containsString(one.getClass()
            .getName()));
        assertThat(thrown.getMessage(), containsString(two.getClass()
            .getName()));
        assertThat(thrown.getMessage(), containsString(IconLibrary.LIBRARY_PROPERTY));
    }

    @Test
    void namingOneSettlesIt() {
        assertThat(IconLibraries.select(List.of(one, two), two.getClass()
            .getName()), is(sameInstance(two)));
    }

    @Test
    void namingOneThatIsNotThereFailsDifferently() {
        // Distinguished from plain ambiguity on purpose - a typo in the property and a genuinely absent
        // library are different mistakes, and the message should not send the reader looking for the wrong one.
        IllegalStateException thrown = assertThrows(IllegalStateException.class, () -> IconLibraries.select(List.of(one), "com.example.NotHere"));
        assertThat(thrown.getMessage(), containsString("which is not on the classpath"));
        assertThat(thrown.getMessage(), containsString(one.getClass()
            .getName()));
    }

    @Test
    void anEmptyPropertyIsTreatedAsUnset() {
        // A property set to nothing is what an unset environment variable expands to in a launcher script.
        assertThat(IconLibraries.select(List.of(one), ""), is(sameInstance(one)));
        assertThat(IconLibraries.select(List.of(one), "   "), is(sameInstance(one)));
    }

}
