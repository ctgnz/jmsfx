package io.github.ctgnz.jmsfx.icon.editor;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.github.ctgnz.jmsfx.Status;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StatusImpl extends CodeElementImpl implements Status {

    private final BooleanProperty operationalCondition = new SimpleBooleanProperty();
    private final BooleanProperty present = new SimpleBooleanProperty();
    private final BooleanProperty planned = new SimpleBooleanProperty();
    private final ObservableList<String> dimensionIds = FXCollections.observableArrayList();

    public StatusImpl() {
    }

    public StatusImpl(Status status) {
        super(status);
        this.operationalCondition.set(status.isOperationalCondition());
        this.present.set(status.isPresent());
        this.planned.set(status.isPlanned());
        this.dimensionIds.setAll(status.getDimensionIds());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StatusImpl rhs) {
            return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .isEquals();
        }
        return super.equals(obj);
    }

    @Override
    public List<String> getDimensionIds() {
        return dimensionIds;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(3329, 9239).append(getId()).toHashCode();
    }

    @Override
    public boolean isOperationalCondition() {
        return operationalCondition.get();
    }

    @Override
    public boolean isPlanned() {
        return planned.get();
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
