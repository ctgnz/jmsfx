package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStandardIdentityGroup;
import io.github.ctgnz.jmsfx.icon.StandardIdentityGroup;

public class StandardIdentityGroupAdapter implements IStandardIdentityGroup {

    private final StandardIdentityGroup model;

    public StandardIdentityGroupAdapter(StandardIdentityGroup identity) {
        this.model = identity;
    }

    @Override
    public String getGraphicSuffix() {
        return model.getGraphicSuffix();
    }

    public StandardIdentityGroup getGroup() {
        return model;
    }

    @Override
    public String getId() {
        return model.getId();
    }

    @Override
    public IStandardIdentity[] getIdentities() {
        return model.getIdentities();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    @Override
    public boolean owns(IStandardIdentity id) {
        return model.owns(id);
    }

}
