package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.IStandardAmplifier;
import io.github.ctgnz.jmsfx.icon.ListAmplifierType;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum EquipmentMobility implements IStandardAmplifier {
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

    private static final ListAmplifierType TYPE = ListAmplifierType.EQUIPMENT_MOBILITY;
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
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public ListAmplifierType getType() {
        return TYPE;
    }

    public boolean isDeprecated() {
        try {
            return EquipmentMobility.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return EquipmentMobility.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}