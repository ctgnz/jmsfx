package io.github.ctgnz.jmsfx.icon.cyberspacelandunit;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum CyberspaceLandUnitEntityType implements IEntityType {
    COMBAT_MISSION_TEAM("01", "Combat Mission Team", CyberspaceLandUnitEntity.MISSION_FORCE, GraphicType.MAIN),
    NATIONAL_MISSION_TEAM("02", "National Mission Team", CyberspaceLandUnitEntity.MISSION_FORCE, GraphicType.MAIN),
    CYBER_PROTECTION_TEAM("03", "Cyber Protection Team", CyberspaceLandUnitEntity.MISSION_FORCE, GraphicType.MAIN),
    DEFENSIVE_CYBERSPACE_OPERATION("01", "Defensive Cyberspace Operation", CyberspaceLandUnitEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    OFFENSIVE_CYBERSPACE_OPERATION("02", "Cyberspace Operation", CyberspaceLandUnitEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    INTERNET_SERVICE_PROVIDER("03", "Internet Service Provider", CyberspaceLandUnitEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    SECURITY_OPERATIONS_CENTRE("04", "Security Operations Centre", CyberspaceLandUnitEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    ACTIVE_CYBER_OPERATIONS("05", "Active Cyber Operations", CyberspaceLandUnitEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    ADVANCED_PERSISTANT_THREAT("06", "Advanced Persistant Threat", CyberspaceLandUnitEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    NATION_STATE("01", "Nation State", CyberspaceLandUnitEntity.THREAT_ACTOR, GraphicType.MAIN),
    NON_NATION_STATE("02", "Non Nation State", CyberspaceLandUnitEntity.THREAT_ACTOR, GraphicType.MAIN),
    CRIMINAL("03", "Unknown", CyberspaceLandUnitEntity.THREAT_ACTOR, GraphicType.MAIN),
    INSIDER("04", "Insider", CyberspaceLandUnitEntity.THREAT_ACTOR, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final CyberspaceLandUnitEntity entity;
    private final GraphicType graphicType;

    CyberspaceLandUnitEntityType(String id, String label, CyberspaceLandUnitEntity entity, GraphicType graphicType) {
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