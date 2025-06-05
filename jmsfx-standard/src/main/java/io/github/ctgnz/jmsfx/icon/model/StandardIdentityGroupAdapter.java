package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStandardIdentityGroup;
import io.github.ctgnz.jmsfx.icon.StandardIdentityGroup;

public class StandardIdentityGroupAdapter implements IStandardIdentityGroup {

    private final StandardIdentityGroup identity;

    public StandardIdentityGroupAdapter(StandardIdentityGroup identity) {
        this.identity = identity;
    }

    public StandardIdentityGroup getGroup() {
        return identity;
    }

    @Override
    public String getId() {
        return identity.getId();
    }

    @Override
    public String getLabel() {
        return identity.getLabel();
    }

    @Override
    public IStandardIdentity[] getIdentities() {
        return identity.getIdentities();
    }

    @Override
    public String getGraphicSuffix() {
        return identity.getGraphicSuffix();
    }

    @Override
    public boolean owns(IStandardIdentity id) {
        return identity.owns(id);
    }

}
