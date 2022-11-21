package nz.co.ctg.jmsfx.model.cyberspace;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum CyberspaceEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    BOTNET("11", "Botnet", IconType.NA),
    INFECTION("12", "Infection", IconType.NA),
    HEALTH_AND_STATUS("13", "Health and Status", IconType.NA),
    DEVICE_TYPE("14", "Device Type", IconType.NA),
    DEVICE_DOMAIN("15", "Device Domain", IconType.NA),
    EFFECT("16", "Effect", IconType.NA);

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
        return SymbolSet.SS_CYBERSPACE;
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