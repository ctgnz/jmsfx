package io.github.ctgnz.jmsfx.standard.activity;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum ActivitySectorOneModifier implements SectorOneModifier {
    HOUSE_TO_HOUSE_MOD("04", "House-to-House", "Psychological Operations", SymbolSetEnum.ACTIVITY),
    MURDER_MOD("06", "Murder", "Crime", SymbolSetEnum.ACTIVITY),
    WRITTEN_PSYCHOLOGICAL_OPERATIONS_MOD("09", "Written Psychological Operations", "Psychological Operations", SymbolSetEnum.ACTIVITY),
    PIRATE_MOD("10", "Pirate", "Crime", SymbolSetEnum.ACTIVITY),
    FALSE_MOD("11", "False", "IED Category", SymbolSetEnum.ACTIVITY),
    FIND_MOD("12", "Find", "IED Category", SymbolSetEnum.ACTIVITY),
    FOUND_AND_CLEARED_MOD("13", "Found and Cleared", "IED Category", SymbolSetEnum.ACTIVITY),
    HOAX_DECOY_MOD("14", "Hoax (Decoy)", "IED Category", SymbolSetEnum.ACTIVITY),
    ATTEMPTED_MOD("15", "Attempted", "Incident Qualifier", SymbolSetEnum.ACTIVITY),
    INCIDENT_MOD("17", "Incident", "Incident Qualifier", SymbolSetEnum.ACTIVITY),
    THEFT_MOD("18", "Theft", "Crime", SymbolSetEnum.ACTIVITY),
    EVICTION_MOD("21", "Eviction", "Crime", SymbolSetEnum.ACTIVITY),
    RAID_MOD("22", "Raid", "Crime", SymbolSetEnum.ACTIVITY);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    ActivitySectorOneModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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