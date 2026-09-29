package io.github.ctgnz.jmsfx.historical.minewarfare;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum MineWarfareEntity implements Entity {
        SEA_MINE_GENERAL("11", "Sea Mine-General", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FF0000\" points=\"283.227,341.015 283.227,300.5 329.529,300.5 329.529,341.015\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"240.128,378.181 211.489,349.523 244.242,316.793 272.881,345.452\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"339.114,345.4 367.701,316.691 400.512,349.364 371.923,378.073\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306.378\" cy=\"410.47\" fill=\"#FF0000\" r=\"81.03\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        UNEXPLODED_ORDNANCE("12", "Unexploded Ordnance", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" points=\"266.313,300.75 345.688,300.75 401.25,356.313 401.25,435.688 345.688,491.25 266.313,491.25 210.75,435.688 210.75,356.313\" stroke=\"#FF0000\" stroke-dasharray=\"38.9659,15.875\" stroke-width=\"14.4318\"/>\n    <text fill=\"#FF0000\" font-family=\"sans-serif\" font-size=\"75.0455\" transform=\"matrix(1 0 0 1 224.4009 426.0186)\">UXO</text>\n  </g>";
            }
        },
        SEA_MINE_DECOY("13", "Sea Mine Decoy", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#008000\" points=\"284.819,332.864 284.819,295.185 327.882,295.185 327.882,332.864\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"244.739,367.429 218.104,340.776 248.564,310.338 275.199,336.99\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"336.796,336.942 363.384,310.243 393.896,340.629 367.309,367.327\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <path d=\"M230.992,397.457c0-43.062,32.298-75.358,75.358-75.358 c43.063,0,75.359,32.297,75.359,75.358H230.992z\" fill=\"#008000\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"381.71,472.815 344.03,445.902 381.71,418.989\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"327.882,472.815 290.202,445.902 327.882,418.989\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"274.055,472.815 236.375,445.902 274.055,418.989\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        MINE_LIKE_CONTACT_MILCO("14", "Mine-Like Contact (MILCO)", GraphicType.NA),
        MINE_LIKE_ECHO_MILEC_GENERAL("15", "Mine-Like Echo (MILEC)-General", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFF00\" points=\"266.79,301.895 345.211,301.895 400.105,356.79 400.105,435.211 345.211,490.105 266.79,490.105 211.895,435.211 211.895,356.79\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"180\" transform=\"matrix(1 0 0 1 244.625 459.6348)\">E</text>\n  </g>";
            }
        },
        NEGATIVE_REACQUISITION_GENERAL("16", "Negative Reacquisition-General", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFF00\" points=\"266.042,302.5 343.958,302.5 398.5,357.042 398.5,434.958 343.958,489.5 266.042,489.5 211.5,434.958 211.5,357.042\" stroke=\"#000000\" stroke-dasharray=\"38.25,15.5833\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"102\" transform=\"matrix(1 0 0 1 231.0547 435.3838)\">NR</text>\n  </g>";
            }
        },
        OBSTRUCTOR("17", "Obstructor", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFF00\" points=\"266.79,301.895 345.211,301.895 400.105,356.79 400.105,435.211 345.211,490.105 266.79,490.105 211.895,435.211 211.895,356.79\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 217.625 437.6348)\">OB</text>\n  </g>";
            }
        },
        GENERAL_MINE_ANCHOR("18", "General Mine Anchor", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#008000\" points=\"266.79,301.895 345.211,301.895 400.105,356.79 400.105,435.211 345.211,490.105 266.79,490.105 211.895,435.211 211.895,356.79\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 219 414.6348)\">ANCR</text>\n  </g>";
            }
        },
        NON_MINE_MINE_LIKE_NMLO_GENERAL("19", "Non-Mine Mine-Like Object (NMLO)-General", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#008000\" points=\"266.79,301.895 345.211,301.895 400.105,356.79 400.105,435.211 345.211,490.105 266.79,490.105 211.895,435.211 211.895,356.79\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"180\" transform=\"matrix(1 0 0 1 244.625 459.6348)\">N</text>\n  </g>";
            }
        },
        ENVIRONMENTAL_REPORT_LOCATION("20", "Environmental Report Location", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"none\" height=\"159\" stroke=\"#00FF00\" stroke-width=\"10\" width=\"159\" x=\"225.5\" y=\"316\"/>\n    <text fill=\"#00FF00\" font-family=\"sans-serif\" font-size=\"150\" transform=\"matrix(1 0 0 1 251.4756 445)\">E</text>\n  </g>";
            }
        },
        DIVE_REPORT_LOCATION("21", "Dive Report Location", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"none\" height=\"159\" stroke=\"#00FF00\" stroke-width=\"10\" width=\"159\" x=\"225.5\" y=\"316\"/>\n    <text fill=\"#00FF00\" font-family=\"sans-serif\" font-size=\"150\" transform=\"matrix(1 0 0 1 251.4756 445)\">D</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    MineWarfareEntity(String id, String label, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
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
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.MINE_WARFARE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return MineWarfareSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}