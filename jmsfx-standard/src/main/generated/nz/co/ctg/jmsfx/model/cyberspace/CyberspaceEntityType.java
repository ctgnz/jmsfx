package nz.co.ctg.jmsfx.model.cyberspace;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum CyberspaceEntityType implements EntityType {
    COMBAT_MISSION_TEAM("01", "Combat Mission Team", CyberspaceEntity.MISSION_FORCE, IconType.MAIN),
    NATIONAL_MISSION_TEAM("02", "National Mission Team", CyberspaceEntity.MISSION_FORCE, IconType.MAIN),
    CYBER_PROTECTION_TEAM("03", "Cyber Protection Team", CyberspaceEntity.MISSION_FORCE, IconType.MAIN),
    DEFENSIVE_CYBERSPACE_OPERATION("01", "Defensive Cyberspace Operation", CyberspaceEntity.CYBERSPACE_UNIT, IconType.MAIN),
    OFFENSIVE_CYBERSPACE_OPERATION("02", "Cyberspace Operation", CyberspaceEntity.CYBERSPACE_UNIT, IconType.MAIN),
    INTERNET_SERVICE_PROVIDER("03", "Internet Service Provider", CyberspaceEntity.CYBERSPACE_UNIT, IconType.MAIN),
    SECURITY_OPERATIONS_CENTRE("04", "Security Operations Centre", CyberspaceEntity.CYBERSPACE_UNIT, IconType.MAIN),
    ACTIVE_CYBER_OPERATIONS("05", "Active Cyber Operations", CyberspaceEntity.CYBERSPACE_UNIT, IconType.MAIN),
    ADVANCED_PERSISTANT_THREAT("06", "Advanced Persistant Threat", CyberspaceEntity.CYBERSPACE_UNIT, IconType.MAIN),
    NATION_STATE("01", "Nation State", CyberspaceEntity.THREAT_ACTOR, IconType.MAIN),
    NON_NATION_STATE("02", "Non Nation State", CyberspaceEntity.THREAT_ACTOR, IconType.MAIN),
    CRIMINAL("03", "Unknown", CyberspaceEntity.THREAT_ACTOR, IconType.MAIN),
    INSIDER("04", "Insider", CyberspaceEntity.THREAT_ACTOR, IconType.MAIN),
    FIREWALL("01", "Firewall", CyberspaceEntity.AGENT, IconType.MAIN),
    FIRMWARE("02", "Firmware", CyberspaceEntity.AGENT, IconType.MAIN),
    BANKING("01", "Banking", CyberspaceEntity.APPLICATION, IconType.MAIN),
    CLOUD("02", "Cloud", CyberspaceEntity.APPLICATION, IconType.MAIN),
    FILESERVER("03", "Fileserver", CyberspaceEntity.APPLICATION, IconType.MAIN),
    SEARCH_ENGINE("04", "Search Engine", CyberspaceEntity.APPLICATION, IconType.MAIN),
    SOCIAL_MEDIA("05", "Social Media", CyberspaceEntity.APPLICATION, IconType.MAIN),
    MALWARE("01", "Malware", CyberspaceEntity.THREAT, IconType.MAIN),
    PHISHING("02", "Phishing", CyberspaceEntity.THREAT, IconType.MAIN),
    SPEARPHISHING("03", "Spearphishing", CyberspaceEntity.THREAT, IconType.MAIN),
    DIGITAL_CURRENCY("01", "Digital Currency", CyberspaceEntity.DATA, IconType.MAIN),
    PERSONA("02", "Persona", CyberspaceEntity.DATA, IconType.MAIN),
    DATA_PATH_SEGMENT("01", "Data Path Segment", CyberspaceEntity.PATHS, IconType.MAIN),
    DATA_TUNNEL("02", "Data Tunnel", CyberspaceEntity.PATHS, IconType.MAIN),
    NETWORK("01", "Network", CyberspaceEntity.TERRAIN, IconType.MAIN);

    private final String id;
    private final String label;
    private final CyberspaceEntity entity;
    private final IconType iconType;
    
    private CyberspaceEntityType(String id, String label, CyberspaceEntity entity, IconType iconType) {
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