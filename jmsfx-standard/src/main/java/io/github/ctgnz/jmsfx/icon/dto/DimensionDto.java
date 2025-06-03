package io.github.ctgnz.jmsfx.icon.dto;

import java.util.List;
import java.util.stream.Stream;

import com.google.common.collect.Lists;

import io.github.ctgnz.jmsfx.icon.Dimension;
import io.github.ctgnz.jmsfx.icon.Geometry;
import io.github.ctgnz.jmsfx.icon.SymbolIdentificationCodeElement;

public class DimensionDto implements SymbolIdentificationCodeElement {

    private final Dimension dimension;
    private final List<SymbolSetDto> symbolSets;

    public DimensionDto(Dimension dimension) {
        this.dimension = dimension;
        this.symbolSets = Lists.transform(dimension.getSymbolSets(), symbol -> new SymbolSetDto(symbol));
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getFrameId() {
        return dimension.getFrameId();
    }

    public Geometry getGeometry() {
        return dimension.getGeometry();
    }

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

    public List<SymbolSetDto> getSymbolSets() {
        return symbolSets;
    }

    protected Stream<SymbolSetDto> streamSymbolSets() {
        return symbolSets.stream();
    }

}
