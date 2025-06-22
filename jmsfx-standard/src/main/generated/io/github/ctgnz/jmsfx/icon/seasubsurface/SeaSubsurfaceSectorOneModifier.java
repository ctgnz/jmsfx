package io.github.ctgnz.jmsfx.icon.seasubsurface;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum SeaSubsurfaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSetEnum.SEA_SUBSURFACE),
    AUXILIARY_MOD("02", "Auxiliary", "Mission Area", SymbolSetEnum.SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_LOW_1_MOD("13", "Possible Submarine Low 1", "Submarine Confidence", SymbolSetEnum.SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_LOW_2_MOD("14", "Possible Submarine Low 2", "Submarine Confidence", SymbolSetEnum.SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_HIGH_3_MOD("15", "Possible Submarine High 3", "Submarine Confidence", SymbolSetEnum.SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_HIGH_4_MOD("16", "Possible Submarine High 4", "Submarine Confidence", SymbolSetEnum.SEA_SUBSURFACE),
    PROBABLE_SUBMARINE_MOD("17", "Probable Submarine", "Submarine Confidence", SymbolSetEnum.SEA_SUBSURFACE),
    CERTAIN_SUBMARINE_MOD("18", "Certain Submarine", "Submarine Confidence", SymbolSetEnum.SEA_SUBSURFACE),
    ANTI_TORPEDO_TORPEDO_MOD("19", "Anti-torpedo Torpedo", "Weapons Capability", SymbolSetEnum.SEA_SUBSURFACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    SeaSubsurfaceSectorOneModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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