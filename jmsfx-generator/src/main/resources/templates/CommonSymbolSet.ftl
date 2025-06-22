package ${commonPackage};

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ${basePackage}.Entity;
import ${basePackage}.EntitySubType;
import ${basePackage}.EntityType;
import ${basePackage}.StandardAmplifierItem;
import ${basePackage}.SectorOneModifier;
import ${basePackage}.SectorTwoModifier;
import ${basePackage}.SymbolSetInfo;
import ${basePackage}.AmplifierGuide;
import ${iconPackage}.unknown.UnknownEntity;

public class CommonSymbolSet implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new CommonSymbolSet();

    CommonSymbolSet() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Collections.emptyList();
    }

    @Override
    public List<StandardAmplifierItem> getAmplifiers() {
        return Collections.emptyList();
    }

    @Override
    public List<StandardAmplifierItem> getAmplifiersTwo() {
        return Collections.emptyList();
    }

    @Override
    public List<StandardAmplifierItem> getAmplifiersThree() {
        return Collections.emptyList();
    }

    @Override
    public List<Entity> getEntities() {
        return Collections.singletonList(UnknownEntity.UNSPECIFIED);
    }

    @Override
    public List<EntitySubType> getEntitySubTypes(EntityType entityType) {
        return Collections.emptyList();
    }

    @Override
    public List<EntityType> getEntityTypes(Entity entity) {
        return Collections.emptyList();
    }

    @Override
    public List<StandardAmplifierItem> getFrameAmplifiers() {
        return Collections.emptyList();
    }

    @Override
    public List<SectorOneModifier> getSectorOneModifiers() {
        return Arrays.asList(CommonSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(CommonSectorTwoModifier.values());
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
        return false;
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
        return false;
    }

}