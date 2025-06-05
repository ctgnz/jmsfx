package io.github.ctgnz.jmsfx.icon.cyberspacelandequipment;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.icon.GraphicType;

public enum CyberspaceLandEquipmentEntityType implements IEntityType {
    COMBAT_MISSION_TEAM("01", "Combat Mission Team", CyberspaceLandEquipmentEntity.MISSION_FORCE, GraphicType.MAIN),
    NATIONAL_MISSION_TEAM("02", "National Mission Team", CyberspaceLandEquipmentEntity.MISSION_FORCE, GraphicType.MAIN),
    CYBER_PROTECTION_TEAM("03", "Cyber Protection Team", CyberspaceLandEquipmentEntity.MISSION_FORCE, GraphicType.MAIN),
    DEFENSIVE_CYBERSPACE_OPERATION("01", "Defensive Cyberspace Operation", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    OFFENSIVE_CYBERSPACE_OPERATION("02", "Cyberspace Operation", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    INTERNET_SERVICE_PROVIDER("03", "Internet Service Provider", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    SECURITY_OPERATIONS_CENTRE("04", "Security Operations Centre", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    ACTIVE_CYBER_OPERATIONS("05", "Active Cyber Operations", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    ADVANCED_PERSISTANT_THREAT("06", "Advanced Persistant Threat", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, GraphicType.MAIN),
    NATION_STATE("01", "Nation State", CyberspaceLandEquipmentEntity.THREAT_ACTOR, GraphicType.MAIN),
    NON_NATION_STATE("02", "Non Nation State", CyberspaceLandEquipmentEntity.THREAT_ACTOR, GraphicType.MAIN),
    CRIMINAL("03", "Unknown", CyberspaceLandEquipmentEntity.THREAT_ACTOR, GraphicType.MAIN),
    INSIDER("04", "Insider", CyberspaceLandEquipmentEntity.THREAT_ACTOR, GraphicType.MAIN),
    SERVER("01", "Server", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN),
    MOBILE_SMARTPHONE("02", "Mobile/Smartphone", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN),
    TABLET_MOBILE_PERSONAL_DEVICE("03", "Tablet/Mobile Personal Device", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN),
    WORKSTATION("04", "Workstation", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN),
    LAPTOP("05", "Laptop", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN),
    INTERNET_OF_THINGS_DEVICE("06", "Internet of Things Device", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN),
    PRINTER("07", "Printer", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN),
    ROUTER("08", "Router", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN),
    SWITCH("09", "Switch", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN),
    HEALTH_MONITOR("01", "Health Monitor", CyberspaceLandEquipmentEntity.WEARABLE, GraphicType.MAIN),
    SMARTVEST("02", "Smartvest", CyberspaceLandEquipmentEntity.WEARABLE, GraphicType.MAIN),
    SMARTWATCH("03", "Smartwatch", CyberspaceLandEquipmentEntity.WEARABLE, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final CyberspaceLandEquipmentEntity entity;
    private final GraphicType graphicType;

    CyberspaceLandEquipmentEntityType(String id, String label, CyberspaceLandEquipmentEntity entity, GraphicType graphicType) {
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