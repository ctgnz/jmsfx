package nz.co.ctg.jmsfx.model.seasubsurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SeaSubsurfaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_SEA_SUBSURFACE),
    AUXILIARY_MOD("02", "Auxiliary", SymbolSet.SS_SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_LOW_1_MOD("13", "Possible Submarine Low 1", SymbolSet.SS_SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_LOW_2_MOD("14", "Possible Submarine Low 2", SymbolSet.SS_SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_HIGH_3_MOD("15", "Possible Submarine High 3", SymbolSet.SS_SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_HIGH_4_MOD("16", "Possible Submarine High 4", SymbolSet.SS_SEA_SUBSURFACE),
    PROBABLE_SUBMARINE_MOD("17", "Probable Submarine", SymbolSet.SS_SEA_SUBSURFACE),
    CERTAIN_SUBMARINE_MOD("18", "Certain Submarine", SymbolSet.SS_SEA_SUBSURFACE),
    ANTI_TORPEDO_TORPEDO_MOD("19", "Anti-torpedo Torpedo", SymbolSet.SS_SEA_SUBSURFACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SeaSubsurfaceSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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