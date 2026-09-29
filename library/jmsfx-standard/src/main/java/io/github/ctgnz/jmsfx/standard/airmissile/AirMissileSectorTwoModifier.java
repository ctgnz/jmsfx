package io.github.ctgnz.jmsfx.standard.airmissile;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum AirMissileSectorTwoModifier implements SectorTwoModifier {
        AIR_DEST("01", "Air", ModifierCategory.MissileDestination) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"A\" transform=\"matrix(1 0 0 1 359.7949 416.5166)\">A</text>\n  </g>";
            }
        },
        SURFACE_DEST("02", "Surface", ModifierCategory.MissileDestination) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"S\" transform=\"matrix(1 0 0 1 359.7949 416.5166)\">S</text>\n  </g>";
            }
        },
        SUB_DEST("03", "Subsurface", ModifierCategory.MissileDestination) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 355.75 446.3164)\">U</text>\n    <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 356.75 389.9072)\">S</text>\n  </g>";
            }
        },
        SPACE_DEST("04", "Space", ModifierCategory.MissileDestination) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 356.75 389.9072)\">S</text>\n    <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 355.75 446.3164)\">P</text>\n  </g>";
            }
        },
        LAUNCHED("05", "Launched", ModifierCategory.MissileStatus) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"L\" transform=\"matrix(1 0 0 1 359.7949 416.5166)\">L</text>\n  </g>";
            }
        },
        PATRIOT("07", "Patriot", ModifierCategory.MissileType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"P\" transform=\"matrix(1 0 0 1 359.7949 422.5166)\">P</text>\n  </g>";
            }
        },
        SM2("08", "Standard Missile-2 (SM-2)", ModifierCategory.MissileType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 361.75 446.3164)\">2</text>\n    <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 356.75 389.9072)\">S</text>\n  </g>";
            }
        },
        SM6("09", "Standard Missile-6 (SM-6)", ModifierCategory.MissileType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 361.75 446.3164)\">6</text>\n    <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 356.75 389.9072)\">S</text>\n  </g>";
            }
        },
        ESSM("10", "Evolved Sea Sparrow Missile (ESSM)", ModifierCategory.MissileType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"75\" transform=\"matrix(1 0 0 1 359.75 446.3164)\">S</text>\n    <text font-family=\"sans-serif\" font-size=\"75\" transform=\"matrix(1 0 0 1 358.75 389.9072)\">S</text>\n  </g>";
            }
        },
        RAM("11", "Rolling Airframe Missile (RAM)", ModifierCategory.MissileType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"R\" transform=\"matrix(1 0 0 1 356.7949 422.5166)\">R</text>\n  </g>";
            }
        },
        SHORT("12", "Short Range", ModifierCategory.MissileRange) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"75\" transform=\"matrix(1 0 0 1 353.75 446.3164)\">R</text>\n    <text font-family=\"sans-serif\" font-size=\"75\" transform=\"matrix(1 0 0 1 354.75 389.9072)\">S</text>\n  </g>";
            }
        },
        MED("13", "Medium Range", ModifierCategory.MissileRange) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"68\" transform=\"matrix(1 0 0 1 356.75 447.3164)\">R</text>\n    <text font-family=\"sans-serif\" font-size=\"68\" transform=\"matrix(1 0 0 1 353.75 393.9072)\">M</text>\n  </g>";
            }
        },
        INTER("14", "Intermediate Range", ModifierCategory.MissileRange) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"68\" transform=\"matrix(1 0 0 1 355.75 447.3164)\">R</text>\n    <text font-family=\"sans-serif\" font-size=\"68\" transform=\"matrix(1 0 0 1 368.75 393.9072)\">I</text>\n  </g>";
            }
        },
        LONG("15", "Long Range", ModifierCategory.MissileRange) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 355.75 447.3164)\">R</text>\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 356.75 389.9072)\">L</text>\n  </g>";
            }
        },
        INTERCONT("16", "Intercontinental", ModifierCategory.MissileRange) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 355.75 447.3164)\">C</text>\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 371.75 389.9072)\">I</text>\n  </g>";
            }
        };

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
    public String getName() {
        return name();
    }

    @Override
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.AIR_MISSILE;
    }

}