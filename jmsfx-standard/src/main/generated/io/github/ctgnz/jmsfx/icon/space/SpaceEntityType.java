package io.github.ctgnz.jmsfx.icon.space;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum SpaceEntityType implements IEntityType {
    SPACE_VEHICLE("01", "Space Vehicle", SpaceEntity.MILITARY, GraphicType.MAIN),
    RE_ENTRY_VEHICLE("02", "Re-Entry Vehicle", SpaceEntity.MILITARY, GraphicType.MAIN),
    PLANET_LANDER("03", "Planet Lander", SpaceEntity.MILITARY, GraphicType.MAIN),
    ORBITER_SHUTTLE("04", "Orbiter Shuttle", SpaceEntity.MILITARY, GraphicType.MAIN),
    CAPSULE("05", "Capsule", SpaceEntity.MILITARY, GraphicType.MAIN),
    GENERAL_SATELLITE("06", "Satellite, General", SpaceEntity.MILITARY, GraphicType.MAIN),
    SATELLITE("07", "Satellite", SpaceEntity.MILITARY, GraphicType.MAIN),
    ANTISATELLITE_WEAPON("08", "Antisatellite Weapon", SpaceEntity.MILITARY, GraphicType.MAIN),
    ASTRONOMICAL_SATELLITE("09", "Astronomical Satellite", SpaceEntity.MILITARY, GraphicType.MAIN),
    BIOSATELLITE("10", "Biosatellite", SpaceEntity.MILITARY, GraphicType.MAIN),
    COMMUNICATIONS_SATELLITE("11", "Communications Satellite", SpaceEntity.MILITARY, GraphicType.MAIN),
    EARTH_OBSERVATION_SATELLITE("12", "Earth Observation Satellite", SpaceEntity.MILITARY, GraphicType.MAIN),
    MINIATURIZED_SATELLITE("13", "Miniaturized Satellite", SpaceEntity.MILITARY, GraphicType.MAIN),
    NAVIGATIONAL_SATELLITE("14", "Navigational Satellite", SpaceEntity.MILITARY, GraphicType.MAIN),
    RECONNAISSANCE_SATELLITE("15", "Reconnaissance Satellite", SpaceEntity.MILITARY, GraphicType.MAIN),
    SPACE_STATION("16", "Space Station", SpaceEntity.MILITARY, GraphicType.MAIN),
    TETHERED_SATELLITE("17", "Tethered Satellite", SpaceEntity.MILITARY, GraphicType.MAIN),
    WEATHER_SATELLITE("18", "Weather Satellite", SpaceEntity.MILITARY, GraphicType.MAIN),
    SPACE_LAUNCHED_VEHICLE("19", "Space Launched Vehicle (SLV)", SpaceEntity.MILITARY, GraphicType.MAIN),
    CIV_ORBITER_SHUTTLE("01", "Orbiter Shuttle", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_CAPSULE("02", "Capsule", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_SATELLITE("03", "Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_ASTRONOMICAL_SATELLITE("04", "Astronomical Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_BIOSATELLITE("05", "Biosatellite", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_COMMUNICATIONS_SATELLITE("06", "Communications Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_EARTH_OBSERVATION_SATELLITE("07", "Earth Observation Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_MINIATURIZED_SATELLITE("08", "Miniaturized Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_NAVIGATIONAL_SATELLITE("09", "Navigational Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_SPACE_STATION("10", "Space Station", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_TETHERED_SATELLITE("11", "Tethered Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_WEATHER_SATELLITE("12", "Weather Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_PLANET_LANDER("13", "Planet Lander", SpaceEntity.CIVILIAN, GraphicType.MAIN),
    CIV_SPACE_VEHICLE("14", "Space Vehicle", SpaceEntity.CIVILIAN, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final SpaceEntity entity;
    private final GraphicType graphicType;

    SpaceEntityType(String id, String label, SpaceEntity entity, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public IEntity getEntity() {
        return entity;
    }

}