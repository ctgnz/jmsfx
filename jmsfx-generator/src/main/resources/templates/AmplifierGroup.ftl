package ${basePackage};

public enum ${amplifier.typeName} implements <#if amplifier.frameAmplifier>Frame</#if>AmplifierGroup {
<#list amplifier.values as val>
    ${val.id}("${val.code}", "${val.label}"<#if amplifier.frameAmplifier>, "${val.backgroundFill}"</#if>)<#if val?is_last>;<#else>,</#if>
</#list>    
    private static final AmplifierGroupType TYPE = AmplifierGroupType.${amplifier.enumId};

    private final String id;
    private final String label;<#if amplifier.frameAmplifier>
    private final String backgroundFill;</#if>
    
    private ${amplifier.typeName}(String id, String label<#if amplifier.frameAmplifier>, String backgroundFill</#if>) {
        this.id = id;
        this.label = label;<#if amplifier.frameAmplifier>
        this.backgroundFill = backgroundFill;</#if>
    }
    
    @Override
    public String getGraphicLocation() {
        return "${amplifier.graphicLocation}";
    }
    
    @Override
    public String getFullId() {
        return String.format("%s%s", TYPE.getId(), id);
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public String getLabel() {
        return label;
    }
<#if amplifier.frameAmplifier>

    @Override
    public String getBackgroundFill() {
        return backgroundFill;
    }
</#if>    
<#if amplifier.unknown>

    @Override
    public boolean isUnknown() {
        return true;
    }
</#if>    

}