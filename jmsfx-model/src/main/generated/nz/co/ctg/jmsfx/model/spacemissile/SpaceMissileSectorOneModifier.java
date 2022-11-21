package nz.co.ctg.jmsfx.model.spacemissile;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SpaceMissileSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_SPACE_MISSILE),
    BALLISTIC_MOD("01", "Ballistic", SymbolSet.SS_SPACE_MISSILE),
    SPACE_1_MOD("02", "Space", SymbolSet.SS_SPACE_MISSILE),
    INTERCEPTOR_MOD("03", "Interceptor", SymbolSet.SS_SPACE_MISSILE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SpaceMissileSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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