package io.github.ctgnz.jmsfx;

import java.util.List;

import io.github.ctgnz.jmsfx.types.GeometryType;

public interface SymbolSet extends CodeElement {

    AmplifierGuide getAmplifierGuide(Amplifier amplifier);

    List<AmplifierGuide> getAmplifierGuides();

    List<StandardAmplifierItem> getAmplifierList();

    List<StandardAmplifierItem> getAmplifierListThree();

    List<StandardAmplifierItem> getAmplifierListTwo();

    Dimension getDimension();

    default String getDimensionId() {
        return getDimension().getId();
    }

    List<Entity> getEntities();

    List<StandardAmplifierItem> getFrameAmplifierList();

    String getFrameId();

    /**
     * Where this symbol set's frame is, and the key its parsed graphic is cached under.
     * <p>
     * A directory per part of the key - dimension, then identity, then status - rather than the four codes run together that this was before jmsfx#136. The civilian suffix stays a
     * suffix rather than a directory: since jmsfx#123 no such file exists, and it is here only to keep a recoloured frame in its own cache entry.
     */
    default String getFrameKey(StandardIdentity identity, Status status, boolean civilianEntity) {
        return String.format("/svg/Frames/%s/%s/%s%s.svg", getDimension().getName(), identity.getName(), status.getFrameName(identity),
            civilianEntity ? "_CIVILIAN" : "");
    }

    String getGraphicLocation();

    List<SectorOneModifier> getSectorOneModifiers();

    List<SectorTwoModifier> getSectorTwoModifiers();

    SymbolSetInfo getSymbolSetInfo();

    default boolean isPointGeometry() {
        return getDimension().getGeometryType() == GeometryType.POINT_GEOMETRY;
    }

}
