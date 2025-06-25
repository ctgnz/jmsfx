package io.github.ctgnz.jmsfx.icon;

import java.util.Arrays;
import java.util.List;

import io.github.ctgnz.jmsfx.Status;

public enum StatusEnum implements Status {
    PRESENT("0", "Present", false),
    PLANNED("1", "Planned/Anticipated/Suspect", false),
    FULLY_CAPABLE("2", "Present/Fully Capable", true, "ACTIVITY", "AIR", "COMMON", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE"),
    DAMAGED("3", "Present/Damaged", true, "ACTIVITY", "AIR", "COMMON", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE"),
    DESTROYED("4", "Present/Destroyed", true, "ACTIVITY", "AIR", "COMMON", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE"),
    FULL("5", "Present/Full to Capacity", true, "ACTIVITY", "AIR", "COMMON", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE");

    private final String id;
    private final String label;
    private final boolean operationalCondition;
    private final String[] dimensionIds;

    StatusEnum(String id, String label, boolean operationalCondition, String... dimensionIds) {
        this.id = id;
        this.label = label;
        this.operationalCondition = operationalCondition;
        this.dimensionIds = dimensionIds;
    }

    @Override
    public List<String> getDimensionIds() {
        return Arrays.asList(dimensionIds);
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
    public boolean isOperationalCondition() {
        return operationalCondition;
    }

    @Override
    public boolean isPlanned() {
        return this == PLANNED;
    }

    @Override
    public boolean isPresent() {
        return this == PRESENT;
    }

}