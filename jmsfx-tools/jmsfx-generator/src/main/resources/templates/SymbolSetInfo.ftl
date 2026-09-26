package ${iconPackage}.${symbolSet.packageName};

import java.util.Arrays;<#if symbolSet.anyNotPresent>
import java.util.Collections;</#if>
import java.util.List;
<#if symbolSet.entityTypePresent>

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
</#if>

import ${basePackage}.AmplifierGuide;
import ${basePackage}.Entity;
import ${basePackage}.EntitySubType;
import ${basePackage}.EntityType;
import ${basePackage}.SectorOneModifier;
import ${basePackage}.SectorTwoModifier;
import ${basePackage}.StandardAmplifierItem;
import ${basePackage}.SymbolSetInfo;
<#assign amplifierClasses = []>
<#if symbolSet.amplifierPresent><#assign amplifierClasses = amplifierClasses + [symbolSet.amplifierClass]></#if>
<#if symbolSet.amplifierTwoPresent><#assign amplifierClasses = amplifierClasses + [symbolSet.amplifierTwoClass]></#if>
<#if symbolSet.amplifierThreePresent><#assign amplifierClasses = amplifierClasses + [symbolSet.amplifierThreeClass]></#if>
<#if symbolSet.frameAmplifierPresent><#assign amplifierClasses = amplifierClasses + [symbolSet.frameAmplifierClass]></#if>
<#list amplifierClasses?sort as amplifierClass>
import ${iconPackage}.amplifier.${amplifierClass};
</#list>

public class ${symbolSet.baseTypeName}SymbolSet implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new ${symbolSet.baseTypeName}SymbolSet();
    private static final List<Entity> ENTITIES = Arrays.asList(${symbolSet.baseTypeName}Entity.values());<#if symbolSet.entityTypePresent>
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(${symbolSet.baseTypeName}EntityType.values()), EntityType::getEntity);</#if><#if symbolSet.entitySubTypePresent>
    private static final Multimap<EntityType, EntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(${symbolSet.baseTypeName}EntitySubType.values()), EntitySubType::getEntityType);</#if>

    private ${symbolSet.baseTypeName}SymbolSet() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
<#if symbolSet.amplifierGuidesPresent>
        return Arrays.asList(${symbolSet.baseTypeName}AmplifierGuide.values());
<#else>
        return Collections.emptyList();
</#if>
    }

    @Override
    public List<StandardAmplifierItem> getAmplifiers() {
        return <#if symbolSet.amplifierPresent>Arrays.asList(${symbolSet.amplifierClass}.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<StandardAmplifierItem> getAmplifiersTwo() {
        return <#if symbolSet.amplifierTwoPresent>Arrays.asList(${symbolSet.amplifierTwoClass}.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<StandardAmplifierItem> getAmplifiersThree() {
        return <#if symbolSet.amplifierThreePresent>Arrays.asList(${symbolSet.amplifierThreeClass}.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<Entity> getEntities() {
        return ENTITIES;
    }

    @Override
    public List<EntitySubType> getEntitySubTypes(EntityType entityType) {<#if symbolSet.entitySubTypePresent>
        return Lists.newArrayList(ENTITY_SUB_TYPES.get(entityType));<#else>
        return Collections.emptyList();</#if>
    }

    @Override
    public List<EntityType> getEntityTypes(Entity entity) {
        return <#if symbolSet.entityTypePresent>Lists.newArrayList(ENTITY_TYPES.get(entity))<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<StandardAmplifierItem> getFrameAmplifiers() {
        return <#if symbolSet.frameAmplifierPresent>Arrays.asList(${symbolSet.frameAmplifierClass}.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<SectorOneModifier> getSectorOneModifiers() {
        return <#if symbolSet.sectorOneModifierPresent>Arrays.asList(${symbolSet.baseTypeName}SectorOneModifier.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
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