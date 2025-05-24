package nz.co.ctg.jmsfx.model.cyberspacedismountedindividual;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum CyberspaceDismountedIndividualSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.SS_CYBERSPACE_DISMOUNTED),
    DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", "General", SymbolSet.SS_CYBERSPACE_DISMOUNTED),
    OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", "General", SymbolSet.SS_CYBERSPACE_DISMOUNTED),
    RESPONSE_ACTIONS("03", "Response Actions", "General", SymbolSet.SS_CYBERSPACE_DISMOUNTED),
    EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", "General", SymbolSet.SS_CYBERSPACE_DISMOUNTED),
    INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", "General", SymbolSet.SS_CYBERSPACE_DISMOUNTED),
    SOCIAL("06", "Social", "General", SymbolSet.SS_CYBERSPACE_DISMOUNTED),
    WIRED("07", "Wired", "General", SymbolSet.SS_CYBERSPACE_DISMOUNTED),
    RADIO_FREQUENCY("08", "Radio Frequency", "General", SymbolSet.SS_CYBERSPACE_DISMOUNTED),
    OPERATING_SYSTEM("09", "Operating System", "General", SymbolSet.SS_CYBERSPACE_DISMOUNTED);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private CyberspaceDismountedIndividualSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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