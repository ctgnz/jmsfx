package ${iconPackage}.${symbolSet.packageName};

<#if entitySubTypes??>
import java.util.List;

</#if>
import ${basePackage}.Entity;
<#if entitySubTypes??>
import ${basePackage}.EntitySubType;
</#if>
import ${basePackage}.EntityType;
import ${typePackage}.GraphicType;

public enum ${symbolSet.baseTypeName}EntityType implements EntityType {
<#list entityTypes as entType>
    ${entType.id}("${entType.code}", "${entType.label}", ${symbolSet.baseTypeName}Entity.${entType.entityId}, GraphicType.${entType.graphicType})<#if entType.graphic??> {
        @Override
        public String getGraphicIdentifier() {
            return "${entType.graphic}";
        }
    }</#if><#sep>,
</#list>;

    private final String id;
    private final String label;
    private final ${symbolSet.baseTypeName}Entity entity;
    private final GraphicType graphicType;

    ${symbolSet.baseTypeName}EntityType(String id, String label, ${symbolSet.baseTypeName}Entity entity, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
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
    public Entity getEntity() {
        return entity;
    }
<#if entitySubTypes??>

    @Override
    public List<EntitySubType> getEntitySubTypes() {
        return ${symbolSet.baseTypeName}SymbolSet.INSTANCE.getEntitySubTypes(this);
    }
</#if>

}