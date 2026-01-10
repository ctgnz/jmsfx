package io.github.ctgnz.jmsfx.standard.space;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum SpaceSectorOneModifier implements SectorOneModifier {
    LEO("01", "Low Earth Orbit (LEO)", ModifierCategory.Orbit),
    MEO("02", "Medium Earth Orbit (MEO)", ModifierCategory.Orbit),
    HEO("03", "High Earth Orbit (HEO)", ModifierCategory.Orbit),
    GSO("04", "Geosynchronous Orbit (GSO)", ModifierCategory.Orbit),
    GEO("05", "Geostationary Orbit (GEO)", ModifierCategory.Orbit),
    MO("06", "Molniya Orbit (MO)", ModifierCategory.Orbit);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    SpaceSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.SPACE;
    }

}