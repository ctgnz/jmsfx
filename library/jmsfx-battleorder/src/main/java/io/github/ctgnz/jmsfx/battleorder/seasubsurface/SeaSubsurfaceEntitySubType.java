package io.github.ctgnz.jmsfx.battleorder.seasubsurface;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.battleorder.IconBounds;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum SeaSubsurfaceEntitySubType implements EntitySubType {
        SUBMARINE_SURFACED("01", "Submarine-Surfaced", SeaSubsurfaceEntityType.SUBMARINE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"252.505,442.895 267.789,425.525 283.073,442.895 298.358,425.525 313.643,442.895 328.926,425.525 344.211,442.895 359.494,425.525\" stroke=\"#000000\" stroke-width=\"5.5579\"/>\n    <polygon points=\"229.579,383.842 264.315,349.105 347.684,349.105 382.422,383.842 347.684,418.578 264.315,418.578\" stroke=\"#000000\" stroke-width=\"0.6947\"/>\n  </g>";
            }
        },
        SUBMARINE_SNORKELING("02", "Submarine-Snorkeling", SeaSubsurfaceEntityType.SUBMARINE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"236.943,414.583 267.915,383.611 342.249,383.611 373.222,414.583 342.249,445.556 267.915,445.556\" stroke=\"#000000\" stroke-width=\"0.6194\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"12.389\" x1=\"305.082\" x2=\"305.082\" y1=\"405.291\" y2=\"346.444\"/>\n    <polyline fill=\"none\" points=\"257.384,373.708 271.013,358.222 284.641,373.708 298.269,358.222 311.896,373.708 325.523,358.222 339.152,373.708 352.78,358.222\" stroke=\"#000000\" stroke-width=\"4.9556\"/>\n  </g>";
            }
        },
        SUBMARINE_BOTTOMED("03", "Submarine-Bottomed", SeaSubsurfaceEntityType.SUBMARINE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"18.293\" stroke=\"#000000\" stroke-width=\"2.1952\" width=\"109.758\" x=\"250.204\" y=\"427.465\"/>\n    <polygon points=\"224.593,382.829 261.18,346.243 348.986,346.243 385.572,382.829 348.986,419.416 261.18,419.416\" stroke=\"#000000\" stroke-width=\"0.7317\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final SeaSubsurfaceEntityType entityType;
    private final GraphicType graphicType;

    SeaSubsurfaceEntitySubType(String id, String label, SeaSubsurfaceEntityType entityType, GraphicType graphicType) {
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
    public Rectangle2D getIconBounds() {
        return IconBounds.lookup(getGraphicIdentifier(), getGraphicType());
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
    public EntityType getEntityType() {
        return entityType;
    }

}