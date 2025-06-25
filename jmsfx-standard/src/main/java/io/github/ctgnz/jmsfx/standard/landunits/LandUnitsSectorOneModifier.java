package io.github.ctgnz.jmsfx.standard.landunits;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandUnitsSectorOneModifier implements SectorOneModifier {
    TACTICAL_SATELLITE_MOD("01", "Tactical Satellite", "Mobility", SymbolSetEnum.LAND_UNIT),
    AREA_MOD("02", "Area", "Capability", SymbolSetEnum.LAND_UNIT),
    BORDER_MOD("05", "Border", "Capability", SymbolSetEnum.LAND_UNIT),
    COMMUNICATIONS_CONTINGENCY_PACKAGE_MOD("11", "Communications Contingency Package", "Capability", SymbolSetEnum.LAND_UNIT),
    CONSTRUCTION_MOD("12", "Construction", "Capability", SymbolSetEnum.LAND_UNIT),
    CROSS_CULTURAL_COMMUNICATION_MOD("13", "Cross Cultural Communication", "Capability", SymbolSetEnum.LAND_UNIT),
    DETENTION_MOD("16", "Detention", "Capability", SymbolSetEnum.LAND_UNIT),
    DIRECT_COMMUNICATIONS_MOD("17", "Direct Communications", "Capability", SymbolSetEnum.LAND_UNIT),
    DIVING_MOD("18", "Diving", "Capability", SymbolSetEnum.LAND_UNIT),
    DIVISION_MOD("19", "Division (Echelon of Support)", "Capability", SymbolSetEnum.LAND_UNIT),
    DOG_MOD("20", "Dog", "Capability", SymbolSetEnum.LAND_UNIT),
    DRILLING_MOD("21", "Drilling", "Capability", SymbolSetEnum.LAND_UNIT),
    ELECTRO_OPTICAL_MOD("22", "Electro-Optical", "Capability", SymbolSetEnum.LAND_UNIT),
    ENHANCED_MOD("23", "Enhanced", "Capability", SymbolSetEnum.LAND_UNIT),
    FIRE_DIRECTION_CENTER_MOD("25", "Fire Direction Center", "Capability", SymbolSetEnum.LAND_UNIT),
    FORCE_MOD("26", "Force", "Capability", SymbolSetEnum.LAND_UNIT),
    FORWARD_MOD("27", "Forward", "Capability", SymbolSetEnum.LAND_UNIT),
    GROUND_STATION_MODULE_MOD("28", "Ground Station Module", "Capability", SymbolSetEnum.LAND_UNIT),
    LANDING_SUPPORT_MOD("29", "Landing Support", "Capability", SymbolSetEnum.LAND_UNIT),
    COMPANY_MOD("30", "Company (Echelon of Support)", "Capability", SymbolSetEnum.LAND_UNIT),
    METEOROLOGICAL_MOD("32", "Meteorological", "Capability", SymbolSetEnum.LAND_UNIT),
    MISSILE_MOD("34", "Missile", "Capability", SymbolSetEnum.LAND_UNIT),
    MOBILE_ADVISOR_SUPPORT_MOD("35", "Mobile Advisor and Support", "Capability", SymbolSetEnum.LAND_UNIT),
    MOBILE_SUBSCRIBER_EQUIPMENT_MOD("36", "Mobile Subscriber Equipment", "Capability", SymbolSetEnum.LAND_UNIT),
    MOBILITY_SUPPORT_MOD("37", "Mobility Support", "Capability", SymbolSetEnum.LAND_UNIT),
    BATTALION_MOD("38", "Battalion (Echelon of Support)", "Capability", SymbolSetEnum.LAND_UNIT),
    MULTINATIONAL_MOD("39", "Multinational", "Capability", SymbolSetEnum.LAND_UNIT),
    MULTINATIONAL_SPECIALIZED_UNIT_MOD("40", "Multinational Specialized Unit", "Capability", SymbolSetEnum.LAND_UNIT),
    MULTIPLE_ROCKET_LAUNCHER_MOD("41", "Multiple Rocket Launcher", "Capability", SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_1_MOD("42", "NATO Medical Role 1", "Capability", SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_2_MOD("43", "NATO Medical Role 2", "Capability", SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_3_MOD("44", "NATO Medical Role 3", "Capability", SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_4_MOD("45", "NATO Medical Role 4", "Capability", SymbolSetEnum.LAND_UNIT),
    NAVAL_MOD("46", "Naval", "Capability", SymbolSetEnum.LAND_UNIT),
    UNMANNED_AIRCRAFT_SYSTEMS_MOD("47", "Unmanned Aircraft Systems (UAS)", "Capability", SymbolSetEnum.LAND_UNIT),
    OPERATIONS_MOD("49", "Operations", "Capability", SymbolSetEnum.LAND_UNIT),
    RADAR_MOD("50", "Radar", "Capability", SymbolSetEnum.LAND_UNIT),
    RFID_INTERROGATOR_SENSOR_MOD("51", "Radio Frequency Identification (RFID) Interrogator / Sensor", "Capability", SymbolSetEnum.LAND_UNIT),
    SENSOR_MOD("55", "Sensor", "Capability", SymbolSetEnum.LAND_UNIT),
    WEAPON_MOD("56", "Weapon/Weapons", "Capability", SymbolSetEnum.LAND_UNIT),
    SIGNALS_INTELLIGENCE_MOD("57", "Signals Intelligence", "Capability", SymbolSetEnum.LAND_UNIT),
    SINGLE_ROCKET_LAUNCHER_MOD("59", "Single Rocket Launcher", "Capability", SymbolSetEnum.LAND_UNIT),
    SMOKE_MOD("60", "Smoke", "Capability", SymbolSetEnum.LAND_UNIT),
    SOUND_RANGING_MOD("62", "Sound Ranging", "Capability", SymbolSetEnum.LAND_UNIT),
    SURVEY_MOD("65", "Survey", "Capability", SymbolSetEnum.LAND_UNIT),
    TACTICAL_EXPLOITATION_MOD("66", "Tactical Exploitation", "Capability", SymbolSetEnum.LAND_UNIT),
    TARGET_ACQUISITION_MOD("67", "Target Acquisition", "Capability", SymbolSetEnum.LAND_UNIT),
    TOPOGRAPHIC_GEOSPATIAL_MOD("68", "Topographic/Geospatial", "Capability", SymbolSetEnum.LAND_UNIT),
    VIDEO_IMAGERY_MOD("70", "Video Imagery (Combat Camera)", "Capability", SymbolSetEnum.LAND_UNIT),
    MOBILITY_ASSAULT_MOD("71", "Mobility Assault", "Capability", SymbolSetEnum.LAND_UNIT),
    AMPHIBIOUS_WARFARE_SHIP_MOD("72", "Amphibious Warfare Ship", "Capability", SymbolSetEnum.LAND_UNIT),
    LOAD_HANDLING_SYSTEM_MOD("73", "Load Handling System (LHS)", "Capability", SymbolSetEnum.LAND_UNIT),
    PALLETISED_LOAD_SYSTEM_MOD("74", "Palletised Load System (PLS)", "Capability", SymbolSetEnum.LAND_UNIT),
    SUPPORT_MOD("77", "Support", "Capability", SymbolSetEnum.LAND_UNIT),
    ROUTE_RECON_CLEARANCE_MOD("79", "Route, Reconnaissance and Clearing (RRC)", "Capability", SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_2_BASIC_MOD("81", "NATO Medical Role 2 (Basic)", "Capability", SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_2_ENHANCED_MOD("82", "NATO Medical Role 2 (Enhanced)", "Capability", SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_2_FORWARD_MOD("83", "NATO Medical Role 2 (Forward)", "Capability", SymbolSetEnum.LAND_UNIT),
    ASSAULT_MOD("84", "Assault", "Capability", SymbolSetEnum.LAND_UNIT),
    CRIMINAL_INVESTIGATION_DIVISION_MOD("86", "Criminal Investigation Division", "Capability", SymbolSetEnum.LAND_UNIT),
    DIGITAL_MOD("87", "Digital", "Capability", SymbolSetEnum.LAND_UNIT),
    NETWORK_OPERATIONS_MOD("88", "Network or Network Operations", "Capability", SymbolSetEnum.LAND_UNIT),
    AIR_TERMINAL_MOD("89", "Air Terminal", "Capability", SymbolSetEnum.LAND_UNIT),
    PIPELINE_MOD("90", "Pipeline", "Capability", SymbolSetEnum.LAND_UNIT),
    POSTAL_MOD("91", "Postal", "Capability", SymbolSetEnum.LAND_UNIT),
    INDEPENDENT_COMMAND_MOD("93", "Independent Command", "Capability", SymbolSetEnum.LAND_UNIT),
    THEATRE_MOD("94", "Theatre", "Capability", SymbolSetEnum.LAND_UNIT),
    ARMY_THEATRE_ARMY_MOD("95", "Army or Theatre Army", "Capability", SymbolSetEnum.LAND_UNIT),
    CORPS_MOD("96", "Corps", "Capability", SymbolSetEnum.LAND_UNIT),
    HEADQUARTERS_MOD("98", "Headquarters or Headquarters Element", "Capability", SymbolSetEnum.LAND_UNIT);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    LandUnitsSectorOneModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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