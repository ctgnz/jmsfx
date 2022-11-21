package ${basePackage};

public enum Context implements SymbolIdentificationCodeElement {
<#list contexts as ctx>
    ${ctx.id}("${ctx.code}", "${ctx.label}")<#if ctx?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    
    private Context(String id, String label) {
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