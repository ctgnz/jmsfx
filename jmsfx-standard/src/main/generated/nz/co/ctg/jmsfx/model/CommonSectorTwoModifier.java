package nz.co.ctg.jmsfx.model;

public enum CommonSectorTwoModifier implements SectorTwoModifier {
    AIRBORNE_2_MOD("1", "00", "Airborne"),
    BICYCLE_EQUIPPED_2_MOD("1", "01", "Bicycle Equipped"),
    RAILROAD_RAILWAY_2_MOD("1", "02", "Railroad/Railway"),
    SKI_2_MOD("1", "03", "Ski"),
    TRACKED_2_MOD("1", "04", "Tracked"),
    STANDARD_ON_ROAD_MOBILITY_2_MOD("1", "05", "Standard Mobility/On-Road Mobility"),
    HIGH_OFF_ROAD_MOBILITY_2_MOD("1", "06", "High Mobility/Off-Road Mobility"),
    FIXED_WING_2_MOD("1", "07", "Fixed Wing"),
    ROTARY_WING_2_MOD("1", "08", "Rotary Wing"),
    ROBOTIC_2_MOD("1", "09", "Robotic"),
    AUTONOMOUS_CONTROL_2_MOD("1", "10", "Autonomous Control"),
    REMOTELY_PILOTED_2_MOD("1", "11", "Remotely Piloted"),
    EXPENDABLE_2_MOD("1", "12", "Expendable"),
    MOUNTAIN_2_MOD("1", "13", "Mountain"),
    LONG_RANGE_2_MOD("1", "14", "Long Range"),
    MEDIUM_RANGE_2_MOD("1", "15", "Medium Range"),
    SHORT_RANGE_2_MOD("1", "16", "Short Range"),
    CLOSE_RANGE_2_MOD("1", "17", "Close Range"),
    HEAVY_2_MOD("1", "18", "Heavy"),
    MEDIUM_2_MOD("1", "19", "Medium"),
    LIGHT_MEDIUM_2_MOD("1", "20", "Light and Medium"),
    LIGHT_2_MOD("1", "21", "Light"),
    CYBERSPACE_2_MOD("1", "22", "Cyberspace"),
    SECURITY_FORCE_ASSISTANCE_2_MOD("1", "23", "Security Force Assistance"),
    MEDICAL_BED_2_MOD("1", "24", "Medical Bed"),
    MULTIFUNCTIONAL_2_MOD("1", "25", "Multifunctional");

    private final String groupId;
    private final String id;
    private final String label;
    
    private CommonSectorTwoModifier(String groupId, String id, String label) {
        this.groupId = groupId;
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getGraphicIdentifier() {
        return String.format("%s%s%s2", getSymbolSet().getId(), getGroupId(), getId());
    }

    public String getGroupId() {
        return groupId;
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
    
    @Override
    public boolean isUnknown() {
        return false;
    }
    
}