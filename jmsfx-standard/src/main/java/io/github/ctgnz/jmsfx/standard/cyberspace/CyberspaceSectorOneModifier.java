package io.github.ctgnz.jmsfx.standard.cyberspace;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum CyberspaceSectorOneModifier implements SectorOneModifier {
    DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", ModifierCategory.None, SymbolSetEnum.CYBERSPACE),
    OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", ModifierCategory.None, SymbolSetEnum.CYBERSPACE),
    RESPONSE_ACTIONS("03", "Response Actions", ModifierCategory.None, SymbolSetEnum.CYBERSPACE),
    EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", ModifierCategory.None, SymbolSetEnum.CYBERSPACE),
    INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", ModifierCategory.None, SymbolSetEnum.CYBERSPACE),
    SOCIAL("06", "Social", ModifierCategory.None, SymbolSetEnum.CYBERSPACE),
    WIRED("07", "Wired", ModifierCategory.None, SymbolSetEnum.CYBERSPACE),
    RADIO_FREQUENCY("08", "Radio Frequency", ModifierCategory.None, SymbolSetEnum.CYBERSPACE),
    OPERATING_SYSTEM("09", "Operating System", ModifierCategory.None, SymbolSetEnum.CYBERSPACE);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    CyberspaceSectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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