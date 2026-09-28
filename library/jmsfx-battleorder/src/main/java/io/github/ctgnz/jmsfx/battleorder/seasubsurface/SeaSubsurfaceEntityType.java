package io.github.ctgnz.jmsfx.battleorder.seasubsurface;

import java.util.List;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.battleorder.IconBounds;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum SeaSubsurfaceEntityType implements EntityType {
        SUBMARINE("01", "Submarine", SeaSubsurfaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"196,396 246,346 366,346 416,396 366,446 246,446\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        OTHER_SUBMERSIBLE("02", "Other Submersible", SeaSubsurfaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M340.245,375.935v-27.742h-68.49v27.742c-24.823,5.905-41.855,18.02-41.855,32.017 c0,19.804,34.071,35.855,76.101,35.855c42.028,0,76.1-16.053,76.1-35.855C382.1,393.955,365.067,381.84,340.245,375.935z\" stroke=\"#000000\" stroke-width=\"0.6744\"/>\n  </g>";
            }
        },
        NONSUBMARINE("03", "Nonsubmarine", SeaSubsurfaceEntity.MILITARY, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"92\" transform=\"matrix(1 0 0 1 209 465.5)\">SUB</text>\n    <text font-family=\"sans-serif\" font-size=\"92\" transform=\"matrix(1 0 0 1 202.5 396.8564)\">NON</text>\n  </g>";
            }
        },
        AUV_UUV("04", "Autonomous Underwater Vehicle (AUV)/Unmanned Underwater Vehicle (UUV)", SeaSubsurfaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"204.456,345.558 305.398,404.889 406.344,345.558 406.344,385.111 305.398,444.441 204.456,385.111\"/>\n  </g>";
            }
        },
        DIVER("05", "Diver", SeaSubsurfaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"306.148\" cy=\"385.65\" r=\"35.221\" stroke=\"#000000\" stroke-width=\"9.0495\"/>\n    <circle cx=\"305.907\" cy=\"385.869\" fill=\"none\" r=\"13.376\" stroke=\"#FFFFFF\" stroke-width=\"6\"/>\n    <rect height=\"25.039\" stroke=\"#000000\" stroke-width=\"9.0495\" width=\"16.193\" x=\"254.439\" y=\"373.131\"/>\n    <rect height=\"25.039\" stroke=\"#000000\" stroke-width=\"9.0495\" width=\"16.193\" x=\"341.368\" y=\"372.49\"/>\n    <polygon points=\"349.488,441.572 330.933,420.394 288.847,421.109 265.575,441.572\" stroke=\"#000000\" stroke-width=\"9.0495\"/>\n  </g>";
            }
        },
        SUBMERSIBLE_CIV("01", "Submersible", SeaSubsurfaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M338.092,377.196v-25.997H273.91v25.997 c-23.262,5.534-39.223,16.887-39.223,30.003c0,18.559,31.928,33.602,71.314,33.602c39.385,0,71.313-15.043,71.313-33.602 C377.314,394.083,361.354,382.731,338.092,377.196z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        AUV_UUV_CIV("02", "Autonomous Underwater Vehicle (AUV)/ Underwater Vehicle (UUV)", SeaSubsurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" points=\"308.738,407.382 220.141,354.223 220.141,389.662 308.738,442.82 397.336,389.662 397.336,354.223\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        DIVER_CIV("03", "Diver", SeaSubsurfaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"307.907\" cy=\"385.869\" fill=\"none\" r=\"13.376\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"308.148\" cy=\"385.65\" fill=\"none\" r=\"35.221\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <rect fill=\"none\" height=\"25.039\" stroke=\"#000000\" stroke-width=\"5\" width=\"16.193\" x=\"256.439\" y=\"373.131\"/>\n    <rect fill=\"none\" height=\"25.039\" stroke=\"#000000\" stroke-width=\"5\" width=\"16.191\" x=\"343.368\" y=\"372.49\"/>\n    <polygon fill=\"none\" points=\"329.042,421.537 287.222,421.537 272.927,442 343.369,442\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        TORPEDO("01", "Torpedo", SeaSubsurfaceEntity.WEAPON, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"185.122,395.824 204.232,370.342 376.234,370.342 414.457,421.306 414.457,370.342 376.234,421.306 204.232,421.306\" stroke=\"#000000\" stroke-width=\"1.2741\"/>\n  </g>";
            }
        },
        IMPROVISED_EXPLOSIVE_DEVICE_IED("02", "Improvised Explosive Device (IED)", SeaSubsurfaceEntity.WEAPON, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 199 441.6719)\">IED</text>\n  </g>";
            }
        },
        DECOY("03", "Decoy", SeaSubsurfaceEntity.WEAPON, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"334.965,396 367.931,358.914 367.931,433.087\" stroke=\"#000000\" stroke-width=\"8.2415\"/>\n    <polygon points=\"285.519,396 318.483,358.914 318.483,433.087\" stroke=\"#000000\" stroke-width=\"8.2415\"/>\n    <polygon points=\"236.069,396 269.034,358.914 269.034,433.087\" stroke=\"#000000\" stroke-width=\"8.2415\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final SeaSubsurfaceEntity entity;
    private final GraphicType graphicType;

    SeaSubsurfaceEntityType(String id, String label, SeaSubsurfaceEntity entity, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
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
    public Entity getEntity() {
        return entity;
    }

    @Override
    public List<EntitySubType> getEntitySubTypes() {
        return SeaSubsurfaceSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}