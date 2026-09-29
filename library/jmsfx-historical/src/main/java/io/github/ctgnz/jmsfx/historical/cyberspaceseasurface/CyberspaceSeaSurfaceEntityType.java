package io.github.ctgnz.jmsfx.historical.cyberspaceseasurface;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum CyberspaceSeaSurfaceEntityType implements EntityType {
        COMBAT_MISSION_TEAM("01", "Combat Mission Team", CyberspaceSeaSurfaceEntity.MISSION_FORCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-0.88137,-3.66477)\">\n    <text font-family=\"sans-serif\" font-size=\"102px\" transform=\"translate(193,435.25)\">CMT</text>\n  </g>";
            }
        },
        NATIONAL_MISSION_TEAM("02", "National Mission Team", CyberspaceSeaSurfaceEntity.MISSION_FORCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-4.23342)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(194,431.25)\">NMT</text>\n  </g>";
            }
        },
        CYBER_PROTECTION_TEAM("03", "Cyber Protection Team", CyberspaceSeaSurfaceEntity.MISSION_FORCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(12.31932,-0.39182)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(194,431.25)\">CPT</text>\n  </g>";
            }
        },
        DEFENSIVE_CYBERSPACE_OPERATION("01", "Defensive Cyberspace Operation", CyberspaceSeaSurfaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(1.4,0,0,1.4,-137.54103,-56.6236)\">\n    <path d=\"M 240,345 265.84615,300 290,345 Z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    <path d=\"m 291.11538,345 25.84616,-45 24.15384,45 z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    <path d=\"m 342.23077,345 25.84615,-45 24.15385,45 z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n  </g>";
            }
        },
        OFFENSIVE_CYBERSPACE_OPERATION("02", "Cyberspace Operation", CyberspaceSeaSurfaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(1.42815,0,0,1.61418,-143.6139,-123.54278)\">\n    <path d=\"m 249.91602,315.93555 v 10 h 102.48437 v -10 z\" style=\"color:#000000;fill:#000000;-inkscape-stroke:none\"/>\n    <path d=\"m 342.39027,298.40584 v 45.05942 l 35.93945,-22.5297 c -11.9782,-7.51297 -23.95937,-15.02029 -35.93945,-22.52972 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke-width:1.04137;-inkscape-stroke:none\"/>\n  </g>";
            }
        },
        INTERNET_SERVICE_PROVIDER("03", "Internet Service Provider", CyberspaceSeaSurfaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(13.80371,0.60818)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(203.9658,430.25)\">ISP</text>\n  </g>";
            }
        },
        SECURITY_OPERATIONS_CENTRE("04", "Security Operations Centre", CyberspaceSeaSurfaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-8.73047,0.60818)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(203.9658,430.25)\">SOC</text>\n  </g>";
            }
        },
        ACTIVE_CYBER_OPERATIONS("05", "Active Cyber Operations", CyberspaceSeaSurfaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-5.26367,0.60818)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(203.9658,430.25)\">ACO</text>\n  </g>";
            }
        },
        ADVANCED_PERSISTANT_THREAT("06", "Advanced Persistant Threat", CyberspaceSeaSurfaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 203.9658 430.25)\">APT</text>\n  </g>";
            }
        },
        NATION_STATE("01", "Nation State", CyberspaceSeaSurfaceEntity.THREAT_ACTOR, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(12.85545,-1.39182)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" style=\"display:inline\" transform=\"translate(193,432.25)\">CTA</text>\n  </g>";
            }
        },
        NON_NATION_STATE("02", "Non Nation State", CyberspaceSeaSurfaceEntity.THREAT_ACTOR, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\" transform=\"translate(12.64135,-1.39182)\">\n    <g aria-label=\"CTA\" style=\"font-size:100px;display:inline;fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\" transform=\"translate(193,432.25)\">\n      <path d=\"m 65.91797,-5.27344 q -2.68555,1.17188 -4.88281,2.19727 -2.14844,1.0254 -5.66406,2.14844 Q 52.39258,0 48.87695,0.63477 45.41016,1.31836 41.21094,1.31836 q -7.91016,0 -14.4043,-2.19727 Q 20.36133,-3.125 15.57617,-7.86133 10.88867,-12.5 8.25195,-19.6289 5.61523,-26.80664 5.61523,-36.2793 q 0,-8.98438 2.53906,-16.06445 2.53906,-7.08008 7.32422,-11.9629 4.63867,-4.73633 11.18164,-7.22656 6.5918,-2.49023 14.5996,-2.49023 5.85938,0 11.66992,1.41602 5.85938,1.41602 12.98828,4.98047 v 11.4746 h -0.73242 q -6.00586,-5.0293 -11.91406,-7.32422 -5.9082,-2.29492 -12.64648,-2.29492 -5.51758,0 -9.96094,1.80664 -4.39453,1.75781 -7.86133,5.51758 -3.36914,3.66211 -5.27344,9.27734 -1.85547,5.5664 -1.85547,12.89063 0,7.66602 2.05078,13.1836 2.09961,5.51758 5.3711,8.98438 3.41797,3.61328 7.95898,5.3711 4.58984,1.70898 9.66797,1.70898 6.98242,0 13.08594,-2.39258 6.10352,-2.39258 11.42578,-7.17773 h 0.6836 z\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"M 131.44531,-64.11133 H 105.46875 V 0 H 95.80078 V -64.11133 H 69.82422 v -8.59375 h 61.6211 z\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 192.67578,0 h -10.30273 l -7.12891,-20.26367 H 143.79883 L 136.66992,0 h -9.81445 l 26.46484,-72.70508 h 12.89063 z m -20.41016,-28.56445 -12.74414,-35.69336 -12.79296,35.69336 z\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        CRIMINAL("03", "Unknown", CyberspaceSeaSurfaceEntity.THREAT_ACTOR, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-2.66506,-1.5842)\">\n    <path d=\"m 307.66602,353.43359 c -16.84854,0 -31.14844,11.54997 -31.14844,28.23633 v 51.63867 h -10.6543 v 9.4375 h 10.6543 62.29687 10.6543 v -9.4375 h -10.6543 v -51.63867 c -0.6356,-17.3221 -14.46207,-28.23633 -31.14843,-28.23633 z m -12.24805,23.34766 c 4.96605,4.9e-4 8.9917,4.02614 8.9922,8.9922 5.9e-4,4.9668 -4.02538,8.99365 -8.9922,8.99414 -4.96757,5.9e-4 -8.99473,-4.02657 -8.99414,-8.99414 4.9e-4,-4.9668 4.02733,-8.99278 8.99414,-8.9922 z m 24.4961,0 c 4.9668,-5.9e-4 8.99365,4.02538 8.99414,8.9922 5.9e-4,4.96757 -4.02657,8.99473 -8.99414,8.99414 -4.9668,-5e-4 -8.99277,-4.02734 -8.99218,-8.99414 4.9e-4,-4.96604 4.02614,-8.9917 8.99218,-8.9922 z m -33.74804,35.81295 h 43 v 6.814 h -43 z\" style=\"fill:#000000;fill-opacity:1;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n  </g>";
            }
        },
        INSIDER("04", "Insider", CyberspaceSeaSurfaceEntity.THREAT_ACTOR, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.9\" transform=\"translate(-11.39895,-1.75657)\">\n    <text font-family=\"sans-serif\" font-size=\"110px\" transform=\"translate(214,436.25)\">INS</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final CyberspaceSeaSurfaceEntity entity;
    private final GraphicType graphicType;

    CyberspaceSeaSurfaceEntityType(String id, String label, CyberspaceSeaSurfaceEntity entity, GraphicType graphicType) {
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
    public Entity getEntity() {
        return entity;
    }

}