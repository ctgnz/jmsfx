package io.github.ctgnz.jmsfx.icon.landinstallation;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum LandInstallationSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSetEnum.LAND_INSTALLATION),
    COAL_MOD("06", "Coal", "Electric Power Type", SymbolSetEnum.LAND_INSTALLATION),
    GEOTHERMAL_MOD("07", "Geothermal", "Electric Power Type", SymbolSetEnum.LAND_INSTALLATION),
    HYDROELECTRIC_MOD("08", "Hydroelectric", "Electric Power Type", SymbolSetEnum.LAND_INSTALLATION),
    NATURAL_GAS_MOD("09", "Natural Gas", "Electric Power Type", SymbolSetEnum.LAND_INSTALLATION),
    CIVILIAN_TELEPHONE_MOD("12", "Civilian Telephone", "Civilian Telecommunications Type", SymbolSetEnum.LAND_INSTALLATION),
    CIVILIAN_TELEVISION_MOD("13", "Civilian Television", "Civilian Telecommunications Type", SymbolSetEnum.LAND_INSTALLATION);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    LandInstallationSectorOneModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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