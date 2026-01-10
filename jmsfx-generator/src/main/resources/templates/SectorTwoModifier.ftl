package ${iconPackage}.${symbolSet.packageName};

import ${basePackage}.SectorTwoModifier;
import ${basePackage}.SymbolSet;
import ${typePackage}.ModifierCategory;
import ${iconPackage}.SymbolSetEnum;

public enum ${symbolSet.baseTypeName}SectorTwoModifier implements SectorTwoModifier {
<#list symbolSet.sectorTwoMods as mod>
    ${mod.id}("${mod.code}", "${mod.label}", ModifierCategory.${mod.category})<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final ModifierCategory category;

    ${symbolSet.baseTypeName}SectorTwoModifier(String id, String label, ModifierCategory category) {
        this.id = id;
        this.label = label;
        this.category = category;
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
        return SymbolSetEnum.${symbolSet.id};
    }
<#if symbolSet.baseSymbolSet??>

    @Override
    public SymbolSet getBaseSymbolSet() {
        return SymbolSetEnum.${symbolSet.baseSymbolSet};
    }
</#if>

}