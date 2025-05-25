package nz.co.ctg.jmsfx.model.activity;

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

public class ActivitySymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new ActivitySymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(ActivityEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(ActivityEntityType.values()), EntityType::getEntity);
    private static final Multimap<EntityType, EntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(ActivityEntitySubType.values()), EntitySubType::getEntityType);

    private ActivitySymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.G_StaffComments, 486, 276, 126, 80),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, 486, 356, 126, 80),
            new AmplifierGuide(Amplifier.J_EvaluationRating, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, 0, 356, 126, 80),
            new AmplifierGuide(Amplifier.W_DateTimeGroupDtg, 0, 196, 126, 80),
            new AmplifierGuide(Amplifier.Y_Location, 0, 276, 126, 80),
            new AmplifierGuide(Amplifier.AS_Country, 486, 196, 126, 80),
            new AmplifierGuide(Amplifier.Q_DirectionOfMovementIndicator, 123, 83, 364, 193),
            new AmplifierGuide(Amplifier.S2_OffsetLocationIndicator, 123, 83, 364, 193)
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
        return Lists.newArrayList(ENTITY_SUB_TYPES.get(entityType));
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
        return Arrays.asList(ActivitySectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
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
        return false;
    }

}
