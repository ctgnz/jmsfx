package io.github.ctgnz.jmsfx.icon.cyberspacespace;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.icon.GraphicType;

public enum CyberspaceSpaceEntityType implements IEntityType {
    COMBAT_MISSION_TEAM("01", "Combat Mission Team", CyberspaceSpaceEntity.MISSION_FORCE, GraphicType.MAIN),
    NATIONAL_MISSION_TEAM("02", "National Mission Team", CyberspaceSpaceEntity.MISSION_FORCE, GraphicType.MAIN),
    CYBER_PROTECTION_TEAM("03", "Cyber Protection Team", CyberspaceSpaceEntity.MISSION_FORCE, GraphicType.MAIN),
    DEFENSIVE_CYBERSPACE_OPERATION("01", "Defensive Cyberspace Operation", CyberspaceSpaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    OFFENSIVE_CYBERSPACE_OPERATION("02", "Cyberspace Operation", CyberspaceSpaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    INTERNET_SERVICE_PROVIDER("03", "Internet Service Provider", CyberspaceSpaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    SECURITY_OPERATIONS_CENTRE("04", "Security Operations Centre", CyberspaceSpaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    ACTIVE_CYBER_OPERATIONS("05", "Active Cyber Operations", CyberspaceSpaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    ADVANCED_PERSISTANT_THREAT("06", "Advanced Persistant Threat", CyberspaceSpaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    NATION_STATE("01", "Nation State", CyberspaceSpaceEntity.THREAT_ACTOR, GraphicType.MAIN),
    NON_NATION_STATE("02", "Non Nation State", CyberspaceSpaceEntity.THREAT_ACTOR, GraphicType.MAIN),
    CRIMINAL("03", "Unknown", CyberspaceSpaceEntity.THREAT_ACTOR, GraphicType.MAIN),
    INSIDER("04", "Insider", CyberspaceSpaceEntity.THREAT_ACTOR, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final CyberspaceSpaceEntity entity;
    private final GraphicType graphicType;

    CyberspaceSpaceEntityType(String id, String label, CyberspaceSpaceEntity entity, GraphicType graphicType) {
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