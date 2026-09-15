package io.github.ctgnz.jmsfx;

import java.util.List;

public interface SymbolSetInfo {

    List<AmplifierGuide> getAmplifierGuides();

    List<StandardAmplifierItem> getAmplifiers();

    List<StandardAmplifierItem> getAmplifiersTwo();

    List<StandardAmplifierItem> getAmplifiersThree();

    List<StandardAmplifierItem> getFrameAmplifiers();

    List<Entity> getEntities();

    List<EntitySubType> getEntitySubTypes(EntityType entityType);

    List<EntityType> getEntityTypes(Entity entity);

    List<SectorOneModifier> getSectorOneModifiers();

    List<SectorTwoModifier> getSectorTwoModifiers();

    boolean isAmplifierPresent();

    boolean isAmplifierTwoPresent();

    boolean isAmplifierThreePresent();

    boolean isFrameAmplifierPresent();

    boolean isEntitySubTypePresent();

    boolean isEntityTypePresent();

    boolean isSectorOneModifierPresent();

    boolean isSectorTwoModifierPresent();

    boolean isFramedIcon();

}