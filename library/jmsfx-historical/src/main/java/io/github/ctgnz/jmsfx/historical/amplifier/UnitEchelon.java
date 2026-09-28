package io.github.ctgnz.jmsfx.historical.amplifier;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.historical.AmplifierListEnum;

public enum UnitEchelon implements StandardAmplifierItem {
        TEAM_CREW("11", "Team/Crew") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(288.38, 166.57, 33.4, 36.4);
                    case "3" -> new Rectangle2D(286.41, 205.5, 37.2, 40.58);
                    case "4" -> new Rectangle2D(288.38, 203.57, 33.4, 36.4);
                    case "6" -> new Rectangle2D(288.38, 166.57, 33.4, 36.4);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g aria-label=\"Ø\" id=\"echelon\">\n    <ellipse cx=\"305.083\" cy=\"185.39786\" rx=\"15.19877\" ry=\"16.07767\" style=\"fill:none;stroke:#000000;stroke-width:3;stroke-miterlimit:4;stroke-dasharray:none\"/>\n    <path d=\"m 291.09983,201.11599 27.03426,-33.09366\" style=\"fill:none;stroke:#000000;stroke-width:3;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-miterlimit:4;stroke-dasharray:none\"/>\n  </g>";
                    case "3" -> "<g id=\"echelon\">\n    <ellipse cx=\"305.00925\" cy=\"226.49936\" rx=\"17.09862\" ry=\"18.08738\" style=\"fill:none;stroke:#000000;stroke-width:3;stroke-miterlimit:4;stroke-dasharray:none\"/>\n    <path d=\"m 289.27818,244.18225 30.41354,-37.23037\" style=\"fill:none;stroke:#000000;stroke-width:3;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-miterlimit:4;stroke-dasharray:none\"/>\n  </g>";
                    case "4" -> "<g aria-label=\"Ø\" id=\"echelon\">\n    <ellipse cx=\"305.083\" cy=\"222.39786\" rx=\"15.19877\" ry=\"16.07767\" style=\"fill:none;stroke:#000000;stroke-width:3;stroke-miterlimit:4;stroke-dasharray:none\"/>\n    <path d=\"m 291.09983,238.11599 27.03426,-33.09366\" style=\"fill:none;stroke:#000000;stroke-width:3;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-miterlimit:4;stroke-dasharray:none\"/>\n  </g>";
                    case "6" -> "<g aria-label=\"Ø\" id=\"echelon\">\n    <ellipse cx=\"305.083\" cy=\"185.39786\" rx=\"15.19877\" ry=\"16.07767\" style=\"fill:none;stroke:#000000;stroke-width:3;stroke-miterlimit:4;stroke-dasharray:none\"/>\n    <path d=\"m 291.09983,201.11599 27.03426,-33.09366\" style=\"fill:none;stroke:#000000;stroke-width:3;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-miterlimit:4;stroke-dasharray:none\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        SQUAD("12", "Squad") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(287.08, 170, 36, 36);
                    case "3" -> new Rectangle2D(287.08, 213, 36, 36);
                    case "4" -> new Rectangle2D(287.08, 207, 36, 36);
                    case "6" -> new Rectangle2D(287.08, 170, 36, 36);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"echelon\">\n    <circle cx=\"305.083\" cy=\"188\" r=\"18.001\"/>\n  </g>";
                    case "3" -> "<g id=\"echelon\">\n    <circle cx=\"305.083\" cy=\"231\" r=\"18.001\"/>\n  </g>";
                    case "4" -> "<g id=\"echelon\">\n    <circle cx=\"305.083\" cy=\"225\" r=\"18.001\"/>\n  </g>";
                    case "6" -> "<g id=\"echelon\">\n    <circle cx=\"305.083\" cy=\"188\" r=\"18.001\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        SEC("13", "Section") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(265.03, 170, 80.11, 36);
                    case "3" -> new Rectangle2D(265.03, 213, 80.11, 36);
                    case "4" -> new Rectangle2D(265.03, 207, 80.11, 36);
                    case "6" -> new Rectangle2D(265.03, 170, 80.11, 36);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"echelon\">\n    <circle cx=\"283.028\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"327.137\" cy=\"188\" r=\"18.001\"/>\n  </g>";
                    case "3" -> "<g id=\"echelon\">\n    <circle cx=\"283.028\" cy=\"231\" r=\"18\"/>\n    <circle cx=\"327.137\" cy=\"231\" r=\"18.001\"/>\n  </g>";
                    case "4" -> "<g id=\"echelon\">\n    <circle cx=\"283.028\" cy=\"225\" r=\"18\"/>\n    <circle cx=\"327.137\" cy=\"225\" r=\"18.001\"/>\n  </g>";
                    case "6" -> "<g id=\"echelon\">\n    <circle cx=\"283.028\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"327.137\" cy=\"188\" r=\"18.001\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        PLT_DETACHMENT("14", "Platoon/Detachment") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(245, 170, 123.11, 36);
                    case "3" -> new Rectangle2D(245, 213, 123.11, 36);
                    case "4" -> new Rectangle2D(245, 207, 123.11, 36);
                    case "6" -> new Rectangle2D(245, 170, 123.11, 36);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"echelon\">\n    <circle cx=\"263\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"306\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"350.109\" cy=\"188\" r=\"18.001\"/>\n  </g>";
                    case "3" -> "<g id=\"echelon\">\n    <circle cx=\"263\" cy=\"231\" r=\"18\"/>\n    <circle cx=\"306\" cy=\"231\" r=\"18\"/>\n    <circle cx=\"350.109\" cy=\"231\" r=\"18.001\"/>\n  </g>";
                    case "4" -> "<g id=\"echelon\">\n    <circle cx=\"263\" cy=\"225\" r=\"18\"/>\n    <circle cx=\"306\" cy=\"225\" r=\"18\"/>\n    <circle cx=\"350.109\" cy=\"225\" r=\"18.001\"/>\n  </g>";
                    case "6" -> "<g id=\"echelon\">\n    <circle cx=\"263\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"306\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"350.109\" cy=\"188\" r=\"18.001\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        STAFFEL("1A", "Staffel") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(222.95, 170, 166.11, 36);
                    case "3" -> new Rectangle2D(222.95, 213.73, 166.11, 36);
                    case "4" -> new Rectangle2D(222.03, 207, 166.11, 36);
                    case "6" -> new Rectangle2D(222.03, 170, 166.11, 36);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"echelon\" transform=\"translate(-42.083)\">\n    <circle cx=\"283.02802\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"326.39767\" cy=\"188\" r=\"18.001\"/>\n    <circle cx=\"369.76733\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"413.137\" cy=\"188\" r=\"18.001\"/>\n  </g>";
                    case "3" -> "<g id=\"echelon\" transform=\"translate(-42.083,43.7344)\">\n    <circle cx=\"283.02802\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"326.39767\" cy=\"188\" r=\"18.001\"/>\n    <circle cx=\"369.76733\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"413.137\" cy=\"188\" r=\"18.001\"/>\n  </g>";
                    case "4" -> "<g id=\"echelon\" transform=\"translate(-43,37)\">\n    <circle cx=\"283.02802\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"326.39767\" cy=\"188\" r=\"18.001\"/>\n    <circle cx=\"369.76733\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"413.137\" cy=\"188\" r=\"18.001\"/>\n  </g>";
                    case "6" -> "<g id=\"echelon\" transform=\"translate(-43)\">\n    <circle cx=\"283.02802\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"326.39767\" cy=\"188\" r=\"18.001\"/>\n    <circle cx=\"369.76733\" cy=\"188\" r=\"18\"/>\n    <circle cx=\"413.137\" cy=\"188\" r=\"18.001\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        CPY_BTY_TRP("15", "Company/Battery/Troop") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(301.03, 163.5, 10, 49);
                    case "3" -> new Rectangle2D(301.03, 201.5, 10, 49);
                    case "4" -> new Rectangle2D(301.03, 200.5, 10, 49);
                    case "6" -> new Rectangle2D(301.03, 163.5, 10, 49);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306.028\" x2=\"306.028\" y1=\"163.5\" y2=\"212.5\"/>\n  </g>";
                    case "3" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306.028\" x2=\"306.028\" y1=\"201.5\" y2=\"250.5\"/>\n  </g>";
                    case "4" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306.028\" x2=\"306.028\" y1=\"200.5\" y2=\"249.5\"/>\n  </g>";
                    case "6" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306.028\" x2=\"306.028\" y1=\"163.5\" y2=\"212.5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        BN_SQUADRON("16", "Battalion/Squadron") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(278.03, 163.5, 54.11, 49);
                    case "3" -> new Rectangle2D(278.03, 201.5, 54.11, 49);
                    case "4" -> new Rectangle2D(278.03, 200.5, 54.11, 49);
                    case "6" -> new Rectangle2D(278.03, 163.5, 54.11, 49);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"283.028\" x2=\"283.028\" y1=\"163.5\" y2=\"212.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"327.137\" x2=\"327.137\" y1=\"163.5\" y2=\"212.5\"/>\n  </g>";
                    case "3" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"283.028\" x2=\"283.028\" y1=\"201.5\" y2=\"250.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"327.137\" x2=\"327.137\" y1=\"201.5\" y2=\"250.5\"/>\n  </g>";
                    case "4" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"283.028\" x2=\"283.028\" y1=\"200.5\" y2=\"249.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"327.137\" x2=\"327.137\" y1=\"200.5\" y2=\"249.5\"/>\n  </g>";
                    case "6" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"283.028\" x2=\"283.028\" y1=\"163.5\" y2=\"212.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"327.137\" x2=\"327.137\" y1=\"163.5\" y2=\"212.5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        REGT_GRP("17", "Regiment/Group") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(278.03, 163.5, 54.11, 49);
                    case "3" -> new Rectangle2D(278.03, 201.5, 54.11, 49);
                    case "4" -> new Rectangle2D(278.03, 200.5, 54.11, 49);
                    case "6" -> new Rectangle2D(278.03, 163.5, 54.11, 49);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"283.028\" x2=\"283.028\" y1=\"163.5\" y2=\"212.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"327.137\" x2=\"327.137\" y1=\"163.5\" y2=\"212.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306.028\" x2=\"306.028\" y1=\"163.5\" y2=\"212.5\"/>\n  </g>";
                    case "3" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"283.028\" x2=\"283.028\" y1=\"201.5\" y2=\"250.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"327.137\" x2=\"327.137\" y1=\"201.5\" y2=\"250.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306.028\" x2=\"306.028\" y1=\"201.5\" y2=\"250.5\"/>\n  </g>";
                    case "4" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"283.028\" x2=\"283.028\" y1=\"200.5\" y2=\"249.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"327.137\" x2=\"327.137\" y1=\"200.5\" y2=\"249.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306.028\" x2=\"306.028\" y1=\"200.5\" y2=\"249.5\"/>\n  </g>";
                    case "6" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"283.028\" x2=\"283.028\" y1=\"163.5\" y2=\"212.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"327.137\" x2=\"327.137\" y1=\"163.5\" y2=\"212.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306.028\" x2=\"306.028\" y1=\"163.5\" y2=\"212.5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        BDE("18", "Brigade") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(283.53, 163.5, 43.1, 49);
                    case "3" -> new Rectangle2D(283.53, 201.5, 43.1, 49);
                    case "4" -> new Rectangle2D(283.53, 200.5, 43.1, 49);
                    case "6" -> new Rectangle2D(283.53, 163.5, 43.1, 49);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g aria-label=\"X\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 281.22155 212.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "3" -> "<g aria-label=\"X\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 281.22155 250.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "4" -> "<g aria-label=\"X\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 281.22155 249.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "6" -> "<g aria-label=\"X\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 281.22155 212.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    default -> null;
                };
            }
        },
        DIV("21", "Division") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(259.69, 163.5, 90.79, 49);
                    case "3" -> new Rectangle2D(259.69, 201.5, 90.79, 49);
                    case "4" -> new Rectangle2D(259.69, 200.5, 90.79, 49);
                    case "6" -> new Rectangle2D(259.69, 163.5, 90.79, 49);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g aria-label=\"XX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 257.3771 212.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "3" -> "<g aria-label=\"XX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 257.3771 250.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "4" -> "<g aria-label=\"XX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 257.3771 249.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "6" -> "<g aria-label=\"XX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 257.3771 212.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    default -> null;
                };
            }
        },
        CORPS_MEF("22", "Corps/MEF") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(235.84, 163.5, 138.48, 49);
                    case "3" -> new Rectangle2D(235.84, 201.5, 138.48, 49);
                    case "4" -> new Rectangle2D(235.84, 200.5, 138.48, 49);
                    case "6" -> new Rectangle2D(235.84, 163.5, 138.48, 49);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g aria-label=\"XXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 233.53265 212.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "3" -> "<g aria-label=\"XXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 233.53265 250.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "4" -> "<g aria-label=\"XXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 233.53265 249.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "6" -> "<g aria-label=\"XXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 233.53265 212.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    default -> null;
                };
            }
        },
        ARMY("23", "Army") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(212, 163.5, 186.17, 49);
                    case "3" -> new Rectangle2D(212, 201.5, 186.17, 49);
                    case "4" -> new Rectangle2D(212, 200.5, 186.17, 49);
                    case "6" -> new Rectangle2D(212, 163.5, 186.17, 49);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g aria-label=\"XXXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 209.6882 212.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.0703,25.875 L 194.90626,0 H 186.85547 L 172.58204,-21.55078 157.95704,0 H 150.36329 L 168.60938,-26.15625 150.78516,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "3" -> "<g aria-label=\"XXXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 209.6882 250.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.0703,25.875 L 194.90626,0 H 186.85547 L 172.58204,-21.55078 157.95704,0 H 150.36329 L 168.60938,-26.15625 150.78516,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "4" -> "<g aria-label=\"XXXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 209.6882 249.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.0703,25.875 L 194.90626,0 H 186.85547 L 172.58204,-21.55078 157.95704,0 H 150.36329 L 168.60938,-26.15625 150.78516,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "6" -> "<g aria-label=\"XXXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 209.6882 212.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.0703,25.875 L 194.90626,0 H 186.85547 L 172.58204,-21.55078 157.95704,0 H 150.36329 L 168.60938,-26.15625 150.78516,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    default -> null;
                };
            }
        },
        ARMY_GROUP_FRONT("24", "Army Group/Front") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(188.16, 163.5, 233.86, 49);
                    case "3" -> new Rectangle2D(188.16, 201.5, 233.86, 49);
                    case "4" -> new Rectangle2D(188.16, 200.5, 233.86, 49);
                    case "6" -> new Rectangle2D(188.16, 163.5, 233.86, 49);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g aria-label=\"XXXXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 185.84375 212.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.0703,25.875 L 194.90626,0 H 186.85547 L 172.58204,-21.55078 157.95704,0 H 150.36329 L 168.60938,-26.15625 150.78516,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 244.26563,-52.34766 -18.0703,25.875 L 244.23048,0 H 236.17969 L 221.90626,-21.55078 207.28126,0 H 199.68751 L 217.9336,-26.15625 200.10938,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "3" -> "<g aria-label=\"XXXXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 185.84375 250.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.0703,25.875 L 194.90626,0 H 186.85547 L 172.58204,-21.55078 157.95704,0 H 150.36329 L 168.60938,-26.15625 150.78516,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 244.26563,-52.34766 -18.0703,25.875 L 244.23048,0 H 236.17969 L 221.90626,-21.55078 207.28126,0 H 199.68751 L 217.9336,-26.15625 200.10938,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "4" -> "<g aria-label=\"XXXXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 185.84375 249.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.0703,25.875 L 194.90626,0 H 186.85547 L 172.58204,-21.55078 157.95704,0 H 150.36329 L 168.60938,-26.15625 150.78516,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 244.26563,-52.34766 -18.0703,25.875 L 244.23048,0 H 236.17969 L 221.90626,-21.55078 207.28126,0 H 199.68751 L 217.9336,-26.15625 200.10938,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "6" -> "<g aria-label=\"XXXXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 185.84375 212.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.0703,25.875 L 194.90626,0 H 186.85547 L 172.58204,-21.55078 157.95704,0 H 150.36329 L 168.60938,-26.15625 150.78516,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 244.26563,-52.34766 -18.0703,25.875 L 244.23048,0 H 236.17969 L 221.90626,-21.55078 207.28126,0 H 199.68751 L 217.9336,-26.15625 200.10938,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    default -> null;
                };
            }
        },
        REGION_THEATRE("25", "Region/Theatre") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(164.31, 163.5, 281.55, 49);
                    case "3" -> new Rectangle2D(164.31, 201.5, 281.55, 49);
                    case "4" -> new Rectangle2D(164.31, 200.5, 281.55, 49);
                    case "6" -> new Rectangle2D(164.31, 163.5, 281.55, 49);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g aria-label=\"XXXXXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 161.9993 212.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.0703,25.875 L 194.90626,0 H 186.85547 L 172.58204,-21.55078 157.95704,0 H 150.36329 L 168.60938,-26.15625 150.78516,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 244.26563,-52.34766 -18.0703,25.875 L 244.23048,0 H 236.17969 L 221.90626,-21.55078 207.28126,0 H 199.68751 L 217.9336,-26.15625 200.10938,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 293.58985,-52.34766 -18.0703,25.875 L 293.5547,0 H 285.50391 L 271.23048,-21.55078 256.60548,0 H 249.01173 L 267.25782,-26.15625 249.4336,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "3" -> "<g aria-label=\"XXXXXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 161.9993 250.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.0703,25.875 L 194.90626,0 H 186.85547 L 172.58204,-21.55078 157.95704,0 H 150.36329 L 168.60938,-26.15625 150.78516,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 244.26563,-52.34766 -18.0703,25.875 L 244.23048,0 H 236.17969 L 221.90626,-21.55078 207.28126,0 H 199.68751 L 217.9336,-26.15625 200.10938,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 293.58985,-52.34766 -18.0703,25.875 L 293.5547,0 H 285.50391 L 271.23048,-21.55078 256.60548,0 H 249.01173 L 267.25782,-26.15625 249.4336,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "4" -> "<g aria-label=\"XXXXXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 161.9993 249.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.0703,25.875 L 194.90626,0 H 186.85547 L 172.58204,-21.55078 157.95704,0 H 150.36329 L 168.60938,-26.15625 150.78516,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 244.26563,-52.34766 -18.0703,25.875 L 244.23048,0 H 236.17969 L 221.90626,-21.55078 207.28126,0 H 199.68751 L 217.9336,-26.15625 200.10938,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 293.58985,-52.34766 -18.0703,25.875 L 293.5547,0 H 285.50391 L 271.23048,-21.55078 256.60548,0 H 249.01173 L 267.25782,-26.15625 249.4336,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    case "6" -> "<g aria-label=\"XXXXXX\" id=\"echelon\">\n    <g style=\"font-size:72px\" transform=\"matrix(0.96685 0 0 0.93605 161.9993 212.5)\">\n      <path d=\"m 46.96875,-52.34766 -18.0703,25.875 L 46.9336,0 H 38.8828 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.0703,25.875 L 96.25782,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 H 51.71485 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58204,0 H 137.53125 L 123.25782,-21.55078 108.63282,0 H 101.03907 L 119.28516,-26.15625 101.46094,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.0703,25.875 L 194.90626,0 H 186.85547 L 172.58204,-21.55078 157.95704,0 H 150.36329 L 168.60938,-26.15625 150.78516,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 244.26563,-52.34766 -18.0703,25.875 L 244.23048,0 H 236.17969 L 221.90626,-21.55078 207.28126,0 H 199.68751 L 217.9336,-26.15625 200.10938,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 293.58985,-52.34766 -18.0703,25.875 L 293.5547,0 H 285.50391 L 271.23048,-21.55078 256.60548,0 H 249.01173 L 267.25782,-26.15625 249.4336,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
                    default -> null;
                };
            }
        },
        COMMAND("26", "Command") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(250.56, 163.5, 109.04, 49);
                    case "3" -> new Rectangle2D(250.56, 201.5, 109.04, 49);
                    case "4" -> new Rectangle2D(250.56, 200.5, 109.04, 49);
                    case "6" -> new Rectangle2D(250.56, 163.5, 109.04, 49);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"275.0644\" x2=\"275.0644\" y1=\"163.5\" y2=\"212.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"250.5644\" x2=\"299.5644\" y1=\"188\" y2=\"188\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"310.6016\" x2=\"359.6016\" y1=\"188\" y2=\"188\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"335.1016\" x2=\"335.1016\" y1=\"163.5\" y2=\"212.5\"/>\n  </g>";
                    case "3" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"275.0644\" x2=\"275.0644\" y1=\"201.5\" y2=\"250.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"250.5644\" x2=\"299.5644\" y1=\"226\" y2=\"226\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"310.6016\" x2=\"359.6016\" y1=\"226\" y2=\"226\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"335.1016\" x2=\"335.1016\" y1=\"201.5\" y2=\"250.5\"/>\n  </g>";
                    case "4" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"275.0644\" x2=\"275.0644\" y1=\"200.5\" y2=\"249.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"250.5644\" x2=\"299.5644\" y1=\"225\" y2=\"225\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"310.6016\" x2=\"359.6016\" y1=\"225\" y2=\"225\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"335.1016\" x2=\"335.1016\" y1=\"200.5\" y2=\"249.5\"/>\n  </g>";
                    case "6" -> "<g id=\"echelon\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"275.0644\" x2=\"275.0644\" y1=\"163.5\" y2=\"212.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"250.5644\" x2=\"299.5644\" y1=\"188\" y2=\"188\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"310.6016\" x2=\"359.6016\" y1=\"188\" y2=\"188\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4\" x1=\"335.1016\" x2=\"335.1016\" y1=\"163.5\" y2=\"212.5\"/>\n  </g>";
                    default -> null;
                };
            }
        };

    private final String id;
    private final String label;

    UnitEchelon(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.UNIT_ECHELON;
    }

    @Override
    public String getGraphicLocation() {
        return "Echelon";
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

    /** A frame amplifier recolours the frame rather than drawing, and a list with no graphic location has no drawings to reach. */
    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}