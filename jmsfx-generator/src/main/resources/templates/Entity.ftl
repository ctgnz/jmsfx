package ${basePackage}.${symbolSet.packageName};

<#if entityTypes??>        
import java.util.List;

</#if>
import ${basePackage}.Entity;
<#if entityTypes??>        
import ${basePackage}.EntityType;
</#if>
import ${basePackage}.SymbolSet;
import ${basePackage}.IconType;

public enum ${symbolSet.baseTypeName}Entity implements Entity {
<#list entities as ent>
    ${ent.id}("${ent.code}", "${ent.label}", IconType.${ent.iconType})<#if ent?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private ${symbolSet.baseTypeName}Entity(String id, String label, IconType iconType) {
        this.id = id;
        this.label = label;
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
    public SymbolSet getSymbolSet() {
        return SymbolSet.${symbolSet.id};
    }

<#if entityTypes??>        
    @Override
    public List<EntityType> getEntityTypes() {
        return ${symbolSet.baseTypeName}SymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
</#if>
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}