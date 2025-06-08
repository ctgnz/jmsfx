package ${iconPackage}.amplifier;

import ${basePackage}.IAmplifierList;
import ${basePackage}.<#if amplifier.standard>IStandardAmplifierItem<#else>IAmplifierListItem</#if>;
import ${iconPackage}.AmplifierList;
import ${iconPackage}.Extension;

public enum ${amplifier.typeName} implements <#if amplifier.standard>IStandardAmplifierItem<#else>IAmplifierListItem</#if> {
<#list amplifier.values as val>
    <#if val.extension>@Extension </#if>${val.id}("${val.code}", "${val.label}"<#if val.remarks??>, "${val.remarks}"</#if><#if amplifier.frameAmplifier>, "${val.backgroundFill}"</#if>)<#sep>,
</#list>;

    private final String id;
    private final String label;<#if amplifier.coded>
    private final String code;</#if><#if amplifier.frameAmplifier>
    private final String backgroundFill;</#if>

    ${amplifier.typeName}(String id, String label<#if amplifier.coded>, String code</#if><#if amplifier.frameAmplifier>, String backgroundFill</#if>) {
        this.id = id;
        this.label = label;<#if amplifier.coded>
        this.code = code;</#if><#if amplifier.frameAmplifier>
        this.backgroundFill = backgroundFill;</#if>
    }

    @Override
    public IAmplifierList getAmplifierList() {
        return AmplifierList.${amplifier.enumId};
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