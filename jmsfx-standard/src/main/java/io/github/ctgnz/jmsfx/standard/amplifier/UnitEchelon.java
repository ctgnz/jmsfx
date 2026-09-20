package io.github.ctgnz.jmsfx.standard.amplifier;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.standard.AmplifierListEnum;

public enum UnitEchelon implements StandardAmplifierItem {
        TEAM_CREW("1", "Team/Crew") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(287.08, 157.81, 34.66, 53.16);
                    case "3" -> new Rectangle2D(286.41, 205.5, 37.2, 40.58);
                    case "4" -> new Rectangle2D(287.08, 194.81, 34.66, 53.16);
                    case "6" -> new Rectangle2D(287.08, 157.81, 34.66, 53.16);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        SQUAD("2", "Squad") {
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
        },
        SEC("3", "Section") {
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
        },
        PLT_DETACHMENT("4", "Platoon/Detachment") {
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
        },
        STAFFEL("5", "Staffel") {
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
        },
        CPY_BTY_TRP("6", "Company/Battery/Troop") {
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
        },
        BN_SQUADRON("7", "Battalion/Squadron") {
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
        },
        REGT_GRP("8", "Regiment/Group") {
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
        },
        BDE("9", "Brigade") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(289.17, 157.81, 34.66, 53.16);
                    case "3" -> new Rectangle2D(287.17, 195.47, 39, 59.8);
                    case "4" -> new Rectangle2D(289.17, 194.81, 34.66, 53.16);
                    case "6" -> new Rectangle2D(289.17, 157.81, 34.66, 53.16);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        DIV("A", "Division") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(267.76, 157.81, 81.33, 53.16);
                    case "3" -> new Rectangle2D(260.76, 195.47, 91.49, 59.8);
                    case "4" -> new Rectangle2D(267.76, 194.81, 81.33, 53.16);
                    case "6" -> new Rectangle2D(267.76, 157.81, 81.33, 53.16);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        CORPS_MEF("B", "Corps/MEF") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(246.34, 157.81, 127.99, 53.16);
                    case "3" -> new Rectangle2D(234.34, 195.47, 143.99, 59.8);
                    case "4" -> new Rectangle2D(246.34, 194.81, 127.99, 53.16);
                    case "6" -> new Rectangle2D(246.34, 157.81, 127.99, 53.16);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        ARMY("C", "Army") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(230.69, 157.81, 174.66, 53.16);
                    case "3" -> new Rectangle2D(208.69, 195.47, 196.49, 59.8);
                    case "4" -> new Rectangle2D(230.69, 194.81, 174.66, 53.16);
                    case "6" -> new Rectangle2D(230.69, 157.81, 174.66, 53.16);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        ARMY_GROUP_FRONT("D", "Army Group/Front") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(218.88, 157.81, 221.32, 53.16);
                    case "3" -> new Rectangle2D(181.88, 195.47, 248.99, 59.8);
                    case "4" -> new Rectangle2D(212.88, 194.81, 221.32, 53.16);
                    case "6" -> new Rectangle2D(218.88, 157.81, 221.32, 53.16);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        REGION_THEATRE("E", "Region/Theatre") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(206.11, 157.81, 267.98, 53.16);
                    case "3" -> new Rectangle2D(186.11, 195.47, 233.98, 59.8);
                    case "4" -> new Rectangle2D(208.11, 194.81, 267.98, 53.16);
                    case "6" -> new Rectangle2D(206.11, 157.81, 267.98, 53.16);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        COMMAND("F", "Command") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(265.03, 170, 80.11, 36);
                    case "3" -> new Rectangle2D(265.95, 218, 80.11, 36);
                    case "4" -> new Rectangle2D(270.18, 203.69, 80.11, 36);
                    case "6" -> new Rectangle2D(264.94, 170, 80.11, 36);
                    default -> Rectangle2D.EMPTY;
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

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}