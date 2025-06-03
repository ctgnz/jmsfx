package io.github.ctgnz.jmsfx.icon.landunits;

import java.util.List;

import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.IconType;

public enum LandUnitsEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    COMMAND_AND_CONTROL("11", "Command and Control", IconType.MAIN),
    MOVEMENT_AND_MANEUVER("12", "Movement and Maneuver", IconType.NA),
    FIRES("13", "Fires", IconType.NA),
    PROTECTION("14", "Protection", IconType.NA),
    INTELLIGENCE("15", "Intelligence", IconType.NA),
    SUSTAINMENT("16", "Sustainment", IconType.MAIN),
    NAVAL("17", "Naval", IconType.NA),
    NAMED_HEADQUARTERS("18", "Named Headquarters", IconType.NA),
    EMERGENCY_OPERATION("19", "Emergency Operation", IconType.FULL_OCTAGON),
    LAW_ENFORCEMENT("20", "Law Enforcement", IconType.FULL_OCTAGON),
    CYBERSPACE_OPERATION("21", "Cyberspace Operation", IconType.MAIN);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    LandUnitsEntity(String id, String label, IconType iconType) {
        this.id = id;
        this.label = label;
        this.iconType = iconType;
    }
    
    @Override
    public IconType getIconType() {
        return iconType;
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
    public SymbolSet getSymbolSet() {
        return SymbolSet.LAND_UNIT;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return LandUnitsSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}