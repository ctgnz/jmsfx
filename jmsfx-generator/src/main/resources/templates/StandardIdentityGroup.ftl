package ${basePackage};

import java.util.Arrays;

public enum StandardIdentityGroup implements SymbolIdentificationCodeElement {
<#list identityGroups as ident>
    ${ident.id}("${ident.code}", "${ident.label}"<#list ident.standardIdCodes as idCode>, StandardIdentity.${idCode}</#list>)<#if ident?is_last>;<#else>,</#if>
</#list>    

    public static StandardIdentityGroup forId(StandardIdentity id) {
        return Arrays.stream(StandardIdentityGroup.values()).filter(grp -> grp.owns(id)).findFirst().orElse(null);
    }

    private final String id;
    private final String label;
    private final StandardIdentity[] identities;
    
    private StandardIdentityGroup(String id, String label, StandardIdentity... identities) {
        this.id = id;
        this.label = label;
        this.identities = identities;
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    public StandardIdentity[] getIdentities() {
        return identities;
    }
    
    @Override
    public String getLabel() {
        return label;
    }
    
    public boolean owns(StandardIdentity id) {
        return Arrays.stream(identities).anyMatch(ident -> ident == id);
    }
    
}