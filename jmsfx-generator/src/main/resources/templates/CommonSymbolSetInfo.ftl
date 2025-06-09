package ${commonPackage};

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ${basePackage}.IEntity;
import ${basePackage}.IEntitySubType;
import ${basePackage}.IEntityType;
import ${basePackage}.IStandardAmplifierItem;
import ${basePackage}.ISectorOneModifier;
import ${basePackage}.ISectorTwoModifier;
import ${basePackage}.ISymbolSetInfo;
import ${basePackage}.IAmplifierGuide;

public class CommonSymbolSetInfo implements ISymbolSetInfo {
    public static final ISymbolSetInfo INSTANCE = new CommonSymbolSetInfo();

    CommonSymbolSetInfo() {
    }

    @Override
    public List<IAmplifierGuide> getAmplifierGuides() {
        return Collections.emptyList();
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
        return Collections.emptyList();
    }

    @Override
    public List<IEntitySubType> getEntitySubTypes(IEntityType entityType) {
        return Collections.emptyList();
    }

    @Override
    public List<IEntityType> getEntityTypes(IEntity entity) {
        return Collections.emptyList();
    }

    @Override
    public List<IStandardAmplifierItem> getFrameAmplifiers() {
        return Collections.emptyList();
    }

    @Override
    public List<ISectorOneModifier> getSectorOneModifiers() {
        return Arrays.asList(CommonSectorOneModifier.values());
    }

    @Override
    public List<ISectorTwoModifier> getSectorTwoModifiers() {
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