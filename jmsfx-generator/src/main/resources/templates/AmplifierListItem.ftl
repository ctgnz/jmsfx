package ${iconPackage}.amplifier;

import ${basePackage}.AmplifierList;
import ${basePackage}.<#if amplifier.standard>StandardAmplifierItem<#elseif amplifier.country>CountryCode<#else>AmplifierListItem</#if>;<#if amplifier.extension>
import ${basePackage}.Extension;</#if>
import ${iconPackage}.AmplifierListEnum;

public enum ${amplifier.typeName} implements <#if amplifier.standard>StandardAmplifierItem<#elseif amplifier.country>CountryCode<#else>AmplifierListItem</#if> {
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
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.${amplifier.enumId};
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

    @Override
    public String getName() {
        return name();
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