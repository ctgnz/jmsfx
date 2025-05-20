package nz.co.ctg.jmsfx.model;

public enum EquipmentMobility implements AmplifierGroup {
    WHEEL_LIMIT_COUNTRY("1", "Wheeled limited cross country"),
    WHEEL_COUNTRY("2", "Wheeled cross country"),
    TRACKED("3", "Tracked"),
    WHEEL_TRACK("4", "Wheeled and tracked combination"),
    TOWED("5", "Towed"),
    RAIL("6", "Rail"),
    PACK_ANIMALS("7", "Pack animals"),
    OVER_SNOW("A", "Over snow (prime mover)"),
    SLED("B", "Sled"),
    BARGE("D", "Barge"),
    AMPHIB("E", "Amphibious");
    private static final AmplifierGroupType TYPE = AmplifierGroupType.EQUIPMENT_MOBILITY;

    private final String id;
    private final String label;

    EquipmentMobility(String id, String label) {
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