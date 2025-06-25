package io.github.ctgnz.jmsfx.standard.landequipment;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandEquipmentSectorOneModifier implements SectorOneModifier {
    EARLY_WARNING_RADAR_MOD("03", "Early Warning Radar", "Sensor Type", SymbolSetEnum.LAND_EQUIPMENT),
    INTRUSION_MOD("04", "Intrusion", "Sensor Type", SymbolSetEnum.LAND_EQUIPMENT),
    UPGRADED_EARLY_WARNING_RADAR_MOD("07", "Upgraded Early Warning Radar", "Sensor Type", SymbolSetEnum.LAND_EQUIPMENT),
    MULTI_PURPOSE_BLADE_MOD("12", "Multi Purpose Blade", "Engineer Equipment", SymbolSetEnum.LAND_EQUIPMENT),
    TANK_WIDTH_MINE_PLOW_MOD("13", "Tank Width Mine Plow", "Engineer Equipment", SymbolSetEnum.LAND_EQUIPMENT);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    LandEquipmentSectorOneModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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