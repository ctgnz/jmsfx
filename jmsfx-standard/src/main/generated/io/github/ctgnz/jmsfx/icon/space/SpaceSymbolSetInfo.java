package io.github.ctgnz.jmsfx.icon.space;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import io.github.ctgnz.jmsfx.icon.Amplifier;
import io.github.ctgnz.jmsfx.icon.ListAmplifier;
import io.github.ctgnz.jmsfx.icon.AmplifierGuide;
import io.github.ctgnz.jmsfx.icon.GuideType;
import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.EntitySubType;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.SectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSetInfo;

public class SpaceSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new SpaceSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(SpaceEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(SpaceEntityType.values()), EntityType::getEntity);

    private SpaceSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.G_StaffComments, GuideType.RECTANGLE, 478, 436, 134, 80),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, GuideType.RECTANGLE, 478, 436, 134, 80),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, GuideType.RECTANGLE, 478, 196, 134, 80),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, GuideType.RECTANGLE, 478, 276, 134, 80),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, GuideType.RECTANGLE, 478, 356, 134, 80),
            new AmplifierGuide(Amplifier.Z_Speed, GuideType.RECTANGLE, 478, 356, 134, 80),
            new AmplifierGuide(Amplifier.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AJ_SpeedLeader, GuideType.LINE, 176.341, 469.248, 17.069, 557.214),
            new AmplifierGuide(Amplifier.AL_OperationalCondition, GuideType.RECTANGLE, 142, 518, 328, 80),
            new AmplifierGuide(Amplifier.AO_EngagementBar, GuideType.RECTANGLE, 132, 116, 346, 80),
            new AmplifierGuide(Amplifier.AO1_TargetDesignation, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AS_Country, GuideType.RECTANGLE, 478, 196, 134, 80)
        );
    }

    @Override
    public List<ListAmplifier> getAmplifiers() {
        return Collections.emptyList();
    }

    @Override
    public List<ListAmplifier> getAmplifiersTwo() {
        return Collections.emptyList();
    }

    @Override
    public List<ListAmplifier> getAmplifiersThree() {
        return Collections.emptyList();
    }

    @Override
    public List<Entity> getEntities() {
        return ENTITIES;
    }

    @Override
    public List<EntitySubType> getEntitySubTypes(EntityType entityType) {
        return Collections.emptyList();
    }

    @Override
    public List<EntityType> getEntityTypes(Entity entity) {
        return Lists.newArrayList(ENTITY_TYPES.get(entity));
    }

    @Override
    public List<ListAmplifier> getFrameAmplifiers() {
        return Collections.emptyList();
    }

    @Override
    public List<SectorOneModifier> getSectorOneModifiers() {
        return Arrays.asList(SpaceSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(SpaceSectorTwoModifier.values());
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
        return false;
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
    public boolean isFramedIcon() {
        return true;
    }

}
