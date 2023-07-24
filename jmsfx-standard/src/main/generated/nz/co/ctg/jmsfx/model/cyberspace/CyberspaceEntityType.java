package nz.co.ctg.jmsfx.model.cyberspace;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.IconType;

public enum CyberspaceEntityType implements EntityType {
    COMMAND_AND_CONTROL_C2("01", "Command and Control (C2)", CyberspaceEntity.BOTNET, IconType.MAIN),
    HERDER("02", "Herder", CyberspaceEntity.BOTNET, IconType.MAIN),
    CALLBACK_DOMAIN("03", "Callback Domain", CyberspaceEntity.BOTNET, IconType.MAIN),
    ZOMBIE("04", "Zombie", CyberspaceEntity.BOTNET, IconType.MAIN),
    ADVANCED_PERSISTENT_THREAT_APT("01", "Advanced Persistent Threat (APT)", CyberspaceEntity.INFECTION, IconType.MAIN),
    NON_ADVANCED_PERSISTENT_THREAT_NAPT("02", "Non-Advanced Persistent Threat (NAPT)", CyberspaceEntity.INFECTION, IconType.MAIN),
    NORMAL("01", "Normal", CyberspaceEntity.HEALTH_AND_STATUS, IconType.MAIN),
    NETWORK_OUTAGE("02", "Network Outage", CyberspaceEntity.HEALTH_AND_STATUS, IconType.MAIN),
    UNKNOWN("03", "Unknown", CyberspaceEntity.HEALTH_AND_STATUS, IconType.MAIN),
    IMPAIRED("04", "Impaired", CyberspaceEntity.HEALTH_AND_STATUS, IconType.MAIN),
    CORE_ROUTER("01", "Core Router", CyberspaceEntity.DEVICE_TYPE, IconType.MAIN),
    ROUTER("02", "Router", CyberspaceEntity.DEVICE_TYPE, IconType.MAIN),
    CROSS_DOMAIN_SOLUTION("03", "Cross Domain Solution", CyberspaceEntity.DEVICE_TYPE, IconType.MAIN),
    MAIL_SERVER("04", "Mail Server", CyberspaceEntity.DEVICE_TYPE, IconType.MAIN),
    WEB_SERVER("05", "Web Server", CyberspaceEntity.DEVICE_TYPE, IconType.MAIN),
    DOMAIN_SERVER("06", "Domain Server", CyberspaceEntity.DEVICE_TYPE, IconType.MAIN),
    FILE_SERVER("07", "File Server", CyberspaceEntity.DEVICE_TYPE, IconType.MAIN),
    PEER_TO_PEER_NODE("08", "Peer-to-Peer Node", CyberspaceEntity.DEVICE_TYPE, IconType.MAIN),
    FIREWALL("09", "Firewall", CyberspaceEntity.DEVICE_TYPE, IconType.MAIN),
    SWITCH("10", "Switch", CyberspaceEntity.DEVICE_TYPE, IconType.MAIN),
    HOST("11", "Host", CyberspaceEntity.DEVICE_TYPE, IconType.MAIN),
    VIRTUAL_PRIVATE_NETWORK_VPN("12", "Virtual Private Network (VPN)", CyberspaceEntity.DEVICE_TYPE, IconType.MAIN),
    DEPARTMENT_OF_DEFENSE_DOD("01", "Department of Defense (DoD)", CyberspaceEntity.DEVICE_DOMAIN, IconType.MAIN),
    GOVERNMENT("02", "Government", CyberspaceEntity.DEVICE_DOMAIN, IconType.MAIN),
    CONTRACTOR("03", "Contractor", CyberspaceEntity.DEVICE_DOMAIN, IconType.MAIN),
    SUPERVISORY_CONTROL_AND_DATA_ACQUISITION_SCADA("04", "Supervisory Control and Data Acquisition (SCADA)", CyberspaceEntity.DEVICE_DOMAIN, IconType.MAIN),
    NON_GOVERNMENT("05", "Non-Government", CyberspaceEntity.DEVICE_DOMAIN, IconType.MAIN),
    CYBER_INFECTION("01", "Infection", CyberspaceEntity.EFFECT, IconType.MAIN),
    DEGRADATION("02", "Degradation", CyberspaceEntity.EFFECT, IconType.MAIN),
    DATA_SPOOFING("03", "Data Spoofing", CyberspaceEntity.EFFECT, IconType.MAIN),
    DATA_MANIPULATION("04", "Data Manipulation", CyberspaceEntity.EFFECT, IconType.MAIN),
    EXFILTRATION("05", "Exfiltration", CyberspaceEntity.EFFECT, IconType.MAIN),
    POWER_OUTAGE("06", "Power Outage", CyberspaceEntity.EFFECT, IconType.MAIN),
    CYBER_NETWORK_OUTAGE("07", "Network Outage", CyberspaceEntity.EFFECT, IconType.MAIN),
    SERVICE_OUTAGE("08", "Service Outage", CyberspaceEntity.EFFECT, IconType.MAIN),
    DEVICE_OUTAGE("09", "Device Outage", CyberspaceEntity.EFFECT, IconType.MAIN);

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
    
   @Override
    public List<EntitySubType> getEntitySubTypes() {
        return CyberspaceSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

}