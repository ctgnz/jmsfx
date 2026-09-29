package io.github.ctgnz.jmsfx;

import java.util.List;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.types.GeometryType;

public interface Dimension extends CodeElement {

    SymbolSet getDefaultSymbolSet();

    String getFrameId();

    GeometryType getGeometryType();

    String getGraphicLocation();

    List<SymbolSet> getSymbolSets();

    /**
     * Where the frame draws for this dimension, or {@link Rectangle2D#EMPTY} when it has none - Control Measure is mixed geometry and carries no frame. Frames hang off the
     * dimension because the frame id is the dimension's own code. Generated from measurements, so no JavaFX toolkit is needed.
     * <p>
     * Civilian is not part of the key. A civilian frame is its military counterpart recoloured, so it occupies exactly the same space: measured across all 88 civilian frames that
     * carried bounds, every one matched its military counterpart to the last decimal place (jmsfx#123).
     */
    default Rectangle2D getFrameBounds(StandardIdentity identity, Status status) {
        return Rectangle2D.EMPTY;
    }

    /**
     * The markup the frame draws for this identity and status, or null when this dimension has no frame.
     * <p>
     * Keyed the same way as {@link #getFrameBounds(StandardIdentity, Status)}, and for the same reason: the frame id in the fragment name is the dimension's own code. Civilian is
     * absent here too - {@link FragmentMarkup#replaceFill(String, javafx.scene.paint.Color)} derives that from what this returns rather than it being carried twice.
     */
    default String getFrameMarkup(StandardIdentity identity, Status status) {
        return null;
    }
}