package io.github.ctgnz.jmsfx.standard.seasurface;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum SeaSurfaceEntityType implements EntityType {
    CARRIER("01", "Carrier", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN),
    SURF_COMBAT_LINE("02", "Surface Combatant, Line", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN),
    AMPHIB_WAR_SHIP("03", "Amphibious Warfare Ship", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN),
    MINE_WARFARE("04", "Mine Warfare Ship", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN),
    PATROL_BOAT("05", "Patrol Boat", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN),
    DECOY("06", "Decoy", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN),
    USV("07", "Unmanned Surface Water Vehicle (USV)", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN),
    SPEEDBOAT("08", "Speedboat", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN),
    JET_SKI("09", "Jet Ski", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN),
    NAVY_TASK("10", "Navy Task Organization", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN),
    SEA_BASED_X("11", "Sea-Based X-Band (SBX) Radar", SeaSurfaceEntity.MILITARY_COMBAT, GraphicType.MAIN),
    AUX("01", "Auxiliary Ship", SeaSurfaceEntity.MILITARY_NON_COMBAT, GraphicType.MAIN),
    SERVICE_CRAFT("02", "Service Craft/Yard", SeaSurfaceEntity.MILITARY_NON_COMBAT, GraphicType.MAIN),
    CIV_MERCHANT("01", "Merchant Ship", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON),
    CIV_FISHING("02", "Fishing Vessel", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON),
    CIV_LAW("03", "Law Enforcement Vessel", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON),
    CIV_LEISURE_SAIL("04", "Leisure Craft, Sailing", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON),
    CIV_LEISURE_MOTOR("05", "Leisure Craft, Motorized", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON),
    CIV_JET_SKI("06", "Jet Ski", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON),
    CIV_USV("07", "Unmanned Surface Water Vehicle (USV)", SeaSurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final SeaSurfaceEntity entity;
    private final GraphicType graphicType;

    SeaSurfaceEntityType(String id, String label, SeaSurfaceEntity entity, GraphicType graphicType) {
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

    @Override
    public List<EntitySubType> getEntitySubTypes() {
        return SeaSurfaceSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}