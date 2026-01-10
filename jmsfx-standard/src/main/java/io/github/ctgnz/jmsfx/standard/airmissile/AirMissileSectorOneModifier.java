package io.github.ctgnz.jmsfx.standard.airmissile;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum AirMissileSectorOneModifier implements SectorOneModifier {
    AIR("01", "Air", ModifierCategory.LaunchOrigin),
    SURFACE("02", "Surface", ModifierCategory.LaunchOrigin),
    SUB("03", "Subsurface", ModifierCategory.LaunchOrigin),
    SPACE("04", "Space", ModifierCategory.LaunchOrigin),
    AB("05", "Anti-Ballistic", ModifierCategory.MissileClass),
    BALLISTIC("06", "Ballistic", ModifierCategory.MissileClass),
    CRUISE("07", "Cruise", ModifierCategory.MissileClass),
    INTERCEPTOR("08", "Interceptor", ModifierCategory.MissileClass),
    HYPERSONIC("09", "Interceptor", ModifierCategory.MissileClass);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    AirMissileSectorOneModifier(String id, String label, ModifierCategory category) {
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