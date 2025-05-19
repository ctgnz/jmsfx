package nz.co.ctg.jmsfx.model;

public enum EquipmentMobility implements AmplifierGroup {
    WHEEL_LIMIT_COUNTRY("31", "Wheeled limited cross country"),
    WHEEL_COUNTRY("32", "Wheeled cross country"),
    TRACKED("33", "Tracked"),
    WHEEL_TRACK("34", "Wheeled and tracked combination"),
    TOWED("35", "Towed"),
    RAIL("36", "Rail"),
    PACK_ANIMALS("37", "Pack animals"),
    OVER_SNOW("30", "Over snow (prime mover)"),
    SLED("30", "Sled"),
    BARGE("30", "Barge"),
    AMPHIB("30", "Amphibious");

    private final String id;
    private final String label;
    
    private EquipmentMobility(String id, String label) {
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