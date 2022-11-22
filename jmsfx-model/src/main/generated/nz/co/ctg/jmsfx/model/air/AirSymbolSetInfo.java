package nz.co.ctg.jmsfx.model.air;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.AmplifierGuide;
import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSetInfo;
import nz.co.ctg.jmsfx.model.UnitEchelon;

public class AirSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new AirSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(AirEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(AirEntityType.values()), EntityType::getEntity);
    private static final Multimap<EntityType, EntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(AirEntitySubType.values()), EntitySubType::getEntityType);

    private AirSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Collections.emptyList();        
    }

    @Override
    public List<AmplifierGroup> getAmplifiers() {
        return Arrays.asList(UnitEchelon.values());
    }

    @Override
    public List<AmplifierGroup> getAmplifiersTwo() {
        return Collections.emptyList();
    }

    @Override
    public List<AmplifierGroup> getAmplifiersThree() {
        return Collections.emptyList();
    }

    @Override
    public List<Entity> getEntities() {
        return ENTITIES;
    }

    @Override
    public List<EntitySubType> getEntitySubTypes(EntityType entityType) {
        return Lists.newArrayList(ENTITY_SUB_TYPES.get(entityType));
    }

    @Override
    public List<EntityType> getEntityTypes(Entity entity) {
        return Lists.newArrayList(ENTITY_TYPES.get(entity));
    }

    @Override
    public List<AmplifierGroup> getFrameAmplifiers() {
        return Collections.emptyList();
    }

    @Override
    public List<SectorOneModifier> getSectorOneModifiers() {
        return Arrays.asList(AirSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(AirSectorTwoModifier.values());
    }

    @Override
    public List<EntitySubType> getSpecialEntitySubTypes() {
        return Collections.emptyList();
    }

    @Override
    public boolean isAmplifierPresent() {
        return true;
    }

    @Override
    public boolean isAmplifierTwoPresent() {
        return false;
    }

    @Override
    public boolean isAmplifierThreePresent() {
        return false;
    }

    @Override
    public boolean isEntitySubTypePresent() {
        return true;
    }

    @Override
    public boolean isEntityTypePresent() {
        return true;
    }

    @Override
    public boolean isFrameAmplifierPresent() {
        return false;
    }

    @Override
    public boolean isSectorOneModifierPresent() {
        return true;
    }

    @Override
    public boolean isSectorTwoModifierPresent() {
        return true;
    }

    @Override
    public boolean isSpecialEntitySubTypePresent() {
        return false;
    }

}
