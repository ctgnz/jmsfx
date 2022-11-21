package nz.co.ctg.jmsfx.server.model;

import nz.co.ctg.jmsfx.model.Entity;

public class EntityData<E extends Entity> {

    private final E entity;

    public EntityData(E entity) {
        this.entity = entity;
    }

    public E getEntity() {
        return entity;
    }

    public String getLabel() {
        return entity.getLabel();
    }

    public String getId() {
        return entity.getId();
    }

}
