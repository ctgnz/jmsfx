package nz.co.ctg.jmsfx.model.air;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum AirSectorTwoModifier implements SectorTwoModifier {
    NOT_APPLICABLE_2_MOD("00", "Not Applicable", SymbolSet.SS_AIR),
    HVY_MOD("01", "Heavy", SymbolSet.SS_AIR),
    MED_MOD("02", "Medium", SymbolSet.SS_AIR),
    LT_MOD("03", "Light", SymbolSet.SS_AIR),
    BOOM_MOD("04", "Boom-Only", SymbolSet.SS_AIR),
    DROGUE_MOD("05", "Drogue-Only", SymbolSet.SS_AIR),
    BOOM_DROGUE_MOD("06", "Boom and Drogue", SymbolSet.SS_AIR),
    CLOSE_MOD("07", "Close Range", SymbolSet.SS_AIR),
    SHORT_MOD("08", "Short Range", SymbolSet.SS_AIR),
    MEDIUM_MOD("09", "Medium Range", SymbolSet.SS_AIR),
    LONG_MOD("10", "Long Range", SymbolSet.SS_AIR),
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