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

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"122.229\" x2=\"479.729\" y1=\"607.125\" y2=\"607.125\"/>\n    <rect height=\"25\" width=\"25\" x=\"119.771\" y=\"593.625\"/>\n    <rect height=\"25\" width=\"25\" x=\"467.229\" y=\"594.625\"/>\n    <rect height=\"25\" width=\"25\" x=\"293.5\" y=\"594.625\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"586.125\" y2=\"626.125\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"123.178\" x2=\"480.678\" y1=\"609.156\" y2=\"609.156\"/>\n    <rect height=\"25\" width=\"25\" x=\"120.72\" y=\"595.656\"/>\n    <rect height=\"25\" width=\"25\" x=\"468.178\" y=\"596.656\"/>\n    <rect height=\"25\" width=\"25\" x=\"294.449\" y=\"596.656\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"306.949\" x2=\"306.949\" y1=\"588.656\" y2=\"628.656\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"122.229\" x2=\"479.729\" y1=\"565.5\" y2=\"565.5\"/>\n    <rect height=\"25\" width=\"25\" x=\"119.771\" y=\"552\"/>\n    <rect height=\"25\" width=\"25\" x=\"467.229\" y=\"553\"/>\n    <rect height=\"25\" width=\"25\" x=\"293.5\" y=\"553\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"545.5\" y2=\"585.5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"121.229\" x2=\"478.729\" y1=\"605.5\" y2=\"605.5\"/>\n    <rect height=\"25\" width=\"25\" x=\"118.771\" y=\"592\"/>\n    <rect height=\"25\" width=\"25\" x=\"466.229\" y=\"593\"/>\n    <rect height=\"25\" width=\"25\" x=\"292.5\" y=\"593\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"305.001\" x2=\"305.001\" y1=\"585\" y2=\"625\"/>\n  </g>";
                    default -> null;
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

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"122.229\" x2=\"479.729\" y1=\"607.125\" y2=\"607.125\"/>\n    <rect height=\"25\" width=\"25\" x=\"119.771\" y=\"593.625\"/>\n    <rect height=\"25\" width=\"25\" x=\"467.229\" y=\"594.625\"/>\n    <rect height=\"25\" width=\"25\" x=\"293.5\" y=\"594.625\"/>\n    <rect height=\"25\" width=\"25\" x=\"206.635\" y=\"594.625\"/>\n    <rect height=\"25\" width=\"25\" x=\"380.365\" y=\"594.625\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"392.865\" x2=\"392.865\" y1=\"586.625\" y2=\"626.625\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"219.135\" x2=\"219.135\" y1=\"587.625\" y2=\"627.625\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"123.178\" x2=\"480.678\" y1=\"609.156\" y2=\"609.156\"/>\n    <rect height=\"25\" width=\"25\" x=\"120.72\" y=\"595.656\"/>\n    <rect height=\"25\" width=\"25\" x=\"468.178\" y=\"596.656\"/>\n    <rect height=\"25\" width=\"25\" x=\"294.449\" y=\"596.656\"/>\n    <rect height=\"25\" width=\"25\" x=\"207.584\" y=\"596.656\"/>\n    <rect height=\"25\" width=\"25\" x=\"381.314\" y=\"596.656\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"393.814\" x2=\"393.814\" y1=\"588.656\" y2=\"628.656\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"220.084\" x2=\"220.084\" y1=\"589.656\" y2=\"629.656\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"122.229\" x2=\"479.729\" y1=\"565.5\" y2=\"565.5\"/>\n    <rect height=\"25\" width=\"25\" x=\"119.771\" y=\"552\"/>\n    <rect height=\"25\" width=\"25\" x=\"467.229\" y=\"553\"/>\n    <rect height=\"25\" width=\"25\" x=\"293.5\" y=\"553\"/>\n    <rect height=\"25\" width=\"25\" x=\"206.635\" y=\"553\"/>\n    <rect height=\"25\" width=\"25\" x=\"380.365\" y=\"553\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"392.865\" x2=\"392.865\" y1=\"545\" y2=\"585\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"219.135\" x2=\"219.135\" y1=\"546\" y2=\"586\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"121.229\" x2=\"478.729\" y1=\"605.5\" y2=\"605.5\"/>\n    <rect height=\"25\" width=\"25\" x=\"118.771\" y=\"592\"/>\n    <rect height=\"25\" width=\"25\" x=\"466.229\" y=\"593\"/>\n    <rect height=\"25\" width=\"25\" x=\"292.5\" y=\"593\"/>\n    <rect height=\"25\" width=\"25\" x=\"205.636\" y=\"593\"/>\n    <rect height=\"25\" width=\"25\" x=\"379.365\" y=\"593\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"391.865\" x2=\"391.865\" y1=\"585\" y2=\"625\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"218.136\" x2=\"218.136\" y1=\"586\" y2=\"626\"/>\n  </g>";
                    default -> null;
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

    /** A frame amplifier recolours the frame rather than drawing, and a list with no graphic location has no drawings to reach. */
    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}