package io.github.ctgnz.jmsfx.icon.controlmeasure;

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
import io.github.ctgnz.jmsfx.icon.amplifier.UnitEchelon;

public class ControlMeasureSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new ControlMeasureSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(ControlMeasureEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(ControlMeasureEntityType.values()), EntityType::getEntity);
    private static final Multimap<EntityType, EntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(ControlMeasureEntitySubType.values()), EntitySubType::getEntityType);

    private ControlMeasureSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
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
    public List<ListAmplifier> getAmplifiers() {
        return Arrays.asList(UnitEchelon.values());
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
        return Arrays.asList(ControlMeasureSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
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
