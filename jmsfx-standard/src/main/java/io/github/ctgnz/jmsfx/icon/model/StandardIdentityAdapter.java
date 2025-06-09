package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStandardIdentityGroup;
import io.github.ctgnz.jmsfx.icon.StandardIdentity;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;

public class StandardIdentityAdapter extends CodeElementAdapter implements IStandardIdentity {

    private final ObjectProperty<IStandardIdentityGroup> group = new SimpleObjectProperty<>();
    private final BooleanProperty confirmed = new SimpleBooleanProperty();
    private final BooleanProperty hostile = new SimpleBooleanProperty();

    public StandardIdentityAdapter() {
    }

    public StandardIdentityAdapter(StandardIdentity identity, StandardIdentityGroupAdapter groupAdapter) {
        super(identity);
        this.group.set(groupAdapter);
        this.confirmed.set(identity.isConfirmed());
        this.hostile.set(identity.isHostile());
    }

    public BooleanProperty confirmedProperty() {
        return confirmed;
    }

    @Override
    public IStandardIdentityGroup getGroup() {
        return group.get();
    }

    @Override
    public String getGroupId() {
        return getGroup().getId();
    }

    public ObjectProperty<IStandardIdentityGroup> groupProperty() {
        return group;
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
