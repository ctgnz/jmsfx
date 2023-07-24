package nz.co.ctg.jmsfx.model.signalsintelligenceland;

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

public class SignalsIntelligenceLandSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new SignalsIntelligenceLandSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(SignalsIntelligenceLandEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(SignalsIntelligenceLandEntityType.values()), EntityType::getEntity);

    private SignalsIntelligenceLandSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide("C", Amplifier.Quantity, 205, 192, 200, 80),
            new AmplifierGuide("F", Amplifier.ReinforcedOrReduced, 486, 196, 126, 80),
            new AmplifierGuide("G", Amplifier.StaffComments, 486, 276, 126, 80),
            new AmplifierGuide("H", Amplifier.AdditionalInformation, 486, 356, 126, 80),
            new AmplifierGuide("J", Amplifier.EvaluationRating, 486, 516, 126, 80),
            new AmplifierGuide("K", Amplifier.CombatEffectiveness, 486, 516, 126, 80),
            new AmplifierGuide("M", Amplifier.HigherFormation, 486, 436, 126, 80),
            new AmplifierGuide("P", Amplifier.IFFSIFAIS, 486, 516, 126, 80),
            new AmplifierGuide("R", Amplifier.MobilityIndicator, 185, 520, 240, 80),
            new AmplifierGuide("T", Amplifier.UniqueDesignation, 0, 436, 126, 80),
            new AmplifierGuide("V", Amplifier.Type, 0, 356, 126, 80),
            new AmplifierGuide("W", Amplifier.DateTimeGroupDTG, 0, 196, 126, 80),
            new AmplifierGuide("X", Amplifier.AltitudeDepth, 0, 276, 126, 80),
            new AmplifierGuide("Y", Amplifier.Location, 0, 276, 126, 80),
            new AmplifierGuide("Z", Amplifier.Speed, 0, 516, 126, 80),
            new AmplifierGuide("AD", Amplifier.PlatformType, 0, 356, 126, 80),
            new AmplifierGuide("AE", Amplifier.EquipmentTeardownTime, 0, 356, 126, 80),
            new AmplifierGuide("AF", Amplifier.CommonIdentifier, 486, 356, 126, 80),
            new AmplifierGuide("AH", Amplifier.HeadquartersElement, 185, 520, 240, 80),
            new AmplifierGuide("AL", Amplifier.AreaOfUncertainty, 130, 600, 350, 80),
            new AmplifierGuide("AO", Amplifier.EngagementBar, 130, 5, 350, 80),
            new AmplifierGuide("AR", Amplifier.SpecialDesignator, 0, 196, 126, 80)
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
        return Arrays.asList(SignalsIntelligenceLandSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return Collections.emptyList();
    }

    @Override
    public List<EntitySubType> getSpecialEntitySubTypes() {
        return Collections.emptyList();
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
        return false;
    }

    @Override
    public boolean isSpecialEntitySubTypePresent() {
        return false;
    }

}
