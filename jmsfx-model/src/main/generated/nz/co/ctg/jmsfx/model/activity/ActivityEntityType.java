package nz.co.ctg.jmsfx.model.activity;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.IconType;

public enum ActivityEntityType implements EntityType {
    CRIMINAL_ACTIVITY_INCIDENT("01", "Criminal Activity Incident", ActivityEntity.INCIDENT, IconType.FULL_OCTAGON),
    BOMB_BOMBING("02", "Bomb/Bombing", ActivityEntity.INCIDENT, IconType.MAIN),
    IED_EVENT("03", "IED Event", ActivityEntity.INCIDENT, IconType.MAIN),
    SHOOTING("04", "Shooting", ActivityEntity.INCIDENT, IconType.FULL_OCTAGON),
    ILLEGAL_DRUG_OPERATION("05", "Illegal Drug Operation", ActivityEntity.INCIDENT, IconType.MAIN),
    EXPLOSION("06", "Explosion", ActivityEntity.INCIDENT, IconType.FULL_OCTAGON),
    DEMONSTRATION("01", "Demonstration", ActivityEntity.CIVIL_DISTURBANCE, IconType.MAIN),
    PATROLLING("01", "Patrolling", ActivityEntity.OPERATION, IconType.FULL_OCTAGON),
    MILITARY_INFORMATION_SUPPORT_OPERATION_MISO("02", "Military Information Support Operation (MISO)", ActivityEntity.OPERATION, IconType.FULL_OCTAGON),
    FORAGING_SEARCHING("03", "Foraging/Searching", ActivityEntity.OPERATION, IconType.FULL_OCTAGON),
    RECRUITMENT("04", "Recruitment", ActivityEntity.OPERATION, IconType.NA),
    MINE_LAYING("05", "Mine Laying", ActivityEntity.OPERATION, IconType.MAIN),
    SPY("06", "Spy", ActivityEntity.OPERATION, IconType.MAIN),
    WARRANT_SERVED("07", "Warrant Served", ActivityEntity.OPERATION, IconType.MAIN),
    EXFILTRATION("08", "Exfiltration", ActivityEntity.OPERATION, IconType.FULL_OCTAGON),
    INFILTRATION("09", "Infiltration", ActivityEntity.OPERATION, IconType.FULL_OCTAGON),
    MEETING("10", "Meeting", ActivityEntity.OPERATION, IconType.FULL_OCTAGON),
    RAID_ON_HOUSE("11", "Raid on House", ActivityEntity.OPERATION, IconType.FULL_OCTAGON),
    EMERGENCY_OPERATION("12", "Emergency Operation", ActivityEntity.OPERATION, IconType.FULL_OCTAGON),
    EMERGENCY_MEDICAL_OPERATION("13", "Emergency Medical Operation", ActivityEntity.OPERATION, IconType.FULL_OCTAGON),
    FIRE_FIGHTING_OPERATION("14", "Fire Fighting Operation", ActivityEntity.OPERATION, IconType.MAIN),
    LAW_ENFORCEMENT_OPERATION("15", "Law Enforcement Operation", ActivityEntity.OPERATION, IconType.FULL_OCTAGON),
    FIRE_ORIGIN("01", "Fire Origin", ActivityEntity.FIRE_EVENT, IconType.FULL_OCTAGON),
    SMOKE("02", "Smoke", ActivityEntity.FIRE_EVENT, IconType.FULL_OCTAGON),
    HOT_SPOT("03", "Hot Spot", ActivityEntity.FIRE_EVENT, IconType.FULL_OCTAGON),
    NON_RESIDENTIAL_FIRE("04", "Non-Residential Fire", ActivityEntity.FIRE_EVENT, IconType.FULL_OCTAGON),
    RESIDENTIAL_FIRE("05", "Residential Fire", ActivityEntity.FIRE_EVENT, IconType.FULL_OCTAGON),
    SCHOOL_FIRE("06", "School Fire", ActivityEntity.FIRE_EVENT, IconType.FULL_OCTAGON),
    SPECIAL_NEEDS_FIRE("07", "Special Needs Fire", ActivityEntity.FIRE_EVENT, IconType.FULL_OCTAGON),
    WILD_FIRE("08", "Wild Fire", ActivityEntity.FIRE_EVENT, IconType.FULL_OCTAGON),
    HAZARD_MATERIALS_INCIDENT("01", "Hazard Materials Incident", ActivityEntity.HAZARD_MATERIALS, IconType.FULL_OCTAGON),
    AIR("01", "Air", ActivityEntity.TRANSPORTATION_INCIDENT, IconType.MAIN),
    MARINE("02", "Marine", ActivityEntity.TRANSPORTATION_INCIDENT, IconType.MAIN),
    RAIL("03", "Rail", ActivityEntity.TRANSPORTATION_INCIDENT, IconType.MAIN),
    VEHICLE("04", "Vehicle", ActivityEntity.TRANSPORTATION_INCIDENT, IconType.MAIN),
    WHEELED_VEHICLE_EXPLOSION("05", "Wheeled Vehicle Explosion", ActivityEntity.TRANSPORTATION_INCIDENT, IconType.FULL_OCTAGON),
    GEOLOGIC("01", "Geologic", ActivityEntity.NATURAL_EVENT, IconType.MAIN),
    HYDRO_METEOROLOGICAL("02", "Hydro-Meteorological", ActivityEntity.NATURAL_EVENT, IconType.MAIN),
    INFESTATION("03", "Infestation", ActivityEntity.NATURAL_EVENT, IconType.MAIN),
    RELIGIOUS_LEADER("01", "Religious Leader", ActivityEntity.INDIVIDUAL, IconType.FULL_OCTAGON),
    SPEAKER("02", "Speaker", ActivityEntity.INDIVIDUAL, IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final ActivityEntity entity;
    private final IconType iconType;
    
    private ActivityEntityType(String id, String label, ActivityEntity entity, IconType iconType) {
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
    
   @Override
    public List<EntitySubType> getEntitySubTypes() {
        return ActivitySymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

}