package ${iconPackage};
<#assign hasBounds = hqtfDummies?filter(v -> v.bounds??)?size gt 0>

<#if hasBounds>import javafx.geometry.Rectangle2D;

</#if>import java.util.Arrays;
import java.util.List;

import ${basePackage}.HqtfDummy;
<#if hasBounds>import ${basePackage}.StandardIdentity;
</#if><#if hasBounds>import ${basePackage}.SymbolSet;
</#if>

public enum HqtfDummyEnum implements HqtfDummy {
<#list hqtfDummies as dummy>
        ${dummy.id}("${dummy.code}", "${dummy.label}"<#list dummy.dimensions>, <#items as dim>"${dim}"<#sep>, </#items></#list>) <#if dummy.bounds??>{
            @Override
            public Rectangle2D getHqtfDummyBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getDimensionId()) {
<#list dummy.bounds as key, rect>
                    case "${key}" -> new Rectangle2D(${rect[0]?c}, ${rect[1]?c}, ${rect[2]?c}, ${rect[3]?c});
</#list>
                    default -> Rectangle2D.EMPTY;
                };
            }
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
    public boolean isUnknown() {
        return this == NA;
    }

}