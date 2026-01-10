package io.github.ctgnz.jmsfx.standard.space;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum SpaceSectorTwoModifier implements SectorTwoModifier {
    OPTICAL("01", "Optical", ModifierCategory.SensorType),
    INFRARED("02", "Infrared", ModifierCategory.SensorType),
    RADAR("03", "Radar", ModifierCategory.SensorType),
    SIGINT("04", "Signals Intelligence (SIGINT)", ModifierCategory.SensorType),
    ELECTRONIC_WARFARE("06", "Electronic Warfare (ASAT)", ModifierCategory.Capability),
    HIGH_POWER_MICROWAVE("07", "High Power Microwave (ASAT)", ModifierCategory.Capability),
    LASER("08", "Laser (ASAT)", ModifierCategory.Capability),
    MINE("09", "Mine (ASAT)", ModifierCategory.Capability),
    MAINTENANCE("10", "Maintenance", ModifierCategory.Capability),
    REFUEL("11", "Refuel", ModifierCategory.Capability),
    TUG("12", "Tug", ModifierCategory.Capability);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    SpaceSectorTwoModifier(String id, String label, ModifierCategory category) {
        this.id = id;
        this.label = label;
        this.category = category;
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
        return SymbolSetEnum.SPACE;
    }

}