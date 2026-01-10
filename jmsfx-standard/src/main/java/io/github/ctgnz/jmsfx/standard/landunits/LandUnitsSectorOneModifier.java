package io.github.ctgnz.jmsfx.standard.landunits;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandUnitsSectorOneModifier implements SectorOneModifier {
    TACTICAL_SATELLITE("01", "Tactical Satellite", ModifierCategory.Mobility),
    AREA("02", "Area", ModifierCategory.Capability),
    BORDER("05", "Border", ModifierCategory.Capability),
    COMMUNICATIONS_CONTINGENCY_PACKAGE("11", "Communications Contingency Package", ModifierCategory.Capability),
    CONSTRUCTION("12", "Construction", ModifierCategory.Capability),
    CROSS_CULTURAL_COMMUNICATION("13", "Cross Cultural Communication", ModifierCategory.Capability),
    DETENTION("16", "Detention", ModifierCategory.Capability),
    DIRECT_COMMUNICATIONS("17", "Direct Communications", ModifierCategory.Capability),
    DIVING("18", "Diving", ModifierCategory.Capability),
    DIVISION("19", "Division (Echelon of Support)", ModifierCategory.Capability),
    DOG("20", "Dog", ModifierCategory.Capability),
    DRILLING("21", "Drilling", ModifierCategory.Capability),
    ELECTRO_OPTICAL("22", "Electro-Optical", ModifierCategory.Capability),
    ENHANCED("23", "Enhanced", ModifierCategory.Capability),
    FIRE_DIRECTION_CENTER("25", "Fire Direction Center", ModifierCategory.Capability),
    FORCE("26", "Force", ModifierCategory.Capability),
    FORWARD("27", "Forward", ModifierCategory.Capability),
    GROUND_STATION_MODULE("28", "Ground Station Module", ModifierCategory.Capability),
    LANDING_SUPPORT("29", "Landing Support", ModifierCategory.Capability),
    COMPANY("30", "Company (Echelon of Support)", ModifierCategory.Capability),
    METEOROLOGICAL("32", "Meteorological", ModifierCategory.Capability),
    MISSILE("34", "Missile", ModifierCategory.Capability),
    MOBILE_ADVISOR_SUPPORT("35", "Mobile Advisor and Support", ModifierCategory.Capability),
    MOBILE_SUBSCRIBER_EQUIPMENT("36", "Mobile Subscriber Equipment", ModifierCategory.Capability),
    MOBILITY_SUPPORT("37", "Mobility Support", ModifierCategory.Capability),
    BATTALION("38", "Battalion (Echelon of Support)", ModifierCategory.Capability),
    MULTINATIONAL("39", "Multinational", ModifierCategory.Capability),
    MULTINATIONAL_SPECIALIZED_UNIT("40", "Multinational Specialized Unit", ModifierCategory.Capability),
    MULTIPLE_ROCKET_LAUNCHER("41", "Multiple Rocket Launcher", ModifierCategory.Capability),
    NATO_MEDICAL_ROLE_1("42", "NATO Medical Role 1", ModifierCategory.Capability),
    NATO_MEDICAL_ROLE_2("43", "NATO Medical Role 2", ModifierCategory.Capability),
    NATO_MEDICAL_ROLE_3("44", "NATO Medical Role 3", ModifierCategory.Capability),
    NATO_MEDICAL_ROLE_4("45", "NATO Medical Role 4", ModifierCategory.Capability),
    NAVAL("46", "Naval", ModifierCategory.Capability),
    UNMANNED_AIRCRAFT_SYSTEMS("47", "Unmanned Aircraft Systems (UAS)", ModifierCategory.Capability),
    OPERATIONS("49", "Operations", ModifierCategory.Capability),
    RADAR("50", "Radar", ModifierCategory.Capability),
    RFID_INTERROGATOR_SENSOR("51", "Radio Frequency Identification (RFID) Interrogator / Sensor", ModifierCategory.Capability),
    SENSOR("55", "Sensor", ModifierCategory.Capability),
    WEAPON("56", "Weapon/Weapons", ModifierCategory.Capability),
    SIGNALS_INTELLIGENCE("57", "Signals Intelligence", ModifierCategory.Capability),
    SINGLE_ROCKET_LAUNCHER("59", "Single Rocket Launcher", ModifierCategory.Capability),
    SMOKE("60", "Smoke", ModifierCategory.Capability),
    SOUND_RANGING("62", "Sound Ranging", ModifierCategory.Capability),
    SURVEY("65", "Survey", ModifierCategory.Capability),
    TACTICAL_EXPLOITATION("66", "Tactical Exploitation", ModifierCategory.Capability),
    TARGET_ACQUISITION("67", "Target Acquisition", ModifierCategory.Capability),
    TOPOGRAPHIC_GEOSPATIAL("68", "Topographic/Geospatial", ModifierCategory.Capability),
    VIDEO_IMAGERY("70", "Video Imagery (Combat Camera)", ModifierCategory.Capability),
    MOBILITY_ASSAULT("71", "Mobility Assault", ModifierCategory.Capability),
    AMPHIBIOUS_WARFARE_SHIP("72", "Amphibious Warfare Ship", ModifierCategory.Capability),
    LOAD_HANDLING_SYSTEM("73", "Load Handling System (LHS)", ModifierCategory.Capability),
    PALLETISED_LOAD_SYSTEM("74", "Palletised Load System (PLS)", ModifierCategory.Capability),
    SUPPORT("77", "Support", ModifierCategory.Capability),
    ROUTE_RECON_CLEARANCE("79", "Route, Reconnaissance and Clearing (RRC)", ModifierCategory.Capability),
    NATO_MEDICAL_ROLE_2_BASIC("81", "NATO Medical Role 2 (Basic)", ModifierCategory.Capability),
    NATO_MEDICAL_ROLE_2_ENHANCED("82", "NATO Medical Role 2 (Enhanced)", ModifierCategory.Capability),
    NATO_MEDICAL_ROLE_2_FORWARD("83", "NATO Medical Role 2 (Forward)", ModifierCategory.Capability),
    ASSAULT("84", "Assault", ModifierCategory.Capability),
    CRIMINAL_INVESTIGATION_DIVISION("86", "Criminal Investigation Division", ModifierCategory.Capability),
    DIGITAL("87", "Digital", ModifierCategory.Capability),
    NETWORK_OPERATIONS("88", "Network or Network Operations", ModifierCategory.Capability),
    AIR_TERMINAL("89", "Air Terminal", ModifierCategory.Capability),
    PIPELINE("90", "Pipeline", ModifierCategory.Capability),
    POSTAL("91", "Postal", ModifierCategory.Capability),
    INDEPENDENT_COMMAND("93", "Independent Command", ModifierCategory.Capability),
    THEATRE("94", "Theatre", ModifierCategory.Capability),
    ARMY_THEATRE_ARMY("95", "Army or Theatre Army", ModifierCategory.Capability),
    CORPS("96", "Corps", ModifierCategory.Capability),
    HEADQUARTERS("98", "Headquarters or Headquarters Element", ModifierCategory.Capability);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandUnitsSectorOneModifier(String id, String label, ModifierCategory category) {
        this.id = id;
        this.label = label;
        this.category = category;
    }

    @Override
    public ModifierCategory getCategory() {
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
        return SymbolSetEnum.LAND_UNIT;
    }

}