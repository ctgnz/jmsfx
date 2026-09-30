package io.github.ctgnz.jmsfx.icon.editor;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.StandardIdentityGroup;

public class StandardIdentityGroupImpl extends CodeElementImpl implements StandardIdentityGroup {

    private final ObservableList<StandardIdentity> identities = FXCollections.observableArrayList();

    public StandardIdentityGroupImpl() {
    }

    @SuppressWarnings("this-escape")
    public StandardIdentityGroupImpl(StandardIdentityGroup identityGroup) {
        super(identityGroup);
        this.identities.setAll(identityGroup.getIdentities().stream().map(this::createIdentityAdapter).toList());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StandardIdentityGroupImpl rhs) {
            return new EqualsBuilder().append(getId(), rhs.getId()).isEquals();
        }
        return super.equals(obj);
    }

    @Override
    public List<StandardIdentity> getIdentities() {
        return identities;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(3163, 3617).append(getId()).toHashCode();
    }

    @Override
    public boolean owns(StandardIdentity id) {
        return Objects.equals(id.getGroupId(), getId());
    }

    protected StandardIdentityImpl createIdentityAdapter(StandardIdentity id) {
        return new StandardIdentityImpl(id, this);
    }

    protected Stream<StandardIdentity> streamIdentities() {
        return identities.stream();
    }

}
