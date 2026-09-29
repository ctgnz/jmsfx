package io.github.ctgnz.jmsfx.standard.seasubsurface;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum SeaSubsurfaceEntity implements Entity {
        MILITARY("11", "Military", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"115\" transform=\"matrix(1 0 0 1 208.5005 436.3975)\">MIL</text>\n  </g>";
            }
        },
        CIVILIAN("12", "Civilian", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text fill=\"#FFFFFF\" font-family=\"sans-serif\" font-size=\"116.5535\" transform=\"matrix(1 0 0 1 208.0005 439.25)\">CIV</text>\n    <text fill=\"none\" font-family=\"sans-serif\" font-size=\"116.5535\" stroke=\"#000000\" stroke-width=\"5\" transform=\"matrix(1 0 0 1 208.0005 439.25)\">CIV</text>\n  </g>";
            }
        },
        WEAPON("13", "Weapon", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 196 429.6719)\">WPN</text>\n  </g>";
            }
        },
        ECHO_TRACKER_CLASSIFIER_ETC_POSSIBLE_CONTACT_POSCON("14", "Echo Tracker Classifier (ETC) / Possible Contact (POSCON)", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"275\" id=\"_x3F_\" transform=\"matrix(1 0 0 1 231 494.5)\">?</text>\n  </g>";
            }
        },
        FUSED_TRACK("15", "Fused Track", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" id=\"main_2_\" points=\"385.5,314.5 348.25,395.25 385.5,476 224,476 263,393.167 224,314.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"150\" transform=\"matrix(1 0 0 1 260 450.5)\">?</text>\n  </g>";
            }
        },
        MANUAL_TRACK("16", "Manual Track", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" id=\"MAN\" transform=\"matrix(1 0 0 1 192 433.25)\">MAN</text>\n  </g>";
            }
        },
        SEABED_INSTALLATION_MIL("20", "Seabed Installation, Human-Made, Military", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"m 256.9669,347.9773 v 96.0681 h 96.0681 v -32.0227 h -32.0227 V 380 h -32.0227 v -32.0227 z\" style=\"fill-rule:evenodd;stroke-width:5.33712;stroke-linecap:round\"/>\n  </g>";
            }
        },
        SEABED_INSTALLATION_NON_MIL("21", "Seabed Installation, Human-Made, Non-Military", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"m 256.9669,347.9773 v 96.0681 h 96.0681 v -32.0227 h -32.0227 V 380 h -32.0227 v -32.0227 z\" style=\"fill-rule:evenodd;stroke-width:5;stroke-linecap:round;stroke:#000000;stroke-opacity:1;stroke-dasharray:none;fill:none\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    SeaSubsurfaceEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.SEA_SUBSURFACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return SeaSubsurfaceSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}