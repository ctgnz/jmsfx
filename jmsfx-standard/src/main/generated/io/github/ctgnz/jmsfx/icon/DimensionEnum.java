package io.github.ctgnz.jmsfx.icon;

import java.util.Arrays;
import java.util.List;

import io.github.ctgnz.jmsfx.Dimension;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GeometryType;

public enum DimensionEnum implements Dimension {
    COMMON("00", "Common", GeometryType.POINT_GEOMETRY, "Common"),
    AIR("01", "Air", GeometryType.POINT_GEOMETRY, "Air"),
    SPACE("05", "Space", GeometryType.POINT_GEOMETRY, "Space"),
    LAND_UNIT("10", "Land Unit", GeometryType.POINT_GEOMETRY, "Land"),
    LAND_EQUIPMENT("15", "Land Equipment", GeometryType.POINT_GEOMETRY, "Land"),
    LAND_INSTALLATION("20", "Land Installations", GeometryType.POINT_GEOMETRY, "Land"),
    CONTROL_MEASURE("25", "Control Measure", GeometryType.MIXED_GEOMETRY, "ControlMeasures"),
    DISMOUNTED("27", "Dismounted Individual", GeometryType.POINT_GEOMETRY, "Dismounted"),
    SEA_SURFACE("30", "Sea Surface", GeometryType.POINT_GEOMETRY, "SeaSurface"),
    SEA_SUBSURFACE("35", "Sea Subsurface", GeometryType.POINT_GEOMETRY, "SeaSubsurface"),
    ACTIVITY("40", "Activities", GeometryType.POINT_GEOMETRY, "Activities"),
    CYBERSPACE("60", "Cyberspace", GeometryType.POINT_GEOMETRY, "Cyberspace");

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