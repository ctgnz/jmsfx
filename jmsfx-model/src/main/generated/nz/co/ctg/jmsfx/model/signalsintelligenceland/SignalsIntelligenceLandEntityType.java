package nz.co.ctg.jmsfx.model.signalsintelligenceland;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum SignalsIntelligenceLandEntityType implements EntityType {
    COMMUNICATIONS("01", "Communications", SignalsIntelligenceLandEntity.SIGNAL_INTERCEPT, IconType.MAIN),
    JAMMER("02", "Jammer", SignalsIntelligenceLandEntity.SIGNAL_INTERCEPT, IconType.MAIN),
    RADAR("03", "Radar", SignalsIntelligenceLandEntity.SIGNAL_INTERCEPT, IconType.MAIN);

    private final String id;
    private final String label;
    private final SignalsIntelligenceLandEntity entity;
    private final IconType iconType;
    
    private SignalsIntelligenceLandEntityType(String id, String label, SignalsIntelligenceLandEntity entity, IconType iconType) {
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