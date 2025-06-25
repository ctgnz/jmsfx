package io.github.ctgnz.jmsfx.standard.cyberspacedismountedindividual;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum CyberspaceDismountedIndividualEntityType implements EntityType {
    COMBAT_MISSION_TEAM("01", "Combat Mission Team", CyberspaceDismountedIndividualEntity.MISSION_FORCE, GraphicType.MAIN),
    NATIONAL_MISSION_TEAM("02", "National Mission Team", CyberspaceDismountedIndividualEntity.MISSION_FORCE, GraphicType.MAIN),
    CYBER_PROTECTION_TEAM("03", "Cyber Protection Team", CyberspaceDismountedIndividualEntity.MISSION_FORCE, GraphicType.MAIN),
    DEFENSIVE_CYBERSPACE_OPERATION("01", "Defensive Cyberspace Operation", CyberspaceDismountedIndividualEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    OFFENSIVE_CYBERSPACE_OPERATION("02", "Cyberspace Operation", CyberspaceDismountedIndividualEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    INTERNET_SERVICE_PROVIDER("03", "Internet Service Provider", CyberspaceDismountedIndividualEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    SECURITY_OPERATIONS_CENTRE("04", "Security Operations Centre", CyberspaceDismountedIndividualEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    ACTIVE_CYBER_OPERATIONS("05", "Active Cyber Operations", CyberspaceDismountedIndividualEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    ADVANCED_PERSISTANT_THREAT("06", "Advanced Persistant Threat", CyberspaceDismountedIndividualEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    NATION_STATE("01", "Nation State", CyberspaceDismountedIndividualEntity.THREAT_ACTOR, GraphicType.MAIN),
    NON_NATION_STATE("02", "Non Nation State", CyberspaceDismountedIndividualEntity.THREAT_ACTOR, GraphicType.MAIN),
    CRIMINAL("03", "Unknown", CyberspaceDismountedIndividualEntity.THREAT_ACTOR, GraphicType.MAIN),
    INSIDER("04", "Insider", CyberspaceDismountedIndividualEntity.THREAT_ACTOR, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final CyberspaceDismountedIndividualEntity entity;
    private final GraphicType graphicType;

    CyberspaceDismountedIndividualEntityType(String id, String label, CyberspaceDismountedIndividualEntity entity, GraphicType graphicType) {
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
    public Entity getEntity() {
        return entity;
    }

}