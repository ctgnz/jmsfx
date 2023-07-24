package nz.co.ctg.jmsfx.model.atmospheric;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum AtmosphericEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    PRESSURE_SYSTEMS("11", "Pressure Systems", IconType.NA),
    TURBULENCE("12", "Turbulence", IconType.NA),
    ICING("13", "Icing", IconType.NA),
    WINDS("14", "Winds", IconType.NA),
    CLOUD_COVER("15", "Cloud Cover", IconType.NA),
    WEATHER_SYMBOLS("16", "Weather Symbols", IconType.NA),
    BOUNDED_AREAS_WEATHER("17", "Bounded Areas of Weather", IconType.NA),
    ISOPLETHS("18", "Isopleths", IconType.NA),
    STATE_GROUND("19", "State of the Ground", IconType.NA);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private AtmosphericEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.SS_ATMOSPHERIC;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return AtmosphericSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}