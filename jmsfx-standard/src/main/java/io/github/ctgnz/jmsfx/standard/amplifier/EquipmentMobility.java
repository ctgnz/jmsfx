package io.github.ctgnz.jmsfx.standard.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.standard.AmplifierListEnum;

public enum EquipmentMobility implements StandardAmplifierItem {
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

    private final String id;
    private final String label;

    EquipmentMobility(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.EQUIPMENT_MOBILITY;
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
    public String getName() {
        return name();
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}