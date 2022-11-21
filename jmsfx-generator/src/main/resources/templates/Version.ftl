package ${basePackage};

public enum Version implements SymbolIdentificationCodeElement {
<#list versions as version>
    ${version.id}("${version.code}", "${version.label}")<#if version?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    
    private Version(String id, String label) {
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