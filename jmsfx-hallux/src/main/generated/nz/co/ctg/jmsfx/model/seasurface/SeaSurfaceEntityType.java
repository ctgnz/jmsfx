package nz.co.ctg.jmsfx.model.seasurface;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.IconType;

public enum SeaSurfaceEntityType implements EntityType {
    CARRIER("01", "Carrier", SeaSurfaceEntity.MILITARY_COMBAT, IconType.MAIN),
    SURF_COMBAT_LINE("02", "Surface Combatant, Line", SeaSurfaceEntity.MILITARY_COMBAT, IconType.MAIN),
    AMPHIB_WAR_SHIP("03", "Amphibious Warfare Ship", SeaSurfaceEntity.MILITARY_COMBAT, IconType.MAIN),
    MINE_WARFARE("04", "Mine Warfare Ship", SeaSurfaceEntity.MILITARY_COMBAT, IconType.MAIN),
    PATROL_BOAT("05", "Patrol Boat", SeaSurfaceEntity.MILITARY_COMBAT, IconType.MAIN),
    DECOY("06", "Decoy", SeaSurfaceEntity.MILITARY_COMBAT, IconType.MAIN),
    USV("07", "Unmanned Surface Water Vehicle (USV)", SeaSurfaceEntity.MILITARY_COMBAT, IconType.MAIN),
    SPEEDBOAT("08", "Speedboat", SeaSurfaceEntity.MILITARY_COMBAT, IconType.MAIN),
    JET_SKI("09", "Jet Ski", SeaSurfaceEntity.MILITARY_COMBAT, IconType.MAIN),
    NAVY_TASK("10", "Navy Task Organization", SeaSurfaceEntity.MILITARY_COMBAT, IconType.MAIN),
    SEA_BASED_X("11", "Sea-Based X-Band (SBX) Radar", SeaSurfaceEntity.MILITARY_COMBAT, IconType.MAIN),
    AUX("01", "Auxiliary Ship", SeaSurfaceEntity.MILITARY_NON_COMBAT, IconType.MAIN),
    SERVICE_CRAFT("02", "Service Craft/Yard", SeaSurfaceEntity.MILITARY_NON_COMBAT, IconType.MAIN),
    CIV_MERCHANT("01", "Merchant Ship", SeaSurfaceEntity.CIVILIAN, IconType.FULL_OCTAGON),
    CIV_FISHING("02", "Fishing Vessel", SeaSurfaceEntity.CIVILIAN, IconType.FULL_OCTAGON),
    CIV_LAW("03", "Law Enforcement Vessel", SeaSurfaceEntity.CIVILIAN, IconType.FULL_OCTAGON),
    CIV_LEISURE_SAIL("04", "Leisure Craft, Sailing", SeaSurfaceEntity.CIVILIAN, IconType.FULL_OCTAGON),
    CIV_LEISURE_MOTOR("05", "Leisure Craft, Motorized", SeaSurfaceEntity.CIVILIAN, IconType.FULL_OCTAGON),
    CIV_JET_SKI("06", "Jet Ski", SeaSurfaceEntity.CIVILIAN, IconType.FULL_OCTAGON),
    CIV_USV("07", "Unmanned Surface Water Vehicle (USV)", SeaSurfaceEntity.CIVILIAN, IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final SeaSurfaceEntity entity;
    private final IconType iconType;
    
    private SeaSurfaceEntityType(String id, String label, SeaSurfaceEntity entity, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
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
    public Entity getEntity() {
        return entity;
    }
    
   @Override
    public List<EntitySubType> getEntitySubTypes() {
        return SeaSurfaceSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

}