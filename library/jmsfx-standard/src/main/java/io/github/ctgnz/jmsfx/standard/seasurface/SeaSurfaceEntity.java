package io.github.ctgnz.jmsfx.standard.seasurface;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum SeaSurfaceEntity implements Entity {
        MILITARY("11", "Military", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#000000\" points=\"237.851,477.014 195.912,393.136 248.334,393.136 248.334,324.986 363.666,324.986 363.666,393.136 416.088,393.136 374.15,477.014\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MILITARY_COMBAT("12", "Military Combatant", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M344.675,444.267c-2.22,0-3.491-0.075-3.805-0.236c-4.121-0.786-7.134-3.006-9.036-6.658 c-1.585-3.168-2.219-6.417-1.902-9.746c-5.71-3.96-13.953-11.334-24.723-22.111c-9.832,9.354-18.157,16.88-24.971,22.592 c1.424,10.778-3.646,16.161-15.218,16.161c-8.567,0-13.481-3.646-14.746-10.935c21.556-11.572,37.566-23.537,48.029-35.908 c-8.723-12.048-13.075-23.538-13.075-34.477c0-1.109,0.317-5.469,0.948-13.081c1.265,0,2.295,0.638,3.098,1.902 c3.005,13.006,8.236,25.054,15.693,36.146c7.604-10.142,13.544-23.541,17.827-40.182c1.741,5.393,2.619,10.146,2.619,14.26 c0,13.157-4.521,24.815-13.554,34.954c9.824,12.526,25.832,24.66,48.028,36.388C358.305,440.624,353.234,444.267,344.675,444.267z\"/>\n    <path d=\"M273.102,429.769l-0.717-1.901l-13.554,7.604c1.585,1.909,3.805,2.856,6.658,2.856 c0.792,0,2.342-0.709,4.637-2.141c2.295-1.427,3.451-2.773,3.451-4.046C273.58,431.832,273.419,431.04,273.102,429.769z\" fill=\"#FFFFFF\"/>\n    <path d=\"M337.541,428.104c-0.631,1.109-0.947,1.98-0.947,2.611c0,1.435,0.908,3.06,2.729,4.879 c1.818,1.825,3.605,2.733,5.354,2.733c2.851,0,5.069-0.947,6.657-2.856L337.541,428.104z\" fill=\"#FFFFFF\"/>\n  </g>";
            }
        },
        MILITARY_NON_COMBAT("13", "Military Noncombatant", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"250.7,445.155 250.7,389.855 275.278,389.855 275.278,346.846 336.723,346.846 336.723,389.855 361.301,389.855 361.301,445.155\" stroke=\"#000000\" stroke-width=\"0.6144\"/>\n  </g>";
            }
        },
        CIVILIAN("14", "Civilian", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text fill=\"none\" font-family=\"sans-serif\" font-size=\"116.5535\" stroke=\"#000000\" stroke-width=\"5\" transform=\"matrix(1 0 0 1 208.0005 439.25)\">CIV</text>\n  </g>";
            }
        },
        OWN_SHIP("15", "Own Ship", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"306\" cy=\"395\" fill=\"none\" r=\"105\" stroke=\"#80E0FF\" stroke-width=\"10\"/>\n    <line fill=\"none\" stroke=\"#80E0FF\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"500\" y2=\"290\"/>\n    <line fill=\"none\" stroke=\"#80E0FF\" stroke-width=\"10\" x1=\"201\" x2=\"411\" y1=\"395\" y2=\"395\"/>\n  </g>";
            }
        },
        FUSED_TRACK("16", "Fused Track", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" id=\"main\" points=\"348.25,395.25 385.5,476 224,476 263,393.167 224,314.5 385.5,314.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"150\" transform=\"matrix(1 0 0 1 263 450.5)\">?</text>\n  </g>";
            }
        },
        MANUAL_TRACK("17", "Manual Track", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" id=\"MAN\" transform=\"matrix(1 0 0 1 192 433.25)\">MAN</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    SeaSurfaceEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.SEA_SURFACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return SeaSurfaceSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}