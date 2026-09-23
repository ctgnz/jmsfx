package io.github.ctgnz.jmsfx;

import java.util.List;
import java.util.ServiceLoader;

/**
 * Finds the one {@link IconLibrary} on the classpath.
 * <p>
 * A consumer sees a single symbology library, holding whatever model it was generated from. Composing a standard model with extensions is a generation-time concern; by the time an
 * application depends on the result there is one library and no choice to make, so naming a concrete one in code only binds the application to it for no gain.
 */
final class IconLibraries {

    /** Held because {@link IconLibrary#discover()} is called per request in some consumers, and re-scanning the classpath each time would be a real cost. */
    private static volatile IconLibrary discovered;

    static IconLibrary discover() {
        IconLibrary result = discovered;
        if (result == null) {
            synchronized (IconLibraries.class) {
                result = discovered;
                if (result == null) {
                    result = select(load(), System.getProperty(IconLibrary.LIBRARY_PROPERTY));
                    discovered = result;
                }
            }
        }
        return result;
    }

    /**
     * Every implementation the classpath offers.
     * <p>
     * Loaded through this class's own loader rather than the context classloader: the library and this interface travel together, and a container's context loader is not
     * necessarily the one that can see it.
     */
    private static List<IconLibrary> load() {
        return ServiceLoader.load(IconLibrary.class, IconLibraries.class.getClassLoader())
            .stream()
            .map(ServiceLoader.Provider::get)
            .toList();
    }

    /**
     * Chooses among what was found, or explains why it cannot.
     * <p>
     * Separated from the loading so the interesting part can be tested without arranging a classpath. All three outcomes are worth being explicit about: none found is a missing
     * dependency, more than one is a packaging mistake rather than a choice to arbitrate, and a named implementation that is not there is worth distinguishing from one that is
     * simply ambiguous.
     */
    static IconLibrary select(List<IconLibrary> found, String named) {
        if (named != null && !named.isBlank()) {
            return found.stream()
                .filter(library -> library.getClass()
                    .getName()
                    .equals(named))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format(
                    "%s names %s, which is not on the classpath. Found: %s", IconLibrary.LIBRARY_PROPERTY, named, describe(found))));
        }
        if (found.isEmpty()) {
            throw new IllegalStateException(String.format(
                "No %s on the classpath. A symbology library such as jmsfx-standard provides one; add it as a dependency.", IconLibrary.class.getName()));
        }
        if (found.size() > 1) {
            throw new IllegalStateException(String.format(
                "More than one %s on the classpath, which is a packaging mistake rather than a choice: an application should depend on exactly one symbology library. Found: %s."
                                                          + " Set -D%s=<class> to select one deliberately.",
                IconLibrary.class.getName(), describe(found), IconLibrary.LIBRARY_PROPERTY));
        }
        return found.get(0);
    }

    private static String describe(List<IconLibrary> found) {
        return found.isEmpty() ? "none"
            : found.stream()
                .map(library -> library.getClass()
                    .getName())
                .sorted()
                .toList()
                .toString();
    }

    private IconLibraries() {
    }

}
