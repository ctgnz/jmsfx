package io.github.ctgnz.jmsfx.standard.controlmeasure;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum ControlMeasureSectorTwoModifier implements SectorTwoModifier {
    URBAN("01", "Urban", ModifierCategory.Terrain, SymbolSetEnum.CONTROL_MEASURE),
    WATER("02", "Water", ModifierCategory.Terrain, SymbolSetEnum.CONTROL_MEASURE),
    GROUND("03", "Ground", ModifierCategory.Terrain, SymbolSetEnum.CONTROL_MEASURE),
    VEGETATION("04", "Vegetation", ModifierCategory.Terrain, SymbolSetEnum.CONTROL_MEASURE),
    OBSTACLES("05", "Obstacles", ModifierCategory.Terrain, SymbolSetEnum.CONTROL_MEASURE);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    ControlMeasureSectorTwoModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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