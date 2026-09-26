<#assign hasIconBounds = (iconBounds??) && (iconBounds?size gt 0)>package ${iconPackage}.${symbolSet.packageName};

<#if symbolSet.entityTypePresent>
import java.util.List;

</#if><#if hasIconBounds>import javafx.geometry.Rectangle2D;

</#if>import ${basePackage}.Entity;
<#if symbolSet.entityTypePresent>
import ${basePackage}.EntityType;
</#if>
import ${basePackage}.SymbolSet;
<#if hasIconBounds>import ${iconPackage}.IconBounds;
</#if>import ${iconPackage}.SymbolSetEnum;
import ${typePackage}.GraphicType;

public enum ${symbolSet.baseTypeName}Entity implements Entity {
<#list symbolSet.entities as ent>
        ${ent.id}("${ent.code}", "${ent.label}", GraphicType.${ent.graphicType})<#if ent.baseSymbolSet??> {
            @Override
            public SymbolSet getBaseSymbolSet() {
                return SymbolSetEnum.${ent.baseSymbolSet};
            }
        }</#if><#sep>,
</#list>;

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    ${symbolSet.baseTypeName}Entity(String id, String label, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
    }

<#if hasIconBounds>
    @Override
    public Rectangle2D getIconBounds() {
        return IconBounds.lookup(getGraphicIdentifier(), getGraphicType());
    }

</#if>
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
<#if symbolSet.entityTypePresent>

    @Override
    public List<EntityType> getEntityTypes() {
        return ${symbolSet.baseTypeName}SymbolSet.INSTANCE.getEntityTypes(this);
    }
</#if>

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}