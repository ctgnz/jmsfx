package nz.co.ctg.jmsfx.model.seasurface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import nz.co.ctg.jmsfx.model.Amplifier;
import nz.co.ctg.jmsfx.model.EnumeratedAmplifier;
import nz.co.ctg.jmsfx.model.AmplifierGuide;
import nz.co.ctg.jmsfx.model.GuideType;
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
            new AmplifierGuide(Amplifier.G_StaffComments, GuideType.RECTANGLE, 478, 440, 134, 96),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, GuideType.RECTANGLE, 478, 440, 134, 96),
            new AmplifierGuide(Amplifier.P_IffSifAis, GuideType.RECTANGLE, 478, 344, 134, 96),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, GuideType.RECTANGLE, 478, 152, 134, 96),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, GuideType.RECTANGLE, 478, 248, 134, 96),
            new AmplifierGuide(Amplifier.Y_Location, GuideType.RECTANGLE, 478, 536, 134, 96),
            new AmplifierGuide(Amplifier.Z_Speed, GuideType.RECTANGLE, 478, 536, 134, 96),
            new AmplifierGuide(Amplifier.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AJ_SpeedLeader, GuideType.LINE, 178.565, 467.976, 17.069, 557.214),
            new AmplifierGuide(Amplifier.AL_OperationalCondition, GuideType.RECTANGLE, 142, 542, 328, 96),
            new AmplifierGuide(Amplifier.AO_EngagementBar, GuideType.RECTANGLE, 134, 152, 344, 96),
            new AmplifierGuide(Amplifier.AO1_TargetDesignation, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AQ_GuardedUnit, GuideType.RECTANGLE, 0, 152, 134, 96),
            new AmplifierGuide(Amplifier.AR_SpecialDesignator, GuideType.RECTANGLE, 0, 152, 134, 96),
            new AmplifierGuide(Amplifier.AS_Country, GuideType.RECTANGLE, 478, 152, 134, 96)
        );
    }

    @Override
    public List<EnumeratedAmplifier> getAmplifiers() {
        return Arrays.asList(TowedArrayType.values());
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
        return Lists.newArrayList(ENTITY_SUB_TYPES.get(entityType));
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
