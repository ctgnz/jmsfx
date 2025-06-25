package io.github.ctgnz.jmsfx.icon.editor;

import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.StandardIdentityGroup;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StandardIdentityGroupImpl extends CodeElementImpl implements StandardIdentityGroup {

    private final StringProperty graphicSuffix = new SimpleStringProperty();
    private final ObservableList<StandardIdentity> identities = FXCollections.observableArrayList();

    public StandardIdentityGroupImpl() {
    }

    public StandardIdentityGroupImpl(StandardIdentityGroup identityGroup) {
        super(identityGroup);
        this.graphicSuffix.set(identityGroup.getGraphicSuffix());
        this.identities.setAll(identityGroup.getIdentities().stream().map(this::createIdentityAdapter).toList());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StandardIdentityGroupImpl rhs) {
            return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .isEquals();
        }
        return super.equals(obj);
    }

    @Override
    public String getGraphicSuffix() {
        return graphicSuffix.get();
    }

    @Override
    public List<StandardIdentity> getIdentities() {
        return identities;
    }

    public StringProperty graphicSuffixProperty() {
        return graphicSuffix;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(3163, 3617).append(getId()).toHashCode();
    }

    @Override
    public boolean owns(StandardIdentity id) {
        return StringUtils.equals(id.getGroupId(), getId());
    }

    protected StandardIdentityImpl createIdentityAdapter(StandardIdentity id) {
        return new StandardIdentityImpl(id, this);
    }

    protected Stream<StandardIdentity> streamIdentities() {
        return identities.stream();
    }

}
