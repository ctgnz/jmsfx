package io.github.ctgnz.jmsfx.generator.model;

import io.github.ctgnz.jmsfx.generator.schema.Library.StandardIdentities.StandardIdentity;

public class StandardIdentityEnum extends StandardEnum {

    private final String groupID;

    public StandardIdentityEnum(StandardIdentity identity) {
        super(identity.getID(), identity.getLabel(), Integer.toString(identity.getStandardIdentityCode()), null);
        this.groupID = identity.getGroupID();
    }

    public String getGroupID() {
        return groupID;
    }

}
