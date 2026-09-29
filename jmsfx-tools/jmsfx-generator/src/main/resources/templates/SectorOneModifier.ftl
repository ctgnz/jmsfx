<#import "fragment-markup.ftl" as frag><#assign hasModBounds = symbolSet.sectorOneMods?filter(v -> v.measuredBounds??)?size gt 0>package ${iconPackage}.${symbolSet.packageName};

<#if hasModBounds>import javafx.geometry.Rectangle2D;

</#if>import ${basePackage}.SectorOneModifier;
import ${basePackage}.SymbolSet;
import ${iconPackage}.SymbolSetEnum;
import ${typePackage}.ModifierCategory;

public enum ${symbolSet.baseTypeName}SectorOneModifier implements SectorOneModifier {
<#list symbolSet.sectorOneMods as mod>
        ${mod.id}("${mod.code}", "${mod.label}", ModifierCategory.${mod.category})<#if mod.graphicMarkup?? || mod.measuredBounds??> {<@frag.modifier mod/><@frag.bounds mod "getModifierBounds"/>        }</#if><#sep>,
</#list>;

    private final String id;
    private final String label;
    private final ModifierCategory category;

    ${symbolSet.baseTypeName}SectorOneModifier(String id, String label, ModifierCategory category) {
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
    public String getName() {
        return name();
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