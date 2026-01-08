package io.github.ctgnz.jmsfx.standard.cyberspacelandinstallation;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum CyberspaceLandInstallationSectorTwoModifier implements SectorTwoModifier {
    SECURED("01", "Secured", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_LAND_INSTALLATION),
    OPEN("02", "Open", ModifierCategory.None, SymbolSetEnum.CYBERSPACE_LAND_INSTALLATION);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    CyberspaceLandInstallationSectorTwoModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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