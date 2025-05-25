package nz.co.ctg.jmsfx.model.minewarfare;

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

public class MineWarfareSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new MineWarfareSymbolSetInfo();
    private static final List<Entity> ENTITIES = Arrays.asList(MineWarfareEntity.values());
    private static final Multimap<Entity, EntityType> ENTITY_TYPES = Multimaps.index(Arrays.asList(MineWarfareEntityType.values()), EntityType::getEntity);
    private static final Multimap<EntityType, EntitySubType> ENTITY_SUB_TYPES = Multimaps.index(Arrays.asList(MineWarfareEntitySubType.values()), EntitySubType::getEntityType);

    private MineWarfareSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Arrays.asList(
            new AmplifierGuide(Amplifier.G_StaffComments, 478, 466, 134, 96),
            new AmplifierGuide(Amplifier.H_AdditionalInformation, 478, 466, 134, 96),
            new AmplifierGuide(Amplifier.P_IffSifAis, 478, 370, 134, 96),
            new AmplifierGuide(Amplifier.T_UniqueDesignation, 478, 178, 134, 96),
            new AmplifierGuide(Amplifier.V_TypeOfEquipment, 478, 274, 134, 96),
            new AmplifierGuide(Amplifier.X_AltitudeDepth, 478, 370, 134, 96),
            new AmplifierGuide(Amplifier.Y_Location, 478, 562, 134, 96),
            new AmplifierGuide(Amplifier.Z_Speed, 478, 562, 134, 96),
            new AmplifierGuide(Amplifier.AL_OperationalCondition, 142, 592, 328, 96),
            new AmplifierGuide(Amplifier.AO_EngagementBar, 134, 178, 344, 96),
            new AmplifierGuide(Amplifier.AR_SpecialDesignator, 0, 178, 134, 96),
            new AmplifierGuide(Amplifier.AS_Country, 478, 178, 134, 96),
            new AmplifierGuide(Amplifier.AJ_SpeedLeader, 16, 467, 161, 91)
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
        return Collections.emptyList();
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
        return false;
    }

    @Override
    public boolean isSectorTwoModifierPresent() {
        return false;
    }

}
