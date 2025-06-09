package ${iconPackage};

import java.util.Arrays;
import java.util.List;

import ${basePackage}.IHqtfDummy;

public enum HqtfDummy implements IHqtfDummy {
<#list hqtfDummies as dummy>
    ${dummy.id}("${dummy.code}", "${dummy.label}"<#list dummy.dimensions>, <#items as dim>"${dim}"<#sep>, </#items></#list>)<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final List<String> dimensionIds;

    HqtfDummy(String id, String label, String... dimensionIds) {
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