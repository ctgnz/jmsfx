package io.github.ctgnz.jmsfx.types;

public enum GeometryType {
    AREA_GEOMETRY("Area Geometry"),
    LINE_GEOMETRY("Line Geometry"),
    NULL_GEOMETRY("Null Geometry"),
    POINT_GEOMETRY("Point Geometry"),
    MIXED_GEOMETRY("Mixed Geometry");
    
    private final String label;
    
    private GeometryType(String label) {
        this.label = label;
    }
    
    public String getId() {
        return name();
    }
    
    public String getLabel() {
        return label;
    }

}