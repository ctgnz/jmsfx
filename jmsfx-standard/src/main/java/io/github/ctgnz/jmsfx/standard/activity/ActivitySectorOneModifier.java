package io.github.ctgnz.jmsfx.standard.activity;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum ActivitySectorOneModifier implements SectorOneModifier {
    HOUSE_TO_HOUSE("04", "House-to-House", ModifierCategory.PsychologicalOperations, SymbolSetEnum.ACTIVITY),
    MURDER("06", "Murder", ModifierCategory.Crime, SymbolSetEnum.ACTIVITY),
    WRITTEN_PSYCHOLOGICAL_OPERATIONS("09", "Written Psychological Operations", ModifierCategory.PsychologicalOperations, SymbolSetEnum.ACTIVITY),
    PIRATE("10", "Pirate", ModifierCategory.Crime, SymbolSetEnum.ACTIVITY),
    FALSE("11", "False", ModifierCategory.IEDCategory, SymbolSetEnum.ACTIVITY),
    FIND("12", "Find", ModifierCategory.IEDCategory, SymbolSetEnum.ACTIVITY),
    FOUND_AND_CLEARED("13", "Found and Cleared", ModifierCategory.IEDCategory, SymbolSetEnum.ACTIVITY),
    HOAX_DECOY("14", "Hoax (Decoy)", ModifierCategory.IEDCategory, SymbolSetEnum.ACTIVITY),
    ATTEMPTED("15", "Attempted", ModifierCategory.IncidentQualifier, SymbolSetEnum.ACTIVITY),
    INCIDENT("17", "Incident", ModifierCategory.IncidentQualifier, SymbolSetEnum.ACTIVITY),
    THEFT("18", "Theft", ModifierCategory.Crime, SymbolSetEnum.ACTIVITY),
    EVICTION("21", "Eviction", ModifierCategory.Crime, SymbolSetEnum.ACTIVITY),
    RAID("22", "Raid", ModifierCategory.Crime, SymbolSetEnum.ACTIVITY);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    ActivitySectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
    }

    @Override
    public ModifierCategory getCategory() {
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