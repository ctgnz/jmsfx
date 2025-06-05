package ${iconPackage};

import java.util.List;

import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

import ${basePackage}.IAmplifier;
import ${basePackage}.IEntity;
import ${basePackage}.IListAmplifier;
import ${basePackage}.ISectorOneModifier;
import ${basePackage}.ISectorTwoModifier;
import ${basePackage}.ISymbolSet;
import ${basePackage}.ISymbolSetInfo;
<#list symbolSets as sym>
import ${iconPackage}.${sym.packageName}.${sym.baseTypeName}SymbolSetInfo;
</#list>
import ${commonPackage}.CommonSymbolSetInfo;

public enum SymbolSet implements ISymbolSet {
    COMMON("C", "Common", Dimension.INTERNAL, "Common", CommonSymbolSetInfo.INSTANCE),
<#list symbolSets as sym>
    ${sym.id}("${sym.code}", "${sym.label}", Dimension.${sym.dimensionId}, <#if sym.graphicLocation??>"${sym.graphicLocation}", <#else>null, </#if>${sym.baseTypeName}SymbolSetInfo.INSTANCE)<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final Dimension dimension;
    private final String graphicLocation;
    private final ISymbolSetInfo symbolSetInfo;

    SymbolSet(String id, String label, Dimension dimension, String graphicLocation, ISymbolSetInfo symbolSetInfo) {
        this.id = id;
        this.label = label;
        this.dimension = dimension;
        this.graphicLocation = graphicLocation;
        this.symbolSetInfo = symbolSetInfo;
    }

    @Override
    public AmplifierGuide getAmplifierGuide(IAmplifier amplifier) {
        return getAmplifierGuides().stream().filter(guide -> guide.getAmplifier() == amplifier).findFirst().orElse(null);
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return symbolSetInfo.getAmplifierGuides();
    }

    @Override
    public <A extends IListAmplifier> List<A> getAmplifierThreeGroups() {
        return symbolSetInfo.getAmplifiersThree();
    }

    @Override
    public <A extends IListAmplifier> List<A> getAmplifierTwoGroups() {
        return symbolSetInfo.getAmplifiersTwo();
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public <E extends IEntity> List<E> getEntities() {
        return symbolSetInfo.getEntities();
    }

    @Override
    public String getFrameId() {
        return dimension.getFrameId();
    }

    @Override
    public <A extends IListAmplifier> List<A> getFrameListAmplifiers() {
        return symbolSetInfo.getFrameAmplifiers();
    }

    @Override
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

    @Override
    public <A extends IListAmplifier> List<A> getListAmplifiers() {
        return symbolSetInfo.getAmplifiers();
    }

    @Override
    public <M extends ISectorOneModifier> List<M> getSectorOneModifiers() {
        return symbolSetInfo.getSectorOneModifiers();
    }

    @Override
    public <M extends ISectorTwoModifier> List<M> getSectorTwoModifiers() {
        return symbolSetInfo.getSectorTwoModifiers();
    }

    @Override
    public ISymbolSetInfo getSymbolSetInfo() {
        return symbolSetInfo;
    }

}