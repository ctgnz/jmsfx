package io.github.ctgnz.jmsfx.icon.dismountedindividual;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.ISymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.Amplifier;
import io.github.ctgnz.jmsfx.icon.AmplifierGuide;
import io.github.ctgnz.jmsfx.icon.GuideType;
import io.github.ctgnz.jmsfx.icon.amplifier.LeadershipRole;

public class DismountedIndividualSymbolSetInfo implements ISymbolSetInfo {
    public static final ISymbolSetInfo INSTANCE = new DismountedIndividualSymbolSetInfo();
    private static final List<IEntity> ENTITIES = Arrays.asList(DismountedIndividualEntity.values());
    private static final Multimap<IEntity, IEntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(DismountedIndividualEntityType.values()), IEntityType::getEntity);
    private static final Multimap<IEntityType, IEntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(DismountedIndividualEntitySubType.values()), IEntitySubType::getEntityType);

    private DismountedIndividualSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.C_Quantity, GuideType.RECTANGLE, 205, 546, 200, 96),
            new AmplifierGuide(Amplifier.G_StaffComments, GuideType.RECTANGLE, 478, 248, 134, 96),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, GuideType.RECTANGLE, 478, 344, 134, 96),
            new AmplifierGuide(Amplifier.J_EvaluationRating, GuideType.RECTANGLE, 478, 536, 134, 96),
            new AmplifierGuide(Amplifier.K_CombatEffectiveness, GuideType.RECTANGLE, 478, 536, 134, 96),
            new AmplifierGuide(Amplifier.M_HigherFormation, GuideType.RECTANGLE, 478, 440, 134, 96),
            new AmplifierGuide(Amplifier.P_IffSifAis, GuideType.RECTANGLE, 478, 536, 134, 96),
            new AmplifierGuide(Amplifier.Q_DirectionOfMovementIndicator, GuideType.POLYLINE, 304.754, 641.628, 304.754, 702.084, 380.942, 734.447),
            new AmplifierGuide(Amplifier.S2_OffsetLocationIndicator, GuideType.POLYLINE, 180.082, 470, 180.082, 693.086, 62.332, 757.333),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, GuideType.RECTANGLE, 0, 440, 134, 96),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, GuideType.RECTANGLE, 0, 344, 134, 96),
            new AmplifierGuide(Amplifier.W_DateTimeGroupDtg, GuideType.RECTANGLE, 0, 152, 134, 96),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, GuideType.RECTANGLE, 0, 248, 134, 96),
            new AmplifierGuide(Amplifier.Y_Location, GuideType.RECTANGLE, 0, 248, 134, 96),
            new AmplifierGuide(Amplifier.Z_Speed, GuideType.RECTANGLE, 0, 536, 134, 96),
            new AmplifierGuide(Amplifier.AB_FeintDummyIndicator, GuideType.POLYGON, 134, 302, 305, 150, 478, 302),
            new AmplifierGuide(Amplifier.AF_CommonIdentifier, GuideType.RECTANGLE, 0, 344, 134, 96),
            new AmplifierGuide(Amplifier.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AS_Country, GuideType.RECTANGLE, 478, 152, 134, 96),
            new AmplifierGuide(Amplifier.AV_LeadershipIdentifier, GuideType.POLYGON, 150, 302, 305, 205, 460, 302)
        );
    }

    @Override
    public List<IListAmplifier> getAmplifiers() {
        return Arrays.asList(LeadershipRole.values());
    }

    @Override
    public List<IListAmplifier> getAmplifiersTwo() {
        return Collections.emptyList();
    }

    @Override
    public List<IListAmplifier> getAmplifiersThree() {
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
    public List<IListAmplifier> getFrameAmplifiers() {
        return Collections.emptyList();
    }

    @Override
    public List<ISectorOneModifier> getSectorOneModifiers() {
        return Arrays.asList(DismountedIndividualSectorOneModifier.values());
    }

    @Override
    public List<ISectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(DismountedIndividualSectorTwoModifier.values());
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