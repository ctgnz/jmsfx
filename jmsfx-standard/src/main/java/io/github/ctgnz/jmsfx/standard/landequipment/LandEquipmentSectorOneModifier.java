package io.github.ctgnz.jmsfx.standard.landequipment;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandEquipmentSectorOneModifier implements SectorOneModifier {
    EARLY_WARNING_RADAR("03", "Early Warning Radar", ModifierCategory.SensorType),
    INTRUSION("04", "Intrusion", ModifierCategory.SensorType),
    UPGRADED_EARLY_WARNING_RADAR("07", "Upgraded Early Warning Radar", ModifierCategory.SensorType),
    MULTI_PURPOSE_BLADE("12", "Multi Purpose Blade", ModifierCategory.EngineerEquipment),
    TANK_WIDTH_MINE_PLOW("13", "Tank Width Mine Plow", ModifierCategory.EngineerEquipment);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandEquipmentSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.LAND_EQUIPMENT;
    }

}