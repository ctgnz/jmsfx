package nz.co.ctg.jmsfx.model.cyberspacedismountedindividual;

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

public class CyberspaceDismountedIndividualSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new CyberspaceDismountedIndividualSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(CyberspaceDismountedIndividualEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(CyberspaceDismountedIndividualEntityType.values()), EntityType::getEntity);

    private CyberspaceDismountedIndividualSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.C_Quantity, 205, 546, 200, 96),
            new AmplifierGuide(Amplifier.AV_LeadershipIdentifier, 176, 208, 259, 76),
            new AmplifierGuide(Amplifier.AB_FeintDummyIndicator, 124, 176, 367, 108),
            new AmplifierGuide(Amplifier.G_StaffComments, 478, 248, 134, 96),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, 478, 344, 134, 96),
            new AmplifierGuide(Amplifier.J_EvaluationRating, 478, 536, 134, 96),
            new AmplifierGuide(Amplifier.K_CombatEffectiveness, 478, 536, 134, 96),
            new AmplifierGuide(Amplifier.M_HigherFormation, 478, 440, 134, 96),
            new AmplifierGuide(Amplifier.P_IffSifAis, 478, 536, 134, 96),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, 0, 440, 134, 96),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, 0, 344, 134, 96),
            new AmplifierGuide(Amplifier.W_DateTimeGroupDtg, 0, 152, 134, 96),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, 0, 248, 134, 96),
            new AmplifierGuide(Amplifier.Y_Location, 0, 248, 134, 96),
            new AmplifierGuide(Amplifier.Z_Speed, 0, 536, 134, 96),
            new AmplifierGuide(Amplifier.AF_CommonIdentifier, 0, 344, 134, 96),
            new AmplifierGuide(Amplifier.AS_Country, 478, 152, 134, 96)
        );
    }

    @Override
    public List<AmplifierGroup> getAmplifiers() {
        return Collections.emptyList();
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
        return Collections.emptyList();
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
        return Arrays.asList(CyberspaceDismountedIndividualSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(CyberspaceDismountedIndividualSectorTwoModifier.values());
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
