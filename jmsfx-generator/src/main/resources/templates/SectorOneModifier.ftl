package ${iconPackage}.${symbolSet.packageName};

import ${basePackage}.SectorOneModifier;
import ${basePackage}.SymbolSet;
import ${typePackage}.ModifierCategory;
import ${iconPackage}.SymbolSetEnum;

public enum ${symbolSet.baseTypeName}SectorOneModifier implements SectorOneModifier {
<#list symbolSet.sectorOneMods as mod>
    ${mod.id}("${mod.code}", "${mod.label}", ModifierCategory.${mod.category}, SymbolSetEnum.${symbolSet.id})<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    ${symbolSet.baseTypeName}SectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
    }

    @Override
    public ModifierCategory getCategory() {
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
        return SymbolSetEnum.${symbolSet.baseSymbolSet};
    }
</#if>

}