package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;

import io.github.ctgnz.jmsfx.IStatus;
import io.github.ctgnz.jmsfx.icon.Status;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StatusAdapter extends CodeElementAdapter implements IStatus {

    private final BooleanProperty operationalCondition = new SimpleBooleanProperty();
    private final BooleanProperty present = new SimpleBooleanProperty();
    private final ObservableList<String> dimensionIds = FXCollections.observableArrayList();

    public StatusAdapter() {
    }

    public StatusAdapter(Status status) {
        super(status);
        this.operationalCondition.set(status.isOperationalCondition());
        this.present.set(status.isPresent());
        this.dimensionIds.setAll(status.getDimensionIds());
    }

    @Override
    public List<String> getDimensionIds() {
        return dimensionIds;
    }

    @Override
    public boolean isOperationalCondition() {
        return operationalCondition.get();
    }

    @Override
    public boolean isPresent() {
        return present.get();
    }

    public BooleanProperty operationalConditionProperty() {
        return operationalCondition;
    }

    public BooleanProperty presentProperty() {
        return present;
    }

}
