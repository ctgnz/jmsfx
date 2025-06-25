package io.github.ctgnz.jmsfx.standard.air;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum AirEntitySubType implements EntitySubType {
    MEDEVAC("01", "Medical Evacuation (MEDEVAC)", AirEntityType.FIXED_WING, GraphicType.MAIN),
    ATTACK_STRIKE("02", "Attack/Strike", AirEntityType.FIXED_WING, GraphicType.MAIN),
    BOMBER("03", "Bomber", AirEntityType.FIXED_WING, GraphicType.MAIN),
    FIGHTER("04", "Fighter", AirEntityType.FIXED_WING, GraphicType.MAIN),
    FIGHTER_BOMBER("05", "Fighter/Bomber", AirEntityType.FIXED_WING, GraphicType.MAIN),
    CARGO("07", "Cargo", AirEntityType.FIXED_WING, GraphicType.MAIN),
    ECJ("08", "Electronic Combat (EC)/Jammer", AirEntityType.FIXED_WING, GraphicType.MAIN),
    TANKER("09", "Tanker", AirEntityType.FIXED_WING, GraphicType.MAIN),
    PATROL("10", "Patrol", AirEntityType.FIXED_WING, GraphicType.MAIN),
    RECON("11", "Reconnaissance", AirEntityType.FIXED_WING, GraphicType.MAIN),
    TRAINER("12", "Trainer", AirEntityType.FIXED_WING, GraphicType.MAIN),
    UTILITY("13", "Utility", AirEntityType.FIXED_WING, GraphicType.MAIN),
    VSTOL("14", "VSTOL", AirEntityType.FIXED_WING, GraphicType.MAIN),
    ACP("15", "Airborne Command Post (ACP)", AirEntityType.FIXED_WING, GraphicType.MAIN),
    AEW("16", "Airborne Early Warning (AEW)", AirEntityType.FIXED_WING, GraphicType.MAIN),
    ASUW("17", "Antisurface Warfare", AirEntityType.FIXED_WING, GraphicType.MAIN),
    ASW("18", "Antisubmarine Warfare", AirEntityType.FIXED_WING, GraphicType.MAIN),
    COM("19", "Communications", AirEntityType.FIXED_WING, GraphicType.MAIN),
    CSAR("20", "Combat Search and Rescue (CSAR)", AirEntityType.FIXED_WING, GraphicType.MAIN),
    ESM("21", "Electronic Support Measures (ESM)", AirEntityType.FIXED_WING, GraphicType.MAIN),
    GOV("22", "Government", AirEntityType.FIXED_WING, GraphicType.MAIN),
    MCM("23", "Mine Countermeasures (MCM)", AirEntityType.FIXED_WING, GraphicType.MAIN),
    PR("24", "Personnel Recovery", AirEntityType.FIXED_WING, GraphicType.MAIN),
    SAR("25", "Search and Rescue", AirEntityType.FIXED_WING, GraphicType.MAIN),
    SOF("26", "Special Operations Forces", AirEntityType.FIXED_WING, GraphicType.MAIN),
    UL("27", "Ultra Light", AirEntityType.FIXED_WING, GraphicType.MAIN),
    PH("28", "Photographic Reconnaissance", AirEntityType.FIXED_WING, GraphicType.MAIN),
    VIP("29", "Very Important Person (VIP)", AirEntityType.FIXED_WING, GraphicType.MAIN),
    SEAD("30", "Suppression of Enemy Air Defense", AirEntityType.FIXED_WING, GraphicType.MAIN),
    PX("31", "Passenger", AirEntityType.FIXED_WING, GraphicType.MAIN),
    E("32", "Escort", AirEntityType.FIXED_WING, GraphicType.MAIN),
    EA("33", "Electronic Attack (EA)", AirEntityType.FIXED_WING, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final AirEntityType entityType;
    private final GraphicType graphicType;

    AirEntitySubType(String id, String label, AirEntityType entityType, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
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
    public EntityType getEntityType() {
        return entityType;
    }

}