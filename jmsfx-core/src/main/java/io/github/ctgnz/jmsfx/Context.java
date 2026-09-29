package io.github.ctgnz.jmsfx;

public interface Context extends CodeElement {

    boolean isReality();

    /** The context indicator that sits on the frame, under the frames it belongs to. Reality has none - it is the absence of an indicator. */
    default String getOverlayGraphicKey() {
        return String.format("/svg/Frames/_overlay/%s.svg", getName());
    }

    /**
     * The markup this context's frame overlay draws, or null when it has none - Reality draws no indicator, being the absence of one.
     * <p>
     * Unkeyed, unlike the other injected categories: a context indicator is one drawing that sits on the frame whatever the identity, status or dimension. See jmsfx#130.
     */
    default String getOverlayGraphicMarkup() {
        return null;
    }

}
