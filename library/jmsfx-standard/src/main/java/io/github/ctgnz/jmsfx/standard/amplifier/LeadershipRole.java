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

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.775\" x2=\"134.776\" y1=\"185.764\" y2=\"307.764\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"303.224\" x2=\"475.224\" y1=\"185.5\" y2=\"307.5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.433\" x2=\"173.294\" y1=\"228.333\" y2=\"305\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304.433\" x2=\"436.706\" y1=\"228\" y2=\"305\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.903\" x2=\"170\" y1=\"196.25\" y2=\"251.132\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"303.097\" x2=\"439\" y1=\"196.132\" y2=\"251.013\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.48\" x2=\"116.48\" y1=\"182.374\" y2=\"372.374\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"303.52\" x2=\"493.52\" y1=\"182.626\" y2=\"372.626\"/>\n    </g>\n  </g>";
                    default -> null;
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

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" style=\"stroke-width:5;stroke-miterlimit:4;stroke-dasharray:40,20;stroke-dashoffset:0\" x1=\"306.775\" x2=\"134.776\" y1=\"185.764\" y2=\"307.764\"/>\n    <line fill=\"none\" stroke=\"#000000\" style=\"stroke-width:5;stroke-miterlimit:4;stroke-dasharray:40,20;stroke-dashoffset:0\" x1=\"303.224\" x2=\"475.224\" y1=\"185.5\" y2=\"307.5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" style=\"stroke-width:5;stroke-miterlimit:4;stroke-dasharray:40,20;stroke-dashoffset:0\" x1=\"306.433\" x2=\"173.294\" y1=\"228.333\" y2=\"305\"/>\n    <line fill=\"none\" stroke=\"#000000\" style=\"stroke-width:5;stroke-miterlimit:4;stroke-dasharray:40,20;stroke-dashoffset:0\" x1=\"304.433\" x2=\"436.706\" y1=\"228\" y2=\"305\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" style=\"stroke-width:5;stroke-miterlimit:4;stroke-dasharray:40,20;stroke-dashoffset:0\" x1=\"305.903\" x2=\"170\" y1=\"196.25\" y2=\"251.132\"/>\n    <line fill=\"none\" stroke=\"#000000\" style=\"stroke-width:5;stroke-miterlimit:4;stroke-dasharray:40,20;stroke-dashoffset:0\" x1=\"303.097\" x2=\"439\" y1=\"196.132\" y2=\"251.013\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" style=\"stroke-width:5;stroke-miterlimit:4;stroke-dasharray:40,20;stroke-dashoffset:0\" x1=\"306.48\" x2=\"116.48\" y1=\"182.374\" y2=\"372.374\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" style=\"stroke-width:5;stroke-miterlimit:4;stroke-dasharray:40,20;stroke-dashoffset:0\" x1=\"303.52\" x2=\"493.52\" y1=\"182.626\" y2=\"372.626\"/>\n    </g>\n  </g>";
                    default -> null;
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

    /** A frame amplifier recolours the frame rather than drawing, and a list with no graphic location has no drawings to reach. */
    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}