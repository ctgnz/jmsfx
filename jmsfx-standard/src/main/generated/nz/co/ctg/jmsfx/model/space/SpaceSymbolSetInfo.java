package nz.co.ctg.jmsfx.model.space;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import nz.co.ctg.jmsfx.model.Amplifier;
import nz.co.ctg.jmsfx.model.EnumeratedAmplifier;
import nz.co.ctg.jmsfx.model.AmplifierGuide;
import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSetInfo;

public class SpaceSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new SpaceSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(SpaceEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(SpaceEntityType.values()), EntityType::getEntity);

    private SpaceSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.G_StaffComments, 478, 436, 134, 80),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, 478, 436, 134, 80),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, 478, 196, 134, 80),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, 478, 276, 134, 80),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, 478, 356, 134, 80),
            new AmplifierGuide(Amplifier.Z_Speed, 478, 356, 134, 80),
            new AmplifierGuide(Amplifier.AL_OperationalCondition, 142, 518, 328, 80),
            new AmplifierGuide(Amplifier.AO_EngagementBar, 132, 116, 346, 80),
            new AmplifierGuide(Amplifier.AS_Country, 478, 196, 134, 80),
            new AmplifierGuide(Amplifier.AJ_SpeedLeader, 16, 467, 161, 91)
        );
    }

    @Override
    public List<EnumeratedAmplifier> getAmplifiers() {
        return Collections.emptyList();
    }

    @Override
    public List<EnumeratedAmplifier> getAmplifiersTwo() {
        return Collections.emptyList();
    }

    @Override
    public List<EnumeratedAmplifier> getAmplifiersThree() {
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
    public List<EnumeratedAmplifier> getFrameAmplifiers() {
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

}
