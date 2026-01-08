package io.github.ctgnz.jmsfx.standard.cyberspaceseasubsurface;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum CyberspaceSeaSubsurfaceSectorTwoModifier implements SectorTwoModifier {
    SECURED("01", "Secured", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE),
    OPEN("02", "Open", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    CyberspaceSeaSubsurfaceSectorTwoModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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