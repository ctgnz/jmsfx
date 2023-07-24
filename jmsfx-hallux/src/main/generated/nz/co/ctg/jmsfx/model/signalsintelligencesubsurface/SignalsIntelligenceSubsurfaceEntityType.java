package nz.co.ctg.jmsfx.model.signalsintelligencesubsurface;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum SignalsIntelligenceSubsurfaceEntityType implements EntityType {
    COMMUNICATIONS("01", "Communications", SignalsIntelligenceSubsurfaceEntity.SIGNAL_INTERCEPT, IconType.MAIN),
    JAMMER("02", "Jammer", SignalsIntelligenceSubsurfaceEntity.SIGNAL_INTERCEPT, IconType.MAIN),
    RADAR("03", "Radar", SignalsIntelligenceSubsurfaceEntity.SIGNAL_INTERCEPT, IconType.MAIN);

    private final String id;
    private final String label;
    private final SignalsIntelligenceSubsurfaceEntity entity;
    private final IconType iconType;
    
    private SignalsIntelligenceSubsurfaceEntityType(String id, String label, SignalsIntelligenceSubsurfaceEntity entity, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
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
    public Entity getEntity() {
        return entity;
    }
    
}