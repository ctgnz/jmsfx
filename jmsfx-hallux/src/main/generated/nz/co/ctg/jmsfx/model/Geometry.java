package nz.co.ctg.jmsfx.model;

public enum Geometry implements SymbolIdentificationCodeElement {
    AREA_GEOMETRY("Area Geometry"),
    LINE_GEOMETRY("Line Geometry"),
    NULL_GEOMETRY("Null Geometry"),
    POINT_GEOMETRY("Point Geometry"),
    MIXED_GEOMETRY("Mixed Geometry");
    private final String label;
    
    private Geometry(String label) {
        this.label = label;
    }
    
    @Override
    public String getId() {
        return name();
    }
    
    @Override
    public String getLabel() {
        return label;
    }

}