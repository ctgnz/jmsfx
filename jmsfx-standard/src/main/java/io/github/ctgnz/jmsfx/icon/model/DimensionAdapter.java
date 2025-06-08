package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;
import java.util.stream.Stream;

import com.google.common.collect.Lists;

import io.github.ctgnz.jmsfx.IDimension;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.icon.Dimension;
import io.github.ctgnz.jmsfx.icon.GeometryType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DimensionAdapter extends CodeElementAdapter implements IDimension {

    private final ObjectProperty<ISymbolSet> defaultSymbolSet = new SimpleObjectProperty<>();
    private final ObjectProperty<GeometryType> geometryType = new SimpleObjectProperty<>();
    private final StringProperty frameId = new SimpleStringProperty();
    private final StringProperty graphicLocation = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final ObservableList<SymbolSetAdapter> symbolSets = FXCollections.observableArrayList();

    public DimensionAdapter() {
    }

    public DimensionAdapter(Dimension dimension) {
        super(dimension);
        this.symbolSets.setAll(Lists.transform(dimension.getSymbolSets(), symbol -> new SymbolSetAdapter((SymbolSet) symbol)));
        this.defaultSymbolSet.set(dimension.getDefaultSymbolSet());
        this.geometryType.set(dimension.getGeometryType());
        this.frameId.set(dimension.getFrameId());
        this.graphicLocation.set(dimension.getGraphicLocation());
        this.name.set(dimension.name());
    }

    public ObjectProperty<ISymbolSet> defaultSymbolSetProperty() {
        return defaultSymbolSet;
    }

    public StringProperty frameIdProperty() {
        return frameId;
    }

    public ObjectProperty<GeometryType> geometryTypeProperty() {
        return geometryType;
    }

    @Override
    public ISymbolSet getDefaultSymbolSet() {
        return defaultSymbolSet.get();
    }

    @Override
    public String getFrameId() {
        return frameId.get();
    }

    @Override
    public GeometryType getGeometryType() {
        return geometryType.get();
    }

    @Override
    public String getGraphicLocation() {
        return graphicLocation.get();
    }

    @Override
    public String getName() {
        return name.get();
    }

    public List<SymbolSetAdapter> getSymbolSetAdapters() {
        return symbolSets;
    }

    @Override
    public List<ISymbolSet> getSymbolSets() {
        return symbolSets.stream().map(ISymbolSet.class::cast).toList();
    }

    public StringProperty graphicLocationProperty() {
        return graphicLocation;
    }

    public StringProperty nameProperty() {
        return name;
    }

    @Override
    public String toString() {
        return getLabel();
    }

    protected Stream<SymbolSetAdapter> streamSymbolSets() {
        return symbolSets.stream();
    }

}
