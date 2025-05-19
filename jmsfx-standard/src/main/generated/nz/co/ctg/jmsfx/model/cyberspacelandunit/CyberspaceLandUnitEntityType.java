package nz.co.ctg.jmsfx.model.cyberspacelandunit;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum CyberspaceLandUnitEntityType implements EntityType {
    COMBAT_MISSION_TEAM("01", "Combat Mission Team", CyberspaceLandUnitEntity.MISSION_FORCE, IconType.MAIN),
    NATIONAL_MISSION_TEAM("02", "National Mission Team", CyberspaceLandUnitEntity.MISSION_FORCE, IconType.MAIN),
    CYBER_PROTECTION_TEAM("03", "Cyber Protection Team", CyberspaceLandUnitEntity.MISSION_FORCE, IconType.MAIN),
    DEFENSIVE_CYBERSPACE_OPERATION("01", "Defensive Cyberspace Operation", CyberspaceLandUnitEntity.CYBERSPACE_UNIT, IconType.MAIN),
    OFFENSIVE_CYBERSPACE_OPERATION("02", "Cyberspace Operation", CyberspaceLandUnitEntity.CYBERSPACE_UNIT, IconType.MAIN),
    INTERNET_SERVICE_PROVIDER("03", "Internet Service Provider", CyberspaceLandUnitEntity.CYBERSPACE_UNIT, IconType.MAIN),
    SECURITY_OPERATIONS_CENTRE("04", "Security Operations Centre", CyberspaceLandUnitEntity.CYBERSPACE_UNIT, IconType.MAIN),
    ACTIVE_CYBER_OPERATIONS("05", "Active Cyber Operations", CyberspaceLandUnitEntity.CYBERSPACE_UNIT, IconType.MAIN),
    ADVANCED_PERSISTANT_THREAT("06", "Advanced Persistant Threat", CyberspaceLandUnitEntity.CYBERSPACE_UNIT, IconType.MAIN),
    NATION_STATE("01", "Nation State", CyberspaceLandUnitEntity.THREAT_ACTOR, IconType.MAIN),
    NON_NATION_STATE("02", "Non Nation State", CyberspaceLandUnitEntity.THREAT_ACTOR, IconType.MAIN),
    CRIMINAL("03", "Unknown", CyberspaceLandUnitEntity.THREAT_ACTOR, IconType.MAIN),
    INSIDER("04", "Insider", CyberspaceLandUnitEntity.THREAT_ACTOR, IconType.MAIN);

    private final String id;
    private final String label;
    private final CyberspaceLandUnitEntity entity;
    private final IconType iconType;
    
    private CyberspaceLandUnitEntityType(String id, String label, CyberspaceLandUnitEntity entity, IconType iconType) {
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