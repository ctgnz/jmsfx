package ${basePackage}.${symbolSet.packageName};

import ${basePackage}.EntitySubType;
import ${basePackage}.EntityType;
import ${basePackage}.IconType;

public enum ${symbolSet.baseTypeName}EntitySubType implements EntitySubType {
<#list entitySubTypes as subType>
    ${subType.id}("${subType.code}", "${subType.label}", ${symbolSet.baseTypeName}EntityType.${subType.entityTypeId}, IconType.${subType.iconType})<#if subType.graphic??> {
        @Override
        public String getGraphicIdentifier() {
            return "${subType.graphic}";
        }
    }</#if><#if subType?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    private final ${symbolSet.baseTypeName}EntityType entityType;
    private final IconType iconType;
    
    private ${symbolSet.baseTypeName}EntitySubType(String id, String label, ${symbolSet.baseTypeName}EntityType entityType, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
        this.iconType = iconType;
    }
    

    @Override
    public IconType getIconType() {
        return iconType;
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