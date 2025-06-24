package io.github.ctgnz.jmsfx.icon.editor;

import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.github.ctgnz.jmsfx.Dimension;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.DimensionEnum;
import io.github.ctgnz.jmsfx.types.GeometryType;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DimensionImpl extends CodeElementImpl implements Dimension {

    private final ObjectProperty<SymbolSet> defaultSymbolSet = new SimpleObjectProperty<>();
    private final ObjectProperty<GeometryType> geometryType = new SimpleObjectProperty<>();
    private final StringProperty frameId = new SimpleStringProperty();
    private final StringProperty graphicLocation = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final ObservableList<SymbolSetImpl> symbolSets = FXCollections.observableArrayList();

    public DimensionImpl() {
    }

    public DimensionImpl(DimensionEnum dimension) {
        super(dimension);
        dimension.getSymbolSets().stream().map(SymbolSetImpl::new).forEach(this::addSymbolSet);
        this.defaultSymbolSet.set(symbolSets.getFirst());
        this.geometryType.set(dimension.getGeometryType());
        this.frameId.set(dimension.getFrameId());
        this.graphicLocation.set(dimension.getGraphicLocation());
        this.name.set(dimension.name());
    }

    public void addSymbolSet(SymbolSetImpl symbolSet) {
        symbolSet.setDimension(this);
        this.symbolSets.add(symbolSet);
    }

    public ObjectProperty<SymbolSet> defaultSymbolSetProperty() {
        return defaultSymbolSet;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DimensionImpl rhs) {
            return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .isEquals();
        }
        return super.equals(obj);
    }

    public StringProperty frameIdProperty() {
        return frameId;
    }

    public ObjectProperty<GeometryType> geometryTypeProperty() {
        return geometryType;
    }

    @Override
    public SymbolSet getDefaultSymbolSet() {
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

    public List<SymbolSetImpl> getSymbolSetAdapters() {
        return symbolSets;
    }

    @Override
    public List<SymbolSet> getSymbolSets() {
        return symbolSets.stream().map(SymbolSet.class::cast).toList();
    }

    public StringProperty graphicLocationProperty() {
        return graphicLocation;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(9883, 3907).append(getId()).toHashCode();
    }

    public StringProperty nameProperty() {
        return name;
    }

    protected Stream<SymbolSetImpl> streamSymbolSets() {
        return symbolSets.stream();
    }

}
