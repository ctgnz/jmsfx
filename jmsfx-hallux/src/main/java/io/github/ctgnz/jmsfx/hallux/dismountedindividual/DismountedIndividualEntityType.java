package io.github.ctgnz.jmsfx.hallux.dismountedindividual;

import java.util.List;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.hallux.IconBounds;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum DismountedIndividualEntityType implements EntityType {
        SERVICE("01", "Service Branch", DismountedIndividualEntity.MILITARY, GraphicType.NA),
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
    public Rectangle2D getIconBounds() {
        return IconBounds.lookup(getGraphicIdentifier(), getGraphicType());
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
        return DismountedIndividualSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}