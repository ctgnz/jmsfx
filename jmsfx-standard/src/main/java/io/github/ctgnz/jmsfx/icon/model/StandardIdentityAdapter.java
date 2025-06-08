package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStandardIdentityGroup;
import io.github.ctgnz.jmsfx.icon.Library;
import io.github.ctgnz.jmsfx.icon.StandardIdentity;

public class StandardIdentityAdapter implements IStandardIdentity {

    private final StandardIdentity model;

    public StandardIdentityAdapter(StandardIdentity identity) {
        this.model = identity;
    }

    @Override
    public IStandardIdentityGroup getGroup() {
        return model.getGroup();
    }

    @Override
    public String getId() {
        return model.getId();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    public StandardIdentity getModel() {
        return model;
    }

    public boolean isConfirmed() {
        return Library.getKnownIdentities().contains(model);
    }

    public boolean isHostile() {
        return Library.getHostileIdentities().contains(model);
    }

}
