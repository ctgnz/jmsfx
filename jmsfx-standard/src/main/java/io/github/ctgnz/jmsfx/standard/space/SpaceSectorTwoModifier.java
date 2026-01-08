package io.github.ctgnz.jmsfx.standard.space;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum SpaceSectorTwoModifier implements SectorTwoModifier {
    OPTICAL("01", "Optical", ModifierCategory.SensorType, SymbolSetEnum.SPACE),
    INFRARED("02", "Infrared", ModifierCategory.SensorType, SymbolSetEnum.SPACE),
    RADAR("03", "Radar", ModifierCategory.SensorType, SymbolSetEnum.SPACE),
    SIGINT("04", "Signals Intelligence (SIGINT)", ModifierCategory.SensorType, SymbolSetEnum.SPACE),
    ELECTRONIC_WARFARE("06", "Electronic Warfare (ASAT)", ModifierCategory.Capability, SymbolSetEnum.SPACE),
    HIGH_POWER_MICROWAVE("07", "High Power Microwave (ASAT)", ModifierCategory.Capability, SymbolSetEnum.SPACE),
    LASER("08", "Laser (ASAT)", ModifierCategory.Capability, SymbolSetEnum.SPACE),
    MINE("09", "Mine (ASAT)", ModifierCategory.Capability, SymbolSetEnum.SPACE),
    MAINTENANCE("10", "Maintenance", ModifierCategory.Capability, SymbolSetEnum.SPACE),
    REFUEL("11", "Refuel", ModifierCategory.Capability, SymbolSetEnum.SPACE),
    TUG("12", "Tug", ModifierCategory.Capability, SymbolSetEnum.SPACE);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    SpaceSectorTwoModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
    }

    @Override
    public ModifierCategory getCategory() {
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