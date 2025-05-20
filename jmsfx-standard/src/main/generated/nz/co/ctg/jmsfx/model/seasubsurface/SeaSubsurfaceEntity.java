package nz.co.ctg.jmsfx.model.seasubsurface;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum SeaSubsurfaceEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    MILITARY("11", "Military", IconType.MAIN),
    CIVILIAN("12", "Civilian", IconType.MAIN),
    WEAPON("13", "Weapon", IconType.MAIN),
    ECHO_TRACKER_CLASSIFIER_ETC_POSSIBLE_CONTACT_POSCON("14", "Echo Tracker Classifier (ETC) / Possible Contact (POSCON)", IconType.FULL_OCTAGON),
    FUSED_TRACK("15", "Fused Track", IconType.FULL_OCTAGON),
    MANUAL_TRACK("16", "Manual Track", IconType.FULL_OCTAGON),
    SEABED_INSTALLATION_MIL("20", "Seabed Installation, Human-Made, Military", IconType.MAIN),
    SEABED_INSTALLATION_NON_MIL("21", "Seabed Installation, Human-Made, Non-Military", IconType.MAIN);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private SeaSubsurfaceEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.SS_SEA_SUBSURFACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return SeaSubsurfaceSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}