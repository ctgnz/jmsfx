package nz.co.ctg.jmsfx.model.cyberspacelandinstallation;

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

public class CyberspaceLandInstallationSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new CyberspaceLandInstallationSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(CyberspaceLandInstallationEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(CyberspaceLandInstallationEntityType.values()), EntityType::getEntity);

    private CyberspaceLandInstallationSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.G_StaffComments, 486, 276, 126, 80),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, 486, 356, 126, 80),
            new AmplifierGuide(Amplifier.J_EvaluationRating, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.K_CombatEffectiveness, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.M_HigherFormation, 486, 436, 126, 80),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, 0, 436, 126, 80),
            new AmplifierGuide(Amplifier.W_DateTimeGroupDtg, 0, 196, 126, 80),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, 0, 276, 126, 80),
            new AmplifierGuide(Amplifier.Y_Location, 0, 276, 126, 80),
            new AmplifierGuide(Amplifier.AE_EquipmentTeardownTime, 486, 356, 126, 80),
            new AmplifierGuide(Amplifier.AL_OperationalCondition, 130, 600, 350, 80),
            new AmplifierGuide(Amplifier.AS_Country, 486, 196, 126, 80),
            new AmplifierGuide(Amplifier.AT_CapacityOfInstallation, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.AX_InstallationComposition, 0, 356, 126, 80),
            new AmplifierGuide(Amplifier.S_HeadquartersStaffIndicator, 123, 83, 364, 193),
            new AmplifierGuide(Amplifier.S2_OffsetLocationIndicator, 123, 83, 364, 193),
            new AmplifierGuide(Amplifier.AB_FeintDummyIndicator, 123, 83, 364, 193)
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
        return Arrays.asList(CyberspaceLandInstallationSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(CyberspaceLandInstallationSectorTwoModifier.values());
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
