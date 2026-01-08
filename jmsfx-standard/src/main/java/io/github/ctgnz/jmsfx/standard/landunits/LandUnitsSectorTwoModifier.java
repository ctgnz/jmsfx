package io.github.ctgnz.jmsfx.standard.landunits;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandUnitsSectorTwoModifier implements SectorTwoModifier {
    ARCTIC("02", "Arctic", ModifierCategory.Mobility, SymbolSetEnum.LAND_UNIT),
    BATTLE_DAMAGE_REPAIR("03", "Battle Damage Repair", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    CASUALTY_STAGING("05", "Casualty Staging", ModifierCategory.CloseRangeSupport, SymbolSetEnum.LAND_UNIT),
    CLEARING("06", "Clearing", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    CONTROL("08", "Control", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    DECONTAMINATION("09", "Decontamination", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    DEMOLITION("10", "Demolition", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    DENTAL("11", "Dental", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    DIGITAL("12", "Digital", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    ENHANCED_POSITION_LOCATION_REPORTING_SYSTEM_EPLRS("13", "Enhanced Position Location Reporting System (EPLRS)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    EQUIPMENT("14", "Equipment", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    HIGH_ALTITUDE("16", "High Altitude", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    INTERMODAL("17", "Intermodal", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    INTENSIVE_CARE("18", "Intensive Care", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    LABORATORY("20", "Laboratory", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    LAUNCHER("21", "Launcher", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    LOW_ALTITUDE("23", "Low Altitude", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    MEDIUM_ALTITUDE("25", "Medium Altitude", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    HIGH_MEDIUM_ALTITUDE("28", "High to Medium Altitude", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    MULTI_CHANNEL("29", "Multi-Channel", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    OPTICAL_FLASH("30", "Optical (Flash)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    PACK_ANIMAL("31", "Pack Animal", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    PATIENT_EVACUATION_COORDINATION("32", "Patient Evacuation Coordination", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    PREVENTIVE_MAINTENANCE("33", "Preventive Maintenance", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    PSYCHOLOGICAL("34", "Psychological", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    RADIO_RELAY_LOS("35", "Radio Relay Line of Sight", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    RECOVERY_UNMANNED_SYSTEMS("37", "Recovery (Unmanned Systems)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    RECOVERY_MAINTENANCE("38", "Recovery (Maintenance)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    RESCUE_COORDINATION_CENTER("39", "Rescue Coordination Center", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    RIVERINE("40", "Riverine", ModifierCategory.Mobility, SymbolSetEnum.LAND_UNIT),
    SINGLE_CHANNEL("41", "Single Channel", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    STRATEGIC("44", "Strategic", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SUPPORT("45", "Support", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    TACTICAL("46", "Tactical", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    TOWED("47", "Towed", ModifierCategory.Mobility, SymbolSetEnum.LAND_UNIT),
    TROOP("48", "Troop", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    VERTICAL_TAKE_OFF_LANDING_VTOL("49", "Vertical or Short Take-Off and Landing (VTOL/VSTOL)", ModifierCategory.Mobility, SymbolSetEnum.LAND_UNIT),
    VETERINARY("50", "Veterinary", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    HIGH_LOW_ALTITUDE("52", "High to Low Altitude", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    MEDIUM_LOW_ALTITUDE("53", "Medium to Low Altitude", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    ATTACK("54", "Attack", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    REFUEL("55", "Refuel", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    UTILITY("56", "Utility", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    COMBAT_SEARCH_RESCUE("57", "Combat Search and Rescue", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    GUERILLA("58", "Guerilla", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    AIR_ASSAULT("59", "Air Assault", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    AMPHIBIOUS("60", "Amphibious", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    VERY_HEAVY("61", "Very Heavy", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SUPPLY("62", "Supply", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    NAVY_BARGE_SELF_PROPELLED("64", "Navy Barge Self-Propelled", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    NAVY_BARGE_NOT_SELF_PROPELLED("65", "Navy Barge Not Self-Propelled", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    LAUNCH("66", "Launch", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    LANDING_CRAFT("67", "Landing Craft", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    LANDING_SHIP("68", "Landing Ship", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SERVICE_CRAFT_YARD("69", "Service Craft/Yard", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    TUG_HARBOUR("70", "Tug, Harbour", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    TUG_BOAT_OCEAN_GOING("71", "Tug Boat, Ocean-going", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SURFACE_DEPLOYMENT_DISTRIBUTION_COMMAND("72", "Surface Deployment and Distribution Command (SDDC)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    NON_COMBATANT_VESSEL("73", "Non-Combatant Vessel, Generic", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    COMPOSITE("74", "Composite", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SHELTER("75", "Shelter", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    SURGICAL("81", "Surgical", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    BLOOD_SUPPORT("82", "Blood Support", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    COMBAT_OPERATIONAL_STRESS_CONTROL("83", "Combat and Operational Stress Control (COSC)", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    JAMMING("84", "Jamming", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    OPTOMETRY("86", "Optometry", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT),
    PREVENTATIVE_MEDICINE("87", "Preventative Medicine", ModifierCategory.Capability, SymbolSetEnum.LAND_UNIT);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    LandUnitsSectorTwoModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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