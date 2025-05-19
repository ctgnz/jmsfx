package nz.co.ctg.jmsfx.model;

public enum CommonSectorOneModifier implements SectorOneModifier {
    UAV_DRONE_MOD("00", "UAV/Drone Equipped/Drone"),
    ROBOTIC_MOD("01", "Robotic"),
    FIXED_WING_MOD("02", "Fixed Wing"),
    ROTARY_WING_MOD("03", "Rotary Wing"),
    TILT_ROTOR_MOD("04", "Tilt Rotor"),
    VSTOL_VTOL_MOD("05", "VSTOL/VTOL or Helicopter Equipped"),
    ATTACK_MOD("06", "Attack of Attack/Strike"),
    ARMOURED_MOD("07", "Armoured"),
    BALLISTIC_MISSILE_MOD("08", "Ballistic Missile/Ballistic Missile Defence Shooter"),
    BRIDGE_MOD("09", "Bridge/Bridging"),
    CARGO_MOD("10", "Cargo"),
    UTILITY_MOD("11", "Utility"),
    LIGHT_MOD("12", "Light"),
    MEDIUM_MOD("13", "Medium"),
    HEAVY_MOD("14", "Heavy"),
    CYBERSPACE_MOD("15", "Cyberspace"),
    COMMAND_POST_NODE_MOD("16", "Command Post Node"),
    JOINT_NETWORK_NODE_MOD("17", "Joint Network Node"),
    RETRANSMISSION_MOD("18", "Retransmission"),
    BRIGADE_MOD("19", "Brigade"),
    CLOSE_PROTECTION_MOD("20", "Close Protection"),
    COMBAT_MOD("21", "Combat"),
    COMMAND_CONTROL_MOD("22", "Command and Control"),
    CROWD_RIOT_CONTROL_MOD("23", "Crowd and Riot Control"),
    EXPLOSIVE_ORDNANCE_DISPOSAL_MOD("24", "Explosive Ordnance Disposal (EOD)"),
    INTELLIGENCE_SURVEILLANCE_RECONNAISSANCE_MOD("25", "Intelligence, Surveillance, Reconnaissance"),
    MAINTENANCE_MOD("26", "Maintenance"),
    MEDEVAC_MEDICAL_MOD("27", "MEDEVAC/Medic/Medical"),
    SEARCH_RESCUE_MOD("28", "Search and Rescue"),
    SECURITY_MOD("29", "Security"),
    SNIPER_MOD("30", "Sniper"),
    SPECIAL_OPERATIONS_FORCES_MOD("31", "Special Operations Forces"),
    SPECIAL_WEAPONS_TACTICS_MOD("32", "Special Weapons and Tactics (SWAT)"),
    GUIDED_MISSILE_MOD("33", "Guided Missile"),
    OTHER_GUIDED_MISSILE_MOD("34", "Other Guided Missile"),
    POL_MOD("35", "Petroleum, Oil and Lubricants"),
    WATER_MOD("36", "Water"),
    WEAPONS_MOD("37", "Weapon or Weapons"),
    CHEMICAL_MOD("38", "Chemical"),
    BIOLOGICAL_MOD("39", "Biological"),
    RADIOLOGICAL_MOD("40", "Radiological"),
    NUCLEAR_MOD("41", "Nuclear"),
    DECONTAMINATION_MOD("42", "Decontamination"),
    CIVILIAN_MOD("43", "Civilian"),
    GOVERNMENT_ORGANIZATION_MOD("44", "Government Organization/Government Organization Member"),
    ACCIDENT_MOD("45", "Accident"),
    ASSASSINATION_MOD("46", "Assassination"),
    EXECUTION_MOD("47", "Execution"),
    KIDNAPPING_MOD("48", "Kidnapping"),
    PIRACY_MOD("49", "Piracy"),
    RAPE_MOD("50", "Rape"),
    ANTISUBMARINE_WARFARE_MOD("51", "Antisubmarine Warfare"),
    ESCORT_MOD("52", "Escort"),
    MINE_COUNTERMEASURES_MOD("53", "Mine Countermeasures"),
    MINE_WARFARE_MOD("54", "Mine Warfare"),
    SURFACE_WARFARE_MOD("55", "Surface Warfare"),
    HIJACK_MOD("65", "Hijack/Hijacking/Hijacker"),
    ELECTROMAGNETIC_WARFARE_MOD("66", "Electromagnetic Warfare");

    private final String id;
    private final String label;
    
    private CommonSectorOneModifier(String id, String label) {
        this.id = id;
        this.label = label;
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
    
}