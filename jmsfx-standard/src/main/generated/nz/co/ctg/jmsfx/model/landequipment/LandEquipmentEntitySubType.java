package nz.co.ctg.jmsfx.model.landequipment;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum LandEquipmentEntitySubType implements EntitySubType {
    SINGLE_SHOT_RIFLE("01", "Single Shot Rifle", LandEquipmentEntityType.RIFLE, IconType.FULL_OCTAGON),
    SEMIAUTOMATIC_RIFLE("02", "Semiautomatic Rifle", LandEquipmentEntityType.RIFLE, IconType.FULL_OCTAGON),
    AUTOMATIC_RIFLE("03", "Automatic Rifle", LandEquipmentEntityType.RIFLE, IconType.FULL_OCTAGON),
    MG_LIGHT("01", "Light", LandEquipmentEntityType.MACHINE_GUN, IconType.FULL_OCTAGON),
    MG_MEDIUM("02", "Medium", LandEquipmentEntityType.MACHINE_GUN, IconType.FULL_OCTAGON),
    MG_HEAVY("03", "Heavy", LandEquipmentEntityType.MACHINE_GUN, IconType.FULL_OCTAGON),
    GRENADE_LAUNCHER_LIGHT("01", "Light", LandEquipmentEntityType.GRENADE_LAUNCHER, IconType.FULL_OCTAGON),
    GRENADE_LAUNCHER_MEDIUM("02", "Medium", LandEquipmentEntityType.GRENADE_LAUNCHER, IconType.FULL_OCTAGON),
    GRENADE_LAUNCHER_HEAVY("03", "Heavy", LandEquipmentEntityType.GRENADE_LAUNCHER, IconType.FULL_OCTAGON),
    AIR_DEFENSE_GUN_LIGHT("01", "Light", LandEquipmentEntityType.AIR_DEFENSE_GUN, IconType.FULL_OCTAGON),
    AIR_DEFENSE_GUN_MEDIUM("02", "Medium", LandEquipmentEntityType.AIR_DEFENSE_GUN, IconType.FULL_OCTAGON),
    AIR_DEFENSE_GUN_HEAVY("03", "Heavy", LandEquipmentEntityType.AIR_DEFENSE_GUN, IconType.FULL_OCTAGON),
    ANTITANK_GUN_LIGHT("01", "Light", LandEquipmentEntityType.ANTITANK_GUN, IconType.FULL_OCTAGON),
    ANTITANK_GUN_MEDIUM("02", "Medium", LandEquipmentEntityType.ANTITANK_GUN, IconType.FULL_OCTAGON),
    ANTITANK_GUN_HEAVY("03", "Heavy", LandEquipmentEntityType.ANTITANK_GUN, IconType.FULL_OCTAGON),
    DIRECT_FIRE_GUN_LIGHT("01", "Light", LandEquipmentEntityType.DIRECT_FIRE_GUN, IconType.FULL_OCTAGON),
    DIRECT_FIRE_GUN_MEDIUM("02", "Medium", LandEquipmentEntityType.DIRECT_FIRE_GUN, IconType.FULL_OCTAGON),
    DIRECT_FIRE_GUN_HEAVY("03", "Heavy", LandEquipmentEntityType.DIRECT_FIRE_GUN, IconType.FULL_OCTAGON),
    RECOILLESS_GUN_LIGHT("01", "Light", LandEquipmentEntityType.RECOILLESS_GUN, IconType.FULL_OCTAGON),
    RECOILLESS_GUN_MEDIUM("02", "Medium", LandEquipmentEntityType.RECOILLESS_GUN, IconType.FULL_OCTAGON),
    RECOILLESS_GUN_HEAVY("03", "Heavy", LandEquipmentEntityType.RECOILLESS_GUN, IconType.FULL_OCTAGON),
    HOWITZER_LIGHT("01", "Light", LandEquipmentEntityType.HOWITZER, IconType.FULL_OCTAGON),
    HOWITZER_MEDIUM("02", "Medium", LandEquipmentEntityType.HOWITZER, IconType.FULL_OCTAGON),
    HOWITZER_HEAVY("03", "Heavy", LandEquipmentEntityType.HOWITZER, IconType.FULL_OCTAGON),
    MISSILE_LAUNCHER_LIGHT("01", "Light", LandEquipmentEntityType.MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    MISSILE_LAUNCHER_MEDIUM("02", "Medium", LandEquipmentEntityType.MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    MISSILE_LAUNCHER_HEAVY("03", "Heavy", LandEquipmentEntityType.MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    AIR_DEFENSE_MISSILE_LIGHT("01", "Light", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    AIR_DEFENSE_MISSILE_LIGHT_TLAR("02", "Light Transporter-Launcher and Radar (TLAR)", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    AIR_DEFENSE_MISSILE_LIGHT_TELAR("03", "Light Transporter-Erector-Launcher and Radar (TELAR)", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    AIR_DEFENSE_MISSILE_MEDIUM("04", "Medium", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    AIR_DEFENSE_MISSILE_MEDIUM_TLAR("05", "Medium TLAR", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    AIR_DEFENSE_MISSILE_MEDIUM_TELAR("06", "Medium TELAR", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    AIR_DEFENSE_MISSILE_HEAVY("07", "Heavy", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    AIR_DEFENSE_MISSILE_HEAVY_TLAR("08", "Heavy TLAR", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    AIR_DEFENSE_MISSILE_HEAVY_TELAR("09", "Heavy TELAR", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    ANTITANK_MISSILE_LAUNCHER_LIGHT("01", "Light", LandEquipmentEntityType.ANTITANK_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    ANTITANK_MISSILE_LAUNCHER_MEDIUM("02", "Medium", LandEquipmentEntityType.ANTITANK_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    ANTITANK_MISSILE_LAUNCHER_HEAVY("03", "Heavy", LandEquipmentEntityType.ANTITANK_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    SURFACE_TO_SURFACE_MISSILE_LIGHT("01", "Light", LandEquipmentEntityType.SURFACE_TO_SURFACE_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    SURFACE_TO_SURFACE_MISSILE_MEDIUM("02", "Medium", LandEquipmentEntityType.SURFACE_TO_SURFACE_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    SURFACE_TO_SURFACE_MISSILE_HEAVY("03", "Heavy", LandEquipmentEntityType.SURFACE_TO_SURFACE_MISSILE_LAUNCHER, IconType.FULL_OCTAGON),
    MORTAR_LIGHT("01", "Light", LandEquipmentEntityType.MORTAR, IconType.FULL_OCTAGON),
    MORTAR_MEDIUM("02", "Medium", LandEquipmentEntityType.MORTAR, IconType.FULL_OCTAGON),
    MORTAR_HEAVY("03", "Heavy", LandEquipmentEntityType.MORTAR, IconType.FULL_OCTAGON),
    SINGLE_ROCKET_LIGHT("01", "Light", LandEquipmentEntityType.SINGLE_ROCKET_LAUNCHER, IconType.FULL_OCTAGON),
    SINGLE_ROCKET_MEDIUM("02", "Medium", LandEquipmentEntityType.SINGLE_ROCKET_LAUNCHER, IconType.FULL_OCTAGON),
    SINGLE_ROCKET_HEAVY("03", "Heavy", LandEquipmentEntityType.SINGLE_ROCKET_LAUNCHER, IconType.FULL_OCTAGON),
    MULTIPLE_ROCKET_LIGHT("01", "Light", LandEquipmentEntityType.MULTIPLE_ROCKET_LAUNCHER, IconType.FULL_OCTAGON),
    MULTIPLE_ROCKET_MEDIUM("02", "Medium", LandEquipmentEntityType.MULTIPLE_ROCKET_LAUNCHER, IconType.FULL_OCTAGON),
    MULTIPLE_ROCKET_HEAVY("03", "Heavy", LandEquipmentEntityType.MULTIPLE_ROCKET_LAUNCHER, IconType.FULL_OCTAGON),
    ANTITANK_ROCKET_LIGHT("01", "Light", LandEquipmentEntityType.ANTITANK_ROCKET_LAUNCHER, IconType.FULL_OCTAGON),
    ANTITANK_ROCKET_MEDIUM("02", "Medium", LandEquipmentEntityType.ANTITANK_ROCKET_LAUNCHER, IconType.FULL_OCTAGON),
    ANTITANK_ROCKET_HEAVY("03", "Heavy", LandEquipmentEntityType.ANTITANK_ROCKET_LAUNCHER, IconType.FULL_OCTAGON),
    ARMORED_FIGHTING_VEHICLE("01", "Armored Fighting Vehicle", LandEquipmentEntityType.VEHICLE_ARMORED, IconType.FULL_OCTAGON),
    ARMORED_FIGHTING_VEHICLE_C2("02", "Armored Fighting Vehicle Command and Control", LandEquipmentEntityType.VEHICLE_ARMORED, IconType.FULL_OCTAGON),
    ARMORED_PERSONNEL_CARRIER("03", "Armored Personnel Carrier", LandEquipmentEntityType.VEHICLE_ARMORED, IconType.FULL_OCTAGON),
    ARMORED_PERSONNEL_CARRIER_AMBULANCE("04", "Armored Personnel Carrier Ambulance", LandEquipmentEntityType.VEHICLE_ARMORED, IconType.FULL_OCTAGON),
    ARMORED_PROTECTED_VEHICLE("05", "Armored Protected Vehicle", LandEquipmentEntityType.VEHICLE_ARMORED, IconType.MAIN),
    ARMORED_PERSONNEL_CARRIER_RECOVERY("08", "Armored Personnel Carrier-Recovery", LandEquipmentEntityType.VEHICLE_ARMORED, IconType.FULL_OCTAGON),
    COMBAT_SERVICE_SUPPORT_VEHICLE("09", "Combat Service Support Vehicle", LandEquipmentEntityType.VEHICLE_ARMORED, IconType.FULL_OCTAGON),
    LIGHT_ARMOURED_RECONNAISSANCE("11", "Light Armoured Reconnaissance", LandEquipmentEntityType.VEHICLE_ARMORED, IconType.FULL_OCTAGON),
    TANK_LIGHT("01", "Light", LandEquipmentEntityType.TANK, IconType.FULL_OCTAGON),
    TANK_MEDIUM("02", "Medium", LandEquipmentEntityType.TANK, IconType.FULL_OCTAGON),
    TANK_HEAVY("03", "Heavy", LandEquipmentEntityType.TANK, IconType.FULL_OCTAGON),
    DRILL_MOUNTED_ON_UTILITY_VEHICLE("01", "Drill Mounted on Utility Vehicle", LandEquipmentEntityType.DRILL, IconType.FULL_OCTAGON),
    EARTHMOVER_DIGGER("01", "Multifunctional Earthmover/Digger", LandEquipmentEntityType.EARTHMOVER, IconType.FULL_OCTAGON),
    MINE_CLEARING_EQUIPMENT_TANK_CHASSIS("02", "Mine Clearing Equipment on Tank Chassis", LandEquipmentEntityType.MINE_CLEARING_EQUIPMENT, IconType.FULL_OCTAGON),
    ASSAULT_BREACHER_VEHICLE("03", "Assault Breacher Vehicle (ABV) with Combat Dozer Blade", LandEquipmentEntityType.MINE_CLEARING_EQUIPMENT, IconType.FULL_OCTAGON),
    MINE_LAYING_EQUIPMENT_UTILITY_VEHICLE("01", "Mine Laying Equipment on Utility Vehicle", LandEquipmentEntityType.MINE_LAYING_EQUIPMENT, IconType.FULL_OCTAGON),
    ARMORED_CARRIER_VOLCANO("02", "Armored Carrier with Volcano", LandEquipmentEntityType.MINE_LAYING_EQUIPMENT, IconType.FULL_OCTAGON),
    TRUCK_VOLCANO("03", "Truck Mounted with Volcano", LandEquipmentEntityType.MINE_LAYING_EQUIPMENT, IconType.FULL_OCTAGON),
    DOZER_ARMORED("01", "Dozer-Armored", LandEquipmentEntityType.DOZER, IconType.FULL_OCTAGON),
    SEMI_LIGHT("01", "Light", LandEquipmentEntityType.SEMI_TRAILER_AND_TRUCK, IconType.FULL_OCTAGON),
    SEMI_MEDIUM("02", "Medium", LandEquipmentEntityType.SEMI_TRAILER_AND_TRUCK, IconType.FULL_OCTAGON),
    SEMI_HEAVY("03", "Heavy", LandEquipmentEntityType.SEMI_TRAILER_AND_TRUCK, IconType.FULL_OCTAGON),
    TOW_TRUCK_LIGHT("01", "Light", LandEquipmentEntityType.TOW_TRUCK, IconType.FULL_OCTAGON),
    TOW_TRUCK_HEAVY("02", "Heavy", LandEquipmentEntityType.TOW_TRUCK, IconType.FULL_OCTAGON),
    TENT_CIVILIAN("01", "Tent - Civilian", LandEquipmentEntityType.TENT, IconType.MAIN_1),
    TENT_MILITARY("02", "Tent - Military", LandEquipmentEntityType.TENT, IconType.MAIN_1);

    private final String id;
    private final String label;
    private final LandEquipmentEntityType entityType;
    private final IconType iconType;
    
    private LandEquipmentEntitySubType(String id, String label, LandEquipmentEntityType entityType, IconType iconType) {
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