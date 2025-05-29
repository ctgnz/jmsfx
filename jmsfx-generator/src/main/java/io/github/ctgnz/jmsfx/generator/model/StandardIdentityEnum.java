package io.github.ctgnz.jmsfx.generator.model;

import io.github.ctgnz.jmsfx.generator.schema.Library.StandardIdentities.StandardIdentity;

public class StandardIdentityEnum extends StandardEnum {

    public StandardIdentityEnum(StandardIdentity identity) {
        super(identity.getID(), identity.getLabel(), Integer.toString(identity.getStandardIdentityCode()), null);
    }

}
