package io.github.ctgnz.jmsfx.icon.controlmeasure;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum ControlMeasureEntity implements IEntity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA),
    COMMAND_CONTROL_LINES("11", "Command and Control Lines", GraphicType.NA),
    COMMAND_CONTROL_AREAS("12", "Command and Control Areas", GraphicType.NA),
    COMMAND_CONTROL_POINTS("13", "Command and Control Points", GraphicType.NA),
    MANEUVER_LINES("14", "Maneuver Lines", GraphicType.NA),
    MANEUVER_AREAS("15", "Maneuver Areas", GraphicType.NA),
    MANEUVER_POINTS("16", "Maneuver Points", GraphicType.NA),
    AIRSPACE_CONTROL_CORRIDORS_AREAS("17", "Airspace Control (Corridors) Areas", GraphicType.NA),
    AIRSPACE_CONTROL_POINTS("18", "Airspace Control Points", GraphicType.MAIN),
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
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public ISymbolSet getSymbolSet() {
        return SymbolSet.CONTROL_MEASURE;
    }

    @Override
    public List<IEntityType> getEntityTypes() {
        return ControlMeasureSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}