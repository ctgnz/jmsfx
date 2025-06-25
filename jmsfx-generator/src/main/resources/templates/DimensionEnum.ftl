package ${iconPackage};

import java.util.Arrays;
import java.util.List;

import ${basePackage}.Dimension;
import ${basePackage}.SymbolSet;
import ${typePackage}.GeometryType;

public enum DimensionEnum implements Dimension {
<#list dimensions as dim>
    ${dim.id}("${dim.code}", "${dim.label}", GeometryType.${dim.geometry}, "${dimensionGraphics[dim.id]}")<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final String graphicLocation;
    private final GeometryType geometryType;

    DimensionEnum(String id, String label, GeometryType geometryType, String graphicLocation) {
        this.id = id;
        this.label = label;
        this.geometryType = geometryType;
        this.graphicLocation = graphicLocation;
    }

    @Override
    public SymbolSet getDefaultSymbolSet() {
        return Arrays.stream(SymbolSetEnum.values()).filter(sym -> sym.getDimension() == this).findFirst().orElse(SymbolSetEnum.COMMON);
    }

    @Override
    public String getFrameId() {
        return getDefaultSymbolSet().getId();
    }

    @Override
    public GeometryType getGeometryType() {
        return geometryType;
    }

    @Override
    public String getGraphicLocation() {
        return graphicLocation;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getName() {
        return name();
    }

    @Override
    public List<SymbolSet> getSymbolSets() {
        return Arrays.stream(SymbolSetEnum.values()).filter(sym -> sym.getDimension() == this).map(SymbolSet.class::cast).toList();
    }

}