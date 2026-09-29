package io.github.ctgnz.jmsfx.battleorder.seasurface;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum SeaSurfaceSectorTwoModifier implements SectorTwoModifier {
        NUCLEAR("01", "Nuclear Powered", ModifierCategory.ShipPropulsion) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"80\" id=\"N\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 278 505.25)\">N</text>\n  </g>";
            }
        },
        DOCK("05", "Dock", ModifierCategory.CargoCapacity) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"80\" id=\"D\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 283 507.25)\">D</text>\n  </g>";
            }
        },
        LOGISTICS("06", "Logistics", ModifierCategory.CargoCapacity) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"60\" id=\"LOG\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 242 491.8066)\">LOG</text>\n  </g>";
            }
        },
        TANK("07", "Tank", ModifierCategory.CargoCapacity) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"80\" id=\"T\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 283 507.25)\">T</text>\n  </g>";
            }
        },
        VEHICLE("08", "Vehicle", ModifierCategory.CargoCapacity) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"80\" id=\"V\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 278 507.25)\">V</text>\n  </g>";
            }
        },
        FAST("09", "Fast", ModifierCategory.ShipMobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"80\" id=\"F\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 285 507.25)\">F</text>\n  </g>";
            }
        },
        COMBINE_GEV("10", "Air-Cushioned (US)", ModifierCategory.ShipMobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"72\" id=\"AC\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 261 499.25)\">AC</text>\n  </g>";
            }
        },
        PANEURO_GEV("11", "Air-Cushioned (NATO)", ModifierCategory.ShipMobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"90\" id=\"J\" opacity=\"0.86\" transform=\"matrix(1 0 0 1 284 511.25)\">J</text>\n  </g>";
            }
        },
        HYDROFOIL("12", "Hydrofoil", ModifierCategory.ShipMobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"80\" id=\"K\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 276 505.25)\">K</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    SeaSurfaceSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.SEA_SURFACE;
    }

}