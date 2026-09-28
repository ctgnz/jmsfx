package io.github.ctgnz.jmsfx;

public interface Context extends CodeElement {

    boolean isReality();

    String getOverlayGraphicLocation();

    /**
     * The markup this context's frame overlay draws, or null when it has none - Reality draws no indicator, being the absence of one.
     * <p>
     * Unkeyed, unlike the other injected categories: a context indicator is one drawing that sits on the frame whatever the identity, status or dimension. See jmsfx#130.
     */
    default String getOverlayGraphicMarkup() {
        return null;
    }

}
