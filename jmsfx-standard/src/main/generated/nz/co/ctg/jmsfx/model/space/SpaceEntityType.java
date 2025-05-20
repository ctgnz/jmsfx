package nz.co.ctg.jmsfx.model.space;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum SpaceEntityType implements EntityType {
    SPACE_VEHICLE("01", "Space Vehicle", SpaceEntity.MILITARY, IconType.MAIN),
    RE_ENTRY_VEHICLE("02", "Re-Entry Vehicle", SpaceEntity.MILITARY, IconType.MAIN),
    PLANET_LANDER("03", "Planet Lander", SpaceEntity.MILITARY, IconType.MAIN),
    ORBITER_SHUTTLE("04", "Orbiter Shuttle", SpaceEntity.MILITARY, IconType.MAIN),
    CAPSULE("05", "Capsule", SpaceEntity.MILITARY, IconType.MAIN),
    GENERAL_SATELLITE("06", "Satellite, General", SpaceEntity.MILITARY, IconType.MAIN),
    SATELLITE("07", "Satellite", SpaceEntity.MILITARY, IconType.MAIN),
    ANTISATELLITE_WEAPON("08", "Antisatellite Weapon", SpaceEntity.MILITARY, IconType.MAIN),
    ASTRONOMICAL_SATELLITE("09", "Astronomical Satellite", SpaceEntity.MILITARY, IconType.MAIN),
    BIOSATELLITE("10", "Biosatellite", SpaceEntity.MILITARY, IconType.MAIN),
    COMMUNICATIONS_SATELLITE("11", "Communications Satellite", SpaceEntity.MILITARY, IconType.MAIN),
    EARTH_OBSERVATION_SATELLITE("12", "Earth Observation Satellite", SpaceEntity.MILITARY, IconType.MAIN),
    MINIATURIZED_SATELLITE("13", "Miniaturized Satellite", SpaceEntity.MILITARY, IconType.MAIN),
    NAVIGATIONAL_SATELLITE("14", "Navigational Satellite", SpaceEntity.MILITARY, IconType.MAIN),
    RECONNAISSANCE_SATELLITE("15", "Reconnaissance Satellite", SpaceEntity.MILITARY, IconType.MAIN),
    SPACE_STATION("16", "Space Station", SpaceEntity.MILITARY, IconType.MAIN),
    TETHERED_SATELLITE("17", "Tethered Satellite", SpaceEntity.MILITARY, IconType.MAIN),
    WEATHER_SATELLITE("18", "Weather Satellite", SpaceEntity.MILITARY, IconType.MAIN),
    SPACE_LAUNCHED_VEHICLE("19", "Space Launched Vehicle (SLV)", SpaceEntity.MILITARY, IconType.MAIN),
    CIV_ORBITER_SHUTTLE("01", "Orbiter Shuttle", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_CAPSULE("02", "Capsule", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_SATELLITE("03", "Satellite", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_ASTRONOMICAL_SATELLITE("04", "Astronomical Satellite", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_BIOSATELLITE("05", "Biosatellite", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_COMMUNICATIONS_SATELLITE("06", "Communications Satellite", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_EARTH_OBSERVATION_SATELLITE("07", "Earth Observation Satellite", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_MINIATURIZED_SATELLITE("08", "Miniaturized Satellite", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_NAVIGATIONAL_SATELLITE("09", "Navigational Satellite", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_SPACE_STATION("10", "Space Station", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_TETHERED_SATELLITE("11", "Tethered Satellite", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_WEATHER_SATELLITE("12", "Weather Satellite", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_PLANET_LANDER("13", "Planet Lander", SpaceEntity.CIVILIAN, IconType.MAIN),
    CIV_SPACE_VEHICLE("14", "Space Vehicle", SpaceEntity.CIVILIAN, IconType.MAIN);

    private final String id;
    private final String label;
    private final SpaceEntity entity;
    private final IconType iconType;
    
    private SpaceEntityType(String id, String label, SpaceEntity entity, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
        this.iconType = iconType;
    }
    

    @Override
    public IconType getIconType() {
        return iconType;
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
    public Entity getEntity() {
        return entity;
    }
    
}