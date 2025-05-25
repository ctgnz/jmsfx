package nz.co.ctg.jmsfx.model.seasurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SeaSurfaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.SEA_SURFACE),
    OWN_MOD("01", "Own Ship", "Mission Area", SymbolSet.SEA_SURFACE),
    AA_MOD("02", "Antiair Warfare", "Mission Area", SymbolSet.SEA_SURFACE),
    MD_MOD("08", "Missile Defense", "Mission Area", SymbolSet.SEA_SURFACE),
    RMV_MOD("11", "Remote Multi-Mission Vehicle (USV-only)", "Mission Area", SymbolSet.SEA_SURFACE),
    TORPEDO_MOD("17", "Torpedo", "Weapons Capability", SymbolSet.SEA_SURFACE),
    LRST_MOD("21", "Ballistic Missile Defense, Long-Range Surveillance and Track (LRST)", "Mission Area", SymbolSet.SEA_SURFACE),
    SEA_BASED_X_MOD("22", "Sea-Base X-Band", "Mission Area", SymbolSet.SEA_SURFACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private SeaSurfaceSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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