package io.github.ctgnz.jmsfx.icon.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.StandardIdentityGroup;
import io.github.ctgnz.jmsfx.icon.StandardIdentityEnum;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;

public class StandardIdentityImpl extends CodeElementImpl implements StandardIdentity {

    private final ObjectProperty<StandardIdentityGroup> group = new SimpleObjectProperty<>();
    private final BooleanProperty confirmed = new SimpleBooleanProperty();
    private final BooleanProperty hostile = new SimpleBooleanProperty();

    public StandardIdentityImpl() {
    }

    public StandardIdentityImpl(StandardIdentityEnum identity, StandardIdentityGroupImpl groupAdapter) {
        super(identity);
        this.group.set(groupAdapter);
        this.confirmed.set(identity.isConfirmed());
        this.hostile.set(identity.isHostile());
    }

    public BooleanProperty confirmedProperty() {
        return confirmed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StandardIdentityImpl rhs) {
            return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .isEquals();
        }
        return super.equals(obj);
    }

    @Override
    public StandardIdentityGroup getGroup() {
        return group.get();
    }

    @Override
    public String getGroupId() {
        return getGroup().getId();
    }

    public ObjectProperty<StandardIdentityGroup> groupProperty() {
        return group;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(1447, 7451).append(getId()).toHashCode();
    }

    public BooleanProperty hostileProperty() {
        return hostile;
    }

    @Override
    public boolean isConfirmed() {
        return confirmed.get();
    }

    @Override
    public boolean isHostile() {
        return hostile.get();
    }

}
