package io.github.ctgnz.jmsfx.historical.air;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum AirEntitySubType implements EntitySubType {
        MEDEVAC("01", "Medical Evacuation (MEDEVAC)", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"40\" x1=\"306.333\" x2=\"306.333\" y1=\"349.667\" y2=\"442.333\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"40\" x1=\"259.667\" x2=\"352.333\" y1=\"396\" y2=\"396\"/>\n  </g>";
            }
        },
        ATTACK_STRIKE("02", "Attack/Strike", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 262.9995 442.0146)\">A</text>\n  </g>";
            }
        },
        BOMBER("03", "Bomber", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 258.9995 442.0146)\">B</text>\n  </g>";
            }
        },
        FIGHTER("04", "Fighter", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 268.9995 442.0146)\">F</text>\n  </g>";
            }
        },
        FIGHTER_BOMBER("05", "Fighter/Bomber", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 205 442.25)\">F/B</text>\n  </g>";
            }
        },
        CARGO("07", "Cargo", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 258.9995 443.0146)\">C</text>\n  </g>";
            }
        },
        ECJ("08", "Electronic Combat (EC)/Jammer", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 265.9995 442.0146)\">J</text>\n  </g>";
            }
        },
        TANKER("09", "Tanker", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 265.9995 442.0146)\">K</text>\n  </g>";
            }
        },
        PATROL("10", "Patrol", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 265.9995 442.0146)\">P</text>\n  </g>";
            }
        },
        RECON("11", "Reconnaissance", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 265.9995 442.0146)\">R</text>\n  </g>";
            }
        },
        TRAINER("12", "Trainer", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 265.9995 442.0146)\">T</text>\n  </g>";
            }
        },
        UTILITY("13", "Utility", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 259.9995 442.0146)\">U</text>\n  </g>";
            }
        },
        VSTOL("14", "VSTOL", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 265.9995 443.0146)\">V</text>\n  </g>";
            }
        },
        ACP("15", "Airborne Command Post (ACP)", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"104\" transform=\"matrix(1 0 0 1 200 433.25)\">ACP</text>\n  </g>";
            }
        },
        AEW("16", "Airborne Early Warning (AEW)", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 200 433.25)\">AEW</text>\n  </g>";
            }
        },
        ASUW("17", "Antisurface Warfare", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 194.999 423.7715)\">ASUW</text>\n  </g>";
            }
        },
        ASW("18", "Antisubmarine Warfare", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 200 433.25)\">ASW</text>\n  </g>";
            }
        },
        COM("19", "Communications", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 200 433.25)\">COM</text>\n  </g>";
            }
        },
        CSAR("20", "Combat Search and Rescue (CSAR)", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"79.7975\" transform=\"matrix(1 0 0 1 187.999 423.7715)\">CSAR</text>\n  </g>";
            }
        },
        ESM("21", "Electronic Support Measures (ESM)", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-12.13966,-15.02708)\">\n    <text font-family=\"sans-serif\" font-size=\"90px\" transform=\"translate(219.9995,442.25)\">ESM</text>\n  </g>";
            }
        },
        GOV("22", "Government", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 196 433.25)\">GOV</text>\n  </g>";
            }
        },
        MCM("23", "Mine Countermeasures (MCM)", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 196 433.25)\">MCM</text>\n  </g>";
            }
        },
        PR("24", "Personnel Recovery", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 219.9995 442.25)\">PR</text>\n  </g>";
            }
        },
        SAR("25", "Search and Rescue", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 196 433.25)\">SAR</text>\n  </g>";
            }
        },
        SOF("26", "Special Operations Forces", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 196 433.25)\">SOF</text>\n  </g>";
            }
        },
        UL("27", "Ultra Light", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 219.9995 442.25)\">UL</text>\n  </g>";
            }
        },
        PH("28", "Photographic Reconnaissance", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 219.9995 442.25)\">PH</text>\n  </g>";
            }
        },
        VIP("29", "Very Important Person (VIP)", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 208 439.25)\">VIP</text>\n  </g>";
            }
        },
        SEAD("30", "Suppression of Enemy Air Defense", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 196.9995 425.25)\">SEAD</text>\n  </g>";
            }
        },
        PX("31", "Passenger", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 219.9995 442.25)\">PX</text>\n  </g>";
            }
        },
        E("32", "Escort", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 259.9995 442.0146)\">E</text>\n  </g>";
            }
        },
        EA("33", "Electronic Attack (EA)", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 219.9995 442.25)\">EA</text>\n  </g>";
            }
        },
        ES("A1", "Electronic Surveillance Measures (ES)", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130px\" x=\"216.86375\" y=\"442.25\">ES</text>\n  </g>";
            }
        },
        LN("A2", "Liaison (LN)", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130px\" x=\"220.06932\" y=\"442.25\">LN</text>\n  </g>";
            }
        },
        OBSERVATION("A3", "Observation", AirEntityType.FIXED_WING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130px\" x=\"253.80711\" y=\"442.0146\">O</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final AirEntityType entityType;
    private final GraphicType graphicType;

    AirEntitySubType(String id, String label, AirEntityType entityType, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
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
    public EntityType getEntityType() {
        return entityType;
    }

}