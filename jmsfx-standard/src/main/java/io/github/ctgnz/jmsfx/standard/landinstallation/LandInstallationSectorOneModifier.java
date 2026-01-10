package io.github.ctgnz.jmsfx.standard.landinstallation;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandInstallationSectorOneModifier implements SectorOneModifier {
    COAL("06", "Coal", ModifierCategory.ElectricPowerType),
    GEOTHERMAL("07", "Geothermal", ModifierCategory.ElectricPowerType),
    HYDROELECTRIC("08", "Hydroelectric", ModifierCategory.ElectricPowerType),
    NATURAL_GAS("09", "Natural Gas", ModifierCategory.ElectricPowerType),
    CIVILIAN_TELEPHONE("12", "Civilian Telephone", ModifierCategory.CivilianTelecommunicationsType),
    CIVILIAN_TELEVISION("13", "Civilian Television", ModifierCategory.CivilianTelecommunicationsType);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandInstallationSectorOneModifier(String id, String label, ModifierCategory category) {
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