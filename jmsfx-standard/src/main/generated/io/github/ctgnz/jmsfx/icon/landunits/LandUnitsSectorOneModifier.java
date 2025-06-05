package io.github.ctgnz.jmsfx.icon.landunits;

import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum LandUnitsSectorOneModifier implements ISectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.LAND_UNIT),
    TACTICAL_SATELLITE_MOD("01", "Tactical Satellite", "Mobility", SymbolSet.LAND_UNIT),
    AREA_MOD("02", "Area", "Capability", SymbolSet.LAND_UNIT),
    BORDER_MOD("05", "Border", "Capability", SymbolSet.LAND_UNIT),
    COMMUNICATIONS_CONTINGENCY_PACKAGE_MOD("11", "Communications Contingency Package", "Capability", SymbolSet.LAND_UNIT),
    CONSTRUCTION_MOD("12", "Construction", "Capability", SymbolSet.LAND_UNIT),
    CROSS_CULTURAL_COMMUNICATION_MOD("13", "Cross Cultural Communication", "Capability", SymbolSet.LAND_UNIT),
    DETENTION_MOD("16", "Detention", "Capability", SymbolSet.LAND_UNIT),
    DIRECT_COMMUNICATIONS_MOD("17", "Direct Communications", "Capability", SymbolSet.LAND_UNIT),
    DIVING_MOD("18", "Diving", "Capability", SymbolSet.LAND_UNIT),
    DIVISION_MOD("19", "Division (Echelon of Support)", "Capability", SymbolSet.LAND_UNIT),
    DOG_MOD("20", "Dog", "Capability", SymbolSet.LAND_UNIT),
    DRILLING_MOD("21", "Drilling", "Capability", SymbolSet.LAND_UNIT),
    ELECTRO_OPTICAL_MOD("22", "Electro-Optical", "Capability", SymbolSet.LAND_UNIT),
    ENHANCED_MOD("23", "Enhanced", "Capability", SymbolSet.LAND_UNIT),
    FIRE_DIRECTION_CENTER_MOD("25", "Fire Direction Center", "Capability", SymbolSet.LAND_UNIT),
    FORCE_MOD("26", "Force", "Capability", SymbolSet.LAND_UNIT),
    FORWARD_MOD("27", "Forward", "Capability", SymbolSet.LAND_UNIT),
    GROUND_STATION_MODULE_MOD("28", "Ground Station Module", "Capability", SymbolSet.LAND_UNIT),
    LANDING_SUPPORT_MOD("29", "Landing Support", "Capability", SymbolSet.LAND_UNIT),
    COMPANY_MOD("30", "Company (Echelon of Support)", "Capability", SymbolSet.LAND_UNIT),
    METEOROLOGICAL_MOD("32", "Meteorological", "Capability", SymbolSet.LAND_UNIT),
    MISSILE_MOD("34", "Missile", "Capability", SymbolSet.LAND_UNIT),
    MOBILE_ADVISOR_SUPPORT_MOD("35", "Mobile Advisor and Support", "Capability", SymbolSet.LAND_UNIT),
    MOBILE_SUBSCRIBER_EQUIPMENT_MOD("36", "Mobile Subscriber Equipment", "Capability", SymbolSet.LAND_UNIT),
    MOBILITY_SUPPORT_MOD("37", "Mobility Support", "Capability", SymbolSet.LAND_UNIT),
    BATTALION_MOD("38", "Battalion (Echelon of Support)", "Capability", SymbolSet.LAND_UNIT),
    MULTINATIONAL_MOD("39", "Multinational", "Capability", SymbolSet.LAND_UNIT),
    MULTINATIONAL_SPECIALIZED_UNIT_MOD("40", "Multinational Specialized Unit", "Capability", SymbolSet.LAND_UNIT),
    MULTIPLE_ROCKET_LAUNCHER_MOD("41", "Multiple Rocket Launcher", "Capability", SymbolSet.LAND_UNIT),
    NATO_MEDICAL_ROLE_1_MOD("42", "NATO Medical Role 1", "Capability", SymbolSet.LAND_UNIT),
    NATO_MEDICAL_ROLE_2_MOD("43", "NATO Medical Role 2", "Capability", SymbolSet.LAND_UNIT),
    NATO_MEDICAL_ROLE_3_MOD("44", "NATO Medical Role 3", "Capability", SymbolSet.LAND_UNIT),
    NATO_MEDICAL_ROLE_4_MOD("45", "NATO Medical Role 4", "Capability", SymbolSet.LAND_UNIT),
    NAVAL_MOD("46", "Naval", "Capability", SymbolSet.LAND_UNIT),
    UNMANNED_AIRCRAFT_SYSTEMS_MOD("47", "Unmanned Aircraft Systems (UAS)", "Capability", SymbolSet.LAND_UNIT),
    OPERATIONS_MOD("49", "Operations", "Capability", SymbolSet.LAND_UNIT),
    RADAR_MOD("50", "Radar", "Capability", SymbolSet.LAND_UNIT),
    RFID_INTERROGATOR_SENSOR_MOD("51", "Radio Frequency Identification (RFID) Interrogator / Sensor", "Capability", SymbolSet.LAND_UNIT),
    SENSOR_MOD("55", "Sensor", "Capability", SymbolSet.LAND_UNIT),
    WEAPON_MOD("56", "Weapon/Weapons", "Capability", SymbolSet.LAND_UNIT),
    SIGNALS_INTELLIGENCE_MOD("57", "Signals Intelligence", "Capability", SymbolSet.LAND_UNIT),
    SINGLE_ROCKET_LAUNCHER_MOD("59", "Single Rocket Launcher", "Capability", SymbolSet.LAND_UNIT),
    SMOKE_MOD("60", "Smoke", "Capability", SymbolSet.LAND_UNIT),
    SOUND_RANGING_MOD("62", "Sound Ranging", "Capability", SymbolSet.LAND_UNIT),
    SURVEY_MOD("65", "Survey", "Capability", SymbolSet.LAND_UNIT),
    TACTICAL_EXPLOITATION_MOD("66", "Tactical Exploitation", "Capability", SymbolSet.LAND_UNIT),
    TARGET_ACQUISITION_MOD("67", "Target Acquisition", "Capability", SymbolSet.LAND_UNIT),
    TOPOGRAPHIC_GEOSPATIAL_MOD("68", "Topographic/Geospatial", "Capability", SymbolSet.LAND_UNIT),
    VIDEO_IMAGERY_MOD("70", "Video Imagery (Combat Camera)", "Capability", SymbolSet.LAND_UNIT),
    MOBILITY_ASSAULT_MOD("71", "Mobility Assault", "Capability", SymbolSet.LAND_UNIT),
    AMPHIBIOUS_WARFARE_SHIP_MOD("72", "Amphibious Warfare Ship", "Capability", SymbolSet.LAND_UNIT),
    LOAD_HANDLING_SYSTEM_MOD("73", "Load Handling System (LHS)", "Capability", SymbolSet.LAND_UNIT),
    PALLETISED_LOAD_SYSTEM_MOD("74", "Palletised Load System (PLS)", "Capability", SymbolSet.LAND_UNIT),
    SUPPORT_MOD("77", "Support", "Capability", SymbolSet.LAND_UNIT),
    ROUTE_RECON_CLEARANCE_MOD("79", "Route, Reconnaissance and Clearing (RRC)", "Capability", SymbolSet.LAND_UNIT),
    NATO_MEDICAL_ROLE_2_BASIC_MOD("81", "NATO Medical Role 2 (Basic)", "Capability", SymbolSet.LAND_UNIT),
    NATO_MEDICAL_ROLE_2_ENHANCED_MOD("82", "NATO Medical Role 2 (Enhanced)", "Capability", SymbolSet.LAND_UNIT),
    NATO_MEDICAL_ROLE_2_FORWARD_MOD("83", "NATO Medical Role 2 (Forward)", "Capability", SymbolSet.LAND_UNIT),
    ASSAULT_MOD("84", "Assault", "Capability", SymbolSet.LAND_UNIT),
    CRIMINAL_INVESTIGATION_DIVISION_MOD("86", "Criminal Investigation Division", "Capability", SymbolSet.LAND_UNIT),
    DIGITAL_MOD("87", "Digital", "Capability", SymbolSet.LAND_UNIT),
    NETWORK_OPERATIONS_MOD("88", "Network or Network Operations", "Capability", SymbolSet.LAND_UNIT),
    AIR_TERMINAL_MOD("89", "Air Terminal", "Capability", SymbolSet.LAND_UNIT),
    PIPELINE_MOD("90", "Pipeline", "Capability", SymbolSet.LAND_UNIT),
    POSTAL_MOD("91", "Postal", "Capability", SymbolSet.LAND_UNIT),
    INDEPENDENT_COMMAND_MOD("93", "Independent Command", "Capability", SymbolSet.LAND_UNIT),
    THEATRE_MOD("94", "Theatre", "Capability", SymbolSet.LAND_UNIT),
    ARMY_THEATRE_ARMY_MOD("95", "Army or Theatre Army", "Capability", SymbolSet.LAND_UNIT),
    CORPS_MOD("96", "Corps", "Capability", SymbolSet.LAND_UNIT),
    HEADQUARTERS_MOD("98", "Headquarters or Headquarters Element", "Capability", SymbolSet.LAND_UNIT);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    LandUnitsSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
    }

    @Override
    public String getCategory() {
        return category;
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