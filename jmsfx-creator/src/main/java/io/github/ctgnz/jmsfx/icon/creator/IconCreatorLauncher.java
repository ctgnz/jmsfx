package io.github.ctgnz.jmsfx.icon.creator;

/**
 * Entry point for the packaged application.
 * <p>
 * The JDK launcher refuses to start a main class that extends {@code javafx.application.Application} unless the JavaFX runtime is present as modules, failing with "JavaFX runtime
 * components are missing". A packaged build puts every jar on the class path, so that check would reject {@link IconCreator} itself. Launching from a class that does not extend
 * {@code Application} avoids the check, and JavaFX then starts normally from the class path.
 * </p>
 * <p>
 * Running {@link IconCreator} directly still works when JavaFX is on the module path, as it is in a development environment.
 * </p>
 */
public final class IconCreatorLauncher {

    private IconCreatorLauncher() {
    }

    public static void main(String[] args) {
        IconCreator.main(args);
    }

}
