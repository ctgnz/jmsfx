package nz.co.ctg.jmsfx.model.signalsintelligencesubsurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SignalsIntelligenceSubsurfaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_SIGINT_SUBSURFACE),
    BEACON_TRANSPONDER_MOD("07", "Beacon Transponder (not IFF)", SymbolSet.SS_SIGINT_SUBSURFACE),
    CELLULAR_MOBILE_MOD("11", "Cellular/Mobile", SymbolSet.SS_SIGINT_SUBSURFACE),
    DECOY_MIMIC_MOD("13", "Decoy/Mimic", SymbolSet.SS_SIGINT_SUBSURFACE),
    DATA_TRANSMISSION_MOD("14", "Data Transmission", SymbolSet.SS_SIGINT_SUBSURFACE),
    EARLY_WARNING_MOD("16", "Early Warning", SymbolSet.SS_SIGINT_SUBSURFACE),
    IFF_INTERROGATOR_MOD("21", "Identification Friend or Foe (Interrogator)", SymbolSet.SS_SIGINT_SUBSURFACE),
    IFF_TRANSPONDER_MOD("24", "Identification Friend or Foe (Transponder)", SymbolSet.SS_SIGINT_SUBSURFACE),
    BARRAGE_JAMMER_MOD("25", "Barrage Jammer", SymbolSet.SS_SIGINT_SUBSURFACE),
    CLICK_JAMMER_MOD("26", "Click Jammer", SymbolSet.SS_SIGINT_SUBSURFACE),
    DECEPTIVE_JAMMER_MOD("27", "Deceptive Jammer", SymbolSet.SS_SIGINT_SUBSURFACE),
    FREQUENCY_SWEPT_JAMMER_MOD("28", "Frequency Swept Jammer", SymbolSet.SS_SIGINT_SUBSURFACE),
    JAMMER_GENERAL_MOD("29", "Jammer (General)", SymbolSet.SS_SIGINT_SUBSURFACE),
    NOISE_JAMMER_MOD("30", "Noise Jammer", SymbolSet.SS_SIGINT_SUBSURFACE),
    PULSED_JAMMER_MOD("31", "Pulsed Jammer", SymbolSet.SS_SIGINT_SUBSURFACE),
    REPEATER_JAMMER_MOD("32", "Repeater Jammer", SymbolSet.SS_SIGINT_SUBSURFACE),
    SPOT_NOISE_JAMMER_MOD("33", "Spot Noise Jammer", SymbolSet.SS_SIGINT_SUBSURFACE),
    TRANSPONDER_JAMMER_MOD("34", "Transponder Jammer", SymbolSet.SS_SIGINT_SUBSURFACE),
    MISSILE_CONTROL_MOD("36", "Missile Control", SymbolSet.SS_SIGINT_SUBSURFACE),
    MULTI_FUNCTION_MOD("39", "Multi-Function", SymbolSet.SS_SIGINT_SUBSURFACE),
    MISSILE_TRACKING_MOD("42", "Missile Tracking", SymbolSet.SS_SIGINT_SUBSURFACE),
    NAVIGATIONAL_GENERAL_MOD("43", "Navigational/General", SymbolSet.SS_SIGINT_SUBSURFACE),
    NAVIGATIONAL_DISTANCE_MEASURING_EQUIPMENT_MOD("44", "Navigational/Distance Measuring Equipment", SymbolSet.SS_SIGINT_SUBSURFACE),
    NAVIGATION_TERRAIN_FOLLOWING_MOD("45", "Navigation/Terrain Following", SymbolSet.SS_SIGINT_SUBSURFACE),
    NAVIGATIONAL_WEATHER_AVOIDANCE_MOD("46", "Navigational/Weather Avoidance", SymbolSet.SS_SIGINT_SUBSURFACE),
    OMNI_LOS_MOD("47", "Omni-Line of Sight (LOS)", SymbolSet.SS_SIGINT_SUBSURFACE),
    POINT_POINT_LOS_MOD("49", "Point-to-Point Line of Sight (LOS)", SymbolSet.SS_SIGINT_SUBSURFACE),
    INSTRUMENTATION_MOD("50", "Instrumentation", SymbolSet.SS_SIGINT_SUBSURFACE),
    RANGE_ONLY_MOD("51", "Range Only", SymbolSet.SS_SIGINT_SUBSURFACE),
    SONOBUOY_MOD("52", "Sonobuoy", SymbolSet.SS_SIGINT_SUBSURFACE),
    SPACE_MOD("54", "Space", SymbolSet.SS_SIGINT_SUBSURFACE),
    SURFACE_SEARCH_MOD("55", "Surface Search", SymbolSet.SS_SIGINT_SUBSURFACE),
    SATELLITE_UPLINK_MOD("57", "Satellite Uplink", SymbolSet.SS_SIGINT_SUBSURFACE),
    TARGET_ACQUISITION_MOD("58", "Target Acquisition", SymbolSet.SS_SIGINT_SUBSURFACE),
    TARGET_TRACKING_MOD("61", "Target Tracking", SymbolSet.SS_SIGINT_SUBSURFACE),
    UNKNOWN_MOD("62", "Unknown", SymbolSet.SS_SIGINT_SUBSURFACE),
    VIDEO_REMOTING_MOD("63", "Video Remoting", SymbolSet.SS_SIGINT_SUBSURFACE),
    EXPERIMENTAL_MOD("64", "Experimental", SymbolSet.SS_SIGINT_SUBSURFACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SignalsIntelligenceSubsurfaceSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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