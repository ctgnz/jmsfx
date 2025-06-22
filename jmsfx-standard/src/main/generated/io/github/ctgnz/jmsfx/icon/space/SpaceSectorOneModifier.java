package io.github.ctgnz.jmsfx.icon.space;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum SpaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSetEnum.SPACE),
    LEO_MOD("01", "Low Earth Orbit (LEO)", "Orbit", SymbolSetEnum.SPACE),
    MEO_MOD("02", "Medium Earth Orbit (MEO)", "Orbit", SymbolSetEnum.SPACE),
    HEO_MOD("03", "High Earth Orbit (HEO)", "Orbit", SymbolSetEnum.SPACE),
    GSO_MOD("04", "Geosynchronous Orbit (GSO)", "Orbit", SymbolSetEnum.SPACE),
    GEO_MOD("05", "Geostationary Orbit (GEO)", "Orbit", SymbolSetEnum.SPACE),
    MO_MOD("06", "Molniya Orbit (MO)", "Orbit", SymbolSetEnum.SPACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    SpaceSectorOneModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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