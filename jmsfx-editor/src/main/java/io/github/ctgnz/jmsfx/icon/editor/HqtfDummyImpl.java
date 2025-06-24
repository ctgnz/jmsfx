package io.github.ctgnz.jmsfx.icon.editor;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HqtfDummyImpl rhs) {
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
        return new HashCodeBuilder(8951, 1601).append(getId()).toHashCode();
    }

    @Override
    public boolean isUnknown() {
        return unknown.get();
    }

    public BooleanProperty unknownProperty() {
        return unknown;
    }

}
