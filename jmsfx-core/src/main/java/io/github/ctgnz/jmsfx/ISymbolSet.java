package io.github.ctgnz.jmsfx;

import java.util.List;

public interface ISymbolSet extends ICodeElement {

    IAmplifierGuide getAmplifierGuide(IAmplifier amplifier);

    List<IAmplifierGuide> getAmplifierGuides();

    <A extends IStandardAmplifierItem> List<A> getAmplifierList();

    <A extends IStandardAmplifierItem> List<A> getAmplifierListThree();

    <A extends IStandardAmplifierItem> List<A> getAmplifierListTwo();

    IDimension getDimension();

    default String getDimensionId() {
        return getDimension().getId();
    }

    <E extends IEntity> List<E> getEntities();

    <A extends IStandardAmplifierItem> List<A> getFrameAmplifierList();

    String getFrameId();

    String getGraphicLocation();

    <M extends ISectorOneModifier> List<M> getSectorOneModifiers();

    <M extends ISectorTwoModifier> List<M> getSectorTwoModifiers();

    ISymbolSetInfo getSymbolSetInfo();

}
