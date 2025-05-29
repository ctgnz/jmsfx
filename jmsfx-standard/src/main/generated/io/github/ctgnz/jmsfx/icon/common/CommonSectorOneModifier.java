package io.github.ctgnz.jmsfx.icon.common;

import io.github.ctgnz.jmsfx.icon.SectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum CommonSectorOneModifier implements SectorOneModifier {
    UAV_DRONE_MOD("1", "00", "UAV/Drone Equipped/Drone", "Mobility"),
    ROBOTIC_MOD("1", "01", "Robotic", "Mobility"),
    FIXED_WING_MOD("1", "02", "Fixed Wing", "Mobility"),
    ROTARY_WING_MOD("1", "03", "Rotary Wing", "Mobility"),
    TILT_ROTOR_MOD("1", "04", "Tilt Rotor", "Mobility"),
    VSTOL_VTOL_MOD("1", "05", "VSTOL/VTOL or Helicopter Equipped", "Capability"),
    ATTACK_MOD("1", "06", "Attack of Attack/Strike", "Capability"),
    ARMOURED_MOD("1", "07", "Armoured", "Capability"),
    BALLISTIC_MISSILE_MOD("1", "08", "Ballistic Missile/Ballistic Missile Defence Shooter", "Capability"),
    BRIDGE_MOD("1", "09", "Bridge/Bridging", "Capability"),
    CARGO_MOD("1", "10", "Cargo", "Capability"),
    UTILITY_MOD("1", "11", "Utility", "Capability"),
    LIGHT_MOD("1", "12", "Light", "Capability"),
    MEDIUM_MOD("1", "13", "Medium", "Capability"),
    HEAVY_MOD("1", "14", "Heavy", "Capability"),
    CYBERSPACE_MOD("1", "15", "Cyberspace", "Capability"),
    COMMAND_POST_NODE_MOD("1", "16", "Command Post Node", "Capability"),
    JOINT_NETWORK_NODE_MOD("1", "17", "Joint Network Node", "Capability"),
    RETRANSMISSION_MOD("1", "18", "Retransmission", "Capability"),
    BRIGADE_MOD("1", "19", "Brigade", "Capability"),
    CLOSE_PROTECTION_MOD("1", "20", "Close Protection", "Capability"),
    COMBAT_MOD("1", "21", "Combat", "Capability"),
    COMMAND_CONTROL_MOD("1", "22", "Command and Control", "Capability"),
    CROWD_RIOT_CONTROL_MOD("1", "23", "Crowd and Riot Control", "Capability"),
    EXPLOSIVE_ORDNANCE_DISPOSAL_MOD("1", "24", "Explosive Ordnance Disposal (EOD)", "Capability"),
    INTELLIGENCE_SURVEILLANCE_RECONNAISSANCE_MOD("1", "25", "Intelligence, Surveillance, Reconnaissance", "Capability"),
    MAINTENANCE_MOD("1", "26", "Maintenance", "Capability"),
    MEDEVAC_MEDICAL_MOD("1", "27", "MEDEVAC/Medic/Medical", "Capability"),
    SEARCH_RESCUE_MOD("1", "28", "Search and Rescue", "Capability"),
    SECURITY_MOD("1", "29", "Security", "Capability"),
    SNIPER_MOD("1", "30", "Sniper", "Capability"),
    SPECIAL_OPERATIONS_FORCES_MOD("1", "31", "Special Operations Forces", "Capability"),
    SPECIAL_WEAPONS_TACTICS_MOD("1", "32", "Special Weapons and Tactics (SWAT)", "Capability"),
    GUIDED_MISSILE_MOD("1", "33", "Guided Missile", "Capability"),
    OTHER_GUIDED_MISSILE_MOD("1", "34", "Other Guided Missile", "Capability"),
    POL_MOD("1", "35", "Petroleum, Oil and Lubricants", "Capability"),
    WATER_MOD("1", "36", "Water", "Capability"),
    WEAPONS_MOD("1", "37", "Weapon or Weapons", "Capability"),
    CHEMICAL_MOD("1", "38", "Chemical", "CBRN"),
    BIOLOGICAL_MOD("1", "39", "Biological", "CBRN"),
    RADIOLOGICAL_MOD("1", "40", "Radiological", "CBRN"),
    NUCLEAR_MOD("1", "41", "Nuclear", "CBRN"),
    DECONTAMINATION_MOD("1", "42", "Decontamination", "CBRN"),
    CIVILIAN_MOD("1", "43", "Civilian", "Organization"),
    GOVERNMENT_ORGANIZATION_MOD("1", "44", "Government Organization/Government Organization Member", "Organization"),
    ACCIDENT_MOD("1", "45", "Accident", "Composite Loss or Incident Qualifier"),
    ASSASSINATION_MOD("1", "46", "Assassination", "Crime"),
    EXECUTION_MOD("1", "47", "Execution", "Crime"),
    KIDNAPPING_MOD("1", "48", "Kidnapping", "Crime"),
    PIRACY_MOD("1", "49", "Piracy", "Crime"),
    RAPE_MOD("1", "50", "Rape", "Crime"),
    ANTISUBMARINE_WARFARE_MOD("1", "51", "Antisubmarine Warfare", "Mission Area"),
    ESCORT_MOD("1", "52", "Escort", "Mission Area"),
    MINE_COUNTERMEASURES_MOD("1", "53", "Mine Countermeasures", "Mission Area"),
    MINE_WARFARE_MOD("1", "54", "Mine Warfare", "Mission Area"),
    SURFACE_WARFARE_MOD("1", "55", "Surface Warfare", "Mission Area"),
    HIJACK_MOD("1", "65", "Hijack/Hijacking/Hijacker", "Crime"),
    ELECTROMAGNETIC_WARFARE_MOD("1", "66", "Electromagnetic Warfare", "Capability");

    private final String groupId;
    private final String id;
    private final String label;
    private final String category;
    
    private CommonSectorOneModifier(String groupId, String id, String label, String category) {
        this.groupId = groupId;
        this.id = id;
        this.label = label;
        this.category = category;
    }
    
    @Override
    public String getCategory() {
        return category;
    }
    
    @Override
    public String getGraphicIdentifier() {
        return String.format("C1%s%s", getGroupId(), getId());
    }

    public String getGroupId() {
        return groupId;
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
    public SymbolSet getSymbolSet() {
        return SymbolSet.COMMON;
    }
    
    @Override
    public boolean isUnknown() {
        return false;
    }
    
}