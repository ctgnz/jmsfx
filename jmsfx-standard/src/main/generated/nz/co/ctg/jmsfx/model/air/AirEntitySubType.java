package nz.co.ctg.jmsfx.model.air;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum AirEntitySubType implements EntitySubType {
    MEDEVAC("01", "Medical Evacuation (MEDEVAC)", AirEntityType.FIXED_WING, IconType.MAIN),
    ATTACK_STRIKE("02", "Attack/Strike", AirEntityType.FIXED_WING, IconType.MAIN),
    BOMBER("03", "Bomber", AirEntityType.FIXED_WING, IconType.MAIN),
    FIGHTER("04", "Fighter", AirEntityType.FIXED_WING, IconType.MAIN),
    FIGHTER_BOMBER("05", "Fighter/Bomber", AirEntityType.FIXED_WING, IconType.MAIN),
    CARGO("07", "Cargo", AirEntityType.FIXED_WING, IconType.MAIN),
    ECJ("08", "Electronic Combat (EC)/Jammer", AirEntityType.FIXED_WING, IconType.MAIN),
    TANKER("09", "Tanker", AirEntityType.FIXED_WING, IconType.MAIN),
    PATROL("10", "Patrol", AirEntityType.FIXED_WING, IconType.MAIN),
    RECON("11", "Reconnaissance", AirEntityType.FIXED_WING, IconType.MAIN),
    TRAINER("12", "Trainer", AirEntityType.FIXED_WING, IconType.MAIN),
    UTILITY("13", "Utility", AirEntityType.FIXED_WING, IconType.MAIN),
    VSTOL("14", "VSTOL", AirEntityType.FIXED_WING, IconType.MAIN),
    ACP("15", "Airborne Command Post (ACP)", AirEntityType.FIXED_WING, IconType.MAIN),
    AEW("16", "Airborne Early Warning (AEW)", AirEntityType.FIXED_WING, IconType.MAIN),
    ASUW("17", "Antisurface Warfare", AirEntityType.FIXED_WING, IconType.MAIN),
    ASW("18", "Antisubmarine Warfare", AirEntityType.FIXED_WING, IconType.MAIN),
    COM("19", "Communications", AirEntityType.FIXED_WING, IconType.MAIN),
    CSAR("20", "Combat Search and Rescue (CSAR)", AirEntityType.FIXED_WING, IconType.MAIN),
    ESM("21", "Electronic Support Measures (ESM)", AirEntityType.FIXED_WING, IconType.MAIN),
    GOV("22", "Government", AirEntityType.FIXED_WING, IconType.MAIN),
    MCM("23", "Mine Countermeasures (MCM)", AirEntityType.FIXED_WING, IconType.MAIN),
    PR("24", "Personnel Recovery", AirEntityType.FIXED_WING, IconType.MAIN),
    SAR("25", "Search and Rescue", AirEntityType.FIXED_WING, IconType.MAIN),
    SOF("26", "Special Operations Forces", AirEntityType.FIXED_WING, IconType.MAIN),
    UL("27", "Ultra Light", AirEntityType.FIXED_WING, IconType.MAIN),
    PH("28", "Photographic Reconnaissance", AirEntityType.FIXED_WING, IconType.MAIN),
    VIP("29", "Very Important Person (VIP)", AirEntityType.FIXED_WING, IconType.MAIN),
    SEAD("30", "Suppression of Enemy Air Defense", AirEntityType.FIXED_WING, IconType.MAIN),
    PX("31", "Passenger", AirEntityType.FIXED_WING, IconType.MAIN),
    E("32", "Escort", AirEntityType.FIXED_WING, IconType.MAIN),
    EA("33", "Electronic Attack (EA)", AirEntityType.FIXED_WING, IconType.MAIN);

    private final String id;
    private final String label;
    private final AirEntityType entityType;
    private final IconType iconType;
    
    private AirEntitySubType(String id, String label, AirEntityType entityType, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
        this.iconType = iconType;
    }
    

    @Override
    public IconType getIconType() {
        return iconType;
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