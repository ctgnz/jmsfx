package io.github.ctgnz.jmsfx.hallux.common;

import java.util.List;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.hallux.IconBounds;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum CommonEntityType implements EntityType {
        UNSPECIFIED_TYPE("00", "Unspecified", CommonEntity.UNSPECIFIED, GraphicType.NA);

    private final String id;
    private final String label;
    private final CommonEntity entity;
    private final GraphicType graphicType;

    CommonEntityType(String id, String label, CommonEntity entity, GraphicType graphicType) {
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
        return CommonSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}