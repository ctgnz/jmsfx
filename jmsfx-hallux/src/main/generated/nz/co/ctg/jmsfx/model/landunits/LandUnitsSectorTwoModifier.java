package nz.co.ctg.jmsfx.model.landunits;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum LandUnitsSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", SymbolSet.SS_LAND_UNIT),
    AIRBORNE_MOD("01", "Airborne", SymbolSet.SS_LAND_UNIT),
    ARCTIC_MOD("02", "Arctic", SymbolSet.SS_LAND_UNIT),
    BATTLE_DAMAGE_REPAIR_MOD("03", "Battle Damage Repair", SymbolSet.SS_LAND_UNIT),
    BICYCLE_EQUIPPED_MOD("04", "Bicycle Equipped", SymbolSet.SS_LAND_UNIT),
    CASUALTY_STAGING_MOD("05", "Casualty Staging", SymbolSet.SS_LAND_UNIT),
    CLEARING_MOD("06", "Clearing", SymbolSet.SS_LAND_UNIT),
    CLOSE_RANGE_MOD("07", "Close Range", SymbolSet.SS_LAND_UNIT),
    CONTROL_MOD("08", "Control", SymbolSet.SS_LAND_UNIT),
    DECONTAMINATION_2_MOD("09", "Decontamination", SymbolSet.SS_LAND_UNIT),
    DEMOLITION_MOD("10", "Demolition", SymbolSet.SS_LAND_UNIT),
    DENTAL_MOD("11", "Dental", SymbolSet.SS_LAND_UNIT),
    DIGITAL_MOD("12", "Digital", SymbolSet.SS_LAND_UNIT),
    ENHANCED_POSITION_LOCATION_REPORTING_SYSTEM_EPLRS_MOD("13", "Enhanced Position Location Reporting System (EPLRS)", SymbolSet.SS_LAND_UNIT),
    EQUIPMENT_MOD("14", "Equipment", SymbolSet.SS_LAND_UNIT),
    HEAVY_MOD("15", "Heavy", SymbolSet.SS_LAND_UNIT),
    HIGH_ALTITUDE_MOD("16", "High Altitude", SymbolSet.SS_LAND_UNIT),
    INTERMODAL_MOD("17", "Intermodal", SymbolSet.SS_LAND_UNIT),
    INTENSIVE_CARE_MOD("18", "Intensive Care", SymbolSet.SS_LAND_UNIT),
    LIGHT_MOD("19", "Light", SymbolSet.SS_LAND_UNIT),
    LABORATORY_MOD("20", "Laboratory", SymbolSet.SS_LAND_UNIT),
    LAUNCHER_MOD("21", "Launcher", SymbolSet.SS_LAND_UNIT),
    LONG_RANGE_MOD("22", "Long Range", SymbolSet.SS_LAND_UNIT),
    LOW_ALTITUDE_MOD("23", "Low Altitude", SymbolSet.SS_LAND_UNIT),
    MEDIUM_MOD("24", "Medium", SymbolSet.SS_LAND_UNIT),
    MEDIUM_ALTITUDE_MOD("25", "Medium Altitude", SymbolSet.SS_LAND_UNIT),
    MEDIUM_RANGE_MOD("26", "Medium Range", SymbolSet.SS_LAND_UNIT),
    MOUNTAIN_MOD("27", "Mountain", SymbolSet.SS_LAND_UNIT),
    HIGH_MEDIUM_ALTITUDE_MOD("28", "High to Medium Altitude", SymbolSet.SS_LAND_UNIT),
    MULTI_CHANNEL_MOD("29", "Multi-Channel", SymbolSet.SS_LAND_UNIT),
    OPTICAL_FLASH_MOD("30", "Optical (Flash)", SymbolSet.SS_LAND_UNIT),
    PACK_ANIMAL_MOD("31", "Pack Animal", SymbolSet.SS_LAND_UNIT),
    PATIENT_EVACUATION_COORDINATION_MOD("32", "Patient Evacuation Coordination", SymbolSet.SS_LAND_UNIT),
    PREVENTIVE_MAINTENANCE_MOD("33", "Preventive Maintenance", SymbolSet.SS_LAND_UNIT),
    PSYCHOLOGICAL_MOD("34", "Psychological", SymbolSet.SS_LAND_UNIT),
    RADIO_RELAY_LOS_MOD("35", "Radio Relay Line of Sight", SymbolSet.SS_LAND_UNIT),
    RAILROAD_MOD("36", "Railroad", SymbolSet.SS_LAND_UNIT),
    RECOVERY_UNMANNED_SYSTEMS_MOD("37", "Recovery (Unmanned Systems)", SymbolSet.SS_LAND_UNIT),
    RECOVERY_MAINTENANCE_MOD("38", "Recovery (Maintenance)", SymbolSet.SS_LAND_UNIT),
    RESCUE_COORDINATION_CENTER_MOD("39", "Rescue Coordination Center", SymbolSet.SS_LAND_UNIT),
    RIVERINE_MOD("40", "Riverine", SymbolSet.SS_LAND_UNIT),
    SINGLE_CHANNEL_MOD("41", "Single Channel", SymbolSet.SS_LAND_UNIT),
    SKI_MOD("42", "Ski", SymbolSet.SS_LAND_UNIT),
    SHORT_RANGE_MOD("43", "Short Range", SymbolSet.SS_LAND_UNIT),
    STRATEGIC_MOD("44", "Strategic", SymbolSet.SS_LAND_UNIT),
    SUPPORT_2_MOD("45", "Support", SymbolSet.SS_LAND_UNIT),
    TACTICAL_MOD("46", "Tactical", SymbolSet.SS_LAND_UNIT),
    TOWED_MOD("47", "Towed", SymbolSet.SS_LAND_UNIT),
    TROOP_MOD("48", "Troop", SymbolSet.SS_LAND_UNIT),
    VERTICAL_TAKE_OFF_LANDING_VTOL_MOD("49", "Vertical or Short Take-Off and Landing (VTOL/VSTOL)", SymbolSet.SS_LAND_UNIT),
    VETERINARY_MOD("50", "Veterinary", SymbolSet.SS_LAND_UNIT),
    WHEELED_MOD("51", "Wheeled", SymbolSet.SS_LAND_UNIT),
    HIGH_LOW_ALTITUDE_MOD("52", "High to Low Altitude", SymbolSet.SS_LAND_UNIT),
    MEDIUM_LOW_ALTITUDE_MOD("53", "Medium to Low Altitude", SymbolSet.SS_LAND_UNIT),
    ATTACK_2_MOD("54", "Attack", SymbolSet.SS_LAND_UNIT),
    REFUEL_MOD("55", "Refuel", SymbolSet.SS_LAND_UNIT),
    UTILITY_2_MOD("56", "Utility", SymbolSet.SS_LAND_UNIT),
    COMBAT_SEARCH_RESCUE_MOD("57", "Combat Search and Rescue", SymbolSet.SS_LAND_UNIT);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private LandUnitsSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
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