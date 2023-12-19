package nz.co.ctg.jmsfx.model.landequipment;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.IconType;

public enum LandEquipmentEntityType implements EntityType {
    RIFLE("01", "Rifle", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    MACHINE_GUN("02", "Machine Gun", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    GRENADE_LAUNCHER("03", "Grenade Launcher", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    FLAME_THROWER("04", "Flame Thrower", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    AIR_DEFENSE_GUN("05", "Air Defense Gun", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    ANTITANK_GUN("06", "Antitank Gun", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    DIRECT_FIRE_GUN("07", "Direct Fire Gun", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    RECOILLESS_GUN("08", "Recoilless Gun", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    HOWITZER("09", "Howitzer", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    MISSILE_LAUNCHER("10", "Missile Launcher", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    AIR_DEFENSE_MISSILE_LAUNCHER("11", "Air Defense Missile Launcher", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    ANTITANK_MISSILE_LAUNCHER("12", "Antitank Missile Launcher", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    SURFACE_TO_SURFACE_MISSILE_LAUNCHER("13", "Surface-to-Surface Missile Launcher", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    MORTAR("14", "Mortar", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    SINGLE_ROCKET_LAUNCHER("15", "Single Rocket Launcher", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    MULTIPLE_ROCKET_LAUNCHER("16", "Multiple Rocket Launcher", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    ANTITANK_ROCKET_LAUNCHER("17", "Antitank Rocket Launcher", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    NONLETHAL_WEAPON("18", "Nonlethal Weapon", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    TASER("19", "Taser", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    WATER_CANNON("20", "Water Cannon", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    DIRECTED_ENERGY("21", "Directed Energy Weapon", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    SWORD("22", "Sword", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    BAYONET("23", "Bayonet", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    KNIFE("24", "Knife", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    SPEAR("25", "Spear", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    BOW("26", "Bow", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    CROSSBOW("27", "Crossbow", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    TREBUCHET("28", "Trebuchet", LandEquipmentEntity.WEAPON_SYSTEM, IconType.FULL_OCTAGON),
    VEHICLE_ARMORED("01", "Armored Vehicle", LandEquipmentEntity.VEHICLE, IconType.FULL_OCTAGON),
    TANK("02", "Tank", LandEquipmentEntity.VEHICLE, IconType.FULL_OCTAGON),
    TANK_RECOVERY_VEHICLE("03", "Tank Recovery Vehicle", LandEquipmentEntity.VEHICLE, IconType.FULL_OCTAGON),
    BRIDGE("01", "Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    BRIDGE_MOUNTED_UTILITY_VEHICLE("02", "Bridge Mounted on Utility Vehicle", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    FIXED_BRIDGE("03", "Fixed Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    FLOATING_BRIDGE("04", "Floating Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    FOLDING_GIRDER_BRIDGE("05", "Folding Girder Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    HOLLOW_DECK_BRIDGE("06", "Hollow Deck Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    DRILL("07", "Drill", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    EARTHMOVER("08", "Earthmover", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    MINE_CLEARING_EQUIPMENT("09", "Mine Clearing Equipment", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    MINE_LAYING_EQUIPMENT("10", "Mine Laying Equipment", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    DOZER("11", "Dozer", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    ARMORED_ASSAULT("12", "Armored Assault", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    ARMORED_ENGINEER_RECON_VEHICLE_AERV("13", "Armored Engineer Recon Vehicle (AERV)", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    BACKHOE("14", "Backhoe", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    CONSTRUCTION_VEHICLE("15", "Construction Vehicle", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    FERRY_TRANSPORTER("16", "Ferry Transporter", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, IconType.FULL_OCTAGON),
    UTILITY_VEHICLE("01", "Utility Vehicle", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    UTILITY_VEHICLE_MEDICAL("02", "Medical", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    UTILITY_VEHICLE_MEDEVAC("03", "Medical Evacuation", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    UTILITY_VEHICLE_MOBILE_EMERGENCY_PHYSICIAN("04", "Mobile Emergency Physician", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    BUS("05", "Bus", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    SEMI_TRAILER_AND_TRUCK("06", "Semi-Trailer and Truck", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    LIMITED_CROSS_COUNTRY_TRUCK("07", "Limited Cross Country Truck", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    CROSS_COUNTRY_TRUCK("08", "Cross Country Truck", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    POL_VEHICLE("09", "Petroleum-Oil and Lubricant", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    WATER_VEHICLE("10", "Water", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    AMPHIBIOUS_UTILITY_WHEELED_VEHICLE("11", "Amphibious Utility Wheeled Vehicle", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    TOW_TRUCK("12", "Tow Truck", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    BICYCLE("13", "Bicycle", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    MOTORBIKE("14", "Motorbike", LandEquipmentEntity.UTILITY_VEHICLES, IconType.FULL_OCTAGON),
    LOCOMOTIVE("01", "Locomotive", LandEquipmentEntity.TRAIN, IconType.FULL_OCTAGON),
    RAILCAR("02", "Railcar", LandEquipmentEntity.TRAIN, IconType.FULL_OCTAGON),
    AUTOMOBILE("01", "Automobile", LandEquipmentEntity.CIVILIAN_VEHICLE, IconType.FULL_OCTAGON),
    OPEN_BED_TRUCK("02", "Open-Bed Truck", LandEquipmentEntity.CIVILIAN_VEHICLE, IconType.FULL_OCTAGON),
    MULTIPLE_PASSENGER_VEHICLE("03", "Multiple Passenger Vehicle", LandEquipmentEntity.CIVILIAN_VEHICLE, IconType.FULL_OCTAGON),
    AUTO_UTILITY_VEHICLE("04", "Utility Vehicle", LandEquipmentEntity.CIVILIAN_VEHICLE, IconType.FULL_OCTAGON),
    JEEP_TYPE_VEHICLE("05", "Jeep Type Vehicle", LandEquipmentEntity.CIVILIAN_VEHICLE, IconType.FULL_OCTAGON),
    TRACTOR_TRAILER_BOX("06", "Tractor Trailer Truck with Box", LandEquipmentEntity.CIVILIAN_VEHICLE, IconType.FULL_OCTAGON),
    TRACTOR_TRAILER_FLATBED("07", "Tractor Trailer Truck with Flatbed Trailer", LandEquipmentEntity.CIVILIAN_VEHICLE, IconType.FULL_OCTAGON),
    KNOWN_INSURGENT_VEHICLE("08", "Known Insurgent Vehicle", LandEquipmentEntity.CIVILIAN_VEHICLE, IconType.MAIN),
    DRUG_VEHICLE("09", "Drug Vehicle", LandEquipmentEntity.CIVILIAN_VEHICLE, IconType.MAIN),
    BUREAU_ALCOHOL_TOBACCO_FIREARMS_EXPLOSIVES_ATF("01", "Bureau of Alcohol-Tobacco-Firearms and Explosives (ATF) (Department of Justice)", LandEquipmentEntity.LAW_ENFORCEMENT, IconType.MAIN),
    BORDER_PATROL("02", "Border Patrol", LandEquipmentEntity.LAW_ENFORCEMENT, IconType.FULL_OCTAGON),
    CUSTOMS_SERVICE("03", "Customs Service", LandEquipmentEntity.LAW_ENFORCEMENT, IconType.FULL_OCTAGON),
    DRUG_ENFORCEMENT_ADMINISTRATION_DEA("04", "Drug Enforcement Administration (DEA)", LandEquipmentEntity.LAW_ENFORCEMENT, IconType.MAIN),
    DEPARTMENT_OF_JUSTICE_DOJ("05", "Department of Justice (DOJ)", LandEquipmentEntity.LAW_ENFORCEMENT, IconType.FULL_OCTAGON),
    FEDERAL_BUREAU_INVESTIGATION_FBI("06", "Federal Bureau of Investigation (FBI)", LandEquipmentEntity.LAW_ENFORCEMENT, IconType.MAIN),
    POLICE("07", "Police", LandEquipmentEntity.LAW_ENFORCEMENT, IconType.MAIN),
    UNITED_STATES_SECRET_SERVICE_USSS("08", "United States Secret Service (USSS)", LandEquipmentEntity.LAW_ENFORCEMENT, IconType.MAIN),
    TRANSPORTATION_SECURITY_ADMINISTRATION_TSA("09", "Transportation Security Administration (TSA)", LandEquipmentEntity.LAW_ENFORCEMENT, IconType.MAIN),
    COAST_GUARD("10", "Coast Guard", LandEquipmentEntity.LAW_ENFORCEMENT, IconType.FULL_OCTAGON),
    US_MARSHALS_SERVICE("11", "US Marshals Service", LandEquipmentEntity.LAW_ENFORCEMENT, IconType.FULL_OCTAGON),
    PACK_ANIMALS("01", "Pack Animals", LandEquipmentEntity.WORKING_ANIMALS, IconType.FULL_OCTAGON),
    TRAINED_ANIMALS("02", "Trained Animals", LandEquipmentEntity.WORKING_ANIMALS, IconType.FULL_OCTAGON),
    MISSILE_TRANSLOADER("01", "Transloader", LandEquipmentEntity.MISSILE_SUPPORT, IconType.FULL_OCTAGON),
    MISSILE_TRANSPORTER("02", "Transporter", LandEquipmentEntity.MISSILE_SUPPORT, IconType.FULL_OCTAGON),
    MISSILE_CRANE_LOADING_DEVICE("03", "Crane/Loading Device", LandEquipmentEntity.MISSILE_SUPPORT, IconType.FULL_OCTAGON),
    MISSILE_PROPELLANT_TRANSPORTER("04", "Propellant Transporter", LandEquipmentEntity.MISSILE_SUPPORT, IconType.FULL_OCTAGON),
    MISSILE_WARHEAD_TRANSPORTER("05", "Warhead Transporter", LandEquipmentEntity.MISSILE_SUPPORT, IconType.FULL_OCTAGON),
    ANTENNAE("01", "Antennae", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.FULL_OCTAGON),
    BOMB("02", "Bomb", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.FULL_OCTAGON),
    BOOBY_TRAP("03", "Booby Trap", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.FULL_OCTAGON),
    CBRN_EQUIPMENT("04", "CBRN Equipment", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.FULL_OCTAGON),
    COMPUTER_SYSTEM("05", "Computer System", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.FULL_OCTAGON),
    COMMAND_LAUNCH_EQUIPMENT_CLE("06", "Command Launch Equipment (CLE)", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.MAIN),
    GENERATOR_SET("07", "Generator Set", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.FULL_OCTAGON),
    GMD_GFC_CENTER("08", "Ground-based Midcourse Defense (GMD) Fire Control (GFC) Center", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.MAIN),
    IFICS_IDT("09", "In-Flight Interceptor Communications System (IFICS) Data Terminal (IDT)", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.MAIN),
    LASER("10", "Laser", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.FULL_OCTAGON),
    MILITARY_INFORMATION_SUPPORT_OPERATIONS_MISO("11", "Military Information Support Operations (MISO)", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.FULL_OCTAGON),
    SUSTAINMENT_SHIPMENTS("12", "Sustainment Shipments", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.MAIN),
    TENT("13", "Tent", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.FULL_OCTAGON),
    UNIT_DEPLOYMENT_SHIPMENTS("14", "Unit Deployment Shipments", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.MAIN),
    EMERGENCY_MEDICAL_OPERATION("15", "Emergency Medical Operation", LandEquipmentEntity.OTHER_EQUIPMENT, IconType.FULL_OCTAGON),
    LAND_MINE("01", "Land Mine", LandEquipmentEntity.LAND_MINES, IconType.FULL_OCTAGON),
    ANTIPERSONNEL_LAND_MINE_APL("02", "Antipersonnel Land Mine (APL)", LandEquipmentEntity.LAND_MINES, IconType.FULL_OCTAGON),
    ANTITANK_MINE("03", "Antitank Mine", LandEquipmentEntity.LAND_MINES, IconType.FULL_OCTAGON),
    IMPROVISED_EXPLOSIVES_DEVICE_IED("04", "Improvised Explosives Device (IED)", LandEquipmentEntity.LAND_MINES, IconType.FULL_OCTAGON),
    LESS_THAN_LETHAL("05", "Less than lethal", LandEquipmentEntity.LAND_MINES, IconType.FULL_OCTAGON),
    SENSOR("01", "Sensor", LandEquipmentEntity.SENSORS, IconType.MAIN),
    SENSOR_EMPLACED("02", "Sensor Emplaced", LandEquipmentEntity.SENSORS, IconType.FULL_OCTAGON),
    RADAR("03", "Radar", LandEquipmentEntity.SENSORS, IconType.FULL_OCTAGON),
    AMBULANCE("01", "Ambulance", LandEquipmentEntity.EMERGENCY_OPERATION, IconType.FULL_OCTAGON),
    FIRE_FIGHTING_FIRE_PROTECTION("02", "Fire Fighting/Fire Protection", LandEquipmentEntity.EMERGENCY_OPERATION, IconType.MAIN),
    HORSE_DRAWN_VEHICLE("01", "Horse-Drawn Vehicle", LandEquipmentEntity.HARNESS_VEHICLES, IconType.FULL_OCTAGON),
    OX_DRAWN_VEHICLE("02", "Ox-Drawn Vehicle", LandEquipmentEntity.HARNESS_VEHICLES, IconType.FULL_OCTAGON),
    DOG_DRAWN_VEHICLE("03", "Dog-Drawn Vehicle", LandEquipmentEntity.HARNESS_VEHICLES, IconType.FULL_OCTAGON),
    ANIMAL_DRAWN_VEHICLE("04", "Animal-Drawn Vehicle", LandEquipmentEntity.HARNESS_VEHICLES, IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final LandEquipmentEntity entity;
    private final IconType iconType;
    
    private LandEquipmentEntityType(String id, String label, LandEquipmentEntity entity, IconType iconType) {
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
        return LandEquipmentSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

}