package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.StandardIdentity;
import io.github.ctgnz.jmsfx.icon.StandardIdentityGroup;
import io.github.ctgnz.jmsfx.icon.SymbolIdentificationCode;
import io.github.ctgnz.jmsfx.icon.SymbolIdentificationCodeElement;

public class StandardIdentityDto implements SymbolIdentificationCodeElement {

    private final StandardIdentity identity;

    public StandardIdentityDto(StandardIdentity identity) {
        this.identity = identity;
    }

    public StandardIdentityGroup getGroup() {
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
        return SymbolIdentificationCode.KNOWN_IDENTITIES.contains(identity);
    }

    public boolean isHostile() {
        return SymbolIdentificationCode.HOSTILE_IDENTITIES.contains(identity);
    }

}
