package io.github.ctgnz.jmsfx.icon.activity;

import java.util.List;

import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.IconType;

public enum ActivityEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    INCIDENT("11", "Incident", IconType.NA),
    CIVIL_DISTURBANCE("12", "Civil Disturbance", IconType.FULL_OCTAGON),
    OPERATION("13", "Operation", IconType.NA),
    HAZARD_MATERIALS("15", "Hazard Materials", IconType.NA),
    TRANSPORTATION_INCIDENT("16", "Transportation Incident", IconType.FULL_OCTAGON),
    NATURAL_EVENT("17", "Natural Event", IconType.MAIN),
    INDIVIDUAL("18", "Individual", IconType.NA);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private ActivityEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.ACTIVITY;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return ActivitySymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}