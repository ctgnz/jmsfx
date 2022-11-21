package ${basePackage};

public enum StandardIdentity implements SymbolIdentificationCodeElement {
<#list identities as ident>
    ${ident.id}("${ident.code}", "${ident.label}")<#if ident?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    
    private StandardIdentity(String id, String label) {
        this.id = id;
        this.label = label;
    }
    
    public StandardIdentityGroup getGroup() {
        return StandardIdentityGroup.forId(this);
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