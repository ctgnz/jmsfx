package nz.co.ctg.jmsfx.model.air;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum AirSectorTwoModifier implements SectorTwoModifier {
    NOT_APPLICABLE_2_MOD("00", "Not Applicable", SymbolSet.SS_AIR),
    BOOM_MOD("04", "Boom-Only", SymbolSet.SS_AIR),
    DROGUE_MOD("05", "Drogue-Only", SymbolSet.SS_AIR),
    BOOM_DROGUE_MOD("06", "Boom and Drogue", SymbolSet.SS_AIR),
    DOWNLINK_MOD("11", "Downlinked", SymbolSet.SS_AIR);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private AirSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
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