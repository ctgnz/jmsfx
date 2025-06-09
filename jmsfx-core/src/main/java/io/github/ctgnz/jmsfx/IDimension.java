package io.github.ctgnz.jmsfx;

import java.util.List;

import io.github.ctgnz.jmsfx.types.GeometryType;

public interface IDimension extends ICodeElement {

    ISymbolSet getDefaultSymbolSet();

    String getFrameId();

    GeometryType getGeometryType();

    String getGraphicLocation();

    List<ISymbolSet> getSymbolSets();

    String getName();

}