package io.github.ctgnz.jmsfx.generator.model;

import io.github.ctgnz.jmsfx.generator.schema.Library.StandardIdentityGroups.StandardIdentityGroup;

public class StandardIdentityGroupEnum extends StandardEnum {

    private final String graphicSuffix;

    public StandardIdentityGroupEnum(StandardIdentityGroup identityGroup) {
        super(identityGroup.getID(), identityGroup.getLabel(), Integer.toString(identityGroup.getStandardIdentityGroupCode()), null);
        this.graphicSuffix = identityGroup.getGraphicSuffix();
    }

    public String getGraphicSuffix() {
        return graphicSuffix;
    }

}
