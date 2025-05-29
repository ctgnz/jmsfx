package io.github.ctgnz.jmsfx.icon.cyberspaceair;

import java.util.List;

import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.IconType;

public enum CyberspaceAirEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    MISSION_FORCE("11", "Mission Force", IconType.NA),
    CYBERSPACE_UNIT("12", "Cyberspace Unit", IconType.NA),
    THREAT_ACTOR("13", "Threat Actor", IconType.MAIN);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private CyberspaceAirEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.CYBERSPACE_AIR;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return CyberspaceAirSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}