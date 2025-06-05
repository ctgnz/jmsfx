package ${iconPackage};

import java.util.Arrays;
import java.util.Objects;

import ${basePackage}.IHqtfDummy;
import ${basePackage}.ISymbolSet;

public enum HqtfDummy implements IHqtfDummy {
<#list hqtfDummies as dummy>
    ${dummy.id}("${dummy.code}", "${dummy.label}"<#list dummy.dimensions>, <#items as dim>"${dim}"<#sep>, </#items></#list>)<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final String[] dimensionIds;

    HqtfDummy(String id, String label, String... dimensionIds) {
        this.id = id;
        this.label = label;
        this.dimensionIds = dimensionIds;
    }

    @Override
    public String[] getDimensionIds() {
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
    public boolean isSupported(ISymbolSet symbolSet) {
        return Arrays.stream(dimensionIds).anyMatch(dim -> Objects.equals(dim, symbolSet.getDimension().getName()));
    }

}