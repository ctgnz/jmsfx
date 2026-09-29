package io.github.ctgnz.jmsfx.battleorder.air;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum AirEntityType implements EntityType {
        FIXED_WING("01", "Fixed-Wing", AirEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(0.95,0,0,0.95,15.24293,19.79083)\">\n    <path d=\"m 422.706,395.541 c 0,17.741 -15.521,32.123 -34.665,32.123 -19.145,0 -81.748,-32.123 -81.748,-32.123 0,0 62.604,-32.123 81.748,-32.123 19.144,0 34.665,14.383 34.665,32.123 z\" stroke=\"#000000\"/>\n    <path d=\"m 187.011,395.817 c 0,-18.037 15.781,-32.661 35.246,-32.661 19.465,0 83.118,32.661 83.118,32.661 0,0 -63.653,32.66 -83.118,32.66 -19.465,0 -35.246,-14.623 -35.246,-32.66 z\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        ROTARY_WING("02", "Rotary-Wing", AirEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"402.842,354.387 402.842,437.613 312.57,396\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polygon points=\"208.204,437.613 208.204,354.387 298.476,396\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        UAV("03", "Unmanned Aircraft (UA)/Unmanned Aerial Vehicle (UAV)/Unmanned Aircraft System (UAS)/Remote Piloted Vehicle (RPV)", AirEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"396.803,386.481 300.773,441.795 213.362,385.821 213.362,353.078 300.773,405.494 396.803,351.748\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        VT_UAV("04", "Vertical-Takeoff UAV (VT-UAV)", AirEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"rotary\">\n      <polygon points=\"373.921,381.165 373.921,439.25 310.918,410.207\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <polygon points=\"238.079,439.25 238.079,381.165 301.082,410.207\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <polygon points=\"354.09,370.582 304.788,398.98 259.91,370.243 259.91,353.433 304.788,380.343 354.09,352.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        LIGHTER_THAN_AIR("05", "Lighter Than Air", AirEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"22.355\" width=\"34.215\" x=\"287.423\" y=\"420.936\"/>\n    <ellipse cx=\"304.8\" cy=\"386.287\" rx=\"40.631\" ry=\"38.088\"/>\n  </g>";
            }
        },
        AIRSHIP("06", "Airship", AirEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"380.86,397.771 388.907,438.149 365.533,438.149 355.188,395.999 365.533,353.85 388.907,353.85\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"299.25\" cy=\"396\" rx=\"100.583\" ry=\"34.394\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        TETHERED_LTA("07", "Tethered Lighter Than Air", AirEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"251.801\" cy=\"433.627\" rx=\"10.375\" ry=\"9.724\"/>\n    <rect height=\"22.355\" width=\"34.215\" x=\"287.423\" y=\"420.936\"/>\n    <ellipse cx=\"304.8\" cy=\"386.287\" rx=\"40.631\" ry=\"38.088\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"252.043\" x2=\"266.959\" y1=\"429.827\" y2=\"385.958\"/>\n  </g>";
            }
        },
        CIV_FIXED_WING("01", "Fixed Wing", AirEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" style=\"stroke:none;stroke-opacity:1\" transform=\"matrix(0.95,0,0,0.95,15.24293,19.79083)\">\n    <path d=\"m 422.706,395.541 c 0,17.741 -15.521,32.123 -34.665,32.123 -19.145,0 -81.748,-32.123 -81.748,-32.123 0,0 62.604,-32.123 81.748,-32.123 19.144,0 34.665,14.383 34.665,32.123 z\" stroke=\"#000000\" style=\"fill:#ffffff;stroke:#000000;stroke-width:5;stroke-dasharray:none;stroke-opacity:1;fill-opacity:1\"/>\n    <path d=\"m 187.011,395.817 c 0,-18.037 15.781,-32.661 35.246,-32.661 19.465,0 83.118,32.661 83.118,32.661 0,0 -63.653,32.66 -83.118,32.66 -19.465,0 -35.246,-14.623 -35.246,-32.66 z\" stroke=\"#000000\" style=\"fill:#ffffff;stroke:#000000;stroke-width:5;stroke-dasharray:none;stroke-opacity:1;fill-opacity:1\"/>\n  </g>";
            }
        },
        CIV_ROTARY_WING("02", "Rotary Wing", AirEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"402.842,354.387 402.842,437.613 311,396\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polygon fill=\"#FFFFFF\" points=\"208.204,437.613 208.204,354.387 299.75,396\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        CIV_UAV("03", "Unmanned Aircraft (UA) / Unmanned Aerial Vehicle (UAV) / Unmanned Aircraft System (UAS) / Remote Piloted Vehicle (RPV)", AirEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"396.803,386.481 300.773,441.795 213.362,385.821 213.362,353.078 300.773,405.494 396.803,351.748\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        CIV_LTA("04", "Lighter Than Air", AirEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"#FFFFFF\" height=\"21.063\" stroke=\"#000000\" stroke-width=\"5\" width=\"32.236\" x=\"287.937\" y=\"419.705\"/>\n    <ellipse cx=\"304.309\" cy=\"387.06\" fill=\"#FFFFFF\" rx=\"38.283\" ry=\"35.886\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        CIV_AIRSHIP("05", "Airship", AirEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"380.86,397.771 388.907,438.149 365.533,438.149 355.188,395.999 365.533,353.85 388.907,353.85\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"299.25\" cy=\"396\" fill=\"#FFFFFF\" rx=\"100.583\" ry=\"34.394\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        CIV_TETHERED_LTA("06", "Tethered Lighter than Air", AirEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"252.373\" cy=\"431.664\" fill=\"#FFFFFF\" rx=\"9.775\" ry=\"9.162\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <rect fill=\"#FFFFFF\" height=\"21.063\" stroke=\"#000000\" stroke-width=\"5\" width=\"32.236\" x=\"287.937\" y=\"419.705\"/>\n    <ellipse cx=\"304.309\" cy=\"387.06\" fill=\"#FFFFFF\" rx=\"38.283\" ry=\"35.886\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"254.373\" x2=\"267.223\" y1=\"422.502\" y2=\"396\"/>\n  </g>";
            }
        },
        CIV_MEDEVAC("07", "Medical Evacuation (MEDEVAC)", AirEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M 286.33203 349.66797 L 286.33203 376 L 259.66797 376 L 259.66797 416 L 286.33203 416 L 286.33203 442.33203 L 326.33203 442.33203 L 326.33203 416 L 352.33203 416 L 352.33203 376 L 326.33203 376 L 326.33203 349.66797 L 286.33203 349.66797 z\" style=\"color:#000000;fill:none;stroke:#000000;stroke-opacity:1;stroke-width:5;stroke-dasharray:none\"/>\n  </g>";
            }
        },
        BOMB("01", "Bomb", AirEntity.WEAPON, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 196.9995 425.25)\">BOMB</text>\n  </g>";
            }
        },
        DECOY("02", "Decoy", AirEntity.WEAPON, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"270.646,442.798 223.67,396.18 270.288,349.201\" stroke=\"#000000\" stroke-width=\"2\"/>\n    <polygon points=\"323.278,442.798 276.302,396.18 322.919,349.201\" stroke=\"#000000\" stroke-width=\"2\"/>\n    <polygon points=\"379.245,442.798 332.27,396.18 378.886,349.201\" stroke=\"#000000\" stroke-width=\"2\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final AirEntity entity;
    private final GraphicType graphicType;

    AirEntityType(String id, String label, AirEntity entity, GraphicType graphicType) {
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

    @Override
    public List<EntitySubType> getEntitySubTypes() {
        return AirSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}