package nz.co.ctg.jmsfx.model.cyberspaceseasurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum CyberspaceSeaSurfaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.SS_CYBERSPACE_SEA_SURFACE),
    DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", "General", SymbolSet.SS_CYBERSPACE_SEA_SURFACE),
    OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", "General", SymbolSet.SS_CYBERSPACE_SEA_SURFACE),
    RESPONSE_ACTIONS("03", "Response Actions", "General", SymbolSet.SS_CYBERSPACE_SEA_SURFACE),
    EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", "General", SymbolSet.SS_CYBERSPACE_SEA_SURFACE),
    INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", "General", SymbolSet.SS_CYBERSPACE_SEA_SURFACE),
    SOCIAL("06", "Social", "General", SymbolSet.SS_CYBERSPACE_SEA_SURFACE),
    WIRED("07", "Wired", "General", SymbolSet.SS_CYBERSPACE_SEA_SURFACE),
    RADIO_FREQUENCY("08", "Radio Frequency", "General", SymbolSet.SS_CYBERSPACE_SEA_SURFACE),
    OPERATING_SYSTEM("09", "Operating System", "General", SymbolSet.SS_CYBERSPACE_SEA_SURFACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private CyberspaceSeaSurfaceSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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