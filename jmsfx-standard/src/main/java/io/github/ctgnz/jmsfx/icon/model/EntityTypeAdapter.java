package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EntityTypeAdapter extends MainIconAdapter implements IEntityType {
    private final ObjectProperty<IEntity> entity = new SimpleObjectProperty<>();
    private final ObservableList<IEntitySubType> entitySubTypes = FXCollections.observableArrayList();

    public EntityTypeAdapter() {
    }

    public EntityTypeAdapter(IEntityType entityType) {
        super(entityType);
        this.entitySubTypes.addAll(entityType.getEntitySubTypes().stream().map(this::adaptSubType).toList());
    }

    public ObjectProperty<IEntity> entityProperty() {
        return entity;
    }

    @Override
    public IEntity getEntity() {
        return entity.get();
    }

    @Override
    public List<IEntitySubType> getEntitySubTypes() {
        return entitySubTypes;
    }

    @Override
    public String toString() {
        return getLabel();
    }

    protected EntitySubTypeAdapter adaptSubType(IEntitySubType subType) {
        EntitySubTypeAdapter adapter = new EntitySubTypeAdapter(subType);
        adapter.setEntityType(this);
        return adapter;
    }

    protected void setEntity(EntityAdapter entity) {
        this.entity.set(entity);
    }

}
