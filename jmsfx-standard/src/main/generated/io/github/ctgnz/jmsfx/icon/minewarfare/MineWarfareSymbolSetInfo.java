package io.github.ctgnz.jmsfx.icon.minewarfare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.IStandardAmplifierItem;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.ISymbolSetInfo;
import io.github.ctgnz.jmsfx.IAmplifierGuide;

public class MineWarfareSymbolSetInfo implements ISymbolSetInfo {
    public static final ISymbolSetInfo INSTANCE = new MineWarfareSymbolSetInfo();
    private static final List<IEntity> ENTITIES = Arrays.asList(MineWarfareEntity.values());
    private static final Multimap<IEntity, IEntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(MineWarfareEntityType.values()), IEntityType::getEntity);
    private static final Multimap<IEntityType, IEntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(MineWarfareEntitySubType.values()), IEntitySubType::getEntityType);

    private MineWarfareSymbolSetInfo() {
    }

    @Override
    public List<IAmplifierGuide> getAmplifierGuides() {
        return Collections.emptyList();
    }

    @Override
    public List<IStandardAmplifierItem> getAmplifiers() {
        return Collections.emptyList();
    }

    @Override
    public List<IStandardAmplifierItem> getAmplifiersTwo() {
        return Collections.emptyList();
    }

    @Override
    public List<IStandardAmplifierItem> getAmplifiersThree() {
        return Collections.emptyList();
    }

    @Override
    public List<IEntity> getEntities() {
        return ENTITIES;
    }

    @Override
    public List<IEntitySubType> getEntitySubTypes(IEntityType entityType) {
        return Lists.newArrayList(ENTITY_SUB_TYPES.get(entityType));
    }

    @Override
    public List<IEntityType> getEntityTypes(IEntity entity) {
        return Lists.newArrayList(ENTITY_TYPES.get(entity));
    }

    @Override
    public List<IStandardAmplifierItem> getFrameAmplifiers() {
        return Collections.emptyList();
    }

    @Override
    public List<ISectorOneModifier> getSectorOneModifiers() {
        return Collections.emptyList();
    }

    @Override
    public List<ISectorTwoModifier> getSectorTwoModifiers() {
        return Collections.emptyList();
    }

    @Override
    public boolean isAmplifierPresent() {
        return false;
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
        return false;
    }

    @Override
    public boolean isSectorTwoModifierPresent() {
        return false;
    }

    @Override
    public boolean isFramedIcon() {
        return true;
    }

}