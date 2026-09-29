package io.github.ctgnz.jmsfx.standard.seasurface;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum SeaSurfaceEntityType implements EntityType {
        CARRIER("01", "Carrier", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline points=\"306,444.133 257.867,390.652 257.867,347.868 300.652,347.868 300.652,390.652 354.133,390.652\" stroke=\"#000000\" stroke-width=\"0.5348\"/>\n  </g>";
            }
        },
        SURF_COMBAT_LINE("02", "Surface Combatant, Line", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M306,442.397l-53.356-44.077l34.798,4.64V384.4h12.991v-9.279h-32.479V364.45 h32.479v-14.847h11.136v14.847h32.478v10.671h-32.478v9.279h12.991v18.56l34.798-4.64L306,442.397z\" stroke=\"#000000\" stroke-width=\"0.464\"/>\n  </g>";
            }
        },
        AMPHIB_WAR_SHIP("03", "Amphibious Warfare Ship", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"7.2218\" x1=\"307.083\" x2=\"372.079\" y1=\"440.89\" y2=\"440.89\"/>\n    <path d=\"M307.083,444.5l-72.219-68.607l43.331,7.222v-36.109h57.774v36.109l43.331-7.222L307.083,444.5z\"/>\n  </g>";
            }
        },
        MINE_WARFARE("04", "Mine Warfare Ship", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"306,444.25 258.417,399.047 353.584,399.047\" stroke=\"#000000\" stroke-width=\"0.4758\"/>\n    <rect height=\"14.274\" stroke=\"#000000\" stroke-width=\"0.4758\" width=\"109.441\" x=\"251.28\" y=\"387.151\"/>\n    <ellipse cx=\"306\" cy=\"394.288\" rx=\"30.929\" ry=\"30.929\" stroke=\"#000000\" stroke-width=\"0.4758\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"11.8957\" x1=\"306\" x2=\"272.692\" y1=\"394.288\" y2=\"360.98\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"11.8957\" x1=\"306\" x2=\"306\" y1=\"394.288\" y2=\"346.705\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"11.8957\" x1=\"306\" x2=\"339.309\" y1=\"394.288\" y2=\"360.98\"/>\n  </g>";
            }
        },
        PATROL_BOAT("05", "Patrol Boat", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"306,445.25 256.75,391.523 288.091,391.523 288.091,346.75 323.909,346.75 323.909,391.523 355.25,391.523\" stroke=\"#000000\" stroke-width=\"0.4477\"/>\n  </g>";
            }
        },
        DECOY("06", "Decoy", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"270.646,442.798 223.67,396.18 270.288,349.201\" stroke=\"#000000\" stroke-width=\"2\"/>\n    <polygon points=\"323.278,442.798 276.302,396.18 322.919,349.201\" stroke=\"#000000\" stroke-width=\"2\"/>\n    <polygon points=\"379.245,442.798 332.27,396.18 378.886,349.201\" stroke=\"#000000\" stroke-width=\"2\"/>\n  </g>";
            }
        },
        USV("07", "Unmanned Surface Water Vehicle (USV)", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon id=\"_x2C_path_x3E_\" points=\"204.456,346.558 305.398,405.889 406.344,346.558 406.344,386.111 305.398,445.441 204.456,386.111\"/>\n  </g>";
            }
        },
        SPEEDBOAT("08", "Speedboat", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"263.833,443.032 237.884,391.134 250.858,391.134 270.32,348.967 289.782,348.967 270.32,391.134 374.116,391.134 348.168,443.032\" stroke=\"#000000\" stroke-width=\"6.4872\"/>\n  </g>";
            }
        },
        JET_SKI("09", "Jet Ski", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"248.789,445.154 235.192,424.759 282.782,346.577 303.177,346.577 303.177,360.174 292.979,360.174 279.382,414.562 371.162,414.562 371.162,445.154\"/>\n  </g>";
            }
        },
        NAVY_TASK("10", "Navy Task Organization", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline points=\"258.333,445.015 258.333,389.975 306,347.886 353.666,389.975 353.666,445.015\" stroke=\"#000000\" stroke-width=\"0.6891\"/>\n    <polyline fill=\"none\" points=\"247.333,445.015 247.333,386.737 292.066,347.886\" stroke=\"#000000\" stroke-width=\"3.4455\"/>\n    <polyline fill=\"none\" points=\"364.666,445.015 364.666,386.737 319.933,347.886\" stroke=\"#000000\" stroke-width=\"3.4455\"/>\n  </g>";
            }
        },
        SEA_BASED_X("11", "Sea-Based X-Band (SBX) Radar", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M323.053,441.079c-44.975,0-92.593-36.461-92.593-81.434\" fill=\"none\" stroke=\"#000000\" stroke-width=\"16.4513\"/>\n    <polyline fill=\"none\" points=\"234.778,385.878 313.982,352.038 313.988,404.285 379.25,356.457\" stroke=\"#000000\" stroke-width=\"16.4513\"/>\n  </g>";
            }
        },
        AUXILIARY("01", "Auxiliary Ship", SeaSurfaceEntity.MILITARY_NON_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"AA\" transform=\"matrix(1 0 0 1 209.5 443.0146)\">AA</text>\n  </g>";
            }
        },
        SERVICE_CRAFT("02", "Service Craft/Yard", SeaSurfaceEntity.MILITARY_NON_COMBAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"YY\" transform=\"matrix(1 0 0 1 218.5 443.0146)\">YY</text>\n  </g>";
            }
        },
        CIV_MERCHANT("01", "Merchant Ship", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        CIV_FISHING("02", "Fishing Vessel", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"238.667,480 200,402.667 233.833,402.667 233.833,368.833 291.833,368.833 291.833,402.667 403,402.667 364.333,480\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.033\" x2=\"315.033\" y1=\"403.634\" y2=\"302.133\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.033\" x2=\"392.366\" y1=\"402.667\" y2=\"325.333\"/>\n  </g>";
            }
        },
        CIV_LAW("03", "Law Enforcement Vessel", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"240,468 200,388 250,388 250,323 360,323 360,388 410,388 370,468\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polygon points=\"385,388 345,468 320,468 360,388\"/>\n  </g>";
            }
        },
        CIV_LEISURE_SAIL("04", "Leisure Craft, Sailing", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"240,481 200,401 410,401 370,481\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"401\" y2=\"281\"/>\n    <polygon fill=\"#FFFFFF\" points=\"405,386 320,386 320,296\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        CIV_LEISURE_MOTOR("05", "Leisure Craft, Motorized", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"239.983,477.65 199.5,396.683 219.742,396.683 250.105,330.897 280.469,330.897 250.105,396.683 412.039,396.683 371.557,477.65\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        CIV_JET_SKI("06", "Jet Ski", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"220.409,447.167 200.76,417.694 269.531,304.713 299.003,304.713 299.003,324.362 284.267,324.362 264.62,402.957 397.247,402.957 397.247,447.167\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        CIV_USV("07", "Unmanned Surface Water Vehicle (USV)", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" points=\"308.738,407.382 220.141,354.223 220.141,389.662 308.738,442.82 397.336,389.662 397.336,354.223\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final SeaSurfaceEntity entity;
    private final GraphicType graphicType;

    SeaSurfaceEntityType(String id, String label, SeaSurfaceEntity entity, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
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
    public Entity getEntity() {
        return entity;
    }

    @Override
    public List<EntitySubType> getEntitySubTypes() {
        return SeaSurfaceSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}