package io.github.ctgnz.jmsfx.icon.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SectorOneModifierImpl extends CodeElementImpl implements SectorOneModifier {
    private final ObjectProperty<SymbolSet> symbolSet = new SimpleObjectProperty<>();
    protected final BooleanProperty unknown = new SimpleBooleanProperty();
    protected final StringProperty category = new SimpleStringProperty();
    protected final StringProperty graphicIdentifier = new SimpleStringProperty();

    public SectorOneModifierImpl() {
    }

    public SectorOneModifierImpl(SectorOneModifier modifier) {
        super(modifier);
        this.symbolSet.set(modifier.getSymbolSet());
        this.category.set(modifier.getCategory());
        this.unknown.set(modifier.isUnknown());
        this.graphicIdentifier.set(modifier.getGraphicIdentifier());
    }

    public StringProperty categoryProperty() {
        return category;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SectorOneModifierImpl rhs) {
            return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .isEquals();
        }
        return super.equals(obj);
    }

    @Override
    public String getCategory() {
        return category.get();
    }

    @Override
    public String getGraphicIdentifier() {
        return graphicIdentifier.get();
    }

    @Override
    public SymbolSet getSymbolSet() {
        return symbolSet.get();
    }

    public StringProperty graphicIdentifierProperty() {
        return graphicIdentifier;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(6263, 3631).append(getId()).toHashCode();
    }

    @Override
    public boolean isUnknown() {
        return unknown.get();
    }

    public ObjectProperty<SymbolSet> symbolSetProperty() {
        return symbolSet;
    }

    @Override
    public String toString() {
        return getLabel();
    }

    public BooleanProperty unknownProperty() {
        return unknown;
    }

    protected void setSymbolSet(SymbolSetImpl symbolSet) {
        this.symbolSet.set(symbolSet);
    }

}
