package io.github.ctgnz.jmsfx.standard.landinstallation;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandInstallationSectorTwoModifier implements SectorTwoModifier {
    BIOLOGICAL("01", "Biological", ModifierCategory.None),
    CHEMICAL("02", "Chemical", ModifierCategory.None),
    NUCLEAR("03", "Nuclear", ModifierCategory.None),
    RADIOLOGICAL("04", "Radiological", ModifierCategory.None),
    ATOMIC_ENERGY_REACTOR("05", "Atomic Energy Reactor", ModifierCategory.None),
    NUCLEAR_MATERIAL_PRODUCTION("06", "Nuclear Material Production", ModifierCategory.None),
    NUCLEAR_MATERIAL_STORAGE("07", "Nuclear Material Storage", ModifierCategory.None),
    WEAPONS_GRADE("08", "Weapons Grade", ModifierCategory.None);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandInstallationSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.LAND_INSTALLATION;
    }

}