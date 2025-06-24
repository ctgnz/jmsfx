package io.github.ctgnz.jmsfx.icon.editor;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EntityTypeImpl rhs) {
            return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .isEquals();
        }
        return super.equals(obj);
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
    public int hashCode() {
        return new HashCodeBuilder(9371, 1741).append(getId()).toHashCode();
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
