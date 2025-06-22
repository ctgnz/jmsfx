package io.github.ctgnz.jmsfx;

import java.util.List;

public interface SymbolSetInfo {

    <G extends AmplifierGuide> List<G> getAmplifierGuides();

    <A extends StandardAmplifierItem> List<A> getAmplifiers();

    <A extends StandardAmplifierItem> List<A> getAmplifiersTwo();

    <A extends StandardAmplifierItem> List<A> getAmplifiersThree();

    <A extends StandardAmplifierItem> List<A> getFrameAmplifiers();

    <E extends Entity> List<E> getEntities();

    <E extends EntitySubType> List<E> getEntitySubTypes(EntityType entityType);

    <E extends EntityType> List<E> getEntityTypes(Entity entity);

    <M extends SectorOneModifier>List<M> getSectorOneModifiers();

    <M extends SectorTwoModifier>List<M> getSectorTwoModifiers();

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