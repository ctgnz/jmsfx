package nz.co.ctg.jmsfx.model.signalsintelligenceair;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum SignalsIntelligenceAirEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    SIGNAL_INTERCEPT("11", "Signal Intercept", IconType.NA);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private SignalsIntelligenceAirEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.SS_SIGINT_AIR;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return SignalsIntelligenceAirSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}