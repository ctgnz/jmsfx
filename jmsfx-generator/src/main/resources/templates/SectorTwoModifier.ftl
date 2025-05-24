package ${basePackage}.${symbolSet.packageName};

import ${basePackage}.SymbolSet;
import ${basePackage}.SectorTwoModifier;

public enum ${symbolSet.baseTypeName}SectorTwoModifier implements SectorTwoModifier {
<#list sectorTwoMods as mod>
    ${mod.id}("${mod.code}", "${mod.label}", "${mod.category}", SymbolSet.${symbolSet.id})<#if mod?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private ${symbolSet.baseTypeName}SectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
    }
    
    @Override
    public String getCategory() {
        return category;
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
    public SymbolSet getSymbolSet() {
        return symbolSet;
    }
    
}