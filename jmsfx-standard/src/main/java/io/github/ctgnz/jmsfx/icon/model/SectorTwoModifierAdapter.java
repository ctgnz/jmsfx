package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.ISymbolSet;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SectorTwoModifierAdapter extends CodeElementAdapter implements ISectorTwoModifier {
    private final ObjectProperty<ISymbolSet> symbolSet = new SimpleObjectProperty<>();
    private final BooleanProperty unknown = new SimpleBooleanProperty();
    private final StringProperty category = new SimpleStringProperty();
    private final StringProperty graphicIdentifier = new SimpleStringProperty();

    public SectorTwoModifierAdapter() {
    }

    public SectorTwoModifierAdapter(ISectorTwoModifier modifier) {
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
    public String getCategory() {
        return category.get();
    }

    @Override
    public String getGraphicIdentifier() {
        return graphicIdentifier.get();
    }

    @Override
    public ISymbolSet getSymbolSet() {
        return symbolSet.get();
    }

    public StringProperty graphicIdentifierProperty() {
        return graphicIdentifier;
    }

    @Override
    public boolean isUnknown() {
        return unknown.get();
    }

    public ObjectProperty<ISymbolSet> symbolSetProperty() {
        return symbolSet;
    }

    @Override
    public String toString() {
        return getLabel();
    }

    public BooleanProperty unknownProperty() {
        return unknown;
    }

}
