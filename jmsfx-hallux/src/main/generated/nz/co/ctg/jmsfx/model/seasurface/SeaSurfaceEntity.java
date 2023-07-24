package nz.co.ctg.jmsfx.model.seasurface;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum SeaSurfaceEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    MILITARY("11", "Military", IconType.MAIN),
    MILITARY_COMBAT("12", "Military Combatant", IconType.MAIN),
    MILITARY_NON_COMBAT("13", "Military Noncombatant", IconType.MAIN),
    CIVILIAN("14", "Civilian", IconType.MAIN),
    OWN_SHIP("15", "Own Ship", IconType.FULL_OCTAGON),
    FUSED_TRACK("16", "Fused Track", IconType.FULL_OCTAGON),
    MANUAL_TRACK("17", "Manual Track", IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private SeaSurfaceEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.SS_SEA_SURFACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return SeaSurfaceSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}