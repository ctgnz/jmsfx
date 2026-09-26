package io.github.ctgnz.jmsfx.standard.amplifier;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.standard.AmplifierListEnum;

public enum TowedArrayType implements StandardAmplifierItem {
        SHORT_TOWED_ARRAY("61", "Short towed array") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(119.77, 586.13, 372.46, 40);
                    case "3" -> new Rectangle2D(120.72, 588.66, 372.46, 40);
                    case "4" -> new Rectangle2D(119.77, 545.5, 372.46, 40);
                    case "6" -> new Rectangle2D(118.77, 585, 372.46, 40);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        LONG_TOWED_ARRAY("62", "Long towed array") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(119.77, 586.63, 372.46, 41);
                    case "3" -> new Rectangle2D(120.72, 588.66, 372.46, 41);
                    case "4" -> new Rectangle2D(119.77, 545, 372.46, 41);
                    case "6" -> new Rectangle2D(118.77, 585, 372.46, 41);
                    default -> Rectangle2D.EMPTY;
                };
            }
        };

    private final String id;
    private final String label;

    TowedArrayType(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.TOWED_ARRAYS;
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