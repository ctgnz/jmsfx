package io.github.ctgnz.jmsfx.icon.dismountedindividual;

import java.util.List;

import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.IconType;

public enum DismountedIndividualEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    MILITARY("11", "Military", IconType.NA),
    CIVILIAN2("12", "Civilian", IconType.NA);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    DismountedIndividualEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.DISMOUNTED;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return DismountedIndividualSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}