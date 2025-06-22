package io.github.ctgnz.jmsfx.icon.landinstallation;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum LandInstallationSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", "General", SymbolSetEnum.LAND_INSTALLATION),
    BIOLOGICAL_2_MOD("01", "Biological", "No Category Listed", SymbolSetEnum.LAND_INSTALLATION),
    CHEMICAL_2_MOD("02", "Chemical", "No Category Listed", SymbolSetEnum.LAND_INSTALLATION),
    NUCLEAR_2_MOD("03", "Nuclear", "No Category Listed", SymbolSetEnum.LAND_INSTALLATION),
    RADIOLOGICAL_2_MOD("04", "Radiological", "No Category Listed", SymbolSetEnum.LAND_INSTALLATION),
    ATOMIC_ENERGY_REACTOR_MOD("05", "Atomic Energy Reactor", "No Category Listed", SymbolSetEnum.LAND_INSTALLATION),
    NUCLEAR_MATERIAL_PRODUCTION_MOD("06", "Nuclear Material Production", "No Category Listed", SymbolSetEnum.LAND_INSTALLATION),
    NUCLEAR_MATERIAL_STORAGE_MOD("07", "Nuclear Material Storage", "No Category Listed", SymbolSetEnum.LAND_INSTALLATION),
    WEAPONS_GRADE_MOD("08", "Weapons Grade", "No Category Listed", SymbolSetEnum.LAND_INSTALLATION);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    LandInstallationSectorTwoModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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