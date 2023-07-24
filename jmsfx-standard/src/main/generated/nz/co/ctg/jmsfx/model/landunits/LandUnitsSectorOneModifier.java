package nz.co.ctg.jmsfx.model.landunits;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum LandUnitsSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_LAND_UNIT),
    AIR_MOBILE_AIR_ASSAULT_MOD("01", "Air Mobile/Air Assault (US Only)", SymbolSet.SS_LAND_UNIT),
    AREA_MOD("02", "Area", SymbolSet.SS_LAND_UNIT),
    ATTACK_MOD("03", "Attack", SymbolSet.SS_LAND_UNIT),
    BIOLOGICAL_MOD("04", "Biological", SymbolSet.SS_LAND_UNIT),
    BORDER_MOD("05", "Border", SymbolSet.SS_LAND_UNIT),
    BRIDGING_MOD("06", "Bridging", SymbolSet.SS_LAND_UNIT),
    CHEMICAL_MOD("07", "Chemical", SymbolSet.SS_LAND_UNIT),
    CLOSE_PROTECTION_MOD("08", "Close Protection", SymbolSet.SS_LAND_UNIT),
    COMBAT_MOD("09", "Combat", SymbolSet.SS_LAND_UNIT),
    COMMAND_CONTROL_MOD("10", "Command and Control", SymbolSet.SS_LAND_UNIT),
    COMMUNICATIONS_CONTINGENCY_PACKAGE_MOD("11", "Communications Contingency Package", SymbolSet.SS_LAND_UNIT),
    CONSTRUCTION_MOD("12", "Construction", SymbolSet.SS_LAND_UNIT),
    CROSS_CULTURAL_COMMUNICATION_MOD("13", "Cross Cultural Communication", SymbolSet.SS_LAND_UNIT),
    CROWD_RIOT_CONTROL_MOD("14", "Crowd and Riot Control", SymbolSet.SS_LAND_UNIT),
    DECONTAMINATION_MOD("15", "Decontamination", SymbolSet.SS_LAND_UNIT),
    DETENTION_MOD("16", "Detention", SymbolSet.SS_LAND_UNIT),
    DIRECT_COMMUNICATIONS_MOD("17", "Direct Communications", SymbolSet.SS_LAND_UNIT),
    DIVING_MOD("18", "Diving", SymbolSet.SS_LAND_UNIT),
    DIVISION_MOD("19", "Division", SymbolSet.SS_LAND_UNIT),
    DOG_MOD("20", "Dog", SymbolSet.SS_LAND_UNIT),
    DRILLING_MOD("21", "Drilling", SymbolSet.SS_LAND_UNIT),
    ELECTRO_OPTICAL_MOD("22", "Electro-Optical", SymbolSet.SS_LAND_UNIT),
    ENHANCED_MOD("23", "Enhanced", SymbolSet.SS_LAND_UNIT),
    EXPLOSIVE_ORDNANCE_DISPOSAL_EOD_MOD("24", "Explosive Ordnance Disposal (EOD)", SymbolSet.SS_LAND_UNIT),
    FIRE_DIRECTION_CENTER_MOD("25", "Fire Direction Center", SymbolSet.SS_LAND_UNIT),
    FORCE_MOD("26", "Force", SymbolSet.SS_LAND_UNIT),
    FORWARD_MOD("27", "Forward", SymbolSet.SS_LAND_UNIT),
    GROUND_STATION_MODULE_MOD("28", "Ground Station Module", SymbolSet.SS_LAND_UNIT),
    LANDING_SUPPORT_MOD("29", "Landing Support", SymbolSet.SS_LAND_UNIT),
    LARGE_EXTENSION_NODE_MOD("30", "Large Extension Node", SymbolSet.SS_LAND_UNIT),
    MAINTENANCE_MOD("31", "Maintenance", SymbolSet.SS_LAND_UNIT),
    METEOROLOGICAL_MOD("32", "Meteorological", SymbolSet.SS_LAND_UNIT),
    MINE_COUNTERMEASURE_MOD("33", "Mine Countermeasure", SymbolSet.SS_LAND_UNIT),
    MISSILE_MOD("34", "Missile", SymbolSet.SS_LAND_UNIT),
    MOBILE_ADVISOR_SUPPORT_MOD("35", "Mobile Advisor and Support", SymbolSet.SS_LAND_UNIT),
    MOBILE_SUBSCRIBER_EQUIPMENT_MOD("36", "Mobile Subscriber Equipment", SymbolSet.SS_LAND_UNIT),
    MOBILITY_SUPPORT_MOD("37", "Mobility Support", SymbolSet.SS_LAND_UNIT),
    MOVEMENT_CONTROL_CENTER_MOD("38", "Movement Control Center", SymbolSet.SS_LAND_UNIT),
    MULTINATIONAL_MOD("39", "Multinational", SymbolSet.SS_LAND_UNIT),
    MULTINATIONAL_SPECIALIZED_UNIT_MOD("40", "Multinational Specialized Unit", SymbolSet.SS_LAND_UNIT),
    MULTIPLE_ROCKET_LAUNCHER_MOD("41", "Multiple Rocket Launcher", SymbolSet.SS_LAND_UNIT),
    NATO_MEDICAL_ROLE_1_MOD("42", "NATO Medical Role 1", SymbolSet.SS_LAND_UNIT),
    NATO_MEDICAL_ROLE_2_MOD("43", "NATO Medical Role 2", SymbolSet.SS_LAND_UNIT),
    NATO_MEDICAL_ROLE_3_MOD("44", "NATO Medical Role 3", SymbolSet.SS_LAND_UNIT),
    NATO_MEDICAL_ROLE_4_MOD("45", "NATO Medical Role 4", SymbolSet.SS_LAND_UNIT),
    NAVAL_MOD("46", "Naval", SymbolSet.SS_LAND_UNIT),
    NODE_CENTER_MOD("47", "Node Center", SymbolSet.SS_LAND_UNIT),
    NUCLEAR_MOD("48", "Nuclear", SymbolSet.SS_LAND_UNIT),
    OPERATIONS_MOD("49", "Operations", SymbolSet.SS_LAND_UNIT),
    RADAR_MOD("50", "Radar", SymbolSet.SS_LAND_UNIT),
    RFID_INTERROGATOR_SENSOR_MOD("51", "Radio Frequency Identification (RFID) Interrogator / Sensor", SymbolSet.SS_LAND_UNIT),
    RADIOLOGICAL_MOD("52", "Radiological", SymbolSet.SS_LAND_UNIT),
    SEARCH_RESCUE_MOD("53", "Search and Rescue", SymbolSet.SS_LAND_UNIT),
    SECURITY_MOD("54", "Security", SymbolSet.SS_LAND_UNIT),
    SENSOR_MOD("55", "Sensor", SymbolSet.SS_LAND_UNIT),
    SENSOR_CONTROL_MODULE_SCM_MOD("56", "Sensor Control Module (SCM)", SymbolSet.SS_LAND_UNIT),
    SIGNALS_INTELLIGENCE_MOD("57", "Signals Intelligence", SymbolSet.SS_LAND_UNIT),
    SINGLE_SHELTER_SWITCH_MOD("58", "Single Shelter Switch", SymbolSet.SS_LAND_UNIT),
    SINGLE_ROCKET_LAUNCHER_MOD("59", "Single Rocket Launcher", SymbolSet.SS_LAND_UNIT),
    SMOKE_MOD("60", "Smoke", SymbolSet.SS_LAND_UNIT),
    SNIPER_MOD("61", "Sniper", SymbolSet.SS_LAND_UNIT),
    SOUND_RANGING_MOD("62", "Sound Ranging", SymbolSet.SS_LAND_UNIT),
    SPEC_OPS_SOF_MOD("63", "Special Operations Forces (SOF)", SymbolSet.SS_LAND_UNIT),
    SPECIAL_WEAPONS_TACTICS_MOD("64", "Special Weapons and Tactics", SymbolSet.SS_LAND_UNIT),
    SURVEY_MOD("65", "Survey", SymbolSet.SS_LAND_UNIT),
    TACTICAL_EXPLOITATION_MOD("66", "Tactical Exploitation", SymbolSet.SS_LAND_UNIT),
    TARGET_ACQUISITION_MOD("67", "Target Acquisition", SymbolSet.SS_LAND_UNIT),
    TOPOGRAPHIC_MOD("68", "Topographic", SymbolSet.SS_LAND_UNIT),
    UTILITY_MOD("69", "Utility", SymbolSet.SS_LAND_UNIT),
    VIDEO_IMAGERY_MOD("70", "Video Imagery (Combat Camera)", SymbolSet.SS_LAND_UNIT),
    ACCIDENT_MOD("71", "Accident", SymbolSet.SS_LAND_UNIT),
    OTHER_MOD("72", "Other", SymbolSet.SS_LAND_UNIT),
    CIVILIAN_MOD("73", "Civilian", SymbolSet.SS_LAND_UNIT),
    ANTISUBMARINE_WARFARE_MOD("74", "Antisubmarine Warfare", SymbolSet.SS_LAND_UNIT),
    MEDEVAC_MOD("75", "Medevac", SymbolSet.SS_LAND_UNIT),
    RANGER_MOD("76", "Ranger", SymbolSet.SS_LAND_UNIT),
    SUPPORT_MOD("77", "Support", SymbolSet.SS_LAND_UNIT),
    AVIATION_MOD("78", "Aviation", SymbolSet.SS_LAND_UNIT);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private LandUnitsSectorOneModifier(String id, String label, SymbolSet symbolSet) {
        this.id = id;
        this.label = label;
        this.symbolSet = symbolSet;
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
        return symbolSet;
    }
    
}