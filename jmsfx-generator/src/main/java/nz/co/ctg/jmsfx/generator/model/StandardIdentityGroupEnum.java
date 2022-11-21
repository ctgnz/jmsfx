package nz.co.ctg.jmsfx.generator.model;

import static java.util.stream.Collectors.toList;

import java.util.List;

import nz.co.ctg.jmsfx.generator.schema.Library.StandardIdentities.StandardIdentity;
import nz.co.ctg.jmsfx.generator.schema.Library.StandardIdentityGroups.StandardIdentityGroup;

public class StandardIdentityGroupEnum extends StandardEnum {

    private final List<String> standardIdCodes;

    public StandardIdentityGroupEnum(StandardIdentityGroup identityGroup) {
        super(identityGroup.getID(), identityGroup.getLabel(), Integer.toString(identityGroup.getStandardIdentityGroupCode()));
        standardIdCodes = identityGroup.getStandardIdentityIDs().stream().map(StandardIdentity.class::cast).map(StandardIdentity::getID).collect(toList());
    }

    public List<String> getStandardIdCodes() {
        return standardIdCodes;
    }

}
