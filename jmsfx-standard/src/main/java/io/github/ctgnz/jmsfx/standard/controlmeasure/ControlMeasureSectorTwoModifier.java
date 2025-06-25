package io.github.ctgnz.jmsfx.standard.controlmeasure;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum ControlMeasureSectorTwoModifier implements SectorTwoModifier {
    URBAN_MOD("01", "Urban", "Terrain", SymbolSetEnum.CONTROL_MEASURE),
    WATER_MOD("02", "Water", "Terrain", SymbolSetEnum.CONTROL_MEASURE),
    GROUND_MOD("03", "Ground", "Terrain", SymbolSetEnum.CONTROL_MEASURE),
    VEGETATION_MOD("04", "Vegetation", "Terrain", SymbolSetEnum.CONTROL_MEASURE),
    OBSTACLES_MOD("05", "Obstacles", "Terrain", SymbolSetEnum.CONTROL_MEASURE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    ControlMeasureSectorTwoModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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