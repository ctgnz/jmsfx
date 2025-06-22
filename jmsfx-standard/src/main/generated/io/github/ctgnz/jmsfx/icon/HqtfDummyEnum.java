package io.github.ctgnz.jmsfx.icon;

import java.util.Arrays;
import java.util.List;

import io.github.ctgnz.jmsfx.HqtfDummy;

public enum HqtfDummyEnum implements HqtfDummy {
    NA("0", "Not Applicable"),
    FEINT_DUMMY("1", "Feint/Dummy", "AIR", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE"),
    HQ("2", "Headquarters", "AIR", "CYBERSPACE", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE"),
    FEINT_DUMMY_HQ("3", "Feint/Dummy Headquarters", "AIR", "CYBERSPACE", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE"),
    TF("4", "Task Force", "AIR", "CYBERSPACE", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE"),
    FEINT_DUMMY_TF("5", "Feint/Dummy Task Force", "AIR", "CYBERSPACE", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE"),
    TF_HQ("6", "Task Force Headquarters", "AIR", "CYBERSPACE", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE"),
    FEINT_DUMMY_TF_HQ("7", "Feint/Dummy Task Force Headquarters", "AIR", "CYBERSPACE", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE");

    private final String id;
    private final String label;
    private final List<String> dimensionIds;

    HqtfDummyEnum(String id, String label, String... dimensionIds) {
        this.id = id;
        this.label = label;
        this.dimensionIds = Arrays.asList(dimensionIds);
    }

    @Override
    public List<String> getDimensionIds() {
        return dimensionIds;
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
    public boolean isUnknown() {
        return this == NA;
    }

}