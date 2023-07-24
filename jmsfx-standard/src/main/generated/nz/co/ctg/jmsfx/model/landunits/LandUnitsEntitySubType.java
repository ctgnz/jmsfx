package nz.co.ctg.jmsfx.model.landunits;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum LandUnitsEntitySubType implements EntitySubType {
    BROADCAST_TRANSMITTER_ANTENNAE_MISO("01", "Broadcast Transmitter Antennae", LandUnitsEntityType.MILITARY_INFORMATION_SUPPORT_OPERATIONS_MISO, IconType.FULL_OCTAGON),
    SIGNAL_RADIO("01", "Radio", LandUnitsEntityType.SIGNAL, IconType.FULL_FRAME),
    SIGNAL_RADIO_RELAY("02", "Radio Relay", LandUnitsEntityType.SIGNAL, IconType.FULL_FRAME),
    SIGNAL_TELETYPE("03", "Teletype", LandUnitsEntityType.SIGNAL, IconType.FULL_FRAME),
    SIGNAL_TACTICAL_SATELLITE("04", "Tactical Satellite", LandUnitsEntityType.SIGNAL, IconType.FULL_FRAME),
    SIGNAL_VIDEO_IMAGERY_COMBAT_CAMERA("05", "Video Imagery (Combat Camera)", LandUnitsEntityType.SIGNAL, IconType.FULL_FRAME),
    ARMORED("01", "Armored", LandUnitsEntityType.ANTITANK_ANTIARMOR, IconType.FULL_FRAME),
    MOTORIZED("02", "Motorized", LandUnitsEntityType.ANTITANK_ANTIARMOR, IconType.FULL_FRAME),
    RECONNAISSANCE_CAVALRY_SCOUT("01", "Reconnaissance/Cavalry/Scout", LandUnitsEntityType.ARMOR_ARMORED_MECHANIZED_SELF_PROPELLED_TRACKED, IconType.FULL_FRAME),
    ARMORED_AMPHIBIOUS("02", "Amphibious", LandUnitsEntityType.ARMOR_ARMORED_MECHANIZED_SELF_PROPELLED_TRACKED, IconType.FULL_FRAME),
    AVIATION_RECONNAISSANCE("01", "Reconnaissance", LandUnitsEntityType.ARMY_AVIATION_AVIATION_ROTARY_WING, IconType.FULL_FRAME),
    AVIATION_FIXED_WING_RECONNAISSANCE("01", "Reconnaissance", LandUnitsEntityType.AVIATION_FIXED_WING, IconType.FULL_FRAME),
    INFANTRY_AMPHIBIOUS("01", "Amphibious", LandUnitsEntityType.INFANTRY, IconType.FULL_FRAME),
    INFANTRY_ARMORED_MECHANIZED_TRACKED("02", "Armored/Mechanized/Tracked", LandUnitsEntityType.INFANTRY, IconType.FULL_FRAME),
    INFANTRY_MAIN_GUN_SYSTEM("03", "Main Gun System", LandUnitsEntityType.INFANTRY, IconType.FULL_FRAME),
    INFANTRY_MOTORIZED("04", "Motorized", LandUnitsEntityType.INFANTRY, IconType.FULL_FRAME),
    INFANTRY_FIGHTING_VEHICLE("05", "Infantry Fighting Vehicle", LandUnitsEntityType.INFANTRY, IconType.FULL_FRAME),
    RECONNAISSANCE_AND_SURVEILLANCE("01", "Reconnaissance and Surveillance", LandUnitsEntityType.RECON_CAVALRY_SCOUT, IconType.FULL_FRAME),
    RECON_MARINE("02", "Marine", LandUnitsEntityType.RECON_CAVALRY_SCOUT, IconType.FULL_FRAME),
    RECON_MOTORIZED("03", "Motorized", LandUnitsEntityType.RECON_CAVALRY_SCOUT, IconType.FULL_FRAME),
    FIXED_WING_MISO("01", "Fixed Wing MISO", LandUnitsEntityType.SPECIAL_OPERATIONS_FORCES_SOF, IconType.FULL_OCTAGON),
    GROUND("02", "Ground", LandUnitsEntityType.SPECIAL_OPERATIONS_FORCES_SOF, IconType.FULL_FRAME),
    SPECIAL_BOAT("03", "Special Boat", LandUnitsEntityType.SPECIAL_OPERATIONS_FORCES_SOF, IconType.MAIN_1),
    SPECIAL_SSNR("04", "Special SSNR", LandUnitsEntityType.SPECIAL_OPERATIONS_FORCES_SOF, IconType.MAIN_1),
    UNDERWATER_DEMOLITION_TEAM("05", "Underwater Demolition Team", LandUnitsEntityType.SPECIAL_OPERATIONS_FORCES_SOF, IconType.MAIN),
    AD_MAIN_GUN_SYSTEM("01", "Main Gun System", LandUnitsEntityType.AIR_DEFENSE, IconType.FULL_FRAME),
    AD_MISSILE("02", "Missile", LandUnitsEntityType.AIR_DEFENSE, IconType.FULL_FRAME),
    FA_SELF_PROPELLED("01", "Self-propelled", LandUnitsEntityType.FIELD_ARTILLERY, IconType.MAIN),
    FA_TARGET_ACQUISITION("02", "Target Acquisition", LandUnitsEntityType.FIELD_ARTILLERY, IconType.FULL_FRAME),
    ARMORED_MECHANIZED_TRACKED("01", "Armored/Mechanized/Tracked", LandUnitsEntityType.MORTAR, IconType.FULL_OCTAGON),
    SELF_PROPELLED_WHEELED("02", "Self-Propelled Wheeled", LandUnitsEntityType.MORTAR, IconType.FULL_OCTAGON),
    TOWED("03", "Towed", LandUnitsEntityType.MORTAR, IconType.FULL_OCTAGON),
    CBRN_MECHANIZED("01", "Mechanized", LandUnitsEntityType.CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR_DEFENSE, IconType.MAIN),
    CBRN_MOTORIZED("02", "Motorized", LandUnitsEntityType.CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR_DEFENSE, IconType.FULL_FRAME),
    CBRN_RECONNAISSANCE("03", "Reconnaissance", LandUnitsEntityType.CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR_DEFENSE, IconType.FULL_FRAME),
    CBRN_RECONNAISSANCE_ARMORED("04", "Reconnaissance Armored", LandUnitsEntityType.CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR_DEFENSE, IconType.FULL_FRAME),
    CBRN_RECONNAISSANCE_EQUIPPED("05", "Reconnaissance Equipped", LandUnitsEntityType.CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR_DEFENSE, IconType.FULL_FRAME),
    ENG_MECHANIZED("01", "Mechanized", LandUnitsEntityType.ENGINEER, IconType.MAIN),
    ENG_MOTORIZED("02", "Motorized", LandUnitsEntityType.ENGINEER, IconType.FULL_FRAME),
    ENG_RECONNAISSANCE("03", "Reconnaissance", LandUnitsEntityType.ENGINEER, IconType.FULL_FRAME),
    SEC_MECHANIZED("01", "Mechanized", LandUnitsEntityType.SECURITY, IconType.MAIN),
    SEC_MOTORIZED("02", "Motorized", LandUnitsEntityType.SECURITY, IconType.FULL_FRAME),
    EW_ANALYSIS("01", "Analysis", LandUnitsEntityType.ELECTRONIC_WARFARE, IconType.FULL_OCTAGON),
    EW_DIRECTION_FINDING("02", "Direction Finding", LandUnitsEntityType.ELECTRONIC_WARFARE, IconType.FULL_OCTAGON),
    EW_INTERCEPT("03", "Intercept", LandUnitsEntityType.ELECTRONIC_WARFARE, IconType.FULL_OCTAGON),
    EW_JAMMING("04", "Jamming", LandUnitsEntityType.ELECTRONIC_WARFARE, IconType.FULL_FRAME),
    EW_SEARCH("05", "Search", LandUnitsEntityType.ELECTRONIC_WARFARE, IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final LandUnitsEntityType entityType;
    private final IconType iconType;
    
    private LandUnitsEntitySubType(String id, String label, LandUnitsEntityType entityType, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
        this.iconType = iconType;
    }
    

    @Override
    public IconType getIconType() {
        return iconType;
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
    public EntityType getEntityType() {
        return entityType;
    }
    
}