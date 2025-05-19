package nz.co.ctg.jmsfx.model;

import java.util.Arrays;

public enum Dimension implements SymbolIdentificationCodeElement {
    UNKNOWN("00", "Unknown", Geometry.POINT_GEOMETRY, "Unknown"),
    AIR("01", "Air", Geometry.POINT_GEOMETRY, "Air"),
    SPACE("05", "Space", Geometry.POINT_GEOMETRY, "Space"),
    LAND_UNIT("10", "Land Unit", Geometry.POINT_GEOMETRY, "Land"),
    LAND_EQUIPMENT("15", "Land Equipment", Geometry.POINT_GEOMETRY, "Land"),
    LAND_INSTALLATION("20", "Land Installations", Geometry.POINT_GEOMETRY, "Land"),
    CONTROL_MEASURE("25", "Control Measure", Geometry.MIXED_GEOMETRY, "ControlMeasures"),
    DISMOUNTED("27", "Dismounted Individual", Geometry.POINT_GEOMETRY, "Dismounted"),
    SEA_SURFACE("30", "Sea Surface", Geometry.POINT_GEOMETRY, "SeaSurface"),
    SEA_SUBSURFACE("35", "Sea Subsurface", Geometry.POINT_GEOMETRY, "SeaSubsurface"),
    ACTIVITY("40", "Activities", Geometry.POINT_GEOMETRY, "Activities"),
    CYBERSPACE("60", "Cyberspace", Geometry.POINT_GEOMETRY, "Cyberspace"),
    INTERNAL("98", "Internal", Geometry.POINT_GEOMETRY, "Internal");

    private final String id;
    private final String label;
    private final String graphicLocation;
    private final Geometry geometry;
    
    private Dimension(String id, String label, Geometry geometry, String graphicLocation) {
        this.id = id;
        this.label = label;
        this.geometry = geometry;
        this.graphicLocation = graphicLocation; 
    }
    
    public SymbolSet getDefaultSymbolSet() {
        return Arrays.stream(SymbolSet.values()).filter(sym -> sym.getDimension() == this).findFirst().orElse(SymbolSet.SS_UNKNOWN);
    }

    public String getFrameId() {
        return getDefaultSymbolSet().getId();
    }

    public Geometry getGeometry() {
        return geometry;
    }
    
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

}