package io.github.ctgnz.jmsfx.icon.cyberspace;

import java.util.List;

import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.IconType;

public enum CyberspaceEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    MISSION_FORCE("11", "Mission Force", IconType.NA),
    CYBERSPACE_UNIT("12", "Cyberspace Unit", IconType.NA),
    THREAT_ACTOR("13", "Threat Actor", IconType.MAIN),
    AGENT("14", "Agent", IconType.NA),
    APPLICATION("15", "Application", IconType.MAIN),
    THREAT("16", "Threat", IconType.MAIN),
    DATA("17", "Data", IconType.MAIN),
    PATHS("20", "Paths", IconType.NA),
    TERRAIN("21", "Terrain", IconType.NA);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private CyberspaceEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.CYBERSPACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return CyberspaceSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}