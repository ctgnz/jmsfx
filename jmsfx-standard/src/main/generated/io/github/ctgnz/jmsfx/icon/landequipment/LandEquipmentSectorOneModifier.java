package io.github.ctgnz.jmsfx.icon.landequipment;

import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum LandEquipmentSectorOneModifier implements ISectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.LAND_EQUIPMENT),
    EARLY_WARNING_RADAR_MOD("03", "Early Warning Radar", "Sensor Type", SymbolSet.LAND_EQUIPMENT),
    INTRUSION_MOD("04", "Intrusion", "Sensor Type", SymbolSet.LAND_EQUIPMENT),
    UPGRADED_EARLY_WARNING_RADAR_MOD("07", "Upgraded Early Warning Radar", "Sensor Type", SymbolSet.LAND_EQUIPMENT),
    MULTI_PURPOSE_BLADE_MOD("12", "Multi Purpose Blade", "Engineer Equipment", SymbolSet.LAND_EQUIPMENT),
    TANK_WIDTH_MINE_PLOW_MOD("13", "Tank Width Mine Plow", "Engineer Equipment", SymbolSet.LAND_EQUIPMENT);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    LandEquipmentSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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