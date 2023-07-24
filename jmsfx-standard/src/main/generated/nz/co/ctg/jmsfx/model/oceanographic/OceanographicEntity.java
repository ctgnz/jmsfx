package nz.co.ctg.jmsfx.model.oceanographic;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum OceanographicEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    ICE_SYSTEMS("11", "Ice Systems", IconType.NA),
    HYDROGRAPHY("12", "Hydrography", IconType.NA),
    OCEANOGRAPHY("13", "Oceanography", IconType.NA),
    GEOPHYSICS_ACOUSTICS("14", "Geophysics/Acoustics", IconType.NA),
    MARITIME_LIMITS("15", "Limits", IconType.NA),
    MAN_MADE_STRUCTURES("16", "Man-Made Structures", IconType.NA);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private OceanographicEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.SS_OCEANIC;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return OceanographicSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}