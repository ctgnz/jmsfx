package io.github.ctgnz.jmsfx.standard.landunits;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandUnitsSectorOneModifier implements SectorOneModifier {
    TACTICAL_SATELLITE("01", "Tactical Satellite", ModifierCategory.Mobility, SymbolSetEnum.LAND_UNIT),
    AREA("02", "Area", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    BORDER("05", "Border", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    COMMUNICATIONS_CONTINGENCY_PACKAGE("11", "Communications Contingency Package", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    CONSTRUCTION("12", "Construction", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    CROSS_CULTURAL_COMMUNICATION("13", "Cross Cultural Communication", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    DETENTION("16", "Detention", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    DIRECT_COMMUNICATIONS("17", "Direct Communications", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    DIVING("18", "Diving", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    DIVISION("19", "Division (Echelon of Support)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    DOG("20", "Dog", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    DRILLING("21", "Drilling", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    ELECTRO_OPTICAL("22", "Electro-Optical", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    ENHANCED("23", "Enhanced", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    FIRE_DIRECTION_CENTER("25", "Fire Direction Center", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    FORCE("26", "Force", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    FORWARD("27", "Forward", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    GROUND_STATION_MODULE("28", "Ground Station Module", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    LANDING_SUPPORT("29", "Landing Support", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    COMPANY("30", "Company (Echelon of Support)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    METEOROLOGICAL("32", "Meteorological", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    MISSILE("34", "Missile", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    MOBILE_ADVISOR_SUPPORT("35", "Mobile Advisor and Support", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    MOBILE_SUBSCRIBER_EQUIPMENT("36", "Mobile Subscriber Equipment", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    MOBILITY_SUPPORT("37", "Mobility Support", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    BATTALION("38", "Battalion (Echelon of Support)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    MULTINATIONAL("39", "Multinational", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    MULTINATIONAL_SPECIALIZED_UNIT("40", "Multinational Specialized Unit", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    MULTIPLE_ROCKET_LAUNCHER("41", "Multiple Rocket Launcher", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_1("42", "NATO Medical Role 1", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_2("43", "NATO Medical Role 2", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_3("44", "NATO Medical Role 3", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_4("45", "NATO Medical Role 4", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    NAVAL("46", "Naval", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    UNMANNED_AIRCRAFT_SYSTEMS("47", "Unmanned Aircraft Systems (UAS)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    OPERATIONS("49", "Operations", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    RADAR("50", "Radar", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    RFID_INTERROGATOR_SENSOR("51", "Radio Frequency Identification (RFID) Interrogator / Sensor", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SENSOR("55", "Sensor", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    WEAPON("56", "Weapon/Weapons", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SIGNALS_INTELLIGENCE("57", "Signals Intelligence", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SINGLE_ROCKET_LAUNCHER("59", "Single Rocket Launcher", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SMOKE("60", "Smoke", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SOUND_RANGING("62", "Sound Ranging", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SURVEY("65", "Survey", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    TACTICAL_EXPLOITATION("66", "Tactical Exploitation", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    TARGET_ACQUISITION("67", "Target Acquisition", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    TOPOGRAPHIC_GEOSPATIAL("68", "Topographic/Geospatial", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    VIDEO_IMAGERY("70", "Video Imagery (Combat Camera)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    MOBILITY_ASSAULT("71", "Mobility Assault", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    AMPHIBIOUS_WARFARE_SHIP("72", "Amphibious Warfare Ship", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    LOAD_HANDLING_SYSTEM("73", "Load Handling System (LHS)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    PALLETISED_LOAD_SYSTEM("74", "Palletised Load System (PLS)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SUPPORT("77", "Support", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    ROUTE_RECON_CLEARANCE("79", "Route, Reconnaissance and Clearing (RRC)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_2_BASIC("81", "NATO Medical Role 2 (Basic)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_2_ENHANCED("82", "NATO Medical Role 2 (Enhanced)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    NATO_MEDICAL_ROLE_2_FORWARD("83", "NATO Medical Role 2 (Forward)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    ASSAULT("84", "Assault", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    CRIMINAL_INVESTIGATION_DIVISION("86", "Criminal Investigation Division", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    DIGITAL("87", "Digital", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    NETWORK_OPERATIONS("88", "Network or Network Operations", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    AIR_TERMINAL("89", "Air Terminal", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    PIPELINE("90", "Pipeline", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    POSTAL("91", "Postal", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    INDEPENDENT_COMMAND("93", "Independent Command", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    THEATRE("94", "Theatre", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    ARMY_THEATRE_ARMY("95", "Army or Theatre Army", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    CORPS("96", "Corps", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    HEADQUARTERS("98", "Headquarters or Headquarters Element", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    LandUnitsSectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
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
        return symbolSet;
    }

}