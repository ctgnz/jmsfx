package ${basePackage};

public enum Amplifier  {
<#list amplifiers as val>
    ${val.code}("${val.id}", "${val.label}", "${val.description}")<#if val?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    private final String description;
    
    private Amplifier(String id, String label, String description) {
        this.id = id;
        this.label = label;
        this.description = description;
    }
    
    public String getId() {
        return id;
    }
    
    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

}