package io.github.ctgnz.jmsfx.icon;

import java.util.Arrays;
import java.util.Objects;

public enum Status implements SymbolIdentificationCodeElement {
    PRESENT("0", "Present", false),
    PLANNED("1", "Planned/Anticipated/Suspect", false),
    FULLY_CAPABLE("2", "Present/Fully Capable", true, "ACTIVITY", "AIR", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE", "UNKNOWN"),
    DAMAGED("3", "Present/Damaged", true, "ACTIVITY", "AIR", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE", "UNKNOWN"),
    DESTROYED("4", "Present/Destroyed", true, "ACTIVITY", "AIR", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE", "UNKNOWN"),
    FULL("5", "Present/Full to Capacity", true, "ACTIVITY", "AIR", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE", "UNKNOWN");    

    private final String id;
    private final String label;
    private final boolean operationalCondition;
    private final String[] dimensionIds; 
    
    private Status(String id, String label, boolean operationalCondition, String... dimensionIds) {
        this.id = id;
        this.label = label;
        this.operationalCondition = operationalCondition;
        this.dimensionIds = dimensionIds;
    }
    
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

    public boolean isOperationalCondition() {
        return operationalCondition;
    }

    public boolean isSupported(SymbolSet symbolSet) {
        return Arrays.stream(dimensionIds).anyMatch(dim -> Objects.equals(dim, symbolSet.getDimension().name()));
    }

}