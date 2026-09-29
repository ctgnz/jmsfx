package io.github.ctgnz.jmsfx.battleorder.air;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum AirSectorOneModifier implements SectorOneModifier {
        BOMBER("02", "Bomber", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"85\" id=\"b\" transform=\"matrix(1 0 0 1 275.0005 344.5557)\">B</text>\n  </g>";
            }
        },
        FIGHTER("04", "Fighter", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"85\" id=\"F\" transform=\"matrix(1 0 0 1 279.0005 344.5557)\">F</text>\n  </g>";
            }
        },
        INTERCEPTOR("05", "Interceptor", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"85\" id=\"I\" transform=\"matrix(1 0 0 1 294.0005 341.5557)\">I</text>\n  </g>";
            }
        },
        TANKER("06", "Tanker", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"K\" transform=\"matrix(1 0 0 1 279.0005 344.5557)\">K</text>\n  </g>";
            }
        },
        PASSENGER("09", "Passenger", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"70\" id=\"PX\" transform=\"matrix(1.0329 0 0 1 259.2549 346.0469)\">PX</text>\n  </g>";
            }
        },
        ULTRA_LIGHT("10", "Ultra Light", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"78\" id=\"UL\" transform=\"matrix(1.0329 0 0 1 259.2549 346.0469)\">UL</text>\n  </g>";
            }
        },
        ACP("11", "Airborne Command Post (ACP)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"65\" id=\"ACP\" transform=\"matrix(1 0 0 1 236 345.5146)\">ACP</text>\n  </g>";
            }
        },
        AEW("12", "Airborne Early Warning (AEW)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"AEW\" transform=\"matrix(1 0 0 1 233 345.5146)\">AEW</text>\n  </g>";
            }
        },
        GOV("13", "Government", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"GOV\" transform=\"matrix(1 0 0 1 238 345.5146)\">GOV</text>\n  </g>";
            }
        },
        EC("16", "Electronic Combat (EC)/Jammer", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"85\" id=\"J\" transform=\"matrix(1 0 0 1 279.0005 344.5557)\">J</text>\n  </g>";
            }
        },
        PATROL("17", "Patrol", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"85\" id=\"P\" transform=\"matrix(1 0 0 1 279.0005 344.5557)\">P</text>\n  </g>";
            }
        },
        RECON("18", "Reconnaissance", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"85\" id=\"R\" transform=\"matrix(1 0 0 1 279.0005 344.5557)\">R</text>\n  </g>";
            }
        },
        TRAINER("19", "Trainer", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"85\" id=\"T\" transform=\"matrix(1 0 0 1 279.0005 344.5557)\">T</text>\n  </g>";
            }
        },
        PHOTO("20", "Photographic (Reconnaissance)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"PH\" transform=\"matrix(1.0329 0 0 1 255.2549 346.0469)\">PH</text>\n  </g>";
            }
        },
        PERSONNEL_RECOVERY("21", "Personnel Recovery", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"PR\" transform=\"matrix(1.0329 0 0 1 255.2549 346.0469)\">PR</text>\n  </g>";
            }
        },
        COMMS("23", "Communications", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"COM\" transform=\"matrix(1 0 0 1 233 344.5146)\">COM</text>\n  </g>";
            }
        },
        ESM("24", "Electronic Support Measures (ESM)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"ES\" transform=\"matrix(1.0329 0 0 1 255.2549 346.0469)\">ES</text>\n  </g>";
            }
        },
        VIP("29", "Very Important Person (VIP) Transport", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"68\" id=\"VIP\" transform=\"matrix(1 0 0 1 254 343.5146)\">VIP</text>\n  </g>";
            }
        },
        CSAR("30", "Combat Search and Rescue (CSAR)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"56.7595\" id=\"CSAR\" transform=\"matrix(1 0 0 1 224.0015 344.8164)\">CSAR</text>\n  </g>";
            }
        },
        SUPP_EAD("31", "Suppression of Enemy Air Defenses", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"56.7595\" id=\"SEAD\" transform=\"matrix(1 0 0 1 227.0015 344.8164)\">SEAD</text>\n  </g>";
            }
        },
        ASUW("32", "Antisurface Warfare", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"51.3936\" id=\"ASUW\" transform=\"matrix(1 0 0 1 223.0024 343.8379)\">ASUW</text>\n  </g>";
            }
        },
        FB("33", "Fighter/Bomber", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"65\" id=\"F_x2F_B\" transform=\"matrix(1.0329 0 0 1 252.2549 344.0469)\">F/B</text>\n  </g>";
            }
        },
        IC("34", "Intensive Care", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"IC\" transform=\"matrix(1.0329 0 0 1 269.2549 346.0469)\">IC</text>\n  </g>";
            }
        },
        EA("35", "Electronic Attack (EA)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"EA\" transform=\"matrix(1.0329 0 0 1 259.2549 345.0469)\">EA</text>\n  </g>";
            }
        },
        MULTIMISSION("36", "Multimission", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"65\" id=\"MM\" transform=\"matrix(1.0329 0 0 1 252.2549 344.0469)\">MM</text>\n  </g>";
            }
        },
        ASW_HELO_LAMPS("38", "ASW Helo - LAMPS", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"LP\" transform=\"matrix(1.0329 0 0 1 264.2549 344.0469)\">LP</text>\n  </g>";
            }
        },
        ASW_HELO_SH_60R("39", "ASW Helo - SH-60R", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"_x36_0R\" transform=\"matrix(1 0 0 1 238 345.5146)\">60R</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    AirSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.AIR;
    }

}