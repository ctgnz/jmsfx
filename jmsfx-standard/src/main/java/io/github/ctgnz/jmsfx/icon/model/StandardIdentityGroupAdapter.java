package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.StandardIdentityGroup;
import io.github.ctgnz.jmsfx.icon.StandardIdentityEnum;
import io.github.ctgnz.jmsfx.icon.StandardIdentityGroupEnum;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StandardIdentityGroupAdapter extends CodeElementImpl implements StandardIdentityGroup {

    private final StringProperty graphicSuffix = new SimpleStringProperty();
    private final ObservableList<StandardIdentity> identities = FXCollections.observableArrayList();

    public StandardIdentityGroupAdapter() {
    }

    public StandardIdentityGroupAdapter(StandardIdentityGroupEnum identityGroup) {
        super(identityGroup);
        this.graphicSuffix.set(identityGroup.getGraphicSuffix());
        this.identities.setAll(identityGroup.getIdentities().stream().map(StandardIdentityEnum.class::cast).map(this::createIdentityAdapter).toList());
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
    public boolean owns(StandardIdentity id) {
        return StringUtils.equals(id.getGroupId(), getId());
    }

    protected StandardIdentityImpl createIdentityAdapter(StandardIdentityEnum id) {
        return new StandardIdentityImpl(id, this);
    }

    protected Stream<StandardIdentity> streamIdentities() {
        return identities.stream();
    }

}
