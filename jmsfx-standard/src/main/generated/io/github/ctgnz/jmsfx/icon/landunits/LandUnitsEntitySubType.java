package io.github.ctgnz.jmsfx.icon.landunits;

import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum LandUnitsEntitySubType implements IEntitySubType {
    RECONNAISSANCE_LIAISON_ELEMENT("01", "Reconnaissance and Liaison Element", LandUnitsEntityType.LIAISON, GraphicType.FULL_FRAME),
    BROADCAST_TRANSMITTER_ANTENNAE_PSYOPS("01", "Broadcast Transmitter Antennae (PSYOPS)", LandUnitsEntityType.PSYCHOLOGICAL_OPERATIONS_MISO, GraphicType.FULL_OCTAGON),
    SIGNAL_RADIO("01", "Radio", LandUnitsEntityType.SIGNAL, GraphicType.FULL_FRAME),
    SIGNAL_RADIO_RELAY("02", "Radio Relay", LandUnitsEntityType.SIGNAL, GraphicType.FULL_FRAME),
    SIGNAL_TELETYPE("03", "Teletype", LandUnitsEntityType.SIGNAL, GraphicType.FULL_FRAME),
    SIGNAL_VIDEO_IMAGERY_COMBAT_CAMERA("05", "Video Imagery (Combat Camera)", LandUnitsEntityType.SIGNAL, GraphicType.FULL_FRAME),
    ARMOURED("01", "Armoured", LandUnitsEntityType.ANTIARMOUR, GraphicType.FULL_FRAME),
    MOTORIZED("02", "Motorized", LandUnitsEntityType.ANTIARMOUR, GraphicType.FULL_FRAME),
    RECONNAISSANCE_CAVALRY("01", "Reconnaissance/Cavalry", LandUnitsEntityType.ARMOUR, GraphicType.FULL_FRAME),
    ARMOURED_AMPHIBIOUS("02", "Amphibious", LandUnitsEntityType.ARMOUR, GraphicType.FULL_FRAME),
    AVIATION_RECONNAISSANCE("01", "Reconnaissance", LandUnitsEntityType.ARMY_AVIATION_AVIATION_ROTARY_WING, GraphicType.FULL_FRAME),
    AVIATION_FIXED_WING_RECONNAISSANCE("01", "Reconnaissance", LandUnitsEntityType.AVIATION_FIXED_WING, GraphicType.FULL_FRAME),
    INFANTRY_AMPHIBIOUS("01", "Amphibious", LandUnitsEntityType.INFANTRY, GraphicType.FULL_FRAME),
    INFANTRY_ARMOURED_TRACKED("02", "Armoured/Tracked", LandUnitsEntityType.INFANTRY, GraphicType.FULL_FRAME),
    INFANTRY_MAIN_GUN_SYSTEM("03", "Main Gun System, Infantry/Heavy Weapon", LandUnitsEntityType.INFANTRY, GraphicType.FULL_FRAME),
    INFANTRY_MOTORIZED("04", "Motorized", LandUnitsEntityType.INFANTRY, GraphicType.FULL_FRAME),
    MECHANISED_INFANTRY_MAIN_GUN_HEAVY_WEAPON("05", "Mechanised Infantry with Main Gun System/Heavy Weapon", LandUnitsEntityType.INFANTRY, GraphicType.FULL_FRAME),
    MAIN_GUN_SYSTEM("06", "Main Gun System/Heavy Weapon", LandUnitsEntityType.INFANTRY, GraphicType.FULL_FRAME),
    RECONNAISSANCE_AND_SURVEILLANCE("01", "Reconnaissance and Surveillance", LandUnitsEntityType.RECON_CAVALRY, GraphicType.FULL_FRAME),
    RECON_MARINE("02", "Marine", LandUnitsEntityType.RECON_CAVALRY, GraphicType.FULL_FRAME),
    RECON_MOTORIZED("03", "Motorized", LandUnitsEntityType.RECON_CAVALRY, GraphicType.FULL_FRAME),
    FIXED_WING_PSYOPS("01", "Fixed Wing PSYOPS", LandUnitsEntityType.SPECIAL_OPERATIONS_FORCES_SOF, GraphicType.FULL_OCTAGON),
    GROUND("02", "Ground", LandUnitsEntityType.SPECIAL_OPERATIONS_FORCES_SOF, GraphicType.FULL_FRAME),
    UNDERWATER_DEMOLITION_TEAM("05", "Underwater Demolitions Team", LandUnitsEntityType.SPECIAL_OPERATIONS_FORCES_SOF, GraphicType.MAIN),
    AD_MAIN_GUN_SYSTEM("01", "Main Gun System", LandUnitsEntityType.AIR_DEFENSE, GraphicType.FULL_FRAME),
    AD_MISSILE("02", "Missile", LandUnitsEntityType.AIR_DEFENSE, GraphicType.FULL_FRAME),
    AIR_MISSILE_DEFENCE("03", "Air and Missile Defence", LandUnitsEntityType.AIR_DEFENSE, GraphicType.FULL_FRAME),
    FA_SELF_PROPELLED("01", "Self-propelled", LandUnitsEntityType.FIELD_ARTILLERY, GraphicType.MAIN),
    FA_RECONNAISSANCE("03", "Reconnaissance", LandUnitsEntityType.FIELD_ARTILLERY, GraphicType.FULL_FRAME),
    SELF_PROPELLED_WHEELED("02", "Self-Propelled Wheeled", LandUnitsEntityType.MORTAR, GraphicType.FULL_OCTAGON),
    CBRN_MOTORIZED("02", "Motorized", LandUnitsEntityType.CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR, GraphicType.FULL_FRAME),
    CBRN_RECONNAISSANCE("03", "Reconnaissance", LandUnitsEntityType.CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR, GraphicType.FULL_FRAME),
    CBRN_RECONNAISSANCE_ARMOURED("04", "Reconnaissance Armoured", LandUnitsEntityType.CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR, GraphicType.FULL_FRAME),
    CBRN_RECONNAISSANCE_MOTORIZED("05", "Reconnaissance Motorized", LandUnitsEntityType.CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR, GraphicType.FULL_FRAME),
    CBRN_HIGH_YIELD_EXPLOSIVES("06", "CBRN and High-Yield Explosives", LandUnitsEntityType.CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR, GraphicType.MAIN),
    ENG_MECHANIZED("01", "Mechanized", LandUnitsEntityType.ENGINEER, GraphicType.MAIN),
    ENG_MOTORIZED("02", "Motorized", LandUnitsEntityType.ENGINEER, GraphicType.FULL_FRAME),
    ENG_RECONNAISSANCE("03", "Reconnaissance", LandUnitsEntityType.ENGINEER, GraphicType.FULL_FRAME),
    SEC_MOTORIZED("02", "Motorized", LandUnitsEntityType.SECURITY, GraphicType.FULL_FRAME),
    ISOLATED_PERSONNEL("01", "Isolated Personnel", LandUnitsEntityType.SEARCH_AND_RESCUE, GraphicType.FULL_OCTAGON),
    EW_ANALYSIS("01", "Analysis", LandUnitsEntityType.ELECTROMAGNETIC_WARFARE, GraphicType.FULL_OCTAGON),
    EW_DIRECTION_FINDING("02", "Direction Finding", LandUnitsEntityType.ELECTROMAGNETIC_WARFARE, GraphicType.FULL_OCTAGON),
    EW_INTERCEPT("03", "Intercept", LandUnitsEntityType.ELECTROMAGNETIC_WARFARE, GraphicType.FULL_OCTAGON),
    EW_JAMMING("04", "Jamming", LandUnitsEntityType.ELECTROMAGNETIC_WARFARE, GraphicType.FULL_FRAME),
    EW_SEARCH("05", "Search", LandUnitsEntityType.ELECTROMAGNETIC_WARFARE, GraphicType.FULL_OCTAGON),
    ARMY_MUSIC("01", "Army Music", LandUnitsEntityType.BAND, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final LandUnitsEntityType entityType;
    private final GraphicType graphicType;

    LandUnitsEntitySubType(String id, String label, LandUnitsEntityType entityType, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
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
    public IEntityType getEntityType() {
        return entityType;
    }

}