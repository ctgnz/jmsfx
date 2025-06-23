package ${iconPackage};

import ${basePackage}.StandardIdentity;
import ${basePackage}.StandardIdentityGroup;
import java.util.EnumSet;

public enum StandardIdentityEnum implements StandardIdentity {
<#list identities as ident>
    ${ident.id}("${ident.code}", StandardIdentityGroupEnum.${ident.groupID}, "${ident.label}")<#sep>,
</#list>;

    private static final EnumSet<StandardIdentityEnum> KNOWN_IDENTITIES = EnumSet.of(<#list identities as ident><#if !ident.confirmed><#continue></#if>${ident.id}<#sep>, </#list>);
    private static final EnumSet<StandardIdentityEnum> HOSTILE_IDENTITIES = EnumSet.of(<#list identities as ident><#if !ident.hostile><#continue></#if>${ident.id}<#sep>, </#list>);

    private final String id;
    private final StandardIdentityGroup group;
    private final String label;

    StandardIdentityEnum(String id, StandardIdentityGroup group, String label) {
        this.id = id;
        this.group = group;
        this.label = label;
    }

    @Override
    public StandardIdentityGroup getGroup() {
        return group;
    }

    @Override
    public String getGroupId() {
        return group.getId();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public boolean isConfirmed() {
        return KNOWN_IDENTITIES.contains(this);
    }

    @Override
    public boolean isHostile() {
        return HOSTILE_IDENTITIES.contains(this);
    }

}