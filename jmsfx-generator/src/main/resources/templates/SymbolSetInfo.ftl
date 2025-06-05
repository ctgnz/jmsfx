package ${iconPackage}.${symbolSet.packageName};

import java.util.Arrays;<#if symbolSet.anyNotPresent>
import java.util.Collections;</#if>
import java.util.List;
<#if symbolSet.entityTypePresent>

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
</#if>

import ${basePackage}.IEntity;
import ${basePackage}.IEntitySubType;
import ${basePackage}.IEntityType;
import ${basePackage}.IListAmplifier;
import ${basePackage}.ISectorOneModifier;
import ${basePackage}.ISectorTwoModifier;
import ${basePackage}.ISymbolSetInfo;<#if symbolSet.amplifierGuidesPresent>
import ${iconPackage}.Amplifier;</#if>
import ${iconPackage}.AmplifierGuide;<#if symbolSet.amplifierGuidesPresent>
import ${iconPackage}.GuideType;</#if><#if symbolSet.amplifierPresent>
import ${iconPackage}.amplifier.${symbolSet.amplifierClass};</#if><#if symbolSet.amplifierThreePresent>
import ${iconPackage}.amplifier.${symbolSet.amplifierThreeClass};</#if><#if symbolSet.amplifierTwoPresent>
import ${iconPackage}.amplifier.${symbolSet.amplifierTwoClass};</#if><#if symbolSet.frameAmplifierPresent>
import ${iconPackage}.amplifier.${symbolSet.frameAmplifierClass};</#if>

public class ${symbolSet.baseTypeName}SymbolSetInfo implements ISymbolSetInfo {
    public static final ISymbolSetInfo INSTANCE = new ${symbolSet.baseTypeName}SymbolSetInfo();
    private static final List<IEntity> ENTITIES = Arrays.asList(${symbolSet.baseTypeName}Entity.values());<#if symbolSet.entityTypePresent>
    private static final Multimap<IEntity, IEntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(${symbolSet.baseTypeName}EntityType.values()), IEntityType::getEntity);</#if><#if symbolSet.entitySubTypePresent>
    private static final Multimap<IEntityType, IEntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(${symbolSet.baseTypeName}EntitySubType.values()), IEntitySubType::getEntityType);</#if>

    private ${symbolSet.baseTypeName}SymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
<#if symbolSet.amplifierGuidesPresent>
        return Arrays.asList(
    <#list symbolSet.amplifierGuides as guide>
        <#if guide.graphical>
            new AmplifierGuide(Amplifier.${guide.amplifier}, GuideType.${guide.type}<#list guide.points as pt>, ${pt}</#list>)<#if guide?is_last><#else>,</#if>
        <#else>
            new AmplifierGuide(Amplifier.${guide.amplifier}, GuideType.${guide.type})<#if guide?is_last><#else>,</#if>
        </#if>
    </#list>
        );
<#else>
        return Collections.emptyList();
</#if>
    }

    @Override
    public List<IListAmplifier> getAmplifiers() {
        return <#if symbolSet.amplifierPresent>Arrays.asList(${symbolSet.amplifierClass}.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<IListAmplifier> getAmplifiersTwo() {
        return <#if symbolSet.amplifierTwoPresent>Arrays.asList(${symbolSet.amplifierTwoClass}.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<IListAmplifier> getAmplifiersThree() {
        return <#if symbolSet.amplifierThreePresent>Arrays.asList(${symbolSet.amplifierThreeClass}.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<IEntity> getEntities() {
        return ENTITIES;
    }

    @Override
    public List<IEntitySubType> getEntitySubTypes(IEntityType entityType) {<#if symbolSet.entitySubTypePresent>
        return Lists.newArrayList(ENTITY_SUB_TYPES.get(entityType));<#else>
        return Collections.emptyList();</#if>
    }

    @Override
    public List<IEntityType> getEntityTypes(IEntity entity) {
        return <#if symbolSet.entityTypePresent>Lists.newArrayList(ENTITY_TYPES.get(entity))<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<IListAmplifier> getFrameAmplifiers() {
        return <#if symbolSet.frameAmplifierPresent>Arrays.asList(${symbolSet.frameAmplifierClass}.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<ISectorOneModifier> getSectorOneModifiers() {
        return <#if symbolSet.sectorOneModifierPresent>Arrays.asList(${symbolSet.baseTypeName}SectorOneModifier.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<ISectorTwoModifier> getSectorTwoModifiers() {
        return <#if symbolSet.sectorTwoModifierPresent>Arrays.asList(${symbolSet.baseTypeName}SectorTwoModifier.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public boolean isAmplifierPresent() {
        return ${symbolSet.amplifierPresent?c};
    }

    @Override
    public boolean isAmplifierTwoPresent() {
        return ${symbolSet.amplifierTwoPresent?c};
    }

    @Override
    public boolean isAmplifierThreePresent() {
        return ${symbolSet.amplifierThreePresent?c};
    }

    @Override
    public boolean isEntitySubTypePresent() {
        return ${symbolSet.entitySubTypePresent?c};
    }

    @Override
    public boolean isEntityTypePresent() {
        return ${symbolSet.entityTypePresent?c};
    }

    @Override
    public boolean isFrameAmplifierPresent() {
        return ${symbolSet.frameAmplifierPresent?c};
    }

    @Override
    public boolean isSectorOneModifierPresent() {
        return ${symbolSet.sectorOneModifierPresent?c};
    }

    @Override
    public boolean isSectorTwoModifierPresent() {
        return ${symbolSet.sectorTwoModifierPresent?c};
    }

    @Override
    public boolean isFramedIcon() {
        return ${symbolSet.useFrame?c};
    }

}