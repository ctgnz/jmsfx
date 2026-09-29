package io.github.ctgnz.jmsfx.historical.landunits;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum LandUnitsEntityType implements EntityType {
        BROADCAST_TRANSMITTER_ANTENNAE("01", "Broadcast Transmitter Antennae", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"285.5\" y2=\"502.25\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"352.75\" x2=\"306\" y1=\"296.836\" y2=\"325.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"259.25\" y1=\"325.5\" y2=\"296.836\"/>\n    </g>\n  </g>";
            }
        },
        CIVIL_AFFAIRS("02", "Civil Affairs", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 211 442.6719)\">CA</text>\n  </g>";
            }
        },
        CIVIL_MILITARY_COOPERATION("03", "Civil-Military Cooperation", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M205.93,353.04c66.7,0,133.41,0,200.11,0c-2.63,19.12,3.97,34.07-1,50.95 c-8.73,29.64-70.36,38.398-112.06,35.96c-34.51-2.03-78.84-11.49-86.05-35.96C202.48,388.88,208.23,368.8,205.93,353.04z M396.04,399.99c0-12.32,0-24.64,0-36.96c-60.04,0-120.07,0-180.1,0c2.41,12.15-3.18,24.41,0,36.96 c5.42,21.46,49.67,28.358,77.04,29.97C336.62,432.52,383.53,423.52,396.04,399.99z\" stroke=\"#000000\" stroke-width=\"0.5\"/>\n  </g>";
            }
        },
        INFORMATION_OPERATIONS("04", "Information Operations", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 243.9995 442.25)\">IO</text>\n  </g>";
            }
        },
        LIAISON("05", "Liaison", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 215.9995 442.25)\">LO</text>\n  </g>";
            }
        },
        PSYCHOLOGICAL_OPERATIONS_MISO("06", "Psychological Operations (PSYOPS)", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Speaker\">\n      <rect height=\"61.667\" stroke=\"#000000\" width=\"59.167\" x=\"263\" y=\"366.167\"/>\n      <polyline points=\"338.667,444.334 291.54,397.208 340.801,347.946\" stroke=\"#000000\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"362.583\" x2=\"326.917\" y1=\"366.167\" y2=\"366.167\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"362.583\" x2=\"326.917\" y1=\"427.834\" y2=\"427.834\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"362.583\" x2=\"326.917\" y1=\"386.723\" y2=\"386.723\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"362.583\" x2=\"326.917\" y1=\"407.278\" y2=\"407.278\"/>\n    </g>\n  </g>";
            }
        },
        RADIO("07", "Radio", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"353.75\" y2=\"409.525\"/>\n    <circle cx=\"305\" cy=\"426.109\" fill=\"none\" r=\"15.584\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"272.537,366.015 281.325,353.498 292.319,367.852 304.231,353.498 317.06,367.852 328.97,353.498 339.464,367.752\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        RADIO_RELAY("08", "Radio Relay", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"349.75\" y2=\"409.525\"/>\n    <circle cx=\"305\" cy=\"426.109\" fill=\"none\" r=\"15.584\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.825\" x2=\"332.325\" y1=\"351.75\" y2=\"351.75\"/>\n  </g>";
            }
        },
        RADIO_TELETYPE_CENTER("09", "Radio Teletype Center", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"349.75\" y2=\"445.015\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.825\" x2=\"332.325\" y1=\"352.75\" y2=\"352.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"287.126\" x2=\"323.039\" y1=\"366.5\" y2=\"366.5\"/>\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 276.8252 445.0146)\">C</text>\n  </g>";
            }
        },
        SIGNAL("10", "Signal", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <polyline fill=\"none\" points=\"186,316 306,415 306,375 426,474\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <polyline fill=\"none\" points=\"126.984,279.068 304.083,422.5 304.943,371.5 484.5,511\" stroke=\"#000000\" stroke-miterlimit=\"1\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <polyline fill=\"none\" points=\"174,263 306,415 306,375 438,527\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <polyline fill=\"none\" points=\"202,326 306,416 306,376 410,466\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        VIDEO_IMAGERY_COMBAT_CAMERA("12", "Video Imagery (Combat Camera)", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" points=\"321.077,439.163 211.467,439.163 211.467,352.786 360.645,352.786\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"401.167\" x2=\"401.167\" y1=\"357.167\" y2=\"435.834\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"401.167\" x2=\"327.521\" y1=\"424.834\" y2=\"424.834\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"398.833\" x2=\"354.704\" y1=\"368.167\" y2=\"368.167\"/>\n  </g>";
            }
        },
        SPACE("13", "Space", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:0.77352;stroke-dasharray:none;stroke-opacity:1\" transform=\"matrix(1.47402,0,0,1.13386,142.96932,244.97142)\">\n    <path d=\"m 230.70699,433.14545 -9.96744,132.9427 -30.03256,-26.27604 15.7552,34.8828 -29.08854,16.78386 29.08854,16.78385 -15.7552,34.8828 30.03256,-26.27604 9.96744,132.94271 15.96355,-127.70182 24.03645,21.03515 -14.1211,-31.26953 40.78776,-20.39713 -40.78776,-20.39714 14.1211,-31.26953 -24.03645,21.03516 z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:2.92353;stroke-opacity:1;stroke-dasharray:none\" transform=\"matrix(0.26458,0,0,0.26458,47.1202,-23.20313)\"/>\n  </g>";
            }
        },
        SPECIAL_TROOPS("14", "Special Troops", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-7.73928)\">\n    <text font-family=\"sans-serif\" font-size=\"130px\" transform=\"translate(224,442.6719)\">ST</text>\n  </g>";
            }
        },
        MULTI_DOMAIN("15", "Multi-Domain", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0.13013,3.26213)\">\n    <path d=\"m 304.86985,345.40913 -9.1836,15.89063 h 5.68359 v 70 h 7 v -70 h 5.68555 z\" style=\"color:#000000;fill:#000000;-inkscape-stroke:none\"/>\n    <path d=\"m 390.76146,427.89233 -15.89063,-9.1836 v 5.68359 h -70 v 7 h 70 v 5.68555 z\" style=\"color:#000000;fill:#000000;-inkscape-stroke:none\"/>\n    <path d=\"m 218.9802,427.89233 15.89063,-9.1836 v 5.68359 h 70 v 7 h -70 v 5.68555 z\" style=\"color:#000000;fill:#000000;-inkscape-stroke:none\"/>\n    <path d=\"m 364.68893,367.70321 -17.73015,4.74259 4.0189,4.0189 -49.49747,49.49747 4.94975,4.94975 49.49747,-49.49748 4.0203,4.0203 z\" style=\"color:#000000;fill:#000000;-inkscape-stroke:none\"/>\n    <path d=\"m 245.03794,367.70321 17.73015,4.74259 -4.0189,4.0189 49.49747,49.49747 -4.94975,4.94975 -49.49747,-49.49748 -4.0203,4.0203 z\" style=\"color:#000000;fill:#000000;-inkscape-stroke:none\"/>\n  </g>";
            }
        },
        AIR_ASSAULT_WITH_ORGANIC_LIFT("01", "Air Assault with Organic Lift", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <polyline fill=\"none\" points=\"149.219,445.295 257.167,445.295 306,499.25 351.834,445.295 462.78,445.295\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <polyline fill=\"none\" points=\"131.5,445.295 257.167,445.295 306,499.25 351.834,445.295 480.5,445.295\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <polyline fill=\"none\" points=\"174,445.295 257.167,445.295 306,499.25 351.834,445.295 438,445.295\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <polyline fill=\"none\" points=\"182.295,445.295 257.167,445.295 306,499.25 351.834,445.295 429.705,445.295\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        AIR_TRAFFIC_SERVICES_AIRFIELD_OPERATIONS("02", "Air Traffic Services/Airfield Operations", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"208.096,444.429 208.096,347.62 304.906,395.979\"/>\n    <polygon points=\"403.904,444.383 304.906,395.979 403.904,347.572\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304.906\" x2=\"304.906\" y1=\"382.5\" y2=\"445.154\"/>\n    <circle cx=\"305.083\" cy=\"369.538\" r=\"22.833\"/>\n  </g>";
            }
        },
        ANTIARMOUR("04", "Antiarmor", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <polyline fill=\"none\" points=\"167.446,464.573 306,280.5 447.773,462.037\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <polyline fill=\"none\" id=\"symbol\" points=\"126.5,515.5 306,280.5 485.5,515.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <polyline fill=\"none\" points=\"174,453.5 306,280.5 438,453.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <polyline fill=\"none\" points=\"182.295,445.295 306,280.5 431.875,445.295\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        ARMOUR("05", "Armour", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M250.552,441c-22.895,0-41.457-19.98-41.457-44.626 c0-24.646,18.562-44.624,41.457-44.624\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M361.448,351.75c22.896,0,41.457,19.979,41.457,44.624 c0,24.645-18.561,44.626-41.457,44.626\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.552\" x2=\"361.448\" y1=\"351.75\" y2=\"351.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.552\" x2=\"361.448\" y1=\"441\" y2=\"441\"/>\n  </g>";
            }
        },
        ARMY_AVIATION_AVIATION_ROTARY_WING("06", "Army Aviation/Aviation Rotary Wing", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"387.838,443.678 305.082,396.307 387.486,348.322\" stroke=\"#000000\"/>\n    <polygon points=\"223.609,443.481 223.915,348.518 306,396.264\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        AVIATION_COMPOSITE("07", "Aviation Composite", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"277.88,445.434 305.909,396.467 334.301,445.225\" stroke=\"#000000\"/>\n    <path d=\"M377.914,396.442c0,10.959-9.588,19.844-21.414,19.844S306,396.442,306,396.442 s38.674-19.844,50.5-19.844S377.914,385.483,377.914,396.442z\" stroke=\"#000000\"/>\n    <path d=\"M234.086,396.433c0-10.958,9.588-19.844,21.414-19.844s50.5,19.844,50.5,19.844 s-38.674,19.845-50.5,19.845S234.086,407.392,234.086,396.433z\" stroke=\"#000000\"/>\n    <polygon points=\"277.741,347.073 334.662,347.257 306.043,396.458\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        AVIATION_FIXED_WING("08", "Aviation Fixed Wing", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M422.706,395.541c0,17.741-15.521,32.123-34.665,32.123c-19.145,0-81.748-32.123-81.748-32.123 s62.604-32.123,81.748-32.123C407.185,363.418,422.706,377.801,422.706,395.541z\" stroke=\"#000000\"/>\n    <path d=\"M187.011,395.817c0-18.037,15.781-32.661,35.246-32.661c19.465,0,83.118,32.661,83.118,32.661 s-63.653,32.66-83.118,32.66C202.792,428.477,187.011,413.854,187.011,395.817z\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        COMBAT("09", "Combat", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 206 427.6719)\">CBT</text>\n  </g>";
            }
        },
        COMBINED_ARMS("10", "Combined Arms", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M250.552,441c-22.895,0-41.457-19.98-41.457-44.626 c0-24.646,18.562-44.624,41.457-44.624\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M361.448,351.75c22.896,0,41.457,19.979,41.457,44.624 c0,24.645-18.561,44.626-41.457,44.626\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.552\" x2=\"361.448\" y1=\"351.75\" y2=\"351.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.552\" x2=\"361.448\" y1=\"441\" y2=\"441\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245.266\" x2=\"364.899\" y1=\"440.713\" y2=\"353.036\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.359\" x2=\"360.641\" y1=\"351.75\" y2=\"441\"/>\n  </g>";
            }
        },
        INFANTRY("11", "Infantry", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"221\" x2=\"391\" y1=\"481\" y2=\"311\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"221\" x2=\"391\" y1=\"311\" y2=\"481\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.5\" x2=\"485.5\" y1=\"516\" y2=\"276\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.5\" x2=\"485.5\" y1=\"276\" y2=\"516\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"527\" y2=\"263\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"263\" y2=\"527\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"220\" x2=\"390.5\" y1=\"482.5\" y2=\"309.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"220\" x2=\"390.5\" y1=\"309.5\" y2=\"482.5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        OBSERVER("12", "Observer", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" id=\"symbol\" points=\"247.685,440.015 307.082,352.75 366.479,440.015\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        RECON_CAVALRY("13", "Reconnaissance/Cavalry", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"426\" x2=\"186\" y1=\"317\" y2=\"475\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"1\" stroke-width=\"5\" x1=\"126.5\" x2=\"485.5\" y1=\"516\" y2=\"276\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"438\" x2=\"174\" y1=\"263\" y2=\"527\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"410\" x2=\"202\" y1=\"326\" y2=\"466\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        SEA_AIR_LAND_SEAL("14", "Sea Air Land (SEAL)", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"85.4684\" transform=\"matrix(1 0 0 1 188 428.6367)\">SEAL</text>\n  </g>";
            }
        },
        SNIPER("15", "Sniper", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"220\" x2=\"291.5\" y1=\"353.75\" y2=\"353.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"319\" x2=\"390.5\" y1=\"353.75\" y2=\"353.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.083\" x2=\"305.083\" y1=\"362.5\" y2=\"442.015\"/>\n  </g>";
            }
        },
        SURVEILLANCE("16", "Surveillance", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon id=\"symbol\" points=\"247.685,440.015 307.082,352.75 366.479,440.015\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        SPECIAL_FORCES("17", "Special Forces", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 223.9995 442.25)\">SF</text>\n  </g>";
            }
        },
        SPECIAL_OPERATIONS_FORCES_SOF("18", "Special Operations Forces (SOF)", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 209 429.6719)\">SOF</text>\n  </g>";
            }
        },
        UNMANNED_AERIAL_SYSTEMS("19", "Unmanned Aerial Systems", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline points=\"206,346 206,386 306,446 406,386 406,346 306,406\"/>\n  </g>";
            }
        },
        RANGER("20", "Ranger", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-6.8428)\">\n    <text font-family=\"sans-serif\" font-size=\"96px\" transform=\"translate(205,429.6719)\">RGR</text>\n  </g>";
            }
        },
        AVIATION_AIRSHIP("A1", "Aviation Airship", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"380.86,397.771 388.907,438.149 365.533,438.149 355.188,395.999 365.533,353.85 388.907,353.85\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"299.25\" cy=\"396\" rx=\"100.583\" ry=\"34.394\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        AVIATION_LTA("A2", "Aviation Lighter-than-Air", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"22.355\" width=\"34.215\" x=\"287.423\" y=\"420.936\"/>\n    <ellipse cx=\"304.8\" cy=\"386.287\" rx=\"40.631\" ry=\"38.088\"/>\n  </g>";
            }
        },
        AVIATION_TETHERED_LTA("A3", "Aviation Tethered Lighter-than-Air", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"251.801\" cy=\"433.627\" rx=\"10.375\" ry=\"9.724\"/>\n    <rect height=\"22.355\" width=\"34.215\" x=\"287.423\" y=\"420.936\"/>\n    <ellipse cx=\"304.8\" cy=\"386.287\" rx=\"40.631\" ry=\"38.088\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"252.043\" x2=\"266.959\" y1=\"429.827\" y2=\"385.958\"/>\n  </g>";
            }
        },
        AIR_DEFENSE("01", "Air Defense", LandUnitsEntity.FIRES, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <path d=\"M186.093,474.836c70.326-34.119,169.058-34.048,239.263,0.217\" fill=\"none\" id=\"arc_1_\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <path d=\"M126.082,516c8.053,-9.448,17.466,-17.917,27.958,-25.408c80.296,-57.322,223.787,-57.323,304.084,0c10.493,7.491,19.906,15.96,27.958,25.408\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <path d=\"M174,482c74.428,-43.6,189.572,-43.6,264,0\" fill=\"none\" id=\"arc_3_\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <path d=\"M204.083,467.076c62.377-23.793,141.311-23.701,203.56,0.275\" fill=\"none\" id=\"arc_1_\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        AIR_LAND_NAVAL_GUNFIRE_LIAISON("02", "Air/Land Naval Gunfire Liaison", LandUnitsEntity.FIRES, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <g>\n      <ellipse cx=\"305\" cy=\"284.841\" fill=\"none\" rx=\"4.939\" ry=\"4.939\" stroke=\"#000000\" stroke-width=\"4\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"289.78\" y2=\"339.169\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"288.75\" x2=\"321.25\" y1=\"292.867\" y2=\"292.867\"/>\n      <path d=\"M274.132,314.475c15.434,30.868,46.302,30.868,61.736,0 C320.434,349.973,289.566,349.973,274.132,314.475\" stroke=\"#000000\" stroke-width=\"4\"/>\n      <path d=\"M274.132,314.475c2.469,13.891,4.013,13.891,4.013,13.891l4.63-6.174 c-4.013-1.543-5.556-4.63-7.717-6.791\" stroke=\"#000000\" stroke-width=\"4\"/>\n      <path d=\"M335.868,314.475c-2.47,13.891-4.013,13.891-4.013,13.891l-4.635-6.174 c4.018-1.543,5.561-4.63,7.721-6.791\" stroke=\"#000000\" stroke-width=\"4\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"427.336\" x2=\"188.516\" y1=\"317.724\" y2=\"475.74\"/>\n    <g>\n      <polyline points=\"309.939,396 219.939,346 219.939,446 309.939,396 399.939,346 399.939,446 309.939,396\"/>\n      <ellipse cx=\"309.938\" cy=\"396\" rx=\"35.171\" ry=\"35.171\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <g>\n      <ellipse cx=\"305\" cy=\"284.841\" fill=\"none\" rx=\"4.939\" ry=\"4.939\" stroke=\"#000000\" stroke-width=\"4\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"289.78\" y2=\"339.169\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"288.75\" x2=\"321.25\" y1=\"292.867\" y2=\"292.867\"/>\n      <path d=\"M274.132,314.475c15.434,30.868,46.302,30.868,61.736,0 C320.434,349.973,289.566,349.973,274.132,314.475\" stroke=\"#000000\" stroke-width=\"4\"/>\n      <path d=\"M274.132,314.475c2.469,13.891,4.013,13.891,4.013,13.891l4.63-6.175 c-4.013-1.543-5.556-4.629-7.717-6.791\" stroke=\"#000000\" stroke-width=\"4\"/>\n      <path d=\"M335.868,314.475c-2.47,13.891-4.013,13.891-4.013,13.891l-4.635-6.175 c4.018-1.543,5.561-4.629,7.721-6.791\" stroke=\"#000000\" stroke-width=\"4\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"484.5\" x2=\"129.18\" y1=\"279.902\" y2=\"515\"/>\n    <g>\n      <polyline points=\"309.939,396 219.939,346 219.939,446 309.939,396 399.939,346 399.939,446 309.939,396\"/>\n      <ellipse cx=\"309.938\" cy=\"396\" rx=\"35.171\" ry=\"35.171\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <g>\n      <ellipse cx=\"306\" cy=\"285.841\" fill=\"none\" rx=\"4.939\" ry=\"4.939\" stroke=\"#000000\" stroke-width=\"4\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"290.78\" y2=\"340.169\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"289.75\" x2=\"322.25\" y1=\"293.867\" y2=\"293.867\"/>\n      <path d=\"M275.132,315.475c15.434,30.868,46.302,30.868,61.736,0 C321.434,350.973,290.566,350.973,275.132,315.475\" stroke=\"#000000\" stroke-width=\"4\"/>\n      <path d=\"M275.132,315.475c2.469,13.891,4.013,13.891,4.013,13.891l4.63-6.175 c-4.013-1.543-5.556-4.629-7.717-6.791\" stroke=\"#000000\" stroke-width=\"4\"/>\n      <path d=\"M336.868,315.475c-2.47,13.891-4.013,13.891-4.013,13.891l-4.635-6.175 c4.018-1.543,5.561-4.629,7.721-6.791\" stroke=\"#000000\" stroke-width=\"4\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"438\" x2=\"174\" y1=\"263\" y2=\"527\"/>\n    <g>\n      <polyline points=\"309.939,396 219.939,346 219.939,446 309.939,396 399.939,346 399.939,446 309.939,396\"/>\n      <ellipse cx=\"309.938\" cy=\"396\" rx=\"35.171\" ry=\"35.171\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <g>\n      <ellipse cx=\"306\" cy=\"284.841\" fill=\"none\" rx=\"4.939\" ry=\"4.939\" stroke=\"#000000\" stroke-width=\"4\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"289.78\" y2=\"339.169\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"289.75\" x2=\"322.25\" y1=\"292.867\" y2=\"292.867\"/>\n      <path d=\"M275.132,314.475c15.434,30.868,46.302,30.868,61.736,0 C321.434,349.973,290.566,349.973,275.132,314.475\" stroke=\"#000000\" stroke-width=\"4\"/>\n      <path d=\"M275.132,314.475c2.469,13.891,4.013,13.891,4.013,13.891l4.63-6.175 c-4.013-1.543-5.556-4.629-7.717-6.791\" stroke=\"#000000\" stroke-width=\"4\"/>\n      <path d=\"M336.868,314.475c-2.47,13.891-4.013,13.891-4.013,13.891l-4.635-6.175 c4.018-1.543,5.561-4.629,7.721-6.791\" stroke=\"#000000\" stroke-width=\"4\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"392.592\" x2=\"219.939\" y1=\"309.591\" y2=\"482.939\"/>\n    <g>\n      <polyline points=\"309.939,396 219.939,346 219.939,446 309.939,396 399.939,346 399.939,446 309.939,396\"/>\n      <ellipse cx=\"309.938\" cy=\"396\" rx=\"35.171\" ry=\"35.171\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
                    default -> null;
                };
            }
        },
        FIELD_ARTILLERY("03", "Field Artillery", LandUnitsEntity.FIRES, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"305.083\" cy=\"396\" id=\"symbol\" r=\"37.833\"/>\n  </g>";
            }
        },
        FIELD_ARTILLERY_OBSERVER("04", "Field Artillery Observer", LandUnitsEntity.FIRES, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" id=\"symbol\" points=\"247.685,440.015 307.082,352.75 366.479,440.015\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"306\" cy=\"410\" r=\"16.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        JOINT_FIRE_SUPPORT("05", "Joint Fire Support", LandUnitsEntity.FIRES, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 217 429.6719)\">JFS</text>\n  </g>";
            }
        },
        METEOROLOGICAL("06", "Meteorological", LandUnitsEntity.FIRES, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"MET\">\n      <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 203 429.6719)\">MET</text>\n    </g>\n  </g>";
            }
        },
        MISSILE("07", "Missile", LandUnitsEntity.FIRES, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M287.814,445.697v-80.824c0-6.695,5.428-12.124,12.124-12.124 h12.124c6.695,0,12.124,5.428,12.124,12.124v79.813\" fill=\"none\" id=\"symbol\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MORTAR("08", "Mortar", LandUnitsEntity.FIRES, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"305.082\" cy=\"424.806\" fill=\"none\" r=\"16.209\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.083\" x2=\"305.082\" y1=\"408.597\" y2=\"351.667\"/>\n      <polyline fill=\"none\" points=\"287.628,370.539 305.083,348.833 322.535,370.535\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        SURVEY("09", "Survey", LandUnitsEntity.FIRES, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"307.955,405.048 307.809,355.911 354.93,383.005\" stroke=\"#000000\" stroke-width=\"8\"/>\n    <polyline fill=\"none\" points=\"274.002,443.396 304.812,412.402 335.619,443.396\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        SIEGE_ARTILLERY("A1", "Siege Artillery", LandUnitsEntity.FIRES, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"305.083\" cy=\"396\" id=\"symbol\" r=\"37.833\"/>\n    <path d=\"m 215.08301,414 v -36 h 36 v 36 h 36 v -36 h 36 v 36 h 36 v -36 h 36 v 36\" style=\"fill:none;stroke:#000000;stroke-width:7.5;stroke-linecap:square;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR("01", "Chemical, Biological, Radiological and Nuclear", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0,0.40001465)\">\n    <circle cx=\"228\" cy=\"364.98499\" r=\"18\"/>\n    <circle cx=\"381.5\" cy=\"363.98499\" r=\"18\"/>\n    <path d=\"m 236,353.75 c 68,21.148 79.333,33.233 107.667,87.613\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 372,353.75 c -68,21.148 -79.333,33.233 -107.667,87.613\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        COMBAT_SUPPORT_MANEUVER_ENHANCEMENT("02", "Combat Support (Maneuver Enhancement)", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"363.5,396 307.5,445.015 246.5,396 246.5,346.985 363.5,346.985\"/>\n  </g>";
            }
        },
        CRIMINAL_INVESTIGATION_DIVISION("03", "Criminal Investigation Division", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 224 429.6719)\">CID</text>\n  </g>";
            }
        },
        DIVING("04", "Diving", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"305.992\" cy=\"386.083\" fill=\"none\" r=\"13.092\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"306.228\" cy=\"385.869\" fill=\"none\" r=\"34.472\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <rect fill=\"none\" height=\"24.506\" stroke=\"#000000\" stroke-width=\"5\" width=\"15.849\" x=\"255.618\" y=\"373.617\"/>\n    <rect fill=\"none\" height=\"24.506\" stroke=\"#000000\" stroke-width=\"5\" width=\"15.848\" x=\"340.699\" y=\"372.989\"/>\n    <polygon fill=\"none\" points=\"339.7,440.603 326.895,420.341 285.294,420.575 270.756,440.603\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        DOG("05", "Dog", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 196 429.6719)\">DOG</text>\n  </g>";
            }
        },
        DRILLING("06", "Drilling", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"338.5,445.295 272.5,445.295 246.5,346.985 363.5,346.985\"/>\n  </g>";
            }
        },
        ENGINEER("07", "Engineer", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(20 0) scale(0.9 0.9)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"318.889\" x2=\"318.889\" y1=\"393.889\" y2=\"493.889\"/>\n    <polyline fill=\"none\" points=\"228.889,492.778 228.889,393.889 408.889,393.889 408.889,492.778\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        EXPLOSIVE_ORDNANCE_DISPOSAL_EOD("08", "Explosive Ordnance Disposal (EOD)", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 200 429.6719)\">EOD</text>\n  </g>";
            }
        },
        FIELD_CAMP_CONSTRUCTION("09", "Field Camp Construction", LandUnitsEntity.PROTECTION, GraphicType.MAIN_1) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(20 0) scale(0.9 0.9)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"318.889\" x2=\"318.889\" y1=\"385.539\" y2=\"493.889\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226.667\" x2=\"226.667\" y1=\"385.539\" y2=\"493.889\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"411.111\" x2=\"411.111\" y1=\"385.539\" y2=\"493.889\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"223.889\" x2=\"413.889\" y1=\"385.539\" y2=\"385.539\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"48\" transform=\"matrix(1 0 0 1 236.5 338.5)\">CAMP</text>\n  </g>";
            }
        },
        FIRE_FIGHTING("10", "Fire Fighting", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"396\" rx=\"40.021\" ry=\"40.021\" stroke=\"#000000\"/>\n    <polyline points=\"275.214,346.743 336.785,346.743 306,396 336.785,445.258 275.214,445.258 306,396\" stroke=\"#000000\"/>\n    <polyline points=\"256.743,365.214 256.743,426.785 306,396 355.258,426.785 355.258,365.214 306,396\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        GEOSPATIAL_SUPPORT_GEOSPATIAL_INFORMATION_SUPPORT("11", "Geospatial Support/Geospatial Information Support", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 200 429.6719)\">GEO</text>\n  </g>";
            }
        },
        MILITARY_POLICE("12", "Military Police", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"115\" transform=\"matrix(1 0 0 1 220 439.25)\">MP</text>\n  </g>";
            }
        },
        MINE("13", "Mine", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306.804\" cy=\"396.291\" rx=\"34.667\" ry=\"23.457\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"332.096\" x2=\"281.326\" y1=\"354.167\" y2=\"438\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"283.045\" x2=\"330.754\" y1=\"352.863\" y2=\"438.475\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"306.899\" x2=\"306.899\" y1=\"441.166\" y2=\"350.833\"/>\n  </g>";
            }
        },
        MINE_CLEARING("14", "Mine Clearing", LandUnitsEntity.PROTECTION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306.804\" cy=\"421.291\" rx=\"34.667\" ry=\"23.457\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"332.096\" x2=\"281.326\" y1=\"379.167\" y2=\"463\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"283.045\" x2=\"330.754\" y1=\"377.863\" y2=\"463.475\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"306.899\" x2=\"306.899\" y1=\"466.166\" y2=\"375.833\"/>\n    <g id=\"Symbol_1_\">\n      <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 244 365.6719)\">CLR</text>\n    </g>\n  </g>";
            }
        },
        MINE_LAUNCHING("15", "Mine Launching", LandUnitsEntity.PROTECTION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"305.292\" cy=\"383.386\" rx=\"34.666\" ry=\"23.458\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"280\" x2=\"330.77\" y1=\"425.51\" y2=\"341.677\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"329.051\" x2=\"281.342\" y1=\"426.814\" y2=\"341.203\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"305.196\" x2=\"305.196\" y1=\"338.511\" y2=\"428.844\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"10\" x1=\"266\" x2=\"346\" y1=\"453.49\" y2=\"453.49\"/>\n  </g>";
            }
        },
        MINE_LAYING("16", "Mine Laying", LandUnitsEntity.PROTECTION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306.708\" cy=\"408.614\" rx=\"34.667\" ry=\"23.457\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"332\" x2=\"281.23\" y1=\"366.491\" y2=\"450.323\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"282.949\" x2=\"330.658\" y1=\"365.187\" y2=\"450.798\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"5\" x1=\"306.804\" x2=\"306.804\" y1=\"453.49\" y2=\"363.157\"/>\n    <line fill=\"none\" stroke=\"#020001\" stroke-width=\"10\" x1=\"346\" x2=\"266\" y1=\"338.511\" y2=\"338.511\"/>\n  </g>";
            }
        },
        SECURITY("17", "Security", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 206 429.6719)\">SEC</text>\n  </g>";
            }
        },
        SEARCH_AND_RESCUE("18", "Search and Rescue", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 202 429.6719)\">SAR</text>\n  </g>";
            }
        },
        SHORE_PATROL("20", "Shore Patrol", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 223.9995 442.25)\">SP</text>\n  </g>";
            }
        },
        GEOSPATIAL_INFORMATION("21", "Geospatial Information", LandUnitsEntity.PROTECTION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"263.076,443.199 306.029,379.269 341.49,443.199\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.029\" x2=\"306.029\" y1=\"379.269\" y2=\"348.802\"/>\n    <path d=\"M349.208,422.932c-10.632,8.6-28.341,16.771-43.927,16.771 c-16.246,0-33.561-8.229-44.323-17.477\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MISSILE_DEFENCE("22", "Missile Defence", LandUnitsEntity.PROTECTION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-5.87795)\">\n    <text font-family=\"sans-serif\" font-size=\"110px\" transform=\"translate(220,439.25)\">MD</text>\n  </g>";
            }
        },
        ANALYSIS("01", "Analysis", LandUnitsEntity.INTELLIGENCE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"280.5\" y2=\"472.417\"/>\n    <polygon fill=\"none\" points=\"306.515,507.834 249.334,469.667 362.668,469.667\" stroke=\"#020001\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        COUNTERINTELLIGENCE("02", "Counterintelligence", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 241 442.6719)\">CI</text>\n  </g>";
            }
        },
        DIRECTION_FINDING("03", "Direction Finding", LandUnitsEntity.INTELLIGENCE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"285.5\" y2=\"502.25\"/>\n    <polyline fill=\"none\" points=\"239.5,325.5 306,283.5 371,325.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ELECTRONIC_RANGING("04", "Electronic Ranging", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"300.674\" x2=\"354.652\" y1=\"392.726\" y2=\"364.316\"/>\n    <path d=\"M277.92,351.273c-49.208,28.409-0.911,112.061,48.295,83.651L277.92,351.273z\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ELECTROMAGNETIC_WARFARE("05", "Electromagnetic Warfare", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 210 439.584)\">EW</text>\n  </g>";
            }
        },
        INTERCEPT_SEARCH_RECORDING("06", "Intercept (Search and Recording)", LandUnitsEntity.INTELLIGENCE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"285.5\" y2=\"482.5\"/>\n    <polygon points=\"370.546,472.998 306.181,513.652 241.815,472.998 241.815,472.578 370.546,472.578\"/>\n  </g>";
            }
        },
        INTERROGATION("07", "Interrogation", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" transform=\"matrix(1 0 0 1 200.5 438.25)\">IPW</text>\n  </g>";
            }
        },
        JAMMING("08", "Jamming", LandUnitsEntity.INTELLIGENCE, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <g id=\"waves2\">\n      <path d=\"M239.603,301.813c0,1.889-0.383,3.688-1.075,5.324 c-0.692,1.637-1.694,3.111-2.932,4.349c-1.238,1.238-2.712,2.239-4.349,2.932c-1.637,0.693-3.436,1.075-5.325,1.075 c-1.889,0-3.688-0.383-5.325-1.075c-1.637-0.692-3.111-1.694-4.349-2.932c-1.238-1.238-2.24-2.712-2.932-4.349\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M294.324,301.813c0,1.889-0.383,3.688-1.075,5.324 c-0.692,1.637-1.694,3.111-2.932,4.349c-1.238,1.238-2.712,2.239-4.349,2.932c-1.637,0.693-3.436,1.075-5.325,1.075 s-3.688-0.383-5.325-1.075c-1.637-0.692-3.111-1.694-4.349-2.932c-1.238-1.238-2.24-2.712-2.932-4.349 c-0.692-1.637-1.075-3.436-1.075-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M239.603,302.053c0-1.889,0.383-3.688,1.075-5.324 c0.692-1.637,1.694-3.111,2.932-4.349c1.238-1.238,2.712-2.239,4.349-2.932c1.637-0.693,3.436-1.075,5.325-1.075 c1.889,0,3.688,0.383,5.325,1.075c1.637,0.692,3.111,1.694,4.349,2.932c1.238,1.238,2.24,2.712,2.932,4.349 s1.075,3.436,1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M349.046,301.813c0,1.889-0.383,3.688-1.075,5.324 c-0.688,1.636-1.688,3.111-2.932,4.349c-1.239,1.238-2.712,2.239-4.349,2.932c-1.642,0.693-3.438,1.075-5.325,1.075 c-1.893,0-3.688-0.383-5.325-1.075s-3.11-1.694-4.349-2.932c-1.239-1.238-2.239-2.712-2.937-4.349 c-0.688-1.637-1.075-3.436-1.075-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M294.324,302.053c0-1.889,0.383-3.688,1.075-5.324 s1.694-3.111,2.932-4.349c1.238-1.238,2.712-2.239,4.348-2.932c1.637-0.692,3.436-1.075,5.325-1.075s3.688,0.383,5.324,1.075 c1.636,0.692,3.111,1.694,4.349,2.932c1.238,1.238,2.239,2.712,2.937,4.349c0.688,1.637,1.07,3.436,1.07,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M402.694,307.137c-0.692,1.636-1.693,3.111-2.937,4.349 c-1.236,1.238-2.712,2.239-4.349,2.932s-3.438,1.075-5.325,1.075s-3.688-0.383-5.325-1.075c-1.637-0.692-3.105-1.694-4.349-2.932 c-1.239-1.238-2.239-2.712-2.937-4.349c-0.688-1.637-1.07-3.436-1.07-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M349.046,302.053c0-1.889,0.383-3.688,1.075-5.324 c0.691-1.636,1.693-3.111,2.932-4.349c1.239-1.238,2.712-2.239,4.354-2.932c1.636-0.692,3.436-1.075,5.319-1.075 c1.893,0,3.688,0.383,5.324,1.075c1.642,0.692,3.11,1.694,4.354,2.932c1.234,1.238,2.234,2.712,2.932,4.349 c0.693,1.637,1.075,3.436,1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g id=\"waves1\">\n      <path d=\"M238.604,332.305c0,7.556-6.125,13.68-13.68,13.68 c-7.555,0-13.68-6.124-13.68-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M183.883,332.545c0-7.556,6.125-13.68,13.68-13.68 s13.68,6.124,13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M293.325,332.305c0,7.556-6.125,13.68-13.681,13.68 c-7.555,0-13.68-6.124-13.68-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M238.604,332.545c0-7.556,6.125-13.68,13.68-13.68 c7.555,0,13.68,6.124,13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M348.047,332.305c0,7.556-6.125,13.68-13.681,13.68 c-7.561,0-13.686-6.124-13.686-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M293.325,332.545c0-7.556,6.125-13.68,13.68-13.68 s13.68,6.124,13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M183.883,332.305c0,7.556-6.125,13.68-13.68,13.68 c-7.555,0-13.68-6.124-13.68-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M402.768,332.305c0,7.556-6.125,13.68-13.681,13.68 s-13.681-6.124-13.681-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M348.047,332.545c0-7.556,6.125-13.68,13.68-13.68 c7.56,0,13.685,6.124,13.685,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M457.488,332.305c0,7.556-6.125,13.68-13.686,13.68 c-7.556,0-13.681-6.124-13.681-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M402.766,332.545c0-7.556,6.125-13.68,13.685-13.68 c7.555,0,13.68,6.124,13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <g id=\"waves2\" transform=\"matrix(0.96,0,0,0.96,12.2316,12.07732)\">\n      <path d=\"m 239.603,301.813 c 0,1.889 -0.383,3.688 -1.075,5.324 -0.692,1.637 -1.694,3.111 -2.932,4.349 -1.238,1.238 -2.712,2.239 -4.349,2.932 -1.637,0.693 -3.436,1.075 -5.325,1.075 -1.889,0 -3.688,-0.383 -5.325,-1.075 -1.637,-0.692 -3.111,-1.694 -4.349,-2.932 -1.238,-1.238 -2.24,-2.712 -2.932,-4.349 -0.692,-1.637 -1.075,-3.436 -1.075,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 184.882,302.053 c 0,-1.889 0.383,-3.688 1.075,-5.324 0.692,-1.637 1.694,-3.111 2.932,-4.349 1.238,-1.238 2.712,-2.239 4.349,-2.932 1.637,-0.693 3.436,-1.075 5.325,-1.075 1.889,0 3.688,0.383 5.325,1.075 1.637,0.692 3.111,1.694 4.349,2.932 1.238,1.238 2.24,2.712 2.932,4.349 0.692,1.637 1.075,3.436 1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 294.324,301.813 c 0,1.889 -0.383,3.688 -1.075,5.324 -0.692,1.637 -1.694,3.111 -2.932,4.349 -1.238,1.238 -2.712,2.239 -4.349,2.932 -1.637,0.693 -3.436,1.075 -5.325,1.075 -1.889,0 -3.688,-0.383 -5.325,-1.075 -1.637,-0.692 -3.111,-1.694 -4.349,-2.932 -1.238,-1.238 -2.24,-2.712 -2.932,-4.349 -0.692,-1.637 -1.075,-3.436 -1.075,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 239.603,302.053 c 0,-1.889 0.383,-3.688 1.075,-5.324 0.692,-1.637 1.694,-3.111 2.932,-4.349 1.238,-1.238 2.712,-2.239 4.349,-2.932 1.637,-0.693 3.436,-1.075 5.325,-1.075 1.889,0 3.688,0.383 5.325,1.075 1.637,0.692 3.111,1.694 4.349,2.932 1.238,1.238 2.24,2.712 2.932,4.349 0.692,1.637 1.075,3.436 1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 349.046,301.813 c 0,1.889 -0.383,3.688 -1.075,5.324 -0.688,1.636 -1.689,3.111 -2.932,4.349 -1.239,1.238 -2.712,2.239 -4.349,2.932 -1.641,0.693 -3.438,1.075 -5.325,1.075 -1.892,0 -3.688,-0.383 -5.325,-1.075 -1.637,-0.692 -3.11,-1.694 -4.349,-2.932 -1.239,-1.238 -2.239,-2.712 -2.936,-4.349 -0.689,-1.637 -1.075,-3.436 -1.075,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 294.324,302.053 c 0,-1.889 0.383,-3.688 1.075,-5.324 0.692,-1.636 1.694,-3.111 2.932,-4.349 1.238,-1.238 2.712,-2.239 4.348,-2.932 1.637,-0.692 3.436,-1.075 5.325,-1.075 1.889,0 3.688,0.383 5.324,1.075 1.636,0.692 3.111,1.694 4.349,2.932 1.238,1.238 2.239,2.712 2.936,4.349 0.689,1.637 1.071,3.436 1.071,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 184.882,301.813 c 0,1.889 -0.383,3.688 -1.075,5.324 -0.692,1.637 -1.694,3.111 -2.932,4.349 -1.238,1.238 -2.712,2.239 -4.349,2.932 -1.637,0.693 -3.436,1.075 -5.325,1.075 -1.889,0 -3.688,-0.383 -5.325,-1.075 -1.637,-0.692 -3.111,-1.694 -4.349,-2.932 -1.238,-1.238 -2.24,-2.712 -2.932,-4.349 -0.692,-1.637 -1.075,-3.436 -1.075,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 130.162,302.053 c 0,-1.889 0.383,-3.688 1.075,-5.324 0.692,-1.637 1.694,-3.111 2.932,-4.349 1.238,-1.238 2.712,-2.239 4.349,-2.932 1.637,-0.693 3.436,-1.075 5.325,-1.075 1.889,0 3.688,0.383 5.325,1.075 1.637,0.692 3.111,1.694 4.349,2.932 1.238,1.238 2.24,2.712 2.932,4.349 0.692,1.637 1.075,3.436 1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 403.767,301.813 c 0,1.889 -0.383,3.688 -1.071,5.324 -0.692,1.636 -1.693,3.111 -2.936,4.349 -1.237,1.238 -2.712,2.239 -4.349,2.932 -1.637,0.693 -3.438,1.075 -5.325,1.075 -1.887,0 -3.688,-0.383 -5.325,-1.075 -1.637,-0.692 -3.106,-1.694 -4.349,-2.932 -1.239,-1.238 -2.239,-2.712 -2.936,-4.349 -0.689,-1.637 -1.071,-3.436 -1.071,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 349.046,302.053 c 0,-1.889 0.383,-3.688 1.075,-5.324 0.691,-1.636 1.693,-3.111 2.932,-4.349 1.239,-1.238 2.712,-2.239 4.353,-2.932 1.636,-0.692 3.436,-1.075 5.32,-1.075 1.892,0 3.688,0.383 5.324,1.075 1.641,0.692 3.11,1.694 4.353,2.932 1.235,1.238 2.235,2.712 2.932,4.349 0.693,1.637 1.075,3.436 1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 458.487,301.813 c 0,1.889 -0.387,3.688 -1.075,5.324 -0.692,1.636 -1.693,3.111 -2.932,4.349 -1.239,1.238 -2.716,2.239 -4.353,2.932 -1.637,0.693 -3.437,1.075 -5.325,1.075 -1.888,0 -3.688,-0.383 -5.325,-1.075 -1.637,-0.692 -3.106,-1.694 -4.349,-2.932 -1.239,-1.238 -2.239,-2.712 -2.932,-4.349 -0.693,-1.637 -1.075,-3.436 -1.075,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 403.765,302.053 c 0,-1.889 0.387,-3.688 1.075,-5.324 0.692,-1.636 1.693,-3.111 2.936,-4.349 1.235,-1.238 2.712,-2.239 4.349,-2.932 1.636,-0.692 3.436,-1.075 5.324,-1.075 1.888,0 3.688,0.383 5.324,1.075 1.636,0.692 3.106,1.694 4.349,2.932 1.239,1.238 2.239,2.712 2.932,4.349 0.693,1.637 1.075,3.436 1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 458.485,302.053 c 0,-1.889 0.383,-3.688 1.071,-5.324 0.692,-1.636 1.693,-3.111 2.936,-4.349 1.239,-1.238 2.712,-2.239 4.349,-2.932 1.636,-0.692 3.438,-1.075 5.324,-1.075 1.886,0 3.688,0.383 5.324,1.075 1.636,0.692 3.106,1.694 4.349,2.932 1.239,1.238 2.239,2.712 2.932,4.349 0.693,1.637 1.075,3.436 1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 130.162,300.864 c 0,0.472 -0.024,0.938 -0.071,1.399 -0.046,0.46 -0.116,0.913 -0.207,1.358 -0.091,0.444 -0.204,0.882 -0.337,1.311 -0.133,0.429 -0.287,0.848 -0.46,1.257 -0.173,0.409 -0.366,0.809 -0.576,1.195 -0.21,0.388 -0.439,0.764 -0.685,1.128 -0.246,0.364 -0.509,0.715 -0.788,1.053 -0.279,0.338 -0.574,0.662 -0.883,0.972 -0.309,0.31 -0.633,0.604 -0.971,0.883 -0.338,0.279 -0.689,0.542 -1.054,0.788 -0.364,0.245 -0.74,0.475 -1.128,0.685 -0.194,0.105 -0.392,0.207 -0.591,0.303\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 488.181,309.461 c -0.245,-0.364 -0.475,-0.74 -0.685,-1.129 -0.211,-0.387 -0.403,-0.786 -0.576,-1.195 -0.173,-0.409 -0.326,-0.828 -0.46,-1.257 -0.134,-0.429 -0.246,-0.866 -0.337,-1.311 -0.092,-0.445 -0.161,-0.898 -0.208,-1.358 -0.046,-0.46 -0.07,-0.926 -0.07,-1.398\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g id=\"waves1\" transform=\"matrix(0.96,0,0,0.96,12.22906,13.297)\">\n      <path d=\"m 239.604,332.305 c 0,7.556 -6.125,13.68 -13.68,13.68 -7.555,0 -13.68,-6.124 -13.68,-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 184.883,332.545 c 0,-7.556 6.125,-13.68 13.68,-13.68 7.555,0 13.68,6.124 13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 294.325,332.305 c 0,7.556 -6.125,13.68 -13.681,13.68 -7.555,0 -13.68,-6.124 -13.68,-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 239.604,332.545 c 0,-7.556 6.125,-13.68 13.68,-13.68 7.555,0 13.68,6.124 13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 349.047,332.305 c 0,7.556 -6.125,13.68 -13.681,13.68 -7.56,0 -13.685,-6.124 -13.685,-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 294.325,332.545 c 0,-7.556 6.125,-13.68 13.68,-13.68 7.555,0 13.68,6.124 13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 184.883,332.305 c 0,7.556 -6.125,13.68 -13.68,13.68 -7.555,0 -13.68,-6.124 -13.68,-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 130.163,332.545 c 0,-7.556 6.125,-13.68 13.68,-13.68 7.555,0 13.68,6.124 13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 403.768,332.305 c 0,7.556 -6.125,13.68 -13.681,13.68 -7.556,0 -13.681,-6.124 -13.681,-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 349.047,332.545 c 0,-7.556 6.125,-13.68 13.68,-13.68 7.559,0 13.684,6.124 13.684,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 458.488,332.305 c 0,7.556 -6.125,13.68 -13.685,13.68 -7.556,0 -13.681,-6.124 -13.681,-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 403.766,332.545 c 0,-7.556 6.125,-13.68 13.684,-13.68 7.555,0 13.68,6.124 13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 458.486,332.545 c 0,-7.556 6.125,-13.68 13.68,-13.68 7.555,0 13.68,6.124 13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 130.163,331.356 c 0,0.472 -0.024,0.939 -0.071,1.399 -0.046,0.46 -0.116,0.913 -0.208,1.358 -0.091,0.445 -0.204,0.883 -0.337,1.311 -0.133,0.428 -0.287,0.847 -0.46,1.257 -0.173,0.409 -0.365,0.808 -0.576,1.196 -0.211,0.388 -0.44,0.764 -0.686,1.127 -0.246,0.363 -0.509,0.715 -0.788,1.053 -0.279,0.338 -0.574,0.662 -0.883,0.971 -0.309,0.31 -0.633,0.604 -0.971,0.883 -0.338,0.279 -0.689,0.542 -1.054,0.787 -0.364,0.246 -0.74,0.475 -1.128,0.685 -0.245,0.133 -0.494,0.259 -0.748,0.377\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 488.182,339.953 c -0.246,-0.364 -0.475,-0.74 -0.685,-1.129 -0.21,-0.387 -0.403,-0.786 -0.576,-1.195 -0.173,-0.409 -0.327,-0.828 -0.46,-1.257 -0.134,-0.429 -0.246,-0.866 -0.337,-1.311 -0.091,-0.445 -0.161,-0.898 -0.208,-1.358 -0.047,-0.46 -0.07,-0.926 -0.07,-1.398\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <g id=\"waves2\">\n      <path d=\"M238.603,301.813c0,1.889-0.383,3.688-1.075,5.324 c-0.692,1.637-1.694,3.111-2.932,4.349c-1.238,1.238-2.712,2.239-4.349,2.932c-1.637,0.693-3.436,1.075-5.325,1.075 c-1.889,0-3.688-0.383-5.325-1.075c-1.637-0.692-3.111-1.694-4.349-2.932c-1.238-1.238-2.24-2.712-2.932-4.349 c-0.692-1.637-1.075-3.436-1.075-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M183.882,302.053c0-1.889,0.383-3.688,1.075-5.324 c0.692-1.637,1.694-3.111,2.932-4.349c1.238-1.238,2.712-2.239,4.349-2.932c1.637-0.693,3.436-1.075,5.325-1.075 s3.688,0.383,5.325,1.075c1.637,0.692,3.111,1.694,4.349,2.932c1.238,1.238,2.24,2.712,2.932,4.349s1.075,3.436,1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M293.324,301.813c0,1.889-0.383,3.688-1.075,5.324 c-0.692,1.637-1.694,3.111-2.932,4.349c-1.238,1.238-2.712,2.239-4.349,2.932c-1.637,0.693-3.436,1.075-5.325,1.075 s-3.688-0.383-5.325-1.075c-1.637-0.692-3.111-1.694-4.349-2.932c-1.238-1.238-2.24-2.712-2.932-4.349 c-0.692-1.637-1.075-3.436-1.075-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M238.603,302.053c0-1.889,0.383-3.688,1.075-5.324 c0.692-1.637,1.694-3.111,2.932-4.349c1.238-1.238,2.712-2.239,4.349-2.932c1.637-0.693,3.436-1.075,5.325-1.075 c1.889,0,3.688,0.383,5.325,1.075c1.637,0.692,3.111,1.694,4.349,2.932c1.238,1.238,2.24,2.712,2.932,4.349 s1.075,3.436,1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M348.046,301.813c0,1.889-0.383,3.688-1.075,5.324 c-0.688,1.636-1.688,3.111-2.932,4.349c-1.239,1.238-2.712,2.239-4.349,2.932c-1.642,0.693-3.438,1.075-5.325,1.075 c-1.893,0-3.688-0.383-5.325-1.075s-3.11-1.694-4.349-2.932c-1.239-1.238-2.239-2.712-2.937-4.349 c-0.688-1.637-1.075-3.436-1.075-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M293.324,302.053c0-1.889,0.383-3.688,1.075-5.324 s1.694-3.111,2.932-4.349c1.238-1.238,2.712-2.239,4.348-2.932c1.637-0.692,3.436-1.075,5.325-1.075s3.688,0.383,5.324,1.075 c1.636,0.692,3.111,1.694,4.349,2.932c1.238,1.238,2.239,2.712,2.937,4.349c0.688,1.637,1.07,3.436,1.07,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 175.53709,314.63456 c 1.637,-0.692 3.106,-1.694 4.349,-2.932 1.239,-1.238 2.239,-2.712 2.932,-4.349 0.693,-1.637 1.075,-3.436 1.075,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M402.767,301.813c0,1.889-0.383,3.688-1.07,5.324 c-0.692,1.636-1.693,3.111-2.937,4.349c-1.236,1.238-2.712,2.239-4.349,2.932s-3.438,1.075-5.325,1.075s-3.688-0.383-5.325-1.075 c-1.637-0.692-3.105-1.694-4.349-2.932c-1.239-1.238-2.239-2.712-2.937-4.349c-0.688-1.637-1.07-3.436-1.07-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M348.046,302.053c0-1.889,0.383-3.688,1.075-5.324 c0.691-1.636,1.693-3.111,2.932-4.349c1.239-1.238,2.712-2.239,4.354-2.932c1.636-0.692,3.436-1.075,5.319-1.075 c1.893,0,3.688,0.383,5.324,1.075c1.642,0.692,3.11,1.694,4.354,2.932c1.234,1.238,2.234,2.712,2.932,4.349 c0.693,1.637,1.075,3.436,1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M438.479,314.418c-1.637-0.692-3.105-1.694-4.349-2.932 c-1.239-1.238-2.239-2.712-2.932-4.349c-0.693-1.637-1.075-3.436-1.075-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M402.765,302.053c0-1.889,0.388-3.688,1.075-5.324 c0.692-1.636,1.693-3.111,2.937-4.349c1.234-1.238,2.712-2.239,4.349-2.932c1.636-0.692,3.436-1.075,5.324-1.075 c1.888,0,3.688,0.383,5.324,1.075c1.636,0.692,3.105,1.694,4.349,2.932c1.239,1.238,2.239,2.712,2.932,4.349 c0.693,1.637,1.075,3.436,1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g id=\"waves1\">\n      <path d=\"M238.604,332.305c0,7.556-6.125,13.68-13.68,13.68 c-7.555,0-13.68-6.124-13.68-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M183.883,332.545c0-7.556,6.125-13.68,13.68-13.68 s13.68,6.124,13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M293.325,332.305c0,7.556-6.125,13.68-13.681,13.68 c-7.555,0-13.68-6.124-13.68-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M238.604,332.545c0-7.556,6.125-13.68,13.68-13.68 c7.555,0,13.68,6.124,13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M348.047,332.305c0,7.556-6.125,13.68-13.681,13.68 c-7.561,0-13.686-6.124-13.686-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M293.325,332.545c0-7.556,6.125-13.68,13.68-13.68 s13.68,6.124,13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 175.53709,345.08902 c 1.637,-0.692 3.106,-1.694 4.349,-2.932 1.239,-1.238 2.239,-2.712 2.932,-4.349 0.693,-1.637 1.075,-3.436 1.075,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M402.768,332.305c0,7.556-6.125,13.68-13.681,13.68 s-13.681-6.124-13.681-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M348.047,332.545c0-7.556,6.125-13.68,13.68-13.68 c7.56,0,13.685,6.124,13.685,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M438.48,344.91c-1.637-0.692-3.105-1.694-4.349-2.932 c-1.239-1.238-2.239-2.712-2.932-4.349c-0.693-1.637-1.075-3.436-1.075-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M402.766,332.545c0-7.556,6.125-13.68,13.685-13.68 c7.555,0,13.68,6.124,13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <g id=\"waves2\">\n      <path d=\"M239.603,301.813c0,1.889-0.383,3.688-1.075,5.324 c-0.692,1.637-1.694,3.111-2.932,4.349c-1.238,1.238-2.712,2.239-4.349,2.932c-1.637,0.693-3.436,1.075-5.325,1.075 c-1.889,0-3.688-0.383-5.325-1.075\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M294.324,301.813c0,1.889-0.383,3.688-1.075,5.324 c-0.692,1.637-1.694,3.111-2.932,4.349c-1.238,1.238-2.712,2.239-4.349,2.932c-1.637,0.693-3.436,1.075-5.325,1.075 s-3.688-0.383-5.325-1.075c-1.637-0.692-3.111-1.694-4.349-2.932c-1.238-1.238-2.24-2.712-2.932-4.349 c-0.692-1.637-1.075-3.436-1.075-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M239.603,302.053c0-1.889,0.383-3.688,1.075-5.324 c0.692-1.637,1.694-3.111,2.932-4.349c1.238-1.238,2.712-2.239,4.349-2.932c1.637-0.693,3.436-1.075,5.325-1.075 c1.889,0,3.688,0.383,5.325,1.075c1.637,0.692,3.111,1.694,4.349,2.932c1.238,1.238,2.24,2.712,2.932,4.349 s1.075,3.436,1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M349.046,301.813c0,1.889-0.383,3.688-1.075,5.324 c-0.688,1.636-1.688,3.111-2.932,4.349c-1.239,1.238-2.712,2.239-4.349,2.932c-1.642,0.693-3.438,1.075-5.325,1.075 c-1.893,0-3.688-0.383-5.325-1.075s-3.11-1.694-4.349-2.932c-1.239-1.238-2.239-2.712-2.937-4.349 c-0.688-1.637-1.075-3.436-1.075-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M294.324,302.053c0-1.889,0.383-3.688,1.075-5.324 s1.694-3.111,2.932-4.349c1.238-1.238,2.712-2.239,4.348-2.932c1.637-0.692,3.436-1.075,5.325-1.075s3.688,0.383,5.324,1.075 c1.636,0.692,3.111,1.694,4.349,2.932c1.238,1.238,2.239,2.712,2.937,4.349c0.688,1.637,1.07,3.436,1.07,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M395.411,314.418c-1.637,0.693-3.438,1.075-5.325,1.075 s-3.688-0.383-5.325-1.075c-1.637-0.692-3.105-1.694-4.349-2.932c-1.239-1.238-2.239-2.712-2.937-4.349 c-0.688-1.637-1.07-3.436-1.07-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M349.046,302.053c0-1.889,0.383-3.688,1.075-5.324 c0.691-1.636,1.693-3.111,2.932-4.349c1.239-1.238,2.712-2.239,4.354-2.932c1.636-0.692,3.436-1.075,5.319-1.075 c1.893,0,3.688,0.383,5.324,1.075c1.642,0.692,3.11,1.694,4.354,2.932c1.234,1.238,2.234,2.712,2.932,4.349 c0.693,1.637,1.075,3.436,1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g id=\"waves1\">\n      <path d=\"M239.604,332.305c0,7.556-6.125,13.68-13.68,13.68 c-7.555,0-13.68-6.124-13.68-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M294.325,332.305c0,7.556-6.125,13.68-13.681,13.68 c-7.555,0-13.68-6.124-13.68-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M239.604,332.545c0-7.556,6.125-13.68,13.68-13.68 c7.555,0,13.68,6.124,13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M349.047,332.305c0,7.556-6.125,13.68-13.681,13.68 c-7.561,0-13.686-6.124-13.686-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M294.325,332.545c0-7.556,6.125-13.68,13.68-13.68 s13.68,6.124,13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M403.768,332.305c0,7.556-6.125,13.68-13.681,13.68 s-13.681-6.124-13.681-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M349.047,332.545c0-7.556,6.125-13.68,13.68-13.68 c7.56,0,13.685,6.124,13.685,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
                    default -> null;
                };
            }
        },
        JOINT_INTELLIGENCE_CENTER("09", "Joint Intelligence Center", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" transform=\"matrix(1 0 0 1 220 435.6719)\">JIC</text>\n  </g>";
            }
        },
        MILITARY_INTELLIGENCE("10", "Military Intelligence", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 234 442.6719)\">MI</text>\n  </g>";
            }
        },
        SEARCH("11", "Search", LandUnitsEntity.INTELLIGENCE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"304.5\" x2=\"304.5\" y1=\"500.25\" y2=\"283.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"302.5\" x2=\"371\" y1=\"502.25\" y2=\"460.25\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"239.5\" x2=\"308\" y1=\"460.25\" y2=\"502.25\"/>\n    </g>\n  </g>";
            }
        },
        SENSOR("12", "Sensor", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(110 111) scale(5 5)\">\n      <path d=\"M48.879,57.116c-0.129-0.025-0.659,0.182-1.589,0.619c-0.595,0.258-1.28,0.658-2.054,1.2 c-2.843,1.883-4.845,4.424-6.008,7.621c-0.053,0-0.129-0.064-0.233-0.193c-0.439-1.392-1.228-2.786-2.365-4.179 c-1.189-1.495-2.558-2.734-4.108-3.713c-0.725-0.464-1.719-0.928-2.985-1.392c-0.021-0.052-0.021-0.091,0-0.117 c0.335-0.154,0.788-0.348,1.357-0.58c1.472-0.49,3.042-1.612,4.709-3.366c1.667-1.754,2.758-3.403,3.275-4.951 c0.078-0.206,0.193-0.413,0.349-0.62c0.49,1.522,1.421,3.108,2.791,4.759c1.447,1.779,2.932,3.043,4.457,3.79 c0.336,0.156,0.879,0.401,1.629,0.735C48.335,56.755,48.593,56.884,48.879,57.116z\"/>\n    </g>\n  </g>";
            }
        },
        MILITARY_HISTORY("13", "Military History", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-32.62453)\">\n    <text font-family=\"sans-serif\" font-size=\"130px\" transform=\"translate(234,442.6719)\">MH</text>\n  </g>";
            }
        },
        ADMINISTRATIVE("01", "Administrative", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 198 427.6719)\">ADM</text>\n  </g>";
            }
        },
        ALL_CLASSES_SUPPLY("02", "All Classes of Supply", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"108\" transform=\"matrix(1 0 0 1 212.5 434.25)\">ALL</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146\" x2=\"466\" y1=\"445.015\" y2=\"445.015\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <g id=\"text\">\n      <text font-family=\"sans-serif\" font-size=\"108\" transform=\"matrix(1 0 0 1 213.5 433.25)\">ALL</text>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"108\" transform=\"matrix(1 0 0 1 209.5 434.25)\">ALL</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"445.295\" y2=\"445.295\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"108\" transform=\"matrix(1 0 0 1 210.5 434.25)\">ALL</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        AIRPORT_DEBARKATION_AIRPORT_EMBARKATION("03", "Airport of Debarkation/Airport of Embarkation", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN_1) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(40 72) scale(0.8 0.8)\">\n      <ellipse cx=\"332.5\" cy=\"399.922\" fill=\"none\" rx=\"61.346\" ry=\"61.346\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"283.42\" x2=\"381.575\" y1=\"366.181\" y2=\"433.662\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"283.42\" x2=\"381.575\" y1=\"433.662\" y2=\"366.181\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"332.5\" x2=\"332.5\" y1=\"338.575\" y2=\"461.268\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"246.611\" x2=\"341.133\" y1=\"325.062\" y2=\"325.062\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"318.25\" x2=\"253.739\" y1=\"280.266\" y2=\"347.783\"/>\n  </g>";
            }
        },
        AMMUNITION("04", "Ammunition", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M285.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.781,0,21.888,6.491,22.4,19.837c0.893,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"277.5\" x2=\"339.501\" y1=\"438.464\" y2=\"438.464\"/>\n  </g>";
            }
        },
        BAND("05", "Band", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"79.7975\" transform=\"matrix(1 0 0 1 192.999 423.7715)\">BAND</text>\n  </g>";
            }
        },
        COMBAT_SERVICE_SUPPORT("06", "Combat Service Support", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-12.926289,6.82153)\">\n    <text font-family=\"sans-serif\" font-size=\"110px\" transform=\"translate(205,427.6719)\">CSS</text>\n  </g>";
            }
        },
        FINANCE("07", "Finance", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"none\" height=\"63.944\" stroke=\"#000000\" stroke-width=\"5\" width=\"113.678\" x=\"248.244\" y=\"374.685\"/>\n    <polyline fill=\"none\" points=\"247.533,373.265 262.454,353.371 347.711,353.371 362.632,373.265\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        JUDGE_ADVOCATE_GENERAL("08", "Judge Advocate General", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 205 427.6719)\">JAG</text>\n  </g>";
            }
        },
        LABOR("09", "Labor", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"387.083\" y2=\"352.75\"/>\n    <polygon fill=\"none\" points=\"306,432.667 284.208,389.083 327.792,389.083\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"274.667\" x2=\"337.334\" y1=\"352.75\" y2=\"352.75\"/>\n  </g>";
            }
        },
        LAUNDRY_BATH("10", "Laundry/Bath", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"318.393\" x2=\"318.393\" y1=\"441.039\" y2=\"372.373\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"317.393\" x2=\"290.356\" y1=\"377.706\" y2=\"377.706\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"317.393\" x2=\"291.643\" y1=\"377.706\" y2=\"351.956\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"317.393\" x2=\"294.063\" y1=\"377.706\" y2=\"401.036\"/>\n  </g>";
            }
        },
        MAINTENANCE("11", "Maintenance", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M205.008,356.7c21.705,0,39.3,17.595,39.3,39.299 c0,21.706-17.595,39.301-39.3,39.301\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"244.308\" x2=\"365.342\" y1=\"396\" y2=\"396\"/>\n    <path d=\"M404.642,435.3c-21.704,0-39.3-17.596-39.3-39.3s17.597-39.299,39.3-39.299\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MATERIAL("12", "Material", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 201.5 430.25)\">MAT</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <g id=\"text\">\n      <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 201.5 433.25)\">MAT</text>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 203.5 431.25)\">MAT</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"449.5\" y2=\"449.5\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 199.5 431.25)\">MAT</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        MEDICAL("13", "Medical", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"224.916\" y2=\"567.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"132\" x2=\"480\" y1=\"396\" y2=\"396\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"273.6\" y2=\"518.4\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"131.5\" x2=\"479.5\" y1=\"396\" y2=\"396\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"264\" y2=\"528\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"396\" y2=\"396\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"228.5\" y2=\"556.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"139.5\" x2=\"473.5\" y1=\"396\" y2=\"396\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        MEDICAL_TREATMENT_FACILITY("14", "Medical Treatment Facility", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"224.916\" y2=\"567.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"132\" x2=\"480\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"228.5\" x2=\"228.5\" y1=\"365.5\" y2=\"425.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"382.5\" x2=\"382.5\" y1=\"365.5\" y2=\"425.5\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"273.6\" y2=\"518.4\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"131.5\" x2=\"479.5\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"231.5\" x2=\"231.5\" y1=\"364.5\" y2=\"424.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"385.5\" x2=\"385.5\" y1=\"364.5\" y2=\"424.5\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"264\" y2=\"528\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"174\" x2=\"438\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"228.5\" x2=\"228.5\" y1=\"365.5\" y2=\"425.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"382.5\" x2=\"382.5\" y1=\"365.5\" y2=\"425.5\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"228.5\" y2=\"556.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"139.5\" x2=\"473.5\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"228.5\" x2=\"228.5\" y1=\"365.5\" y2=\"425.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"382.5\" x2=\"382.5\" y1=\"365.5\" y2=\"425.5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        MORALE_WELFARE_AND_RECREATION("15", "Morale Welfare and Recreation", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"88.7089\" transform=\"matrix(1 0 0 1 192 428.417)\">MWR</text>\n  </g>";
            }
        },
        MORTUARY_AFFAIRS_GRAVES_REGISTRATION("16", "Mortuary Affairs/Graves Registration", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"432.833\" y2=\"358.833\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"279.167\" x2=\"331.167\" y1=\"377.833\" y2=\"377.833\"/>\n    <rect fill=\"none\" height=\"89.675\" stroke=\"#000000\" stroke-width=\"5\" width=\"69.334\" x=\"270.416\" y=\"351.163\"/>\n  </g>";
            }
        },
        MULTIPLE_CLASSES_OF_SUPPLY("17", "Multiple Classes of Supply", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 199.5 426.25)\">MULT</text>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <g id=\"text\">\n      <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 199.5 432.25)\">MULT</text>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 202.3203 425.6699)\">MULT</text>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 194.5 423.25)\">MULT</text>\n  </g>";
                    default -> null;
                };
            }
        },
        NATO_SUPPLY_CLASS_I("18", "NATO Supply Class I", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 293.5 429.25)\">I</text>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <g id=\"text\">\n      <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 292.082 438.25)\">I</text>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 293.5 429.25)\">I</text>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 293.5 427.25)\">I</text>\n  </g>";
                    default -> null;
                };
            }
        },
        NATO_SUPPLY_CLASS_II("19", "NATO Supply Class II", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 282.5 429.25)\">II</text>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <g id=\"text\">\n      <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 286.082 438.25)\">II</text>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 283.5 429.25)\">II</text>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 283.5 427.25)\">II</text>\n  </g>";
                    default -> null;
                };
            }
        },
        NATO_SUPPLY_CLASS_III("20", "NATO Supply Class III", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n    <polyline fill=\"none\" points=\"305.912,409.61 272.274,356.75 339.552,356.75 305.912,409.61 305.912,443.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <g>\n      <polyline fill=\"none\" points=\"311.912,409.61 278.274,356.75 345.552,356.75 311.912,409.61 311.912,443.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n    <polyline fill=\"none\" points=\"305.912,410.61 272.274,357.75 339.552,357.75 305.912,410.61 305.912,444.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n    <polyline fill=\"none\" points=\"305.912,409.61 272.274,356.75 339.552,356.75 305.912,409.61 305.912,443.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        NATO_SUPPLY_CLASS_IV("21", "NATO Supply Class IV", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 270.5 430.25)\">IV</text>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <g id=\"text\">\n      <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 268.082 438.25)\">IV</text>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 269.5 429.25)\">IV</text>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 271.5 426.25)\">IV</text>\n  </g>";
                    default -> null;
                };
            }
        },
        NATO_SUPPLY_CLASS_V("22", "NATO Supply Class V", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <path d=\"M282.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.782,0,21.888,6.491,22.401,19.837c0.894,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"274.5\" x2=\"336.501\" y1=\"438.464\" y2=\"438.464\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <g>\n      <path d=\"M285.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.779,0,21.888,6.491,22.398,19.837c0.895,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"277.5\" x2=\"339.501\" y1=\"438.464\" y2=\"438.464\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <path d=\"M282.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.782,0,21.888,6.491,22.401,19.837c0.894,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"274.5\" x2=\"336.501\" y1=\"438.464\" y2=\"438.464\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <path d=\"M282.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.782,0,21.888,6.491,22.401,19.837c0.894,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"274.5\" x2=\"336.501\" y1=\"438.464\" y2=\"438.464\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        ORDNANCE("23", "Ordnance", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"410.361\" fill=\"none\" rx=\"40.333\" ry=\"29.654\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"332.169\" x2=\"352.17\" y1=\"392.688\" y2=\"359.375\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"284.254\" x2=\"269.833\" y1=\"385.392\" y2=\"352.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"273.168\" x2=\"253.167\" y1=\"393.146\" y2=\"359.833\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"321.084\" x2=\"335.504\" y1=\"384.934\" y2=\"352.292\"/>\n  </g>";
            }
        },
        PERSONNEL_SERVICES("24", "Personnel Services", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 220 442.6719)\">PS</text>\n  </g>";
            }
        },
        PETROLEUM_OIL_LUBRICANTS("25", "Petroleum Oil and Lubricants", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"306,408.679 268.649,349.985 343.351,349.985 306,408.679 306,446.029\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        PUBLIC_AFFAIRS_PUBLIC_INFORMATION("28", "Public Affairs/Public Information", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 220 442.6719)\">PA</text>\n  </g>";
            }
        },
        QUARTERMASTER("29", "Quartermaster", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"385\" cy=\"396\" fill=\"none\" r=\"30.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"354.25\" x2=\"189\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"208\" y1=\"396\" y2=\"433\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"242.5\" x2=\"242.5\" y1=\"396\" y2=\"433\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"242.5\" y1=\"419.5\" y2=\"419.5\"/>\n  </g>";
            }
        },
        RAILHEAD("30", "Railhead", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN_1) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(20 50) scale(0.9 0.9)\">\n      <path d=\"M318.888,310.48c34.122,0,61.782,27.66,61.782,61.782 c0,34.117-27.657,61.778-61.782,61.778c-34.119,0-61.779-27.662-61.779-61.778C257.109,338.14,284.768,310.48,318.888,310.48z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"269.465\" x2=\"368.312\" y1=\"338.281\" y2=\"406.238\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"269.465\" x2=\"368.312\" y1=\"406.238\" y2=\"338.281\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"318.888\" x2=\"318.888\" y1=\"310.48\" y2=\"434.04\"/>\n    </g>\n    <g transform=\"translate(40 -30) scale(0.8 0.7)\">\n      <ellipse cx=\"271.97\" cy=\"495.271\" fill=\"none\" rx=\"10.04\" ry=\"10.039\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"299.771\" cy=\"495.271\" fill=\"none\" rx=\"10.04\" ry=\"10.039\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"395.53\" cy=\"495.271\" fill=\"none\" rx=\"10.04\" ry=\"10.039\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"367.727\" cy=\"495.271\" fill=\"none\" rx=\"10.04\" ry=\"10.039\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"258.069\" x2=\"409.431\" y1=\"482.143\" y2=\"482.143\"/>\n    </g>\n  </g>";
            }
        },
        RELIGIOUS_SUPPORT("31", "Religious Support", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" transform=\"matrix(1 0 0 1 193 433.6719)\">REL</text>\n  </g>";
            }
        },
        REPLACEMENT_HOLDING_UNIT("32", "Replacement Holding Unit", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 202 427.6719)\">RHU</text>\n  </g>";
            }
        },
        SEA_PORT_DEBARKATION_SEA_PORT_EMBARKATION("33", "Sea Port of Debarkation/Sea Port of Embarkation", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN_1) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(20 50) scale(0.9 0.9)\">\n      <path d=\"M317.777,346.591c24.15,0,43.722,19.576,43.722,43.726 c0,24.145-19.575,43.723-43.722,43.723c-24.148,0-43.723-19.578-43.723-43.723C274.053,366.167,293.629,346.591,317.777,346.591z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"282.798\" x2=\"352.756\" y1=\"366.267\" y2=\"414.363\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"282.798\" x2=\"352.756\" y1=\"414.363\" y2=\"366.267\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"317.777\" x2=\"317.777\" y1=\"346.591\" y2=\"434.04\"/>\n    </g>\n    <g>\n      <ellipse cx=\"306\" cy=\"284.234\" fill=\"none\" rx=\"6.234\" ry=\"6.234\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"290.469\" y2=\"352.814\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"287.508\" x2=\"324.313\" y1=\"294.365\" y2=\"294.365\"/>\n      <path d=\"M267.034,321.642c19.483,38.966,58.449,38.966,77.932,0 C325.482,366.453,286.517,366.453,267.034,321.642\" stroke=\"#000000\" stroke-width=\"3\"/>\n      <path d=\"M267.034,321.642c3.118,17.535,5.066,17.535,5.066,17.535l5.845-7.793 c-5.065-1.948-7.014-5.846-9.741-8.573\" stroke=\"#000000\" stroke-width=\"3\"/>\n      <path d=\"M344.966,321.642c-3.117,17.535-5.063,17.535-5.063,17.535l-5.848-7.793 c5.065-1.948,7.017-5.846,9.741-8.573\" stroke=\"#000000\" stroke-width=\"3\"/>\n    </g>\n  </g>";
            }
        },
        SUPPLY("34", "Supply", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"123.5\" x2=\"488.5\" y1=\"445.015\" y2=\"445.295\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        JOINT_INFORMATION_BUREAU("35", "Joint Information Bureau", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" transform=\"matrix(1 0 0 1 220 435.6719)\">JIB</text>\n  </g>";
            }
        },
        TRANSPORTATION("36", "Transportation", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(20 50) scale(0.9 0.9)\">\n      <path d=\"M315.304,335.204c27.295,0,49.419,22.126,49.419,49.421 c0,27.289-22.127,49.417-49.419,49.417s-49.417-22.128-49.417-49.417C265.885,357.33,288.011,335.204,315.304,335.204z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"275.769\" x2=\"354.838\" y1=\"357.442\" y2=\"411.802\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"275.769\" x2=\"354.838\" y1=\"411.802\" y2=\"357.442\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.304\" x2=\"315.304\" y1=\"335.204\" y2=\"434.042\"/>\n    </g>\n  </g>";
            }
        },
        US_SUPPLY_CLASS_I("37", "US Supply Class I", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n    <path d=\"M303.169,395.149c0-19.191,12.044-35.562,28.983-41.987 c-4.949-1.877-10.313-2.914-15.918-2.914c-24.799,0-44.902,20.103-44.902,44.901c0,24.798,20.103,44.902,44.902,44.902 c5.604,0,10.969-1.036,15.918-2.914C315.213,430.711,303.169,414.341,303.169,395.149z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <path d=\"M301.169,396.149c0-19.191,12.044-35.563,28.983-41.987 c-4.949-1.877-10.313-2.914-15.918-2.914c-24.799,0-44.902,20.103-44.902,44.901c0,24.798,20.103,44.9,44.902,44.9 c5.604,0,10.969-1.036,15.918-2.914C313.213,431.711,301.169,415.341,301.169,396.149z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n    <path d=\"M303.169,395.149c0-19.191,12.044-35.562,28.983-41.987 c-4.949-1.877-10.313-2.914-15.918-2.914c-24.799,0-44.902,20.103-44.902,44.901c0,24.798,20.103,44.902,44.902,44.902 c5.604,0,10.969-1.036,15.918-2.914C315.213,430.711,303.169,414.341,303.169,395.149z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n    <path d=\"M303.169,395.149c0-19.191,12.044-35.562,28.983-41.987 c-4.949-1.877-10.313-2.914-15.918-2.914c-24.799,0-44.902,20.103-44.902,44.901c0,24.798,20.103,44.902,44.902,44.902 c5.604,0,10.969-1.036,15.918-2.914C315.213,430.711,303.169,414.341,303.169,395.149z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        US_SUPPLY_CLASS_II("38", "US Supply Class II", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <circle cx=\"386\" cy=\"395\" fill=\"none\" r=\"30.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"355.25\" x2=\"190\" y1=\"395\" y2=\"395\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"209\" x2=\"209\" y1=\"395\" y2=\"432\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"243.5\" x2=\"243.5\" y1=\"395\" y2=\"432\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"209\" x2=\"243.5\" y1=\"418.5\" y2=\"418.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"123.5\" x2=\"488.5\" y1=\"445.015\" y2=\"445.295\"/>\n    <g>\n      <circle cx=\"385\" cy=\"396\" fill=\"none\" r=\"30.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"354.25\" x2=\"189\" y1=\"396\" y2=\"396\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"208\" y1=\"396\" y2=\"433\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"242.5\" x2=\"242.5\" y1=\"396\" y2=\"433\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"242.5\" y1=\"419.5\" y2=\"419.5\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <circle cx=\"386\" cy=\"395\" fill=\"none\" r=\"30.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"355.25\" x2=\"190\" y1=\"395\" y2=\"395\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"209\" x2=\"209\" y1=\"395\" y2=\"432\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"243.5\" x2=\"243.5\" y1=\"395\" y2=\"432\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"209\" x2=\"243.5\" y1=\"418.5\" y2=\"418.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <circle cx=\"386\" cy=\"395\" fill=\"none\" r=\"30.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"355.25\" x2=\"190\" y1=\"395\" y2=\"395\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"209\" x2=\"209\" y1=\"395\" y2=\"432\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"243.5\" x2=\"243.5\" y1=\"395\" y2=\"432\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"209\" x2=\"243.5\" y1=\"418.5\" y2=\"418.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        US_SUPPLY_CLASS_III("39", "US Supply Class III", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n    <polyline fill=\"none\" points=\"305.912,409.61 272.274,356.75 339.552,356.75 305.912,409.61 305.912,443.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"123.5\" x2=\"488.5\" y1=\"445.015\" y2=\"445.295\"/>\n    <polyline fill=\"none\" points=\"311.912,409.61 278.274,356.75 345.552,356.75 311.912,409.61 311.912,443.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n    <polyline fill=\"none\" points=\"305.912,411.61 272.274,358.75 339.552,358.75 305.912,411.61 305.912,445.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n    <polyline fill=\"none\" points=\"305.912,409.61 272.274,356.75 339.552,356.75 305.912,409.61 305.912,443.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        US_SUPPLY_CLASS_IV("40", "US Supply Class IV", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\" transform=\"translate(20 0) scale(0.9 0.9)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"317.869\" x2=\"317.869\" y1=\"392.222\" y2=\"492.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"225.647\" x2=\"225.647\" y1=\"392.222\" y2=\"492.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"410.091\" x2=\"410.091\" y1=\"392.222\" y2=\"492.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"222.869\" x2=\"412.869\" y1=\"392.222\" y2=\"392.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"140.283\" x2=\"495.838\" y1=\"494.461\" y2=\"494.461\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <g transform=\"translate(20 0) scale(0.9 0.9)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"316.758\" x2=\"316.758\" y1=\"391.111\" y2=\"491.111\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"224.536\" x2=\"224.536\" y1=\"391.111\" y2=\"491.111\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"408.98\" x2=\"408.98\" y1=\"391.111\" y2=\"491.111\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"221.758\" x2=\"411.758\" y1=\"391.111\" y2=\"391.111\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\" transform=\"translate(20 0) scale(0.9 0.9)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"317.869\" x2=\"317.869\" y1=\"392.222\" y2=\"492.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"225.647\" x2=\"225.647\" y1=\"392.222\" y2=\"492.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"410.091\" x2=\"410.091\" y1=\"392.222\" y2=\"492.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"222.869\" x2=\"412.869\" y1=\"392.222\" y2=\"392.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"170.092\" x2=\"463.424\" y1=\"496.578\" y2=\"496.578\"/>\n  </g>";
                    case "6" -> "<g id=\"main\" transform=\"translate(20 0) scale(0.9 0.9)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"317.869\" x2=\"317.869\" y1=\"392.222\" y2=\"492.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"225.647\" x2=\"225.647\" y1=\"392.222\" y2=\"492.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"410.091\" x2=\"410.091\" y1=\"392.222\" y2=\"492.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"222.869\" x2=\"412.869\" y1=\"392.222\" y2=\"392.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"172.313\" x2=\"461.202\" y1=\"494.772\" y2=\"494.772\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        US_SUPPLY_CLASS_V("41", "US Supply Class V", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <path d=\"M282.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.782,0,21.888,6.491,22.401,19.837c0.894,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"274.5\" x2=\"336.501\" y1=\"438.464\" y2=\"438.464\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"123.5\" x2=\"488.5\" y1=\"445.015\" y2=\"445.295\"/>\n    <g>\n      <path d=\"M285.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.779,0,21.888,6.491,22.398,19.837c0.895,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"277.5\" x2=\"339.501\" y1=\"438.464\" y2=\"438.464\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <path d=\"M282.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.782,0,21.888,6.491,22.401,19.837c0.894,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"274.5\" x2=\"336.501\" y1=\"438.464\" y2=\"438.464\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <path d=\"M282.762,441.453c0-29.548-0.169-50.313,0.945-70.15 c0.76-13.533,12.519-17.831,21.73-17.831c8.782,0,21.888,6.491,22.401,19.837c0.894,23.18,0.624,37.569,0.624,68.144\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"274.5\" x2=\"336.501\" y1=\"438.464\" y2=\"438.464\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        US_SUPPLY_CLASS_VI("42", "US Supply Class VI", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"365.778\" fill=\"none\" rx=\"12.808\" ry=\"12.808\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"283.586\" x2=\"328.414\" y1=\"391.394\" y2=\"391.394\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"378.585\" y2=\"423.412\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"286.788\" y1=\"420.211\" y2=\"439.424\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"325.213\" y1=\"420.211\" y2=\"439.424\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126\" x2=\"486\" y1=\"445.295\" y2=\"445.295\"/>\n    <g>\n      <ellipse cx=\"307\" cy=\"364.778\" fill=\"none\" rx=\"12.808\" ry=\"12.808\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"284.586\" x2=\"329.414\" y1=\"390.394\" y2=\"390.394\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"307\" x2=\"307\" y1=\"377.585\" y2=\"422.412\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"307\" x2=\"287.788\" y1=\"419.211\" y2=\"438.424\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"307\" x2=\"326.213\" y1=\"419.211\" y2=\"438.424\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"365.778\" fill=\"none\" rx=\"12.808\" ry=\"12.808\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"283.586\" x2=\"328.414\" y1=\"391.394\" y2=\"391.394\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"378.585\" y2=\"423.412\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"286.788\" y1=\"420.211\" y2=\"439.424\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"325.213\" y1=\"420.211\" y2=\"439.424\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"365.778\" fill=\"none\" rx=\"12.808\" ry=\"12.808\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"283.586\" x2=\"328.414\" y1=\"391.394\" y2=\"391.394\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"378.585\" y2=\"423.412\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"286.788\" y1=\"420.211\" y2=\"439.424\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"325.213\" y1=\"420.211\" y2=\"439.424\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        US_SUPPLY_CLASS_VII("43", "US Supply Class VII", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <ellipse cx=\"223.808\" cy=\"408.003\" rx=\"24.808\" ry=\"24.808\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"389.191\" cy=\"408.003\" rx=\"24.808\" ry=\"24.808\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M230.699,394.221c48.237-41.346,103.363-41.346,151.602,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126\" x2=\"486\" y1=\"445.295\" y2=\"445.295\"/>\n    <g>\n      <ellipse cx=\"222.808\" cy=\"401.003\" rx=\"24.808\" ry=\"24.808\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"388.191\" cy=\"401.003\" rx=\"24.808\" ry=\"24.808\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M229.699,387.221c48.237-41.346,103.363-41.346,151.602,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <ellipse cx=\"223.808\" cy=\"408.003\" rx=\"24.808\" ry=\"24.808\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"389.191\" cy=\"408.003\" rx=\"24.808\" ry=\"24.808\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M230.699,394.221c48.237-41.346,103.363-41.346,151.602,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <ellipse cx=\"223.808\" cy=\"408.003\" rx=\"24.808\" ry=\"24.808\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"389.191\" cy=\"408.003\" rx=\"24.808\" ry=\"24.808\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M230.699,394.221c48.237-41.346,103.363-41.346,151.602,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        US_SUPPLY_CLASS_VIII("44", "US Supply Class VIII", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"343\" y2=\"343\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"307.082\" x2=\"307.082\" y1=\"276\" y2=\"441\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126\" x2=\"486\" y1=\"445.295\" y2=\"445.295\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126\" x2=\"486\" y1=\"350.295\" y2=\"350.295\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"308\" x2=\"308\" y1=\"280.295\" y2=\"445.295\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"343\" y2=\"343\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"307.082\" x2=\"307.082\" y1=\"273\" y2=\"445.295\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"346.795\" y2=\"346.795\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.082\" x2=\"306.082\" y1=\"276.795\" y2=\"441.795\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        US_SUPPLY_CLASS_IX("45", "US Supply Class IX", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <ellipse cx=\"306.082\" cy=\"395.542\" fill=\"none\" rx=\"25.402\" ry=\"25.402\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266.891\" x2=\"286.486\" y1=\"370.866\" y2=\"383.204\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"325.677\" x2=\"345.273\" y1=\"407.881\" y2=\"420.218\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266.891\" x2=\"286.486\" y1=\"420.218\" y2=\"407.881\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"325.677\" x2=\"345.273\" y1=\"383.204\" y2=\"370.866\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.082\" x2=\"306.082\" y1=\"348.367\" y2=\"370.141\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.082\" x2=\"306.082\" y1=\"442.717\" y2=\"420.944\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126\" x2=\"486\" y1=\"445.295\" y2=\"445.295\"/>\n    <g>\n      <ellipse cx=\"305.082\" cy=\"395.542\" fill=\"none\" rx=\"25.402\" ry=\"25.402\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"265.891\" x2=\"285.486\" y1=\"370.866\" y2=\"383.204\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"324.677\" x2=\"344.273\" y1=\"407.881\" y2=\"420.218\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"265.891\" x2=\"285.486\" y1=\"420.218\" y2=\"407.881\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"324.677\" x2=\"344.273\" y1=\"383.204\" y2=\"370.866\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.082\" x2=\"305.082\" y1=\"348.367\" y2=\"370.141\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.082\" x2=\"305.082\" y1=\"442.717\" y2=\"420.944\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n    <g>\n      <ellipse cx=\"306.082\" cy=\"395.542\" fill=\"none\" rx=\"25.402\" ry=\"25.402\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266.891\" x2=\"286.486\" y1=\"370.866\" y2=\"383.204\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"325.677\" x2=\"345.273\" y1=\"407.881\" y2=\"420.218\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266.891\" x2=\"286.486\" y1=\"420.218\" y2=\"407.881\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"325.677\" x2=\"345.273\" y1=\"383.204\" y2=\"370.866\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.082\" x2=\"306.082\" y1=\"348.367\" y2=\"370.141\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.082\" x2=\"306.082\" y1=\"442.717\" y2=\"420.944\"/>\n    </g>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <ellipse cx=\"306.082\" cy=\"395.542\" fill=\"none\" rx=\"25.402\" ry=\"25.402\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266.891\" x2=\"286.486\" y1=\"370.866\" y2=\"383.204\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"325.677\" x2=\"345.273\" y1=\"407.881\" y2=\"420.218\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266.891\" x2=\"286.486\" y1=\"420.218\" y2=\"407.881\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"325.677\" x2=\"345.273\" y1=\"383.204\" y2=\"370.866\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.082\" x2=\"306.082\" y1=\"348.367\" y2=\"370.141\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.082\" x2=\"306.082\" y1=\"442.717\" y2=\"420.944\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        US_SUPPLY_CLASS_X("46", "US Supply Class X", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"146.255\" x2=\"466.254\" y1=\"445.015\" y2=\"445.015\"/>\n    <g id=\"text\">\n      <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 216.082 437.25)\">CA</text>\n    </g>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" id=\"line\" stroke=\"#000000\" stroke-width=\"5\" x1=\"126.082\" x2=\"486.082\" y1=\"445.015\" y2=\"445.295\"/>\n    <g id=\"text\">\n      <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 221.082 438.25)\">CA</text>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"173.083\" x2=\"437.082\" y1=\"446.92\" y2=\"446.92\"/>\n    <g id=\"text\">\n      <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 214.082 436.25)\">CA</text>\n    </g>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 216 436.25)\">CA</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"175.082\" x2=\"435.082\" y1=\"445.295\" y2=\"445.295\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        WATER_PURIFICATION("48", "Water Purification", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"299.495\" x2=\"346.603\" y1=\"351.784\" y2=\"351.784\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"323.049\" x2=\"323.049\" y1=\"375.338\" y2=\"351.784\"/>\n    <path d=\"M228.833,375.338h113.059c37.688,0,45.226,42.397,47.108,70.662\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 203.9658 439.25)\">PURE</text>\n  </g>";
            }
        },
        BROADCAST("49", "Broadcast", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"82\" transform=\"matrix(1 0 0 1 192 428.417)\">BPAD</text>\n  </g>";
            }
        },
        INTERPRETER_TRANSLATOR("51", "Interpreter/Translator", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" style=\"stroke-width:5;stroke-dasharray:none\" transform=\"translate(-3.26823,1.73809)\">\n    <path d=\"m 217.60436,374.76755 h 50 v -25 l 40,45 -40,45 v -25 h -50 z\" style=\"fill:#fffffc;fill-opacity:1;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-dasharray:none\"/>\n    <path d=\"m 398.934,374.76755 h -50 v -25 l -40,45 40,45 v -25 h 50 z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-dasharray:none\"/>\n  </g>";
            }
        },
        SUPPORT("52", "Support", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-8.25344,4.82153)\">\n    <text font-family=\"sans-serif\" font-size=\"110px\" transform=\"translate(205,429.6719)\">SPT</text>\n  </g>";
            }
        },
        ARMY_FIELD_SUPPORT("53", "Army Field Support", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-4.33254,4.82153)\">\n    <text font-family=\"sans-serif\" font-size=\"110px\" transform=\"translate(205,429.6719)\">AFS</text>\n  </g>";
            }
        },
        CONTRACTOR_SUPPORT("54", "Contractor Support", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-7.23049)\">\n    <text font-family=\"sans-serif\" font-size=\"130px\" transform=\"translate(220,442.6719)\">KS</text>\n  </g>";
            }
        },
        PARACHUTE_RIGGER("55", "Parachute Rigger", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-0.0071)\">\n    <path d=\"m 265,380 h 80 m -40,-30 c -28.6059,0.15892 -40,13.4725 -40,30 l 40,65 40,-65 c -0.31784,-13.9848 -11.3941,-30.15892 -40,-30 z\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        HUMAN_RESOURCES("56", "Human Resources (HR)", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-15.64113)\">\n    <text font-family=\"sans-serif\" font-size=\"130px\" transform=\"translate(220,442.6719)\">HR</text>\n  </g>";
            }
        },
        NAVAL_ET("01", "Naval", LandUnitsEntity.NAVAL, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"357.529\" fill=\"none\" rx=\"7.404\" ry=\"7.404\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"364.934\" y2=\"438.982\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268.976\" x2=\"343.023\" y1=\"369.562\" y2=\"369.562\"/>\n    <path d=\"M259.72,401.959c23.14,46.279,69.418,46.279,92.559,0 C329.139,455.181,282.86,455.181,259.72,401.959\" stroke=\"#000000\" stroke-width=\"3\"/>\n    <path d=\"M259.72,401.959c3.703,20.826,6.017,20.826,6.017,20.826l6.942-9.256 c-6.016-2.314-8.33-6.943-11.569-10.185\" stroke=\"#000000\" stroke-width=\"3\"/>\n    <path d=\"M352.279,401.959c-3.701,20.826-6.016,20.826-6.016,20.826l-6.941-9.256 c6.016-2.314,8.33-6.943,11.566-10.185\" stroke=\"#000000\" stroke-width=\"3\"/>\n  </g>";
            }
        },
        ALLIED_COMMAND_EUROPE_RAPID_REACTION_CORPS_ARRC("01", "Allied Command Europe Rapid Reaction Corps (ARRC)", LandUnitsEntity.NAMED_HEADQUARTERS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"79.7975\" transform=\"matrix(1 0 0 1 192.999 423.7715)\">ARRC</text>\n  </g>";
            }
        },
        ALLIED_COMMAND_OPERATIONS("02", "Allied Command Operations", LandUnitsEntity.NAMED_HEADQUARTERS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 202 427.6719)\">ACO</text>\n  </g>";
            }
        },
        INTERNATIONAL_SECURITY_ASSISTANCE_FORCE_ISAF("03", "International Security Assistance Force (ISAF)", LandUnitsEntity.NAMED_HEADQUARTERS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 195.9985 431.959)\">ISAF</text>\n  </g>";
            }
        },
        MULTINATIONAL_MN("04", "Multinational (MN)", LandUnitsEntity.NAMED_HEADQUARTERS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 204 442.6719)\">MN</text>\n  </g>";
            }
        },
        BUREAU_ATF("01", "Bureau of Alcohol Tobacco Firearms and Explosives (ATF) (Department of Justice)", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" transform=\"matrix(1 0 0 1 203 435.25)\">ATF</text>\n  </g>";
            }
        },
        DRUG_ENFORCEMENT_ADMINISTRATION_DEA("04", "Drug Enforcement Administration (DEA)", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"102\" transform=\"matrix(1 0 0 1 194 435.25)\">DEA</text>\n  </g>";
            }
        },
        FEDERAL_BUREAU_INVESTIGATION_FBI("06", "Federal Bureau of Investigation (FBI)", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 207 438.25)\">FBI</text>\n  </g>";
            }
        },
        POLICE("07", "Police", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M264.659,353.621c0,71.906,16.594,77.438,45.909,88.5\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M353.159,353.621c0,71.906-16.594,77.438-45.909,88.5\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M263,353.621c23.785,13.828,23.785,13.828,45.91,0 c22.125,13.828,22.125,13.828,45.909,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        UNITED_STATES_SECRET_SERVICE_USSS("09", "United States Secret Service (USSS)", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"84\" id=\"USSS\" transform=\"matrix(1 0 0 1 191.5 426.5)\">USSS</text>\n  </g>";
            }
        },
        TRANSPORTATION_SECURITY_ADMINISTRATION_TSA("10", "Transportation Security Administration (TSA)", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"106\" transform=\"matrix(1 0 0 1 196 437.25)\">TSA</text>\n  </g>";
            }
        },
        COAST_GUARD("11", "Coast Guard", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"240.001,468.194 199.786,387.765 250.055,387.765 250.055,322.416 360.646,322.416 360.646,387.765 410.914,387.765 370.698,468.194\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polygon points=\"385.78,387.765 345.566,468.194 320.432,468.194 360.646,387.765\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        INTERNAL_SECURITY_FORCE("13", "Internal Security Force", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 215 438.25)\">ISF</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final LandUnitsEntity entity;
    private final GraphicType graphicType;

    LandUnitsEntityType(String id, String label, LandUnitsEntity entity, GraphicType graphicType) {
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
    public Entity getEntity() {
        return entity;
    }

    @Override
    public List<EntitySubType> getEntitySubTypes() {
        return LandUnitsSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}