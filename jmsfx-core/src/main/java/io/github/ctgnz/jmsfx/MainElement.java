package io.github.ctgnz.jmsfx;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.types.GraphicType;

public interface MainElement extends CodeElement {

    /**
     * The markup this element draws, ready to parse, or null when it carries none.
     * <p>
     * A generated library overrides this per element so the drawing lives on the thing that draws it, rather than in a table keyed by a filename - which would make the fragment
     * layout permanent, and jmsfx#124 exists to change it. Null means the caller should fall back to reading {@link #getGraphicLocation(StandardIdentity)} from the classpath,
     * which is what every library did before jmsfx#122 and what the categories jmsfx#123 covers still do.
     * <p>
     * Takes the identity because a {@code FULL_FRAME} element is four drawings, one per identity group: the icon <em>is</em> the frame, so each identity draws a different one.
     * Everything else ignores the argument.
     */
    default String getGraphicMarkup(StandardIdentity identity) {
        return null;
    }

    String getGraphicIdentifier();

    GraphicType getGraphicType();

    default SymbolSet getSymbolSet() {
        return getEntity().getSymbolSet();
    }

    default SymbolSet getBaseSymbolSet() {
        return getEntity().getBaseSymbolSet();
    }

    Entity getEntity();

    default String getGraphicLocation(StandardIdentity identity) {
        String graphicLocation = getSymbolSet().getGraphicLocation();
        String graphicIdentifier = getGraphicIdentifier();
        if (isFullFrameIcon()) {
            return String.format("/svg/Appendices/%s/%s%s.svg", graphicLocation, graphicIdentifier, identity.getGroup()
                .getGraphicSuffix());
        } else {
            return String.format("/svg/Appendices/%s/%s.svg", graphicLocation, graphicIdentifier);
        }
    }

    /**
     * The region this element's graphic occupies.
     * <p>
     * Almost every icon is built within the bounding octagon, so {@link IconGeometry#OCTAGON} serves as its extent without measuring the fragment - that rule is what lets a
     * symbol's bounds be worked out without a JavaFX toolkit. A {@link GraphicType#FREE_CANVAS} element is the exception and may use any part of the canvas, so it has no region by
     * rule and is measured instead; the generated libraries override this with those measurements. Until one is available the whole canvas is assumed, which is the only answer
     * that cannot clip the graphic.
     */
    default Rectangle2D getIconBounds() {
        return isFreeCanvas() ? IconGeometry.CANVAS : IconGeometry.OCTAGON;
    }

    default boolean isCivilian() {
        return getEntity().isCivilian();
    }

    /**
     * Whether this element is drawn free of the icon composition rules, per APP-6E 8.1.3 - Control Measures and a few Cyberspace path and terrain graphics, which are map graphics
     * rather than icons assembled within the octagon.
     */
    default boolean isFreeCanvas() {
        return getGraphicType() == GraphicType.FREE_CANVAS;
    }

    default boolean isFullFrameIcon() {
        return getGraphicType() == GraphicType.FULL_FRAME;
    }

    default boolean isGraphicalIcon() {
        return getGraphicType() != GraphicType.NA;
    }

}
