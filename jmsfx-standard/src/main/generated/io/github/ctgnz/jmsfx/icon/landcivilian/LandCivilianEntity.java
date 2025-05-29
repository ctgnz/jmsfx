package io.github.ctgnz.jmsfx.icon.landcivilian;

import java.util.List;

import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.IconType;

public enum LandCivilianEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    CIVILIAN("11", "Civilian", IconType.MAIN);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private LandCivilianEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.LAND_CIVILIAN;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return LandCivilianSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}