package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.Entity;

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
