package io.github.ctgnz.jmsfx.icon.landequipment;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.icon.GraphicType;

public enum LandEquipmentEntityType implements IEntityType {
    RIFLE("01", "Rifle", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    MACHINE_GUN("02", "Machine Gun", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    GRENADE_LAUNCHER("03", "Grenade Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    FLAME_THROWER("04", "Flame Thrower", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    AIR_DEFENSE_GUN("05", "Air Defense Gun", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    ANTITANK_GUN("06", "Antitank Gun", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    DIRECT_FIRE_GUN("07", "Direct Fire Gun", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    RECOILLESS_GUN("08", "Recoilless Gun", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    HOWITZER("09", "Howitzer", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    MISSILE_LAUNCHER("10", "Missile Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    AIR_DEFENSE_MISSILE_LAUNCHER("11", "Air Defense Missile Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    ANTITANK_MISSILE_LAUNCHER("12", "Antitank Missile Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    SURFACE_TO_SURFACE_MISSILE_LAUNCHER("13", "Surface-to-Surface Missile Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    MORTAR("14", "Mortar", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    SINGLE_ROCKET_LAUNCHER("15", "Single Rocket Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    MULTIPLE_ROCKET_LAUNCHER("16", "Multiple Rocket Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    ANTITANK_ROCKET_LAUNCHER("17", "Antitank Rocket Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    NONLETHAL_WEAPON("18", "Nonlethal Weapon", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    TASER("19", "Taser", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    WATER_CANNON("20", "Water Cannon", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON),
    VEHICLE_ARMOURED("01", "Armoured Vehicle", LandEquipmentEntity.VEHICLE, GraphicType.FULL_OCTAGON),
    TANK("02", "Tank", LandEquipmentEntity.VEHICLE, GraphicType.FULL_OCTAGON),
    BRIDGE("01", "Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    FIXED_BRIDGE("03", "Fixed Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    FLOATING_BRIDGE("04", "Floating Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    FOLDING_GIRDER_BRIDGE("05", "Folding Girder Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    HOLLOW_DECK_BRIDGE("06", "Hollow Deck Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    DRILL("07", "Drill", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    EARTHMOVER("08", "Earthmover", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    MINE_CLEARING_EQUIPMENT("09", "Mine Clearing Equipment", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    MINE_LAYING_EQUIPMENT("10", "Mine Laying Equipment", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    DOZER("11", "Dozer", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    ARMOURED_ASSAULT("12", "Armoured Assault", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    ARMOURED_ENGINEER_RECON_VEHICLE_AERV("13", "Armoured Engineer Recon Vehicle (AERV)", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    BACKHOE("14", "Backhoe", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    CONSTRUCTION_VEHICLE("15", "Construction Vehicle", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    FERRY_TRANSPORTER("16", "Ferry Transporter", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON),
    UTILITY_VEHICLE("01", "Utility Vehicle", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON),
    UTILITY_VEHICLE_MEDICAL("02", "Medical", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON),
    UTILITY_VEHICLE_MOBILE_EMERGENCY_PHYSICIAN("04", "Mobile Emergency Physician", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON),
    BUS("05", "Bus", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON),
    SEMI_TRAILER_AND_TRUCK("06", "Semi-Trailer and Truck", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON),
    LIMITED_CROSS_COUNTRY_TRUCK("07", "Limited Cross Country Truck", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON),
    CROSS_COUNTRY_TRUCK("08", "Cross Country Truck", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON),
    POL_VEHICLE("09", "Petroleum-Oil and Lubricant", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON),
    WATER_VEHICLE("10", "Water", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON),
    AMPHIBIOUS_UTILITY_WHEELED_VEHICLE("11", "Amphibious Utility Wheeled Vehicle", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON),
    TOW_TRUCK("12", "Tow Truck", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON),
    LOCOMOTIVE("01", "Locomotive", LandEquipmentEntity.TRAIN, GraphicType.FULL_OCTAGON),
    AUTO_UTILITY_VEHICLE("04", "Utility Vehicle", LandEquipmentEntity.CIVILIAN_VEHICLE, GraphicType.FULL_OCTAGON),
    KNOWN_INSURGENT_VEHICLE("08", "Known Insurgent Vehicle", LandEquipmentEntity.CIVILIAN_VEHICLE, GraphicType.MAIN),
    DRUG_VEHICLE("09", "Drug Vehicle", LandEquipmentEntity.CIVILIAN_VEHICLE, GraphicType.MAIN),
    BUREAU_ALCOHOL_TOBACCO_FIREARMS_EXPLOSIVES_ATF("01", "Bureau of Alcohol-Tobacco-Firearms and Explosives (ATF) (Department of Justice)", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.MAIN),
    DRUG_ENFORCEMENT_ADMINISTRATION_DEA("04", "Drug Enforcement Administration (DEA)", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.MAIN),
    FEDERAL_BUREAU_INVESTIGATION_FBI("06", "Federal Bureau of Investigation (FBI)", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.MAIN),
    POLICE("07", "Police", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.MAIN),
    UNITED_STATES_SECRET_SERVICE_USSS("08", "United States Secret Service (USSS)", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.MAIN),
    TRANSPORTATION_SECURITY_ADMINISTRATION_TSA("09", "Transportation Security Administration (TSA)", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.MAIN),
    COAST_GUARD("10", "Coast Guard", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.FULL_OCTAGON),
    MISSILE_TRANSLOADER("01", "Transloader", LandEquipmentEntity.MISSILE_SUPPORT, GraphicType.FULL_OCTAGON),
    MISSILE_TRANSPORTER("02", "Transporter", LandEquipmentEntity.MISSILE_SUPPORT, GraphicType.FULL_OCTAGON),
    MISSILE_CRANE_LOADING_DEVICE("03", "Crane/Loading Device", LandEquipmentEntity.MISSILE_SUPPORT, GraphicType.FULL_OCTAGON),
    MISSILE_PROPELLANT_TRANSPORTER("04", "Propellant Transporter", LandEquipmentEntity.MISSILE_SUPPORT, GraphicType.FULL_OCTAGON),
    MISSILE_WARHEAD_TRANSPORTER("05", "Warhead Transporter", LandEquipmentEntity.MISSILE_SUPPORT, GraphicType.FULL_OCTAGON),
    ANTENNAE("01", "Antennae", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON),
    BOMB("02", "Bomb", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON),
    BOOBY_TRAP("03", "Booby Trap", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON),
    CBRN_EQUIPMENT("04", "CBRN Equipment", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON),
    COMPUTER_SYSTEM("05", "Computer System", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON),
    COMMAND_LAUNCH_EQUIPMENT_CLE("06", "Command Launch Equipment (CLE)", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.MAIN),
    GENERATOR_SET("07", "Generator Set", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON),
    GMD_GFC_CENTER("08", "Ground-based Midcourse Defense (GMD) Fire Control (GFC) Center", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.MAIN),
    IFICS_IDT("09", "In-Flight Interceptor Communications System (IFICS) Data Terminal (IDT)", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.MAIN),
    LASER("10", "Laser", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON),
    PSYCHOLOGICAL_OPERATIONS("11", "Psychological Operations (PSYOPS)", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON),
    SUSTAINMENT_SHIPMENTS("12", "Sustainment Shipments", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.MAIN),
    TENT("13", "Tent", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.NA),
    UNIT_DEPLOYMENT_SHIPMENTS("14", "Unit Deployment Shipments", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.MAIN),
    EMERGENCY_MEDICAL_OPERATION("15", "Emergency Medical Operation", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON),
    LAND_MINE("01", "Land Mine", LandEquipmentEntity.LAND_MINES, GraphicType.FULL_OCTAGON),
    ANTIPERSONNEL_LAND_MINE_APL("02", "Antipersonnel Land Mine (APL)", LandEquipmentEntity.LAND_MINES, GraphicType.FULL_OCTAGON),
    ANTITANK_MINE("03", "Antitank Mine", LandEquipmentEntity.LAND_MINES, GraphicType.FULL_OCTAGON),
    IMPROVISED_EXPLOSIVES_DEVICE_IED("04", "Improvised Explosives Device (IED)", LandEquipmentEntity.LAND_MINES, GraphicType.FULL_OCTAGON),
    LESS_THAN_LETHAL("05", "Less than lethal", LandEquipmentEntity.LAND_MINES, GraphicType.FULL_OCTAGON),
    SENSOR("01", "Sensor", LandEquipmentEntity.SENSORS, GraphicType.MAIN),
    SENSOR_EMPLACED("02", "Sensor Emplaced", LandEquipmentEntity.SENSORS, GraphicType.FULL_OCTAGON),
    RADAR("03", "Radar", LandEquipmentEntity.SENSORS, GraphicType.FULL_OCTAGON),
    FIRE_FIGHTING_FIRE_PROTECTION("02", "Fire Fighting/Fire Protection", LandEquipmentEntity.EMERGENCY_OPERATION, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final LandEquipmentEntity entity;
    private final GraphicType graphicType;

    LandEquipmentEntityType(String id, String label, LandEquipmentEntity entity, GraphicType graphicType) {
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
    public IEntity getEntity() {
        return entity;
    }

    @Override
    public List<IEntitySubType> getEntitySubTypes() {
        return LandEquipmentSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }

}