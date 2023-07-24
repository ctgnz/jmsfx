package nz.co.ctg.jmsfx.model.space;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum SpaceSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", SymbolSet.SS_SPACE),
    OPTICAL_MOD("01", "Optical", SymbolSet.SS_SPACE),
    INFRARED_MOD("02", "Infrared", SymbolSet.SS_SPACE),
    RADAR_MOD("03", "Radar", SymbolSet.SS_SPACE),
    SIGINT_MOD("04", "Signals Intelligence (SIGINT)", SymbolSet.SS_SPACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SpaceSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
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