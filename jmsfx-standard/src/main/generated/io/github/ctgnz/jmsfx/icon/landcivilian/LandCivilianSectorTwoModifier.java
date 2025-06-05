package io.github.ctgnz.jmsfx.icon.landcivilian;

import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum LandCivilianSectorTwoModifier implements ISectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", "General", SymbolSet.LAND_CIVILIAN),
    LEADER_2_MOD("01", "Leader or Leadership", "Organization", SymbolSet.LAND_CIVILIAN);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    LandCivilianSectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
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