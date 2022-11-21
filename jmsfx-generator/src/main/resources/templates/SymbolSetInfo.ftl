package ${basePackage}.${symbolSet.packageName};

import java.util.Arrays;<#if symbolSet.anyNotPresent>
import java.util.Collections;</#if>
import java.util.List;

<#if symbolSet.entityTypePresent>
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

</#if>
<#if symbolSet.amplifierGuidesPresent>import ${basePackage}.Amplifier;
</#if>import ${basePackage}.AmplifierGroup;
import ${basePackage}.AmplifierGuide;
import ${basePackage}.Entity;
import ${basePackage}.EntitySubType;
import ${basePackage}.EntityType;
import ${basePackage}.SectorOneModifier;
import ${basePackage}.SectorTwoModifier;
import ${basePackage}.SymbolSetInfo;<#if symbolSet.amplifierPresent>
import ${basePackage}.${symbolSet.amplifierClass};</#if><#if symbolSet.amplifierTwoPresent>
import ${basePackage}.${symbolSet.amplifierTwoClass};</#if><#if symbolSet.amplifierThreePresent>
import ${basePackage}.${symbolSet.amplifierThreeClass};</#if><#if symbolSet.frameAmplifierPresent>
import ${basePackage}.${symbolSet.frameAmplifierClass};</#if>

public class ${symbolSet.baseTypeName}SymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new ${symbolSet.baseTypeName}SymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(${symbolSet.baseTypeName}Entity.values());<#if symbolSet.entityTypePresent>
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(${symbolSet.baseTypeName}EntityType.values()), EntityType::getEntity);</#if><#if symbolSet.entitySubTypePresent>
    private static final Multimap<EntityType, EntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(${symbolSet.baseTypeName}EntitySubType.values()), EntitySubType::getEntityType);</#if>

    private ${symbolSet.baseTypeName}SymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
<#if symbolSet.amplifierGuidesPresent>
        return Arrays.asList(
    <#list symbolSet.amplifierGuides as guide>        
            new AmplifierGuide("${guide.code}", Amplifier.${guide.amplifier}, ${guide.x}, ${guide.y}, ${guide.width}, ${guide.height})<#if guide?is_last><#else>,</#if>
    </#list>
        );
<#else>
        return Collections.emptyList();        
</#if>
    }

    @Override
    public List<AmplifierGroup> getAmplifiers() {
        return <#if symbolSet.amplifierPresent>Arrays.asList(${symbolSet.amplifierClass}.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<AmplifierGroup> getAmplifiersTwo() {
        return <#if symbolSet.amplifierTwoPresent>Arrays.asList(${symbolSet.amplifierTwoClass}.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<AmplifierGroup> getAmplifiersThree() {
        return <#if symbolSet.amplifierThreePresent>Arrays.asList(${symbolSet.amplifierThreeClass}.values())<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<Entity> getEntities() {
        return ENTITIES;
    }

    @Override
    public List<EntitySubType> getEntitySubTypes(EntityType entityType) {<#if symbolSet.entitySubTypePresent><#if symbolSet.specialEntitySubTypePresent>
        List<EntitySubType> subTypes = Lists.newArrayList(ENTITY_SUB_TYPES.get(entityType));
        subTypes.addAll(getSpecialEntitySubTypes());
        return subTypes;<#else>
        return Lists.newArrayList(ENTITY_SUB_TYPES.get(entityType));</#if><#else>
        return Collections.emptyList();</#if>
    }

    @Override
    public List<EntityType> getEntityTypes(Entity entity) {
        return <#if symbolSet.entityTypePresent>Lists.newArrayList(ENTITY_TYPES.get(entity))<#else>Collections.emptyList()</#if>;
    }

    @Override
    public List<AmplifierGroup> getFrameAmplifiers() {
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
    public List<EntitySubType> getSpecialEntitySubTypes() {
        return <#if symbolSet.specialEntitySubTypePresent>Arrays.asList(${symbolSet.baseTypeName}SpecialEntitySubType.values())<#else>Collections.emptyList()</#if>;
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
    public boolean isSpecialEntitySubTypePresent() {
        return ${symbolSet.specialEntitySubTypePresent?c};
    }

}
