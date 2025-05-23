package nz.co.ctg.jmsfx.icon.dto;

import nz.co.ctg.jmsfx.model.EntityType;

public class EntityTypeDto<T extends EntityType> {
    private final T entityType;

    public EntityTypeDto(T entityType) {
        this.entityType = entityType;
    }

    public T getEntityType() {
        return entityType;
    }

    public String getLabel() {
        return entityType.getLabel();
    }

    public String getId() {
        return entityType.getId();
    }

}
