package nz.co.ctg.jmsfx.model.signalsintelligenceair;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SignalsIntelligenceAirSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_SIGINT_AIR),
    AIRBORNE_SEARCH_AND_BOMBING_MOD("02", "Airborne Search and Bombing", SymbolSet.SS_SIGINT_AIR),
    AIRBORNE_INTERCEPT_MOD("03", "Airborne Intercept", SymbolSet.SS_SIGINT_AIR),
    ALTIMETER_MOD("04", "Altimeter", SymbolSet.SS_SIGINT_AIR),
    AIRBORNE_RECONNAISSANCE_AND_MAPPING_MOD("05", "Airborne Reconnaissance and Mapping", SymbolSet.SS_SIGINT_AIR),
    AIR_TRAFFIC_CONTROL_MOD("06", "Air Traffic Control", SymbolSet.SS_SIGINT_AIR),
    BEACON_TRANSPONDER_MOD("07", "Beacon Transponder (not IFF)", SymbolSet.SS_SIGINT_AIR),
    BATTLEFIELD_SURVEILLANCE_MOD("08", "Battlefield Surveillance", SymbolSet.SS_SIGINT_AIR),
    CONTROLLED_INTERCEPT_MOD("10", "Controlled Intercept", SymbolSet.SS_SIGINT_AIR),
    CELLULAR_MOBILE_MOD("11", "Cellular/Mobile", SymbolSet.SS_SIGINT_AIR),
    COASTAL_SURVEILLANCE_MOD("12", "Coastal Surveillance", SymbolSet.SS_SIGINT_AIR),
    DECOY_MIMIC_MOD("13", "Decoy/Mimic", SymbolSet.SS_SIGINT_AIR),
    DATA_TRANSMISSION_MOD("14", "Data Transmission", SymbolSet.SS_SIGINT_AIR),
    EARLY_WARNING_MOD("16", "Early Warning", SymbolSet.SS_SIGINT_AIR),
    FIRE_CONTROL_MOD("17", "Fire Control", SymbolSet.SS_SIGINT_AIR),
    GROUND_MAPPING_MOD("18", "Ground Mapping", SymbolSet.SS_SIGINT_AIR),
    IFF_INTERROGATOR_MOD("21", "Identification Friend or Foe (Interrogator)", SymbolSet.SS_SIGINT_AIR),
    IONOSPHERIC_SOUNDING_MOD("23", "Ionospheric Sounding", SymbolSet.SS_SIGINT_AIR),
    IFF_TRANSPONDER_MOD("24", "Identification Friend or Foe (Transponder)", SymbolSet.SS_SIGINT_AIR),
    BARRAGE_JAMMER_MOD("25", "Barrage Jammer", SymbolSet.SS_SIGINT_AIR),
    CLICK_JAMMER_MOD("26", "Click Jammer", SymbolSet.SS_SIGINT_AIR),
    DECEPTIVE_JAMMER_MOD("27", "Deceptive Jammer", SymbolSet.SS_SIGINT_AIR),
    FREQUENCY_SWEPT_JAMMER_MOD("28", "Frequency Swept Jammer", SymbolSet.SS_SIGINT_AIR),
    JAMMER_GENERAL_MOD("29", "Jammer (General)", SymbolSet.SS_SIGINT_AIR),
    NOISE_JAMMER_MOD("30", "Noise Jammer", SymbolSet.SS_SIGINT_AIR),
    PULSED_JAMMER_MOD("31", "Pulsed Jammer", SymbolSet.SS_SIGINT_AIR),
    REPEATER_JAMMER_MOD("32", "Repeater Jammer", SymbolSet.SS_SIGINT_AIR),
    SPOT_NOISE_JAMMER_MOD("33", "Spot Noise Jammer", SymbolSet.SS_SIGINT_AIR),
    TRANSPONDER_JAMMER_MOD("34", "Transponder Jammer", SymbolSet.SS_SIGINT_AIR),
    MISSILE_ACQUISITION_MOD("35", "Missile Acquisition", SymbolSet.SS_SIGINT_AIR),
    MISSILE_CONTROL_MOD("36", "Missile Control", SymbolSet.SS_SIGINT_AIR),
    MISSILE_DOWNLINK_MOD("37", "Missile Downlink", SymbolSet.SS_SIGINT_AIR),
    METEOROLOGICAL_MOD("38", "Meteorological", SymbolSet.SS_SIGINT_AIR),
    MULTI_FUNCTION_MOD("39", "Multi-Function", SymbolSet.SS_SIGINT_AIR),
    MISSILE_GUIDANCE_MOD("40", "Missile Guidance", SymbolSet.SS_SIGINT_AIR),
    MISSILE_HOMING_MOD("41", "Missile Homing", SymbolSet.SS_SIGINT_AIR),
    MISSILE_TRACKING_MOD("42", "Missile Tracking", SymbolSet.SS_SIGINT_AIR),
    NAVIGATIONAL_GENERAL_MOD("43", "Navigational/General", SymbolSet.SS_SIGINT_AIR),
    NAVIGATIONAL_DISTANCE_MEASURING_EQUIPMENT_MOD("44", "Navigational/Distance Measuring Equipment", SymbolSet.SS_SIGINT_AIR),
    NAVIGATION_TERRAIN_FOLLOWING_MOD("45", "Navigation/Terrain Following", SymbolSet.SS_SIGINT_AIR),
    NAVIGATIONAL_WEATHER_AVOIDANCE_MOD("46", "Navigational/Weather Avoidance", SymbolSet.SS_SIGINT_AIR),
    OMNI_LOS_MOD("47", "Omni-Line of Sight (LOS)", SymbolSet.SS_SIGINT_AIR),
    PROXIMITY_FUSE_MOD("48", "Proximity Use", SymbolSet.SS_SIGINT_AIR),
    POINT_POINT_LOS_MOD("49", "Point-to-Point Line of Sight (LOS)", SymbolSet.SS_SIGINT_AIR),
    INSTRUMENTATION_MOD("50", "Instrumentation", SymbolSet.SS_SIGINT_AIR),
    RANGE_ONLY_MOD("51", "Range Only", SymbolSet.SS_SIGINT_AIR),
    SPACE_MOD("54", "Space", SymbolSet.SS_SIGINT_AIR),
    SURFACE_SEARCH_MOD("55", "Surface Search", SymbolSet.SS_SIGINT_AIR),
    SATELLITE_UPLINK_MOD("57", "Satellite Uplink", SymbolSet.SS_SIGINT_AIR),
    TARGET_ACQUISITION_MOD("58", "Target Acquisition", SymbolSet.SS_SIGINT_AIR),
    TARGET_ILLUMINATION_MOD("59", "Target Illumination", SymbolSet.SS_SIGINT_AIR),
    TARGET_TRACKING_MOD("61", "Target Tracking", SymbolSet.SS_SIGINT_AIR),
    UNKNOWN_MOD("62", "Unknown", SymbolSet.SS_SIGINT_AIR),
    VIDEO_REMOTING_MOD("63", "Video Remoting", SymbolSet.SS_SIGINT_AIR),
    EXPERIMENTAL_MOD("64", "Experimental", SymbolSet.SS_SIGINT_AIR);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SignalsIntelligenceAirSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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