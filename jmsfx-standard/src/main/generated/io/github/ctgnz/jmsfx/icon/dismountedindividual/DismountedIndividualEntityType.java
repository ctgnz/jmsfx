package io.github.ctgnz.jmsfx.icon.dismountedindividual;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum DismountedIndividualEntityType implements IEntityType {
    TASK("02", "Activity/Task", DismountedIndividualEntity.MILITARY, GraphicType.NA),
    LETHAL_WEAPONS("03", "Lethal Weapons", DismountedIndividualEntity.MILITARY, GraphicType.NA),
    NON_LETHAL_WEAPONS("04", "Non-Lethal Weapons", DismountedIndividualEntity.MILITARY, GraphicType.NA),
    TASK2("01", "Activity", DismountedIndividualEntity.CIVILIAN2, GraphicType.NA);

    private final String id;
    private final String label;
    private final DismountedIndividualEntity entity;
    private final GraphicType graphicType;

    DismountedIndividualEntityType(String id, String label, DismountedIndividualEntity entity, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
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
    public IEntity getEntity() {
        return entity;
    }

    @Override
    public List<IEntitySubType> getEntitySubTypes() {
        return DismountedIndividualSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}