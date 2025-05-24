package nz.co.ctg.jmsfx.model.activity;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum ActivitySectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.SS_ACTIVITY),
    HOUSE_TO_HOUSE_MOD("04", "House-to-House", "Psychological Operations", SymbolSet.SS_ACTIVITY),
    MURDER_MOD("06", "Murder", "Crime", SymbolSet.SS_ACTIVITY),
    WRITTEN_PSYCHOLOGICAL_OPERATIONS_MOD("09", "Written Psychological Operations", "Psychological Operations", SymbolSet.SS_ACTIVITY),
    PIRATE_MOD("10", "Pirate", "Crime", SymbolSet.SS_ACTIVITY),
    FALSE_MOD("11", "False", "IED Category", SymbolSet.SS_ACTIVITY),
    FIND_MOD("12", "Find", "IED Category", SymbolSet.SS_ACTIVITY),
    FOUND_AND_CLEARED_MOD("13", "Found and Cleared", "IED Category", SymbolSet.SS_ACTIVITY),
    HOAX_DECOY_MOD("14", "Hoax (Decoy)", "IED Category", SymbolSet.SS_ACTIVITY),
    ATTEMPTED_MOD("15", "Attempted", "Incident Qualifier", SymbolSet.SS_ACTIVITY),
    INCIDENT_MOD("17", "Incident", "Incident Qualifier", SymbolSet.SS_ACTIVITY),
    THEFT_MOD("18", "Theft", "Crime", SymbolSet.SS_ACTIVITY),
    EVICTION_MOD("21", "Eviction", "Crime", SymbolSet.SS_ACTIVITY),
    RAID_MOD("22", "Raid", "Crime", SymbolSet.SS_ACTIVITY);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private ActivitySectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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