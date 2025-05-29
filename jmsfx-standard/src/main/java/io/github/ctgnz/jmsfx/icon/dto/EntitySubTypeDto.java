package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.EntitySubType;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.IconType;

public class EntitySubTypeDto implements EntitySubType {

    private final EntitySubType entitySubType;

    public EntitySubTypeDto(EntitySubType subType) {
        this.entitySubType = subType;
    }

    public EntitySubType getEntitySubType() {
        return entitySubType;
    }

    @Override
    public EntityType getEntityType() {
        return entitySubType.getEntityType();
    }

    @Override
    public IconType getIconType() {
        return entitySubType.getIconType();
    }

    @Override
    public String getId() {
        return entitySubType.getId();
    }

    @Override
    public String getLabel() {
        return entitySubType.getLabel();
    }

}
