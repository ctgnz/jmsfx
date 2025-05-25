package nz.co.ctg.jmsfx.model.activity;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum ActivitySectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.ACTIVITY),
    HOUSE_TO_HOUSE_MOD("04", "House-to-House", "Psychological Operations", SymbolSet.ACTIVITY),
    MURDER_MOD("06", "Murder", "Crime", SymbolSet.ACTIVITY),
    WRITTEN_PSYCHOLOGICAL_OPERATIONS_MOD("09", "Written Psychological Operations", "Psychological Operations", SymbolSet.ACTIVITY),
    PIRATE_MOD("10", "Pirate", "Crime", SymbolSet.ACTIVITY),
    FALSE_MOD("11", "False", "IED Category", SymbolSet.ACTIVITY),
    FIND_MOD("12", "Find", "IED Category", SymbolSet.ACTIVITY),
    FOUND_AND_CLEARED_MOD("13", "Found and Cleared", "IED Category", SymbolSet.ACTIVITY),
    HOAX_DECOY_MOD("14", "Hoax (Decoy)", "IED Category", SymbolSet.ACTIVITY),
    ATTEMPTED_MOD("15", "Attempted", "Incident Qualifier", SymbolSet.ACTIVITY),
    INCIDENT_MOD("17", "Incident", "Incident Qualifier", SymbolSet.ACTIVITY),
    THEFT_MOD("18", "Theft", "Crime", SymbolSet.ACTIVITY),
    EVICTION_MOD("21", "Eviction", "Crime", SymbolSet.ACTIVITY),
    RAID_MOD("22", "Raid", "Crime", SymbolSet.ACTIVITY);

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