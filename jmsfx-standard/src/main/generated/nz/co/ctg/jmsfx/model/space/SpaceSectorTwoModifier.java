package nz.co.ctg.jmsfx.model.space;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum SpaceSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", "General", SymbolSet.SS_SPACE),
    OPTICAL_MOD("01", "Optical", "Sensor", SymbolSet.SS_SPACE),
    INFRARED_MOD("02", "Infrared", "Sensor", SymbolSet.SS_SPACE),
    RADAR_MOD("03", "Radar", "Sensor", SymbolSet.SS_SPACE),
    SIGINT_MOD("04", "Signals Intelligence (SIGINT)", "Sensor", SymbolSet.SS_SPACE),
    ELECTRONIC_WARFARE_MOD("06", "Electronic Warfare (ASAT)", "Capability", SymbolSet.SS_SPACE),
    HIGH_POWER_MICROWAVE_MOD("07", "High Power Microwave (ASAT)", "Capability", SymbolSet.SS_SPACE),
    LASER_MOD("08", "Laser (ASAT)", "Capability", SymbolSet.SS_SPACE),
    MINE_MOD("09", "Mine (ASAT)", "Capability", SymbolSet.SS_SPACE),
    MAINTENANCE_MOD("10", "Maintenance", "Capability", SymbolSet.SS_SPACE),
    REFUEL_MOD("11", "Refuel", "Capability", SymbolSet.SS_SPACE),
    TUG_MOD("12", "Tug", "Capability", SymbolSet.SS_SPACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private SpaceSectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
    }
    
    @Override
    public String getCategory() {
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