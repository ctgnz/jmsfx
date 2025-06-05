package io.github.ctgnz.jmsfx.icon;

import java.util.Arrays;
import java.util.Objects;

import io.github.ctgnz.jmsfx.IHqtfDummy;
import io.github.ctgnz.jmsfx.ISymbolSet;

public enum HqtfDummy implements IHqtfDummy {
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
    private final String[] dimensionIds;

    HqtfDummy(String id, String label, String... dimensionIds) {
        this.id = id;
        this.label = label;
        this.dimensionIds = dimensionIds;
    }

    @Override
    public String[] getDimensionIds() {
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
    public boolean isSupported(ISymbolSet symbolSet) {
        return Arrays.stream(dimensionIds).anyMatch(dim -> Objects.equals(dim, symbolSet.getDimension().getName()));
    }

}