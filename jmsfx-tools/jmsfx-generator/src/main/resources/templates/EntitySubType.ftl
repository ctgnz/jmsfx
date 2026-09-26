<#assign hasIconBounds = (iconBounds??) && (iconBounds?size gt 0)>package ${iconPackage}.${symbolSet.packageName};

<#if hasIconBounds>import javafx.geometry.Rectangle2D;

</#if>import ${basePackage}.EntitySubType;
import ${basePackage}.EntityType;
<#if hasIconBounds>import ${iconPackage}.IconBounds;
</#if>import ${typePackage}.GraphicType;

public enum ${symbolSet.baseTypeName}EntitySubType implements EntitySubType {
<#list symbolSet.entitySubTypes as subType>
        ${subType.id}("${subType.code}", "${subType.label}", ${symbolSet.baseTypeName}EntityType.${subType.entityTypeId}, GraphicType.${subType.graphicType})<#if subType.graphic??> {
            @Override
            public String getGraphicIdentifier() {
                return "${subType.graphic}";
            }
        }</#if><#sep>,
</#list>;

    private final String id;
    private final String label;
    private final ${symbolSet.baseTypeName}EntityType entityType;
    private final GraphicType graphicType;

    ${symbolSet.baseTypeName}EntitySubType(String id, String label, ${symbolSet.baseTypeName}EntityType entityType, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
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
    public EntityType getEntityType() {
        return entityType;
    }

}