package nz.co.ctg.jmsfx.model.activity;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum ActivitySectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_ACTIVITY),
    ASSASSINATION_MOD("01", "Assassination", SymbolSet.SS_ACTIVITY),
    EXECUTION_WRONGFUL_KILLING_MOD("02", "Execution (Wrongful Killing)", SymbolSet.SS_ACTIVITY),
    HIJACKING_MOD("03", "Hijacking/Hijacked", SymbolSet.SS_ACTIVITY),
    HOUSE_TO_HOUSE_MOD("04", "House-to-House", SymbolSet.SS_ACTIVITY),
    KIDNAPPING_MOD("05", "Kidnapping", SymbolSet.SS_ACTIVITY),
    MURDER_MOD("06", "Murder", SymbolSet.SS_ACTIVITY),
    PIRACY_MOD("07", "Piracy", SymbolSet.SS_ACTIVITY),
    RAPE_MOD("08", "Rape", SymbolSet.SS_ACTIVITY),
    WRITTEN_PSYCHOLOGICAL_OPERATIONS_MOD("09", "Written Psychological Operations", SymbolSet.SS_ACTIVITY),
    PIRATE_MOD("10", "Pirate", SymbolSet.SS_ACTIVITY),
    FALSE_MOD("11", "False", SymbolSet.SS_ACTIVITY),
    FIND_MOD("12", "Find", SymbolSet.SS_ACTIVITY),
    FOUND_AND_CLEARED_MOD("13", "Found and Cleared", SymbolSet.SS_ACTIVITY),
    HOAX_DECOY_MOD("14", "Hoax (Decoy)", SymbolSet.SS_ACTIVITY),
    ATTEMPTED_MOD("15", "Attempted", SymbolSet.SS_ACTIVITY),
    ACCIDENT_MOD("16", "Accident", SymbolSet.SS_ACTIVITY),
    INCIDENT_MOD("17", "Incident", SymbolSet.SS_ACTIVITY),
    THEFT_MOD("18", "Theft", SymbolSet.SS_ACTIVITY);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private ActivitySectorOneModifier(String id, String label, SymbolSet symbolSet) {
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