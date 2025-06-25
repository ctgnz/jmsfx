package io.github.ctgnz.jmsfx.icon.airmissile;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum AirMissileSectorTwoModifier implements SectorTwoModifier {
    AIR_DEST_MOD("01", "Air", "Missile Destination", SymbolSetEnum.AIR_MISSILE),
    SURFACE_DEST_MOD("02", "Surface", "Missile Destination", SymbolSetEnum.AIR_MISSILE),
    SUB_DEST_MOD("03", "Subsurface", "Missile Destination", SymbolSetEnum.AIR_MISSILE),
    SPACE_DEST_MOD("04", "Space", "Missile Destination", SymbolSetEnum.AIR_MISSILE),
    LAUNCHED_MOD("05", "Launched", "Missile Status", SymbolSetEnum.AIR_MISSILE),
    PATRIOT_MOD("07", "Patriot", "Missile Type-BMD", SymbolSetEnum.AIR_MISSILE),
    SM2_MOD("08", "Standard Missile-2 (SM-2)", "Missile Type-AAW", SymbolSetEnum.AIR_MISSILE),
    SM6_MOD("09", "Standard Missile-6 (SM-6)", "Missile Type-AAW", SymbolSetEnum.AIR_MISSILE),
    ESSM_MOD("10", "Evolved Sea Sparrow Missile (ESSM)", "Missile Type-AAW", SymbolSetEnum.AIR_MISSILE),
    RAM_MOD("11", "Rolling Airframe Missile (RAM)", "Missile Type-AAW", SymbolSetEnum.AIR_MISSILE),
    SHORT_MOD("12", "Short Range", "Missile Range", SymbolSetEnum.AIR_MISSILE),
    MED_MOD("13", "Medium Range", "Missile Range", SymbolSetEnum.AIR_MISSILE),
    INTER_MOD("14", "Intermediate Range", "Missile Range", SymbolSetEnum.AIR_MISSILE),
    LONG_MOD("15", "Long Range", "Missile Range", SymbolSetEnum.AIR_MISSILE),
    INTERCONT_MOD("16", "Intercontinental", "Missile Range", SymbolSetEnum.AIR_MISSILE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    AirMissileSectorTwoModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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