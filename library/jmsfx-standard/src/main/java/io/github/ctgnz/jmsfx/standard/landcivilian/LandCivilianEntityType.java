package io.github.ctgnz.jmsfx.standard.landcivilian;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum LandCivilianEntityType implements EntityType {
        ENVIRONMENTAL_PROTECTION("01", "Environmental Protection", LandCivilianEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" points=\"318.585,383.777 337.834,408.167 318.834,408.5 342.842,432.148 315.5,431.834 315.5,440.5 297.167,440.5 297.5,432.5 269.833,432.5 293.167,408.834 275.5,408.834 294.5,383.833 284.25,383.75 306,353.75 328.875,383.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        GOVERNMENT_ORGANIZATION("02", "Government Organization", LandCivilianEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.98\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 202 442.25)\">GO</text>\n  </g>";
            }
        },
        INDIVIDUAL("03", "Individual", LandCivilianEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"371.421\" fill=\"none\" rx=\"22.853\" ry=\"21.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"392.985\" y2=\"445.015\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"281.625\" x2=\"330.375\" y1=\"403\" y2=\"403\"/>\n  </g>";
            }
        },
        GROUP("04", "Group", LandCivilianEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"group_1_\">\n      <ellipse cx=\"248.22\" cy=\"372.407\" fill=\"none\" rx=\"22.853\" ry=\"21.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"248.22\" x2=\"248.22\" y1=\"393.971\" y2=\"446\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"223.845\" x2=\"272.595\" y1=\"403.986\" y2=\"403.986\"/>\n    </g>\n    <g id=\"group_2_\">\n      <ellipse cx=\"306\" cy=\"371.843\" fill=\"none\" rx=\"22.853\" ry=\"21.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"393.407\" y2=\"445.438\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"281.625\" x2=\"330.375\" y1=\"403.422\" y2=\"403.422\"/>\n    </g>\n    <g id=\"group\">\n      <ellipse cx=\"363.78\" cy=\"371.125\" fill=\"none\" rx=\"22.853\" ry=\"21.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"363.78\" x2=\"363.78\" y1=\"392.689\" y2=\"444.719\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"339.405\" x2=\"388.155\" y1=\"402.703\" y2=\"402.703\"/>\n    </g>\n  </g>";
            }
        },
        KILLING_VICTIM("05", "Individual Victim Killed by Criminal Activity", LandCivilianEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"371.421\" fill=\"none\" rx=\"22.853\" ry=\"21.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"392.985\" y2=\"445.015\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"281.625\" x2=\"330.375\" y1=\"403\" y2=\"403\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"203.966\" x2=\"406.199\" y1=\"346.985\" y2=\"445.295\"/>\n  </g>";
            }
        },
        KILLING_VICTIMS("06", "Group of Victims Killed by Criminal Activity", LandCivilianEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"group_2_\">\n      <ellipse cx=\"306\" cy=\"371.843\" fill=\"none\" rx=\"22.853\" ry=\"21.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"393.407\" y2=\"445.438\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"281.625\" x2=\"330.375\" y1=\"403.422\" y2=\"403.422\"/>\n    </g>\n    <g id=\"group_1_\">\n      <ellipse cx=\"248.22\" cy=\"370.407\" fill=\"none\" rx=\"22.853\" ry=\"21.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"248.22\" x2=\"248.22\" y1=\"391.971\" y2=\"444\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"223.845\" x2=\"272.595\" y1=\"401.986\" y2=\"401.986\"/>\n    </g>\n    <g id=\"group\">\n      <ellipse cx=\"363.78\" cy=\"371.125\" fill=\"none\" rx=\"22.853\" ry=\"21.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"363.78\" x2=\"363.78\" y1=\"392.689\" y2=\"444.719\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"339.405\" x2=\"388.155\" y1=\"402.703\" y2=\"402.703\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"203.966\" x2=\"406.199\" y1=\"346.985\" y2=\"445.295\"/>\n  </g>";
            }
        },
        VICTIM_ATTEMPTED_CRIME("07", "Victim of an Attempted Crime", LandCivilianEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-dasharray=\"12\" stroke-width=\"5\" x1=\"203.966\" x2=\"406.199\" y1=\"346.985\" y2=\"445.295\"/>\n    <ellipse cx=\"306\" cy=\"371.421\" fill=\"none\" rx=\"22.853\" ry=\"21.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"392.985\" y2=\"445.015\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"281.625\" x2=\"330.375\" y1=\"403\" y2=\"403\"/>\n  </g>";
            }
        },
        SPY("08", "Spy", LandCivilianEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" transform=\"matrix(1 0 0 1 188 435.25)\">SPY</text>\n  </g>";
            }
        },
        COMPOSITE_LOSS("09", "Composite Loss", LandCivilianEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"377.491\" cy=\"396\" fill=\"none\" rx=\"28.708\" ry=\"30.424\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"349.298\" x2=\"212.5\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"330.039\" x2=\"330.039\" y1=\"349.125\" y2=\"442.875\"/>\n  </g>";
            }
        },
        EMERGENCY_MEDICAL_OPERATION("10", "Emergency Medical Operation", LandCivilianEntity.CIVILIAN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(76.8932,74.97087)\">\n    <polygon points=\"144.8,339.8 167.5,379.4 206.1,357.2 206.2,401.4 251.8,401.4 251.8,357.4 290.4,379.5 313.5,340.2 275.3,317.4 313.7,295 290.5,255.4 251.9,277.6 251.8,232.9 206.2,232.9 206.2,277.4 167.6,255.4 144.9,295 183,317.3\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final LandCivilianEntity entity;
    private final GraphicType graphicType;

    LandCivilianEntityType(String id, String label, LandCivilianEntity entity, GraphicType graphicType) {
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