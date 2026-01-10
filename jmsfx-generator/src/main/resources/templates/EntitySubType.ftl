package ${iconPackage}.${symbolSet.packageName};

import ${basePackage}.EntitySubType;
import ${basePackage}.EntityType;
import ${typePackage}.GraphicType;

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