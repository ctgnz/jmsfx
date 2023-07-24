package nz.co.ctg.jmsfx.model.signalsintelligenceland;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SignalsIntelligenceLandSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_SIGINT_LAND),
    ANTI_AIRCRAFT_FIRE_CONTROL_MOD("01", "Anti-Aircraft Fire Control", SymbolSet.SS_SIGINT_LAND),
    AIR_TRAFFIC_CONTROL_MOD("06", "Air Traffic Control", SymbolSet.SS_SIGINT_LAND),
    BEACON_TRANSPONDER_MOD("07", "Beacon Transponder (not IFF)", SymbolSet.SS_SIGINT_LAND),
    BATTLEFIELD_SURVEILLANCE_MOD("08", "Battlefield Surveillance", SymbolSet.SS_SIGINT_LAND),
    CONTROLLED_APPROACH_MOD("09", "Controlled Approach", SymbolSet.SS_SIGINT_LAND),
    CONTROLLED_INTERCEPT_MOD("10", "Controlled Intercept", SymbolSet.SS_SIGINT_LAND),
    CELLULAR_MOBILE_MOD("11", "Cellular/Mobile", SymbolSet.SS_SIGINT_LAND),
    DECOY_MIMIC_MOD("13", "Decoy/Mimic", SymbolSet.SS_SIGINT_LAND),
    DATA_TRANSMISSION_MOD("14", "Data Transmission", SymbolSet.SS_SIGINT_LAND),
    EARLY_WARNING_MOD("16", "Early Warning", SymbolSet.SS_SIGINT_LAND),
    FIRE_CONTROL_MOD("17", "Fire Control", SymbolSet.SS_SIGINT_LAND),
    HEIGHT_FINDING_MOD("19", "Height Finding", SymbolSet.SS_SIGINT_LAND),
    HARBOR_SURVEILLANCE_MOD("20", "Harbor Surveillance", SymbolSet.SS_SIGINT_LAND),
    IFF_INTERROGATOR_MOD("21", "Identification Friend or Foe (Interrogator)", SymbolSet.SS_SIGINT_LAND),
    INSTRUMENT_LANDING_SYSTEM_MOD("22", "Instrument Landing System", SymbolSet.SS_SIGINT_LAND),
    IONOSPHERIC_SOUNDING_MOD("23", "Ionospheric Sounding", SymbolSet.SS_SIGINT_LAND),
    IFF_TRANSPONDER_MOD("24", "Identification Friend or Foe (Transponder)", SymbolSet.SS_SIGINT_LAND),
    BARRAGE_JAMMER_MOD("25", "Barrage Jammer", SymbolSet.SS_SIGINT_LAND),
    CLICK_JAMMER_MOD("26", "Click Jammer", SymbolSet.SS_SIGINT_LAND),
    DECEPTIVE_JAMMER_MOD("27", "Deceptive Jammer", SymbolSet.SS_SIGINT_LAND),
    FREQUENCY_SWEPT_JAMMER_MOD("28", "Frequency Swept Jammer", SymbolSet.SS_SIGINT_LAND),
    JAMMER_GENERAL_MOD("29", "Jammer (General)", SymbolSet.SS_SIGINT_LAND),
    NOISE_JAMMER_MOD("30", "Noise Jammer", SymbolSet.SS_SIGINT_LAND),
    PULSED_JAMMER_MOD("31", "Pulsed Jammer", SymbolSet.SS_SIGINT_LAND),
    REPEATER_JAMMER_MOD("32", "Repeater Jammer", SymbolSet.SS_SIGINT_LAND),
    SPOT_NOISE_JAMMER_MOD("33", "Spot Noise Jammer", SymbolSet.SS_SIGINT_LAND),
    TRANSPONDER_JAMMER_MOD("34", "Transponder Jammer", SymbolSet.SS_SIGINT_LAND),
    MISSILE_ACQUISITION_MOD("35", "Missile Acquisition", SymbolSet.SS_SIGINT_LAND),
    MISSILE_CONTROL_MOD("36", "Missile Control", SymbolSet.SS_SIGINT_LAND),
    METEOROLOGICAL_MOD("38", "Meteorological", SymbolSet.SS_SIGINT_LAND),
    MULTI_FUNCTION_MOD("39", "Multi-Function", SymbolSet.SS_SIGINT_LAND),
    MISSILE_GUIDANCE_MOD("40", "Missile Guidance", SymbolSet.SS_SIGINT_LAND),
    MISSILE_TRACKING_MOD("42", "Missile Tracking", SymbolSet.SS_SIGINT_LAND),
    NAVIGATIONAL_GENERAL_MOD("43", "Navigational/General", SymbolSet.SS_SIGINT_LAND),
    NAVIGATIONAL_DISTANCE_MEASURING_EQUIPMENT_MOD("44", "Navigational/Distance Measuring Equipment", SymbolSet.SS_SIGINT_LAND),
    NAVIGATION_TERRAIN_FOLLOWING_MOD("45", "Navigation/Terrain Following", SymbolSet.SS_SIGINT_LAND),
    NAVIGATIONAL_WEATHER_AVOIDANCE_MOD("46", "Navigational/Weather Avoidance", SymbolSet.SS_SIGINT_LAND),
    OMNI_LOS_MOD("47", "Omni-Line of Sight (LOS)", SymbolSet.SS_SIGINT_LAND),
    POINT_POINT_LOS_MOD("49", "Point-to-Point Line of Sight (LOS)", SymbolSet.SS_SIGINT_LAND),
    INSTRUMENTATION_MOD("50", "Instrumentation", SymbolSet.SS_SIGINT_LAND),
    RANGE_ONLY_MOD("51", "Range Only", SymbolSet.SS_SIGINT_LAND),
    SPACE_MOD("54", "Space", SymbolSet.SS_SIGINT_LAND),
    SURFACE_SEARCH_MOD("55", "Surface Search", SymbolSet.SS_SIGINT_LAND),
    SHELL_TRACKING_MOD("56", "Shell Tracking", SymbolSet.SS_SIGINT_LAND),
    SATELLITE_UPLINK_MOD("57", "Satellite Uplink", SymbolSet.SS_SIGINT_LAND),
    TARGET_ACQUISITION_MOD("58", "Target Acquisition", SymbolSet.SS_SIGINT_LAND),
    TARGET_ILLUMINATION_MOD("59", "Target Illumination", SymbolSet.SS_SIGINT_LAND),
    TROPOSPHERIC_SCATTER_MOD("60", "Tropospheric Scatter", SymbolSet.SS_SIGINT_LAND),
    TARGET_TRACKING_MOD("61", "Target Tracking", SymbolSet.SS_SIGINT_LAND),
    UNKNOWN_MOD("62", "Unknown", SymbolSet.SS_SIGINT_LAND),
    VIDEO_REMOTING_MOD("63", "Video Remoting", SymbolSet.SS_SIGINT_LAND),
    EXPERIMENTAL_MOD("64", "Experimental", SymbolSet.SS_SIGINT_LAND);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SignalsIntelligenceLandSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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