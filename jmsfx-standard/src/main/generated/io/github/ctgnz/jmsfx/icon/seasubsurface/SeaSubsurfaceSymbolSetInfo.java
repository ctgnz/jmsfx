package io.github.ctgnz.jmsfx.icon.seasubsurface;

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

public class SeaSubsurfaceSymbolSetInfo implements ISymbolSetInfo {
    public static final ISymbolSetInfo INSTANCE = new SeaSubsurfaceSymbolSetInfo();
    private static final List<IEntity> ENTITIES = Arrays.asList(SeaSubsurfaceEntity.values());
    private static final Multimap<IEntity, IEntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(SeaSubsurfaceEntityType.values()), IEntityType::getEntity);
    private static final Multimap<IEntityType, IEntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(SeaSubsurfaceEntitySubType.values()), IEntitySubType::getEntityType);

    private SeaSubsurfaceSymbolSetInfo() {
    }

    @Override
    public List<IAmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.G_StaffComments, GuideType.RECTANGLE, 478, 466, 134, 96),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, GuideType.RECTANGLE, 478, 466, 134, 96),
            new AmplifierGuide(Amplifier.P_IffSifAis, GuideType.RECTANGLE, 478, 370, 134, 96),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, GuideType.RECTANGLE, 478, 178, 134, 96),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, GuideType.RECTANGLE, 478, 274, 134, 96),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, GuideType.RECTANGLE, 478, 370, 134, 96),
            new AmplifierGuide(Amplifier.Y_Location, GuideType.RECTANGLE, 478, 562, 134, 96),
            new AmplifierGuide(Amplifier.Z_Speed, GuideType.RECTANGLE, 478, 562, 134, 96),
            new AmplifierGuide(Amplifier.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AJ_SpeedLeader, GuideType.LINE, 197.657, 458.077, 17.069, 557.214),
            new AmplifierGuide(Amplifier.AL_OperationalCondition, GuideType.RECTANGLE, 142, 592, 328, 96),
            new AmplifierGuide(Amplifier.AO_EngagementBar, GuideType.RECTANGLE, 134, 178, 344, 96),
            new AmplifierGuide(Amplifier.AO1_TargetDesignation, GuideType.SYSTEM),
            new AmplifierGuide(Amplifier.AR_SpecialDesignator, GuideType.RECTANGLE, 0, 178, 134, 96),
            new AmplifierGuide(Amplifier.AS_Country, GuideType.RECTANGLE, 478, 178, 134, 96)
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
        return Arrays.asList(SeaSubsurfaceSectorOneModifier.values());
    }

    @Override
    public List<ISectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(SeaSubsurfaceSectorTwoModifier.values());
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
        return true;
    }

    @Override
    public boolean isFramedIcon() {
        return true;
    }

}