package io.github.ctgnz.jmsfx.icon.common;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum CommonEntitySubType implements EntitySubType {
    UNSPECIFIED_SUB_TYPE("00", "Unspecified", CommonEntityType.UNSPECIFIED_TYPE, GraphicType.NA);

    private final String id;
    private final String label;
    private final CommonEntityType entityType;
    private final GraphicType graphicType;

    CommonEntitySubType(String id, String label, CommonEntityType entityType, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
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
    public EntityType getEntityType() {
        return entityType;
    }

}