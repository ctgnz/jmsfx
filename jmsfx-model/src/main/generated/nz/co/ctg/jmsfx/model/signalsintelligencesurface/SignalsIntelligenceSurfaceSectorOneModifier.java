package nz.co.ctg.jmsfx.model.signalsintelligencesurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SignalsIntelligenceSurfaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_SIGINT_SURFACE),
    ANTI_AIRCRAFT_FIRE_CONTROL_MOD("01", "Anti-Aircraft Fire Control", SymbolSet.SS_SIGINT_SURFACE),
    AIR_TRAFFIC_CONTROL_MOD("06", "Air Traffic Control", SymbolSet.SS_SIGINT_SURFACE),
    BEACON_TRANSPONDER_MOD("07", "Beacon Transponder (not IFF)", SymbolSet.SS_SIGINT_SURFACE),
    CONTROLLED_APPROACH_MOD("09", "Controlled Approach", SymbolSet.SS_SIGINT_SURFACE),
    CONTROLLED_INTERCEPT_MOD("10", "Controlled Intercept", SymbolSet.SS_SIGINT_SURFACE),
    CELLULAR_MOBILE_MOD("11", "Cellular/Mobile", SymbolSet.SS_SIGINT_SURFACE),
    DECOY_MIMIC_MOD("13", "Decoy/Mimic", SymbolSet.SS_SIGINT_SURFACE),
    DATA_TRANSMISSION_MOD("14", "Data Transmission", SymbolSet.SS_SIGINT_SURFACE),
    EARLY_WARNING_MOD("16", "Early Warning", SymbolSet.SS_SIGINT_SURFACE),
    FIRE_CONTROL_MOD("17", "Fire Control", SymbolSet.SS_SIGINT_SURFACE),
    HEIGHT_FINDING_MOD("19", "Height Finding", SymbolSet.SS_SIGINT_SURFACE),
    IFF_INTERROGATOR_MOD("21", "Identification Friend or Foe (Interrogator)", SymbolSet.SS_SIGINT_SURFACE),
    INSTRUMENT_LANDING_SYSTEM_MOD("22", "Instrument Landing System", SymbolSet.SS_SIGINT_SURFACE),
    IFF_TRANSPONDER_MOD("24", "Identification Friend or Foe (Transponder)", SymbolSet.SS_SIGINT_SURFACE),
    BARRAGE_JAMMER_MOD("25", "Barrage Jammer", SymbolSet.SS_SIGINT_SURFACE),
    CLICK_JAMMER_MOD("26", "Click Jammer", SymbolSet.SS_SIGINT_SURFACE),
    DECEPTIVE_JAMMER_MOD("27", "Deceptive Jammer", SymbolSet.SS_SIGINT_SURFACE),
    FREQUENCY_SWEPT_JAMMER_MOD("28", "Frequency Swept Jammer", SymbolSet.SS_SIGINT_SURFACE),
    JAMMER_GENERAL_MOD("29", "Jammer (General)", SymbolSet.SS_SIGINT_SURFACE),
    NOISE_JAMMER_MOD("30", "Noise Jammer", SymbolSet.SS_SIGINT_SURFACE),
    PULSED_JAMMER_MOD("31", "Pulsed Jammer", SymbolSet.SS_SIGINT_SURFACE),
    REPEATER_JAMMER_MOD("32", "Repeater Jammer", SymbolSet.SS_SIGINT_SURFACE),
    SPOT_NOISE_JAMMER_MOD("33", "Spot Noise Jammer", SymbolSet.SS_SIGINT_SURFACE),
    TRANSPONDER_JAMMER_MOD("34", "Transponder Jammer", SymbolSet.SS_SIGINT_SURFACE),
    MISSILE_ACQUISITION_MOD("35", "Missile Acquisition", SymbolSet.SS_SIGINT_SURFACE),
    MISSILE_CONTROL_MOD("36", "Missile Control", SymbolSet.SS_SIGINT_SURFACE),
    METEOROLOGICAL_MOD("38", "Meteorological", SymbolSet.SS_SIGINT_SURFACE),
    MULTI_FUNCTION_MOD("39", "Multi-Function", SymbolSet.SS_SIGINT_SURFACE),
    MISSILE_GUIDANCE_MOD("40", "Missile Guidance", SymbolSet.SS_SIGINT_SURFACE),
    MISSILE_TRACKING_MOD("42", "Missile Tracking", SymbolSet.SS_SIGINT_SURFACE),
    NAVIGATIONAL_GENERAL_MOD("43", "Navigational/General", SymbolSet.SS_SIGINT_SURFACE),
    NAVIGATIONAL_DISTANCE_MEASURING_EQUIPMENT_MOD("44", "Navigational/Distance Measuring Equipment", SymbolSet.SS_SIGINT_SURFACE),
    NAVIGATION_TERRAIN_FOLLOWING_MOD("45", "Navigation/Terrain Following", SymbolSet.SS_SIGINT_SURFACE),
    NAVIGATIONAL_WEATHER_AVOIDANCE_MOD("46", "Navigational/Weather Avoidance", SymbolSet.SS_SIGINT_SURFACE),
    OMNI_LOS_MOD("47", "Omni-Line of Sight (LOS)", SymbolSet.SS_SIGINT_SURFACE),
    POINT_POINT_LOS_MOD("49", "Point-to-Point Line of Sight (LOS)", SymbolSet.SS_SIGINT_SURFACE),
    INSTRUMENTATION_MOD("50", "Instrumentation", SymbolSet.SS_SIGINT_SURFACE),
    RANGE_ONLY_MOD("51", "Range Only", SymbolSet.SS_SIGINT_SURFACE),
    SONOBUOY_MOD("52", "Sonobuoy", SymbolSet.SS_SIGINT_SURFACE),
    SPACE_MOD("54", "Space", SymbolSet.SS_SIGINT_SURFACE),
    SURFACE_SEARCH_MOD("55", "Surface Search", SymbolSet.SS_SIGINT_SURFACE),
    SATELLITE_UPLINK_MOD("57", "Satellite Uplink", SymbolSet.SS_SIGINT_SURFACE),
    TARGET_ACQUISITION_MOD("58", "Target Acquisition", SymbolSet.SS_SIGINT_SURFACE),
    TARGET_ILLUMINATION_MOD("59", "Target Illumination", SymbolSet.SS_SIGINT_SURFACE),
    TARGET_TRACKING_MOD("61", "Target Tracking", SymbolSet.SS_SIGINT_SURFACE),
    UNKNOWN_MOD("62", "Unknown", SymbolSet.SS_SIGINT_SURFACE),
    VIDEO_REMOTING_MOD("63", "Video Remoting", SymbolSet.SS_SIGINT_SURFACE),
    EXPERIMENTAL_MOD("64", "Experimental", SymbolSet.SS_SIGINT_SURFACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SignalsIntelligenceSurfaceSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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