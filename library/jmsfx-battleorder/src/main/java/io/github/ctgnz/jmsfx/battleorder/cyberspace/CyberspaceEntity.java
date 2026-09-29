package io.github.ctgnz.jmsfx.battleorder.cyberspace;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum CyberspaceEntity implements Entity {
        MISSION_FORCE("11", "Mission Force", GraphicType.NA),
        CYBERSPACE_UNIT("12", "Cyberspace Unit", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0.2539,0.60818)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(203.9658,430.25)\">CYB</text>\n  </g>";
            }
        },
        THREAT_ACTOR("13", "Threat Actor", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.87\" transform=\"translate(15.29002,-2.1213143)\">\n    <text font-family=\"sans-serif\" font-size=\"120px\" transform=\"translate(216,440.25)\">TA</text>\n  </g>";
            }
        },
        AGENT("14", "Agent", GraphicType.NA),
        APPLICATION("15", "Application", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(1.12847e-5)\">\n    <rect height=\"90\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:4;stroke-dasharray:none;stroke-opacity:1\" width=\"90\" x=\"260.00095\" y=\"351.106\"/>\n    <rect height=\"30\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:4;stroke-dasharray:none;stroke-opacity:1\" width=\"90\" x=\"260.00095\" y=\"381.106\"/>\n    <rect height=\"30\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:4;stroke-dasharray:none;stroke-opacity:1\" transform=\"rotate(90)\" width=\"90\" x=\"351.106\" y=\"-320.00095\"/>\n  </g>";
            }
        },
        THREAT("16", "Threat", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M 305,382.514 245,350 m 60,90 v -57.486 m 0,0 L 365,350 m -120,0 60,90 60,-90 z\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        DATA("17", "Data", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.93\" transform=\"translate(-0.1217)\">\n    <path d=\"m 269.55623,373.03407 -0.0308,70.9835 h 71.19531 v -95.98633 l -46.22066,0.0309 z\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:4\"/>\n    <path d=\"M 295.676,346.34543 V 374.155 h -28.14692\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:4\"/>\n  </g>";
            }
        },
        PATHS("20", "Paths", GraphicType.NA),
        TERRAIN("21", "Terrain", GraphicType.NA);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    CyberspaceEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.CYBERSPACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return CyberspaceSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}