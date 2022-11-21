package ${basePackage}.${symbolSet.packageName};

<#if entitySubTypes??>        
import java.util.List;

</#if>
import ${basePackage}.Entity;
import ${basePackage}.EntityType;
<#if entitySubTypes??>        
import ${basePackage}.EntitySubType;
</#if>
import ${basePackage}.IconType;

public enum ${symbolSet.baseTypeName}EntityType implements EntityType {
<#list entityTypes as entType>
    ${entType.id}("${entType.code}", "${entType.label}", ${symbolSet.baseTypeName}Entity.${entType.entityId}, IconType.${entType.iconType})<#if entType.graphic??> {
        @Override
        public String getGraphicIdentifier() {
            return "${entType.graphic}";
        }
    }</#if><#if entType?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    private final ${symbolSet.baseTypeName}Entity entity;
    private final IconType iconType;
    
    private ${symbolSet.baseTypeName}EntityType(String id, String label, ${symbolSet.baseTypeName}Entity entity, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
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
    public Entity getEntity() {
        return entity;
    }
    
<#if entitySubTypes??>        
   @Override
    public List<EntitySubType> getEntitySubTypes() {
        return ${symbolSet.baseTypeName}SymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

</#if>        
}