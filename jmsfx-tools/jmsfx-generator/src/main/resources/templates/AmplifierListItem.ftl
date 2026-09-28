package ${iconPackage}.amplifier;
<#assign hasBounds = amplifier.values?filter(v -> v.bounds??)?size gt 0>
<#assign hasMarkup = amplifier.values?filter(v -> v.graphicMarkupByKey??)?size gt 0>
<#assign hasIdentity = hasBounds || hasMarkup>
<#if amplifier.coded>

import java.util.Arrays;
import java.util.Map;
</#if><#if hasBounds>

import javafx.geometry.Rectangle2D;
</#if><#if amplifier.coded>

import com.google.common.collect.Maps;
</#if>

import ${basePackage}.AmplifierList;
import ${basePackage}.<#if amplifier.standard>StandardAmplifierItem<#elseif amplifier.country>CountryCode<#else>AmplifierListItem</#if>;<#if amplifier.extension>
import ${basePackage}.Extension;</#if><#if hasIdentity>
import ${basePackage}.StandardIdentity;</#if>
import ${iconPackage}.AmplifierListEnum;

public enum ${amplifier.typeName} implements <#if amplifier.standard>StandardAmplifierItem<#elseif amplifier.country>CountryCode<#else>AmplifierListItem</#if> {
<#list amplifier.values as val>
        <#if val.extension>@Extension </#if>${val.id}("${val.code}", "${val.label}"<#if val.remarks??>, "${val.remarks}"</#if><#if amplifier.frameAmplifier>, "${val.backgroundFill}"</#if>)<#if val.bounds?? || val.graphicMarkupByKey??> {
<#if val.bounds??>
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
<#list val.bounds as groupCode, rect>
                    case "${groupCode}" -> new Rectangle2D(${rect.minX?c}, ${rect.minY?c}, ${rect.width?c}, ${rect.height?c});
</#list>
                    default -> Rectangle2D.EMPTY;
                };
            }
</#if>
<#if val.graphicMarkupByKey??>

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
<#list val.graphicMarkupByKey as groupCode, markup>
                    case "${groupCode}" -> "${markup?j_string}";
</#list>
                    default -> null;
                };
            }
</#if>
        }</#if><#sep>,
</#list>;<#if amplifier.coded>

    private static final Map<String, ${amplifier.typeName}> CODES = Maps.uniqueIndex(Arrays.asList(values()), ${amplifier.typeName}::getId);

    public static ${amplifier.typeName} valueOfCode(String code) {
        return CODES.get(code);
    }</#if>

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

    /** A frame amplifier recolours the frame rather than drawing, and a list with no graphic location has no drawings to reach. */
    @Override
    public boolean isGraphicalIcon() {
        return ${(!amplifier.frameAmplifier && amplifier.graphicLocation != "NA")?string("true", "false")};
    }
<#if amplifier.unknown>

    @Override
    public boolean isUnknown() {
        return true;
    }
</#if>

}