package io.github.ctgnz.jmsfx;

import java.util.List;

import io.github.ctgnz.jmsfx.icon.AmplifierGuide;
import io.github.ctgnz.jmsfx.icon.Dimension;

public interface ISymbolSet extends ICodeElement {

    List<AmplifierGuide> getAmplifierGuides();

    AmplifierGuide getAmplifierGuide(IAmplifier amplifier);

    <A extends IStandardAmplifierItem> List<A> getAmplifierList();

    <A extends IStandardAmplifierItem> List<A> getAmplifierListTwo();

    <A extends IStandardAmplifierItem> List<A> getAmplifierListThree();

    Dimension getDimension();

    <E extends IEntity> List<E> getEntities();

    <A extends IStandardAmplifierItem> List<A> getFrameAmplifierList();

    String getFrameId();

    String getGraphicLocation();

    <M extends ISectorOneModifier> List<M> getSectorOneModifiers();

    <M extends ISectorTwoModifier> List<M> getSectorTwoModifiers();

    ISymbolSetInfo getSymbolSetInfo();

}
