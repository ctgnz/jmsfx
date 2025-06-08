package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStandardIdentityGroup;
import io.github.ctgnz.jmsfx.icon.StandardIdentity;
import io.github.ctgnz.jmsfx.icon.StandardIdentityGroup;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StandardIdentityGroupAdapter extends CodeElementAdapter implements IStandardIdentityGroup {

    private final StringProperty graphicSuffix = new SimpleStringProperty();
    private final ObservableList<IStandardIdentity> identities = FXCollections.observableArrayList();

    public StandardIdentityGroupAdapter() {
    }

    public StandardIdentityGroupAdapter(StandardIdentityGroup identityGroup) {
        super(identityGroup);
        this.graphicSuffix.set(identityGroup.getGraphicSuffix());
        this.identities.setAll(identityGroup.getIdentities().stream().map(StandardIdentity.class::cast).map(this::createIdentityAdapter).toList());
    }

    @Override
    public String getGraphicSuffix() {
        return graphicSuffix.get();
    }

    @Override
    public List<IStandardIdentity> getIdentities() {
        return identities;
    }

    public StringProperty graphicSuffixProperty() {
        return graphicSuffix;
    }

    @Override
    public boolean owns(IStandardIdentity id) {
        return StringUtils.equals(id.getGroupId(), getId());
    }

    @Override
    public String toString() {
        return getLabel();
    }

    protected StandardIdentityAdapter createIdentityAdapter(StandardIdentity id) {
        return new StandardIdentityAdapter(id, this);
    }

    protected Stream<IStandardIdentity> streamIdentities() {
        return identities.stream();
    }

}
