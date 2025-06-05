package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;
import java.util.stream.Stream;

import com.google.common.collect.Lists;

import io.github.ctgnz.jmsfx.IDimension;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.icon.Dimension;
import io.github.ctgnz.jmsfx.icon.GeometryType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public class DimensionAdapter implements IDimension {

    private final Dimension dimension;
    private final List<SymbolSetAdapter> symbolSets;

    public DimensionAdapter(Dimension dimension) {
        this.dimension = dimension;
        this.symbolSets = Lists.transform(dimension.getSymbolSets(), symbol -> new SymbolSetAdapter((SymbolSet) symbol));
    }

    @Override
    public ISymbolSet getDefaultSymbolSet() {
        return dimension.getDefaultSymbolSet();
    }

    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public String getFrameId() {
        return dimension.getFrameId();
    }

    public GeometryType getGeometry() {
        return dimension.getGeometryType();
    }

    @Override
    public GeometryType getGeometryType() {
        return dimension.getGeometryType();
    }

    @Override
    public String getGraphicLocation() {
        return dimension.getGraphicLocation();
    }

    @Override
    public String getId() {
        return dimension.getId();
    }

    @Override
    public String getLabel() {
        return dimension.getLabel();
    }

    @Override
    public String getName() {
        return dimension.name();
    }

    public List<SymbolSetAdapter> getSymbolSetAdapters() {
        return symbolSets;
    }

    @Override
    public List<ISymbolSet> getSymbolSets() {
        return symbolSets.stream().map(ISymbolSet.class::cast).toList();
    }

    protected Stream<SymbolSetAdapter> streamSymbolSets() {
        return symbolSets.stream();
    }

}
