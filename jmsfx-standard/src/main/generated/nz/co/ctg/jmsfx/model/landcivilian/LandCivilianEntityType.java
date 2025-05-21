package nz.co.ctg.jmsfx.model.landcivilian;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum LandCivilianEntityType implements EntityType {
    ENVIRONMENTAL_PROTECTION("01", "Environmental Protection", LandCivilianEntity.CIVILIAN, IconType.MAIN),
    GOVERNMENT_ORGANIZATION("02", "Government Organization", LandCivilianEntity.CIVILIAN, IconType.MAIN),
    INDIVIDUAL("03", "Individual", LandCivilianEntity.CIVILIAN, IconType.MAIN),
    GROUP("04", "Group", LandCivilianEntity.CIVILIAN, IconType.MAIN),
    KILLING_VICTIM("05", "Individual Victim Killed by Criminal Activity", LandCivilianEntity.CIVILIAN, IconType.MAIN),
    KILLING_VICTIMS("06", "Group of Victims Killed by Criminal Activity", LandCivilianEntity.CIVILIAN, IconType.MAIN),
    VICTIM_ATTEMPTED_CRIME("07", "Victim of an Attempted Crime", LandCivilianEntity.CIVILIAN, IconType.MAIN),
    SPY("08", "Spy", LandCivilianEntity.CIVILIAN, IconType.MAIN),
    COMPOSITE_LOSS("09", "Composite Loss", LandCivilianEntity.CIVILIAN, IconType.MAIN),
    EMERGENCY_MEDICAL_OPERATION("10", "Emergency Medical Operation", LandCivilianEntity.CIVILIAN, IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final LandCivilianEntity entity;
    private final IconType iconType;
    
    private LandCivilianEntityType(String id, String label, LandCivilianEntity entity, IconType iconType) {
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