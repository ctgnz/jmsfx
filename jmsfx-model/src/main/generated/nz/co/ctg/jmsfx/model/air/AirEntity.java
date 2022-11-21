package nz.co.ctg.jmsfx.model.air;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum AirEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    MILITARY("11", "Military", IconType.MAIN),
    CIVILIAN("12", "Civilian", IconType.MAIN),
    WEAPON("13", "Weapon", IconType.MAIN),
    MANUAL_TRACK("14", "Manual Track", IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private AirEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.SS_AIR;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return AirSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}