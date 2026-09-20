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

    /**
     * Breathing room added on every side when a symbol is trimmed to its ink.
     * <p>
     * Stroke extents are already included in a measured bound, so this is not there to stop strokes clipping - it absorbs rounding at the edges, and the couple of pixels by which
     * a handful of fragments overrun the region they are supposed to occupy. At 48px, the size a Browse thumbnail renders at, three canvas pixels is under a quarter of a screen
     * pixel, so it costs nothing visually.
     */
    public static final double TRIM_PADDING = 3.0;

    /**
     * {@code bounds} grown by {@link #TRIM_PADDING} on every side, clipped to the {@link #CANVAS} so a symbol drawn near an edge cannot produce a viewBox larger than the canvas it
     * was composed on. An empty rectangle is returned unchanged - padding nothing gives nothing.
     */
    public static Rectangle2D padded(Rectangle2D bounds) {
        if (bounds == null || Rectangle2D.EMPTY.equals(bounds)) {
            return Rectangle2D.EMPTY;
        }
        double minX = Math.max(CANVAS.getMinX(), bounds.getMinX() - TRIM_PADDING);
        double minY = Math.max(CANVAS.getMinY(), bounds.getMinY() - TRIM_PADDING);
        double maxX = Math.min(CANVAS.getMaxX(), bounds.getMaxX() + TRIM_PADDING);
        double maxY = Math.min(CANVAS.getMaxY(), bounds.getMaxY() + TRIM_PADDING);
        return new Rectangle2D(minX, minY, maxX - minX, maxY - minY);
    }

    /**
     * The smallest rectangle containing both, treating {@link Rectangle2D#EMPTY} and null as "nothing drawn" rather than as a rectangle at the origin - a part that draws nothing
     * must not drag the union back to (0, 0).
     */
    public static Rectangle2D union(Rectangle2D first, Rectangle2D second) {
        if (first == null || Rectangle2D.EMPTY.equals(first)) {
            return second == null ? Rectangle2D.EMPTY : second;
        }
        if (second == null || Rectangle2D.EMPTY.equals(second)) {
            return first;
        }
        double minX = Math.min(first.getMinX(), second.getMinX());
        double minY = Math.min(first.getMinY(), second.getMinY());
        double maxX = Math.max(first.getMaxX(), second.getMaxX());
        double maxY = Math.max(first.getMaxY(), second.getMaxY());
        return new Rectangle2D(minX, minY, maxX - minX, maxY - minY);
    }

    private IconGeometry() {
    }

}
