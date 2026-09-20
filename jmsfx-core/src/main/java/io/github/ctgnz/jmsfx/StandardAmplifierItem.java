package io.github.ctgnz.jmsfx;

import javafx.geometry.Rectangle2D;

public interface StandardAmplifierItem extends AmplifierListItem {

    /**
     * Where this amplifier's graphic draws within the shared 612 x 792 canvas, or {@link Rectangle2D#EMPTY} when it has no measured bounds.
     * <p>
     * The bounds depend on the standard identity <em>group</em> rather than the identity itself: the amplifier hangs off the frame, and each group's frame has its own height, so
     * the same glyph sits at a different y for each. Implementations are generated from measurements taken by {@code FragmentMeasurer} - see the values baked into the generated
     * amplifier enums - rather than computed here, which is what lets a symbol's overall bounds be worked out without a JavaFX toolkit.
     * <p>
     * {@code Rectangle2D} is a plain value type and needs no toolkit, unlike instantiating a {@code Node} to measure one.
     */
    default Rectangle2D getAmplifierBounds(StandardIdentity identity) {
        return Rectangle2D.EMPTY;
    }

    @Override
    default String getFullId() {
        return String.format("%s%s", getAmplifierList().getId(), getId());
    }

}
