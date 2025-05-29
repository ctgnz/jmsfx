package io.github.ctgnz.jmsfx.icon.seasubsurface;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SectorOneModifier;

public enum SeaSubsurfaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.SEA_SUBSURFACE),
    AUXILIARY_MOD("02", "Auxiliary", "Mission Area", SymbolSet.SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_LOW_1_MOD("13", "Possible Submarine Low 1", "Submarine Confidence", SymbolSet.SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_LOW_2_MOD("14", "Possible Submarine Low 2", "Submarine Confidence", SymbolSet.SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_HIGH_3_MOD("15", "Possible Submarine High 3", "Submarine Confidence", SymbolSet.SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_HIGH_4_MOD("16", "Possible Submarine High 4", "Submarine Confidence", SymbolSet.SEA_SUBSURFACE),
    PROBABLE_SUBMARINE_MOD("17", "Probable Submarine", "Submarine Confidence", SymbolSet.SEA_SUBSURFACE),
    CERTAIN_SUBMARINE_MOD("18", "Certain Submarine", "Submarine Confidence", SymbolSet.SEA_SUBSURFACE),
    ANTI_TORPEDO_TORPEDO_MOD("19", "Anti-torpedo Torpedo", "Weapons Capability", SymbolSet.SEA_SUBSURFACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private SeaSubsurfaceSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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