package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EntityTypeImpl extends MainIconImpl implements EntityType {
    private final ObjectProperty<Entity> entity = new SimpleObjectProperty<>();
    private final ObservableList<EntitySubType> entitySubTypes = FXCollections.observableArrayList();

    public EntityTypeImpl() {
    }

    public EntityTypeImpl(EntityType entityType) {
        super(entityType);
        this.entity.set(entityType.getEntity());
        this.entitySubTypes.addAll(entityType.getEntitySubTypes().stream().map(this::adaptSubType).toList());
    }

    public ObjectProperty<Entity> entityProperty() {
        return entity;
    }

    @Override
    public Entity getEntity() {
        return entity.get();
    }

    @Override
    public List<EntitySubType> getEntitySubTypes() {
        return entitySubTypes;
    }

    @Override
    public String toString() {
        return getLabel();
    }

    protected EntitySubTypeImpl adaptSubType(EntitySubType subType) {
        EntitySubTypeImpl adapter = new EntitySubTypeImpl(subType);
        adapter.setEntityType(this);
        return adapter;
    }

    protected void setEntity(EntityImpl entity) {
        this.entity.set(entity);
    }

}
