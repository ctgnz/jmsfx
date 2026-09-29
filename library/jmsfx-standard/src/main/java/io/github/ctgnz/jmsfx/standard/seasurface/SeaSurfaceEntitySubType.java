package io.github.ctgnz.jmsfx.standard.seasurface;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum SeaSurfaceEntitySubType implements EntitySubType {
        BB("01", "Battleship", SeaSurfaceEntityType.SURF_COMBAT_LINE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"BB\" transform=\"matrix(1 0 0 1 212.5 442.0146)\">BB</text>\n  </g>";
            }
        },
        CA("02", "Cruiser", SeaSurfaceEntityType.SURF_COMBAT_LINE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"CG\" transform=\"matrix(1 0 0 1 205.5 442.0146)\">CG</text>\n  </g>";
            }
        },
        DD("03", "Destroyer", SeaSurfaceEntityType.SURF_COMBAT_LINE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"DD\" transform=\"matrix(1 0 0 1 214.5 442.0146)\">DD</text>\n  </g>";
            }
        },
        FF("04", "Frigate", SeaSurfaceEntityType.SURF_COMBAT_LINE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"FF\" transform=\"matrix(1 0 0 1 229.5 443.0146)\">FF</text>\n  </g>";
            }
        },
        CORVETTE("05", "Corvette", SeaSurfaceEntityType.SURF_COMBAT_LINE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"FS\" transform=\"matrix(1 0 0 1 228.5 442.0146)\">FS</text>\n  </g>";
            }
        },
        LCS("06", "Littoral Combatant Ship", SeaSurfaceEntityType.SURF_COMBAT_LINE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" id=\"LCS\" transform=\"matrix(1 0 0 1 197.5 433.25)\">LCS</text>\n  </g>";
            }
        },
        ACS("01", "Amphibious Command Ship", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" id=\"LCC\" transform=\"matrix(1 0 0 1 195.5 433.25)\">LCC</text>\n  </g>";
            }
        },
        AMPHIB_ASSAULT_NON("02", "Amphibious Assault, Non-specified", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"LA\" transform=\"matrix(1 0 0 1 228.5 442.0146)\">LA</text>\n  </g>";
            }
        },
        AMPHIB_ASSAULT_GENERAL("03", "Amphibious Assault Ship, General", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"108\" id=\"LHA\" transform=\"matrix(1 0 0 1 191.5 433.25)\">LHA</text>\n  </g>";
            }
        },
        AMPHIB_ASSAULT_MULT("04", "Amphibious Assault Ship, Multipurpose", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" id=\"LHD\" transform=\"matrix(1 0 0 1 194.5 434.25)\">LHD</text>\n  </g>";
            }
        },
        AMPHIB_ASSAULT_HELO("05", "Amphibious Assault Ship, Helicopter", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"108\" id=\"LPH\" transform=\"matrix(1 0 0 1 191.5 433.25)\">LPH</text>\n  </g>";
            }
        },
        AMPHIB_TRANS_DOCK("06", "Amphibious Transport Dock", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" id=\"LPD\" transform=\"matrix(1 0 0 1 196.5 433.25)\">LPD</text>\n  </g>";
            }
        },
        LANDING_SHIP("07", "Landing Ship", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"LS\" transform=\"matrix(1 0 0 1 228.5 442.0146)\">LS</text>\n  </g>";
            }
        },
        LANDING_CRAFT("08", "Landing Craft", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"LC\" transform=\"matrix(1 0 0 1 228.5 442.0146)\">LC</text>\n  </g>";
            }
        },
        MINE_LAYER("01", "Mine Layer", SeaSurfaceEntityType.MINE_WARFARE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"ML\" transform=\"matrix(1 0 0 1 212.5 442.0146)\">ML</text>\n  </g>";
            }
        },
        MINE_SWEEPER("02", "Mine Sweeper", SeaSurfaceEntityType.MINE_WARFARE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"MS\" transform=\"matrix(1 0 0 1 212.5 442.0146)\">MS</text>\n  </g>";
            }
        },
        MINE_SWEEPER_DRONE("03", "Mine Sweeper, Drone", SeaSurfaceEntityType.MINE_WARFARE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"104\" id=\"MSD\" transform=\"matrix(1 0 0 1 192.5 432.25)\">MSD</text>\n  </g>";
            }
        },
        MINE_HUNTER("04", "Mine Hunter", SeaSurfaceEntityType.MINE_WARFARE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"MH\" transform=\"matrix(1 0 0 1 204.5 442.0146)\">MH</text>\n  </g>";
            }
        },
        MINE_COUNTER("05", "Mine Countermeasures", SeaSurfaceEntityType.MINE_WARFARE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" id=\"MCM\" transform=\"matrix(1 0 0 1 190.5 431.25)\">MCM</text>\n  </g>";
            }
        },
        MINE_COUNTER_SUPPORT("06", "Mine Countermeasures, Support Ship", SeaSurfaceEntityType.MINE_WARFARE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"104\" id=\"MCS\" transform=\"matrix(1 0 0 1 191.5 431.25)\">MCS</text>\n  </g>";
            }
        },
        PATROL_CHASER("01", "Patrol Craft, Submarine Chaser/Escort, General", SeaSurfaceEntityType.PATROL_BOAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"PC\" transform=\"matrix(1 0 0 1 219.5 443.0146)\">PC</text>\n  </g>";
            }
        },
        PATROL_SHIP("02", "Patrol Ship, General", SeaSurfaceEntityType.PATROL_BOAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"PG\" transform=\"matrix(1 0 0 1 219.5 443.0146)\">PG</text>\n  </g>";
            }
        },
        RHIB("01", "Rigid-Hull Inflatable Boat (RHIB)", SeaSurfaceEntityType.SPEEDBOAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"263.833,443.032 237.884,391.134 250.858,391.134 270.32,348.967 289.782,348.967 270.32,391.134 374.116,391.134 348.168,443.032\" stroke=\"#000000\" stroke-width=\"6.4872\"/>\n    <text fill=\"#FFFFFF\" font-family=\"sans-serif\" font-size=\"54\" transform=\"matrix(1 0 0 1 268 436.25)\">RB</text>\n  </g>";
            }
        },
        NAVY_TASK_ELEMENT("01", "Navy Task Element", SeaSurfaceEntityType.NAVY_TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"363.262,444.161 363.262,386.482 318.9,348.03\" stroke=\"#000000\" stroke-width=\"9.9071\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 254.6387 442.25)\">TE</text>\n    <polyline fill=\"none\" points=\"246.904,444.161 246.904,386.935 291.266,348.784\" stroke=\"#000000\" stroke-width=\"9.8682\"/>\n  </g>";
            }
        },
        NAVY_TASK_FORCE("02", "Navy Task Force", SeaSurfaceEntityType.NAVY_TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"363.262,444.161 363.262,386.482 318.9,348.03\" stroke=\"#000000\" stroke-width=\"9.9071\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 257.6387 442.25)\">TF</text>\n    <polyline fill=\"none\" points=\"246.904,444.161 246.904,386.935 291.266,348.784\" stroke=\"#000000\" stroke-width=\"9.8682\"/>\n  </g>";
            }
        },
        NAVY_TASK_GROUP("03", "Navy Task Group", SeaSurfaceEntityType.NAVY_TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"363.262,444.161 363.262,386.482 318.9,348.03\" stroke=\"#000000\" stroke-width=\"9.9071\"/>\n    <text font-family=\"sans-serif\" font-size=\"76\" transform=\"matrix(1 0 0 1 254.6387 442.25)\">TG</text>\n    <polyline fill=\"none\" points=\"246.904,444.161 246.904,386.935 291.266,348.784\" stroke=\"#000000\" stroke-width=\"9.8682\"/>\n  </g>";
            }
        },
        NAVY_TASK_UNIT("04", "Navy Task Unit", SeaSurfaceEntityType.NAVY_TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"363.262,444.161 363.262,386.482 318.9,348.03\" stroke=\"#000000\" stroke-width=\"9.9071\"/>\n    <text font-family=\"sans-serif\" font-size=\"76\" transform=\"matrix(1 0 0 1 254.6387 442.25)\">TU</text>\n    <polyline fill=\"none\" points=\"246.904,444.161 246.904,386.935 291.266,348.784\" stroke=\"#000000\" stroke-width=\"9.8682\"/>\n  </g>";
            }
        },
        CONVOY("05", "Convoy", SeaSurfaceEntityType.NAVY_TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"228.281,445.086 228.281,346.915 383.718,346.915 383.718,445.086 350.994,445.086 350.994,379.639 261.005,379.639 261.005,445.086\" stroke=\"#000000\" stroke-width=\"0.8181\"/>\n  </g>";
            }
        },
        AMMO_SHIP("01", "Ammunition Ship", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"AE\" transform=\"matrix(1 0 0 1 209.5 443.0146)\">AE</text>\n  </g>";
            }
        },
        NAVAL_STORES("02", "Naval Stores Ship", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 218.5 443.0146)\">AF</text>\n  </g>";
            }
        },
        AUX_FLAG("03", "Auxiliary Flag Ship", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" id=\"AGF\" transform=\"matrix(1 0 0 1 199.5 431.25)\">AGF</text>\n  </g>";
            }
        },
        INTEL_COLLECTOR("04", "Intelligence Collector", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" id=\"AGI\" transform=\"matrix(1 0 0 1 201.5 438.25)\">AGI</text>\n  </g>";
            }
        },
        OCEANO_RESEARCH("05", "Oceanographic Research Ship", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" id=\"AGO\" transform=\"matrix(1 0 0 1 197.5 432.25)\">AGO</text>\n  </g>";
            }
        },
        SURVEY("06", "Survey Ship", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" id=\"AGS\" transform=\"matrix(1 0 0 1 200.5 432.25)\">AGS</text>\n  </g>";
            }
        },
        HOSPITAL("07", "Hospital Ship", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"AH\" transform=\"matrix(1 0 0 1 210.5 443.0146)\">AH</text>\n  </g>";
            }
        },
        NAVAL_CARGO("08", "Naval Cargo Ship", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"AK\" transform=\"matrix(1 0 0 1 210.5 443.0146)\">AK</text>\n  </g>";
            }
        },
        COMBAT_SUPPORT_FAST("09", "Combat Support Ship, Fast", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" id=\"AOE\" transform=\"matrix(1 0 0 1 198.5 432.25)\">AOE</text>\n  </g>";
            }
        },
        OILER("10", "Oiler, Replenishment", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" id=\"AOR\" transform=\"matrix(1 0 0 1 198.5 432.25)\">AOR</text>\n  </g>";
            }
        },
        REPAIR("11", "Repair Ship", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"AR\" transform=\"matrix(1 0 0 1 210.5 443.0146)\">AR</text>\n  </g>";
            }
        },
        SUB_TENDER("12", "Submarine Tender", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"AS\" transform=\"matrix(1 0 0 1 210.5 443.0146)\">AS</text>\n  </g>";
            }
        },
        TUG("13", "Tug, Ocean Going", SeaSurfaceEntityType.AUXILIARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"AT\" transform=\"matrix(1 0 0 1 227.5 443.0146)\">AT</text>\n  </g>";
            }
        },
        BARGE_NON_SELF("01", "Barge, Not Self-Propelled", SeaSurfaceEntityType.SERVICE_CRAFT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"YB\" transform=\"matrix(1 0 0 1 218.5 443.0146)\">YB</text>\n  </g>";
            }
        },
        BARGE_SELF("02", "Barge, Self-Propelled", SeaSurfaceEntityType.SERVICE_CRAFT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"YS\" transform=\"matrix(1 0 0 1 218.5 443.0146)\">YS</text>\n  </g>";
            }
        },
        TUG_HARBOR("03", "Tug, Harbor", SeaSurfaceEntityType.SERVICE_CRAFT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" id=\"YT\" transform=\"matrix(1 0 0 1 218.5 443.0146)\">YT</text>\n  </g>";
            }
        },
        LAUNCH("04", "Launch", SeaSurfaceEntityType.SERVICE_CRAFT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"116\" id=\"YTF\" opacity=\"0.9\" transform=\"matrix(1 0 0 1 197.5 445.25)\">YFT</text>\n  </g>";
            }
        },
        CIV_CARGO("01", "Cargo, General", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"180\" transform=\"matrix(1 0 0 1 242.5 464.5)\">A</text>\n  </g>";
            }
        },
        CIV_CONTAINER("02", "Container Ship", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"160\" transform=\"matrix(1 0 0 1 249.5 458.5)\">C</text>\n  </g>";
            }
        },
        CIV_DREDGE("03", "Dredge", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"160\" transform=\"matrix(1 0 0 1 247.5 458.5)\">D</text>\n  </g>";
            }
        },
        CIV_RORO("04", "Roll On/Roll Off", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"160\" transform=\"matrix(1 0 0 1 252.5 458.5)\">E</text>\n  </g>";
            }
        },
        CIV_FERRY("05", "Ferry", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"160\" transform=\"matrix(1 0 0 1 256.5 458.5)\">F</text>\n  </g>";
            }
        },
        CIV_HEAVY_LIFT("06", "Heavy Lift", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"160\" transform=\"matrix(1 0 0 1 249.5 458.5)\">H</text>\n  </g>";
            }
        },
        CIV_HOVERCRAFT("07", "Hovercraft", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"160\" transform=\"matrix(1 0 0 1 258.5 458.5)\">J</text>\n  </g>";
            }
        },
        CIV_LASH_CARRIER("08", "Lash Carrier (with Barges)", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"160\" transform=\"matrix(1 0 0 1 264.5 458.5)\">L</text>\n  </g>";
            }
        },
        CIV_OILER_TANKER("09", "Oiler/Tanker", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"140\" transform=\"matrix(1 0 0 1 251.5 453.5)\">O</text>\n  </g>";
            }
        },
        CIV_PASSENGER("10", "Passenger", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"140\" transform=\"matrix(1 0 0 1 260.5 453.5)\">P</text>\n  </g>";
            }
        },
        CIV_TUG("11", "Tug, Ocean Going", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"160\" transform=\"matrix(1 0 0 1 258.5 463.5)\">T</text>\n  </g>";
            }
        },
        CIV_TOW("12", "Tow", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 236.5 467.5)\">TW</text>\n  </g>";
            }
        },
        CIV_HAZMAT("13", "Transport Ship, Hazardous Material", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 241.5 469.5)\">HZ</text>\n  </g>";
            }
        },
        CIV_JUNK("14", "Junk/Dhow", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 242.5 468.5)\">QJ</text>\n  </g>";
            }
        },
        CIV_BARGE("15", "Barge, Not Self-Propelled", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 242.5 468.5)\">YB</text>\n  </g>";
            }
        },
        CIV_HOSPITAL("16", "Hospital Ship", SeaSurfaceEntityType.CIV_MERCHANT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"35\" x1=\"305.692\" x2=\"305.692\" y1=\"365.879\" y2=\"468.195\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"35\" x1=\"254.167\" x2=\"356.483\" y1=\"417.038\" y2=\"417.038\"/>\n  </g>";
            }
        },
        CIV_DRIFTER("01", "Drifter", SeaSurfaceEntityType.CIV_FISHING, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"238.667,480 200,402.667 233.833,402.667 233.833,368.833 291.833,368.833 291.833,402.667 403,402.667 364.333,480\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.033\" x2=\"315.033\" y1=\"403.634\" y2=\"302.133\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.033\" x2=\"392.366\" y1=\"402.667\" y2=\"325.333\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 253.5 470.7422)\">DF</text>\n  </g>";
            }
        },
        CIV_TRAWLER("02", "Trawler", SeaSurfaceEntityType.CIV_FISHING, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"238.667,480 200,402.667 233.833,402.667 233.833,368.833 291.833,368.833 291.833,402.667 403,402.667 364.333,480\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.033\" x2=\"315.033\" y1=\"403.634\" y2=\"302.133\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.033\" x2=\"392.366\" y1=\"402.667\" y2=\"325.333\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 251.5 470.7422)\">TR</text>\n  </g>";
            }
        },
        CIV_DREDGER("03", "Dredger", SeaSurfaceEntityType.CIV_FISHING, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"238.667,480 200,402.667 233.833,402.667 233.833,368.833 291.833,368.833 291.833,402.667 403,402.667 364.333,480\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.033\" x2=\"315.033\" y1=\"403.634\" y2=\"302.133\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.033\" x2=\"392.366\" y1=\"402.667\" y2=\"325.333\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 246.5 470.7422)\">DR</text>\n  </g>";
            }
        },
        CIV_RHIB("01", "Rigid-Hull Inflatable Boat (RHIB)", SeaSurfaceEntityType.CIV_LEISURE_MOTOR, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"238.983,477.65 198.5,396.683 218.742,396.683 249.105,330.897 279.469,330.897 249.105,396.683 411.039,396.683 370.557,477.65\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"84\" transform=\"matrix(1 0 0 1 244.064 467.9932)\">RB</text>\n  </g>";
            }
        },
        CIV_SPEED("02", "Speedboat", SeaSurfaceEntityType.CIV_LEISURE_MOTOR, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"239.983,476.65 199.5,395.683 219.742,395.683 250.105,329.897 280.469,329.897 250.105,395.683 412.039,395.683 371.557,476.65\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"84\" transform=\"matrix(1 0 0 1 254.064 466.9932)\">SP</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final SeaSurfaceEntityType entityType;
    private final GraphicType graphicType;

    SeaSurfaceEntitySubType(String id, String label, SeaSurfaceEntityType entityType, GraphicType graphicType) {
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