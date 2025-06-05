package ${iconPackage}.${symbolSet.packageName};

import ${basePackage}.ISectorOneModifier;
import ${iconPackage}.SymbolSet;

public enum ${symbolSet.baseTypeName}SectorOneModifier implements ISectorOneModifier {
<#list sectorOneMods as mod>
    ${mod.id}("${mod.code}", "${mod.label}", "${mod.category}", SymbolSet.${symbolSet.id})<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    ${symbolSet.baseTypeName}SectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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
<#if symbolSet.baseSymbolSet??>

    @Override
    public SymbolSet getBaseSymbolSet() {
        return SymbolSet.${symbolSet.baseSymbolSet};
    }
</#if>

}