package ${basePackage};

import java.util.Arrays;
import java.util.Objects;

public enum HqtfDummy implements SymbolIdentificationCodeElement {
<#list hqtfDummies as dummy>
    ${dummy.id}("${dummy.code}", "${dummy.label}"<#list dummy.dimensions>, <#items as dim>"${dim}"<#sep>, </#items></#list>)<#if dummy?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    private final String[] dimensionIds; 
    
    private HqtfDummy(String id, String label, String... dimensionIds) {
        this.id = id;
        this.label = label;
        this.dimensionIds = dimensionIds;
    }
    
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

    public boolean isSupported(SymbolSet symbolSet) {
        return Arrays.stream(dimensionIds).anyMatch(dim -> Objects.equals(dim, symbolSet.getDimension().name()));
    }

}