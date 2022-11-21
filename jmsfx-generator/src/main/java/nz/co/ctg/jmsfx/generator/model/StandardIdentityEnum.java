package nz.co.ctg.jmsfx.generator.model;

import nz.co.ctg.jmsfx.generator.schema.Library.StandardIdentities.StandardIdentity;

public class StandardIdentityEnum extends StandardEnum {

    public StandardIdentityEnum(StandardIdentity identity) {
        super(identity.getID(), identity.getLabel(), Integer.toString(identity.getStandardIdentityCode()));
    }

}
