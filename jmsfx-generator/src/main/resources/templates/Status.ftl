package ${basePackage};

public enum Status implements SymbolIdentificationCodeElement {
<#list statuses as status>
    ${status.id}("${status.code}", "${status.label}")<#if status?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    
    private Status(String id, String label) {
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