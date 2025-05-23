package nz.co.ctg.jmsfx.icon.dto;

import nz.co.ctg.jmsfx.model.Entity;

public class EntityDto<E extends Entity> {

    private final E entity;

    public EntityDto(E entity) {
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
