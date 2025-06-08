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

    private final Dimension model;
    private final List<SymbolSetAdapter> symbolSets;

    public DimensionAdapter(Dimension dimension) {
        this.model = dimension;
        this.symbolSets = Lists.transform(dimension.getSymbolSets(), symbol -> new SymbolSetAdapter((SymbolSet) symbol));
    }

    @Override
    public ISymbolSet getDefaultSymbolSet() {
        return model.getDefaultSymbolSet();
    }

    public Dimension getModel() {
        return model;
    }

    @Override
    public String getFrameId() {
        return model.getFrameId();
    }

    public GeometryType getGeometry() {
        return model.getGeometryType();
    }

    @Override
    public GeometryType getGeometryType() {
        return model.getGeometryType();
    }

    @Override
    public String getGraphicLocation() {
        return model.getGraphicLocation();
    }

    @Override
    public String getId() {
        return model.getId();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    @Override
    public String getName() {
        return model.name();
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
