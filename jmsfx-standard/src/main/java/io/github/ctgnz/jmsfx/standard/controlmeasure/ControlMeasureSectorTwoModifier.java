package io.github.ctgnz.jmsfx.standard.controlmeasure;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum ControlMeasureSectorTwoModifier implements SectorTwoModifier {
    URBAN("01", "Urban", ModifierCategory.Terrain),
    WATER("02", "Water", ModifierCategory.Terrain),
    GROUND("03", "Ground", ModifierCategory.Terrain),
    VEGETATION("04", "Vegetation", ModifierCategory.Terrain),
    OBSTACLES("05", "Obstacles", ModifierCategory.Terrain);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    ControlMeasureSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.CONTROL_MEASURE;
    }

}