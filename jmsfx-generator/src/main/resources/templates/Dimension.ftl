package ${iconPackage};

import java.util.Arrays;
import java.util.List;

import ${basePackage}.IDimension;
import ${basePackage}.ISymbolSet;
import ${typePackage}.GeometryType;

public enum Dimension implements IDimension {
<#list dimensions as dim>
    ${dim.id}("${dim.code}", "${dim.label}", GeometryType.${dim.geometry}, "${dimensionGraphics[dim.id]}")<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final String graphicLocation;
    private final GeometryType geometryType;

    Dimension(String id, String label, GeometryType geometryType, String graphicLocation) {
        this.id = id;
        this.label = label;
        this.geometryType = geometryType;
        this.graphicLocation = graphicLocation;
    }

    @Override
    public ISymbolSet getDefaultSymbolSet() {
        return Arrays.stream(SymbolSet.values()).filter(sym -> sym.getDimension() == this).findFirst().orElse(SymbolSet.UNKNOWN);
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
    public List<ISymbolSet> getSymbolSets() {
        return Arrays.stream(SymbolSet.values()).filter(sym -> sym.getDimension() == this).map(ISymbolSet.class::cast).toList();
    }

}