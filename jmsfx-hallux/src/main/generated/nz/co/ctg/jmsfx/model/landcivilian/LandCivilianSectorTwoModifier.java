package nz.co.ctg.jmsfx.model.landcivilian;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum LandCivilianSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", SymbolSet.SS_LAND_CIVILIAN),
    LEADER_2_MOD("01", "Leader or Leadership", SymbolSet.SS_LAND_CIVILIAN);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private LandCivilianSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
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