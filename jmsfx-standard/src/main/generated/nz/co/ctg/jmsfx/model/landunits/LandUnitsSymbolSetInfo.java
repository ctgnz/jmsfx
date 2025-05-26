package nz.co.ctg.jmsfx.model.landunits;

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
import nz.co.ctg.jmsfx.model.amplifier.UnitEchelon;

public class LandUnitsSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new LandUnitsSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(LandUnitsEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(LandUnitsEntityType.values()), EntityType::getEntity);
    private static final Multimap<EntityType, EntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(LandUnitsEntitySubType.values()), EntitySubType::getEntityType);

    private LandUnitsSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.B_Echelon, 205, 192, 200, 80),
            new AmplifierGuide(Amplifier.C_Quantity, 205, 192, 200, 80),
            new AmplifierGuide(Amplifier.D_TaskForceIndicator, 205, 192, 200, 80),
            new AmplifierGuide(Amplifier.F_ReinforcedOrReduced, 486, 196, 126, 80),
            new AmplifierGuide(Amplifier.G_StaffComments, 486, 276, 126, 80),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, 486, 356, 126, 80),
            new AmplifierGuide(Amplifier.J_EvaluationRating, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.K_CombatEffectiveness, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.M_HigherFormation, 486, 436, 126, 80),
            new AmplifierGuide(Amplifier.P_IffSifAis, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.R_MobilityIndicator, 185, 520, 240, 80),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, 0, 436, 126, 80),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, 0, 356, 126, 80),
            new AmplifierGuide(Amplifier.W_DateTimeGroupDtg, 0, 196, 126, 80),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, 0, 276, 126, 80),
            new AmplifierGuide(Amplifier.Y_Location, 0, 276, 126, 80),
            new AmplifierGuide(Amplifier.Z_Speed, 0, 516, 126, 80),
            new AmplifierGuide(Amplifier.AD_PlatformType, 0, 356, 126, 80),
            new AmplifierGuide(Amplifier.AE_EquipmentTeardownTime, 0, 356, 126, 80),
            new AmplifierGuide(Amplifier.AF_CommonIdentifier, 486, 356, 126, 80),
            new AmplifierGuide(Amplifier.AL_OperationalCondition, 130, 600, 350, 80),
            new AmplifierGuide(Amplifier.AO_EngagementBar, 130, 5, 350, 80),
            new AmplifierGuide(Amplifier.AR_SpecialDesignator, 0, 196, 126, 80),
            new AmplifierGuide(Amplifier.AS_Country, 486, 196, 126, 80),
            new AmplifierGuide(Amplifier.AW_HeadquartersElement, 185, 520, 240, 80),
            new AmplifierGuide(Amplifier.Q_DirectionOfMovementIndicator, 123, 83, 364, 193),
            new AmplifierGuide(Amplifier.S_HeadquartersStaffIndicator, 123, 83, 364, 193),
            new AmplifierGuide(Amplifier.S2_OffsetLocationIndicator, 123, 83, 364, 193),
            new AmplifierGuide(Amplifier.AB_FeintDummyIndicator, 123, 83, 364, 193)
        );
    }

    @Override
    public List<EnumeratedAmplifier> getAmplifiers() {
        return Arrays.asList(UnitEchelon.values());
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
        return Arrays.asList(LandUnitsSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(LandUnitsSectorTwoModifier.values());
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
