package nz.co.ctg.jmsfx.model;

public enum CommonSectorTwoModifier implements SectorTwoModifier {
    AIRBORNE_2_MOD("00", "Airborne"),
    BICYCLE_EQUIPPED_2_MOD("01", "Bicycle Equipped"),
    RAILROAD_RAILWAY_2_MOD("02", "Railroad/Railway"),
    SKI_2_MOD("03", "Ski"),
    TRACKED_2_MOD("04", "Tracked"),
    STANDARD_ON_ROAD_MOBILITY_2_MOD("05", "Standard Mobility/On-Road Mobility"),
    HIGH_OFF_ROAD_MOBILITY_2_MOD("06", "High Mobility/Off-Road Mobility"),
    FIXED_WING_2_MOD("07", "Fixed Wing"),
    ROTARY_WING_2_MOD("08", "Rotary Wing"),
    ROBOTIC_2_MOD("09", "Robotic"),
    AUTONOMOUS_CONTROL_2_MOD("10", "Autonomous Control"),
    REMOTELY_PILOTED_2_MOD("11", "Remotely Piloted"),
    EXPENDABLE_2_MOD("12", "Expendable"),
    MOUNTAIN_2_MOD("13", "Mountain"),
    LONG_RANGE_2_MOD("14", "Long Range"),
    MEDIUM_RANGE_2_MOD("15", "Medium Range"),
    SHORT_RANGE_2_MOD("16", "Short Range"),
    CLOSE_RANGE_2_MOD("17", "Close Range"),
    HEAVY_2_MOD("18", "Heavy"),
    MEDIUM_2_MOD("19", "Medium"),
    LIGHT_MEDIUM_2_MOD("20", "Light and Medium"),
    LIGHT_2_MOD("21", "Light"),
    CYBERSPACE_2_MOD("22", "Cyberspace"),
    SECURITY_FORCE_ASSISTANCE_2_MOD("23", "Security Force Assistance"),
    MEDICAL_BED_2_MOD("24", "Medical Bed"),
    MULTIFUNCTIONAL_2_MOD("25", "Multifunctional");

    private final String id;
    private final String label;
    
    private CommonSectorTwoModifier(String id, String label) {
        this.id = id;
        this.label = label;
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
        return SymbolSet.COMMON;
    }
    
}