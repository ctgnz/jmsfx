package io.github.ctgnz.jmsfx.standard.landinstallation;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandInstallationSectorOneModifier implements SectorOneModifier {
    COAL("06", "Coal", ModifierCategory.ElectricPowerType, SymbolSetEnum.LAND_INSTALLATION),
    GEOTHERMAL("07", "Geothermal", ModifierCategory.ElectricPowerType, SymbolSetEnum.LAND_INSTALLATION),
    HYDROELECTRIC("08", "Hydroelectric", ModifierCategory.ElectricPowerType, SymbolSetEnum.LAND_INSTALLATION),
    NATURAL_GAS("09", "Natural Gas", ModifierCategory.ElectricPowerType, SymbolSetEnum.LAND_INSTALLATION),
    CIVILIAN_TELEPHONE("12", "Civilian Telephone", ModifierCategory.CivilianTelecommunicationsType, SymbolSetEnum.LAND_INSTALLATION),
    CIVILIAN_TELEVISION("13", "Civilian Television", ModifierCategory.CivilianTelecommunicationsType, SymbolSetEnum.LAND_INSTALLATION);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    LandInstallationSectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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