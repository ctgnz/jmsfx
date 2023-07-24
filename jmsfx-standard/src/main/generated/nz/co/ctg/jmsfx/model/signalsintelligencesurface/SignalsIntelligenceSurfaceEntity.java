package nz.co.ctg.jmsfx.model.signalsintelligencesurface;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum SignalsIntelligenceSurfaceEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    SIGNAL_INTERCEPT("11", "Signal Intercept", IconType.NA);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private SignalsIntelligenceSurfaceEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.SS_SIGINT_SURFACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return SignalsIntelligenceSurfaceSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}