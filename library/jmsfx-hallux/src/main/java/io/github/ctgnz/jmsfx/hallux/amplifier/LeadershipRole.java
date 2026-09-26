package io.github.ctgnz.jmsfx.hallux.amplifier;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.hallux.AmplifierListEnum;

public enum LeadershipRole implements StandardAmplifierItem {
        LEADER_INDIVIDUAL("71", "Leader") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(132.28, 183, 345.45, 127.26);
                    case "3" -> new Rectangle2D(170.79, 225.5, 268.41, 82);
                    case "4" -> new Rectangle2D(167.5, 193.63, 274, 60);
                    case "6" -> new Rectangle2D(113.98, 179.87, 382.04, 195.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        DEPUTY_LEADER_INDIVIDUAL("72", "Deputy Leader") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(132.28, 183, 345.45, 127.26);
                    case "3" -> new Rectangle2D(170.79, 225.5, 268.41, 82);
                    case "4" -> new Rectangle2D(167.5, 193.63, 274, 60);
                    case "6" -> new Rectangle2D(113.98, 179.87, 382.04, 195.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        SENIOR_ENLISTED_ADVISOR("73", "Senior Enlisted Advisor") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(132.28, 183, 345.45, 127.26);
                    case "3" -> new Rectangle2D(170.79, 225.5, 268.41, 82);
                    case "4" -> new Rectangle2D(167.5, 193.63, 274, 60);
                    case "6" -> new Rectangle2D(113.98, 179.87, 382.04, 195.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        STAFF_J1("74", "J1 Personnel/Manpower") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(132.28, 183, 345.45, 127.26);
                    case "3" -> new Rectangle2D(170.79, 225.5, 268.41, 82);
                    case "4" -> new Rectangle2D(167.5, 193.63, 274, 60);
                    case "6" -> new Rectangle2D(113.98, 179.87, 382.04, 195.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        STAFF_J2("75", "J2 Intelligence/Security") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(132.28, 183, 345.45, 127.26);
                    case "3" -> new Rectangle2D(170.79, 225.5, 268.41, 82);
                    case "4" -> new Rectangle2D(167.5, 193.63, 274, 60);
                    case "6" -> new Rectangle2D(113.98, 179.87, 382.04, 195.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        STAFF_J3("76", "J3 Operations") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(132.28, 183, 345.45, 127.26);
                    case "3" -> new Rectangle2D(170.79, 225.5, 268.41, 82);
                    case "4" -> new Rectangle2D(167.5, 193.63, 274, 60);
                    case "6" -> new Rectangle2D(113.98, 179.87, 382.04, 195.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        STAFF_J4("77", "J4 Logistics") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(132.28, 183, 345.45, 127.26);
                    case "3" -> new Rectangle2D(170.79, 225.5, 268.41, 82);
                    case "4" -> new Rectangle2D(167.5, 193.63, 274, 60);
                    case "6" -> new Rectangle2D(113.98, 179.87, 382.04, 195.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        STAFF_J5("78", "J5 Plans") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(132.28, 183, 345.45, 127.26);
                    case "3" -> new Rectangle2D(170.79, 225.5, 268.41, 82);
                    case "4" -> new Rectangle2D(167.5, 193.63, 274, 60);
                    case "6" -> new Rectangle2D(113.98, 179.87, 382.04, 195.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        STAFF_J6("79", "J6 Signals/Communications") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(132.28, 183, 345.45, 127.26);
                    case "3" -> new Rectangle2D(170.79, 225.5, 268.41, 82);
                    case "4" -> new Rectangle2D(167.5, 193.63, 274, 60);
                    case "6" -> new Rectangle2D(113.98, 179.87, 382.04, 195.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        STAFF_J7("7A", "J7 Training/Military Education") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(132.28, 183, 345.45, 127.26);
                    case "3" -> new Rectangle2D(170.79, 225.5, 268.41, 82);
                    case "4" -> new Rectangle2D(167.5, 193.63, 274, 60);
                    case "6" -> new Rectangle2D(113.98, 179.87, 382.04, 195.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        STAFF_J8("7B", "J8 Finance/Contracts") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(132.28, 183, 345.45, 127.26);
                    case "3" -> new Rectangle2D(170.79, 225.5, 268.41, 82);
                    case "4" -> new Rectangle2D(167.5, 193.63, 274, 60);
                    case "6" -> new Rectangle2D(113.98, 179.87, 382.04, 195.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        STAFF_J9("7C", "J9 Civil-Military Co-operation") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(132.28, 183, 345.45, 127.26);
                    case "3" -> new Rectangle2D(170.79, 225.5, 268.41, 82);
                    case "4" -> new Rectangle2D(167.5, 193.63, 274, 60);
                    case "6" -> new Rectangle2D(113.98, 179.87, 382.04, 195.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        };

    private final String id;
    private final String label;

    LeadershipRole(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.LEADERSHIP_ROLE;
    }

    @Override
    public String getGraphicLocation() {
        return "Amplifier";
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