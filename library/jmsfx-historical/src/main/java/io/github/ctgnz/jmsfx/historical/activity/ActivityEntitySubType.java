package io.github.ctgnz.jmsfx.historical.activity;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum ActivityEntitySubType implements EntitySubType {
        ARREST("01", "Arrest", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"305\" cy=\"396\" fill=\"none\" rx=\"100\" ry=\"100\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <ellipse cx=\"305\" cy=\"336\" fill=\"none\" rx=\"20\" ry=\"20\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"305\" x2=\"305\" y1=\"356\" y2=\"481\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"275\" x2=\"335\" y1=\"386\" y2=\"386\"/>\n  </g>";
            }
        },
        ATTEMPTED_CRIMINAL_ACTIVITY("03", "Attempted Criminal Activity", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-dasharray=\"12\" stroke-width=\"7.1461\" x1=\"203.966\" x2=\"401.5\" y1=\"346.985\" y2=\"445.015\"/>\n    <ellipse cx=\"306\" cy=\"360.902\" fill=\"none\" rx=\"13.912\" ry=\"12.94\" stroke=\"#000000\" stroke-width=\"6.7086\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"6.7086\" x1=\"306\" x2=\"306\" y1=\"373.843\" y2=\"445.015\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"6.7086\" x1=\"285.133\" x2=\"326.867\" y1=\"393.253\" y2=\"393.253\"/>\n  </g>";
            }
        },
        DRIVE_BY_SHOOTING("04", "Drive-by Shooting", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"305\" x2=\"305\" y1=\"296\" y2=\"446\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"230\" x2=\"385\" y1=\"446\" y2=\"446\"/>\n    <ellipse cx=\"370\" cy=\"462\" fill=\"none\" rx=\"16\" ry=\"16\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <ellipse cx=\"240\" cy=\"462\" fill=\"none\" rx=\"16\" ry=\"16\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polyline fill=\"none\" points=\"280,321 305,296 330,321\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        DRUG_RELATED("05", "Drug Related", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"76\" transform=\"matrix(1 0 0 1 192.5005 428.3975)\">DRUG</text>\n  </g>";
            }
        },
        EXTORTION("06", "Extortion", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"250\" transform=\"matrix(1 0 0 1 223.3135 486)\">S</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"296.688\" x2=\"296.688\" y1=\"286\" y2=\"506\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"316.688\" x2=\"316.688\" y1=\"286\" y2=\"506\"/>\n  </g>";
            }
        },
        GRAFFITI("07", "Graffiti", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M335,312c-30,0-30,42,0,42s30,42,0,42s-30,42,0,42s30,42,0,42\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <path d=\"M275,312c-30,0-30,42,0,42s30,42,0,42s-30,42,0,42s30,42,0,42\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        KILLING("08", "Killing", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"7.1461\" x1=\"203.966\" x2=\"401.5\" y1=\"346.985\" y2=\"445.015\"/>\n    <ellipse cx=\"306\" cy=\"360.902\" fill=\"none\" rx=\"13.912\" ry=\"12.94\" stroke=\"#000000\" stroke-width=\"6.7086\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"6.7086\" x1=\"306\" x2=\"306\" y1=\"373.843\" y2=\"445.015\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"6.7086\" x1=\"285.133\" x2=\"326.867\" y1=\"393.253\" y2=\"393.253\"/>\n  </g>";
            }
        },
        POISONING("09", "Poisoning", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"305.199\" cy=\"350.5\" fill=\"none\" rx=\"40\" ry=\"40\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"210.199\" x2=\"400.199\" y1=\"342.5\" y2=\"452.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"400.199\" x2=\"210.199\" y1=\"342.5\" y2=\"452.5\"/>\n  </g>";
            }
        },
        CIVIL_RIOTING("10", "Civil Rioting", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Symbol\">\n      <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 197.5 433.3975)\">RIOT</text>\n    </g>\n  </g>";
            }
        },
        BOOBY_TRAP("11", "Booby Trap", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"305\" cy=\"447\" fill=\"none\" rx=\"90\" ry=\"45\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polyline fill=\"none\" points=\"215,442 305,302 395,442\" stroke=\"#000000\" stroke-width=\"9\"/>\n  </g>";
            }
        },
        BLACK_MARKETING("13", "Black Marketing", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 207.5 455.8613)\">MKT</text>\n    <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 220 375.0488)\">BLK</text>\n  </g>";
            }
        },
        VANDALISM_LOOT_RANSACK_PLUNDER("14", "Vandalism / Loot / Ransack / Plunder", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M225,456c0-120,160-120,160,0H225z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <path d=\"M345,376c0-20,20-40,40-40\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <path d=\"M265,376c0-20-20-40-40-40\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        ROBBERY("16", "Robbery", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 194.5 435.25)\">ROB</text>\n  </g>";
            }
        },
        THEFT("17", "Theft", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"105\" transform=\"matrix(1 0 0 1 203.9658 435.25)\">THF</text>\n  </g>";
            }
        },
        BURGLARY("18", "Burglary", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 193.9658 431.25)\">BUR</text>\n  </g>";
            }
        },
        SMUGGLING("19", "Smuggling", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 187.5 424.3975)\">SMGL</text>\n  </g>";
            }
        },
        DEAD_BODY("21", "Dead Body", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"298\" x2=\"298\" y1=\"402\" y2=\"462\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"213\" x2=\"348\" y1=\"432\" y2=\"432\"/>\n    <ellipse cx=\"368\" cy=\"432\" fill=\"none\" rx=\"25\" ry=\"25\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"55\" transform=\"matrix(1 0 0 1 258.2808 377)\">DB</text>\n  </g>";
            }
        },
        SABOTAGE("22", "Sabotage", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 199.5 432)\">SAB</text>\n  </g>";
            }
        },
        BOMB_THREAT("01", "Bomb Threat", ActivityEntityType.BOMB_BOMBING, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 195.5005 424.3975)\">BOMB</text>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 279.5005 357.7051)\">?</text>\n  </g>";
            }
        },
        IED_EXPLOSION("01", "IED Explosion", ActivityEntityType.IED_EVENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"192.4,394.2 231.6,364.6 224.4,319.8 254.8,341.4 263.6,301.4 289.2,348.6 302,287.8 319.6,334.2 348.4,299.8 354,344.6 382.8,320.6 382.8,370.2 417.2,401.4 382.8,430.2 390,462.2 357.2,446.2 352.4,486.2 326.8,440.6 306,505.4 285.2,455.8 266.8,481.4 250.8,433.4 217.2,447.8 227.6,425.4 192.4,394.2\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 231.9824 426)\">IED</text>\n  </g>";
            }
        },
        PREMATURE_IED_EXPLOSION("02", "Premature IED Explosion", ActivityEntityType.IED_EVENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"226.583,428.003 253.796,406.973 248.798,375.143 269.9,390.49 276.01,362.071 293.781,395.606 302.667,352.408 314.885,385.375 334.877,360.934 338.765,392.764 358.757,375.712 358.757,410.951 382.638,433.119 358.757,453.58 363.756,476.315 340.986,464.948 337.654,493.367 319.883,460.969 305.443,507.009 291.004,471.769 278.231,489.957 267.125,455.854 243.8,466.085 251.02,450.171 226.583,428.003\" stroke=\"#000000\" stroke-width=\"3.5114\"/>\n    <text font-family=\"sans-serif\" font-size=\"63.9431\" transform=\"matrix(0.9771 0 0 1 254.0615 450.5967)\">IED</text>\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 282.5 346.75)\">P</text>\n  </g>";
            }
        },
        IED_CACHE("03", "IED Cache", ActivityEntityType.IED_EVENT, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"145\" x2=\"465\" y1=\"445.015\" y2=\"445.015\"/>\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 207.5 437.25)\">IED</text>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10.735\" x1=\"125.082\" x2=\"485.082\" y1=\"447.5\" y2=\"447.5\"/>\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 210.5 439.25)\">IED</text>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"173\" x2=\"437\" y1=\"448\" y2=\"448\"/>\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 210.5 439.25)\">IED</text>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"175\" x2=\"435\" y1=\"443\" y2=\"443\"/>\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 207.9658 434.25)\">IED</text>\n  </g>";
                    default -> null;
                };
            }
        },
        IED_SUICIDE_BOMBER("04", "IED Suicide Bomber", ActivityEntityType.IED_EVENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"55\" transform=\"matrix(1 0 0 1 262.9995 334.25)\">IED</text>\n    <ellipse cx=\"308.842\" cy=\"369.25\" fill=\"none\" rx=\"20\" ry=\"20\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"308.842\" x2=\"308.842\" y1=\"389.25\" y2=\"499.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"278.842\" x2=\"338.842\" y1=\"419.25\" y2=\"419.25\"/>\n  </g>";
            }
        },
        SNIPING("01", "Sniping", ActivityEntityType.SHOOTING, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"305.083\" x2=\"305.083\" y1=\"359\" y2=\"509\"/>\n    <text font-family=\"sans-serif\" font-size=\"65\" transform=\"matrix(1 0 0 1 283.4053 339)\">S</text>\n    <polyline fill=\"none\" points=\"280.083,384 305.083,359 330.082,384\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        TRAFFICKING("01", "Trafficking", ActivityEntityType.ILLEGAL_DRUG_OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"76\" transform=\"matrix(1 0 0 1 192.5 426.25)\">DRUG</text>\n    <text font-family=\"sans-serif\" font-size=\"76\" transform=\"matrix(1 0 0 1 239.5 360.0488)\">TFK</text>\n  </g>";
            }
        },
        ILLEGAL_DRUG_LAB("02", "Illegal Drug Lab", ActivityEntityType.ILLEGAL_DRUG_OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1 0 0 1 202.9482 415)\">DRUG</text>\n    <text font-family=\"sans-serif\" font-size=\"55\" transform=\"matrix(1 0 0 1 249.4824 340)\">LAB</text>\n  </g>";
            }
        },
        GRENADE_EXPLOSION("01", "Grenade Explosion", ActivityEntityType.EXPLOSION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"191.4,394.2 230.6,364.6 223.4,319.8 253.8,341.4 262.6,301.4 288.2,348.6 301,287.8 318.6,334.2 347.4,299.8 353,344.6 381.8,320.6 381.8,370.2 416.2,401.4 381.8,430.2 389,462.2 356.2,446.2 351.4,486.2 325.8,440.6 305,505.4 284.2,455.8 265.8,481.4 249.8,433.4 216.2,447.8 226.6,425.4 191.4,394.2\" stroke=\"#000000\" stroke-width=\"8\" transform=\"matrix(0.98,0,0,0.98,6.11034,7.9055)\"/>\n    <text font-family=\"sans-serif\" font-size=\"81\" transform=\"matrix(1 0 0 1 273.498 422)\">G</text>\n  </g>";
            }
        },
        INCENDIARY_EXPLOSION("02", "Incendiary Explosion", ActivityEntityType.EXPLOSION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"191.4,394.2 230.6,364.6 223.4,319.8 253.8,341.4 262.6,301.4 288.2,348.6 301,287.8 318.6,334.2 347.4,299.8 353,344.6 381.8,320.6 381.8,370.2 416.2,401.4 381.8,430.2 389,462.2 356.2,446.2 351.4,486.2 325.8,440.6 305,505.4 284.2,455.8 265.8,481.4 249.8,433.4 216.2,447.8 226.6,425.4 191.4,394.2\" stroke=\"#000000\" stroke-width=\"8\" transform=\"matrix(0.98,0,0,0.98,6.11034,7.9055)\"/>\n    <text font-family=\"sans-serif\" font-size=\"81\" transform=\"matrix(1 0 0 1 293.002 422)\">I</text>\n  </g>";
            }
        },
        MINE_EXPLOSION("03", "Mine Explosion", ActivityEntityType.EXPLOSION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"191.4,394.2 230.6,364.6 223.4,319.8 253.8,341.4 262.6,301.4 288.2,348.6 301,287.8 318.6,334.2 347.4,299.8 353,344.6 381.8,320.6 381.8,370.2 416.2,401.4 381.8,430.2 389,462.2 356.2,446.2 351.4,486.2 325.8,440.6 305,505.4 284.2,455.8 265.8,481.4 249.8,433.4 216.2,447.8 226.6,425.4 191.4,394.2\" stroke=\"#000000\" stroke-width=\"8\" transform=\"matrix(0.98,0,0,0.98,6.11034,7.9055)\"/>\n    <text font-family=\"sans-serif\" font-size=\"81\" transform=\"matrix(1 0 0 1 271.002 422)\">M</text>\n  </g>";
            }
        },
        MORTAR_FIRE_EXPLOSION("04", "Mortar Fire Explosion", ActivityEntityType.EXPLOSION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"191.4,394.2 230.6,364.6 223.4,319.8 253.8,341.4 262.6,301.4 288.2,348.6 301,287.8 318.6,334.2 347.4,299.8 353,344.6 381.8,320.6 381.8,370.2 416.2,401.4 381.8,430.2 389,462.2 356.2,446.2 351.4,486.2 325.8,440.6 305,505.4 284.2,455.8 265.8,481.4 249.8,433.4 216.2,447.8 226.6,425.4 191.4,394.2\" stroke=\"#000000\" stroke-width=\"8\" transform=\"matrix(0.98,0,0,0.98,6.11034,7.9055)\"/>\n    <ellipse cx=\"306\" cy=\"424\" fill=\"none\" rx=\"15\" ry=\"15\" stroke=\"#000000\" stroke-width=\"8\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"306\" x2=\"306\" y1=\"409\" y2=\"354\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"306\" x2=\"286\" y1=\"354\" y2=\"374\"/>\n    <polyline fill=\"none\" points=\"286,374 306,354 326,374\" stroke=\"#000000\" stroke-width=\"8\"/>\n  </g>";
            }
        },
        ROCKET_EXPLOSION("05", "Rocket Explosion", ActivityEntityType.EXPLOSION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"191.4,394.2 230.6,364.6 223.4,319.8 253.8,341.4 262.6,301.4 288.2,348.6 301,287.8 318.6,334.2 347.4,299.8 353,344.6 381.8,320.6 381.8,370.2 416.2,401.4 381.8,430.2 389,462.2 356.2,446.2 351.4,486.2 325.8,440.6 305,505.4 284.2,455.8 265.8,481.4 249.8,433.4 216.2,447.8 226.6,425.4 191.4,394.2\" stroke=\"#000000\" stroke-width=\"8\" transform=\"matrix(0.98,0,0,0.98,6.11034,7.9055)\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"306\" x2=\"306\" y1=\"443\" y2=\"373\"/>\n    <polyline fill=\"none\" points=\"286,373 306,353 326,373\" stroke=\"#000000\" stroke-width=\"8\"/>\n    <polyline fill=\"none\" points=\"286,393 306,373 326,393\" stroke=\"#000000\" stroke-width=\"8\"/>\n  </g>";
            }
        },
        BOMB_EXPLOSION("06", "Bomb Explosion", ActivityEntityType.EXPLOSION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"192.4,394.2 231.6,364.6 224.4,319.8 254.8,341.4 263.6,301.4 289.2,348.6 302,287.8 319.6,334.2 348.4,299.8 354,344.6 382.8,320.6 382.8,370.2 417.2,401.4 382.8,430.2 390,462.2 357.2,446.2 352.4,486.2 326.8,440.6 306,505.4 285.2,455.8 266.8,481.4 250.8,433.4 217.2,447.8 227.6,425.4 192.4,394.2\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"55\" transform=\"matrix(1 0 0 1 221.9824 417)\">BOMB</text>\n  </g>";
            }
        },
        TV_AND_RADIO_PROPAGANDA("01", "TV and Radio Propaganda", ActivityEntityType.PSYCHOLOGICAL_OPERATIONS, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <g>\n      <polyline fill=\"#FFFFFF\" points=\"225,356 225,436 315,436 355,476 355,316 315,356 225,356 225,436\" stroke=\"#000000\" stroke-width=\"10\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"413\" y2=\"413\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"379\" y2=\"379\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"346\" y2=\"346\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"446\" y2=\"446\"/>\n    </g>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"185\" x2=\"305\" y1=\"317\" y2=\"416\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"305\" x2=\"425\" y1=\"376\" y2=\"475\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"305\" x2=\"305\" y1=\"373\" y2=\"419\"/>\n    </g>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <g>\n      <polyline fill=\"#FFFFFF\" points=\"225,356 225,436 315,436 355,476 355,316 315,356 225,356 225,436\" stroke=\"#000000\" stroke-width=\"10\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"413\" y2=\"413\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"379\" y2=\"379\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"346\" y2=\"346\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"446\" y2=\"446\"/>\n    </g>\n    <g>\n      <polyline fill=\"none\" points=\"126.984,279.068 304.083,422.5 304.943,371.5 484.5,511\" stroke=\"#000000\" stroke-miterlimit=\"1\" stroke-width=\"5\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <g>\n      <polyline fill=\"#FFFFFF\" points=\"225,356 225,436 315,436 355,476 355,316 315,356 225,356 225,436\" stroke=\"#000000\" stroke-width=\"10\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"413\" y2=\"413\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"379\" y2=\"379\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"346\" y2=\"346\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"446\" y2=\"446\"/>\n    </g>\n    <g>\n      <polyline fill=\"none\" points=\"174,263 306,415 306,375 438,527\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <g>\n      <polyline fill=\"#FFFFFF\" points=\"225,356 225,436 315,436 355,476 355,316 315,356 225,356 225,436\" stroke=\"#000000\" stroke-width=\"10\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"413\" y2=\"413\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"379\" y2=\"379\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"346\" y2=\"346\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"355\" x2=\"395\" y1=\"446\" y2=\"446\"/>\n    </g>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"201\" x2=\"305\" y1=\"326\" y2=\"416\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"305\" x2=\"409\" y1=\"376\" y2=\"466\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"305\" x2=\"305\" y1=\"373\" y2=\"419\"/>\n    </g>\n  </g>";
                    default -> null;
                };
            }
        },
        WILLING("01", "Willing", ActivityEntityType.RECRUITMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"55\" transform=\"matrix(1 0 0 1 280.0435 337.25)\">W</text>\n    <ellipse cx=\"305.999\" cy=\"371.25\" fill=\"none\" rx=\"20\" ry=\"20\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"305.999\" x2=\"305.999\" y1=\"391.25\" y2=\"501.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"275.999\" x2=\"335.999\" y1=\"421.25\" y2=\"421.25\"/>\n  </g>";
            }
        },
        COERCED_IMPRESSED("02", "Coerced/Impressed", ActivityEntityType.RECRUITMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 280.0015 337.25)\">C</text>\n    <ellipse cx=\"305.999\" cy=\"371.25\" fill=\"none\" rx=\"20\" ry=\"20\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"305.999\" x2=\"305.999\" y1=\"391.25\" y2=\"501.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"275.999\" x2=\"335.999\" y1=\"421.25\" y2=\"421.25\"/>\n  </g>";
            }
        },
        POLLING_PLACE_ELECTION("01", "Polling Place/Election", ActivityEntityType.MEETING, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1 0 0 1 208.707 422)\">VOTE</text>\n  </g>";
            }
        },
        EMERGENCY_FOOD_DISTRIBUTION("02", "Emergency Food Distribution", ActivityEntityType.EMERGENCY_OPERATION, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"7\" x1=\"145\" x2=\"465\" y1=\"445.015\" y2=\"445.015\"/>\n    <g>\n      <path d=\"M305.614,356.875c-3.926,9.448-5.342,20.444-5.836,28.054c-1.051,16.184,0.967,35.492,7.039,49.525 c-5.664-2.129-10.553-5.532-14.482-10.129c-6.459-7.558-10.016-17.819-10.016-28.898c0-11.079,3.557-21.342,10.016-28.898 C295.982,362.26,300.458,359.021,305.614,356.875 M322.474,346.266c-0.556,0-2.045,0.511-0.378,0.511 C322.796,346.394,322.751,346.266,322.474,346.266L322.474,346.266z M322.096,346.777c-62.371,0-62.371,97.299,0,97.299 c-2.151,0-0.297,0.831,0.421,0.831c0.358,0,0.434-0.208-0.421-0.831C301.91,429.332,300.719,358.488,322.096,346.777 L322.096,346.777z\"/>\n    </g>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10.735\" x1=\"125.082\" x2=\"485.082\" y1=\"447.5\" y2=\"447.5\"/>\n    <g>\n      <path d=\"M312.57,357.315c-3.926,9.449-5.342,20.447-5.836,28.057c-1.05,16.183,0.968,35.49,7.038,49.522 c-5.663-2.129-10.552-5.532-14.481-10.129c-6.458-7.557-10.016-17.819-10.016-28.898c0-11.079,3.557-21.342,10.016-28.898 C302.939,362.699,307.416,359.46,312.57,357.315 M329.431,346.706c-0.556,0-2.045,0.511-0.378,0.511 C329.753,346.833,329.708,346.706,329.431,346.706L329.431,346.706z M329.053,347.217c-62.37,0-62.37,97.299,0,97.299 c-2.152,0-0.297,0.831,0.421,0.831c0.358,0,0.433-0.208-0.421-0.831C308.867,429.772,307.676,358.929,329.053,347.217 L329.053,347.217z\"/>\n    </g>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"173\" x2=\"437\" y1=\"448\" y2=\"448\"/>\n    <g>\n      <path d=\"M303.614,358.29c-3.927,9.45-5.342,20.448-5.836,28.059c-1.05,16.181,0.969,35.489,7.039,49.52 c-5.664-2.129-10.553-5.532-14.482-10.129c-6.459-7.557-10.016-17.819-10.016-28.898c0-11.079,3.557-21.342,10.016-28.898 C293.982,363.674,298.458,360.435,303.614,358.29 M320.474,347.68c-0.556,0-2.045,0.511-0.378,0.511 C320.796,347.808,320.751,347.68,320.474,347.68L320.474,347.68z M320.096,348.191c-62.371,0-62.371,97.299,0,97.299 c-2.152,0-0.297,0.831,0.421,0.831c0.358,0,0.433-0.208-0.421-0.831C299.91,430.747,298.719,359.903,320.096,348.191 L320.096,348.191z\"/>\n    </g>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"175\" x2=\"435\" y1=\"443\" y2=\"443\"/>\n    <g>\n      <path d=\"M303.948,352.68c-3.926,9.448-5.342,20.444-5.836,28.054c-1.051,16.185,0.967,35.493,7.038,49.524 c-5.664-2.128-10.553-5.531-14.482-10.128c-6.459-7.557-10.016-17.82-10.016-28.898c0-11.079,3.557-21.342,10.016-28.899 C294.316,358.064,298.792,354.825,303.948,352.68 M320.808,342.07c-0.556,0-2.045,0.511-0.378,0.511 C321.13,342.198,321.085,342.07,320.808,342.07L320.808,342.07z M320.43,342.582c-62.371,0-62.371,97.299,0,97.299 c-2.152,0-0.298,0.831,0.42,0.831c0.358,0,0.433-0.208-0.42-0.831C300.244,425.137,299.053,354.292,320.43,342.582L320.43,342.582 z\"/>\n    </g>\n  </g>";
                    default -> null;
                };
            }
        },
        EMERGENCY_WATER_DISTRIBUTION_CENTER("08", "Emergency Water Distribution Center", ActivityEntityType.EMERGENCY_OPERATION, GraphicType.FULL_FRAME) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
                    case "1" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"155.049\" x2=\"456.951\" y1=\"453\" y2=\"453\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"291\" x2=\"341\" y1=\"338\" y2=\"338\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"316\" x2=\"316\" y1=\"363\" y2=\"338\"/>\n    <path d=\"M216,363h120c40,0,48,45,50,75\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
                    case "3" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"126\" x2=\"486\" y1=\"453\" y2=\"453\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"291\" x2=\"341\" y1=\"338\" y2=\"338\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"316\" x2=\"316\" y1=\"363\" y2=\"338\"/>\n    <path d=\"M216,363h120c40,0,48,45,50,75\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
                    case "4" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"174\" x2=\"438\" y1=\"453\" y2=\"453\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"291\" x2=\"341\" y1=\"338\" y2=\"338\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"316\" x2=\"316\" y1=\"363\" y2=\"338\"/>\n    <path d=\"M216,363h120c40,0,48,45,50,75\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
                    case "6" -> "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"190\" x2=\"422\" y1=\"453\" y2=\"453\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"291\" x2=\"341\" y1=\"338\" y2=\"338\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"316\" x2=\"316\" y1=\"363\" y2=\"338\"/>\n    <path d=\"M216,363h120c40,0,48,45,50,75\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        PHARMACY("05", "Pharmacy", ActivityEntityType.EMERGENCY_MEDICAL_OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M264.8,331.6h32.9c7.6,0,15.5,9.5,15.1,18.2c-0.3,9-7.3,16.6-16.3,16.6h-31.7V331.6z M243,446.3h21.8v-55.9 h5.9c1.4,0,34.1,40.3,34.1,42.9c0,1.5-34.1,41.602-37.6,48.2l26.2-0.2l25.7-30.5l23.9,30.8l27.2-0.1l-38-48.3l36.1-44.5l-25.5-0.3 l-24.2,27l-18.5-25c21.3-5,35.3-17.1,35.3-42.9c0-20.2-17.602-38.2-37.602-38.2H243V446.3z\" id=\"_40678448\"/>\n  </g>";
            }
        },
        BUREAU_ATF("01", "Bureau of Alcohol,Tobacco,Firearms and Explosives (ATF) (Department of Justice)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" transform=\"matrix(1 0 0 1 203 435.25)\">ATF</text>\n  </g>";
            }
        },
        DRUG_ENFORCEMENT_ADMIN_DEA("04", "Drug Enforcement Administration (DEA)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"102\" transform=\"matrix(1 0 0 1 194 435.25)\">DEA</text>\n  </g>";
            }
        },
        FEDERAL_BUREAU_NVESTIGATION_FBI("06", "Federal Bureau of Investigation (FBI)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 207 438.25)\">FBI</text>\n  </g>";
            }
        },
        POLICE("07", "Police", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M264.659,353.621c0,71.906,16.594,77.438,45.909,88.5\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <path d=\"M353.159,353.621c0,71.906-16.594,77.438-45.909,88.5\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <path d=\"M263,353.621c23.785,13.828,23.785,13.828,45.91,0 c22.125,13.828,22.125,13.828,45.909,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        US_SECRET_SERVICE_USSS("09", "United States Secret Service (USSS)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"84\" id=\"USSS\" transform=\"matrix(1 0 0 1 191.5 426.5)\">USSS</text>\n  </g>";
            }
        },
        TRANS_SECURITY_ADMIN_TSA("10", "Transportation Security Administration (TSA)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"106\" transform=\"matrix(1 0 0 1 196 437.25)\">TSA</text>\n  </g>";
            }
        },
        COAST_GUARD("11", "Coast Guard", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"240.001,468.194 199.786,387.765 250.055,387.765 250.055,322.416 360.646,322.416 360.646,387.765 410.914,387.765 370.698,468.194\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon points=\"385.78,387.765 345.566,468.194 320.432,468.194 360.646,387.765\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        INTERNAL_SECURITY_FORCE("13", "Internal Security Force", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 215 438.25)\">ISF</text>\n  </g>";
            }
        },
        UNEXPLODED_ORDNANCE("15", "Unexploded Ordnance", ActivityEntityType.HAZARD_MATERIALS_INCIDENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 195.9028 432)\">UXO</text>\n  </g>";
            }
        },
        VOLCANIC_ERUPTION("06", "Volcanic Eruption", ActivityEntityType.GEOLOGIC, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M216.92,465.12l52.36,1.53v-4.761l-44.54-1.699L255,366.52h98.43l30.09,93.67l-44.369,1.699v4.761 l52.359-1.53c-3.229-15.98-12.75-36.55-17.51-54.061c-3.06-7.989-12.75-50.83-20.57-50.83H255c-7.99,0-17.51,42.84-20.57,50.83 C229.5,428.57,219.98,449.14,216.92,465.12L216.92,465.12z\" id=\"_65373472\"/>\n    <path d=\"M286.62,461.89v4.761c0,7.989,7.99,15.81,15.81,15.81h3.23c7.99,0,15.81-7.99,15.81-15.81v-4.761 c0-7.989-7.989-15.81-15.81-15.81h-3.06C294.61,445.91,286.62,453.9,286.62,461.89z\" id=\"_64119160\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"270.47\" x2=\"250.58\" y1=\"354.45\" y2=\"309.57\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304.13\" x2=\"304.13\" y1=\"354.45\" y2=\"309.57\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"335.75\" x2=\"361.76\" y1=\"354.45\" y2=\"309.57\"/>\n  </g>";
            }
        },
        VOLCANIC_THREAT("07", "Volcanic Threat", ActivityEntityType.GEOLOGIC, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M216.92,465.12l52.36,1.53v-4.761l-44.54-1.699L255,366.52h98.43l30.09,93.67l-44.369,1.699v4.761 l52.359-1.53c-3.229-15.98-12.75-36.55-17.51-54.061c-3.06-7.989-12.75-50.83-20.57-50.83H255c-7.99,0-17.51,42.84-20.57,50.83 C229.5,428.57,219.98,449.14,216.92,465.12L216.92,465.12z\" id=\"_65373472\"/>\n    <path d=\"M286.62,461.89v4.761c0,7.989,7.99,15.81,15.81,15.81h3.23c7.99,0,15.81-7.99,15.81-15.81v-4.761 c0-7.989-7.989-15.81-15.81-15.81h-3.06C294.61,445.91,286.62,453.9,286.62,461.89z\" id=\"_64119160\"/>\n    <text font-family=\"sans-serif\" font-size=\"84\" transform=\"matrix(1 0 0 1 279.7002 351.27)\">?</text>\n  </g>";
            }
        },
        CAVE_ENTRANCE("08", "Cave Entrance", ActivityEntityType.GEOLOGIC, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"192.334\" x2=\"306\" y1=\"396.168\" y2=\"396.168\"/>\n    <polygon fill=\"none\" points=\"306,396.514 384.5,339.333 384.5,452.667\" stroke=\"#020001\" stroke-width=\"5\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ActivityEntityType entityType;
    private final GraphicType graphicType;

    ActivityEntitySubType(String id, String label, ActivityEntityType entityType, GraphicType graphicType) {
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