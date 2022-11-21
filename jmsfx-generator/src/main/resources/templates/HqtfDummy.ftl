package ${basePackage};

public enum HqtfDummy implements SymbolIdentificationCodeElement {
<#list hqtfDummies as dummy>
    ${dummy.id}("${dummy.code}", "${dummy.label}")<#if dummy?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    
    private HqtfDummy(String id, String label) {
        this.id = id;
        this.label = label;
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