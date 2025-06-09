package io.github.ctgnz.jmsfx.icon.cyberspaceseasurface;

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

public class CyberspaceSeaSurfaceSymbolSetInfo implements ISymbolSetInfo {
    public static final ISymbolSetInfo INSTANCE = new CyberspaceSeaSurfaceSymbolSetInfo();
    private static final List<IEntity> ENTITIES = Arrays.asList(CyberspaceSeaSurfaceEntity.values());
    private static final Multimap<IEntity, IEntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(CyberspaceSeaSurfaceEntityType.values()), IEntityType::getEntity);

    private CyberspaceSeaSurfaceSymbolSetInfo() {
    }

    @Override
    public List<IAmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.B_Echelon, GuideType.RECTANGLE, 205, 192, 200, 80),
            new AmplifierGuide(Amplifier.C_Quantity, GuideType.RECTANGLE, 205, 192, 200, 80),
            new AmplifierGuide(Amplifier.D_TaskForceIndicator, GuideType.RECTANGLE, 205, 192, 200, 80),
            new AmplifierGuide(Amplifier.F_ReinforcedOrReduced, GuideType.RECTANGLE, 486, 196, 126, 80),
            new AmplifierGuide(Amplifier.G_StaffComments, GuideType.RECTANGLE, 486, 276, 126, 80),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, GuideType.RECTANGLE, 486, 356, 126, 80),
            new AmplifierGuide(Amplifier.K_CombatEffectiveness, GuideType.RECTANGLE, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.L_SignatureEquipment, GuideType.RECTANGLE, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.M_HigherFormation, GuideType.RECTANGLE, 486, 436, 126, 80),
            new AmplifierGuide(Amplifier.P_IffSifAis, GuideType.RECTANGLE, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.S_HeadquartersStaffIndicator, GuideType.LINE, 126.082, 514.75, 126.082, 759.658),
            new AmplifierGuide(Amplifier.S2_OffsetLocationIndicator, GuideType.LINE, 127.671, 759.934, 0, 792),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, GuideType.RECTANGLE, 0, 436, 126, 80),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, GuideType.RECTANGLE, 0, 356, 126, 80),
            new AmplifierGuide(Amplifier.W_DateTimeGroupDtg, GuideType.RECTANGLE, 0, 196, 126, 80),
            new AmplifierGuide(Amplifier.Y_Location, GuideType.RECTANGLE, 0, 276, 126, 80),
            new AmplifierGuide(Amplifier.AA_NamedC2Headquarters, GuideType.RECTANGLE, 205.444, 346, 200, 98),
            new AmplifierGuide(Amplifier.AB_FeintDummyIndicator, GuideType.POLYGON, 126.082, 276, 304.754, 80, 486, 276),
            new AmplifierGuide(Amplifier.AD_PlatformType, GuideType.RECTANGLE, 0, 356, 126, 80),
            new AmplifierGuide(Amplifier.AE_EquipmentTeardownTime, GuideType.RECTANGLE, 0, 356, 126, 80),
            new AmplifierGuide(Amplifier.AF_CommonIdentifier, GuideType.RECTANGLE, 486, 356, 126, 80),
            new AmplifierGuide(Amplifier.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AL_OperationalCondition, GuideType.RECTANGLE, 132, 520, 348, 80),
            new AmplifierGuide(Amplifier.AO_EngagementBar, GuideType.RECTANGLE, 130, 5, 350, 80),
            new AmplifierGuide(Amplifier.AO1_TargetDesignation, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AR_SpecialDesignator, GuideType.RECTANGLE, 0, 196, 126, 80),
            new AmplifierGuide(Amplifier.AS_Country, GuideType.RECTANGLE, 486, 196, 126, 80),
            new AmplifierGuide(Amplifier.AW_HeadquartersElement, GuideType.RECTANGLE, 185, 520, 240, 80),
            new AmplifierGuide(Amplifier.AY_NetworkIdentifier, GuideType.RECTANGLE, 0, 516, 126, 80)
        );
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
        return Collections.emptyList();
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
        return Arrays.asList(CyberspaceSeaSurfaceSectorOneModifier.values());
    }

    @Override
    public List<ISectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(CyberspaceSeaSurfaceSectorTwoModifier.values());
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