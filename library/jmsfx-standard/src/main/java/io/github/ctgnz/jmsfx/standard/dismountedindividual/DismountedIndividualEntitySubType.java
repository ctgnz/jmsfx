package io.github.ctgnz.jmsfx.standard.dismountedindividual;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum DismountedIndividualEntitySubType implements EntitySubType {
        EOD("01", "Explosive Ordnance Disposal", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 200.9844 430.1055)\">EOD</text>\n  </g>";
            }
        },
        FO("02", "Field Artillery Observer", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" id=\"symbol\" points=\"245.685,441.015 305.082,353.75 364.479,441.015\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245.685\" x2=\"334.78\" y1=\"441.015\" y2=\"397.382\"/>\n    <circle cx=\"304\" cy=\"411\" r=\"16.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        JFS("03", "Joint Fire Support", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"101.0724\" transform=\"matrix(0.9888 0 0 1 216.1616 432.0254)\">JFS</text>\n  </g>";
            }
        },
        LNO("04", "Liaison", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 218.2905 442.25)\">LO</text>\n  </g>";
            }
        },
        MESSENGER("05", "Messenger", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 250.8545 442.25)\">M</text>\n  </g>";
            }
        },
        MP("06", "Military Police", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 207.5 442.25)\">MP</text>\n  </g>";
            }
        },
        OBSERVER("07", "Observer", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" id=\"symbol\" points=\"245.685,441.015 305.082,353.75 364.479,441.015\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        SECURITY("08", "Security", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110.3719\" transform=\"matrix(0.9667 0 0 1 195.3076 435.0049)\">SEC</text>\n  </g>";
            }
        },
        SNIPER("09", "Sniper", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"220\" x2=\"291.5\" y1=\"352.75\" y2=\"352.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"319\" x2=\"390.5\" y1=\"352.75\" y2=\"352.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.083\" x2=\"305.083\" y1=\"361.5\" y2=\"441.015\"/>\n  </g>";
            }
        },
        SOF("10", "Special Operations Forces (SOF)", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"107.8357\" transform=\"matrix(0.9895 0 0 1 195.377 434.8291)\">SOF</text>\n  </g>";
            }
        },
        DESIGNATED_MARKSMAN("11", "Designated Marksman (DM)", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-7.36328)\">\n    <text font-family=\"sans-serif\" font-size=\"130px\" transform=\"translate(207.5,442.25)\">DM</text>\n  </g>";
            }
        },
        MEDIC("12", "Medic", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" style=\"stroke-width:5;stroke-dasharray:none\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"2.8724\" style=\"stroke-width:5;stroke-dasharray:none\" x1=\"305.363\" x2=\"305.363\" y1=\"346.70001\" y2=\"442.15997\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4.8854\" style=\"stroke-width:5;stroke-dasharray:none\" x1=\"184.35101\" x2=\"425.649\" y1=\"394.42999\" y2=\"394.42999\"/>\n  </g>";
            }
        },
        SIGNALLER("13", "Signaller", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"214.5,303.5 302.016,417.173 309.483,374.826 397,488.5\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:6.62643;stroke-dasharray:none\" transform=\"matrix(1.10287,0,0,0.51625,-32.20582,191.07032)\"/>\n  </g>";
            }
        },
        SCOUT("14", "Reconnaissance Scout", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(1.10042,0,0,0.52505,-31.06483,186.38736)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:6.57798;stroke-dasharray:none\" x1=\"396.75\" x2=\"213.75\" y1=\"303.25\" y2=\"489\"/>\n  </g>";
            }
        },
        INFANTEER("15", "Infanteer", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"3.64632\" style=\"stroke-width:5;stroke-dasharray:none\" x1=\"203.28072\" x2=\"406.72104\" y1=\"442.65292\" y2=\"346.34918\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"3.61107\" style=\"stroke-width:5;stroke-dasharray:none\" x1=\"203.31732\" x2=\"406.62436\" y1=\"348.27463\" y2=\"442.78714\"/>\n  </g>";
            }
        },
        CLOSE_PROTECTION("16", "Close Protection (CLP)", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(9.09357,-1.12798)\">\n    <text font-family=\"sans-serif\" font-size=\"107.836px\" transform=\"matrix(0.9895,0,0,1,195.377,434.8291)\">CLP</text>\n  </g>";
            }
        },
        CROWD_RIOT_CONTROL("17", "Infantry", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-2.88971)\">\n    <text font-family=\"sans-serif\" font-size=\"107.836px\" transform=\"matrix(0.9895,0,0,1,195.377,434.8291)\">CRC</text>\n  </g>";
            }
        },
        SWAT("18", "Special Weapons and Tactics (SWAT)", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-7.31967,-11.24707)\">\n    <text font-family=\"sans-serif\" font-size=\"80px\" transform=\"matrix(0.9895,0,0,1,195.377,434.8291)\">SWAT</text>\n  </g>";
            }
        },
        DEMOLITION("19", "Demolition", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-10.1839)\">\n    <text font-family=\"sans-serif\" font-size=\"107.836px\" transform=\"matrix(0.9895,0,0,1,195.377,434.8291)\">DEM</text>\n  </g>";
            }
        },
        COMMANDER("20", "Commander", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-9.03767)\">\n    <text font-family=\"sans-serif\" font-size=\"107.836px\" transform=\"matrix(0.9895,0,0,1,195.377,434.8291)\">CDR</text>\n  </g>";
            }
        },
        SECOND_IN_COMMAND("21", "Second in Command", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(12.0373,-1.12798)\">\n    <text font-family=\"sans-serif\" font-size=\"107.836px\" transform=\"matrix(0.9895,0,0,1,195.377,434.8291)\">SIC</text>\n  </g>";
            }
        },
        RIFLE("01", "Rifle", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow_1_\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.798\" x2=\"305.798\" y1=\"352.245\" y2=\"443.17\"/>\n      <polyline fill=\"none\" points=\"279.5,365.786 305.798,351.17 332.5,365.786\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        SINGLE_SHOT_RIFLE("02", "Single-Shot Rifle", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.5\" x2=\"331.498\" y1=\"398.509\" y2=\"398.509\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304.999\" x2=\"304.999\" y1=\"351.827\" y2=\"443.17\"/>\n      <polyline fill=\"none\" points=\"278.897,365.594 304.999,351.17 331.5,365.594\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        SEMIAUTOMATIC_RIFLE("03", "Semiautomatic Rifle", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.5\" x2=\"331.498\" y1=\"410.475\" y2=\"410.475\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.5\" x2=\"331.498\" y1=\"400.261\" y2=\"400.261\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304.999\" x2=\"304.999\" y1=\"352.261\" y2=\"443.17\"/>\n      <polyline fill=\"none\" points=\"278.897,366.001 304.999,351.17 331.5,366.001\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        AUTOMATIC_RIFLE("04", "Automatic Rifle", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.5\" x2=\"331.498\" y1=\"408.847\" y2=\"408.847\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.5\" x2=\"331.498\" y1=\"398.913\" y2=\"398.913\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.5\" x2=\"331.498\" y1=\"388.979\" y2=\"388.979\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304.999\" x2=\"304.999\" y1=\"352.231\" y2=\"443.17\"/>\n      <polyline fill=\"none\" points=\"278.897,365.594 304.999,351.17 331.5,365.594\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        MACHINE_GUN("05", "Machine Gun", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.5\" x2=\"331.498\" y1=\"441.17\" y2=\"441.17\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304.999\" x2=\"304.999\" y1=\"352.292\" y2=\"441.17\"/>\n      <polyline fill=\"none\" points=\"278.897,366.419 304.999,351.17 331.5,366.419\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        MACHINE_GUN_LIGHT("06", "Machine Gun-Light", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.5\" x2=\"331.498\" y1=\"441.17\" y2=\"441.17\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.5\" x2=\"331.498\" y1=\"401.646\" y2=\"401.646\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304.999\" x2=\"304.999\" y1=\"352.291\" y2=\"441.17\"/>\n      <polyline fill=\"none\" points=\"278.897,366.419 304.999,351.17 331.5,366.419\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        MACHINE_GUN_MEDIUM("07", "Machine Gun-Medium", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.562\" x2=\"331.498\" y1=\"441.17\" y2=\"441.17\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.562\" x2=\"331.498\" y1=\"412.012\" y2=\"412.012\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.562\" x2=\"331.498\" y1=\"401.462\" y2=\"401.462\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.03\" x2=\"305.03\" y1=\"351.881\" y2=\"441.17\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.38\" x2=\"278.5\" y1=\"351.17\" y2=\"366.074\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"331.5\" x2=\"303.621\" y1=\"366.139\" y2=\"351.17\"/>\n    </g>\n  </g>";
            }
        },
        MACHINE_GUN_HEAVY("08", "Machine Gun-Heavy", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.562\" x2=\"331.498\" y1=\"441.17\" y2=\"441.17\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.562\" x2=\"331.498\" y1=\"412.013\" y2=\"412.013\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.562\" x2=\"331.498\" y1=\"401.463\" y2=\"401.463\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.562\" x2=\"331.498\" y1=\"390.912\" y2=\"390.912\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.03\" x2=\"305.03\" y1=\"351.881\" y2=\"441.17\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.38\" x2=\"278.5\" y1=\"351.17\" y2=\"366.075\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"331.5\" x2=\"303.62\" y1=\"366.139\" y2=\"351.17\"/>\n    </g>\n  </g>";
            }
        },
        GRENADE_LAUNCHER("09", "Grenade Launcher", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.03\" x2=\"305.03\" y1=\"349.84\" y2=\"443.5\"/>\n      <ellipse cx=\"305.12\" cy=\"374.409\" fill=\"none\" rx=\"12.179\" ry=\"10.222\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.12\" x2=\"278.5\" y1=\"350.612\" y2=\"364.124\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"331.5\" x2=\"305.12\" y1=\"364.187\" y2=\"350.612\"/>\n    </g>\n  </g>";
            }
        },
        GRENADE_LAUNCHER_LIGHT("10", "Grenade Launcher-Light", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.5\" x2=\"331.498\" y1=\"398.964\" y2=\"398.964\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304.999\" x2=\"304.999\" y1=\"351.987\" y2=\"443.5\"/>\n      <ellipse cx=\"305.089\" cy=\"375.602\" fill=\"none\" rx=\"12.193\" ry=\"10.106\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <polyline fill=\"none\" points=\"278.897,365.435 304.999,350.92 331.5,365.435\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        GRENADE_LAUNCHER_MEDIUM("11", "Grenade Launcher-Medium", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.365\" x2=\"331.302\" y1=\"398.893\" y2=\"398.893\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.365\" x2=\"331.302\" y1=\"388.879\" y2=\"388.879\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304.833\" x2=\"304.833\" y1=\"351.84\" y2=\"443.5\"/>\n      <ellipse cx=\"304.924\" cy=\"375.493\" fill=\"none\" rx=\"12.179\" ry=\"10.123\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.184\" x2=\"278.304\" y1=\"351.165\" y2=\"365.309\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"331.304\" x2=\"303.424\" y1=\"365.37\" y2=\"351.165\"/>\n    </g>\n  </g>";
            }
        },
        GRENADE_LAUNCHER_HEAVY("12", "Grenade Launcher-Heavy", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.562\" x2=\"331.498\" y1=\"408.349\" y2=\"408.349\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.562\" x2=\"331.498\" y1=\"398.32\" y2=\"398.32\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.562\" x2=\"331.498\" y1=\"388.292\" y2=\"388.292\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.03\" x2=\"305.03\" y1=\"351.189\" y2=\"443.004\"/>\n      <ellipse cx=\"305.12\" cy=\"374.881\" fill=\"none\" rx=\"12.179\" ry=\"10.14\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.38\" x2=\"278.5\" y1=\"350.512\" y2=\"364.681\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"331.5\" x2=\"303.62\" y1=\"364.742\" y2=\"350.512\"/>\n    </g>\n  </g>";
            }
        },
        FLAMETHROWER("13", "Flamethrower", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(166 105) scale(5 5)\">\n      <path d=\"M31,52.653l-1.038,0.01c0-0.966-0.089-1.607-0.267-1.921c-0.268-0.652-0.903-0.979-1.907-0.979 c-0.937,0-1.561,0.326-1.874,0.976c-0.179,0.386-0.268,1.073-0.268,2.061v14.866H24.6V52.795c0-1.423,0.201-2.448,0.603-3.076 c0.469-0.723,1.329-1.085,2.579-1.085c1.272,0,2.144,0.339,2.613,1.014C30.798,50.227,31,51.229,31,52.653z\"/>\n    </g>\n  </g>";
            }
        },
        MORTAR("14", "Mortar", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"291,364.283 305,351.973 319,364.283\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"304.606\" cy=\"430.563\" fill=\"none\" rx=\"12.441\" ry=\"10.937\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"351.973\" y2=\"419.626\"/>\n  </g>";
            }
        },
        ROCKET_LAUCHER_SINGLE("15", "Rocket Launcher-Single", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.308\" x2=\"306.308\" y1=\"360.776\" y2=\"443.667\"/>\n    <polyline fill=\"none\" points=\"286.055,373.406 306.308,360.776 326.559,373.406\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"285.441,363.651 305.692,351.021 325.944,363.651\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ROCKET_LAUCHER_ANTITANK("16", "Rocket Launcher-Antitank", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"290.985,441.968 306,426.954 321.015,441.968\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"290.985,380.692 306,365.678 321.015,380.692\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"290.985,366.981 306,351.968 321.015,366.981\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.96\" x2=\"306\" y1=\"366.981\" y2=\"427.388\"/>\n  </g>";
            }
        },
        NON_LETHAL_WEAPON("01", "Non-Lethal Weapon", DismountedIndividualEntityType.NON_LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"351.5\" y2=\"443.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"280.734\" x2=\"331.266\" y1=\"351.5\" y2=\"351.5\"/>\n  </g>";
            }
        },
        NON_LETHAL_GRENADE_LAUNCHER("02", "Non-Lethal Grenade Launcher", DismountedIndividualEntityType.NON_LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"350.6\" y2=\"443.6\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"280.46\" x2=\"331.54\" y1=\"350.6\" y2=\"350.6\"/>\n    <ellipse cx=\"306\" cy=\"371.155\" fill=\"none\" rx=\"12.467\" ry=\"12.13\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        TASER("03", "Taser", DismountedIndividualEntityType.NON_LETHAL_WEAPONS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"350.75\" y2=\"443.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"279.598\" x2=\"330.402\" y1=\"350.75\" y2=\"350.75\"/>\n    <text font-family=\"sans-serif\" font-size=\"95.2985\" transform=\"matrix(1.0963 0 0 1 274.6641 430.3398)\">Z</text>\n  </g>";
            }
        },
        POLICE("01", "Police", DismountedIndividualEntityType.TASK2, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M261.659,351.621c0,71.906,16.594,77.438,45.909,88.5\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M350.159,351.621c0,71.906-16.594,77.438-45.909,88.5\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M260,351.621c23.785,13.828,23.785,13.828,45.91,0 c22.125,13.828,22.125,13.828,45.909,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        NON_GOVT_ORG("02", "Non-Governmental Organizational Member or Non-Governmental Organization (NGO)", DismountedIndividualEntityType.TASK2, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-14.2725)\">\n    <text font-family=\"sans-serif\" font-size=\"102px\" style=\"stroke-width:0.9832\" transform=\"scale(0.9832,1.01708)\" x=\"208.81377\" y=\"427.70074\">NGO</text>\n  </g>";
            }
        },
        GOVT_ORG("03", "Government Organization (GO)", DismountedIndividualEntityType.TASK2, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-4.09424)\">\n    <text font-family=\"sans-serif\" font-size=\"130px\" transform=\"translate(207.5,442.25)\">GO</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final DismountedIndividualEntityType entityType;
    private final GraphicType graphicType;

    DismountedIndividualEntitySubType(String id, String label, DismountedIndividualEntityType entityType, GraphicType graphicType) {
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