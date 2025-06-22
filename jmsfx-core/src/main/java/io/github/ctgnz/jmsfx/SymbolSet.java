package io.github.ctgnz.jmsfx;

import java.util.List;

public interface SymbolSet extends CodeElement {

    AmplifierGuide getAmplifierGuide(Amplifier amplifier);

    List<AmplifierGuide> getAmplifierGuides();

    <A extends StandardAmplifierItem> List<A> getAmplifierList();

    <A extends StandardAmplifierItem> List<A> getAmplifierListThree();

    <A extends StandardAmplifierItem> List<A> getAmplifierListTwo();

    Dimension getDimension();

    default String getDimensionId() {
        return getDimension().getId();
    }

    <E extends Entity> List<E> getEntities();

    <A extends StandardAmplifierItem> List<A> getFrameAmplifierList();

    String getFrameId();

    default String getFrameLocation(StandardIdentity identity, Status status, boolean civilianEntity) {
        return String.format("/svg/Frames/0_%s%s_%s%s.svg", identity.getId(), getFrameId(), status.getFrameId(identity), civilianEntity ? "c" : "");
    }

    String getGraphicLocation();

    <M extends SectorOneModifier> List<M> getSectorOneModifiers();

    <M extends SectorTwoModifier> List<M> getSectorTwoModifiers();

    SymbolSetInfo getSymbolSetInfo();

}
