package io.github.ctgnz.jmsfx.standard.space;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.ModifierBounds;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum SpaceSectorTwoModifier implements SectorTwoModifier {
        OPTICAL("01", "Optical", ModifierCategory.SensorType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"85\" transform=\"matrix(1 0 0 1 272.0005 509.5557)\">O</text>\n  </g>";
            }
        },
        INFRARED("02", "Infrared", ModifierCategory.SensorType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1.0329 0 0 1 271.2549 498.0469)\">IR</text>\n  </g>";
            }
        },
        RADAR("03", "Radar", ModifierCategory.SensorType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(6.09978,159.84997)\">\n    <path d=\"M 305.269,343.25 C 281.925,343.25 260,318.313 260,294.969\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"267.384,316.463 302.249,296.933 302.387,323.5 338.875,298.125\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        SIGINT("04", "Signals Intelligence (SIGINT)", ModifierCategory.SensorType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1.0329 0 0 1 269.2549 500.0469)\">SI</text>\n  </g>";
            }
        },
        ELECTRONIC_WARFARE("06", "Electronic Warfare (ASAT)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-15.57865,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"64px\" transform=\"matrix(1.0329,0,0,1,269.2549,500.0469)\">EW</text>\n  </g>";
            }
        },
        HIGH_POWER_MICROWAVE("07", "High Power Microwave (ASAT)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-18.72328,-8)\">\n    <text font-family=\"sans-serif\" font-size=\"48px\" transform=\"matrix(1.0329,0,0,1,269.2549,500.0469)\">HPM</text>\n  </g>";
            }
        },
        LASER("08", "Laser (ASAT)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"matrix(0,0.66,-0.66,0,565.49471,266.8758)\">\n    <g transform=\"matrix(5,0,0,5,170,108)\">\n      <path d=\"M 28.924,69.115 C 28.158,68.954 27.391,68.821 26.625,68.712 V 60.088 C 26.047,59.98 24.484,59.739 21.937,59.363 l -0.506,-1.129 7.055,-1.614 -6.848,-1.449 0.01,-1.267 7.271,-1.777 c -0.67,-0.108 -1.436,-0.214 -2.295,-0.322 v -13.25 c -0.96,0.646 -2.235,1.534 -3.821,2.665 L 21,40.731 27.191,36.65 33.24,40.731 31.496,41.303 27.5,38.475 v 12.007 l 5.125,0.966 -0.006,1.21 -7.318,1.646 7.324,1.703 v 1.205 l -6.873,1.365 c 0.484,0.055 1.068,0.136 1.748,0.241 v 8.599 l 5.137,1.026 -0.012,1.295 -7.012,1.519 7.008,1.495 0.004,1.188 -7.16,1.696 6.84,1.433 -0.072,0.956 -10.585,-1.822 -0.004,-1.238 7.264,-1.578 -7.26,-1.547 0.01,-1.152 z\"/>\n    </g>\n  </g>";
            }
        },
        MINE("09", "Mine (ASAT)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"matrix(0.6,0,0,0.6,120.91857,242.23221)\">\n    <ellipse cx=\"306.804\" cy=\"396.291\" rx=\"34.667\" ry=\"23.457\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"332.096\" x2=\"281.32599\" y1=\"354.167\" y2=\"438\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"283.045\" x2=\"330.754\" y1=\"352.863\" y2=\"438.475\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"306.899\" x2=\"306.899\" y1=\"441.166\" y2=\"350.833\"/>\n  </g>";
            }
        },
        MAINTENANCE("10", "Maintenance", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(0.03496,0.20552)\">\n    <path d=\"m 253.025,450.5 c 11.294,0 20.451,9.155 20.451,20.449 0,11.296 -9.156,20.451 -20.451,20.451\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"273.476\" x2=\"336.457\" y1=\"470.95001\" y2=\"470.95001\"/>\n    <path d=\"m 356.907,491.4 c -11.294,0 -20.45,-9.156 -20.45,-20.45 0,-11.294 9.156,-20.45 20.45,-20.45\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        REFUEL("11", "Refuel", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(1.7114,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"80px\" transform=\"translate(272.0005,509.5557)\">K</text>\n  </g>";
            }
        },
        TUG("12", "Tug", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-15.1283,-8)\">\n    <text font-family=\"sans-serif\" font-size=\"48px\" transform=\"matrix(1.0329,0,0,1,269.2549,500.0469)\">TUG</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    SpaceSectorTwoModifier(String id, String label, ModifierCategory category) {
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

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}