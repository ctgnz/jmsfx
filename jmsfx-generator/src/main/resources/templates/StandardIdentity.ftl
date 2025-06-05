package ${iconPackage};

import ${basePackage}.IStandardIdentity;
import ${basePackage}.IStandardIdentityGroup;

public enum StandardIdentity implements IStandardIdentity {
<#list identities as ident>
    ${ident.id}("${ident.code}", StandardIdentityGroup.${ident.groupID}, "${ident.label}")<#sep>,
</#list>;

    private final String id;
    private final IStandardIdentityGroup group;
    private final String label;

    StandardIdentity(String id, IStandardIdentityGroup group, String label) {
        this.id = id;
        this.group = group;
        this.label = label;
    }

    @Override
    public IStandardIdentityGroup getGroup() {
        return group;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

}