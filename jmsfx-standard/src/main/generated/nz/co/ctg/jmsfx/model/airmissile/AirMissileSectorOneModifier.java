package nz.co.ctg.jmsfx.model.airmissile;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum AirMissileSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.SS_AIR_MISSILE),
    AIR_MOD("01", "Air", "Launch Origin", SymbolSet.SS_AIR_MISSILE),
    SURFACE_MOD("02", "Surface", "Launch Origin", SymbolSet.SS_AIR_MISSILE),
    SUB_MOD("03", "Subsurface", "Launch Origin", SymbolSet.SS_AIR_MISSILE),
    SPACE_MOD("04", "Space", "Launch Origin", SymbolSet.SS_AIR_MISSILE),
    AB_MOD("05", "Anti-Ballistic", "Missile Class", SymbolSet.SS_AIR_MISSILE),
    BALLISTIC_MOD("06", "Ballistic", "Missile Class", SymbolSet.SS_AIR_MISSILE),
    CRUISE_MOD("07", "Cruise", "Missile Class", SymbolSet.SS_AIR_MISSILE),
    INTERCEPTOR_MOD("08", "Interceptor", "Missile Class", SymbolSet.SS_AIR_MISSILE),
    HYPERSONIC_MOD("09", "Interceptor", "Missile Class", SymbolSet.SS_AIR_MISSILE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private AirMissileSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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