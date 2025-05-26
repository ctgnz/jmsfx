package nz.co.ctg.jmsfx.model.cyberspacelandequipment;

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

public class CyberspaceLandEquipmentSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new CyberspaceLandEquipmentSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(CyberspaceLandEquipmentEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(CyberspaceLandEquipmentEntityType.values()), EntityType::getEntity);

    private CyberspaceLandEquipmentSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.C_Quantity, 205, 190, 200, 60),
            new AmplifierGuide(Amplifier.G_StaffComments, 486, 250, 126, 90),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, 486, 340, 126, 90),
            new AmplifierGuide(Amplifier.J_EvaluationRating, 486, 520, 126, 90),
            new AmplifierGuide(Amplifier.K_CombatEffectiveness, 486, 520, 126, 90),
            new AmplifierGuide(Amplifier.L_SignatureEquipment, 486, 520, 126, 90),
            new AmplifierGuide(Amplifier.M_HigherFormation, 486, 430, 126, 90),
            new AmplifierGuide(Amplifier.N_HostileEnemy, 486, 520, 126, 90),
            new AmplifierGuide(Amplifier.P_IffSifAis, 486, 520, 126, 90),
            new AmplifierGuide(Amplifier.R_MobilityIndicator, 185, 542, 240, 90),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, 0, 430, 126, 90),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, 0, 340, 126, 90),
            new AmplifierGuide(Amplifier.W_DateTimeGroupDtg, 0, 160, 126, 90),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, 0, 250, 126, 90),
            new AmplifierGuide(Amplifier.Y_Location, 0, 250, 126, 90),
            new AmplifierGuide(Amplifier.Z_Speed, 0, 520, 126, 90),
            new AmplifierGuide(Amplifier.AD_PlatformType, 0, 340, 126, 90),
            new AmplifierGuide(Amplifier.AE_EquipmentTeardownTime, 486, 340, 126, 90),
            new AmplifierGuide(Amplifier.AF_CommonIdentifier, 0, 340, 126, 90),
            new AmplifierGuide(Amplifier.AL_OperationalCondition, 142, 632, 328, 80),
            new AmplifierGuide(Amplifier.AO_EngagementBar, 132, 5, 344, 80),
            new AmplifierGuide(Amplifier.AS_Country, 486, 160, 126, 90),
            new AmplifierGuide(Amplifier.Q_DirectionOfMovementIndicator, 123, 83, 364, 193),
            new AmplifierGuide(Amplifier.S2_OffsetLocationIndicator, 123, 83, 364, 193),
            new AmplifierGuide(Amplifier.AB_FeintDummyIndicator, 123, 83, 365, 168)
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
        return Arrays.asList(CyberspaceLandEquipmentSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(CyberspaceLandEquipmentSectorTwoModifier.values());
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
