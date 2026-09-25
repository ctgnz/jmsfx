package io.github.ctgnz.jmsfx.hallux.amplifier;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.hallux.AmplifierListEnum;

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
                    case "1" -> new Rectangle2D(283.53, 163.5, 43.1, 49);
                    case "3" -> new Rectangle2D(283.53, 201.5, 43.1, 49);
                    case "4" -> new Rectangle2D(283.53, 200.5, 43.1, 49);
                    case "6" -> new Rectangle2D(283.53, 163.5, 43.1, 49);
                    default -> Rectangle2D.EMPTY;
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