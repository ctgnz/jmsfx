package nz.co.ctg.jmsfx.model.seasurface;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum SeaSurfaceEntitySubType implements EntitySubType {
    BB("01", "Battleship", SeaSurfaceEntityType.SURF_COMBAT_LINE, IconType.MAIN),
    CA("02", "Cruiser", SeaSurfaceEntityType.SURF_COMBAT_LINE, IconType.MAIN),
    DD("03", "Destroyer", SeaSurfaceEntityType.SURF_COMBAT_LINE, IconType.MAIN),
    FF("04", "Frigate", SeaSurfaceEntityType.SURF_COMBAT_LINE, IconType.MAIN),
    CORVETTE("05", "Corvette", SeaSurfaceEntityType.SURF_COMBAT_LINE, IconType.MAIN),
    LCS("06", "Littoral Combatant Ship", SeaSurfaceEntityType.SURF_COMBAT_LINE, IconType.MAIN),
    ACS("01", "Amphibious Command Ship", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, IconType.MAIN),
    AMPHIB_ASSAULT_NON("02", "Amphibious Assault, Non-specified", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, IconType.MAIN),
    AMPHIB_ASSAULT_GENERAL("03", "Amphibious Assault Ship, General", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, IconType.MAIN),
    AMPHIB_ASSAULT_MULT("04", "Amphibious Assault Ship, Multipurpose", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, IconType.MAIN),
    AMPHIB_ASSAULT_HELO("05", "Amphibious Assault Ship, Helicopter", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, IconType.MAIN),
    AMPHIB_TRANS_DOCK("06", "Amphibious Transport Dock", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, IconType.MAIN),
    LANDING_SHIP("07", "Landing Ship", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, IconType.MAIN),
    LANDING_CRAFT("08", "Landing Craft", SeaSurfaceEntityType.AMPHIB_WAR_SHIP, IconType.MAIN),
    MINE_LAYER("01", "Mine Layer", SeaSurfaceEntityType.MINE_WARFARE, IconType.MAIN),
    MINE_SWEEPER("02", "Mine Sweeper", SeaSurfaceEntityType.MINE_WARFARE, IconType.MAIN),
    MINE_SWEEPER_DRONE("03", "Mine Sweeper, Drone", SeaSurfaceEntityType.MINE_WARFARE, IconType.MAIN),
    MINE_HUNTER("04", "Mine Hunter", SeaSurfaceEntityType.MINE_WARFARE, IconType.MAIN),
    MINE_COUNTER("05", "Mine Countermeasures", SeaSurfaceEntityType.MINE_WARFARE, IconType.MAIN),
    MINE_COUNTER_SUPPORT("06", "Mine Countermeasures, Support Ship", SeaSurfaceEntityType.MINE_WARFARE, IconType.MAIN),
    PATROL_CHASER("01", "Patrol Craft, Submarine Chaser/Escort, General", SeaSurfaceEntityType.PATROL_BOAT, IconType.MAIN),
    PATROL_SHIP("02", "Patrol Ship, General", SeaSurfaceEntityType.PATROL_BOAT, IconType.MAIN),
    RHIB("01", "Rigid-Hull Inflatable Boat (RHIB)", SeaSurfaceEntityType.SPEEDBOAT, IconType.MAIN),
    NAVY_TASK_ELEMENT("01", "Navy Task Element", SeaSurfaceEntityType.NAVY_TASK, IconType.MAIN),
    NAVY_TASK_FORCE("02", "Navy Task Force", SeaSurfaceEntityType.NAVY_TASK, IconType.MAIN),
    NAVY_TASK_GROUP("03", "Navy Task Group", SeaSurfaceEntityType.NAVY_TASK, IconType.MAIN),
    NAVY_TASK_UNIT("04", "Navy Task Unit", SeaSurfaceEntityType.NAVY_TASK, IconType.MAIN),
    CONVOY("05", "Convoy", SeaSurfaceEntityType.NAVY_TASK, IconType.MAIN),
    AMMO_SHIP("01", "Ammunition Ship", SeaSurfaceEntityType.AUX, IconType.MAIN),
    NAVAL_STORES("02", "Naval Stores Ship", SeaSurfaceEntityType.AUX, IconType.MAIN),
    AUX_FLAG("03", "Auxiliary Flag Ship", SeaSurfaceEntityType.AUX, IconType.MAIN),
    INTEL_COLLECTOR("04", "Intelligence Collector", SeaSurfaceEntityType.AUX, IconType.MAIN),
    OCEANO_RESEARCH("05", "Oceanographic Research Ship", SeaSurfaceEntityType.AUX, IconType.MAIN),
    SURVEY("06", "Survey Ship", SeaSurfaceEntityType.AUX, IconType.MAIN),
    HOSPITAL("07", "Hospital Ship", SeaSurfaceEntityType.AUX, IconType.MAIN),
    NAVAL_CARGO("08", "Naval Cargo Ship", SeaSurfaceEntityType.AUX, IconType.MAIN),
    COMBAT_SUPPORT_FAST("09", "Combat Support Ship, Fast", SeaSurfaceEntityType.AUX, IconType.MAIN),
    OILER("10", "Oiler, Replenishment", SeaSurfaceEntityType.AUX, IconType.MAIN),
    REPAIR("11", "Repair Ship", SeaSurfaceEntityType.AUX, IconType.MAIN),
    SUB_TENDER("12", "Submarine Tender", SeaSurfaceEntityType.AUX, IconType.MAIN),
    TUG("13", "Tug, Ocean Going", SeaSurfaceEntityType.AUX, IconType.MAIN),
    BARGE_NON_SELF("01", "Barge, Not Self-Propelled", SeaSurfaceEntityType.SERVICE_CRAFT, IconType.MAIN),
    BARGE_SELF("02", "Barge, Self-Propelled", SeaSurfaceEntityType.SERVICE_CRAFT, IconType.MAIN),
    TUG_HARBOR("03", "Tug, Harbor", SeaSurfaceEntityType.SERVICE_CRAFT, IconType.MAIN),
    LAUNCH("04", "Launch", SeaSurfaceEntityType.SERVICE_CRAFT, IconType.MAIN),
    CIV_CARGO("01", "Cargo, General", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_CONTAINER("02", "Container Ship", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_DREDGE("03", "Dredge", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_RORO("04", "Roll On/Roll Off", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_FERRY("05", "Ferry", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_HEAVY_LIFT("06", "Heavy Lift", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_HOVERCRAFT("07", "Hovercraft", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_LASH_CARRIER("08", "Lash Carrier (with Barges)", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_OILER_TANKER("09", "Oiler/Tanker", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_PASSENGER("10", "Passenger", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_TUG("11", "Tug, Ocean Going", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_TOW("12", "Tow", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_HAZMAT("13", "Transport Ship, Hazardous Material", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_JUNK("14", "Junk/Dhow", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_BARGE("15", "Barge, Not Self-Propelled", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_HOSPITAL("16", "Hospital Ship", SeaSurfaceEntityType.CIV_MERCHANT, IconType.FULL_OCTAGON),
    CIV_DRIFTER("01", "Drifter", SeaSurfaceEntityType.CIV_FISHING, IconType.FULL_OCTAGON),
    CIV_TRAWLER("02", "Trawler", SeaSurfaceEntityType.CIV_FISHING, IconType.FULL_OCTAGON),
    CIV_DREDGER("03", "Dredger", SeaSurfaceEntityType.CIV_FISHING, IconType.FULL_OCTAGON),
    CIV_RHIB("01", "Rigid-Hull Inflatable Boat (RHIB)", SeaSurfaceEntityType.CIV_LEISURE_MOTOR, IconType.FULL_OCTAGON),
    CIV_SPEED("02", "Speedboat", SeaSurfaceEntityType.CIV_LEISURE_MOTOR, IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final SeaSurfaceEntityType entityType;
    private final IconType iconType;
    
    private SeaSurfaceEntitySubType(String id, String label, SeaSurfaceEntityType entityType, IconType iconType) {
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