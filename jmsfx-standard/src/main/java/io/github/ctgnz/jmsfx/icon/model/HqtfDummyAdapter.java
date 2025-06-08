package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;
import java.util.Objects;

import io.github.ctgnz.jmsfx.IHqtfDummy;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.icon.HqtfDummy;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HqtfDummyAdapter extends CodeElementAdapter implements IHqtfDummy {

    private final BooleanProperty unknown = new SimpleBooleanProperty();
    private final ObservableList<String> dimensionIds = FXCollections.observableArrayList();

    public HqtfDummyAdapter() {
    }

    public HqtfDummyAdapter(HqtfDummy hqtfDummy) {
        super(hqtfDummy);
        this.unknown.set(hqtfDummy == HqtfDummy.NA);
        this.dimensionIds.setAll(hqtfDummy.getDimensionIds());
    }

    @Override
    public List<String> getDimensionIds() {
        return dimensionIds;
    }

    @Override
    public boolean isSupported(ISymbolSet symbolSet) {
        return dimensionIds.stream().anyMatch(dim -> Objects.equals(dim, symbolSet.getDimension().getName()));
    }

    @Override
    public boolean isUnknown() {
        return unknown.get();
    }

    @Override
    public String toString() {
        return getLabel();
    }

    public BooleanProperty unknownProperty() {
        return unknown;
    }

}
