package nz.co.ctg.jmsfx.model.cyberspacelandequipment;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum CyberspaceLandEquipmentEntityType implements EntityType {
    COMBAT_MISSION_TEAM("01", "Combat Mission Team", CyberspaceLandEquipmentEntity.MISSION_FORCE, IconType.MAIN),
    NATIONAL_MISSION_TEAM("02", "National Mission Team", CyberspaceLandEquipmentEntity.MISSION_FORCE, IconType.MAIN),
    CYBER_PROTECTION_TEAM("03", "Cyber Protection Team", CyberspaceLandEquipmentEntity.MISSION_FORCE, IconType.MAIN),
    DEFENSIVE_CYBERSPACE_OPERATION("01", "Defensive Cyberspace Operation", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, IconType.MAIN),
    OFFENSIVE_CYBERSPACE_OPERATION("02", "Cyberspace Operation", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, IconType.MAIN),
    INTERNET_SERVICE_PROVIDER("03", "Internet Service Provider", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, IconType.MAIN),
    SECURITY_OPERATIONS_CENTRE("04", "Security Operations Centre", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, IconType.MAIN),
    ACTIVE_CYBER_OPERATIONS("05", "Active Cyber Operations", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, IconType.MAIN),
    ADVANCED_PERSISTANT_THREAT("06", "Advanced Persistant Threat", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, IconType.MAIN),
    NATION_STATE("01", "Nation State", CyberspaceLandEquipmentEntity.THREAT_ACTOR, IconType.MAIN),
    NON_NATION_STATE("02", "Non Nation State", CyberspaceLandEquipmentEntity.THREAT_ACTOR, IconType.MAIN),
    CRIMINAL("03", "Unknown", CyberspaceLandEquipmentEntity.THREAT_ACTOR, IconType.MAIN),
    INSIDER("04", "Insider", CyberspaceLandEquipmentEntity.THREAT_ACTOR, IconType.MAIN),
    SERVER("01", "Server", CyberspaceLandEquipmentEntity.END_POINT, IconType.MAIN),
    MOBILE_SMARTPHONE("02", "Mobile/Smartphone", CyberspaceLandEquipmentEntity.END_POINT, IconType.MAIN),
    TABLET_MOBILE_PERSONAL_DEVICE("03", "Tablet/Mobile Personal Device", CyberspaceLandEquipmentEntity.END_POINT, IconType.MAIN),
    WORKSTATION("04", "Workstation", CyberspaceLandEquipmentEntity.END_POINT, IconType.MAIN),
    LAPTOP("05", "Laptop", CyberspaceLandEquipmentEntity.END_POINT, IconType.MAIN),
    INTERNET_OF_THINGS_DEVICE("06", "Internet of Things Device", CyberspaceLandEquipmentEntity.END_POINT, IconType.MAIN),
    PRINTER("07", "Printer", CyberspaceLandEquipmentEntity.END_POINT, IconType.MAIN),
    ROUTER("08", "Router", CyberspaceLandEquipmentEntity.END_POINT, IconType.MAIN),
    SWITCH("09", "Switch", CyberspaceLandEquipmentEntity.END_POINT, IconType.MAIN),
    HEALTH_MONITOR("01", "Health Monitor", CyberspaceLandEquipmentEntity.WEARABLE, IconType.MAIN),
    SMARTVEST("02", "Smartvest", CyberspaceLandEquipmentEntity.WEARABLE, IconType.MAIN),
    SMARTWATCH("03", "Smartwatch", CyberspaceLandEquipmentEntity.WEARABLE, IconType.MAIN);

    private final String id;
    private final String label;
    private final CyberspaceLandEquipmentEntity entity;
    private final IconType iconType;
    
    private CyberspaceLandEquipmentEntityType(String id, String label, CyberspaceLandEquipmentEntity entity, IconType iconType) {
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