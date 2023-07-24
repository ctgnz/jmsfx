package nz.co.ctg.jmsfx.model.airmissile;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum AirMissileSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_AIR_MISSILE),
    AIR_MOD("01", "Air", SymbolSet.SS_AIR_MISSILE),
    SURFACE_MOD("02", "Surface", SymbolSet.SS_AIR_MISSILE),
    SUB_MOD("03", "Subsurface", SymbolSet.SS_AIR_MISSILE),
    SPACE_MOD("04", "Space", SymbolSet.SS_AIR_MISSILE),
    AB_MOD("05", "Anti-Ballistic", SymbolSet.SS_AIR_MISSILE),
    BALLISTIC_MOD("06", "Ballistic", SymbolSet.SS_AIR_MISSILE),
    CRUISE_MOD("07", "Cruise", SymbolSet.SS_AIR_MISSILE),
    INTERCEPTOR_MOD("08", "Interceptor", SymbolSet.SS_AIR_MISSILE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private AirMissileSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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