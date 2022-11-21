package ${basePackage}.${symbolSet.packageName};

import ${basePackage}.SymbolSet;
import ${basePackage}.SectorOneModifier;

public enum ${symbolSet.baseTypeName}SectorOneModifier implements SectorOneModifier {
<#list sectorOneMods as mod>
    ${mod.id}("${mod.code}", "${mod.label}", SymbolSet.${symbolSet.id})<#if mod?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private ${symbolSet.baseTypeName}SectorOneModifier(String id, String label, SymbolSet symbolSet) {
        this.id = id;
        this.label = label;
        this.symbolSet = symbolSet;
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