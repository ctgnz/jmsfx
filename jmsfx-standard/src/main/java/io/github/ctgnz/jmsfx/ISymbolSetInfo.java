package io.github.ctgnz.jmsfx;

import java.util.List;

import io.github.ctgnz.jmsfx.icon.AmplifierGuide;

public interface ISymbolSetInfo {

    List<AmplifierGuide> getAmplifierGuides();

    <A extends IStandardAmplifierItem> List<A> getAmplifiers();

    <A extends IStandardAmplifierItem> List<A> getAmplifiersTwo();

    <A extends IStandardAmplifierItem> List<A> getAmplifiersThree();

    <A extends IStandardAmplifierItem> List<A> getFrameAmplifiers();

    <E extends IEntity> List<E> getEntities();

    <E extends IEntitySubType> List<E> getEntitySubTypes(IEntityType entityType);

    <E extends IEntityType> List<E> getEntityTypes(IEntity entity);

    <M extends ISectorOneModifier>List<M> getSectorOneModifiers();

    <M extends ISectorTwoModifier>List<M> getSectorTwoModifiers();

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