package ${iconPackage};

import java.util.List;

import ${basePackage}.Amplifier;
import ${basePackage}.AmplifierGuide;
import ${basePackage}.Dimension;
import ${basePackage}.Entity;
import ${basePackage}.SectorOneModifier;
import ${basePackage}.SectorTwoModifier;
import ${basePackage}.StandardAmplifierItem;
import ${basePackage}.SymbolSet;
import ${basePackage}.SymbolSetInfo;
<#list symbolSets as sym>
import ${iconPackage}.${sym.packageName}.${sym.baseTypeName}SymbolSet;
</#list>

public enum SymbolSetEnum implements SymbolSet {
<#list symbolSets as sym>
        ${sym.id}("${sym.code}", "${sym.label}", DimensionEnum.${sym.dimensionId}, <#if sym.graphicLocation??>"${sym.graphicLocation}", </#if>${sym.baseTypeName}SymbolSet.INSTANCE)<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final DimensionEnum dimension;
    private final String graphicLocation;
    private final SymbolSetInfo symbolSetInfo;

    SymbolSetEnum(String id, String label, DimensionEnum dimension, SymbolSetInfo symbolSetInfo) {
        this(id, label, dimension, dimension.getGraphicLocation(), symbolSetInfo);
    }
    
    SymbolSetEnum(String id, String label, DimensionEnum dimension, String graphicLocation, SymbolSetInfo symbolSetInfo) {
        this.id = id;
        this.label = label;
        this.dimension = dimension;
        this.graphicLocation = graphicLocation;
        this.symbolSetInfo = symbolSetInfo;
    }

    @Override
    public AmplifierGuide getAmplifierGuide(Amplifier amplifier) {
        return getAmplifierGuides().stream().filter(guide -> guide.getAmplifier() == amplifier).findFirst().orElse(null);
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return symbolSetInfo.getAmplifierGuides();
    }

    @Override
    public List<StandardAmplifierItem> getAmplifierList() {
        return symbolSetInfo.getAmplifiers();
    }

    @Override
    public List<StandardAmplifierItem> getAmplifierListTwo() {
        return symbolSetInfo.getAmplifiersTwo();
    }

    @Override
    public List<StandardAmplifierItem> getAmplifierListThree() {
        return symbolSetInfo.getAmplifiersThree();
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public List<Entity> getEntities() {
        return symbolSetInfo.getEntities();
    }

    @Override
    public String getFrameId() {
        return dimension.getFrameId();
    }

    @Override
    public List<StandardAmplifierItem> getFrameAmplifierList() {
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
    public List<SectorOneModifier> getSectorOneModifiers() {
        return symbolSetInfo.getSectorOneModifiers();
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return symbolSetInfo.getSectorTwoModifiers();
    }

    @Override
    public SymbolSetInfo getSymbolSetInfo() {
        return symbolSetInfo;
    }

}