package nz.co.ctg.jmsfx.model;

public enum TowedArrayType implements AmplifierGroup {
    SHORT_TOWED_ARRAY("1", "Short towed array"),
    LONG_TOWED_ARRAY("2", "Long towed array");
    private static final AmplifierGroupType TYPE = AmplifierGroupType.TOWED_ARRAYS;

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
    public String getFullId() {
        return String.format("%s%s", TYPE.getId(), id);
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