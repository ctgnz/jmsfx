package io.github.ctgnz.jmsfx.icon.activity;

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

public class ActivitySymbolSetInfo implements ISymbolSetInfo {
    public static final ISymbolSetInfo INSTANCE = new ActivitySymbolSetInfo();
    private static final List<IEntity> ENTITIES = Arrays.asList(ActivityEntity.values());
    private static final Multimap<IEntity, IEntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(ActivityEntityType.values()), IEntityType::getEntity);
    private static final Multimap<IEntityType, IEntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(ActivityEntitySubType.values()), IEntitySubType::getEntityType);

    private ActivitySymbolSetInfo() {
    }

    @Override
    public List<IAmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.G_StaffComments, GuideType.RECTANGLE, 486, 276, 126, 80),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, GuideType.RECTANGLE, 486, 356, 126, 80),
            new AmplifierGuide(Amplifier.J_EvaluationRating, GuideType.RECTANGLE, 486, 516, 126, 80),
            new AmplifierGuide(Amplifier.Q_DirectionOfMovementIndicator, GuideType.RECTANGLE, 306.602, 518.205, 306.602, 578.661, 210.072, 637.723),
            new AmplifierGuide(Amplifier.S2_OffsetLocationIndicator, GuideType.RECTANGLE, 126.082, 514.75, 126.082, 759.796, 0, 792),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, GuideType.RECTANGLE, 0, 356, 126, 80),
            new AmplifierGuide(Amplifier.W_DateTimeGroupDtg, GuideType.RECTANGLE, 0, 196, 126, 80),
            new AmplifierGuide(Amplifier.Y_Location, GuideType.RECTANGLE, 0, 276, 126, 80),
            new AmplifierGuide(Amplifier.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AS_Country, GuideType.RECTANGLE, 486, 196, 126, 80)
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
        return Arrays.asList(ActivitySectorOneModifier.values());
    }

    @Override
    public List<ISectorTwoModifier> getSectorTwoModifiers() {
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

    @Override
    public boolean isFramedIcon() {
        return true;
    }

}