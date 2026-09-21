package io.github.ctgnz.jmsfx.standard.amplifier;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.standard.AmplifierListEnum;

public enum UnitEchelon implements StandardAmplifierItem {
        TEAM_CREW("11", "Team/Crew") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(288.79, 167.77, 31.13, 33.91);
                    case "3" -> new Rectangle2D(286.41, 205.5, 37.2, 40.58);
                    case "4" -> new Rectangle2D(288.79, 204.77, 31.13, 33.91);
                    case "6" -> new Rectangle2D(288.79, 167.77, 31.13, 33.91);
                    default -> Rectangle2D.EMPTY;
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
        },
        BDE("18", "Brigade") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(289.52, 168.8, 33.75, 31.78);
                    case "3" -> new Rectangle2D(287.56, 207.83, 37.97, 35.75);
                    case "4" -> new Rectangle2D(289.52, 205.8, 33.75, 31.78);
                    case "6" -> new Rectangle2D(289.52, 168.8, 33.75, 31.78);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        DIV("21", "Division") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(268.11, 168.8, 80.41, 31.78);
                    case "3" -> new Rectangle2D(261.15, 207.83, 90.47, 35.75);
                    case "4" -> new Rectangle2D(268.11, 205.8, 80.41, 31.78);
                    case "6" -> new Rectangle2D(268.11, 168.8, 80.41, 31.78);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        CORPS_MEF("22", "Corps/MEF") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(246.7, 168.8, 127.08, 31.78);
                    case "3" -> new Rectangle2D(234.74, 207.83, 142.96, 35.75);
                    case "4" -> new Rectangle2D(246.7, 205.8, 127.08, 31.78);
                    case "6" -> new Rectangle2D(246.7, 168.8, 127.08, 31.78);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        ARMY("23", "Army") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(231.04, 168.8, 173.74, 31.78);
                    case "3" -> new Rectangle2D(209.09, 207.83, 195.46, 35.75);
                    case "4" -> new Rectangle2D(231.04, 205.8, 173.74, 31.78);
                    case "6" -> new Rectangle2D(231.04, 168.8, 173.74, 31.78);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        ARMY_GROUP_FRONT("24", "Army Group/Front") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(219.23, 168.8, 220.41, 31.78);
                    case "3" -> new Rectangle2D(182.28, 207.83, 247.96, 35.75);
                    case "4" -> new Rectangle2D(213.23, 205.8, 220.41, 31.78);
                    case "6" -> new Rectangle2D(219.23, 168.8, 220.41, 31.78);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        REGION_THEATRE("25", "Region/Theatre") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(206.46, 168.8, 267.07, 31.78);
                    case "3" -> new Rectangle2D(186.5, 207.83, 232.95, 35.75);
                    case "4" -> new Rectangle2D(208.46, 205.8, 267.07, 31.78);
                    case "6" -> new Rectangle2D(206.46, 168.8, 267.07, 31.78);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        COMMAND("26", "Command") {
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