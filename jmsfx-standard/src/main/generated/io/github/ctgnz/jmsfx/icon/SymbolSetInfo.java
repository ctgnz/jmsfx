package io.github.ctgnz.jmsfx.icon;

import java.util.List;

public interface SymbolSetInfo {

    List<AmplifierGuide> getAmplifierGuides();

    <A extends ListAmplifier> List<A> getAmplifiers();

    <A extends ListAmplifier> List<A> getAmplifiersTwo();

    <A extends ListAmplifier> List<A> getAmplifiersThree();

    <A extends ListAmplifier> List<A> getFrameAmplifiers();

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