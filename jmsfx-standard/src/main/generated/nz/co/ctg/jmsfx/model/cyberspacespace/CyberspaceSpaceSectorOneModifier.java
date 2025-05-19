package nz.co.ctg.jmsfx.model.cyberspacespace;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum CyberspaceSpaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_CYBERSPACE_SPACE),
    DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", SymbolSet.SS_CYBERSPACE_SPACE),
    OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", SymbolSet.SS_CYBERSPACE_SPACE),
    RESPONSE_ACTIONS("03", "Response Actions", SymbolSet.SS_CYBERSPACE_SPACE),
    EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", SymbolSet.SS_CYBERSPACE_SPACE),
    INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", SymbolSet.SS_CYBERSPACE_SPACE),
    SOCIAL("06", "Social", SymbolSet.SS_CYBERSPACE_SPACE),
    WIRED("07", "Wired", SymbolSet.SS_CYBERSPACE_SPACE),
    RADIO_FREQUENCY("08", "Radio Frequency", SymbolSet.SS_CYBERSPACE_SPACE),
    OPERATING_SYSTEM("09", "Operating System", SymbolSet.SS_CYBERSPACE_SPACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private CyberspaceSpaceSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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