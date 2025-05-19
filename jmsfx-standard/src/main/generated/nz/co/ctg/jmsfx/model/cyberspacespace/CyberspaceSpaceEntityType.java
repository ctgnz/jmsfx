package nz.co.ctg.jmsfx.model.cyberspacespace;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum CyberspaceSpaceEntityType implements EntityType {
    COMBAT_MISSION_TEAM("01", "Combat Mission Team", CyberspaceSpaceEntity.MISSION_FORCE, IconType.MAIN),
    NATIONAL_MISSION_TEAM("02", "National Mission Team", CyberspaceSpaceEntity.MISSION_FORCE, IconType.MAIN),
    CYBER_PROTECTION_TEAM("03", "Cyber Protection Team", CyberspaceSpaceEntity.MISSION_FORCE, IconType.MAIN),
    DEFENSIVE_CYBERSPACE_OPERATION("01", "Defensive Cyberspace Operation", CyberspaceSpaceEntity.CYBERSPACE_UNIT, IconType.MAIN),
    OFFENSIVE_CYBERSPACE_OPERATION("02", "Cyberspace Operation", CyberspaceSpaceEntity.CYBERSPACE_UNIT, IconType.MAIN),
    INTERNET_SERVICE_PROVIDER("03", "Internet Service Provider", CyberspaceSpaceEntity.CYBERSPACE_UNIT, IconType.MAIN),
    SECURITY_OPERATIONS_CENTRE("04", "Security Operations Centre", CyberspaceSpaceEntity.CYBERSPACE_UNIT, IconType.MAIN),
    ACTIVE_CYBER_OPERATIONS("05", "Active Cyber Operations", CyberspaceSpaceEntity.CYBERSPACE_UNIT, IconType.MAIN),
    ADVANCED_PERSISTANT_THREAT("06", "Advanced Persistant Threat", CyberspaceSpaceEntity.CYBERSPACE_UNIT, IconType.MAIN),
    NATION_STATE("01", "Nation State", CyberspaceSpaceEntity.THREAT_ACTOR, IconType.MAIN),
    NON_NATION_STATE("02", "Non Nation State", CyberspaceSpaceEntity.THREAT_ACTOR, IconType.MAIN),
    CRIMINAL("03", "Unknown", CyberspaceSpaceEntity.THREAT_ACTOR, IconType.MAIN),
    INSIDER("04", "Insider", CyberspaceSpaceEntity.THREAT_ACTOR, IconType.MAIN);

    private final String id;
    private final String label;
    private final CyberspaceSpaceEntity entity;
    private final IconType iconType;
    
    private CyberspaceSpaceEntityType(String id, String label, CyberspaceSpaceEntity entity, IconType iconType) {
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