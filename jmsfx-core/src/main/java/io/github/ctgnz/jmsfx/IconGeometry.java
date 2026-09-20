package io.github.ctgnz.jmsfx;

import javafx.geometry.Rectangle2D;

/**
 * The fixed regions of the APP-6E drawing surface.
 * <p>
 * These are plain value constants - {@link Rectangle2D} needs no JavaFX toolkit, unlike instantiating a {@code Node} to measure one - so they can be used wherever a symbol's
 * extent is worked out, including on a headless server.
 */
public final class IconGeometry {

    /**
     * The canvas every fragment is drawn against. APP-6E gives frame, icon, modifiers and amplifiers alike one shared coordinate space, each occupying its own region of it, which
     * is what lets the pieces line up without any per-symbol layout.
     */
    public static final Rectangle2D CANVAS = new Rectangle2D(0, 0, 612, 792);

    /**
     * The bounding octagon, taken from the vertices in {@code BoundingOctagon.svg}: x 183.5 to 426.5, y 272.5 to 516.5, centred on (305, 394.5).
     * <p>
     * Main icons and sector modifiers are drawn within it, so it serves as their bounds without measuring each fragment. The fragments that break that rule are tracked as
     * jmsfx#53, and the sector modifiers that do so deliberately carry their own measured bounds instead.
     */
    public static final Rectangle2D OCTAGON = new Rectangle2D(183.5, 272.5, 243.0, 244.0);

    private IconGeometry() {
    }

}
