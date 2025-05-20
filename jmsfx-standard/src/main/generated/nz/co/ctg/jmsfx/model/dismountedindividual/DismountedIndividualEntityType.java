package nz.co.ctg.jmsfx.model.dismountedindividual;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.IconType;

public enum DismountedIndividualEntityType implements EntityType {
    TASK("02", "Activity/Task", DismountedIndividualEntity.MILITARY, IconType.NA),
    LETHAL_WEAPONS("03", "Lethal Weapons", DismountedIndividualEntity.MILITARY, IconType.NA),
    NON_LETHAL_WEAPONS("04", "Non-Lethal Weapons", DismountedIndividualEntity.MILITARY, IconType.NA),
    TASK2("01", "Activity", DismountedIndividualEntity.CIVILIAN2, IconType.NA);

    private final String id;
    private final String label;
    private final DismountedIndividualEntity entity;
    private final IconType iconType;
    
    private DismountedIndividualEntityType(String id, String label, DismountedIndividualEntity entity, IconType iconType) {
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
    
   @Override
    public List<EntitySubType> getEntitySubTypes() {
        return DismountedIndividualSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

}