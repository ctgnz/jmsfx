package io.github.ctgnz.jmsfx.standard.landunits;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandUnitsSectorTwoModifier implements SectorTwoModifier {
    ARCTIC("02", "Arctic", ModifierCategory.Mobility),
    BATTLE_DAMAGE_REPAIR("03", "Battle Damage Repair", ModifierCategory.Capability),
    CASUALTY_STAGING("05", "Casualty Staging", ModifierCategory.CloseRangeSupport),
    CLEARING("06", "Clearing", ModifierCategory.Capability),
    CONTROL("08", "Control", ModifierCategory.Capability),
    DECONTAMINATION("09", "Decontamination", ModifierCategory.Capability),
    DEMOLITION("10", "Demolition", ModifierCategory.Capability),
    DENTAL("11", "Dental", ModifierCategory.Capability),
    DIGITAL("12", "Digital", ModifierCategory.Capability),
    ENHANCED_POSITION_LOCATION_REPORTING_SYSTEM_EPLRS("13", "Enhanced Position Location Reporting System (EPLRS)", ModifierCategory.Capability),
    EQUIPMENT("14", "Equipment", ModifierCategory.Capability),
    HIGH_ALTITUDE("16", "High Altitude", ModifierCategory.Capability),
    INTERMODAL("17", "Intermodal", ModifierCategory.Capability),
    INTENSIVE_CARE("18", "Intensive Care", ModifierCategory.Capability),
    LABORATORY("20", "Laboratory", ModifierCategory.Capability),
    LAUNCHER("21", "Launcher", ModifierCategory.Capability),
    LOW_ALTITUDE("23", "Low Altitude", ModifierCategory.Capability),
    MEDIUM_ALTITUDE("25", "Medium Altitude", ModifierCategory.Capability),
    HIGH_MEDIUM_ALTITUDE("28", "High to Medium Altitude", ModifierCategory.Capability),
    MULTI_CHANNEL("29", "Multi-Channel", ModifierCategory.Capability),
    OPTICAL_FLASH("30", "Optical (Flash)", ModifierCategory.Capability),
    PACK_ANIMAL("31", "Pack Animal", ModifierCategory.Capability),
    PATIENT_EVACUATION_COORDINATION("32", "Patient Evacuation Coordination", ModifierCategory.Capability),
    PREVENTIVE_MAINTENANCE("33", "Preventive Maintenance", ModifierCategory.Capability),
    PSYCHOLOGICAL("34", "Psychological", ModifierCategory.Capability),
    RADIO_RELAY_LOS("35", "Radio Relay Line of Sight", ModifierCategory.Capability),
    RECOVERY_UNMANNED_SYSTEMS("37", "Recovery (Unmanned Systems)", ModifierCategory.Capability),
    RECOVERY_MAINTENANCE("38", "Recovery (Maintenance)", ModifierCategory.Capability),
    RESCUE_COORDINATION_CENTER("39", "Rescue Coordination Center", ModifierCategory.Capability),
    RIVERINE("40", "Riverine", ModifierCategory.Mobility),
    SINGLE_CHANNEL("41", "Single Channel", ModifierCategory.Capability),
    STRATEGIC("44", "Strategic", ModifierCategory.Capability),
    SUPPORT("45", "Support", ModifierCategory.Capability),
    TACTICAL("46", "Tactical", ModifierCategory.Capability),
    TOWED("47", "Towed", ModifierCategory.Mobility),
    TROOP("48", "Troop", ModifierCategory.Capability),
    VERTICAL_TAKE_OFF_LANDING_VTOL("49", "Vertical or Short Take-Off and Landing (VTOL/VSTOL)", ModifierCategory.Mobility),
    VETERINARY("50", "Veterinary", ModifierCategory.Capability),
    HIGH_LOW_ALTITUDE("52", "High to Low Altitude", ModifierCategory.Capability),
    MEDIUM_LOW_ALTITUDE("53", "Medium to Low Altitude", ModifierCategory.Capability),
    ATTACK("54", "Attack", ModifierCategory.Capability),
    REFUEL("55", "Refuel", ModifierCategory.Capability),
    UTILITY("56", "Utility", ModifierCategory.Capability),
    COMBAT_SEARCH_RESCUE("57", "Combat Search and Rescue", ModifierCategory.Capability),
    GUERILLA("58", "Guerilla", ModifierCategory.Capability),
    AIR_ASSAULT("59", "Air Assault", ModifierCategory.Capability),
    AMPHIBIOUS("60", "Amphibious", ModifierCategory.Capability),
    VERY_HEAVY("61", "Very Heavy", ModifierCategory.Capability),
    SUPPLY("62", "Supply", ModifierCategory.Capability),
    NAVY_BARGE_SELF_PROPELLED("64", "Navy Barge Self-Propelled", ModifierCategory.Capability),
    NAVY_BARGE_NOT_SELF_PROPELLED("65", "Navy Barge Not Self-Propelled", ModifierCategory.Capability),
    LAUNCH("66", "Launch", ModifierCategory.Capability),
    LANDING_CRAFT("67", "Landing Craft", ModifierCategory.Capability),
    LANDING_SHIP("68", "Landing Ship", ModifierCategory.Capability),
    SERVICE_CRAFT_YARD("69", "Service Craft/Yard", ModifierCategory.Capability),
    TUG_HARBOUR("70", "Tug, Harbour", ModifierCategory.Capability),
    TUG_BOAT_OCEAN_GOING("71", "Tug Boat, Ocean-going", ModifierCategory.Capability),
    SURFACE_DEPLOYMENT_DISTRIBUTION_COMMAND("72", "Surface Deployment and Distribution Command (SDDC)", ModifierCategory.Capability),
    NON_COMBATANT_VESSEL("73", "Non-Combatant Vessel, Generic", ModifierCategory.Capability),
    COMPOSITE("74", "Composite", ModifierCategory.Capability),
    SHELTER("75", "Shelter", ModifierCategory.Capability),
    SURGICAL("81", "Surgical", ModifierCategory.Capability),
    BLOOD_SUPPORT("82", "Blood Support", ModifierCategory.Capability),
    COMBAT_OPERATIONAL_STRESS_CONTROL("83", "Combat and Operational Stress Control (COSC)", ModifierCategory.Capability),
    JAMMING("84", "Jamming", ModifierCategory.Capability),
    OPTOMETRY("86", "Optometry", ModifierCategory.Capability),
    PREVENTATIVE_MEDICINE("87", "Preventative Medicine", ModifierCategory.Capability);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandUnitsSectorTwoModifier(String id, String label, ModifierCategory category) {
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