<#assign hasModBounds = (modifierBounds??) && (modifierBounds?size gt 0)>package ${iconPackage}.${symbolSet.packageName};

<#if hasModBounds>import javafx.geometry.Rectangle2D;

</#if>import ${basePackage}.SectorTwoModifier;
import ${basePackage}.SymbolSet;
import ${iconPackage}.SymbolSetEnum;
<#if hasModBounds>import ${iconPackage}.ModifierBounds;
</#if>
import ${typePackage}.ModifierCategory;

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

<#if hasModBounds>
    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
</#if>}