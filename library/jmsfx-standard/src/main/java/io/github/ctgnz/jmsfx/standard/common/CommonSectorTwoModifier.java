package io.github.ctgnz.jmsfx.standard.common;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.ModifierBounds;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum CommonSectorTwoModifier implements SectorTwoModifier {
        UNSPECIFIED("0", "00", "Unspecified", ModifierCategory.None),
        AIRBORNE("1", "00", "Airborne", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <path d=\"M226,482.5c0-40,80-40,80,0c0-40,80-40,80,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        BICYCLE_EQUIPPED("1", "01", "Bicycle Equipped", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <circle cx=\"306\" cy=\"478.397\" fill=\"none\" r=\"28.103\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        RAILROAD_RAILWAY("1", "02", "Railroad/Railway", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(40 -30) scale(0.8 0.7)\">\n    <ellipse cx=\"243.516\" cy=\"703.542\" fill=\"none\" rx=\"14.396\" ry=\"14.395\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"283.38\" cy=\"703.542\" fill=\"none\" rx=\"14.396\" ry=\"14.395\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"420.692\" cy=\"703.542\" fill=\"none\" rx=\"14.397\" ry=\"14.395\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"380.825\" cy=\"703.542\" fill=\"none\" rx=\"14.397\" ry=\"14.395\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"223.583\" x2=\"440.625\" y1=\"684.717\" y2=\"684.717\"/>\n  </g>";
            }
        },
        SKI("1", "03", "Ski", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"282.5\" x2=\"326.064\" y1=\"450.724\" y2=\"494.288\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"337.464\" x2=\"315.097\" y1=\"483.061\" y2=\"505.428\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"329.564\" x2=\"286\" y1=\"450.725\" y2=\"494.289\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"274.601\" x2=\"296.968\" y1=\"483.061\" y2=\"505.428\"/>\n  </g>";
            }
        },
        TRACKED("1", "04", "Tracked", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"matrix(0.55,0,0,0.55,136.70096,255.82803)\">\n    <path d=\"m 250.552,441 c -22.895,0 -41.457,-19.98 -41.457,-44.626 0,-24.646 18.562,-44.624 41.457,-44.624\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 361.448,351.75 c 22.896,0 41.457,19.979 41.457,44.624 0,24.645 -18.561,44.626 -41.457,44.626\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.552\" x2=\"361.448\" y1=\"351.75\" y2=\"351.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.552\" x2=\"361.448\" y1=\"441\" y2=\"441\"/>\n  </g>";
            }
        },
        STANDARD_ON_ROAD_MOBILITY("1", "05", "Standard Mobility/On-Road Mobility", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <circle cx=\"256.778\" cy=\"468.983\" fill=\"none\" r=\"18\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"353.167\" cy=\"468.983\" fill=\"none\" r=\"18\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        HIGH_OFF_ROAD_MOBILITY("1", "06", "High Mobility/Off-Road Mobility", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <circle cx=\"256.778\" cy=\"468.983\" fill=\"none\" r=\"18\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"305.083\" cy=\"468.983\" fill=\"none\" r=\"18\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"353.167\" cy=\"468.983\" fill=\"none\" r=\"18\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        FIXED_WING("1", "07", "Fixed Wing", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"matrix(0.6,0,0,0.6,123.5384,233.2651)\">\n    <path d=\"m 422.706,395.541 c 0,17.741 -15.521,32.123 -34.665,32.123 -19.145,0 -81.748,-32.123 -81.748,-32.123 0,0 62.604,-32.123 81.748,-32.123 19.144,0 34.665,14.383 34.665,32.123 z\" stroke=\"#000000\"/>\n    <path d=\"m 187.011,395.817 c 0,-18.037 15.781,-32.661 35.246,-32.661 19.465,0 83.118,32.661 83.118,32.661 0,0 -63.653,32.66 -83.118,32.66 -19.465,0 -35.246,-14.623 -35.246,-32.66 z\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        ROTARY_WING("1", "08", "Rotary Wing", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(0,150)\">\n    <polygon points=\"310.171,320.755 357.787,298.805 357.787,342.705\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polygon points=\"302.736,320.755 255.12,342.705 255.12,298.805\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ROBOTIC("1", "09", "Robotic", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"matrix(1.21,0,0,1.21,-329.4642,294.06885)\">\n    <path d=\"m 524.908,125.86341 -36.593,36.8516 28.48775,-12.537 8.10525,23.0431 8.422,-23.0431 27.0164,12.537 z\" style=\"fill:#000000;fill-opacity:1;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    <circle cx=\"488.59473\" cy=\"162.01735\" r=\"7\" style=\"fill:#000000;fill-rule:evenodd;stroke:none;stroke-linecap:round;stroke-opacity:1\"/>\n    <circle cx=\"560.10803\" cy=\"162.01735\" r=\"7\" style=\"fill:#000000;fill-rule:evenodd;stroke:none;stroke-linecap:round;stroke-opacity:1\"/>\n    <circle cx=\"524.3307\" cy=\"173.30057\" r=\"7\" style=\"fill:#000000;fill-rule:evenodd;stroke:none;stroke-linecap:round;stroke-opacity:1\"/>\n  </g>";
            }
        },
        AUTONOMOUS_CONTROL("1", "10", "Autonomous Control", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(8.81443,4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(235,489.5146)\">AUT</text>\n  </g>";
            }
        },
        REMOTELY_PILOTED("1", "11", "Remotely Piloted", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(9.35548,4)\">\n    <text font-family=\"sans-serif\" font-size=\"70px\" transform=\"matrix(1.0329,0,0,1,250.2549,496.0469)\">RP</text>\n  </g>";
            }
        },
        EXPENDABLE("1", "12", "Expendable", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(10.35252,4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(235,489.5146)\">EXP</text>\n  </g>";
            }
        },
        MOUNTAIN("1", "13", "Mountain", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-9.51122)\">\n    <g id=\"mod2\" transform=\"matrix(0.9,0,0,0.9,30.6,47.47395)\">\n      <polyline points=\"306,445.015 335.725,504.464 276.275,504.464\"/>\n    </g>\n    <g transform=\"matrix(0.7,0,0,0.7,114.76935,148.36675)\">\n      <polyline points=\"306,445.015 335.725,504.464 276.275,504.464\"/>\n    </g>\n  </g>";
            }
        },
        LONG_RANGE("1", "14", "Long Range", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1.0329 0 0 1 259.2549 496.0469)\">LR</text>\n  </g>";
            }
        },
        MEDIUM_RANGE("1", "15", "Medium Range", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"68\" transform=\"matrix(1.0329 0 0 1 251.2549 495.0469)\">MR</text>\n  </g>";
            }
        },
        SHORT_RANGE("1", "16", "Short Range", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1.0329 0 0 1 252.2549 497.0469)\">SR</text>\n  </g>";
            }
        },
        CLOSE_RANGE("1", "17", "Close Range", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1.0329 0 0 1 250.2549 496.0469)\">CR</text>\n  </g>";
            }
        },
        HEAVY("1", "18", "Heavy", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"85\" transform=\"matrix(1 0 0 1 274.0005 507.5557)\">H</text>\n  </g>";
            }
        },
        MEDIUM("1", "19", "Medium", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 272.0005 504.5557)\">M</text>\n  </g>";
            }
        },
        LIGHT_MEDIUM("1", "20", "Light and Medium", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(14.395489,4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(235,489.5146)\">L/M</text>\n  </g>";
            }
        },
        LIGHT("1", "21", "Light", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"85\" transform=\"matrix(1 0 0 1 278.0005 507.5557)\">L</text>\n  </g>";
            }
        },
        CYBERSPACE("1", "22", "Cyberspace", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(9.5322,4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(235,489.5146)\">CYB</text>\n  </g>";
            }
        },
        SECURITY_FORCE_ASSISTANCE("1", "23", "Security Force Assistance", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(11.62693,4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(235,489.5146)\">SFA</text>\n  </g>";
            }
        },
        MEDICAL_BED("1", "24", "Medical Bed", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"matrix(0.95,0,0,0.95,14.06054,35.59854)\">\n    <path d=\"m 320.2225,433.7571 v 39.10556\" style=\"fill:none;stroke:#000000;stroke-width:7;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 320.80366,456.52213 h 57.53462\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 378.17936,445.44382 v 25.1714\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 320.93531,435.10557 23.82293,19.77752\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <circle cx=\"320.2225\" cy=\"472.18842\" r=\"6\" style=\"fill:#000000;fill-rule:evenodd;stroke-width:24;stroke-linecap:round\"/>\n    <circle cx=\"378.17935\" cy=\"470.83994\" r=\"6\" style=\"fill:#000000;fill-rule:evenodd;stroke-width:24;stroke-linecap:round\"/>\n  </g>";
            }
        },
        MULTIFUNCTIONAL("1", "25", "Multifunctional", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(0.43055,2)\">\n    <text font-family=\"sans-serif\" font-size=\"70px\" transform=\"matrix(1.0329,0,0,1,250.2549,496.0469)\">MF</text>\n  </g>";
            }
        };

    private final String groupId;
    private final String id;
    private final String label;
    private final ModifierCategory category;

    CommonSectorTwoModifier(String groupId, String id, String label, ModifierCategory category) {
        this.groupId = groupId;
        this.id = id;
        this.label = label;
        this.category = category;
    }

    @Override
    public ModifierCategory getCategory() {
        return category;
    }

    @Override
    public String getGraphicIdentifier() {
        return String.format("C2%s%s", getGroupId(), getId());
    }

    @Override
    public String getGroupId() {
        return groupId;
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
        return SymbolSetEnum.COMMON;
    }

    @Override
    public boolean isUnknown() {
        return "0".equals(groupId) && "00".equals(id);
    }

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}