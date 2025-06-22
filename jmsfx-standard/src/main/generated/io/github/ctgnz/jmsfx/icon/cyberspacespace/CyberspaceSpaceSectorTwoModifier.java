package io.github.ctgnz.jmsfx.icon.cyberspacespace;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum CyberspaceSpaceSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSetEnum.CYBERSPACE_SPACE),
    SECURED_MOD("01", "Secured", "General", SymbolSetEnum.CYBERSPACE_SPACE),
    OPEN_MOD("02", "Open", "General", SymbolSetEnum.CYBERSPACE_SPACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    CyberspaceSpaceSectorTwoModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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