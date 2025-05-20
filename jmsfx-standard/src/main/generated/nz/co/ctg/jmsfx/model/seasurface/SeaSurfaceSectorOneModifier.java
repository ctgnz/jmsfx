package nz.co.ctg.jmsfx.model.seasurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SeaSurfaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_SEA_SURFACE),
    OWN_MOD("01", "Own Ship", SymbolSet.SS_SEA_SURFACE),
    AA_MOD("02", "Antiair Warfare", SymbolSet.SS_SEA_SURFACE),
    MD_MOD("08", "Missile Defense", SymbolSet.SS_SEA_SURFACE),
    RMV_MOD("11", "Remote Multi-Mission Vehicle (USV-only)", SymbolSet.SS_SEA_SURFACE),
    TORPEDO_MOD("17", "Torpedo", SymbolSet.SS_SEA_SURFACE),
    LRST_MOD("21", "Ballistic Missile Defense, Long-Range Surveillance and Track (LRST)", SymbolSet.SS_SEA_SURFACE),
    SEA_BASED_X_MOD("22", "Sea-Base X-Band", SymbolSet.SS_SEA_SURFACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SeaSurfaceSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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