package nz.co.ctg.jmsfx.model;

public enum TowedArrayType implements AmplifierGroup {
    SHORT_TOWED_ARRAY("61", "Short towed array"),
    LONG_TOWED_ARRAY("62", "Long towed array");

    private final String id;
    private final String label;
    
    private TowedArrayType(String id, String label) {
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getGraphicLocation() {
        return "Amplifier";
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