package io.github.ctgnz.jmsfx.standard.activity;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum ActivitySectorOneModifier implements SectorOneModifier {
    HOUSE_TO_HOUSE("04", "House-to-House", ModifierCategory.PsychologicalOperations),
    MURDER("06", "Murder", ModifierCategory.Crime),
    WRITTEN_PSYCHOLOGICAL_OPERATIONS("09", "Written Psychological Operations", ModifierCategory.PsychologicalOperations),
    PIRATE("10", "Pirate", ModifierCategory.Crime),
    FALSE("11", "False", ModifierCategory.IEDCategory),
    FIND("12", "Find", ModifierCategory.IEDCategory),
    FOUND_AND_CLEARED("13", "Found and Cleared", ModifierCategory.IEDCategory),
    HOAX_DECOY("14", "Hoax (Decoy)", ModifierCategory.IEDCategory),
    ATTEMPTED("15", "Attempted", ModifierCategory.IncidentQualifier),
    INCIDENT("17", "Incident", ModifierCategory.IncidentQualifier),
    THEFT("18", "Theft", ModifierCategory.Crime),
    EVICTION("21", "Eviction", ModifierCategory.Crime),
    RAID("22", "Raid", ModifierCategory.Crime);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    ActivitySectorOneModifier(String id, String label, ModifierCategory category) {
        this.id = id;
        this.label = label;
        this.category = category;
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
        return SymbolSetEnum.ACTIVITY;
    }

}