package io.github.ctgnz.jmsfx.icon.cyberspace;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum CyberspaceEntityType implements EntityType {
    COMBAT_MISSION_TEAM("01", "Combat Mission Team", CyberspaceEntity.MISSION_FORCE, GraphicType.MAIN),
    NATIONAL_MISSION_TEAM("02", "National Mission Team", CyberspaceEntity.MISSION_FORCE, GraphicType.MAIN),
    CYBER_PROTECTION_TEAM("03", "Cyber Protection Team", CyberspaceEntity.MISSION_FORCE, GraphicType.MAIN),
    DEFENSIVE_CYBERSPACE_OPERATION("01", "Defensive Cyberspace Operation", CyberspaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    OFFENSIVE_CYBERSPACE_OPERATION("02", "Cyberspace Operation", CyberspaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    INTERNET_SERVICE_PROVIDER("03", "Internet Service Provider", CyberspaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    SECURITY_OPERATIONS_CENTRE("04", "Security Operations Centre", CyberspaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    ACTIVE_CYBER_OPERATIONS("05", "Active Cyber Operations", CyberspaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    ADVANCED_PERSISTANT_THREAT("06", "Advanced Persistant Threat", CyberspaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    NATION_STATE("01", "Nation State", CyberspaceEntity.THREAT_ACTOR, GraphicType.MAIN),
    NON_NATION_STATE("02", "Non Nation State", CyberspaceEntity.THREAT_ACTOR, GraphicType.MAIN),
    CRIMINAL("03", "Unknown", CyberspaceEntity.THREAT_ACTOR, GraphicType.MAIN),
    INSIDER("04", "Insider", CyberspaceEntity.THREAT_ACTOR, GraphicType.MAIN),
    FIREWALL("01", "Firewall", CyberspaceEntity.AGENT, GraphicType.MAIN),
    FIRMWARE("02", "Firmware", CyberspaceEntity.AGENT, GraphicType.MAIN),
    BANKING("01", "Banking", CyberspaceEntity.APPLICATION, GraphicType.MAIN),
    CLOUD("02", "Cloud", CyberspaceEntity.APPLICATION, GraphicType.MAIN),
    FILESERVER("03", "Fileserver", CyberspaceEntity.APPLICATION, GraphicType.MAIN),
    SEARCH_ENGINE("04", "Search Engine", CyberspaceEntity.APPLICATION, GraphicType.MAIN),
    SOCIAL_MEDIA("05", "Social Media", CyberspaceEntity.APPLICATION, GraphicType.MAIN),
    MALWARE("01", "Malware", CyberspaceEntity.THREAT, GraphicType.MAIN),
    PHISHING("02", "Phishing", CyberspaceEntity.THREAT, GraphicType.MAIN),
    SPEARPHISHING("03", "Spearphishing", CyberspaceEntity.THREAT, GraphicType.MAIN),
    DIGITAL_CURRENCY("01", "Digital Currency", CyberspaceEntity.DATA, GraphicType.MAIN),
    PERSONA("02", "Persona", CyberspaceEntity.DATA, GraphicType.MAIN),
    DATA_PATH_SEGMENT("01", "Data Path Segment", CyberspaceEntity.PATHS, GraphicType.MAIN),
    DATA_TUNNEL("02", "Data Tunnel", CyberspaceEntity.PATHS, GraphicType.MAIN),
    NETWORK("01", "Network", CyberspaceEntity.TERRAIN, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final CyberspaceEntity entity;
    private final GraphicType graphicType;

    CyberspaceEntityType(String id, String label, CyberspaceEntity entity, GraphicType graphicType) {
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