package ${basePackage}.${symbolSet.packageName};

import ${basePackage}.Entity;
import ${basePackage}.EntitySubType;
import ${basePackage}.EntityType;
import ${basePackage}.IconType;

public enum ${symbolSet.baseTypeName}SpecialEntitySubType implements EntitySubType {
<#list specialEntitySubTypes as subType>
    ${subType.id}("${subType.code}", "${subType.label}", "${subType.graphic}")<#if subType?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    private final String graphicIdentifier;
    
    private ${symbolSet.baseTypeName}SpecialEntitySubType(String id, String label, String graphicIdentifier) {
        this.id = id;
        this.label = label;
        this.graphicIdentifier = graphicIdentifier;
    }
    
    @Override
    public Entity getEntity() {
        return null;
    }
    
    @Override
    public EntityType getEntityType() {
        return null;
    }
    
    @Override
    public String getGraphicIdentifier() {
        return graphicIdentifier;
    }

    @Override
    public IconType getIconType() {
        return IconType.SPECIAL;
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
    public boolean isFullFrameIcon() {
        return true;
    }
    
}