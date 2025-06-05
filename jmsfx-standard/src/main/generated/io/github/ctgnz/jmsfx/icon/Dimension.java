package io.github.ctgnz.jmsfx.icon;

import java.util.Arrays;
import java.util.List;

import io.github.ctgnz.jmsfx.IDimension;
import io.github.ctgnz.jmsfx.ISymbolSet;

public enum Dimension implements IDimension {
    UNKNOWN("00", "Unknown", GeometryType.POINT_GEOMETRY, "Unknown"),
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
    CYBERSPACE("60", "Cyberspace", GeometryType.POINT_GEOMETRY, "Cyberspace"),
    INTERNAL("98", "Internal", GeometryType.POINT_GEOMETRY, "Internal");

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