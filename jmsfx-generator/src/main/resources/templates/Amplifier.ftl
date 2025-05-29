package ${basePackage};

public enum Amplifier  {
<#list amplifiers as val>
<#if val.max gt 0>
    <#if val.extension>@Extension </#if><#if val.deprecated>@Deprecated </#if>${val.constantName}("${val.id}", "${val.label}", AmplifierType.${val.type}, ${val.min}, ${val.max}, "${val.description}")<#if val?is_last>;<#else>,</#if>
<#else>
    <#if val.extension>@Extension </#if><#if val.deprecated>@Deprecated </#if>${val.constantName}("${val.id}", "${val.label}", AmplifierType.${val.type}, "${val.description}")<#if val?is_last>;<#else>,</#if>
</#if>    
</#list>    

    private final String id;
    private final String label;
    private final AmplifierType type;
    private final String description;
    private final int min;
    private final int max;
    
    Amplifier(String id, String label, AmplifierType type, String description) {
        this(id, label, type, 0, 0, description);
    }

    Amplifier(String id, String label, AmplifierType type, int min, int max, String description) {
        this.id = id;
        this.label = label;
        this.type = type;
        this.min = min;
        this.max = max;
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }
    
    public String getLabel() {
        return label;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public AmplifierType getType() {
        return type;
    }

}