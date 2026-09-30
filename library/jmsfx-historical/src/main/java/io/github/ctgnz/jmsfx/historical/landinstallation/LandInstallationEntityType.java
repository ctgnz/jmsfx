package io.github.ctgnz.jmsfx.historical.landinstallation;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum LandInstallationEntityType implements EntityType {
        AMMUNITION_EXPLOSIVES_ASSEMBLY("02", "Ammunition and Explosives/Assembly", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"230.082\" x2=\"380.082\" y1=\"473.84\" y2=\"473.84\"/>\n    <path d=\"M245.082,473.84v-150c0-30,120-30,120,0v150\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        AMMUNITION_CACHE("03", "Ammunition Cache", LandInstallationEntity.INSTALLATION, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup().getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"149.03\" x2=\"462.97\" y1=\"445.015\" y2=\"445.015\"/>\n    <g>\n      <path d=\"M285.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.779,0,21.888,6.491,22.398,19.837c0.895,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"277.5\" x2=\"339.501\" y1=\"438.464\" y2=\"438.464\"/>\n    </g>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <g>\n      <path d=\"M285.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.781,0,21.888,6.491,22.4,19.837c0.893,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"277.5\" x2=\"339.501\" y1=\"438.464\" y2=\"438.464\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"445.015\" y2=\"445.015\"/>\n    <g>\n      <path d=\"M285.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.779,0,21.888,6.491,22.398,19.837c0.895,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"277.5\" x2=\"339.501\" y1=\"438.464\" y2=\"438.464\"/>\n    </g>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"183\" x2=\"429.985\" y1=\"445.015\" y2=\"445.015\"/>\n    <g>\n      <path d=\"M285.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.779,0,21.888,6.491,22.398,19.837c0.895,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"277.5\" x2=\"339.501\" y1=\"438.464\" y2=\"438.464\"/>\n    </g>\n  </g>";
                    default -> null;
                };
            }
        },
        ARMAMENT_PRODUCTION("04", "Armament Production", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"234.5\" x2=\"374.5\" y1=\"335.5\" y2=\"335.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"234.5\" x2=\"374.5\" y1=\"455.5\" y2=\"455.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"234.5\" x2=\"234.5\" y1=\"310.5\" y2=\"480.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"374.5\" x2=\"374.5\" y1=\"310.5\" y2=\"480.5\"/>\n  </g>";
            }
        },
        BLACK_LIST_LOCATION("05", "Black List Location", LandInstallationEntity.INSTALLATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"104\" id=\"BLK\" transform=\"matrix(1 0 0 1 193.5 430.5)\">BLK</text>\n  </g>";
            }
        },
        CBRN("06", "Chemical-Biological-Radiological and Nuclear (CBRN)", LandInstallationEntity.INSTALLATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"228\" cy=\"364.985\" rx=\"18\" ry=\"18\"/>\n    <ellipse cx=\"381.5\" cy=\"363.985\" rx=\"18\" ry=\"18\"/>\n    <path d=\"M236,353.75c68,21.148,79.333,33.233,107.667,87.613\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M372,353.75c-68,21.148-79.333,33.233-107.667,87.613\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ENGINEERING_EQUIPMENT_PRODUCTION("07", "Engineering Equipment Production", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.5\" x2=\"305.5\" y1=\"306.5\" y2=\"356.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245.5\" x2=\"365.5\" y1=\"308.5\" y2=\"308.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"235.5\" x2=\"375.5\" y1=\"356.5\" y2=\"356.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"235.5\" x2=\"375.5\" y1=\"456.5\" y2=\"456.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"235.5\" x2=\"235.5\" y1=\"336.5\" y2=\"476.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"375.5\" x2=\"375.5\" y1=\"336.5\" y2=\"476.5\"/>\n  </g>";
            }
        },
        EQUIPMENT_MANUFACTURE("08", "Equipment Manufacture", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"305.5\" cy=\"396.5\" fill=\"none\" rx=\"60\" ry=\"60\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"365.5\" x2=\"415.5\" y1=\"396.5\" y2=\"396.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"347.927\" x2=\"383.281\" y1=\"354.074\" y2=\"318.718\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.5\" x2=\"305.5\" y1=\"336.5\" y2=\"286.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"263.074\" x2=\"227.718\" y1=\"354.074\" y2=\"318.718\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245.5\" x2=\"195.5\" y1=\"396.5\" y2=\"396.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"263.074\" x2=\"227.718\" y1=\"438.926\" y2=\"474.281\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.5\" x2=\"305.5\" y1=\"456.5\" y2=\"506.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"347.927\" x2=\"383.281\" y1=\"438.926\" y2=\"474.281\"/>\n  </g>";
            }
        },
        GOVERNMENT_LEADERSHIP("09", "Government Leadership", LandInstallationEntity.INSTALLATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 203.9658 432.5)\">GOV</text>\n  </g>";
            }
        },
        GRAY_LIST_LOCATION("10", "Gray List Location", LandInstallationEntity.INSTALLATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"82\" id=\"GRAY\" transform=\"matrix(1 0 0 1 184 422.834)\">GRAY</text>\n  </g>";
            }
        },
        MASS_GRAVE_SITE("11", "Mass Grave Site", LandInstallationEntity.INSTALLATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"box\">\n      <rect fill=\"none\" height=\"69.959\" stroke=\"#000000\" stroke-width=\"5\" width=\"34.979\" x=\"288.511\" y=\"369.15\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"292.008\" x2=\"319.992\" y1=\"391.41\" y2=\"391.41\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"372.33\" y2=\"435.93\"/>\n    </g>\n    <g>\n      <g id=\"box_1_\">\n        <rect fill=\"none\" height=\"69.958\" stroke=\"#000000\" stroke-width=\"5\" width=\"34.979\" x=\"245.264\" y=\"346.891\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"248.762\" x2=\"276.745\" y1=\"369.15\" y2=\"369.15\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"262.753\" x2=\"262.753\" y1=\"350.071\" y2=\"413.67\"/>\n      </g>\n    </g>\n    <g>\n      <g id=\"box_2_\">\n        <rect fill=\"none\" height=\"69.958\" stroke=\"#000000\" stroke-width=\"5\" width=\"34.979\" x=\"331.758\" y=\"346.891\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"335.255\" x2=\"363.239\" y1=\"369.15\" y2=\"369.15\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"349.247\" x2=\"349.247\" y1=\"350.071\" y2=\"413.67\"/>\n      </g>\n    </g>\n  </g>";
            }
        },
        MATERIEL("12", "Materiel", LandInstallationEntity.INSTALLATION, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup().getId()) {
                    case "1" -> "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 201.5 430.25)\">MAT</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <g id=\"text\">\n      <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 201.5 433.25)\">MAT</text>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 201.5 431.25)\">MAT</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"449.5\" y2=\"449.5\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 199.5 431.25)\">MAT</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        MINE("13", "Mine", LandInstallationEntity.INSTALLATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M353.05,369.771c-1.264,0.321-1.978,0.476-2.128,0.476 c-1.265,0-2.759-1.891-4.489-5.677l-0.477-0.943c-0.16-0.315-1.185-1.418-3.073-3.31l-33.646,33.604l40.84,40.78l-2.229,2.424 l-41.548-40.33l-41.673,40.336l-2.341-2.309l40.875-40.697l-33.568-34.051c-1.104,0.788-2.765,2.995-4.972,6.626 c-1.261,2.365-2.364,3.546-3.307,3.546c-0.161,0-0.874-0.154-2.128-0.476c-0.161,0-0.788,0-1.891,0 c1.258-5.323,4.328-10.134,9.218-14.443c4.883-4.305,9.373-6.459,13.478-6.459c1.258,0,5.276,1.307,12.059,3.924 c-9.737,0.617-16.177,2.151-19.32,4.614l33.661,34.14l33.888-33.841c-1.427-1.392-3.472-2.476-6.146-3.258 c-1.419-0.463-5.829-1.231-13.229-2.321c6.141-2.167,9.688-3.258,10.637-3.258c3.937,0,8.305,1.803,13.116,5.402 c4.811,3.605,8.156,7.753,10.052,12.449v3.054C353.756,369.771,353.204,369.771,353.05,369.771z\" stroke=\"#000000\" stroke-width=\"4\"/>\n  </g>";
            }
        },
        MISSILE_SPACE_SYSTEM_PRODUCTION("14", "Missile and Space System Production", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M276,472V340c0-25,60-25,60,0v132\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"472\" y2=\"320\"/>\n  </g>";
            }
        },
        NUCLEAR_DEFENSE("15", "Nuclear (Non CBRN Defense)", LandInstallationEntity.INSTALLATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M318.845,396.324L318.845,396.324c0,5.084-2.772,9.529-6.884,11.914l17.889,30.984 c14.803-8.579,24.779-24.595,24.779-42.898l0,0H318.845L318.845,396.324z\" stroke=\"#000000\" stroke-width=\"2.7526\"/>\n    <path d=\"M291.319,396.324L291.319,396.324h-35.784l0,0 c0,18.305,9.978,34.319,24.779,42.898l17.89-30.984C294.093,405.854,291.319,401.408,291.319,396.324z\" stroke=\"#000000\" stroke-width=\"2.7526\"/>\n    <path d=\"M305.082,382.561c2.505,0,4.853,0.676,6.877,1.851l17.891-30.987 c-7.289-4.226-15.751-6.647-24.768-6.647c-9.016,0-17.477,2.422-24.768,6.647l17.89,30.987 C300.229,383.237,302.577,382.561,305.082,382.561z\" stroke=\"#000000\" stroke-width=\"2.7526\"/>\n    <path d=\"M305.082,404.582c-4.553,0-8.258-3.705-8.258-8.258c0-4.553,3.705-8.258,8.258-8.258 c4.553,0,8.258,3.705,8.258,8.258C313.34,400.877,309.635,404.582,305.082,404.582L305.082,404.582z\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        PRINTED_MEDIA("16", "Printed Media", LandInstallationEntity.INSTALLATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"235\" x2=\"377\" y1=\"398\" y2=\"398\"/>\n    <circle cx=\"306\" cy=\"373.129\" fill=\"none\" r=\"20.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"305.88\" cy=\"422.515\" fill=\"none\" r=\"20.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        SAFE_HOUSE("17", "Safe House", LandInstallationEntity.INSTALLATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"86\" transform=\"matrix(1 0 0 1 187.5 422.5)\">SAFE</text>\n  </g>";
            }
        },
        WHITE_LIST_LOCATION("18", "White List Location", LandInstallationEntity.INSTALLATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" id=\"WHT\" transform=\"matrix(1 0 0 1 196.5 433.5)\">WHT</text>\n  </g>";
            }
        },
        TENTED_CAMP("19", "Tented Camp", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" points=\"305,333.5 360,358.5 390,458.5 220,458.5 250,358.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        WAREHOUSE_STORAGE_FACILITY("20", "Warehouse/Storage Facility", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <polygon fill=\"none\" points=\"216.793,349.295 316.793,349.295 316.793,316.295 331.793,316.295 331.793,349.295 351.793,349.295 351.793,316.295 366.793,316.295 366.793,349.295 396.793,349.295 396.793,445.295 216.793,445.295\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g>\n      <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 224 416.2949)\">STOR</text>\n    </g>\n  </g>";
            }
        },
        LAW_ENFORCEMENT("21", "Law Enforcement", LandInstallationEntity.INSTALLATION, GraphicType.NA),
        EMERGENCY_OPERATION("22", "Emergency Operation", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"396\" rx=\"80\" ry=\"80\" stroke=\"#000000\"/>\n    <polygon fill=\"#FFFFFF\" points=\"306,316 375,436 237,436\" stroke=\"#000000\" stroke-linejoin=\"bevel\"/>\n  </g>";
            }
        },
        HOUSE("23", "House", LandInstallationEntity.INSTALLATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M 270,443.382 V 396.025 H 260 L 309.77526,349.62992 360,396.025 h -10 v 47.357 h -30 v -40.365 h -20 v 40.365 z\" style=\"fill:#000000;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;fill-opacity:1\"/>\n  </g>";
            }
        },
        AGRICULTURE_FOOD_INFRASTRUCTURE("01", "Agriculture and Food Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(77.1236,57.34832)\">\n    <path d=\"m 237,272.2 v 1.6 h 23.8 c 0,0 11.4,-10.2 11.9,-10.8 -3.1,-4.6 -8.9,-9.2 -16.8,-9.2 h -1.6 c -7.7,0 -17.3,11.4 -17.3,18.4 z\" fill=\"#ffffff\" id=\"_96021888\"/>\n    <path d=\"m 237,290.6 c 2.7,0.6 9.1,4.3 12.1,5.8 5.6,2.7 4.3,7.4 7.9,9.8 0,-4.9 0,-9.7 0,-14.6 0,-6.2 1.8,-8.4 2.2,-12.4 H 237 Z\" fill=\"#ffffff\" id=\"_63611392\"/>\n    <path d=\"m 266.7,290.6 h 37.8 c 0,-11.4 -7.6,-20.5 -18.9,-20.5 h -1 c -10.6,-0.1 -17.9,9.6 -17.9,20.5 z\" fill=\"#ffffff\" id=\"_65261088\"/>\n    <path d=\"m 266.2,323 c 0,0.3 13.3,22.9 14.6,24.9 h -6.5 v 47 h 30.3 v -99.5 h -38.4 z\" fill=\"#ffffff\" id=\"_94931304\"/>\n    <path d=\"m 172.7,393.8 h -19.5 v -53.5 c 0,-2.5 16.9,-33.2 18.4,-34.1 2.5,-1.5 34.8,-17.8 35.2,-17.8 1.3,0 33.1,15.8 35.9,17.6 1.1,0.7 19.3,32.8 19.3,34.2 v 53.5 H 243 V 350 h -70.3 z m 93.5,-98.4 h 38.4 v 99.5 h -30.3 v -47 h 6.5 c -1.3,-2 -14.6,-24.6 -14.6,-24.9 z m 0.5,-4.8 c 0,-10.9 7.3,-20.6 17.9,-20.6 h 1.1 c 11.3,0 18.9,9.2 18.9,20.5 H 266.7 Z M 237,279.2 h 22.2 c -0.4,4.1 -2.2,6.2 -2.2,12.4 0,4.9 0,9.7 0,14.6 -3.6,-2.4 -2.3,-7.1 -7.9,-9.9 -3,-1.4 -9.4,-5.1 -12.1,-5.7 z m 0,-7 c 0,-7 9.5,-18.4 17.3,-18.4 h 1.6 c 7.8,0 13.7,4.6 16.8,9.2 -0.5,0.6 -11.9,10.8 -11.9,10.8 H 237 Z m -29.7,3.8 c -8,4.2 -16.4,7.9 -24.7,12 -4.3,2.2 -8.2,3.8 -12.4,6 -7,3.5 -5.7,1.7 -10,7.8 -2.3,3.2 -4.6,8.1 -6.7,11.7 -2.3,4 -4.7,7.5 -6.9,11.5 -3.9,7.2 -9,16.2 -13.4,22.8 h 7 V 404 H 184 v -43.2 h 47.6 V 404 h 83.2 V 292.7 c 0,-18.7 -10.6,-32.4 -29.2,-32.4 h -4.3 c -2,-7.3 -14.7,-16.2 -24.9,-16.2 h -1 c -15.9,0 -27.6,14.7 -27.6,30.3 v 11.4 L 207.3,276 Z\" id=\"_96394904\"/>\n    <path d=\"M 172.7,350 H 243 v 43.8 h 18.9 v -53.5 c 0,-1.4 -18.1,-33.5 -19.3,-34.2 -2.8,-1.9 -34.5,-17.7 -35.9,-17.7 -0.3,0 -32.6,16.3 -35.2,17.8 -1.4,0.9 -18.3,31.6 -18.3,34.1 v 53.5 h 19.5 z\" fill=\"#ffffff\" id=\"_94860488\"/>\n  </g>";
            }
        },
        BANKING_INFRASTRUCTURE("02", "Banking, Finance, and Insurance Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(68.22472,81.07865)\">\n      <path d=\"m 142,305.1 h -5.6 l -1.5,5.2 h 6.4 v 5.5 h -5 l -1.4,5.1 h 6.4 c 1.1,4.8 1.4,9.7 2.6,14.5 1.2,4.6 3.3,8.3 5.3,12.1 3.2,6.2 12.1,13 21.5,13 h 3.5 c 6.4,0 13.4,-3 16.7,-6.2 2.6,-2.6 9.1,-9.3 9.9,-13.1 l -1.6,-1 c -1.4,0.9 -5.9,7.3 -8.2,9.4 -2.4,2.1 -8.4,5.1 -12.7,5.1 h -4.5 c -12.8,0 -19.6,-19.9 -19.6,-33.8 H 188 c 1.2,0 2,-4 2.3,-5.1 h -36 v -5.5 h 37 c 1.4,0 1.8,-4.1 2.3,-5.1 h -39.1 c 0.3,-0.5 1.7,-9.5 2.1,-11.1 0.8,-3.4 2.4,-7.2 3.7,-9.9 2.5,-5 8,-11.6 15.4,-11.6 h 3.9 c 10.2,0 17.1,10.2 17.1,20.6 h 2.6 v -18.6 c 0,-2.2 -15.2,-6.1 -19.3,-6.1 h -5.2 c -9.7,0 -18.5,6.4 -22.8,12 -3.8,4.9 -9.8,16.4 -10,24.6 z\" id=\"_85660424\"/>\n      <path d=\"m 278.4,350.5 c 0,-2.6 2.4,-4.5 5.1,-4.5 h 1.6 c 2.3,0 3,1.2 4.8,1.6 -1,4.1 -2.6,9 -7.7,9 h -0.3 c -1.8,0 -3.5,-2.1 -3.5,-3.9 z m 21.2,-63.7 c 0,-6.8 3.8,-14.5 10.3,-14.5 h 2.3 c 11,0 4.6,14.5 11.6,14.5 h 1.2 c 2.2,0 4.5,-2.7 4.5,-5.1 v -1 c 0,-5.9 -7.8,-12.2 -14.2,-12.2 h -2.8 c -14.7,0 -23.5,13 -23.5,28 v 6.1 h -12.2 v 6.4 h 12.5 l 0.7,6.1 h -13.2 v 6.4 h 13.5 l 0.7,12.6 -0.1,8.4 -3.5,-0.4 h -3.2 c -5,0 -9.7,4.4 -9.7,9.3 0,5 2.5,9 7.4,9 h 1.3 c 4.5,0 10.1,-6.7 10.9,-10.3 1,0.3 7.3,5.2 8.9,6.2 2.7,1.8 6.8,4.1 11.1,4.1 h 3.5 c 8.6,0 16.7,-12.4 16.7,-21.6 -1.3,0 -0.6,-0.2 -1.9,-0.2 -0.8,0 -2.4,10.3 -12.5,10.3 h -3.2 c -3.9,0 -16.9,-3.8 -19.6,-5.1 1.4,-5.9 3.9,-11.6 3.9,-19 v -3.3 h 17 v -6.4 h -17.1 v -2.6 l -0.4,-3.5 h 17.4 v -6.4 h -17.6 l -0.8,-13.6 0.1,-2.2 z\" id=\"_87409168\"/>\n      <path d=\"m 238.2,321.2 c 1.3,0.3 8.4,6 9.6,7.2 3.2,3.1 4.8,5.2 5.6,10.8 1.1,8.2 -7,16.9 -15.2,17.1 V 321.2 Z M 234,303.5 c -4.8,-2.5 -12.4,-9.2 -12.9,-15.7 -0.6,-8.7 4.3,-14.8 12.9,-14.8 z m 4.2,-30.9 c 1.8,0.9 5.5,0.8 8.1,2.2 2.1,1.2 4.3,2.4 5.7,4.3 4.3,5.9 3.4,7 5.2,14.8 h 2.6 v -19 c 0,-2.3 -17.1,-6.1 -21.6,-6.1 V 262 H 234 v 6.8 c -11.6,0 -23.2,9.1 -23.2,20.9 v 1.9 c 0,6.8 4.7,13.1 8.6,16.1 2.7,2.1 11.8,9.6 14.6,10.3 v 38.3 c -5.8,0 -12,-2.8 -14.9,-5.7 -1.6,-1.6 -3.1,-4.1 -4,-6.3 -0.5,-1.3 -1,-7.6 -2.3,-7.6 h -2.3 v 19 c 1.7,0.1 7.9,2.6 10.6,3.3 3.1,0.8 8,1.5 12,1.5 h 1 v 8 h 4.2 v -8 c 13.4,0 25.7,-10.5 25.7,-24.1 0,-8.6 -5,-14.2 -9.9,-18.1 -5.4,-4.2 -10.3,-8.1 -15.9,-11.9 v -33.8 z\" id=\"_87516072\"/>\n    </g>\n  </g>";
            }
        },
        COMMERCIAL_INFRASTRUCTURE("03", "Commercial Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M316.683,326.387h11.154v33.463h24.699v-33.463h11.155v33.463h16.729v92.421H230.236V359.85h86.446 L316.683,326.387L316.683,326.387z M227.448,455.459h155.763v-98.796h-15.935V323.2H349.35v33.463h-17.927V323.2h-17.927v33.463 h-86.048V455.459z\" id=\"building\"/>\n    <text font-family=\"sans-serif\" font-size=\"85\" transform=\"matrix(1 0 0 1 281.3633 435)\">$</text>\n  </g>";
            }
        },
        EDUCATIONAL_FACILITIES_INFRASTRUCTURE("04", "Educational Facilities Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 255 339)\">FAC</text>\n      <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 255 339)\">FAC</text>\n    </g>\n    <path d=\"M303.099,414.184h-36.96v79.139h80.007v-79.139h-36.959v-29.566c0-1.6,16.307-7.549,18.828-8.563 c3.278-1.318,17.36-7.469,19.869-7.525c-0.697-0.954-36.709-15.653-39.133-15.653h-5.653V414.184z\" id=\"_63642984\"/>\n  </g>";
            }
        },
        ENERGY_FACILITY_INFRASTRUCTURE("05", "Energy Facility Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M308,498c-10,0-30-5-30-10v-35c-100-40-50-165,30-160\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g transform=\"translate(85 0)\">\n      <path d=\"M218,498c10,0,30-5,30-10v-35c100-40,50-165-30-160\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        MEDICAL_INFRASTRUCTURE("07", "Medical Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.NA),
        MILITARY_INFRASTRUCTURE("08", "Military Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(49.01942,48.05825)\">\n      <path d=\"M 317.52,377.76 305.04,417.12 210.72,417 188.88,351.36 c 0,-5.76 -7.32,-20.64 -7.32,-23.28 v -1.68 c 2.4,-0.6 33,-23.76 37.92,-27.24 3.48,-2.52 37.8,-27.72 37.92,-27.72 1.68,0 69,50.04 76.68,55.44 z M 170.76,324.12 c 0,0 15.12,46.68 16.56,50.28 2.4,6 15.96,46.8 16.32,51.12 h 107.64 c 1.56,-6.96 5.76,-17.52 8.28,-25.08 2.88,-8.76 5.28,-17.04 8.4,-25.68 1.56,-4.2 16.8,-50.52 16.8,-50.64 0,-1.2 -38.88,-28.8 -43.2,-32.16 -4.32,-3.24 -42.72,-31.32 -44.16,-31.32 -0.24,0 -39.48,28.56 -43.44,31.44 -4.32,3.24 -43.2,30.84 -43.2,32.04 z\" fill=\"#ffffff\" id=\"_88979200\"/>\n      <path d=\"m 208.08,334.92 2.16,9.24 0.72,-0.24 c 0,4.08 6.12,20.52 7.68,25.68 1.32,4.44 2.76,8.4 4.2,12.72 0.6,1.92 3.24,12 5.04,12 h 59.52 c 2.4,0 8.16,-21.48 9.36,-25.2 1.56,-4.68 8.16,-22.44 8.16,-26.4 1.32,-1.68 2.4,-3.84 2.4,-6.72 0,-2.04 -21.24,-16.2 -24.24,-18.24 -2.52,-1.68 -24.84,-18 -25.08,-18 -1.32,0 -22.08,15.6 -24.96,17.52 -3.36,2.4 -22.92,17.04 -24.96,17.64 z\" fill=\"#ffffff\" id=\"_145458120\"/>\n      <path d=\"m 208.08,334.92 c 2.04,-0.48 21.48,-15.24 24.96,-17.52 2.88,-2.04 23.64,-17.64 24.96,-17.64 0.12,0 22.44,16.32 25.08,18 3,2.04 24.24,16.2 24.24,18.24 0,2.88 -1.08,5.04 -2.28,6.84 0,3.96 -6.6,21.72 -8.16,26.4 -1.2,3.6 -7.08,25.2 -9.36,25.2 H 228 c -1.8,0 -4.44,-10.08 -5.04,-12 -1.44,-4.32 -3,-8.28 -4.32,-12.72 -1.56,-5.28 -7.68,-21.72 -7.68,-25.8 l -0.72,0.24 z m -7.92,-1.68 22.08,67.44 70.56,-0.12 21.84,-67.92 c -8.04,-4.32 -54.36,-40.8 -57.24,-40.8 -0.84,0 -51.48,37.56 -57.24,41.4 z\" id=\"_41045776\"/>\n      <path d=\"m 200.16,333.24 c 5.76,-3.84 56.4,-41.4 57.24,-41.4 2.88,0 49.2,36.48 57.24,40.8 l -21.72,67.92 -70.68,0.12 z m -8.88,-3.24 2.16,8.52 8.52,24.24 c 0,3.84 5.64,18.96 7.2,23.4 0.96,3.24 6.36,21.84 8.64,21.84 l 81.36,-0.12 13.8,-43.56 c 1.08,-1.56 11.28,-31.56 11.28,-33.48 0,-2.4 -59.76,-42.96 -66.6,-49.08 z\" fill=\"#ffffff\" id=\"_87773328\"/>\n      <path d=\"m 257.76,281.88 c 6.84,6.12 66.6,46.68 66.6,49.08 0,1.92 -10.32,31.8 -11.28,33.48 L 299.16,407.88 217.8,408 c -2.16,0 -7.56,-18.6 -8.76,-21.84 -1.56,-4.56 -7.2,-19.56 -7.2,-23.4 l -8.4,-24.24 -2.16,-8.52 z m 76.32,45 c -7.68,-5.28 -75,-55.44 -76.68,-55.44 -0.24,0 -34.44,25.32 -37.92,27.72 -4.92,3.48 -35.64,26.64 -37.92,27.24 v 1.68 c 0,2.52 7.32,17.52 7.32,23.28 l 21.84,65.64 94.32,0.12 12.48,-39.24 z\" id=\"_38029144\"/>\n      <path d=\"m 170.76,324.12 c 0,-1.2 38.88,-28.8 43.32,-32.04 3.84,-2.88 43.2,-31.44 43.44,-31.44 1.44,0 39.72,28.08 44.04,31.32 4.32,3.24 43.2,30.96 43.2,32.16 0,0.12 -15.24,46.44 -16.8,50.64 -3.12,8.52 -5.52,16.92 -8.4,25.68 -2.52,7.56 -6.72,18.12 -8.28,25.08 H 203.64 c -0.36,-4.32 -13.92,-45.12 -16.32,-51.12 -1.44,-3.6 -16.56,-50.28 -16.56,-50.28 z m 20.88,96.24 5.04,15.24 122.52,0.12 21.12,-65.88 16.56,-51.36 -99.36,-71.64 -99.12,72.12 33.24,101.4 z\" id=\"_83657320\"/>\n    </g>\n  </g>";
            }
        },
        POSTAL_SERVICES_INFRASTRUCTURE("09", "Postal Services Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"#FFFFFF\" height=\"96.385\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" width=\"184.688\" x=\"213.287\" y=\"347.615\"/>\n    <polyline fill=\"none\" points=\"213.287,360.013 305.63,398.148 397.975,360.013\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"3\"/>\n  </g>";
            }
        },
        PUBLIC_VENUES_INFRASTRUCTURE("10", "Public Venues Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(74 57)\">\n      <path d=\"M 148.4 333.8 c 0 3.3 -1.7 6.5 -1.8 10.7 C 146.5 349 146.1 352.2 146.1 357 v 8 l 1.4 8.9 h 6.8 L 152.4 357.8 V 353.4 c 0 -20.2 12.4 -44.7 23.2 -53.7 c 13.9 -11.5 29.1 -22.8 54.2 -22.8 H 232 c 22.4 0 42.7 10.9 53.9 22.1 c 8 8 10.3 11.8 16.1 21.8 c 3.5 6 8.3 20.9 8.3 30 v 10.7 c 0 3.5 -1.8 7.6 -1.8 11.1 v 1.3 h 6.8 l 1.6 -16 V 348.5 c 0 -4 -2.5 -13.1 -3.6 -16.5 C 311.4 325.7 310.1 323 307.5 317.8 C 302.9 308.3 298.1 301.7 290.8 294.6 C 279.3 283.2 256.9 270.7 234.2 270.7 H 228 c -19.6 0 -41.5 10.2 -51.5 19.7 C 169.4 297.1 165.4 300.7 159.7 309.2 C 157 313.3 155.9 316.6 153.5 320.7 C 151.2 324.6 150.5 330.6 148.4 333.8 z\" id=\"_100900712\"/>\n      <polygon id=\"_238946784\" points=\"148.4,390.3 313.8,390.3 313.8,383.2 148.4,383.2\"/>\n      <polygon id=\"_234617384\" points=\"141.2,405.9 321.4,405.9 321.4,398.3 141.2,398.3\"/>\n    </g>\n    <ellipse cx=\"275\" cy=\"378\" fill=\"none\" rx=\"12\" ry=\"12\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"335\" cy=\"378\" fill=\"none\" rx=\"12\" ry=\"12\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"275\" x2=\"275\" y1=\"389\" y2=\"429\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"335\" x2=\"335\" y1=\"389\" y2=\"429\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"263\" x2=\"287\" y1=\"403\" y2=\"403\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"323\" x2=\"347\" y1=\"403\" y2=\"403\"/>\n  </g>";
            }
        },
        TELECOMMUNICATIONS_INFRASTRUCTURE("12", "Telecommunications Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(62.94596,89.25564)\">\n      <path d=\"m 190.52,293.37 v 7.37 c 0,4.84 0.55,7.7 2.09,11.22 0.44,0.99 3.74,10.01 3.85,10.01 l 0.88,-0.11 3.63,-7.37 c -2.2,-2.97 -3.52,-10.12 -3.52,-15.62 v -4.4 c 0,-9.35 5.83,-20.68 10.56,-25.63 4.4,-4.51 14.63,-13.75 22.77,-13.97 l -1.1,-6.93 c -17.6,1.43 -39.16,25.63 -39.16,45.43 z\" id=\"_42218880\"/>\n      <path d=\"m 163.79,293.37 v 12.87 c 0,10.56 13.42,40.81 19.8,42.57 0.33,-1.32 2.42,-5.5 2.42,-6.38 0,0 -5.17,-7.37 -5.83,-8.58 -1.76,-3.3 -3.3,-5.94 -4.84,-9.57 -2.53,-6.49 -4.62,-14.96 -4.62,-23.98 v -5.94 c 0,-20.02 8.36,-32.34 17.27,-43.67 3.41,-4.4 11.66,-11 16.72,-13.97 3.52,-2.09 6.16,-3.52 10.23,-5.17 1.32,-0.55 11.33,-3.19 11.33,-4.07 l -0.55,-6.38 c -5.94,0.22 -19.91,6.6 -24.09,9.13 -7.92,4.84 -12.1,9.02 -18.37,15.29 -9.02,9.02 -19.47,29.92 -19.47,47.85 z\" id=\"_95654976\"/>\n      <path d=\"m 252.78,254.76 c 15.07,1.21 33.33,22.88 33.33,40.15 v 5.39 c 0,3.74 -3.41,13.75 -3.41,13.86 0,0.55 3.08,7.15 3.41,7.92 l 0.44,0.22 3.96,-8.58 0.33,-1.43 1.65,-14.85 0.44,-1.1 -2.42,-14.85 c -1.76,-0.66 -1.54,-3.52 -2.75,-5.61 -1.1,-1.98 -2.09,-4.07 -3.19,-5.72 -2.64,-4.07 -4.62,-6.38 -8.03,-9.79 -5.39,-5.5 -14.41,-10.45 -23.1,-12.54 z\" id=\"_230091728\"/>\n      <path d=\"m 256.74,228.03 c 17.38,4.07 27.28,11.44 37.84,22.22 7.48,7.59 18.15,27.5 18.15,42.24 v 9.9 c 0,5.17 -3.63,19.14 -5.61,22.55 -1.76,2.86 -2.97,5.94 -4.73,9.02 -0.66,1.1 -5.94,8.25 -5.94,8.47 0,1.65 2.42,4.07 2.97,6.38 4.18,-1.1 11.88,-15.84 14.19,-20.46 3.08,-6.27 6.71,-19.58 6.71,-28.49 v -8.91 c 0,-0.22 -2.31,-12.32 -2.53,-13.75 -0.66,-2.2 -3.52,-9.13 -4.62,-11.88 -2.2,-5.5 -9.13,-15.95 -13.09,-20.02 -8.91,-9.02 -26.4,-22.88 -42.24,-24.2 z\" id=\"_230091784\"/>\n      <path d=\"m 266.2,346.83 10.23,33.55 -0.44,0.33 -30.47,-20.9 z m -49.17,0.11 19.91,12.87 -30.25,21.12 z m 24.42,-24.42 22.11,20.57 c -4.29,1.21 -20.13,14.08 -22,14.08 -0.44,0 -20.57,-13.42 -21.45,-14.52 z m 13.2,-12.1 7.81,24.53 L 245.3,319 Z m -26.29,0.33 9.46,8.14 -17.27,16.06 z m 5.17,-2.42 15.95,-0.11 -8.03,8.03 z m 6.49,-41.14 c -0.11,1.54 -0.44,1.76 -0.44,3.41 v 4.95 h -7.48 c -1.21,0 -1.98,0.77 -1.98,1.98 0,1.32 0.22,1.32 0.55,2.42 1.1,0.22 1.1,0.55 2.42,0.55 h 6.38 v 6.93 h -11.33 c -1.54,0 -2.97,0.44 -2.97,1.98 0,1.21 0.77,1.98 1.98,1.98 h 12.32 v 12.32 h -11.33 c -1.32,0 -1.32,0.22 -2.2,0.55 l -6.27,19.8 -2.53,8.03 -10.34,33.22 -2.86,7.81 c 0,5.06 -3.41,8.69 -3.41,13.86 0,1.1 0.22,0.55 0.55,1.98 h 1.32 c 1.43,0 37.73,-25.74 38.61,-25.74 1.54,0 35.42,23.43 39.6,26.18 1.1,-0.55 2.42,-0.88 2.42,-2.42 v -1.54 c 0,-0.11 -3.74,-11.11 -4.29,-12.54 -0.88,-2.75 -3.52,-10.67 -3.85,-13.09 l -2.53,-7.92 -10.34,-33.11 -2.2,-8.58 c -2.42,-0.99 -0.66,-6.38 -3.96,-6.38 h -11.88 v -12.43 h 11.88 c 1.21,0 1.98,-0.77 1.98,-1.98 0,-1.21 -0.77,-1.98 -1.98,-1.98 h -11.88 v -6.93 h 5.94 c 1.65,0 3.41,-0.88 3.41,-2.42 v -0.55 c 0,-1.21 -0.77,-1.98 -1.98,-1.98 h -7.37 v -6.38 c 0,-0.99 -1.43,-2.42 -1.98,-2.42 -0.11,-0.11 -1.76,0.33 -1.98,0.44 z\" id=\"_42189704\"/>\n    </g>\n  </g>";
            }
        },
        TRANSPORTATION_INFRASTRUCTURE("13", "Transportation Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"305\" cy=\"396\" fill=\"none\" rx=\"80\" ry=\"80\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"241\" x2=\"369\" y1=\"352\" y2=\"440\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"241\" x2=\"369\" y1=\"440\" y2=\"352\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"316\" y2=\"476\"/>\n  </g>";
            }
        },
        WATER_SUPPLY_INFRASTRUCTURE("14", "Water Supply Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"293\" x2=\"343\" y1=\"348\" y2=\"348\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"318\" x2=\"318\" y1=\"373\" y2=\"348\"/>\n    <path d=\"M218,373h120c40,0,48,45,50,75\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final LandInstallationEntity entity;
    private final GraphicType graphicType;

    LandInstallationEntityType(String id, String label, LandInstallationEntity entity, GraphicType graphicType) {
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
        return LandInstallationSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}