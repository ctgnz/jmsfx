package io.github.ctgnz.jmsfx.icon.cyberspacedismountedindividual;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum CyberspaceDismountedIndividualSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSetEnum.CYBERSPACE_DISMOUNTED),
    DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", "General", SymbolSetEnum.CYBERSPACE_DISMOUNTED),
    OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", "General", SymbolSetEnum.CYBERSPACE_DISMOUNTED),
    RESPONSE_ACTIONS("03", "Response Actions", "General", SymbolSetEnum.CYBERSPACE_DISMOUNTED),
    EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", "General", SymbolSetEnum.CYBERSPACE_DISMOUNTED),
    INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", "General", SymbolSetEnum.CYBERSPACE_DISMOUNTED),
    SOCIAL("06", "Social", "General", SymbolSetEnum.CYBERSPACE_DISMOUNTED),
    WIRED("07", "Wired", "General", SymbolSetEnum.CYBERSPACE_DISMOUNTED),
    RADIO_FREQUENCY("08", "Radio Frequency", "General", SymbolSetEnum.CYBERSPACE_DISMOUNTED),
    OPERATING_SYSTEM("09", "Operating System", "General", SymbolSetEnum.CYBERSPACE_DISMOUNTED);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    CyberspaceDismountedIndividualSectorOneModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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

    @Override
    public SymbolSet getBaseSymbolSet() {
        return SymbolSetEnum.CYBERSPACE;
    }

}