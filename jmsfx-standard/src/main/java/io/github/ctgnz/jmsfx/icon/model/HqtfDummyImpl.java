package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;

import io.github.ctgnz.jmsfx.HqtfDummy;
import io.github.ctgnz.jmsfx.icon.HqtfDummyEnum;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HqtfDummyImpl extends CodeElementImpl implements HqtfDummy {

    private final BooleanProperty unknown = new SimpleBooleanProperty();
    private final ObservableList<String> dimensionIds = FXCollections.observableArrayList();

    public HqtfDummyImpl() {
    }

    public HqtfDummyImpl(HqtfDummyEnum hqtfDummy) {
        super(hqtfDummy);
        this.unknown.set(hqtfDummy == HqtfDummyEnum.NA);
        this.dimensionIds.setAll(hqtfDummy.getDimensionIds());
    }

    @Override
    public List<String> getDimensionIds() {
        return dimensionIds;
    }

    @Override
    public boolean isUnknown() {
        return unknown.get();
    }

    public BooleanProperty unknownProperty() {
        return unknown;
    }

}
