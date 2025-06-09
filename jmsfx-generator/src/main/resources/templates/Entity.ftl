package ${iconPackage}.${symbolSet.packageName};

<#if entityTypes??>
import java.util.List;

</#if>
import ${basePackage}.IEntity;
<#if entityTypes??>
import ${basePackage}.IEntityType;
</#if>
import ${basePackage}.ISymbolSet;
import ${typePackage}.GraphicType;
import ${iconPackage}.SymbolSet;

public enum ${symbolSet.baseTypeName}Entity implements IEntity {
<#list entities as ent>
    ${ent.id}("${ent.code}", "${ent.label}", GraphicType.${ent.graphicType})<#if ent.baseSymbolSet??> {
        @Override
        public ISymbolSet getBaseSymbolSet() {
            return SymbolSet.${ent.baseSymbolSet};
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

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public ISymbolSet getSymbolSet() {
        return SymbolSet.${symbolSet.id};
    }
<#if symbolSet.baseSymbolSet??>

    @Override
    public ISymbolSet getBaseSymbolSet() {
        return SymbolSet.${symbolSet.baseSymbolSet};
    }
</#if>
<#if entityTypes??>

    @Override
    public List<IEntityType> getEntityTypes() {
        return ${symbolSet.baseTypeName}SymbolSet.INSTANCE.getEntityTypes(this);
    }
</#if>

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}