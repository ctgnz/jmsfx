package io.github.ctgnz.jmsfx.standard.landcivilian;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum LandCivilianEntityType implements EntityType {
    ENVIRONMENTAL_PROTECTION("01", "Environmental Protection", LandCivilianEntity.CIVILIAN, GraphicType.MAIN),
    GOVERNMENT_ORGANIZATION("02", "Government Organization", LandCivilianEntity.CIVILIAN, GraphicType.MAIN),
    INDIVIDUAL("03", "Individual", LandCivilianEntity.CIVILIAN, GraphicType.MAIN),
    GROUP("04", "Group", LandCivilianEntity.CIVILIAN, GraphicType.MAIN),
    KILLING_VICTIM("05", "Individual Victim Killed by Criminal Activity", LandCivilianEntity.CIVILIAN, GraphicType.MAIN),
    KILLING_VICTIMS("06", "Group of Victims Killed by Criminal Activity", LandCivilianEntity.CIVILIAN, GraphicType.MAIN),
    VICTIM_ATTEMPTED_CRIME("07", "Victim of an Attempted Crime", LandCivilianEntity.CIVILIAN, GraphicType.MAIN),
    SPY("08", "Spy", LandCivilianEntity.CIVILIAN, GraphicType.MAIN),
    COMPOSITE_LOSS("09", "Composite Loss", LandCivilianEntity.CIVILIAN, GraphicType.MAIN),
    EMERGENCY_MEDICAL_OPERATION("10", "Emergency Medical Operation", LandCivilianEntity.CIVILIAN, GraphicType.FULL_OCTAGON);

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
    public Entity getEntity() {
        return entity;
    }

}