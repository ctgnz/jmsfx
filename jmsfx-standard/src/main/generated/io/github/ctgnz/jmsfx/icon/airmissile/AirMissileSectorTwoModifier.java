package io.github.ctgnz.jmsfx.icon.airmissile;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;

public enum AirMissileSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", "General", SymbolSet.AIR_MISSILE),
    AIR_DEST_MOD("01", "Air", "Missile Destination", SymbolSet.AIR_MISSILE),
    SURFACE_DEST_MOD("02", "Surface", "Missile Destination", SymbolSet.AIR_MISSILE),
    SUB_DEST_MOD("03", "Subsurface", "Missile Destination", SymbolSet.AIR_MISSILE),
    SPACE_DEST_MOD("04", "Space", "Missile Destination", SymbolSet.AIR_MISSILE),
    LAUNCHED_MOD("05", "Launched", "Missile Status", SymbolSet.AIR_MISSILE),
    PATRIOT_MOD("07", "Patriot", "Missile Type-BMD", SymbolSet.AIR_MISSILE),
    SM2_MOD("08", "Standard Missile-2 (SM-2)", "Missile Type-AAW", SymbolSet.AIR_MISSILE),
    SM6_MOD("09", "Standard Missile-6 (SM-6)", "Missile Type-AAW", SymbolSet.AIR_MISSILE),
    ESSM_MOD("10", "Evolved Sea Sparrow Missile (ESSM)", "Missile Type-AAW", SymbolSet.AIR_MISSILE),
    RAM_MOD("11", "Rolling Airframe Missile (RAM)", "Missile Type-AAW", SymbolSet.AIR_MISSILE),
    SHORT_MOD("12", "Short Range", "Missile Range", SymbolSet.AIR_MISSILE),
    MED_MOD("13", "Medium Range", "Missile Range", SymbolSet.AIR_MISSILE),
    INTER_MOD("14", "Intermediate Range", "Missile Range", SymbolSet.AIR_MISSILE),
    LONG_MOD("15", "Long Range", "Missile Range", SymbolSet.AIR_MISSILE),
    INTERCONT_MOD("16", "Intercontinental", "Missile Range", SymbolSet.AIR_MISSILE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private AirMissileSectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
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