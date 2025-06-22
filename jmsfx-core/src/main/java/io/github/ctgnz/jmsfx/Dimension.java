package io.github.ctgnz.jmsfx;

import java.util.List;

import io.github.ctgnz.jmsfx.types.GeometryType;

public interface Dimension extends CodeElement {

    SymbolSet getDefaultSymbolSet();

    String getFrameId();

    GeometryType getGeometryType();

    String getGraphicLocation();

    List<SymbolSet> getSymbolSets();

    String getName();

}