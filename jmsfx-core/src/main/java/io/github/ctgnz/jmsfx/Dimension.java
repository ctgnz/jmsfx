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

    String getName();

    /**
     * Where the frame draws for this dimension, or {@link Rectangle2D#EMPTY} when it has none - Control Measure is mixed geometry and carries no frame. Frames hang off the
     * dimension because the frame id is the dimension's own code, and are keyed the same way {@link SymbolSet#getFrameLocation(StandardIdentity, Status, boolean)} picks the
     * fragment. Generated from measurements, so no JavaFX toolkit is needed.
     */
    default Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
        return Rectangle2D.EMPTY;
    }
}