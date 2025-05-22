package nz.co.ctg.jmsfx.model.landunits;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum LandUnitsSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_LAND_UNIT),
    TACTICAL_SATELLITE_MOD("01", "Tactical Satellite", SymbolSet.SS_LAND_UNIT),
    AREA_MOD("02", "Area", SymbolSet.SS_LAND_UNIT),
    BORDER_MOD("05", "Border", SymbolSet.SS_LAND_UNIT),
    COMMUNICATIONS_CONTINGENCY_PACKAGE_MOD("11", "Communications Contingency Package", SymbolSet.SS_LAND_UNIT),
    CONSTRUCTION_MOD("12", "Construction", SymbolSet.SS_LAND_UNIT),
    CROSS_CULTURAL_COMMUNICATION_MOD("13", "Cross Cultural Communication", SymbolSet.SS_LAND_UNIT),
    DETENTION_MOD("16", "Detention", SymbolSet.SS_LAND_UNIT),
    DIRECT_COMMUNICATIONS_MOD("17", "Direct Communications", SymbolSet.SS_LAND_UNIT),
    DIVING_MOD("18", "Diving", SymbolSet.SS_LAND_UNIT),
    DIVISION_MOD("19", "Division (Echelon of Support)", SymbolSet.SS_LAND_UNIT),
    DOG_MOD("20", "Dog", SymbolSet.SS_LAND_UNIT),
    DRILLING_MOD("21", "Drilling", SymbolSet.SS_LAND_UNIT),
    ELECTRO_OPTICAL_MOD("22", "Electro-Optical", SymbolSet.SS_LAND_UNIT),
    ENHANCED_MOD("23", "Enhanced", SymbolSet.SS_LAND_UNIT),
    FIRE_DIRECTION_CENTER_MOD("25", "Fire Direction Center", SymbolSet.SS_LAND_UNIT),
    FORCE_MOD("26", "Force", SymbolSet.SS_LAND_UNIT),
    FORWARD_MOD("27", "Forward", SymbolSet.SS_LAND_UNIT),
    GROUND_STATION_MODULE_MOD("28", "Ground Station Module", SymbolSet.SS_LAND_UNIT),
    LANDING_SUPPORT_MOD("29", "Landing Support", SymbolSet.SS_LAND_UNIT),
    COMPANY_MOD("30", "Company (Echelon of Support)", SymbolSet.SS_LAND_UNIT),
    METEOROLOGICAL_MOD("32", "Meteorological", SymbolSet.SS_LAND_UNIT),
    MISSILE_MOD("34", "Missile", SymbolSet.SS_LAND_UNIT),
    MOBILE_ADVISOR_SUPPORT_MOD("35", "Mobile Advisor and Support", SymbolSet.SS_LAND_UNIT),
    MOBILE_SUBSCRIBER_EQUIPMENT_MOD("36", "Mobile Subscriber Equipment", SymbolSet.SS_LAND_UNIT),
    MOBILITY_SUPPORT_MOD("37", "Mobility Support", SymbolSet.SS_LAND_UNIT),
    BATTALION_MOD("38", "Battalion (Echelon of Support)", SymbolSet.SS_LAND_UNIT),
    MULTINATIONAL_MOD("39", "Multinational", SymbolSet.SS_LAND_UNIT),
    MULTINATIONAL_SPECIALIZED_UNIT_MOD("40", "Multinational Specialized Unit", SymbolSet.SS_LAND_UNIT),
    MULTIPLE_ROCKET_LAUNCHER_MOD("41", "Multiple Rocket Launcher", SymbolSet.SS_LAND_UNIT),
    NATO_MEDICAL_ROLE_1_MOD("42", "NATO Medical Role 1", SymbolSet.SS_LAND_UNIT),
    NATO_MEDICAL_ROLE_2_MOD("43", "NATO Medical Role 2", SymbolSet.SS_LAND_UNIT),
    NATO_MEDICAL_ROLE_3_MOD("44", "NATO Medical Role 3", SymbolSet.SS_LAND_UNIT),
    NATO_MEDICAL_ROLE_4_MOD("45", "NATO Medical Role 4", SymbolSet.SS_LAND_UNIT),
    NAVAL_MOD("46", "Naval", SymbolSet.SS_LAND_UNIT),
    UNMANNED_AIRCRAFT_SYSTEMS_MOD("47", "Unmanned Aircraft Systems (UAS)", SymbolSet.SS_LAND_UNIT),
    OPERATIONS_MOD("49", "Operations", SymbolSet.SS_LAND_UNIT),
    RADAR_MOD("50", "Radar", SymbolSet.SS_LAND_UNIT),
    RFID_INTERROGATOR_SENSOR_MOD("51", "Radio Frequency Identification (RFID) Interrogator / Sensor", SymbolSet.SS_LAND_UNIT),
    SENSOR_MOD("55", "Sensor", SymbolSet.SS_LAND_UNIT),
    WEAPON_MOD("56", "Weapon/Weapons", SymbolSet.SS_LAND_UNIT),
    SIGNALS_INTELLIGENCE_MOD("57", "Signals Intelligence", SymbolSet.SS_LAND_UNIT),
    SINGLE_ROCKET_LAUNCHER_MOD("59", "Single Rocket Launcher", SymbolSet.SS_LAND_UNIT),
    SMOKE_MOD("60", "Smoke", SymbolSet.SS_LAND_UNIT),
    SOUND_RANGING_MOD("62", "Sound Ranging", SymbolSet.SS_LAND_UNIT),
    SURVEY_MOD("65", "Survey", SymbolSet.SS_LAND_UNIT),
    TACTICAL_EXPLOITATION_MOD("66", "Tactical Exploitation", SymbolSet.SS_LAND_UNIT),
    TARGET_ACQUISITION_MOD("67", "Target Acquisition", SymbolSet.SS_LAND_UNIT),
    TOPOGRAPHIC_GEOSPATIAL_MOD("68", "Topographic/Geospatial", SymbolSet.SS_LAND_UNIT),
    VIDEO_IMAGERY_MOD("70", "Video Imagery (Combat Camera)", SymbolSet.SS_LAND_UNIT),
    MOBILITY_ASSAULT_MOD("71", "Mobility Assault", SymbolSet.SS_LAND_UNIT),
    AMPHIBIOUS_WARFARE_SHIP_MOD("72", "Amphibious Warfare Ship", SymbolSet.SS_LAND_UNIT),
    LOAD_HANDLING_SYSTEM_MOD("73", "Load Handling System (LHS)", SymbolSet.SS_LAND_UNIT),
    PALLETISED_LOAD_SYSTEM_MOD("74", "Palletised Load System (PLS)", SymbolSet.SS_LAND_UNIT),
    SUPPORT_MOD("77", "Support", SymbolSet.SS_LAND_UNIT),
    ROUTE_RECON_CLEARANCE_MOD("79", "Route, Reconnaissance and Clearing (RRC)", SymbolSet.SS_LAND_UNIT),
    NATO_MEDICAL_ROLE_2_BASIC_MOD("81", "NATO Medical Role 2 (Basic)", SymbolSet.SS_LAND_UNIT),
    NATO_MEDICAL_ROLE_2_ENHANCED_MOD("82", "NATO Medical Role 2 (Enhanced)", SymbolSet.SS_LAND_UNIT),
    NATO_MEDICAL_ROLE_2_FORWARD_MOD("83", "NATO Medical Role 2 (Forward)", SymbolSet.SS_LAND_UNIT),
    ASSAULT_MOD("84", "Assault", SymbolSet.SS_LAND_UNIT),
    CRIMINAL_INVESTIGATION_DIVISION_MOD("86", "Criminal Investigation Division", SymbolSet.SS_LAND_UNIT),
    DIGITAL_MOD("87", "Digital", SymbolSet.SS_LAND_UNIT),
    NETWORK_OPERATIONS_MOD("88", "Network or Network Operations", SymbolSet.SS_LAND_UNIT),
    AIR_TERMINAL_MOD("89", "Air Terminal", SymbolSet.SS_LAND_UNIT),
    PIPELINE_MOD("90", "Pipeline", SymbolSet.SS_LAND_UNIT),
    POSTAL_MOD("91", "Postal", SymbolSet.SS_LAND_UNIT),
    INDEPENDENT_COMMAND_MOD("93", "Independent Command", SymbolSet.SS_LAND_UNIT),
    THEATRE_MOD("94", "Theatre", SymbolSet.SS_LAND_UNIT),
    ARMY_THEATRE_ARMY_MOD("95", "Army or Theatre Army", SymbolSet.SS_LAND_UNIT),
    CORPS_MOD("96", "Corps", SymbolSet.SS_LAND_UNIT),
    HEADQUARTERS_MOD("98", "Headquarters or Headquarters Element", SymbolSet.SS_LAND_UNIT);

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