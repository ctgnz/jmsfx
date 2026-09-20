package io.github.ctgnz.jmsfx;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;

import javafx.geometry.Rectangle2D;

import org.junit.jupiter.api.Test;

/**
 * {@link IconGeometry} is the arithmetic that replaced measuring a rendered scene graph, so these run without a JavaFX toolkit - constructing a {@link Rectangle2D} needs none.
 */
class IconGeometryTest {

    private static final Rectangle2D LEFT = new Rectangle2D(100, 100, 50, 50);
    private static final Rectangle2D RIGHT = new Rectangle2D(200, 300, 50, 50);

    @Test
    void testPaddedClampsToTheCanvasRatherThanOverrunningIt() {
        Rectangle2D atTopLeft = IconGeometry.padded(new Rectangle2D(1, 1, 10, 10));
        assertThat(atTopLeft.getMinX(), is(0.0));
        assertThat(atTopLeft.getMinY(), is(0.0));

        Rectangle2D atBottomRight = IconGeometry.padded(new Rectangle2D(600, 780, 12, 12));
        assertThat(atBottomRight.getMaxX(), is(IconGeometry.CANVAS.getMaxX()));
        assertThat(atBottomRight.getMaxY(), is(IconGeometry.CANVAS.getMaxY()));
    }

    @Test
    void testPaddedGrowsBySameAmountOnEverySide() {
        Rectangle2D padded = IconGeometry.padded(new Rectangle2D(200, 300, 50, 60));
        assertThat(padded.getMinX(), is(200 - IconGeometry.TRIM_PADDING));
        assertThat(padded.getMinY(), is(300 - IconGeometry.TRIM_PADDING));
        assertThat(padded.getWidth(), is(50 + 2 * IconGeometry.TRIM_PADDING));
        assertThat(padded.getHeight(), is(60 + 2 * IconGeometry.TRIM_PADDING));
    }

    @Test
    void testPaddingNothingGivesNothing() {
        assertThat(IconGeometry.padded(Rectangle2D.EMPTY), is(Rectangle2D.EMPTY));
        assertThat(IconGeometry.padded(null), is(Rectangle2D.EMPTY));
    }

    /** The octagon has to match BoundingOctagon.svg, since every unmeasured icon and modifier is given it by rule. */
    @Test
    void testTheOctagonMatchesTheFragmentGeometry() {
        assertThat(IconGeometry.OCTAGON.getMinX(), is(183.5));
        assertThat(IconGeometry.OCTAGON.getMinY(), is(272.5));
        assertThat(IconGeometry.OCTAGON.getMaxX(), is(426.5));
        assertThat(IconGeometry.OCTAGON.getMaxY(), is(516.5));
    }

    @Test
    void testUnionCoversBothRectangles() {
        Rectangle2D union = IconGeometry.union(LEFT, RIGHT);
        assertThat(union, is(new Rectangle2D(100, 100, 150, 250)));
    }

    @Test
    void testUnionIsOrderIndependent() {
        assertThat(IconGeometry.union(LEFT, RIGHT), is(IconGeometry.union(RIGHT, LEFT)));
    }

    @Test
    void testUnionKeepsAContainedRectangleUnchanged() {
        Rectangle2D outer = new Rectangle2D(100, 100, 200, 200);
        assertThat(IconGeometry.union(outer, new Rectangle2D(150, 150, 10, 10)), is(outer));
    }

    /**
     * A part that draws nothing must not drag the union to the origin. Every {@code isXxxUsed()} guard in {@code IdentificationSymbol.getVisibleBounds()} relies on this, since a
     * part with no measured bounds returns {@link Rectangle2D#EMPTY} rather than being skipped.
     */
    @Test
    void testUnionTreatsEmptyAsNothingDrawnRatherThanARectangleAtTheOrigin() {
        assertThat(IconGeometry.union(Rectangle2D.EMPTY, RIGHT), is(RIGHT));
        assertThat(IconGeometry.union(RIGHT, Rectangle2D.EMPTY), is(RIGHT));
        assertThat(IconGeometry.union(null, RIGHT), is(RIGHT));
        assertThat(IconGeometry.union(RIGHT, null), sameInstance(RIGHT));
        assertThat(IconGeometry.union(Rectangle2D.EMPTY, Rectangle2D.EMPTY), is(Rectangle2D.EMPTY));
        assertThat(IconGeometry.union(null, null), is(Rectangle2D.EMPTY));
    }

}
