package nz.co.ctg.jmsfx.model.spacemissile;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum SpaceMissileSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", SymbolSet.SS_SPACE_MISSILE),
    SHORT_MOD("01", "Short Range", SymbolSet.SS_SPACE_MISSILE),
    MEDIUM_MOD("02", "Medium Range", SymbolSet.SS_SPACE_MISSILE),
    INTERMEDIATE_MOD("03", "Intermediate Range", SymbolSet.SS_SPACE_MISSILE),
    LONG_MOD("04", "Long Range", SymbolSet.SS_SPACE_MISSILE),
    INTERCONTINENTAL_MOD("05", "Intercontinental", SymbolSet.SS_SPACE_MISSILE),
    ARROW_MOD("06", "Arrow", SymbolSet.SS_SPACE_MISSILE),
    GBI_MOD("07", "Ground-Based Interceptor (GBI)", SymbolSet.SS_SPACE_MISSILE),
    PATRIOT_MOD("08", "Patriot", SymbolSet.SS_SPACE_MISSILE),
    SMT_MOD("09", "Standard Missile - Terminal Phase (SM-T)", SymbolSet.SS_SPACE_MISSILE),
    SM3_MOD("10", "Standard Missile - 3 (SM-3)", SymbolSet.SS_SPACE_MISSILE),
    THAAD_MOD("11", "Terminal High-Altitude Area Defense (THAAD)", SymbolSet.SS_SPACE_MISSILE),
    SPACE_2_MOD("12", "Space", SymbolSet.SS_SPACE_MISSILE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SpaceMissileSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
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