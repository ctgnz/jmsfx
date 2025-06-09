package io.github.ctgnz.jmsfx.icon.controlmeasure;

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
import io.github.ctgnz.jmsfx.icon.amplifier.UnitEchelon;

public class ControlMeasureSymbolSetInfo implements ISymbolSetInfo {
    public static final ISymbolSetInfo INSTANCE = new ControlMeasureSymbolSetInfo();
    private static final List<IEntity> ENTITIES = Arrays.asList(ControlMeasureEntity.values());
    private static final Multimap<IEntity, IEntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(ControlMeasureEntityType.values()), IEntityType::getEntity);
    private static final Multimap<IEntityType, IEntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(ControlMeasureEntitySubType.values()), IEntitySubType::getEntityType);

    private ControlMeasureSymbolSetInfo() {
    }

    @Override
    public List<IAmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.B_Echelon, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.C_Quantity, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.H1_UnlistedPointInformation, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.N_HostileEnemy, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.Q_DirectionOfMovementIndicator, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.S2_OffsetLocationIndicator, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.T1_UniqueIdentifierPrimaryPurpose, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.T2_ControllingHeadquarters, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.W_DateTimeGroupDtg, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.W1_DateTimeGroupDtgPeriod, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.Y_Location, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AM_Distance, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AN_Azimuth, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AP_TargetNumber, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AP1_TargetNumberExtension, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AS_Country, GuideType.SYSTEM)
        );
    }

    @Override
    public List<IStandardAmplifierItem> getAmplifiers() {
        return Arrays.asList(UnitEchelon.values());
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
        return Arrays.asList(ControlMeasureSectorOneModifier.values());
    }

    @Override
    public List<ISectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(ControlMeasureSectorTwoModifier.values());
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
        return false;
    }

}