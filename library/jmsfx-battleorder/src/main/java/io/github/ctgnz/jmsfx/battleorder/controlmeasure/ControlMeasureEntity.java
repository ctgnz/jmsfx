package io.github.ctgnz.jmsfx.battleorder.controlmeasure;

import java.util.List;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.IconBounds;
import io.github.ctgnz.jmsfx.battleorder.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum ControlMeasureEntity implements Entity {
        COMMAND_CONTROL_LINES("11", "Command and Control Lines", GraphicType.NA),
        COMMAND_CONTROL_AREAS("12", "Command and Control Areas", GraphicType.NA),
        COMMAND_CONTROL_POINTS("13", "Command and Control Points", GraphicType.NA),
        MANEUVER_LINES("14", "Maneuver Lines", GraphicType.NA),
        MANEUVER_AREAS("15", "Maneuver Areas", GraphicType.NA),
        MANEUVER_POINTS("16", "Maneuver Points", GraphicType.NA),
        AIRSPACE_CONTROL_CORRIDORS_AREAS("17", "Airspace Control (Corridors) Areas", GraphicType.NA),
        AIRSPACE_CONTROL_POINTS("18", "Airspace Control Points", GraphicType.FREE_CANVAS) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<svg:g font-style=\"normal\" id=\"main\">\n    <svg:g font-style=\"normal\">\n      <svg:line fill=\"none\" font-style=\"normal\" stroke=\"#000000\" stroke-width=\"10\" x1=\"205.5\" x2=\"205.5\" y1=\"221\" y2=\"571\"/>\n      <svg:line fill=\"none\" font-style=\"normal\" stroke=\"#000000\" stroke-width=\"10\" x1=\"405.5\" x2=\"405.5\" y1=\"221\" y2=\"571\"/>\n    </svg:g>\n    <svg:circle cx=\"305.5\" cy=\"396.5\" font-style=\"normal\" r=\"50\" stroke=\"#000000\"/>\n  </svg:g><svg:g display=\"inline\" font-style=\"normal\" id=\"template\">\n    <svg:g display=\"inline\" font-style=\"normal\" transform=\"translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1) translate(0 -1)\">\n      <svg:text dx=\"0.0\" dy=\"0.0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24\" font-style=\"normal\" transform=\"matrix(1 0 0 1 254 396)\" x=\"0\" y=\"0\">CENTER</svg:text>\n      <svg:text dx=\"0.0\" dy=\"0.0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24\" font-style=\"normal\" stroke=\"#000000\" transform=\"matrix(1 0 0 1 254 396)\" x=\"0\" y=\"0\">CENTER</svg:text>\n      <svg:text dx=\"0.0\" dy=\"0.0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24\" font-style=\"normal\" transform=\"matrix(1 0 0 1 265 421)\" x=\"0\" y=\"0\">POINT</svg:text>\n      <svg:text dx=\"0.0\" dy=\"0.0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24\" font-style=\"normal\" stroke=\"#000000\" transform=\"matrix(1 0 0 1 265 421)\" x=\"0\" y=\"0\">POINT</svg:text>\n    </svg:g>\n    <svg:g display=\"inline\" font-style=\"normal\" transform=\"translate(0 1) translate(0 1) translate(0 1) translate(0 1) translate(200 143) scale(1 0.7931) translate(-200 -143) translate(200 143) scale(1 0.93478) translate(-200 -143)\">\n      <svg:line fill=\"none\" font-style=\"normal\" stroke=\"#0000FF\" stroke-width=\"3\" x1=\"305\" x2=\"305\" y1=\"354.256\" y2=\"409.256\"/>\n      <svg:polygon fill=\"#FFFFFF\" font-style=\"normal\" points=\"305,412.256 298,397.256 312,397.256\" stroke=\"#0000FF\"/>\n    </svg:g>\n  </svg:g>";
            }
        },
        AIRSPACE_CONTROL_LINES("19", "Airspace Control Lines", GraphicType.NA),
        MARITIME_CONTROL_AREAS("20", "Maritime Control Areas", GraphicType.NA),
        MARITIME_CONTROL_POINTS("21", "Maritime Control Points", GraphicType.NA),
        MARITIME_CONTROL_LINES("22", "Maritime Control Lines", GraphicType.NA),
        DECEPTION("23", "Deception", GraphicType.NA),
        FIRES_AREAS("24", "Fires Areas", GraphicType.NA),
        FIRES_POINTS("25", "Fires Points", GraphicType.NA),
        FIRE_LINES("26", "Fire Lines", GraphicType.NA),
        PROTECTION_AREAS("27", "Protection Areas", GraphicType.NA),
        PROTECTION_POINTS("28", "Protection Points", GraphicType.NA),
        PROTECTION_LINES("29", "Protection Lines", GraphicType.NA),
        INTELLIGENCE_LINES("30", "Intelligence Lines", GraphicType.NA),
        SUSTAINMENT_AREAS("31", "Sustainment Areas", GraphicType.NA),
        SUSTAINMENT_POINTS("32", "Sustainment Points", GraphicType.NA),
        SUSTAINMENT_LINES("33", "Sustainment Lines", GraphicType.NA),
        MISSION_TASKS("34", "Mission Tasks", GraphicType.NA),
        SPACE_DEBRIS("35", "Space Debris", GraphicType.NA),
        PROTECTION_OF_CULTURAL_PROPERTY("36", "Protection Of Cultural Property", GraphicType.NA),
        INTELLIGENCE_AREAS("37", "Intelligence Areas", GraphicType.NA);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    ControlMeasureEntity(String id, String label, GraphicType graphicType) {
        this.id = id;
        this.label = label;
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
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.CONTROL_MEASURE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return ControlMeasureSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}