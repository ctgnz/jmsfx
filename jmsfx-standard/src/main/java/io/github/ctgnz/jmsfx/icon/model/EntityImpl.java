package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.SymbolSet;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EntityImpl extends MainIconImpl implements Entity {
    private final ObjectProperty<SymbolSet> symbolSet = new SimpleObjectProperty<>();
    private final ObjectProperty<SymbolSet> baseSymbolSet = new SimpleObjectProperty<>();
    private final ObservableList<EntityType> entityTypes = FXCollections.observableArrayList();

    public EntityImpl() {
    }

    public EntityImpl(Entity entity) {
        super(entity);
        this.symbolSet.set(entity.getSymbolSet());
        this.baseSymbolSet.set(entity.getBaseSymbolSet());
        this.graphicType.set(entity.getGraphicType());
        this.unknown.set(entity.isUnknown());
        this.entityTypes.addAll(entity.getEntityTypes().stream().map(this::adaptEntityType).toList());
    }

    @Override
    public Entity getEntity() {
        return this;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return entityTypes;
    }

    @Override
    public SymbolSet getBaseSymbolSet() {
        return baseSymbolSet.get();
    }

    @Override
    public SymbolSet getSymbolSet() {
        return symbolSet.get();
    }

    public ObjectProperty<SymbolSet> symbolSetProperty() {
        return symbolSet;
    }

    @Override
    public String toString() {
        return getLabel();
    }

    protected EntityTypeImpl adaptEntityType(EntityType type) {
        EntityTypeImpl adapter = new EntityTypeImpl(type);
        adapter.setEntity(this);
        return adapter;
    }

    protected void setSymbolSet(SymbolSetImpl symbolSet) {
        this.symbolSet.set(symbolSet);
    }

}
