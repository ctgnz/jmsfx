package io.github.ctgnz.jmsfx.icon.seasurface;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum SeaSurfaceSectorOneModifier implements SectorOneModifier {
    OWN_MOD("01", "Own Ship", "Mission Area", SymbolSetEnum.SEA_SURFACE),
    AA_MOD("02", "Antiair Warfare", "Mission Area", SymbolSetEnum.SEA_SURFACE),
    MD_MOD("08", "Missile Defense", "Mission Area", SymbolSetEnum.SEA_SURFACE),
    RMV_MOD("11", "Remote Multi-Mission Vehicle (USV-only)", "Mission Area", SymbolSetEnum.SEA_SURFACE),
    TORPEDO_MOD("17", "Torpedo", "Weapons Capability", SymbolSetEnum.SEA_SURFACE),
    LRST_MOD("21", "Ballistic Missile Defense, Long-Range Surveillance and Track (LRST)", "Mission Area", SymbolSetEnum.SEA_SURFACE),
    SEA_BASED_X_MOD("22", "Sea-Base X-Band", "Mission Area", SymbolSetEnum.SEA_SURFACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    SeaSurfaceSectorOneModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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