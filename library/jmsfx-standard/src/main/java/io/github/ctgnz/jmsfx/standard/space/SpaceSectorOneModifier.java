package io.github.ctgnz.jmsfx.standard.space;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum SpaceSectorOneModifier implements SectorOneModifier {
        LEO("01", "Low Earth Orbit (LEO)", ModifierCategory.Orbit) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"62\" transform=\"matrix(1 0 0 1 246 343.5146)\">LEO</text>\n  </g>";
            }
        },
        MEO("02", "Medium Earth Orbit (MEO)", ModifierCategory.Orbit) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"62\" transform=\"matrix(1 0 0 1 241 344.5146)\">MEO</text>\n  </g>";
            }
        },
        HEO("03", "High Earth Orbit (HEO)", ModifierCategory.Orbit) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"62\" transform=\"matrix(1 0 0 1 241 344.5146)\">HEO</text>\n  </g>";
            }
        },
        GSO("04", "Geosynchronous Orbit (GSO)", ModifierCategory.Orbit) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"64\" transform=\"matrix(1 0 0 1 234 344.5146)\">GSO</text>\n  </g>";
            }
        },
        GEO("05", "Geostationary Orbit (GEO)", ModifierCategory.Orbit) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(0.75096)\">\n    <text font-family=\"sans-serif\" font-size=\"64px\" transform=\"translate(234,344.5146)\">GEO</text>\n  </g>";
            }
        },
        MO("06", "Molniya Orbit (MO)", ModifierCategory.Orbit) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1.0329 0 0 1 252.2549 345.0469)\">MO</text>\n  </g>";
            }
        };

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
    public String getName() {
        return name();
    }

    @Override
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.SPACE;
    }

}