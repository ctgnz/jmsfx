package nz.co.ctg.jmsfx.server.model;

import nz.co.ctg.jmsfx.model.EntityType;

public class EntityTypeData<T extends EntityType> {
    private final T entityType;

    public EntityTypeData(T entityType) {
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
