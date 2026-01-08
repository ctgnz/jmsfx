package io.github.ctgnz.jmsfx.standard.cyberspaceseasubsurface;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum CyberspaceSeaSubsurfaceSectorOneModifier implements SectorOneModifier {
    DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE),
    OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE),
    RESPONSE_ACTIONS("03", "Response Actions", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE),
    EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE),
    INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE),
    SOCIAL("06", "Social", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE),
    WIRED("07", "Wired", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE),
    RADIO_FREQUENCY("08", "Radio Frequency", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE),
    OPERATING_SYSTEM("09", "Operating System", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    CyberspaceSeaSubsurfaceSectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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

    @Override
    public SymbolSet getBaseSymbolSet() {
        return SymbolSetEnum.CYBERSPACE;
    }

}