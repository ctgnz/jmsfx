package ${basePackage}.amplifier;

import ${basePackage}.<#if amplifier.standard>StandardAmplifier<#else>ListAmplifier</#if>;
import ${basePackage}.ListAmplifierType;
import ${basePackage}.Extension;

public enum ${amplifier.typeName} implements <#if amplifier.standard>StandardAmplifier<#else>ListAmplifier</#if> {
<#list amplifier.values as val>
    <#if val.extension>@Extension </#if>${val.id}("${val.code}", "${val.label}"<#if val.remarks??>, "${val.remarks}"</#if><#if amplifier.frameAmplifier>, "${val.backgroundFill}"</#if>)<#if val?is_last>;<#else>,</#if>
</#list>

    private static final ListAmplifierType TYPE = ListAmplifierType.${amplifier.enumId};

    private final String id;
    private final String label;<#if amplifier.coded>
    private final String code;</#if><#if amplifier.frameAmplifier>
    private final String backgroundFill;</#if>
    
    private ${amplifier.typeName}(String id, String label<#if amplifier.coded>, String code</#if><#if amplifier.frameAmplifier>, String backgroundFill</#if>) {
        this.id = id;
        this.label = label;<#if amplifier.coded>
        this.code = code;</#if><#if amplifier.frameAmplifier>
        this.backgroundFill = backgroundFill;</#if>
    }
    
    @Override
    public String getGraphicLocation() {
        return "${amplifier.graphicLocation}";
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
    public ListAmplifierType getType() {
        return TYPE;
    }
<#if amplifier.coded>

    public String getCode() {
        return code;
    }
</#if>
<#if amplifier.frameAmplifier>

    @Override
    public String getBackgroundFill() {
        return backgroundFill;
    }
</#if>
    
    public boolean isDeprecated() {
        try {
            return ${amplifier.typeName}.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return ${amplifier.typeName}.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return ${amplifier.frameAmplifier?string("false", "true")};
    }
<#if amplifier.unknown>

    @Override
    public boolean isUnknown() {
        return true;
    }
</#if>    

}