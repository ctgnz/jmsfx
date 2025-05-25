package nz.co.ctg.jmsfx.model.seasurface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import nz.co.ctg.jmsfx.model.Amplifier;
import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.AmplifierGuide;
import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSetInfo;
import nz.co.ctg.jmsfx.model.amplifier.TowedArrayType;

public class SeaSurfaceSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new SeaSurfaceSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(SeaSurfaceEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(SeaSurfaceEntityType.values()), EntityType::getEntity);
    private static final Multimap<EntityType, EntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(SeaSurfaceEntitySubType.values()), EntitySubType::getEntityType);

    private SeaSurfaceSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.G_StaffComments, 478, 440, 134, 96),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, 478, 440, 134, 96),
            new AmplifierGuide(Amplifier.P_IffSifAis, 478, 344, 134, 96),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, 478, 152, 134, 96),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, 478, 248, 134, 96),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, 478, 536, 134, 96),
            new AmplifierGuide(Amplifier.Z_Speed, 478, 536, 134, 96),
            new AmplifierGuide(Amplifier.AL_OperationalCondition, 142, 542, 328, 96),
            new AmplifierGuide(Amplifier.AO_EngagementBar, 134, 152, 344, 96),
            new AmplifierGuide(Amplifier.AQ_GuardedUnit, 0, 152, 134, 96),
            new AmplifierGuide(Amplifier.AR_SpecialDesignator, 0, 152, 134, 96),
            new AmplifierGuide(Amplifier.AS_Country, 478, 152, 134, 96),
            new AmplifierGuide(Amplifier.AJ_SpeedLeader, 16, 467, 161, 91)
        );
    }

    @Override
    public List<AmplifierGroup> getAmplifiers() {
        return Arrays.asList(TowedArrayType.values());
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
        return Arrays.asList(SeaSurfaceSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(SeaSurfaceSectorTwoModifier.values());
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

}
