package io.github.ctgnz.jmsfx.standard.landinstallation;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandInstallationSectorTwoModifier implements SectorTwoModifier {
    BIOLOGICAL("01", "Biological", ModifierCategory.None, SymbolSetEnum.LAND_INSTALLATION),
    CHEMICAL("02", "Chemical", ModifierCategory.None, SymbolSetEnum.LAND_INSTALLATION),
    NUCLEAR("03", "Nuclear", ModifierCategory.None, SymbolSetEnum.LAND_INSTALLATION),
    RADIOLOGICAL("04", "Radiological", ModifierCategory.None, SymbolSetEnum.LAND_INSTALLATION),
    ATOMIC_ENERGY_REACTOR("05", "Atomic Energy Reactor", ModifierCategory.None, SymbolSetEnum.LAND_INSTALLATION),
    NUCLEAR_MATERIAL_PRODUCTION("06", "Nuclear Material Production", ModifierCategory.None, SymbolSetEnum.LAND_INSTALLATION),
    NUCLEAR_MATERIAL_STORAGE("07", "Nuclear Material Storage", ModifierCategory.None, SymbolSetEnum.LAND_INSTALLATION),
    WEAPONS_GRADE("08", "Weapons Grade", ModifierCategory.None, SymbolSetEnum.LAND_INSTALLATION);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    LandInstallationSectorTwoModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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