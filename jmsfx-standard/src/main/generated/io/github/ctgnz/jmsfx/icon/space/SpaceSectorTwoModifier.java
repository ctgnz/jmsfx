package io.github.ctgnz.jmsfx.icon.space;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum SpaceSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", "General", SymbolSetEnum.SPACE),
    OPTICAL_MOD("01", "Optical", "Sensor", SymbolSetEnum.SPACE),
    INFRARED_MOD("02", "Infrared", "Sensor", SymbolSetEnum.SPACE),
    RADAR_MOD("03", "Radar", "Sensor", SymbolSetEnum.SPACE),
    SIGINT_MOD("04", "Signals Intelligence (SIGINT)", "Sensor", SymbolSetEnum.SPACE),
    ELECTRONIC_WARFARE_MOD("06", "Electronic Warfare (ASAT)", "Capability", SymbolSetEnum.SPACE),
    HIGH_POWER_MICROWAVE_MOD("07", "High Power Microwave (ASAT)", "Capability", SymbolSetEnum.SPACE),
    LASER_MOD("08", "Laser (ASAT)", "Capability", SymbolSetEnum.SPACE),
    MINE_MOD("09", "Mine (ASAT)", "Capability", SymbolSetEnum.SPACE),
    MAINTENANCE_MOD("10", "Maintenance", "Capability", SymbolSetEnum.SPACE),
    REFUEL_MOD("11", "Refuel", "Capability", SymbolSetEnum.SPACE),
    TUG_MOD("12", "Tug", "Capability", SymbolSetEnum.SPACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    SpaceSectorTwoModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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