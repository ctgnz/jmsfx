package nz.co.ctg.jmsfx.model.cyberspace;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum CyberspaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_CYBERSPACE),
    DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", SymbolSet.SS_CYBERSPACE),
    OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", SymbolSet.SS_CYBERSPACE),
    RESPONSE_ACTIONS("03", "Response Actions", SymbolSet.SS_CYBERSPACE),
    EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", SymbolSet.SS_CYBERSPACE),
    INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", SymbolSet.SS_CYBERSPACE),
    SOCIAL("06", "Social", SymbolSet.SS_CYBERSPACE),
    WIRED("07", "Wired", SymbolSet.SS_CYBERSPACE),
    RADIO_FREQUENCY("08", "Radio Frequency", SymbolSet.SS_CYBERSPACE),
    OPERATING_SYSTEM("09", "Operating System", SymbolSet.SS_CYBERSPACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private CyberspaceSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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