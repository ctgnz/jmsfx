package io.github.ctgnz.jmsfx.standard.amplifier;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.standard.AmplifierListEnum;

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