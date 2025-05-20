package nz.co.ctg.jmsfx.model;

public enum CommonSectorOneModifier implements SectorOneModifier {
    UAV_DRONE_MOD("1", "00", "UAV/Drone Equipped/Drone"),
    ROBOTIC_MOD("1", "01", "Robotic"),
    FIXED_WING_MOD("1", "02", "Fixed Wing"),
    ROTARY_WING_MOD("1", "03", "Rotary Wing"),
    TILT_ROTOR_MOD("1", "04", "Tilt Rotor"),
    VSTOL_VTOL_MOD("1", "05", "VSTOL/VTOL or Helicopter Equipped"),
    ATTACK_MOD("1", "06", "Attack of Attack/Strike"),
    ARMOURED_MOD("1", "07", "Armoured"),
    BALLISTIC_MISSILE_MOD("1", "08", "Ballistic Missile/Ballistic Missile Defence Shooter"),
    BRIDGE_MOD("1", "09", "Bridge/Bridging"),
    CARGO_MOD("1", "10", "Cargo"),
    UTILITY_MOD("1", "11", "Utility"),
    LIGHT_MOD("1", "12", "Light"),
    MEDIUM_MOD("1", "13", "Medium"),
    HEAVY_MOD("1", "14", "Heavy"),
    CYBERSPACE_MOD("1", "15", "Cyberspace"),
    COMMAND_POST_NODE_MOD("1", "16", "Command Post Node"),
    JOINT_NETWORK_NODE_MOD("1", "17", "Joint Network Node"),
    RETRANSMISSION_MOD("1", "18", "Retransmission"),
    BRIGADE_MOD("1", "19", "Brigade"),
    CLOSE_PROTECTION_MOD("1", "20", "Close Protection"),
    COMBAT_MOD("1", "21", "Combat"),
    COMMAND_CONTROL_MOD("1", "22", "Command and Control"),
    CROWD_RIOT_CONTROL_MOD("1", "23", "Crowd and Riot Control"),
    EXPLOSIVE_ORDNANCE_DISPOSAL_MOD("1", "24", "Explosive Ordnance Disposal (EOD)"),
    INTELLIGENCE_SURVEILLANCE_RECONNAISSANCE_MOD("1", "25", "Intelligence, Surveillance, Reconnaissance"),
    MAINTENANCE_MOD("1", "26", "Maintenance"),
    MEDEVAC_MEDICAL_MOD("1", "27", "MEDEVAC/Medic/Medical"),
    SEARCH_RESCUE_MOD("1", "28", "Search and Rescue"),
    SECURITY_MOD("1", "29", "Security"),
    SNIPER_MOD("1", "30", "Sniper"),
    SPECIAL_OPERATIONS_FORCES_MOD("1", "31", "Special Operations Forces"),
    SPECIAL_WEAPONS_TACTICS_MOD("1", "32", "Special Weapons and Tactics (SWAT)"),
    GUIDED_MISSILE_MOD("1", "33", "Guided Missile"),
    OTHER_GUIDED_MISSILE_MOD("1", "34", "Other Guided Missile"),
    POL_MOD("1", "35", "Petroleum, Oil and Lubricants"),
    WATER_MOD("1", "36", "Water"),
    WEAPONS_MOD("1", "37", "Weapon or Weapons"),
    CHEMICAL_MOD("1", "38", "Chemical"),
    BIOLOGICAL_MOD("1", "39", "Biological"),
    RADIOLOGICAL_MOD("1", "40", "Radiological"),
    NUCLEAR_MOD("1", "41", "Nuclear"),
    DECONTAMINATION_MOD("1", "42", "Decontamination"),
    CIVILIAN_MOD("1", "43", "Civilian"),
    GOVERNMENT_ORGANIZATION_MOD("1", "44", "Government Organization/Government Organization Member"),
    ACCIDENT_MOD("1", "45", "Accident"),
    ASSASSINATION_MOD("1", "46", "Assassination"),
    EXECUTION_MOD("1", "47", "Execution"),
    KIDNAPPING_MOD("1", "48", "Kidnapping"),
    PIRACY_MOD("1", "49", "Piracy"),
    RAPE_MOD("1", "50", "Rape"),
    ANTISUBMARINE_WARFARE_MOD("1", "51", "Antisubmarine Warfare"),
    ESCORT_MOD("1", "52", "Escort"),
    MINE_COUNTERMEASURES_MOD("1", "53", "Mine Countermeasures"),
    MINE_WARFARE_MOD("1", "54", "Mine Warfare"),
    SURFACE_WARFARE_MOD("1", "55", "Surface Warfare"),
    HIJACK_MOD("1", "65", "Hijack/Hijacking/Hijacker"),
    ELECTROMAGNETIC_WARFARE_MOD("1", "66", "Electromagnetic Warfare");

    private final String groupId;
    private final String id;
    private final String label;
    
    private CommonSectorOneModifier(String groupId, String id, String label) {
        this.groupId = groupId;
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getGraphicIdentifier() {
        return String.format("%s%s%s1", getSymbolSet().getId(), getGroupId(), getId());
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