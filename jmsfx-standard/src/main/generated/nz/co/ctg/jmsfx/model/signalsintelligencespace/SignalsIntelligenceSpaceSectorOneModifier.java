package nz.co.ctg.jmsfx.model.signalsintelligencespace;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SignalsIntelligenceSpaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_SIGINT_SPACE),
    DATA_TRANSMISSION_MOD("14", "Data Transmission", SymbolSet.SS_SIGINT_SPACE),
    EARTH_SURVEILLANCE_MOD("15", "Earth Surveillance", SymbolSet.SS_SIGINT_SPACE),
    IFF_INTERROGATOR_MOD("21", "Identification Friend or Foe (Interrogator)", SymbolSet.SS_SIGINT_SPACE),
    IFF_TRANSPONDER_MOD("24", "Identification Friend or Foe (Transponder)", SymbolSet.SS_SIGINT_SPACE),
    BARRAGE_JAMMER_MOD("25", "Barrage Jammer", SymbolSet.SS_SIGINT_SPACE),
    CLICK_JAMMER_MOD("26", "Click Jammer", SymbolSet.SS_SIGINT_SPACE),
    DECEPTIVE_JAMMER_MOD("27", "Deceptive Jammer", SymbolSet.SS_SIGINT_SPACE),
    FREQUENCY_SWEPT_JAMMER_MOD("28", "Frequency Swept Jammer", SymbolSet.SS_SIGINT_SPACE),
    JAMMER_GENERAL_MOD("29", "Jammer (General)", SymbolSet.SS_SIGINT_SPACE),
    NOISE_JAMMER_MOD("30", "Noise Jammer", SymbolSet.SS_SIGINT_SPACE),
    PULSED_JAMMER_MOD("31", "Pulsed Jammer", SymbolSet.SS_SIGINT_SPACE),
    REPEATER_JAMMER_MOD("32", "Repeater Jammer", SymbolSet.SS_SIGINT_SPACE),
    SPOT_NOISE_JAMMER_MOD("33", "Spot Noise Jammer", SymbolSet.SS_SIGINT_SPACE),
    TRANSPONDER_JAMMER_MOD("34", "Transponder Jammer", SymbolSet.SS_SIGINT_SPACE),
    MISSILE_CONTROL_MOD("36", "Missile Control", SymbolSet.SS_SIGINT_SPACE),
    MULTI_FUNCTION_MOD("39", "Multi-Function", SymbolSet.SS_SIGINT_SPACE),
    MISSILE_TRACKING_MOD("42", "Missile Tracking", SymbolSet.SS_SIGINT_SPACE),
    NAVIGATIONAL_GENERAL_MOD("43", "Navigational/General", SymbolSet.SS_SIGINT_SPACE),
    NAVIGATIONAL_DISTANCE_MEASURING_EQUIPMENT_MOD("44", "Navigational/Distance Measuring Equipment", SymbolSet.SS_SIGINT_SPACE),
    NAVIGATION_TERRAIN_FOLLOWING_MOD("45", "Navigation/Terrain Following", SymbolSet.SS_SIGINT_SPACE),
    POINT_POINT_LOS_MOD("49", "Point-to-Point Line of Sight (LOS)", SymbolSet.SS_SIGINT_SPACE),
    INSTRUMENTATION_MOD("50", "Instrumentation", SymbolSet.SS_SIGINT_SPACE),
    RANGE_ONLY_MOD("51", "Range Only", SymbolSet.SS_SIGINT_SPACE),
    SATELLITE_DOWNLINK_MOD("53", "Satellite Downlink", SymbolSet.SS_SIGINT_SPACE),
    SPACE_MOD("54", "Space", SymbolSet.SS_SIGINT_SPACE),
    SURFACE_SEARCH_MOD("55", "Surface Search", SymbolSet.SS_SIGINT_SPACE),
    TARGET_ACQUISITION_MOD("58", "Target Acquisition", SymbolSet.SS_SIGINT_SPACE),
    TARGET_TRACKING_MOD("61", "Target Tracking", SymbolSet.SS_SIGINT_SPACE),
    UNKNOWN_MOD("62", "Unknown", SymbolSet.SS_SIGINT_SPACE),
    VIDEO_REMOTING_MOD("63", "Video Remoting", SymbolSet.SS_SIGINT_SPACE),
    EXPERIMENTAL_MOD("64", "Experimental", SymbolSet.SS_SIGINT_SPACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SignalsIntelligenceSpaceSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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