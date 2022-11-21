package nz.co.ctg.jmsfx.model.signalsintelligencespace;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum SignalsIntelligenceSpaceEntityType implements EntityType {
    COMMUNICATIONS("01", "Communications", SignalsIntelligenceSpaceEntity.SIGNAL_INTERCEPT, IconType.MAIN),
    JAMMER("02", "Jammer", SignalsIntelligenceSpaceEntity.SIGNAL_INTERCEPT, IconType.MAIN),
    RADAR("03", "Radar", SignalsIntelligenceSpaceEntity.SIGNAL_INTERCEPT, IconType.MAIN);

    private final String id;
    private final String label;
    private final SignalsIntelligenceSpaceEntity entity;
    private final IconType iconType;
    
    private SignalsIntelligenceSpaceEntityType(String id, String label, SignalsIntelligenceSpaceEntity entity, IconType iconType) {
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