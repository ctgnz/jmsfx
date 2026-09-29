package ${iconPackage};
<#assign hasBounds = hqtfDummies?filter(v -> v.bounds??)?size gt 0>
<#assign hasMarkup = hqtfDummies?filter(v -> v.graphicMarkupByKey??)?size gt 0>
<#assign hasGraphic = hasBounds || hasMarkup>

<#if hasBounds>import javafx.geometry.Rectangle2D;

</#if>import java.util.Arrays;
import java.util.List;

import ${basePackage}.HqtfDummy;
<#if hasGraphic>import ${basePackage}.StandardIdentity;
import ${basePackage}.SymbolSet;
</#if>

public enum HqtfDummyEnum implements HqtfDummy {
<#list hqtfDummies as dummy>
        ${dummy.id}("${dummy.code}", "${dummy.label}"<#list dummy.dimensions>, <#items as dim>"${dim}"<#sep>, </#items></#list>) <#if dummy.bounds?? || dummy.graphicMarkupByKey??>{
<#if dummy.bounds??>
            @Override
            public Rectangle2D getHqtfDummyBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getDimensionId()) {
<#list dummy.bounds as key, rect>
                    case "${key}" -> new Rectangle2D(${rect.minX?c}, ${rect.minY?c}, ${rect.width?c}, ${rect.height?c});
</#list>
                    default -> Rectangle2D.EMPTY;
                };
            }
</#if>
<#if dummy.graphicMarkupByKey??>

            @Override
            public String getHqtfDummyMarkup(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getDimensionId()) {
<#list dummy.graphicMarkupByKey as key, markup>
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
    private final List<String> dimensionIds;

    HqtfDummyEnum(String id, String label, String... dimensionIds) {
        this.id = id;
        this.label = label;
        this.dimensionIds = Arrays.asList(dimensionIds);
    }

    @Override
    public List<String> getDimensionIds() {
        return dimensionIds;
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
    public String getName() {
        return name();
    }

    @Override
    public boolean isUnknown() {
        return this == NA;
    }

}