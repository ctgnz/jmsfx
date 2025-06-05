package ${iconPackage}.${symbolSet.packageName};

import ${basePackage}.IEntitySubType;
import ${basePackage}.IEntityType;
import ${iconPackage}.GraphicType;

public enum ${symbolSet.baseTypeName}EntitySubType implements IEntitySubType {
<#list entitySubTypes as subType>
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

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public IEntityType getEntityType() {
        return entityType;
    }

}