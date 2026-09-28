package io.github.ctgnz.jmsfx.historical.landinstallation;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.ModifierBounds;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum LandInstallationSectorTwoModifier implements SectorTwoModifier {
        BIOLOGICAL("01", "Biological", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"B\" transform=\"matrix(1 0 0 1 277 505.25)\">B</text>\n  </g>";
            }
        },
        CHEMICAL("02", "Chemical", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"C\" transform=\"matrix(1 0 0 1 277 505.25)\">C</text>\n  </g>";
            }
        },
        NUCLEAR("03", "Nuclear", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"N\" transform=\"matrix(1 0 0 1 277 505.25)\">N</text>\n  </g>";
            }
        },
        RADIOLOGICAL("04", "Radiological", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"R\" transform=\"matrix(1 0 0 1 277 505.25)\">R</text>\n  </g>";
            }
        },
        ATOMIC_ENERGY_REACTOR("05", "Atomic Energy Reactor", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-36.89017,-10)\">\n    <text font-family=\"sans-serif\" font-size=\"64px\" id=\"A\" transform=\"translate(277.0005,504.5557)\">AER</text>\n  </g>";
            }
        },
        NUCLEAR_MATERIAL_PRODUCTION("06", "Nuclear Material Production", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"P\" transform=\"matrix(1 0 0 1 285.0005 505.5557)\">P</text>\n  </g>";
            }
        },
        NUCLEAR_MATERIAL_STORAGE("07", "Nuclear Material Storage", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"S\" transform=\"matrix(1 0 0 1 278.0005 506.5557)\">S</text>\n  </g>";
            }
        },
        WEAPONS_GRADE("08", "Weapons Grade", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-30.647886,-13.5389)\">\n    <text font-family=\"sans-serif\" font-size=\"58px\" id=\"W\" transform=\"matrix(1.004,0,0,1,269.0005,504.4707)\">WPN</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandInstallationSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.LAND_INSTALLATION;
    }

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}