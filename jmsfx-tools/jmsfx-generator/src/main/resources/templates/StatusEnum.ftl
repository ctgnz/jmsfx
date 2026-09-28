package ${iconPackage};
<#assign hasBounds = statuses?filter(v -> v.bounds??)?size gt 0>
<#assign hasMarkup = statuses?filter(v -> v.graphicMarkupByKey??)?size gt 0>
<#assign hasGraphic = hasBounds || hasMarkup>

<#if hasBounds>import javafx.geometry.Rectangle2D;

</#if>import java.util.Arrays;
import java.util.List;

import ${basePackage}.Status;
<#if hasGraphic>import ${basePackage}.StandardIdentity;
import ${basePackage}.SymbolSet;
</#if>

public enum StatusEnum implements Status {
<#list statuses as status>
        ${status.id}("${status.code}", "${status.label}", <#if status?index gt 1>true<#else>false</#if><#list status.dimensions>, <#items as dim>"${dim}"<#sep>, </#items></#list>) <#if status.bounds?? || status.graphicMarkupByKey??>{
<#if status.bounds??>
            @Override
            public Rectangle2D getStatusBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getFrameId()) {
<#list status.bounds as key, rect>
                    case "${key}" -> new Rectangle2D(${rect.minX?c}, ${rect.minY?c}, ${rect.width?c}, ${rect.height?c});
</#list>
                    default -> Rectangle2D.EMPTY;
                };
            }
</#if>
<#if status.graphicMarkupByKey??>

            @Override
            public String getStatusMarkup(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getFrameId()) {
<#list status.graphicMarkupByKey as key, markup>
                    case "${key}" -> "${markup?j_string}";
</#list>
                    default -> null;
                };
            }
</#if>
        }</#if><#sep>,
</#list>;

    private final String id;
    private final String label;
    private final boolean operationalCondition;
    private final String[] dimensionIds;

    StatusEnum(String id, String label, boolean operationalCondition, String... dimensionIds) {
        this.id = id;
        this.label = label;
        this.operationalCondition = operationalCondition;
        this.dimensionIds = dimensionIds;
    }

    @Override
    public List<String> getDimensionIds() {
        return Arrays.asList(dimensionIds);
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
    public boolean isOperationalCondition() {
        return operationalCondition;
    }

    @Override
    public boolean isPlanned() {
        return this == PLANNED;
    }

    @Override
    public boolean isPresent() {
        return this == PRESENT;
    }

}