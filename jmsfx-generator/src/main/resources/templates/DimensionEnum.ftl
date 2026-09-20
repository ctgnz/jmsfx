package ${iconPackage};
<#assign hasBounds = dimensions?filter(v -> v.bounds??)?size gt 0>

<#if hasBounds>import javafx.geometry.Rectangle2D;

</#if>import java.util.Arrays;
import java.util.List;

import ${basePackage}.Dimension;
<#if hasBounds>import ${basePackage}.StandardIdentity;
</#if><#if hasBounds>import ${basePackage}.Status;
</#if>
import ${basePackage}.SymbolSet;
import ${typePackage}.GeometryType;

public enum DimensionEnum implements Dimension {
<#list dimensions as dim>
        ${dim.id}("${dim.code}", "${dim.label}", GeometryType.${dim.geometry}, "${dim.graphicLocation}") <#if dim.bounds??>{
            @Override
            public Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
                return switch (identity.getId() + status.getFrameId(identity) + (civilianEntity ? "c" : "")) {
<#list dim.bounds as key, rect>
                    case "${key}" -> new Rectangle2D(${rect[0]?c}, ${rect[1]?c}, ${rect[2]?c}, ${rect[3]?c});
</#list>
                    default -> Rectangle2D.EMPTY;
                };
            }
        }</#if><#sep>,
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
        return Arrays.stream(SymbolSetEnum.values())
            .filter(sym -> sym.getDimension() == this)
            .findFirst()
            .orElse(SymbolSetEnum.COMMON);
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
        return Arrays.stream(SymbolSetEnum.values())
            .filter(sym -> sym.getDimension() == this)
            .map(SymbolSet.class::cast)
            .toList();
    }

}