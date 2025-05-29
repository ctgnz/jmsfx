package io.github.ctgnz.jmsfx.icon.space;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;

public enum SpaceSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", "General", SymbolSet.SPACE),
    OPTICAL_MOD("01", "Optical", "Sensor", SymbolSet.SPACE),
    INFRARED_MOD("02", "Infrared", "Sensor", SymbolSet.SPACE),
    RADAR_MOD("03", "Radar", "Sensor", SymbolSet.SPACE),
    SIGINT_MOD("04", "Signals Intelligence (SIGINT)", "Sensor", SymbolSet.SPACE),
    ELECTRONIC_WARFARE_MOD("06", "Electronic Warfare (ASAT)", "Capability", SymbolSet.SPACE),
    HIGH_POWER_MICROWAVE_MOD("07", "High Power Microwave (ASAT)", "Capability", SymbolSet.SPACE),
    LASER_MOD("08", "Laser (ASAT)", "Capability", SymbolSet.SPACE),
    MINE_MOD("09", "Mine (ASAT)", "Capability", SymbolSet.SPACE),
    MAINTENANCE_MOD("10", "Maintenance", "Capability", SymbolSet.SPACE),
    REFUEL_MOD("11", "Refuel", "Capability", SymbolSet.SPACE),
    TUG_MOD("12", "Tug", "Capability", SymbolSet.SPACE);

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