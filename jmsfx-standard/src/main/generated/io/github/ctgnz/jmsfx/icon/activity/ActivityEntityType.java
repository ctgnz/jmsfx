package io.github.ctgnz.jmsfx.icon.activity;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum ActivityEntityType implements IEntityType {
    CRIMINAL_ACTIVITY_INCIDENT("01", "Criminal Activity Incident", ActivityEntity.INCIDENT, GraphicType.FULL_OCTAGON),
    BOMB_BOMBING("02", "Bomb/Bombing", ActivityEntity.INCIDENT, GraphicType.MAIN),
    IED_EVENT("03", "IED Event", ActivityEntity.INCIDENT, GraphicType.MAIN),
    SHOOTING("04", "Shooting", ActivityEntity.INCIDENT, GraphicType.NA),
    ILLEGAL_DRUG_OPERATION("05", "Illegal Drug Operation", ActivityEntity.INCIDENT, GraphicType.MAIN),
    EXPLOSION("06", "Explosion", ActivityEntity.INCIDENT, GraphicType.FULL_OCTAGON),
    HOUSE("07", "House", ActivityEntity.INCIDENT, GraphicType.MAIN),
    DEMONSTRATION("01", "Demonstration", ActivityEntity.CIVIL_DISTURBANCE, GraphicType.MAIN),
    PATROLLING("01", "Patrolling", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON),
    PSYCHOLOGICAL_OPERATIONS("02", "Psychological Operation (PSYOPS)", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON),
    FORAGING_SEARCHING("03", "Foraging/Searching", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON),
    RECRUITMENT("04", "Recruitment", ActivityEntity.OPERATION, GraphicType.NA),
    MINE_LAYING("05", "Mine Laying", ActivityEntity.OPERATION, GraphicType.MAIN),
    SPY("06", "Spy", ActivityEntity.OPERATION, GraphicType.MAIN),
    WARRANT_SERVED("07", "Warrant Served", ActivityEntity.OPERATION, GraphicType.MAIN),
    EXFILTRATION("08", "Exfiltration", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON),
    INFILTRATION("09", "Infiltration", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON),
    MEETING("10", "Meeting", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON),
    RAID_ON_HOUSE("11", "Raid on House", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON),
    EMERGENCY_OPERATION("12", "Emergency Operation", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON),
    EMERGENCY_MEDICAL_OPERATION("13", "Emergency Medical Operation", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON),
    FIRE_FIGHTING_OPERATION("14", "Fire Fighting Operation", ActivityEntity.OPERATION, GraphicType.MAIN),
    LAW_ENFORCEMENT_OPERATION("15", "Law Enforcement Operation", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON),
    HAZARD_MATERIALS_INCIDENT("01", "Hazard Materials Incident", ActivityEntity.HAZARD_MATERIALS, GraphicType.FULL_OCTAGON),
    AIR("01", "Air", ActivityEntity.TRANSPORTATION_INCIDENT, GraphicType.MAIN),
    MARINE("02", "Marine", ActivityEntity.TRANSPORTATION_INCIDENT, GraphicType.MAIN),
    RAIL("03", "Rail", ActivityEntity.TRANSPORTATION_INCIDENT, GraphicType.MAIN),
    VEHICLE("04", "Vehicle", ActivityEntity.TRANSPORTATION_INCIDENT, GraphicType.MAIN),
    GEOLOGIC("01", "Geologic", ActivityEntity.NATURAL_EVENT, GraphicType.MAIN),
    HYDRO_METEOROLOGICAL("02", "Hydro-Meteorological", ActivityEntity.NATURAL_EVENT, GraphicType.MAIN),
    INFESTATION("03", "Infestation", ActivityEntity.NATURAL_EVENT, GraphicType.MAIN),
    RELIGIOUS_LEADER("01", "Religious Leader", ActivityEntity.INDIVIDUAL, GraphicType.FULL_OCTAGON),
    SPEAKER("02", "Speaker", ActivityEntity.INDIVIDUAL, GraphicType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final ActivityEntity entity;
    private final GraphicType graphicType;

    ActivityEntityType(String id, String label, ActivityEntity entity, GraphicType graphicType) {
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

    @Override
    public List<IEntitySubType> getEntitySubTypes() {
        return ActivitySymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}