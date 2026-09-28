package io.github.ctgnz.jmsfx.battleorder.landinstallation;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.battleorder.IconBounds;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum LandInstallationEntitySubType implements EntitySubType {
        BRIDGE("01", "Bridge", LandInstallationEntityType.ENGINEERING_EQUIPMENT_PRODUCTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"208,441 233,416 373,416 398,441\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"208,351 233,376 373,376 398,351\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        DISPLACED_PERSONS_CAMP("01", "Displaced Persons / Refugee / Evacuees Camp", LandInstallationEntityType.TENTED_CAMP, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <polygon fill=\"none\" points=\"304,359.265 353.823,381.912 381,472.5 227,472.5 254.177,381.912\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g>\n      <text font-family=\"sans-serif\" font-size=\"50\" transform=\"matrix(1 0 0 1 234.542 339.5)\">DPRE</text>\n    </g>\n  </g>";
            }
        },
        TRAINING_CAMP("02", "Training Camp", LandInstallationEntityType.TENTED_CAMP, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <polygon fill=\"none\" points=\"304,359.265 353.823,381.912 381,472.5 227,472.5 254.177,381.912\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g>\n      <text font-family=\"sans-serif\" font-size=\"50\" transform=\"matrix(1 0 0 1 253.542 339.5)\">TNG</text>\n    </g>\n  </g>";
            }
        },
        GRENADE_CACHE("01", "Grenade Cache", LandInstallationEntityType.WAREHOUSE_STORAGE_FACILITY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"m 315.95362,358.34446 c 14.83314,-0.22474 26.88756,10.0204 29.35975,26.42676 m -52.84611,-22.90964 v -9.419 h 21.982 v 9.419 z m 11.34098,0.52158 c -21.5606,0 -39.0918,17.5312 -39.0918,39.0918 0,21.5606 17.5312,39.09375 39.0918,39.09375 21.5606,0 39.09375,-17.53314 39.09375,-39.09375 0,-21.5606 -17.53314,-39.0918 -39.09375,-39.0918 z m 0,5 c 18.8584,0 34.09375,15.23338 34.09375,34.0918 0,18.85842 -15.23534,34.09376 -34.09375,34.09375 -18.8584,0 -34.0918,-15.23533 -34.0918,-34.09375 0,-18.8584 15.23338,-34.0918 34.0918,-34.0918 z m -36.70507,32.18554 v 5.01563 h 73.26562 v -5.01563 z\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        BUREAU_ATF("01", "Bureau of Alcohol-Tobacco-Firearms and Explosives (ATF) (Department of Justice)", LandInstallationEntityType.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" transform=\"matrix(1 0 0 1 203 435.25)\">ATF</text>\n  </g>";
            }
        },
        DRUG_ENFORCEMENT_ADMINISTRATION_DEA("04", "Drug Enforcement Administration (DEA)", LandInstallationEntityType.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"102\" transform=\"matrix(1 0 0 1 194 435.25)\">DEA</text>\n  </g>";
            }
        },
        FEDERAL_BUREAU_INVESTIGATION_FBI("06", "Federal Bureau of Investigation (FBI)", LandInstallationEntityType.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 207 438.25)\">FBI</text>\n  </g>";
            }
        },
        POLICE("07", "Police", LandInstallationEntityType.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M264.659,353.621c0,71.906,16.594,77.438,45.909,88.5\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M353.159,353.621c0,71.906-16.594,77.438-45.909,88.5\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M263,353.621c23.785,13.828,23.785,13.828,45.91,0 c22.125,13.828,22.125,13.828,45.909,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        UNITED_STATES_SECRET_SERVICE_USSS("09", "United States Secret Service (USSS)", LandInstallationEntityType.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"84\" id=\"USSS\" transform=\"matrix(1 0 0 1 191.5 426.5)\">USSS</text>\n  </g>";
            }
        },
        TRANSPORTATION_SECURITY_ADMINISTRATION_TSA("10", "Transportation Security Administration (TSA)", LandInstallationEntityType.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"106\" transform=\"matrix(1 0 0 1 196 437.25)\">TSA</text>\n  </g>";
            }
        },
        COAST_GUARD("11", "Coast Guard", LandInstallationEntityType.LAW_ENFORCEMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"240.001,468.194 199.786,387.765 250.055,387.765 250.055,322.416 360.646,322.416 360.646,387.765 410.914,387.765 370.698,468.194\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polygon points=\"385.78,387.765 345.566,468.194 320.432,468.194 360.646,387.765\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        FIRE_STATION("01", "Fire Station", LandInstallationEntityType.EMERGENCY_OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline points=\"255,316 355,316 305,396 355,476 255,476 305,396\" stroke=\"#000000\"/>\n    <polyline points=\"225,346 225,446 305,396 385,446 385,346 305,396\" stroke=\"#000000\"/>\n    <ellipse cx=\"305\" cy=\"396\" rx=\"65\" ry=\"65\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        EMERGENCY_MEDICAL_OPERATION("02", "Emergency Medical Operation", LandInstallationEntityType.EMERGENCY_OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(76.8932,74.97087)\">\n    <polygon points=\"144.8,339.8 167.5,379.4 206.1,357.2 206.2,401.4 251.8,401.4 251.8,357.4 290.4,379.5 313.5,340.2 275.3,317.4 313.7,295 290.5,255.4 251.9,277.6 251.8,232.9 206.2,232.9 206.2,277.4 167.6,255.4 144.9,295 183,317.3\"/>\n  </g>";
            }
        },
        COMMERCIAL_FOOD_DISTRIBUTION("03", "Commercial Food Distribution Center", LandInstallationEntityType.AGRICULTURE_FOOD_INFRASTRUCTURE, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(95 115.714)\">\n      <path d=\"M365,389.285c-60,0-60,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M365,389.285c-30,0-30,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 244.3418 347.0001)\">COM</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"148.377\" x2=\"463.622\" y1=\"444\" y2=\"444\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(95 115.714)\">\n      <path d=\"M365,389.285c-60,0-60,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M365,389.285c-30,0-30,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 244.3418 347.0001)\">COM</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.5\" x2=\"485.5\" y1=\"444\" y2=\"444\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(95 115.714)\">\n      <path d=\"M365,389.285c-60,0-60,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M365,389.285c-30,0-30,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 244.3418 347.0001)\">COM</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"444\" y2=\"444\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(95 115.714)\">\n      <path d=\"M365,389.285c-60,0-60,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M365,389.285c-30,0-30,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 244.3418 347.0001)\">COM</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"181\" x2=\"431\" y1=\"444\" y2=\"444\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        FOOD_DISTRIBUTION("05", "Food Distribution", LandInstallationEntityType.AGRICULTURE_FOOD_INFRASTRUCTURE, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"149.696\" x2=\"462.304\" y1=\"446\" y2=\"446\"/>\n    <path d=\"M301.169,396.149c0-19.191,12.044-35.563,28.983-41.987 c-4.949-1.877-10.313-2.914-15.918-2.914c-24.799,0-44.902,20.103-44.902,44.901c0,24.798,20.103,44.901,44.902,44.901 c5.604,0,10.969-1.036,15.918-2.914C313.213,431.711,301.169,415.341,301.169,396.149z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <path d=\"M301.169,396.149c0-19.191,12.044-35.563,28.983-41.987 c-4.949-1.877-10.313-2.914-15.918-2.914c-24.799,0-44.902,20.103-44.902,44.901c0,24.798,20.103,44.9,44.902,44.9 c5.604,0,10.969-1.036,15.918-2.914C313.213,431.711,301.169,415.341,301.169,396.149z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"446\" y2=\"446\"/>\n    <path d=\"M301.169,396.149c0-19.191,12.044-35.563,28.983-41.987 c-4.949-1.877-10.313-2.914-15.918-2.914c-24.799,0-44.902,20.103-44.902,44.901c0,24.798,20.103,44.901,44.902,44.901 c5.604,0,10.969-1.036,15.918-2.914C313.213,431.711,301.169,415.341,301.169,396.149z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"183\" x2=\"429\" y1=\"446\" y2=\"446\"/>\n    <path d=\"M301.169,396.149c0-19.191,12.044-35.563,28.983-41.987 c-4.949-1.877-10.313-2.914-15.918-2.914c-24.799,0-44.902,20.103-44.902,44.901c0,24.798,20.103,44.901,44.902,44.901 c5.604,0,10.969-1.036,15.918-2.914C313.213,431.711,301.169,415.341,301.169,396.149z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        FOOD_PRODUCTION_CENTER("06", "Food Production Center", LandInstallationEntityType.AGRICULTURE_FOOD_INFRASTRUCTURE, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(95 115.714)\">\n      <path d=\"M365,389.285c-60,0-60,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M365,389.285c-30,0-30,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 232.8818 347.0001)\">PROD</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"148.377\" x2=\"463.622\" y1=\"444\" y2=\"444\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(95 115.714)\">\n      <path d=\"M365,389.285c-60,0-60,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M365,389.285c-30,0-30,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 234.8818 347.0001)\">PROD</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.5\" x2=\"485.5\" y1=\"444\" y2=\"444\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(95 115.714)\">\n      <path d=\"M365,389.285c-60,0-60,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M365,389.285c-30,0-30,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 234.8818 347.0001)\">PROD</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"444\" y2=\"444\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(95 115.714)\">\n      <path d=\"M365,389.285c-60,0-60,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M365,389.285c-30,0-30,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 235.8818 347.0001)\">PROD</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"181\" x2=\"431\" y1=\"444\" y2=\"444\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        FOOD_RETAIL("07", "Food Retail", LandInstallationEntityType.AGRICULTURE_FOOD_INFRASTRUCTURE, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(95 115.714)\">\n      <path d=\"M365,389.285c-60,0-60,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M365,389.285c-30,0-30,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 264.46 348.0001)\">RTL</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"148.377\" x2=\"463.622\" y1=\"444\" y2=\"444\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(95 115.714)\">\n      <path d=\"M365,389.285c-60,0-60,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M365,389.285c-30,0-30,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 261.46 347.0001)\">RTL</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.5\" x2=\"485.5\" y1=\"444\" y2=\"444\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(95 115.714)\">\n      <path d=\"M365,389.285c-60,0-60,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M365,389.285c-30,0-30,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 261.46 347.0001)\">RTL</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"444\" y2=\"444\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(95 115.714)\">\n      <path d=\"M365,389.285c-60,0-60,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M365,389.285c-30,0-30,115.001,0,115.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 261.46 347.0001)\">RTL</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"181\" x2=\"431\" y1=\"444\" y2=\"444\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        ECONOMIC_INFRASTRUCTURE_ASSET("04", "Economic Infrastructure Asset", LandInstallationEntityType.BANKING_INFRASTRUCTURE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"78\" transform=\"matrix(1 0 0 1 192 421.6367)\">ECON</text>\n  </g>";
            }
        },
        FINANCIAL_SERVICES_OTHER("07", "Financial Services-Other", LandInstallationEntityType.BANKING_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 251.1182 350)\">OTH</text>\n    <text font-family=\"sans-serif\" font-size=\"140\" transform=\"matrix(1 0 0 1 267.0693 482)\">$</text>\n  </g>";
            }
        },
        HAZARDOUS_MATERIAL_STORAGE("05", "Hazardous Material Storage", LandInstallationEntityType.COMMERCIAL_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(10.57282,24.02913)\">\n      <path d=\"m 240,385.35 v 16.05 h 13.35 V 372 c -1.8,1.2 -13.35,11.7 -13.35,13.35 z\" fill=\"#ffffff\" id=\"_65846384\"/>\n      <polygon fill=\"#ffffff\" id=\"_65247944\" points=\"285.6,401.4 285.45,340.35 269.85,355.65 269.4,401.4\"/>\n      <path d=\"m 304.35,401.4 h 16.05 v -44.85 c 0,-1.65 -14.1,-14.7 -16.05,-16.05 z\" fill=\"#ffffff\" id=\"_64268320\"/>\n      <path d=\"m 336.45,401.4 h 13.35 v -14.7 c 0,-2.55 -0.15,-0.3 0.6,-1.8 L 336.45,372 Z\" fill=\"#ffffff\" id=\"_64249792\"/>\n      <polygon fill=\"#ffffff\" id=\"_94571432\" points=\"222.45,403.5 294.75,473.25 367.2,403.5\"/>\n      <path d=\"M 222.45,403.5 H 367.2 l -72.45,69.75 z m 81.9,-63 c 1.95,1.35 16.05,14.4 16.05,16.05 v 44.85 h -16.05 z m -18.9,-0.15 0.15,61.05 h -16.2 l 0.45,-45.75 z m -45.45,45 c 0,-1.65 11.7,-12.15 13.35,-13.35 v 29.55 H 240 Z M 336.45,372 350.4,384.9 c -0.75,1.65 -0.6,-0.75 -0.6,1.8 v 14.7 h -13.35 z m 35.4,30.75 -76.8,-75.15 -76.8,75 76.65,74.7 z\" id=\"_94539784\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 232.2461 347)\">STOR</text>\n  </g>";
            }
        },
        INDUSTRIAL_SITE("06", "Industrial Site", LandInstallationEntityType.COMMERCIAL_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M316.683,332.387h11.154v33.463h24.699v-33.463h11.155v33.463h16.729v92.421H230.236V365.85h86.446 L316.683,332.387L316.683,332.387z M227.448,461.459h155.763v-98.796h-15.935V329.2H349.35v33.463h-17.927V329.2h-17.927v33.463 h-86.048V461.459z\" id=\"_87876656\"/>\n  </g>";
            }
        },
        PHARMACEUTICAL_MANUFACTURER("08", "Pharmaceutical Manufacturer", LandInstallationEntityType.COMMERCIAL_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(74,77)\">\n      <path d=\"M 207.8 317.1 h 18.6 c 3.1 0 9.1 -4.1 9.1 -7.3 V 303.5 c 0 -2.4 -5.6 -6.8 -8.6 -6.8 H 207.8 V 317.1 z\" fill=\"#FFFFFF\" id=\"_65378808\"/>\n      <path d=\"M 207.8 296.7 h 19.1 c 3.1 0 8.6 4.5 8.6 6.8 v 6.4 c 0 3.2 -6 7.3 -9.1 7.3 H 207.8 V 296.7 z M 195.6 363 h 12.3 V 330.3 l 4.3 0.2 l 18.9 24.9 L 209.2 382.9 l 14.7 0.2 l 14.8 -17.4 c 3.1 0.8 10.4 14.8 14.1 17.2 h 15.4 C 266 378.7 247.3 357 247.3 355.3 c 0 -0.8 18.6 -24.3 20.4 -25.9 L 252.6 329.2 L 238.5 344.6 L 227.8 330.3 C 240.9 327.2 248.7 322 248.7 305.8 V 304.4 c 0 -5 -4.2 -11.8 -6.9 -14.4 C 239.2 287.5 231.6 284 226.4 284 H 195.6 V 363 z\" id=\"_95912048\"/>\n      <path d=\"M 195.6 284 h 30.9 c 5.2 0 12.7 3.5 15.3 6 c 2.7 2.7 6.9 9.4 6.9 14.4 v 1.4 c 0 16.2 -7.8 21.5 -20.9 24.5 l 10.7 14.3 l 14.1 -15.4 l 15.2 0.2 C 265.9 331 247.3 354.5 247.3 355.3 c 0 1.8 18.6 23.5 20.9 27.7 H 252.8 c -3.7 -2.5 -11 -16.4 -14.1 -17.2 L 223.9 383.1 L 209.2 382.9 l 21.9 -27.6 L 212.2 330.5 L 207.8 330.3 V 363 H 195.6 V 284 z M 245.1 280.4 H 146.6 v 105.3 h 171.1 V 280.4 H 298.6 V 242.2 H 285.9 v 38.1 H 257.8 V 242.2 H 245.1 V 280.4 z\" fill=\"#FFFFFF\" id=\"_96956424\"/>\n      <path d=\"M 245.1 242.2 h 12.7 v 38.1 h 28.1 V 242.2 h 12.7 v 38.1 h 19.1 v 105.3 H 146.6 V 280.4 h 98.5 V 242.2 z M 143.4 389.3 h 177.5 V 277.2 H 302.7 V 238.6 H 282.3 v 38.6 H 261.8 V 238.6 H 241.4 v 38.6 h -98 V 389.3 z\" id=\"_66485456\"/>\n    </g>\n  </g>";
            }
        },
        COLLEGE_UNIVERSITY("01", "College/University", LandInstallationEntityType.EDUCATIONAL_FACILITIES_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 255 339)\">COL</text>\n      <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 255 339)\">COL</text>\n    </g>\n    <path d=\"M303.099,414.184h-36.96v79.139h80.007v-79.139h-36.959v-29.566c0-1.6,16.307-7.549,18.828-8.563 c3.278-1.318,17.36-7.469,19.869-7.525c-0.697-0.954-36.709-15.653-39.133-15.653h-5.653V414.184z\" id=\"_63642984\"/>\n  </g>";
            }
        },
        SCHOOL("02", "School", LandInstallationEntityType.EDUCATIONAL_FACILITIES_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M303.099,386.184h-36.96v79.138h80.007v-79.138h-36.959v-29.567c0-1.6,16.307-7.549,18.828-8.563 c3.278-1.318,17.36-7.469,19.869-7.525c-0.697-0.954-36.709-15.653-39.133-15.653h-5.653V386.184z\" id=\"_63642984\"/>\n  </g>";
            }
        },
        ELECTRIC_POWER("01", "Electric Power", LandInstallationEntityType.ENERGY_FACILITY_INFRASTRUCTURE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M307.271,437.906c-4.377,0-13.133-2.189-13.133-4.378v-15.323 c-43.78-17.512-21.89-72.236,13.133-70.047\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g transform=\"translate(85 0)\">\n      <path d=\"M220.083,437.906c4.378,0,13.134-2.189,13.134-4.378v-15.323 c43.779-17.512,21.891-72.236-13.134-70.047\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        GENERATION_STATION("02", "Generation Station", LandInstallationEntityType.ENERGY_FACILITY_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"scale(0.7) translate(87.1429 135.714)\">\n      <path d=\"M351.429,573.572c-9.999,0-29.999-5-29.999-10v-35 c-100-40-50-165,29.999-160\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <g transform=\"translate(85 0)\">\n        <path d=\"M261.429,573.572c9.999,0,29.999-5,29.999-10v-35 c100-40,50-165-29.999-160\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      </g>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 249.6582 336.0001)\">GEN</text>\n  </g>";
            }
        },
        NATURAL_GAS_FACILITY("03", "Natural Gas Facility", LandInstallationEntityType.ENERGY_FACILITY_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <path d=\"M308,498c-10,0-30-5-30-10v-35c-100-40-50-165,30-160\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <g transform=\"translate(85 0)\">\n        <path d=\"M218,498c10,0,30-5,30-10v-35c100-40,50-165-30-160\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      </g>\n    </g>\n    <g>\n      <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 240.5 413)\">NG</text>\n    </g>\n  </g>";
            }
        },
        PETROLEUM_GAS_OIL("05", "Petroleum/Gas/Oil", LandInstallationEntityType.ENERGY_FACILITY_INFRASTRUCTURE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"306,408.679 268.649,349.985 343.351,349.985 306,408.679 306,446.029\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MEDICAL("01", "Medical", LandInstallationEntityType.MEDICAL_INFRASTRUCTURE, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"224.916\" y2=\"567.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"132\" x2=\"480\" y1=\"396\" y2=\"396\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"273.6\" y2=\"517.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"131.5\" x2=\"479.5\" y1=\"396\" y2=\"396\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"264\" y2=\"528\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"396\" y2=\"396\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"228.5\" y2=\"556.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"139.5\" x2=\"473.5\" y1=\"396\" y2=\"396\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        MTF_HOSPITAL("02", "Medical Treatment Facility (Hospital)", LandInstallationEntityType.MEDICAL_INFRASTRUCTURE, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"224.916\" y2=\"567.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"132\" x2=\"480\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"228.5\" x2=\"228.5\" y1=\"365.5\" y2=\"425.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"382.5\" x2=\"382.5\" y1=\"365.5\" y2=\"425.5\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"273.6\" y2=\"517.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"131.5\" x2=\"479.5\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"231.5\" x2=\"231.5\" y1=\"364.5\" y2=\"424.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"385.5\" x2=\"385.5\" y1=\"364.5\" y2=\"424.5\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"264\" y2=\"528\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"228.5\" x2=\"228.5\" y1=\"365.5\" y2=\"425.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"382.5\" x2=\"382.5\" y1=\"365.5\" y2=\"425.5\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"228.5\" y2=\"556.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"139.5\" x2=\"473.5\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"228.5\" x2=\"228.5\" y1=\"365.5\" y2=\"425.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"382.5\" x2=\"382.5\" y1=\"365.5\" y2=\"425.5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        MILITARY_ARMORY("01", "Military Armory", LandInstallationEntityType.MILITARY_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M313.72,408.525l81.017,53.625l-5.125,8.595l-84.477-55.875l-84.439,54.425l-5.32-8.465l79.48-51.926L215,356.805 l5.09-8.635l84.475,55.135L389.62,347l5.42,8.39L313.72,408.525z\"/>\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 251.54 357)\">RES</text>\n  </g>";
            }
        },
        MILITARY_BASE("02", "Military Base", LandInstallationEntityType.MILITARY_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(110 138) scale(5 5)\">\n      <path d=\"M40.744,51.905L56.947,62.63l-1.025,1.719L39.027,53.174L22.139,64.059l-1.064-1.693l15.896-10.385L21,41.561l1.018-1.727 l16.895,11.027L55.924,39.6l1.084,1.678L40.744,51.905z\"/>\n    </g>\n  </g>";
            }
        },
        POSTAL_DISTRIBUTION_CENTER("01", "Postal Distribution Center", LandInstallationEntityType.POSTAL_SERVICES_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 247.7764 353)\">DIST</text>\n    <rect fill=\"#FFFFFF\" height=\"96.385\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" width=\"184.688\" x=\"213.287\" y=\"356.615\"/>\n    <polyline fill=\"none\" points=\"213.287,369.013 305.63,407.148 397.975,369.013\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"3\"/>\n  </g>";
            }
        },
        POST_OFFICE("02", "Post Office", LandInstallationEntityType.POSTAL_SERVICES_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"407.199,370.971 305.399,309.5 202.517,371.991 221.9,371.6 221.9,467.7 390.4,467.7 390.4,371.7\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <rect fill=\"#FFFFFF\" height=\"70.77\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" width=\"130.69\" x=\"238.71\" y=\"373.73\"/>\n    <polyline fill=\"none\" points=\"238.71,382.833 304.055,410.834 369.4,382.833\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"3\"/>\n  </g>";
            }
        },
        RELIGIOUS_INSTITUTION("04", "Religious Institution", LandInstallationEntityType.PUBLIC_VENUES_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text style=\"font-style:normal;font-weight:normal;font-size:110px;line-height:1.25;font-family:sans-serif;fill:#000000;fill-opacity:1;stroke:none\" x=\"195.9409\" xml:space=\"preserve\" y=\"434.49344\">\n      <tspan x=\"195.9409\" y=\"434.49344\">REL</tspan>\n    </text>\n  </g>";
            }
        },
        BROADCAST_TRANSMITTER_ANTENNAE("01", "Broadcast Transmitter Antennae", LandInstallationEntityType.TELECOMMUNICATIONS_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"285.5\" y2=\"502.25\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"352.75\" x2=\"306\" y1=\"296.836\" y2=\"325.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"259.25\" y1=\"325.5\" y2=\"296.836\"/>\n    </g>\n  </g>";
            }
        },
        TELECOMMUNICATIONS("02", "Telecommunications", LandInstallationEntityType.TELECOMMUNICATIONS_INFRASTRUCTURE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <polyline fill=\"none\" points=\"305.699,359.884 258.64,346.211 264.087,363.495 217.026,349.823\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.699\" x2=\"276.433\" y1=\"359.899\" y2=\"439.789\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.7\" x2=\"334.967\" y1=\"359.899\" y2=\"439.789\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.433\" x2=\"334.967\" y1=\"394.209\" y2=\"394.209\"/>\n    <g>\n      <polyline fill=\"none\" points=\"393.139,349.823 346.079,363.495 351.524,346.211 304.466,359.884\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        TELECOMMUNICATIONS_TOWER("03", "Telecommunications Tower", LandInstallationEntityType.TELECOMMUNICATIONS_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(76,65)\">\n      <polygon id=\"_43846288\" points=\"209.4,305.4 210.5,304.3 209.4,303.8\"/>\n      <path d=\"M 235.2 378.1 L 265.1 358 l 7.1 23 l 3.3 10 l 5.3 17.2 L 235.2 378.1 z M 177.7 408.2 l 8.5 -29.3 l 4.9 -14.7 l 2 -6.4 l 29.7 20.5 L 177.7 408.2 z M 228.8 321.6 L 261.3 352 C 257.5 354.5 230.6 373.2 228.5 373.2 c -0.3 0 -28.9 -19.2 -31.8 -21.3 L 228.8 321.6 z M 248.1 303.8 l 0.6 0.4 l 4.5 14.2 l 6.3 21.7 L 234.2 316.9 L 248.1 303.8 L 248.1 303.8 z M 209.4 305.4 V 303.8 l 1.1 0.5 l 13.4 12.6 l -25 23.5 L 205.4 318 L 209.4 305.4 z M 216.7 301.2 l 24.4 -0.1 l -12.5 11 L 216.7 301.2 z M 225.8 243.4 v 9 H 214.7 c -1.2 0 -2.6 1.4 -2.6 2.6 v 1.6 c 0 1.7 1.9 2.6 3.7 2.6 h 10.1 v 10.6 h -18 c -1.2 0 -2.6 1.4 -2.6 2.6 v 0.5 c 0 2.5 1.2 3.7 3.7 3.7 h 16.9 v 17.5 h -17 c -1.9 0 -2.6 0.8 -3.3 1.7 L 204 300.8 L 191.8 339.9 L 184.4 363.8 L 176.6 387.4 L 176.4 389.5 L 169.2 411.3 l -0.3 2 L 167.6 418.7 C 170 419.3 168.9 420.3 170.8 420.3 h 0.5 c 2.1 0 50.3 -34.2 57.7 -38.1 c 6.2 4.2 56 38.1 58.8 38.1 c 1.5 0 2.6 -1.8 2.6 -3.2 c 0 -0.3 -3.4 -10.1 -3.7 -10.6 l -0.3 -2 L 278.7 380.2 L 271.5 356.9 L 259.7 317.6 C 258.3 315.5 256.3 308.2 255.3 305 C 253.7 300.4 254 294.3 249.1 294.3 H 232.2 V 276.8 h 18 c 1.2 0 2.6 -1.4 2.6 -2.6 V 273.1 c 0 -1.6 -0.5 -3.2 -2.1 -3.2 H 232.2 V 259.3 h 10.1 c 1.8 0 3.7 -0.9 3.7 -2.6 V 255.1 c 0 -1.7 -1.9 -2.6 -3.7 -2.6 H 232.2 V 242.4 c 0 -1.5 -1.8 -2.6 -3.2 -2.6 C 227 239.7 225.8 241.3 225.8 243.4 L 225.8 243.4 z\" id=\"_102731816\"/>\n    </g>\n  </g>";
            }
        },
        AIR_TERMINAL("01", "Air Terminal", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, GraphicType.MAIN_1) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(40 72) scale(0.8 0.8)\">\n      <ellipse cx=\"332.5\" cy=\"399.922\" fill=\"none\" rx=\"61.346\" ry=\"61.346\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"283.42\" x2=\"381.575\" y1=\"366.181\" y2=\"433.662\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"283.42\" x2=\"381.575\" y1=\"433.662\" y2=\"366.181\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"332.5\" x2=\"332.5\" y1=\"338.575\" y2=\"461.268\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"246.611\" x2=\"341.133\" y1=\"325.062\" y2=\"325.062\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"318.25\" x2=\"253.739\" y1=\"280.266\" y2=\"347.783\"/>\n  </g>";
            }
        },
        ATC_FACILITY("02", "Air Traffic Control Facility", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"95\" transform=\"matrix(1 0 0 1 209.9043 422)\">ATC</text>\n  </g>";
            }
        },
        FERRY_TERMINAL("04", "Ferry Terminal", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"240,468 200,388 250,388 250,323 360,323 360,388 410,388 370,468\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 265 443)\">FE</text>\n  </g>";
            }
        },
        HELICOPTER_LANDING_SITE("05", "Helicopter Landing Site", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <ellipse cx=\"305\" cy=\"371\" fill=\"#FFFFFF\" rx=\"28\" ry=\"58\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250\" x2=\"280\" y1=\"316\" y2=\"346\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"330\" x2=\"360\" y1=\"396\" y2=\"426\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"280\" x2=\"250\" y1=\"396\" y2=\"426\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"360\" x2=\"330\" y1=\"316\" y2=\"346\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"428\" y2=\"479\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"290\" x2=\"320\" y1=\"479\" y2=\"479\"/>\n    </g>\n    <ellipse cx=\"305\" cy=\"396\" fill=\"none\" rx=\"104\" ry=\"104\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MAINTENANCE_FACILITY("06", "Maintenance Facility", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245\" x2=\"365\" y1=\"396\" y2=\"396\"/>\n    <path d=\"M390,371c-35,0-35,50,0,50\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M220,371c35,0,35,50,0,50\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        RAILHEAD_RAILROAD_STATION("07", "Railhead/Railroad Station", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, GraphicType.MAIN_1) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(20 50) scale(0.9 0.9)\">\n      <path d=\"M318.888,310.48c34.122,0,61.782,27.66,61.782,61.782 c0,34.117-27.657,61.778-61.782,61.778c-34.119,0-61.779-27.662-61.779-61.778C257.109,338.14,284.768,310.48,318.888,310.48z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"269.465\" x2=\"368.312\" y1=\"338.281\" y2=\"406.238\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"269.465\" x2=\"368.312\" y1=\"406.238\" y2=\"338.281\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"318.888\" x2=\"318.888\" y1=\"310.48\" y2=\"434.04\"/>\n    </g>\n    <g transform=\"translate(40 -30) scale(0.8 0.7)\">\n      <ellipse cx=\"271.97\" cy=\"495.271\" fill=\"none\" rx=\"10.04\" ry=\"10.039\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"299.771\" cy=\"495.271\" fill=\"none\" rx=\"10.04\" ry=\"10.039\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"395.53\" cy=\"495.271\" fill=\"none\" rx=\"10.04\" ry=\"10.039\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"367.727\" cy=\"495.271\" fill=\"none\" rx=\"10.04\" ry=\"10.039\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"258.069\" x2=\"409.431\" y1=\"482.143\" y2=\"482.143\"/>\n    </g>\n  </g>";
            }
        },
        SEA_TERMINAL("09", "Sea Terminal", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, GraphicType.MAIN_1) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(20 50) scale(0.9 0.9)\">\n      <path d=\"M317.777,346.591c24.15,0,43.722,19.576,43.722,43.726 c0,24.145-19.575,43.723-43.722,43.723c-24.148,0-43.723-19.578-43.723-43.723C274.053,366.167,293.629,346.591,317.777,346.591z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"282.798\" x2=\"352.756\" y1=\"366.267\" y2=\"414.363\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"282.798\" x2=\"352.756\" y1=\"414.363\" y2=\"366.267\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"317.777\" x2=\"317.777\" y1=\"346.591\" y2=\"434.04\"/>\n    </g>\n    <g>\n      <ellipse cx=\"306\" cy=\"284.234\" fill=\"none\" rx=\"6.234\" ry=\"6.234\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"290.469\" y2=\"352.814\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"287.688\" x2=\"324.313\" y1=\"294.365\" y2=\"294.365\"/>\n      <path d=\"M267.034,321.642c19.483,38.966,58.449,38.966,77.932,0 C325.482,366.453,286.517,366.453,267.034,321.642\" stroke=\"#000000\" stroke-width=\"3\"/>\n      <path d=\"M267.034,321.642c3.118,17.535,5.066,17.535,5.066,17.535l5.845-7.793 c-5.065-1.948-7.014-5.846-9.741-8.573\" stroke=\"#000000\" stroke-width=\"3\"/>\n      <path d=\"M344.966,321.642c-3.117,17.535-5.063,17.535-5.063,17.535l-5.848-7.793 c5.065-1.948,7.017-5.846,9.741-8.573\" stroke=\"#000000\" stroke-width=\"3\"/>\n    </g>\n  </g>";
            }
        },
        SHIP_YARD("10", "Ship Yard", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, GraphicType.MAIN_1) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <ellipse cx=\"306\" cy=\"339.736\" fill=\"none\" rx=\"8.736\" ry=\"8.736\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"348.473\" y2=\"435.837\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"287.875\" x2=\"324.125\" y1=\"353.933\" y2=\"353.933\"/>\n      <path d=\"M251.397,392.155c27.301,54.603,81.904,54.603,109.205,0 C333.302,454.948,278.699,454.948,251.397,392.155\" stroke=\"#000000\" stroke-width=\"3\"/>\n      <path d=\"M251.397,392.155c4.368,24.571,7.098,24.571,7.098,24.571l8.19-10.921 c-7.098-2.729-9.828-8.188-13.65-12.013\" stroke=\"#000000\" stroke-width=\"3\"/>\n      <path d=\"M360.603,392.155c-4.366,24.571-7.098,24.571-7.098,24.571l-8.188-10.921 c7.099-2.729,9.826-8.188,13.648-12.013\" stroke=\"#000000\" stroke-width=\"3\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"48\" transform=\"matrix(1 0 0 1 259.042 326.834)\">YRD</text>\n  </g>";
            }
        },
        GROUND_WATER_WELL("04", "Ground Water Well", LandInstallationEntityType.WATER_SUPPLY_INFRASTRUCTURE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(0 -9.5)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"309\" x2=\"309\" y1=\"487\" y2=\"320\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"269\" x2=\"349\" y1=\"487\" y2=\"487\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"321\" x2=\"269\" y1=\"324\" y2=\"324\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"279\" x2=\"249\" y1=\"324\" y2=\"422\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-width=\"10\" x1=\"309\" x2=\"361\" y1=\"371\" y2=\"371\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"361\" x2=\"361\" y1=\"371\" y2=\"389\"/>\n    </g>\n  </g>";
            }
        },
        WATER("10", "Water", LandInstallationEntityType.WATER_SUPPLY_INFRASTRUCTURE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"295.495\" x2=\"342.603\" y1=\"351.784\" y2=\"351.784\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"319.049\" x2=\"319.049\" y1=\"375.338\" y2=\"351.784\"/>\n    <path d=\"M224.833,375.338h113.059c37.688,0,45.227,42.397,47.108,70.662\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        WATER_TREATMENT("11", "Water Treatment", LandInstallationEntityType.WATER_SUPPLY_INFRASTRUCTURE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"299.495\" x2=\"346.603\" y1=\"351.784\" y2=\"351.784\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"323.049\" x2=\"323.049\" y1=\"375.338\" y2=\"351.784\"/>\n    <path d=\"M228.833,375.338h113.059c37.688,0,45.226,42.397,47.108,70.662\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 203.9658 439.25)\">PURE</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final LandInstallationEntityType entityType;
    private final GraphicType graphicType;

    LandInstallationEntitySubType(String id, String label, LandInstallationEntityType entityType, GraphicType graphicType) {
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
    public Rectangle2D getIconBounds() {
        return IconBounds.lookup(getGraphicIdentifier(), getGraphicType());
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
    public EntityType getEntityType() {
        return entityType;
    }

}