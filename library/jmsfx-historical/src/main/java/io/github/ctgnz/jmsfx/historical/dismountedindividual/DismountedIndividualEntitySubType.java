package io.github.ctgnz.jmsfx.historical.dismountedindividual;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum DismountedIndividualEntitySubType implements EntitySubType {
        AVIATION("01", "Aviation", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"387.838,443.678 305.082,396.307 387.486,348.322\" stroke=\"#000000\"/>\n    <polygon points=\"223.609,443.481 223.915,348.518 306,396.264\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        MUSIC("02", "Music", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"m 292.30548,447.8096 c 9.9,-1.056 17.268,-11.112 15.984,-21.048 0,-17.484 0,-34.992 0,-52.464 0.672,-0.78 2.052,0.876 2.76,0.96 7.968,4.8 15.012,12.564 15.492,22.308 0.528,7.608 -1.764,15.06 -4.344,22.116 8.628,-10.692 11.4,-26.292 5.4,-38.928 -3.072,-7.332 -9.984,-11.856 -13.86,-18.66 a 37.344,37.344 0 0 1 -5.712,-15 c -0.564,-1.116 -1.956,-1.2 -3.048,-1.2 h -0.024 c -3.444,0 -2.976,2.292 -2.976,4.62 v 66.252 c 0,0 -1.788,-0.168 -3.108,-0.168 -10.092,-0.66 -21.048,6.66 -22.056,17.244 -1.176,8.4 7.632,15.276 15.492,13.968 z\" style=\"stroke-width:1.2\"/>\n  </g>";
            }
        },
        CBRN("03", "CBRN", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"228\" cy=\"364.985\" rx=\"18\" ry=\"18\"/>\n    <ellipse cx=\"381.5\" cy=\"363.985\" rx=\"18\" ry=\"18\"/>\n    <path d=\"M236,353.75c68,21.148,79.333,33.233,107.667,87.613\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M372,353.75c-68,21.148-79.333,33.233-107.667,87.613\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ENGINEERS("05", "Engineers", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(20 0) scale(0.9 0.9)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"318.889\" x2=\"318.889\" y1=\"393.889\" y2=\"493.889\"/>\n    <polyline fill=\"none\" points=\"228.889,492.778 228.889,393.889 408.889,393.889 408.889,492.778\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ARTILLERY("06", "Artillery", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"305.083\" cy=\"396\" id=\"symbol\" r=\"37.833\"/>\n  </g>";
            }
        },
        INFANTRY("07", "Infantry", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g display=\"none\">\n      <polygon fill=\"none\" points=\"431.44,324.5 431.44,470.5 305,543.5 178.56,470.5 178.56,324.5 305,251.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"178.56\" x2=\"431.75\" y1=\"469\" y2=\"323.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"178.56\" x2=\"431.75\" y1=\"323.5\" y2=\"469\"/>\n  </g>";
            }
        },
        MEDICAL("08", "Medical", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g display=\"none\">\n      <polygon fill=\"none\" points=\"431.44,321.5 431.44,467.5 305,540.5 178.56,467.5 178.56,321.5 305,248.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.363\" x2=\"305.363\" y1=\"249.875\" y2=\"539.125\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"178.625\" x2=\"431.375\" y1=\"394.43\" y2=\"394.43\"/>\n  </g>";
            }
        },
        ORDNANCE("09", "Ordnance", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"410.361\" fill=\"none\" rx=\"40.333\" ry=\"29.654\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"332.169\" x2=\"352.17\" y1=\"392.688\" y2=\"359.375\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"284.254\" x2=\"269.833\" y1=\"385.392\" y2=\"352.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"273.168\" x2=\"253.167\" y1=\"393.146\" y2=\"359.833\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"321.084\" x2=\"335.504\" y1=\"384.934\" y2=\"352.292\"/>\n  </g>";
            }
        },
        QUARTERMASTER("10", "Quartermaster", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"385\" cy=\"396\" fill=\"none\" r=\"30.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"354.25\" x2=\"189\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"208\" y1=\"396\" y2=\"433\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"242.5\" x2=\"242.5\" y1=\"396\" y2=\"433\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"242.5\" y1=\"419.5\" y2=\"419.5\"/>\n  </g>";
            }
        },
        SIGNAL("11", "Signals", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g display=\"none\">\n      <polygon fill=\"none\" points=\"431.44,321.5 431.44,467.5 305,540.5 178.56,467.5 178.56,321.5 305,248.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <polyline fill=\"none\" points=\"214.5,303.5 302.016,417.173 309.483,374.826 397,488.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ADMINISTRATION("12", "Administration", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 198 427.6719)\">ADM</text>\n  </g>";
            }
        },
        FINANCE("14", "Finance", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"none\" height=\"63.944\" stroke=\"#000000\" stroke-width=\"5\" width=\"113.678\" x=\"248.244\" y=\"374.685\"/>\n    <polyline fill=\"none\" points=\"247.533,373.265 262.454,353.371 347.711,353.371 362.632,373.265\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        RELIGIOUS_SUPPORT("16", "Religious Support", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(5.05564,1.82593)\">\n    <text font-family=\"sans-serif\" font-size=\"96px\" transform=\"translate(205,427.6719)\">REL</text>\n  </g>";
            }
        },
        ARMOUR("17", "Armour", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M250.552,441c-22.895,0-41.457-19.98-41.457-44.626 c0-24.646,18.562-44.624,41.457-44.624\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M361.448,351.75c22.896,0,41.457,19.979,41.457,44.624 c0,24.645-18.561,44.626-41.457,44.626\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.552\" x2=\"361.448\" y1=\"351.75\" y2=\"351.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.552\" x2=\"361.448\" y1=\"441\" y2=\"441\"/>\n  </g>";
            }
        },
        RECONNAISSANCE("18", "Reconnaissance", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g display=\"none\">\n      <polygon fill=\"none\" points=\"431.44,321.5 431.44,467.5 305,540.5 178.56,467.5 178.56,321.5 305,248.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"396.75\" x2=\"213.75\" y1=\"303.25\" y2=\"489\"/>\n  </g>";
            }
        },
        MILITARY_POLICE("19", "Military Police", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"115\" transform=\"matrix(1 0 0 1 220 439.25)\">MP</text>\n  </g>";
            }
        },
        GENERAL("20", "General", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\"/>";
            }
        },
        LEGAL("27", "Legal", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 205 427.6719)\">JAG</text>\n  </g>";
            }
        },
        COMBAT("29", "Combat", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 206 427.6719)\">CBT</text>\n  </g>";
            }
        },
        MILITARY_INTELLIGENCE("30", "Military Intelligence", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 234 442.6719)\">MI</text>\n  </g>";
            }
        },
        SPECIAL_FORCES("31", "Special Forces", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 223.9995 442.25)\">SF</text>\n  </g>";
            }
        },
        SECURITY_SERVICE("32", "Security", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 206 429.6719)\">SEC</text>\n  </g>";
            }
        },
        PSYCHOLOGICAL_OPERATIONS("33", "Psychological Operations (MISO)", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Speaker\">\n      <rect height=\"61.667\" stroke=\"#000000\" width=\"59.167\" x=\"263\" y=\"366.167\"/>\n      <polyline points=\"338.667,444.334 291.54,397.208 340.801,347.946\" stroke=\"#000000\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"362.583\" x2=\"326.917\" y1=\"366.167\" y2=\"366.167\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"362.583\" x2=\"326.917\" y1=\"427.834\" y2=\"427.834\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"362.583\" x2=\"326.917\" y1=\"386.723\" y2=\"386.723\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"362.583\" x2=\"326.917\" y1=\"407.278\" y2=\"407.278\"/>\n    </g>\n  </g>";
            }
        },
        CYBER("34", "Cyber", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 210 439.584)\">EW</text>\n  </g>";
            }
        },
        COMBAT_SUPPORT("37", "Combat Support (Maneuver Enhancement)", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"363.5,396 307.5,445.015 246.5,396 246.5,346.985 363.5,346.985\"/>\n  </g>";
            }
        },
        SPACE("40", "Space Operations", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"78.361\" stroke=\"#000000\" stroke-width=\"5\" width=\"33.833\" x=\"239.667\" y=\"350.139\"/>\n    <rect height=\"78.361\" stroke=\"#000000\" stroke-width=\"5\" width=\"33.834\" x=\"333.583\" y=\"350.139\"/>\n    <rect height=\"61.377\" stroke=\"#000000\" stroke-width=\"5\" width=\"26.501\" x=\"291.832\" y=\"358.631\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"272.167\" x2=\"335.833\" y1=\"389.319\" y2=\"389.319\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304\" x2=\"304\" y1=\"418.5\" y2=\"432.5\"/>\n    <path d=\"M281.764,442.667c11.142-12.532,31.032-13.003,44.471-1.055\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        CIVIL_AFFAIRS("41", "Civil Affairs", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 211 442.6719)\">CA</text>\n  </g>";
            }
        },
        MAINTENANCE("43", "Maintenance", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M205.008,356.7c21.705,0,39.3,17.595,39.3,39.299 c0,21.706-17.595,39.301-39.3,39.301\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"244.308\" x2=\"365.342\" y1=\"396\" y2=\"396\"/>\n    <path d=\"M404.642,435.3c-21.704,0-39.3-17.596-39.3-39.3s17.597-39.299,39.3-39.299\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        AIR_DEFENCE_ARTILLERY("44", "Air Defence Artillery", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g display=\"none\" transform=\"translate(1.04327,-1.02404)\">\n      <polygon fill=\"none\" points=\"431.44,324.5 431.44,470.5 305,543.5 178.56,470.5 178.56,324.5 305,251.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <path d=\"m 180,470 c 80,-80 172,-80 252,0\" fill=\"none\" id=\"arc_1_\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        PUBLIC_AFFAIRS("45", "Public Affairs", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 220 442.6719)\">PA</text>\n  </g>";
            }
        },
        INFORMATION_OPERATIONS("53", "Information Operations", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(11.93943,-0.84448)\">\n    <text font-family=\"sans-serif\" font-size=\"130px\" transform=\"translate(220,442.6719)\">IO</text>\n  </g>";
            }
        },
        LOGISTICS("54", "Logistics", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"178.40596\" x2=\"431.59595\" y1=\"446.03885\" y2=\"446.31885\"/>\n  </g>";
            }
        },
        TRANSPORTATION("55", "Transportation", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(20 50) scale(0.9 0.9)\">\n      <path d=\"M315.304,335.204c27.295,0,49.419,22.126,49.419,49.421 c0,27.289-22.127,49.417-49.419,49.417s-49.417-22.128-49.417-49.417C265.885,357.33,288.011,335.204,315.304,335.204z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"275.769\" x2=\"354.838\" y1=\"357.442\" y2=\"411.802\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"275.769\" x2=\"354.838\" y1=\"411.802\" y2=\"357.442\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.304\" x2=\"315.304\" y1=\"335.204\" y2=\"434.042\"/>\n    </g>\n  </g>";
            }
        },
        COMBAT_SERVICE_SUPPORT("63", "Combat Service Support (Sustainment)", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 205 427.6719)\">CSS</text>\n  </g>";
            }
        },
        TACTICAL_CYBER("71", "Tactical Cyber", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 210 439.584)\">EW</text>\n  </g>";
            }
        },
        ACQUISITION("90", "Acquisition", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 198 427.6719)\">ACQ</text>\n  </g>";
            }
        },
        TRAINING_EDUCATION("97", "Training/Education", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"60\" style=\"fill:#000000;stroke:#000000;stroke-width:5;fill-opacity:1\" width=\"60\" x=\"275.00095\" y=\"383.795\"/>\n    <path d=\"m 306,385 v -55 l 30,18 -30,18\" style=\"fill:#000000;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;fill-opacity:1;stroke-miterlimit:4;stroke-dasharray:none\"/>\n  </g>";
            }
        },
        NAVAL("99", "Naval", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g display=\"none\" transform=\"translate(1,-1.5)\">\n      <polygon fill=\"none\" points=\"305,543.5 178.56,470.5 178.56,324.5 305,251.5 431.44,324.5 431.44,470.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <path d=\"m 178.342,370.75 c 11.697,0 21.18,10.082 21.18,22.518\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M242.136,392.398c0,12.438-9.482,22.519-21.18,22.519 c-11.697,0-21.182-10.081-21.182-22.519\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M242.136,393.268c0-12.436,9.483-22.518,21.182-22.518 c11.697,0,21.179,10.082,21.179,22.518\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M326.857,392.398c0,12.438-9.483,22.519-21.18,22.519 c-11.698,0-21.181-10.081-21.181-22.519\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M326.857,393.268c0-12.436,9.481-22.518,21.182-22.518 c11.698,0,21.181,10.082,21.181,22.518\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M411.579,392.398c0,12.438-9.481,22.519-21.182,22.519 c-11.697,0-21.18-10.081-21.18-22.519\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 411.579,393.268 c 0,-12.436 9.483,-22.518 21.181,-22.518\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
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
        STAFF("A0", "Staff", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" id=\"main-8\" stroke=\"#000000\" stroke-width=\"5\" x1=\"178.40596\" x2=\"431.59595\" y1=\"346.705\" y2=\"346.98499\"/>\n  </g>";
            }
        },
        DRIVER("A1", "Driver", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(20 50) scale(0.9 0.9)\">\n      <path d=\"M315.304,335.204c27.295,0,49.419,22.126,49.419,49.421 c0,27.289-22.127,49.417-49.419,49.417s-49.417-22.128-49.417-49.417C265.885,357.33,288.011,335.204,315.304,335.204z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"275.769\" x2=\"354.838\" y1=\"357.442\" y2=\"411.802\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"275.769\" x2=\"354.838\" y1=\"411.802\" y2=\"357.442\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.304\" x2=\"315.304\" y1=\"335.204\" y2=\"434.042\"/>\n    </g>\n  </g>";
            }
        },
        GUNNER("A2", "Gunner", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(20 50) scale(0.9 0.9)\">\n      <path d=\"M315.304,335.204c27.295,0,49.419,22.126,49.419,49.421 c0,27.289-22.127,49.417-49.419,49.417s-49.417-22.128-49.417-49.417C265.885,357.33,288.011,335.204,315.304,335.204z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245.885\" x2=\"384.723\" y1=\"384.623\" y2=\"384.623\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.304\" x2=\"315.304\" y1=\"315.204\" y2=\"454.042\"/>\n    </g>\n  </g>";
            }
        },
        LOADER("A3", "Loader", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M285.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.781,0,21.888,6.491,22.4,19.837c0.893,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"277.5\" x2=\"339.501\" y1=\"438.464\" y2=\"438.464\"/>\n  </g>";
            }
        },
        PILOT("A4", "Pilot", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"387.838,443.678 305.082,396.307 387.486,348.322\" stroke=\"#000000\"/>\n    <polygon points=\"223.609,443.481 223.915,348.518 306,396.264\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        NAVIGATOR("A5", "Navigator", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"66.7872\" transform=\"matrix(1.0761 0 0 1 278.1143 344.3135)\">N</text>\n    <polygon points=\"387.838,443.678 305.082,396.307 387.486,348.322\" stroke=\"#000000\"/>\n    <polygon points=\"223.609,443.481 223.915,348.518 306,396.264\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        FLIGHT_ENGINEER("A6", "Flight Engineer", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"387.838,443.678 305.082,396.307 387.486,348.322\" stroke=\"#000000\"/>\n    <polygon points=\"223.609,443.481 223.915,348.518 306,396.264\" stroke=\"#000000\"/>\n    <g transform=\"translate(0.03496,-150.01412)\">\n      <path d=\"m 253.025,450.5 c 11.294,0 20.451,9.155 20.451,20.449 0,11.296 -9.156,20.451 -20.451,20.451\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"273.476\" x2=\"336.457\" y1=\"470.95001\" y2=\"470.95001\"/>\n      <path d=\"m 356.907,491.4 c -11.294,0 -20.45,-9.156 -20.45,-20.45 0,-11.294 9.156,-20.45 20.45,-20.45\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        LOADMASTER("A7", "Loadmaster", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"178.56\" x2=\"431.75\" y1=\"445.015\" y2=\"445.295\"/>\n    <text font-family=\"sans-serif\" font-size=\"115px\" x=\"223.35545\" y=\"436.42337\">LM</text>\n  </g>";
            }
        },
        OPERATOR("A8", "Operator", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 198 427.6719)\">OPR</text>\n  </g>";
            }
        },
        SURVEYOR("A9", "Topographical Surveyor", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"263.076,443.199 306.029,379.269 341.49,443.199\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.029\" x2=\"306.029\" y1=\"379.269\" y2=\"348.802\"/>\n    <path d=\"M349.208,422.932c-10.632,8.6-28.341,16.771-43.927,16.771 c-16.246,0-33.561-8.229-44.323-17.477\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MUSICIAN("AA", "Musician", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 198 427.6719)\">MUS</text>\n  </g>";
            }
        },
        FOOD_PROVISION("AB", "Food Provision/Chef", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M301.169,396.149c0-19.191,12.044-35.563,28.983-41.987 c-4.949-1.877-10.313-2.914-15.918-2.914c-24.799,0-44.902,20.103-44.902,44.901c0,24.798,20.103,44.9,44.902,44.9 c5.604,0,10.969-1.036,15.918-2.914C313.213,431.711,301.169,415.341,301.169,396.149z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ANALYST("AC", "Analyst", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0,-46)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"380.5\" y2=\"472.417\"/>\n    <polygon fill=\"none\" points=\"362.668,469.667 306.515,507.834 249.334,469.667\" stroke=\"#020001\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        INSTRUCTOR("AD", "Instructor", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:5;stroke-miterlimit:4;stroke-dasharray:none\" x1=\"369.76898\" x2=\"253.99924\" y1=\"376.80463\" y2=\"376.80463\"/>\n    <rect height=\"67.8403\" style=\"fill:#000000;stroke:#000000;stroke-width:5;stroke-linecap:round;stroke-opacity:1;fill-opacity:0;stroke-miterlimit:4;stroke-dasharray:none\" width=\"163.37051\" x=\"223.24995\" y=\"358.93054\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:5;stroke-miterlimit:4;stroke-dasharray:none\" x1=\"369.42285\" x2=\"253.65311\" y1=\"386.84222\" y2=\"386.84222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:5;stroke-miterlimit:4;stroke-dasharray:none\" x1=\"369.07672\" x2=\"253.30698\" y1=\"396.87982\" y2=\"396.87982\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:5;stroke-miterlimit:4;stroke-dasharray:none\" x1=\"369.42285\" x2=\"253.65311\" y1=\"406.91742\" y2=\"406.91742\"/>\n    <path d=\"m 244.39127,442.34642 c 0,0 -5,-45 20,-45 25,0 20,45 20,45 z\" style=\"fill:#ffffff;fill-opacity:1;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1\"/>\n    <ellipse cx=\"264.39127\" cy=\"387.5771\" rx=\"14.39202\" ry=\"14.77245\" style=\"fill:#ffffff;fill-opacity:1;stroke:#000000;stroke-width:5;stroke-linecap:round;stroke-miterlimit:4;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        DETECTIVE("AE", "Detective", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 224 429.6719)\">CID</text>\n  </g>";
            }
        },
        UAS_OPERATOR("AF", "UAS Operator", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline points=\"206,346 206,386 306,446 406,386 406,346 306,406\"/>\n  </g>";
            }
        },
        AVIATION_TECHNICIAN("B0", "Aviation Technician", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M205.008,356.7c21.705,0,39.3,17.595,39.3,39.299 c0,21.706-17.595,39.301-39.3,39.301\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"244.308\" x2=\"365.342\" y1=\"396\" y2=\"396\"/>\n    <path d=\"M404.642,435.3c-21.704,0-39.3-17.596-39.3-39.3s17.597-39.299,39.3-39.299\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g transform=\"matrix(0.5,0,0,0.5,152.1391,120.73023)\">\n      <polygon points=\"305.082,396.307 387.486,348.322 387.838,443.678\" stroke=\"#000000\"/>\n      <polygon points=\"223.915,348.518 306,396.264 223.609,443.481\" stroke=\"#000000\"/>\n    </g>\n  </g>";
            }
        },
        AVIATION_OPERATIONS("B1", "Aviation Operations", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"208.096,444.429 208.096,347.62 304.906,395.979\"/>\n    <polygon points=\"403.904,444.383 304.906,395.979 403.904,347.572\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304.906\" x2=\"304.906\" y1=\"382.5\" y2=\"445.154\"/>\n    <circle cx=\"305.083\" cy=\"369.538\" r=\"22.833\"/>\n  </g>";
            }
        },
        WATERCRAFT_OPERATOR("B2", "Watercraft Operator", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"357.529\" fill=\"none\" rx=\"7.404\" ry=\"7.404\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"364.934\" y2=\"438.982\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268.976\" x2=\"343.023\" y1=\"369.562\" y2=\"369.562\"/>\n    <path d=\"M259.72,401.959c23.14,46.279,69.418,46.279,92.559,0 C329.139,455.181,282.86,455.181,259.72,401.959\" stroke=\"#000000\" stroke-width=\"3\"/>\n    <path d=\"M259.72,401.959c3.703,20.826,6.017,20.826,6.017,20.826l6.942-9.256 c-6.016-2.314-8.33-6.943-11.569-10.185\" stroke=\"#000000\" stroke-width=\"3\"/>\n    <path d=\"M352.279,401.959c-3.701,20.826-6.016,20.826-6.016,20.826l-6.941-9.256 c6.016-2.314,8.33-6.943,11.566-10.185\" stroke=\"#000000\" stroke-width=\"3\"/>\n  </g>";
            }
        },
        METEOROLOGIST("B3", "Meteorologist", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(199.01562,429.49219)\">\n    <text font-family=\"sans-serif\" font-size=\"96px\">MET</text>\n  </g>";
            }
        },
        DIVER("B4", "Diver", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"305.992\" cy=\"386.083\" fill=\"none\" r=\"13.092\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"306.228\" cy=\"385.869\" fill=\"none\" r=\"34.472\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <rect fill=\"none\" height=\"24.506\" stroke=\"#000000\" stroke-width=\"5\" width=\"15.849\" x=\"255.618\" y=\"373.617\"/>\n    <rect fill=\"none\" height=\"24.506\" stroke=\"#000000\" stroke-width=\"5\" width=\"15.848\" x=\"340.699\" y=\"372.989\"/>\n    <polygon fill=\"none\" points=\"339.7,440.603 326.895,420.341 285.294,420.575 270.756,440.603\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        FIREFIGHTER("B5", "Firefighter", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"396\" rx=\"40.021\" ry=\"40.021\" stroke=\"#000000\"/>\n    <polyline points=\"275.214,346.743 336.785,346.743 306,396 336.785,445.258 275.214,445.258 306,396\" stroke=\"#000000\"/>\n    <polyline points=\"256.743,365.214 256.743,426.785 306,396 355.258,426.785 355.258,365.214 306,396\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        DOG_HANDLER("B6", "DogHandler", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 196 429.6719)\">DOG</text>\n  </g>";
            }
        },
        VETERINARY("B7", "Veterinary", DismountedIndividualEntityType.TASK, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g display=\"none\">\n      <polygon fill=\"none\" points=\"431.44,321.5 431.44,467.5 305,540.5 178.56,467.5 178.56,321.5 305,248.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.363\" x2=\"305.363\" y1=\"249.875\" y2=\"539.125\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"178.625\" x2=\"431.375\" y1=\"394.43\" y2=\"394.43\"/>\n    <g transform=\"translate(276.03916,558.64396)\">\n      <text font-family=\"sans-serif\" font-size=\"96px\" x=\"36.33882\" y=\"-84.79059\">V</text>\n    </g>\n  </g>";
            }
        },
        DENTIST("B8", "Dentist", DismountedIndividualEntityType.TASK, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g display=\"none\">\n      <polygon fill=\"none\" points=\"431.44,321.5 431.44,467.5 305,540.5 178.56,467.5 178.56,321.5 305,248.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.363\" x2=\"305.363\" y1=\"249.875\" y2=\"539.125\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"178.625\" x2=\"431.375\" y1=\"394.43\" y2=\"394.43\"/>\n    <g transform=\"translate(276.03916,558.64396)\">\n      <text font-family=\"sans-serif\" font-size=\"96px\" x=\"29.81647\" y=\"-83.85883\">D</text>\n    </g>\n  </g>";
            }
        },
        NURSE("B9", "Nurse", DismountedIndividualEntityType.TASK, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g display=\"none\">\n      <polygon fill=\"none\" points=\"431.44,321.5 431.44,467.5 305,540.5 178.56,467.5 178.56,321.5 305,248.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.363\" x2=\"305.363\" y1=\"249.875\" y2=\"539.125\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"178.625\" x2=\"431.375\" y1=\"394.43\" y2=\"394.43\"/>\n    <g transform=\"translate(276.03916,558.64396)\">\n      <text font-family=\"sans-serif\" font-size=\"96px\" x=\"31.68\" y=\"-82.92706\">N</text>\n    </g>\n  </g>";
            }
        },
        SEAPORT_OPERATOR("BA", "Sea Port Operator", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(276.03916,558.64396)\">\n    <g transform=\"matrix(0.8,0,0,0.8,5.99194,-4.5832)\">\n      <g transform=\"matrix(0.9,0,0,0.9,-256.03916,-508.64396)\">\n        <path d=\"m 317.777,346.591 c 24.15,0 43.722,19.576 43.722,43.726 0,24.145 -19.575,43.723 -43.722,43.723 -24.148,0 -43.723,-19.578 -43.723,-43.723 -10e-4,-24.15 19.575,-43.726 43.723,-43.726 z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"282.798\" x2=\"352.75601\" y1=\"366.267\" y2=\"414.363\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"282.798\" x2=\"352.75601\" y1=\"414.363\" y2=\"366.267\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"317.77701\" x2=\"317.77701\" y1=\"346.591\" y2=\"434.04\"/>\n      </g>\n      <g transform=\"translate(-276.03916,-558.64396)\">\n        <circle cx=\"306\" cy=\"284.23401\" fill=\"none\" r=\"6.234\" stroke=\"#000000\" stroke-width=\"5\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"290.469\" y2=\"352.814\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"287.508\" x2=\"324.313\" y1=\"294.36499\" y2=\"294.36499\"/>\n        <path d=\"m 267.034,321.642 c 19.483,38.966 58.449,38.966 77.932,0 -19.484,44.811 -58.449,44.811 -77.932,0\" stroke=\"#000000\" stroke-width=\"3\"/>\n        <path d=\"m 267.034,321.642 c 3.118,17.535 5.066,17.535 5.066,17.535 l 5.845,-7.793 c -5.065,-1.948 -7.014,-5.846 -9.741,-8.573\" stroke=\"#000000\" stroke-width=\"3\"/>\n        <path d=\"m 344.966,321.642 c -3.117,17.535 -5.063,17.535 -5.063,17.535 l -5.848,-7.793 c 5.065,-1.948 7.017,-5.846 9.741,-8.573\" stroke=\"#000000\" stroke-width=\"3\"/>\n      </g>\n    </g>\n  </g>";
            }
        },
        AIRPORT_OPERATOR("BB", "Airport Operator", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(276.03916,592.3673)\">\n    <g transform=\"matrix(0.8,0,0,0.8,5.16095,-39.57346)\">\n      <g transform=\"matrix(0.8,0,0,0.8,-236.03916,-486.64396)\">\n        <circle cx=\"332.5\" cy=\"399.922\" fill=\"none\" r=\"61.346\" stroke=\"#000000\" stroke-width=\"5\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"283.42\" x2=\"381.57501\" y1=\"366.181\" y2=\"433.662\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"283.42\" x2=\"381.57501\" y1=\"433.662\" y2=\"366.181\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"332.5\" x2=\"332.5\" y1=\"338.57501\" y2=\"461.26801\"/>\n      </g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" transform=\"translate(-276.03916,-558.64396)\" x1=\"246.61099\" x2=\"341.133\" y1=\"325.062\" y2=\"325.062\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" transform=\"translate(-276.03916,-558.64396)\" x1=\"318.25\" x2=\"253.739\" y1=\"280.26599\" y2=\"347.78299\"/>\n    </g>\n  </g>";
            }
        },
        RAILWAY_OPERATOR("BC", "Railway Operator", DismountedIndividualEntityType.TASK, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(276.03916,558.64396)\">\n    <g transform=\"matrix(0.8,0,0,0.8,-214.63916,-481.05792)\">\n      <g transform=\"matrix(0.9,0,0,0.9,20,50)\">\n        <path d=\"m 318.888,310.48 c 34.122,0 61.782,27.66 61.782,61.782 0,34.117 -27.657,61.778 -61.782,61.778 -34.119,0 -61.779,-27.662 -61.779,-61.778 0,-34.122 27.659,-61.782 61.779,-61.782 z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"269.465\" x2=\"368.312\" y1=\"338.281\" y2=\"406.238\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"269.465\" x2=\"368.312\" y1=\"406.238\" y2=\"338.281\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"318.888\" x2=\"318.888\" y1=\"310.48\" y2=\"434.04\"/>\n      </g>\n      <g transform=\"matrix(0.8,0,0,0.7,40,109.6359)\">\n        <ellipse cx=\"271.97\" cy=\"495.271\" fill=\"none\" rx=\"10.04\" ry=\"10.039\" stroke=\"#000000\" stroke-width=\"5\"/>\n        <ellipse cx=\"299.771\" cy=\"495.271\" fill=\"none\" rx=\"10.04\" ry=\"10.039\" stroke=\"#000000\" stroke-width=\"5\"/>\n        <ellipse cx=\"395.53\" cy=\"495.271\" fill=\"none\" rx=\"10.04\" ry=\"10.039\" stroke=\"#000000\" stroke-width=\"5\"/>\n        <ellipse cx=\"367.727\" cy=\"495.271\" fill=\"none\" rx=\"10.04\" ry=\"10.039\" stroke=\"#000000\" stroke-width=\"5\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"258.069\" x2=\"409.431\" y1=\"482.14301\" y2=\"482.14301\"/>\n      </g>\n    </g>\n  </g>";
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