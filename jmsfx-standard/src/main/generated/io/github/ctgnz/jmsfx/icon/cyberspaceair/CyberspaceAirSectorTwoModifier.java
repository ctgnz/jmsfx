package io.github.ctgnz.jmsfx.icon.cyberspaceair;

import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum CyberspaceAirSectorTwoModifier implements ISectorTwoModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.CYBERSPACE_AIR),
    SECURED_MOD("01", "Secured", "General", SymbolSet.CYBERSPACE_AIR),
    OPEN_MOD("02", "Open", "General", SymbolSet.CYBERSPACE_AIR);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    CyberspaceAirSectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
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
        return SymbolSet.CYBERSPACE;
    }

}