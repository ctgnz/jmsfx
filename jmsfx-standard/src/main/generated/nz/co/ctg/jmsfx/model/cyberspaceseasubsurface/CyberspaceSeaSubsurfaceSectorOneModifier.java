package nz.co.ctg.jmsfx.model.cyberspaceseasubsurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum CyberspaceSeaSubsurfaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE),
    DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE),
    OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE),
    RESPONSE_ACTIONS("03", "Response Actions", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE),
    EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE),
    INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE),
    SOCIAL("06", "Social", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE),
    WIRED("07", "Wired", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE),
    RADIO_FREQUENCY("08", "Radio Frequency", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE),
    OPERATING_SYSTEM("09", "Operating System", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private CyberspaceSeaSubsurfaceSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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