package io.github.ctgnz.jmsfx;

import java.util.List;

import io.github.ctgnz.jmsfx.icon.AmplifierGuide;
import io.github.ctgnz.jmsfx.icon.Dimension;

public interface ISymbolSet extends ICodeElement {

    List<AmplifierGuide> getAmplifierGuides();

    AmplifierGuide getAmplifierGuide(IAmplifier amplifier);

    <A extends IListAmplifier> List<A> getListAmplifiers();

    <A extends IListAmplifier> List<A> getAmplifierTwoGroups();

    <A extends IListAmplifier> List<A> getAmplifierThreeGroups();

    Dimension getDimension();

    <E extends IEntity> List<E> getEntities();

    <A extends IListAmplifier> List<A> getFrameListAmplifiers();

    String getFrameId();

    String getGraphicLocation();

    <M extends ISectorOneModifier> List<M> getSectorOneModifiers();

    <M extends ISectorTwoModifier> List<M> getSectorTwoModifiers();

    ISymbolSetInfo getSymbolSetInfo();

}
