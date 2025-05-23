package nz.co.ctg.jmsfx.model.controlmeasure;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum ControlMeasureSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", SymbolSet.SS_CONTROL_MEASURE),
    URBAN_MOD("01", "Urban", SymbolSet.SS_CONTROL_MEASURE),
    WATER_MOD("02", "Water", SymbolSet.SS_CONTROL_MEASURE),
    GROUND_MOD("03", "Ground", SymbolSet.SS_CONTROL_MEASURE),
    VEGETATION_MOD("04", "Vegetation", SymbolSet.SS_CONTROL_MEASURE),
    OBSTACLES_MOD("05", "Obstacles", SymbolSet.SS_CONTROL_MEASURE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private ControlMeasureSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
        this.id = id;
        this.label = label;
        this.symbolSet = symbolSet;
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