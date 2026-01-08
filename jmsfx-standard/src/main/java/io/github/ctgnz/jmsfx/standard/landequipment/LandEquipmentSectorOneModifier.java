package io.github.ctgnz.jmsfx.standard.landequipment;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandEquipmentSectorOneModifier implements SectorOneModifier {
    EARLY_WARNING_RADAR("03", "Early Warning Radar", ModifierCategory.SensorType, SymbolSetEnum.LAND_EQUIPMENT),
    INTRUSION("04", "Intrusion", ModifierCategory.SensorType, SymbolSetEnum.LAND_EQUIPMENT),
    UPGRADED_EARLY_WARNING_RADAR("07", "Upgraded Early Warning Radar", ModifierCategory.SensorType, SymbolSetEnum.LAND_EQUIPMENT),
    MULTI_PURPOSE_BLADE("12", "Multi Purpose Blade", ModifierCategory.EngineerEquipment, SymbolSetEnum.LAND_EQUIPMENT),
    TANK_WIDTH_MINE_PLOW("13", "Tank Width Mine Plow", ModifierCategory.EngineerEquipment, SymbolSetEnum.LAND_EQUIPMENT);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    LandEquipmentSectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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