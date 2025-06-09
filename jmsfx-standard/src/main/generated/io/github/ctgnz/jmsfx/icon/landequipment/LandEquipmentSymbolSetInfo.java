package io.github.ctgnz.jmsfx.icon.landequipment;

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
import io.github.ctgnz.jmsfx.types.GuideType;
import io.github.ctgnz.jmsfx.icon.Amplifier;
import io.github.ctgnz.jmsfx.icon.AmplifierGuide;
import io.github.ctgnz.jmsfx.icon.amplifier.EquipmentMobility;

public class LandEquipmentSymbolSetInfo implements ISymbolSetInfo {
    public static final ISymbolSetInfo INSTANCE = new LandEquipmentSymbolSetInfo();
    private static final List<IEntity> ENTITIES = Arrays.asList(LandEquipmentEntity.values());
    private static final Multimap<IEntity, IEntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(LandEquipmentEntityType.values()), IEntityType::getEntity);
    private static final Multimap<IEntityType, IEntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(LandEquipmentEntitySubType.values()), IEntitySubType::getEntityType);

    private LandEquipmentSymbolSetInfo() {
    }

    @Override
    public List<IAmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.C_Quantity, GuideType.RECTANGLE, 205, 190, 200, 60),
            new AmplifierGuide(Amplifier.G_StaffComments, GuideType.RECTANGLE, 486, 250, 126, 90),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, GuideType.RECTANGLE, 486, 340, 126, 90),
            new AmplifierGuide(Amplifier.J_EvaluationRating, GuideType.RECTANGLE, 486, 520, 126, 90),
            new AmplifierGuide(Amplifier.K_CombatEffectiveness, GuideType.RECTANGLE, 486, 520, 126, 90),
            new AmplifierGuide(Amplifier.L_SignatureEquipment, GuideType.RECTANGLE, 486, 520, 126, 90),
            new AmplifierGuide(Amplifier.M_HigherFormation, GuideType.RECTANGLE, 486, 430, 126, 90),
            new AmplifierGuide(Amplifier.N_HostileEnemy, GuideType.RECTANGLE, 486, 520, 126, 90),
            new AmplifierGuide(Amplifier.P_IffSifAis, GuideType.RECTANGLE, 486, 520, 126, 90),
            new AmplifierGuide(Amplifier.Q_DirectionOfMovementIndicator, GuideType.POLYLINE, 305.105, 622, 305.105, 765, 218.428, 774.077),
            new AmplifierGuide(Amplifier.R_MobilityIndicator, GuideType.RECTANGLE, 185, 542, 240, 90),
            new AmplifierGuide(Amplifier.S2_OffsetLocationIndicator, GuideType.POLYLINE, 191.707, 488.132, 92.754, 702.34, 28.614, 739.366),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, GuideType.RECTANGLE, 0, 430, 126, 90),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, GuideType.RECTANGLE, 0, 340, 126, 90),
            new AmplifierGuide(Amplifier.W_DateTimeGroupDtg, GuideType.RECTANGLE, 0, 160, 126, 90),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, GuideType.RECTANGLE, 0, 250, 126, 90),
            new AmplifierGuide(Amplifier.Y_Location, GuideType.RECTANGLE, 0, 250, 126, 90),
            new AmplifierGuide(Amplifier.Z_Speed, GuideType.RECTANGLE, 0, 520, 126, 90),
            new AmplifierGuide(Amplifier.AB_FeintDummyIndicator, GuideType.POLYGON, 126, 251, 305, 85, 486, 251),
            new AmplifierGuide(Amplifier.AD_PlatformType, GuideType.RECTANGLE, 0, 340, 126, 90),
            new AmplifierGuide(Amplifier.AE_EquipmentTeardownTime, GuideType.RECTANGLE, 486, 340, 126, 90),
            new AmplifierGuide(Amplifier.AF_CommonIdentifier, GuideType.RECTANGLE, 0, 340, 126, 90),
            new AmplifierGuide(Amplifier.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AL_OperationalCondition, GuideType.RECTANGLE, 142, 542, 328, 80),
            new AmplifierGuide(Amplifier.AO_EngagementBar, GuideType.RECTANGLE, 132, 5, 344, 80),
            new AmplifierGuide(Amplifier.AO1_TargetDesignation, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AS_Country, GuideType.RECTANGLE, 486, 160, 126, 90)
        );
    }

    @Override
    public List<IStandardAmplifierItem> getAmplifiers() {
        return Arrays.asList(EquipmentMobility.values());
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
        return Arrays.asList(LandEquipmentSectorOneModifier.values());
    }

    @Override
    public List<ISectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(LandEquipmentSectorTwoModifier.values());
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