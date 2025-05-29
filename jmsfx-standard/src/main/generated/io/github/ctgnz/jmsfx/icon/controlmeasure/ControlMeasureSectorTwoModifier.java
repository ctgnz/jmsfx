package io.github.ctgnz.jmsfx.icon.controlmeasure;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;

public enum ControlMeasureSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", "General", SymbolSet.CONTROL_MEASURE),
    URBAN_MOD("01", "Urban", "Terrain", SymbolSet.CONTROL_MEASURE),
    WATER_MOD("02", "Water", "Terrain", SymbolSet.CONTROL_MEASURE),
    GROUND_MOD("03", "Ground", "Terrain", SymbolSet.CONTROL_MEASURE),
    VEGETATION_MOD("04", "Vegetation", "Terrain", SymbolSet.CONTROL_MEASURE),
    OBSTACLES_MOD("05", "Obstacles", "Terrain", SymbolSet.CONTROL_MEASURE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private ControlMeasureSectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
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