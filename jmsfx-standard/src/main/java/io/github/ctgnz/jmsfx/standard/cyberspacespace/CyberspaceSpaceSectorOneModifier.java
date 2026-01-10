package io.github.ctgnz.jmsfx.standard.cyberspacespace;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum CyberspaceSpaceSectorOneModifier implements SectorOneModifier {
    DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", ModifierCategory.None),
    OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", ModifierCategory.None),
    RESPONSE_ACTIONS("03", "Response Actions", ModifierCategory.None),
    EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", ModifierCategory.None),
    INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", ModifierCategory.None),
    SOCIAL("06", "Social", ModifierCategory.None),
    WIRED("07", "Wired", ModifierCategory.None),
    RADIO_FREQUENCY("08", "Radio Frequency", ModifierCategory.None),
    OPERATING_SYSTEM("09", "Operating System", ModifierCategory.None);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    CyberspaceSpaceSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.CYBERSPACE_SPACE;
    }

    @Override
    public SymbolSet getBaseSymbolSet() {
        return SymbolSetEnum.CYBERSPACE;
    }

}