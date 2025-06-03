package io.github.ctgnz.jmsfx.icon.landinstallation;

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
import io.github.ctgnz.jmsfx.icon.amplifier.EquipmentMobility;

public class LandInstallationSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new LandInstallationSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(LandInstallationEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(LandInstallationEntityType.values()), EntityType::getEntity);
    private static final Multimap<EntityType, EntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(LandInstallationEntitySubType.values()), EntitySubType::getEntityType);

    private LandInstallationSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.G_StaffComments, GuideType.RECTANGLE, 486, 276, 126, 80),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, GuideType.RECTANGLE, 486, 356, 126, 80),
            new AmplifierGuide(Amplifier.J_EvaluationRating, GuideType.RECTANGLE, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.K_CombatEffectiveness, GuideType.RECTANGLE, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.M_HigherFormation, GuideType.RECTANGLE, 486, 436, 126, 80),
            new AmplifierGuide(Amplifier.S_HeadquartersStaffIndicator, GuideType.RECTANGLE, 123.775, 83.542, 364.55, 193.458),
            new AmplifierGuide(Amplifier.S2_OffsetLocationIndicator, GuideType.RECTANGLE, 123.775, 83.542, 364.55, 193.458),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, GuideType.RECTANGLE, 0, 436, 126, 80),
            new AmplifierGuide(Amplifier.W_DateTimeGroupDtg, GuideType.RECTANGLE, 0, 196, 126, 80),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, GuideType.RECTANGLE, 0, 276, 126, 80),
            new AmplifierGuide(Amplifier.Y_Location, GuideType.RECTANGLE, 0, 276, 126, 80),
            new AmplifierGuide(Amplifier.AB_FeintDummyIndicator, GuideType.POLYGON, 126.082, 276, 304.754, 80, 486, 276),
            new AmplifierGuide(Amplifier.AE_EquipmentTeardownTime, GuideType.RECTANGLE, 486, 356, 126, 80),
            new AmplifierGuide(Amplifier.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AL_OperationalCondition, GuideType.RECTANGLE, 132, 520, 348, 80),
            new AmplifierGuide(Amplifier.AS_Country, GuideType.RECTANGLE, 486, 196, 126, 80),
            new AmplifierGuide(Amplifier.AT_CapacityOfInstallation, GuideType.RECTANGLE, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.AX_InstallationComposition, GuideType.RECTANGLE, 0, 356, 126, 80)
        );
    }

    @Override
    public List<ListAmplifier> getAmplifiers() {
        return Arrays.asList(EquipmentMobility.values());
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
        return Lists.newArrayList(ENTITY_SUB_TYPES.get(entityType));
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
        return Arrays.asList(LandInstallationSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(LandInstallationSectorTwoModifier.values());
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
    public boolean isFramedIcon() {
        return true;
    }

}
