package io.github.ctgnz.jmsfx.standard.airmissile;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum AirMissileSectorOneModifier implements SectorOneModifier {
    AIR("01", "Air", ModifierCategory.LaunchOrigin, SymbolSetEnum.AIR_MISSILE),
    SURFACE("02", "Surface", ModifierCategory.LaunchOrigin, SymbolSetEnum.AIR_MISSILE),
    SUB("03", "Subsurface", ModifierCategory.LaunchOrigin, SymbolSetEnum.AIR_MISSILE),
    SPACE("04", "Space", ModifierCategory.LaunchOrigin, SymbolSetEnum.AIR_MISSILE),
    AB("05", "Anti-Ballistic", ModifierCategory.MissileClass, SymbolSetEnum.AIR_MISSILE),
    BALLISTIC("06", "Ballistic", ModifierCategory.MissileClass, SymbolSetEnum.AIR_MISSILE),
    CRUISE("07", "Cruise", ModifierCategory.MissileClass, SymbolSetEnum.AIR_MISSILE),
    INTERCEPTOR("08", "Interceptor", ModifierCategory.MissileClass, SymbolSetEnum.AIR_MISSILE),
    HYPERSONIC("09", "Interceptor", ModifierCategory.MissileClass, SymbolSetEnum.AIR_MISSILE);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    AirMissileSectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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