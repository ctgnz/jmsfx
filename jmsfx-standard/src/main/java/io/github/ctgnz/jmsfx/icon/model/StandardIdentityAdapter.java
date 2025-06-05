package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStandardIdentityGroup;
import io.github.ctgnz.jmsfx.icon.Library;
import io.github.ctgnz.jmsfx.icon.StandardIdentity;

public class StandardIdentityAdapter implements IStandardIdentity {

    private final StandardIdentity identity;

    public StandardIdentityAdapter(StandardIdentity identity) {
        this.identity = identity;
    }

    @Override
    public IStandardIdentityGroup getGroup() {
        return identity.getGroup();
    }

    @Override
    public String getId() {
        return identity.getId();
    }

    public StandardIdentity getIdentity() {
        return identity;
    }

    @Override
    public String getLabel() {
        return identity.getLabel();
    }

    public boolean isConfirmed() {
        return Library.getKnownIdentities().contains(identity);
    }

    public boolean isHostile() {
        return Library.getHostileIdentities().contains(identity);
    }

}
