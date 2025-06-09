package ${iconPackage};

import java.util.List;

import ${basePackage}.IAmplifier;
import ${basePackage}.IAmplifierGuide;
import ${basePackage}.IEntity;
import ${basePackage}.ISectorOneModifier;
import ${basePackage}.ISectorTwoModifier;
import ${basePackage}.IStandardAmplifierItem;
import ${basePackage}.ISymbolSet;
import ${basePackage}.ISymbolSetInfo;
<#list symbolSets as sym>
import ${iconPackage}.${sym.packageName}.${sym.baseTypeName}SymbolSet;
</#list>
import ${commonPackage}.CommonSymbolSet;

public enum SymbolSet implements ISymbolSet {
    COMMON("C", "Common", Dimension.INTERNAL, "Common", CommonSymbolSet.INSTANCE),
<#list symbolSets as sym>
    ${sym.id}("${sym.code}", "${sym.label}", Dimension.${sym.dimensionId}, <#if sym.graphicLocation??>"${sym.graphicLocation}", </#if>${sym.baseTypeName}SymbolSet.INSTANCE)<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final Dimension dimension;
    private final String graphicLocation;
    private final ISymbolSetInfo symbolSetInfo;

    SymbolSet(String id, String label, Dimension dimension, ISymbolSetInfo symbolSetInfo) {
        this(id, label, dimension, dimension.getGraphicLocation(), symbolSetInfo);
    }
    
    SymbolSet(String id, String label, Dimension dimension, String graphicLocation, ISymbolSetInfo symbolSetInfo) {
        this.id = id;
        this.label = label;
        this.dimension = dimension;
        this.graphicLocation = graphicLocation;
        this.symbolSetInfo = symbolSetInfo;
    }

    @Override
    public IAmplifierGuide getAmplifierGuide(IAmplifier amplifier) {
        return getAmplifierGuides().stream().filter(guide -> guide.getAmplifier() == amplifier).findFirst().orElse(null);
    }

    @Override
    public List<IAmplifierGuide> getAmplifierGuides() {
        return symbolSetInfo.getAmplifierGuides();
    }

    @Override
    public <A extends IStandardAmplifierItem> List<A> getAmplifierList() {
        return symbolSetInfo.getAmplifiers();
    }

    @Override
    public <A extends IStandardAmplifierItem> List<A> getAmplifierListTwo() {
        return symbolSetInfo.getAmplifiersTwo();
    }

    @Override
    public <A extends IStandardAmplifierItem> List<A> getAmplifierListThree() {
        return symbolSetInfo.getAmplifiersThree();
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
    public <A extends IStandardAmplifierItem> List<A> getFrameAmplifierList() {
        return symbolSetInfo.getFrameAmplifiers();
    }

    @Override
    public String getGraphicLocation() {
        return graphicLocation;
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