package io.github.ctgnz.jmsfx.historical.air;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.ModifierBounds;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum AirSectorTwoModifier implements SectorTwoModifier {
        BOOM("04", "Boom-Only", ModifierCategory.RefuelingCapability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"B\" transform=\"matrix(1 0 0 1 282.0005 504.5557)\">B</text>\n  </g>";
            }
        },
        DROGUE("05", "Drogue-Only", ModifierCategory.RefuelingCapability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"D\" transform=\"matrix(1 0 0 1 282.0005 506.5557)\">D</text>\n  </g>";
            }
        },
        BOOM_DROGUE("06", "Boom and Drogue", ModifierCategory.RefuelingCapability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" id=\"B_x2F_D\" transform=\"matrix(1.0329 0 0 1 250.2549 496.0469)\">B/D</text>\n  </g>";
            }
        },
        DOWNLINK("11", "Downlinked", ModifierCategory.TrackLinkAvailability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" id=\"DL\" transform=\"matrix(1.0329 0 0 1 255.2549 496.0469)\">DL</text>\n  </g>";
            }
        },
        BOMBER("A1", "Bomber", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-5.60477,164)\">\n    <text font-family=\"sans-serif\" font-size=\"85px\" x=\"279.0005\" y=\"344.5557\">B</text>\n  </g>";
            }
        },
        FIGHTER("A2", "Fighter", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(0,164)\">\n    <text font-family=\"sans-serif\" font-size=\"85px\" x=\"276.96506\" y=\"344.5557\">F</text>\n  </g>";
            }
        },
        INTERCEPTOR("A3", "Interceptor", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(8.11227,164)\">\n    <text font-family=\"sans-serif\" font-size=\"85px\" x=\"279.0005\" y=\"344.5557\">I</text>\n  </g>";
            }
        },
        TANKER("A4", "Tanker", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"82px\" x=\"272.92966\" y=\"505.5557\">K</text>\n  </g>";
            }
        },
        PASSENGER("A5", "Passenger", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(1.83209,4.24197)\">\n    <text font-family=\"sans-serif\" font-size=\"71.1422px\" style=\"stroke-width:1.01632\" transform=\"scale(1.01632,0.98395)\" x=\"250.17287\" y=\"504.14084\">PX</text>\n  </g>";
            }
        },
        ULTRA_LIGHT("A6", "Ultra Light", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"71.1422px\" style=\"stroke-width:1.01632\" transform=\"scale(1.01632,0.98395)\" x=\"251.14183\" y=\"504.14084\">UL</text>\n  </g>";
            }
        },
        ACP("A7", "Airborne Command Post (ACP)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" x=\"245.96776\" y=\"491.5146\">ACP</text>\n  </g>";
            }
        },
        AEW("A8", "Airborne Early Warning (AEW)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" x=\"236.82713\" y=\"491.5146\">AEW</text>\n  </g>";
            }
        },
        GOV("A9", "Government", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" x=\"236.31444\" y=\"491.5146\">GOV</text>\n  </g>";
            }
        },
        EC("AA", "Electronic Combat (EC)/Jammer", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(1.83209,4.24197)\">\n    <text font-family=\"sans-serif\" font-size=\"71.1422px\" style=\"stroke-width:1.01632\" transform=\"scale(1.01632,0.98395)\" x=\"248.88756\" y=\"504.14084\">EC</text>\n  </g>";
            }
        },
        PATROL("AB", "Patrol", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"P\" transform=\"matrix(1 0 0 1 285.0005 505.5557)\">P</text>\n  </g>";
            }
        },
        RECON("AC", "Reconnaissance", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"R\" transform=\"matrix(1 0 0 1 277 505.25)\">R</text>\n  </g>";
            }
        },
        TRAINER("AD", "Trainer", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80px\" id=\"N\" x=\"280.3525\" y=\"505.25\">T</text>\n  </g>";
            }
        },
        PHOTO("AE", "Photographic (Reconnaissance)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(1.83209,4.24197)\">\n    <text font-family=\"sans-serif\" font-size=\"71.1422px\" style=\"stroke-width:1.01632\" transform=\"scale(1.01632,0.98395)\" x=\"250.12074\" y=\"504.14084\">PH</text>\n  </g>";
            }
        },
        PERSONNEL_RECOVERY("AF", "Personnel Recovery", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(1.83209,4.24197)\">\n    <text font-family=\"sans-serif\" font-size=\"71.1422px\" style=\"stroke-width:1.01632\" transform=\"scale(1.01632,0.98395)\" x=\"248.50545\" y=\"504.14084\">PR</text>\n  </g>";
            }
        },
        COMMS("B1", "Communications", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" x=\"236.40233\" y=\"491.5146\">COM</text>\n  </g>";
            }
        },
        ESM("B2", "Electronic Support Measures (ESM)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(1.83209,4.24197)\">\n    <text font-family=\"sans-serif\" font-size=\"71.1422px\" style=\"stroke-width:1.01632\" transform=\"scale(1.01632,0.98395)\" x=\"250.06863\" y=\"504.14084\">ES</text>\n  </g>";
            }
        },
        VIP("B3", "Very Important Person (VIP) Transport", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" x=\"254.28807\" y=\"491.5146\">VIP</text>\n  </g>";
            }
        },
        CSAR("B4", "Combat Search and Rescue (CSAR)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"49.5066px\" style=\"stroke-width:0.94853\" transform=\"scale(0.94853,1.05427)\" x=\"251.9705\" y=\"464.5661\">CSAR</text>\n  </g>";
            }
        },
        SUPP_EAD("B5", "Suppression of Enemy Air Defenses", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"52px\" x=\"232.80272\" y=\"486.4736\">SEAD</text>\n  </g>";
            }
        },
        ASUW("B6", "Antisurface Warfare", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"52px\" x=\"225.68065\" y=\"486.4736\">ASUW</text>\n  </g>";
            }
        },
        FB("B7", "Fighter/Bomber", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(14.395489,4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" x=\"237.43164\" y=\"489.5146\">F/B</text>\n  </g>";
            }
        },
        IC("B8", "Intensive Care", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(1.83209,4.24197)\">\n    <text font-family=\"sans-serif\" font-size=\"71.1422px\" style=\"stroke-width:1.01632\" transform=\"scale(1.01632,0.98395)\" x=\"257.50244\" y=\"504.14084\">IC</text>\n  </g>";
            }
        },
        EA("B9", "Electronic Attack (EA)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(1.83209,4.24197)\">\n    <text font-family=\"sans-serif\" font-size=\"71.1422px\" style=\"stroke-width:1.01632\" transform=\"scale(1.01632,0.98395)\" x=\"248.47072\" y=\"504.14084\">EA</text>\n  </g>";
            }
        },
        MULTIMISSION("BA", "Multimission", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(1.83209,4.24197)\">\n    <text font-family=\"sans-serif\" font-size=\"71.1422px\" style=\"stroke-width:1.01632\" transform=\"scale(1.01632,0.98395)\" x=\"239.97742\" y=\"504.14084\">MR</text>\n  </g>";
            }
        },
        LIAISON("BB", "Liaison", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(1.83209,4.24197)\">\n    <text font-family=\"sans-serif\" font-size=\"71.1422px\" style=\"stroke-width:1.01632\" transform=\"scale(1.01632,0.98395)\" x=\"251.82288\" y=\"504.14084\">LN</text>\n  </g>";
            }
        },
        ESCORT("BC", "Escort", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-2.65799,164)\">\n    <text font-family=\"sans-serif\" font-size=\"85px\" transform=\"translate(279.0005,344.5557)\">E</text>\n  </g>";
            }
        },
        CARGO("BD", "Cargo/Transport", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-4.40115,166)\">\n    <text font-family=\"sans-serif\" font-size=\"85px\" transform=\"translate(279.0005,344.5557)\">C</text>\n  </g>";
            }
        },
        WEATHER("BE", "Weather", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1.0329 0 0 1 254.2549 496.0469)\">WX</text>\n  </g>";
            }
        },
        OBSERVATION("BF", "Observation", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"85px\" x=\"271.52805\" y=\"507.5557\">O</text>\n  </g>";
            }
        },
        DAY("C1", "Day", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 241 491.5146)\">DAY</text>\n  </g>";
            }
        },
        NIGHT("C2", "Night", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"84\" transform=\"matrix(1 0 0 1 275.0005 506.5557)\">N</text>\n  </g>";
            }
        },
        ALL_WEATHER("C3", "All Weather", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-7.66474)\">\n    <text font-family=\"sans-serif\" font-size=\"70px\" transform=\"matrix(1.0329,0,0,1,254.2549,496.0469)\">AW</text>\n  </g>";
            }
        },
        DIVE("C4", "Dive", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 240.3496 486.4736)\">DIVE</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    AirSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.AIR;
    }

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}