package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.ISymbolSet;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EntityAdapter extends MainIconAdapter implements IEntity {
    private final ObjectProperty<ISymbolSet> symbolSet = new SimpleObjectProperty<>();
    private final ObservableList<IEntityType> entityTypes = FXCollections.observableArrayList();

    public EntityAdapter() {
    }

    public EntityAdapter(IEntity entity) {
        super(entity);
        this.graphicType.set(entity.getGraphicType());
        this.unknown.set(entity.isUnknown());
        this.entityTypes.addAll(entity.getEntityTypes().stream().map(this::adaptEntityType).toList());
    }

    @Override
    public IEntity getEntity() {
        return this;
    }

    @Override
    public List<IEntityType> getEntityTypes() {
        return entityTypes;
    }

    @Override
    public ISymbolSet getSymbolSet() {
        return symbolSet.get();
    }

    public ObjectProperty<ISymbolSet> symbolSetProperty() {
        return symbolSet;
    }

    @Override
    public String toString() {
        return getLabel();
    }

    protected EntityTypeAdapter adaptEntityType(IEntityType type) {
        EntityTypeAdapter adapter = new EntityTypeAdapter(type);
        adapter.setEntity(this);
        return adapter;
    }

    protected void setSymbolSet(SymbolSetAdapter symbolSet) {
        this.symbolSet.set(symbolSet);
    }

}
