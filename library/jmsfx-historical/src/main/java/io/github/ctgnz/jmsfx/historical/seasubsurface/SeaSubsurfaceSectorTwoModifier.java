package io.github.ctgnz.jmsfx.historical.seasubsurface;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum SeaSubsurfaceSectorTwoModifier implements SectorTwoModifier {
        AIR_INDEPENDENT_PROPULSION("01", "Air Independent Propulsion", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"72\" id=\"AI\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 266 499.25)\">AI</text>\n  </g>";
            }
        },
        DIESEL_ELECTRIC_GENERAL("02", "Diesel Electric General", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"80\" id=\"D\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 283 507.25)\">D</text>\n  </g>";
            }
        },
        DIESEL___TYPE_1("03", "Diesel - Type 1", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"72\" id=\"D1\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 263 499.25)\">D1</text>\n  </g>";
            }
        },
        DIESEL___TYPE("04", "Diesel - Type 2", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"72\" id=\"D2\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 261 499.25)\">D2</text>\n  </g>";
            }
        },
        DIESEL___TYPE_3("05", "Diesel - Type 3", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"72\" id=\"D3\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 261 499.25)\">D3</text>\n  </g>";
            }
        },
        NUCLEAR_POWERED_GENERAL("06", "Nuclear Powered General", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"80\" id=\"N\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 278 505.25)\">N</text>\n  </g>";
            }
        },
        NUCLEAR___TYPE_1("07", "Nuclear - Type 1", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"72\" id=\"N1\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 264 499.25)\">N1</text>\n  </g>";
            }
        },
        NUCLEAR___TYPE("08", "Nuclear - Type 2", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"72\" id=\"N2\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 260 499.25)\">N2</text>\n  </g>";
            }
        },
        NUCLEAR___TYPE_3("09", "Nuclear - Type 3", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"72\" id=\"N3\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 260 499.25)\">N3</text>\n  </g>";
            }
        },
        NUCLEAR___TYPE_4("10", "Nuclear - Type 4", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"72\" id=\"N4\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 260 499.25)\">N4</text>\n  </g>";
            }
        },
        NUCLEAR___TYPE_5("11", "Nuclear - Type 5", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"72\" id=\"N5\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 260 499.25)\">N5</text>\n  </g>";
            }
        },
        NUCLEAR___TYPE_6("12", "Nuclear - Type 6", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"72\" id=\"N6\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 260 499.25)\">N6</text>\n  </g>";
            }
        },
        NUCLEAR___TYPE_7("13", "Nuclear - Type 7", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"72\" id=\"N7\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 260 499.25)\">N7</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    SeaSubsurfaceSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.SEA_SUBSURFACE;
    }

}