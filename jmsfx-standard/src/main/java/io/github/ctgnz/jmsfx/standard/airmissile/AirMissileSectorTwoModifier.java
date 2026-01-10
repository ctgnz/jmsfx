package io.github.ctgnz.jmsfx.standard.airmissile;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum AirMissileSectorTwoModifier implements SectorTwoModifier {
    AIR_DEST("01", "Air", ModifierCategory.MissileDestination),
    SURFACE_DEST("02", "Surface", ModifierCategory.MissileDestination),
    SUB_DEST("03", "Subsurface", ModifierCategory.MissileDestination),
    SPACE_DEST("04", "Space", ModifierCategory.MissileDestination),
    LAUNCHED("05", "Launched", ModifierCategory.MissileStatus),
    PATRIOT("07", "Patriot", ModifierCategory.MissileType),
    SM2("08", "Standard Missile-2 (SM-2)", ModifierCategory.MissileType),
    SM6("09", "Standard Missile-6 (SM-6)", ModifierCategory.MissileType),
    ESSM("10", "Evolved Sea Sparrow Missile (ESSM)", ModifierCategory.MissileType),
    RAM("11", "Rolling Airframe Missile (RAM)", ModifierCategory.MissileType),
    SHORT("12", "Short Range", ModifierCategory.MissileRange),
    MED("13", "Medium Range", ModifierCategory.MissileRange),
    INTER("14", "Intermediate Range", ModifierCategory.MissileRange),
    LONG("15", "Long Range", ModifierCategory.MissileRange),
    INTERCONT("16", "Intercontinental", ModifierCategory.MissileRange);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    AirMissileSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.AIR_MISSILE;
    }

}