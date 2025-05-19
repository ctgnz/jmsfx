package ${basePackage};

import java.util.List;

<#list symbolSets as sym>
import ${basePackage}.${sym.packageName}.${sym.baseTypeName}SymbolSetInfo;
</#list>    

import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

public enum SymbolSet implements SymbolIdentificationCodeElement {
    COMMON("C0", "Common", Dimension.INTERNAL, "Common", CommonSymbolSetInfo.INSTANCE),
<#list symbolSets as sym>
    ${sym.id}("${sym.code}", "${sym.label}", Dimension.${sym.dimensionId}, <#if sym.graphicLocation??>"${sym.graphicLocation}", <#else>null, </#if>${sym.baseTypeName}SymbolSetInfo.INSTANCE)<#if sym?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    private final Dimension dimension;
    private final String graphicLocation;
    private final SymbolSetInfo symbolSetInfo;
    
    private SymbolSet(String id, String label, Dimension dimension, String graphicLocation, SymbolSetInfo symbolSetInfo) {
        this.id = id;
        this.label = label;
        this.dimension = dimension;
        this.graphicLocation = graphicLocation;
        this.symbolSetInfo = symbolSetInfo;
    }
    
    public List<AmplifierGuide> getAmplifierGuides() {
        return symbolSetInfo.getAmplifierGuides();
    }

    public AmplifierGuide getAmplifierGuide(Amplifier amplifier) {
        return getAmplifierGuides().stream().filter(guide -> guide.getAmplifier() == amplifier).findFirst().orElse(null);
    }

    public <A extends AmplifierGroup> List<A> getAmplifierGroups() {
        return symbolSetInfo.getAmplifiers();
    }

    public <A extends AmplifierGroup> List<A> getAmplifierTwoGroups() {
        return symbolSetInfo.getAmplifiersTwo();
    }

    public <A extends AmplifierGroup> List<A> getAmplifierThreeGroups() {
        return symbolSetInfo.getAmplifiersThree();
    }

    public Dimension getDimension() {
        return dimension;
    }

    public <E extends Entity> List<E> getEntities() {
        return symbolSetInfo.getEntities();
    }

    public <A extends AmplifierGroup> List<A> getFrameAmplifierGroups() {
        return symbolSetInfo.getFrameAmplifiers();
    }

    public String getFrameId() {
        return dimension.getFrameId();
    }

    public String getGraphicLocation() {
        return defaultIfNull(graphicLocation, dimension.getGraphicLocation());
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public <M extends SectorOneModifier> List<M> getSectorOneModifiers() {
        return symbolSetInfo.getSectorOneModifiers();
    }

    public <M extends SectorTwoModifier> List<M> getSectorTwoModifiers() {
        return symbolSetInfo.getSectorTwoModifiers();
    }

    public SymbolSetInfo getSymbolSetInfo() {
        return symbolSetInfo;
    }

}