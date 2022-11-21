package nz.co.ctg.jmsfx.model.dismountedindividual;

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
import nz.co.ctg.jmsfx.model.UnitEchelon;
import nz.co.ctg.jmsfx.model.LeadershipRole;
import nz.co.ctg.jmsfx.model.StandardRank;
import nz.co.ctg.jmsfx.model.StandardServiceTier;

public class DismountedIndividualSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new DismountedIndividualSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(DismountedIndividualEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(DismountedIndividualEntityType.values()), EntityType::getEntity);
    private static final Multimap<EntityType, EntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(DismountedIndividualEntitySubType.values()), EntitySubType::getEntityType);

    private DismountedIndividualSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide("C", Amplifier.Quantity, 180, 548, 252, 96),
            new AmplifierGuide("G", Amplifier.StaffComments, 440, 248, 168, 96),
            new AmplifierGuide("H", Amplifier.AdditionalInformation, 440, 344, 168, 96),
            new AmplifierGuide("J", Amplifier.EvaluationRating, 440, 536, 168, 96),
            new AmplifierGuide("K", Amplifier.CombatEffectiveness, 440, 536, 168, 96),
            new AmplifierGuide("M", Amplifier.HigherFormation, 440, 440, 168, 96),
            new AmplifierGuide("P", Amplifier.IFFSIFAIS, 440, 536, 168, 96),
            new AmplifierGuide("T", Amplifier.UniqueDesignation, 4, 440, 168, 96),
            new AmplifierGuide("V", Amplifier.Type, 4, 344, 168, 96),
            new AmplifierGuide("W", Amplifier.DateTimeGroupDTG, 4, 152, 168, 96),
            new AmplifierGuide("X", Amplifier.AltitudeDepth, 4, 248, 168, 96),
            new AmplifierGuide("Y", Amplifier.Location, 4, 248, 168, 96),
            new AmplifierGuide("Z", Amplifier.Speed, 4, 536, 168, 96),
            new AmplifierGuide("AF", Amplifier.CommonIdentifier, 4, 344, 168, 96),
            new AmplifierGuide("AS", Amplifier.Country, 440, 152, 168, 96)
        );
    }

    @Override
    public List<AmplifierGroup> getAmplifiers() {
        return Arrays.asList(UnitEchelon.values());
    }

    @Override
    public List<AmplifierGroup> getAmplifiersTwo() {
        return Arrays.asList(LeadershipRole.values());
    }

    @Override
    public List<AmplifierGroup> getAmplifiersThree() {
        return Arrays.asList(StandardRank.values());
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
    public List<AmplifierGroup> getFrameAmplifiers() {
        return Arrays.asList(StandardServiceTier.values());
    }

    @Override
    public List<SectorOneModifier> getSectorOneModifiers() {
        return Arrays.asList(DismountedIndividualSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(DismountedIndividualSectorTwoModifier.values());
    }

    @Override
    public List<EntitySubType> getSpecialEntitySubTypes() {
        return Collections.emptyList();
    }

    @Override
    public boolean isAmplifierPresent() {
        return true;
    }

    @Override
    public boolean isAmplifierTwoPresent() {
        return true;
    }

    @Override
    public boolean isAmplifierThreePresent() {
        return true;
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
        return true;
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
    public boolean isSpecialEntitySubTypePresent() {
        return false;
    }

}
