package nz.co.ctg.jmsfx.model.landinstallation;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum LandInstallationEntitySubType implements EntitySubType {
    BRIDGE("01", "Bridge", LandInstallationEntityType.ENGINEERING_EQUIPMENT_PRODUCTION, IconType.MAIN),
    DISPLACED_PERSONS_CAMP("01", "Displaced Persons / Refugee / Evacuees Camp", LandInstallationEntityType.TENTED_CAMP, IconType.FULL_OCTAGON),
    TRAINING_CAMP("02", "Training Camp", LandInstallationEntityType.TENTED_CAMP, IconType.FULL_OCTAGON),
    GRENADE_CACHE("01", "Grenade Cache", LandInstallationEntityType.WAREHOUSE_STORAGE_FACILITY, IconType.MAIN),
    BUREAU_ATF("01", "Bureau of Alcohol-Tobacco-Firearms and Explosives (ATF) (Department of Justice)", LandInstallationEntityType.LAW_ENFORCEMENT, IconType.MAIN),
    DRUG_ENFORCEMENT_ADMINISTRATION_DEA("04", "Drug Enforcement Administration (DEA)", LandInstallationEntityType.LAW_ENFORCEMENT, IconType.MAIN),
    FEDERAL_BUREAU_INVESTIGATION_FBI("06", "Federal Bureau of Investigation (FBI)", LandInstallationEntityType.LAW_ENFORCEMENT, IconType.MAIN),
    POLICE("07", "Police", LandInstallationEntityType.LAW_ENFORCEMENT, IconType.MAIN),
    UNITED_STATES_SECRET_SERVICE_USSS("09", "United States Secret Service (USSS)", LandInstallationEntityType.LAW_ENFORCEMENT, IconType.MAIN),
    TRANSPORTATION_SECURITY_ADMINISTRATION_TSA("10", "Transportation Security Administration (TSA)", LandInstallationEntityType.LAW_ENFORCEMENT, IconType.MAIN),
    COAST_GUARD("11", "Coast Guard", LandInstallationEntityType.LAW_ENFORCEMENT, IconType.FULL_OCTAGON),
    FIRE_STATION("01", "Fire Station", LandInstallationEntityType.EMERGENCY_OPERATION, IconType.FULL_OCTAGON),
    EMERGENCY_MEDICAL_OPERATION("02", "Emergency Medical Operation", LandInstallationEntityType.EMERGENCY_OPERATION, IconType.FULL_OCTAGON),
    COMMERCIAL_FOOD_DISTRIBUTION("03", "Commercial Food Distribution Center", LandInstallationEntityType.AGRICULTURE_FOOD_INFRASTRUCTURE, IconType.FULL_FRAME),
    FOOD_DISTRIBUTION("05", "Food Distribution", LandInstallationEntityType.AGRICULTURE_FOOD_INFRASTRUCTURE, IconType.FULL_FRAME),
    FOOD_PRODUCTION_CENTER("06", "Food Production Center", LandInstallationEntityType.AGRICULTURE_FOOD_INFRASTRUCTURE, IconType.FULL_FRAME),
    FOOD_RETAIL("07", "Food Retail", LandInstallationEntityType.AGRICULTURE_FOOD_INFRASTRUCTURE, IconType.FULL_FRAME),
    ECONOMIC_INFRASTRUCTURE_ASSET("04", "Economic Infrastructure Asset", LandInstallationEntityType.BANKING_INFRASTRUCTURE, IconType.MAIN),
    FINANCIAL_SERVICES_OTHER("07", "Financial Services-Other", LandInstallationEntityType.BANKING_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    HAZARDOUS_MATERIAL_STORAGE("05", "Hazardous Material Storage", LandInstallationEntityType.COMMERCIAL_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    INDUSTRIAL_SITE("06", "Industrial Site", LandInstallationEntityType.COMMERCIAL_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    PHARMACEUTICAL_MANUFACTURER("08", "Pharmaceutical Manufacturer", LandInstallationEntityType.COMMERCIAL_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    COLLEGE_UNIVERSITY("01", "College/University", LandInstallationEntityType.EDUCATIONAL_FACILITIES_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    SCHOOL("02", "School", LandInstallationEntityType.EDUCATIONAL_FACILITIES_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    ELECTRIC_POWER("01", "Electric Power", LandInstallationEntityType.ENERGY_FACILITY_INFRASTRUCTURE, IconType.MAIN),
    GENERATION_STATION("02", "Generation Station", LandInstallationEntityType.ENERGY_FACILITY_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    NATURAL_GAS_FACILITY("03", "Natural Gas Facility", LandInstallationEntityType.ENERGY_FACILITY_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    PETROLEUM_GAS_OIL("05", "Petroleum/Gas/Oil", LandInstallationEntityType.ENERGY_FACILITY_INFRASTRUCTURE, IconType.MAIN),
    MEDICAL("01", "Medical", LandInstallationEntityType.MEDICAL_INFRASTRUCTURE, IconType.FULL_FRAME),
    MTF_HOSPITAL("02", "Medical Treatment Facility (Hospital)", LandInstallationEntityType.MEDICAL_INFRASTRUCTURE, IconType.FULL_FRAME),
    MILITARY_ARMORY("01", "Military Armory", LandInstallationEntityType.MILITARY_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    MILITARY_BASE("02", "Military Base", LandInstallationEntityType.MILITARY_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    POSTAL_DISTRIBUTION_CENTER("01", "Postal Distribution Center", LandInstallationEntityType.POSTAL_SERVICES_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    POST_OFFICE("02", "Post Office", LandInstallationEntityType.POSTAL_SERVICES_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    RELIGIOUS_INSTITUTION("04", "Religious Institution", LandInstallationEntityType.PUBLIC_VENUES_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    BROADCAST_TRANSMITTER_ANTENNAE("01", "Broadcast Transmitter Antennae", LandInstallationEntityType.TELECOMMUNICATIONS_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    TELECOMMUNICATIONS("02", "Telecommunications", LandInstallationEntityType.TELECOMMUNICATIONS_INFRASTRUCTURE, IconType.MAIN),
    TELECOMMUNICATIONS_TOWER("03", "Telecommunications Tower", LandInstallationEntityType.TELECOMMUNICATIONS_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    AIR_TERMINAL("01", "Air Terminal", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, IconType.MAIN_1),
    ATC_FACILITY("02", "Air Traffic Control Facility", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    FERRY_TERMINAL("04", "Ferry Terminal", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    HELICOPTER_LANDING_SITE("05", "Helicopter Landing Site", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    MAINTENANCE_FACILITY("06", "Maintenance Facility", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    RAILHEAD_RAILROAD_STATION("07", "Railhead/Railroad Station", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, IconType.MAIN_1),
    SEA_TERMINAL("09", "Sea Terminal", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, IconType.MAIN_1),
    SHIP_YARD("10", "Ship Yard", LandInstallationEntityType.TRANSPORTATION_INFRASTRUCTURE, IconType.MAIN_1),
    GROUND_WATER_WELL("04", "Ground Water Well", LandInstallationEntityType.WATER_SUPPLY_INFRASTRUCTURE, IconType.FULL_OCTAGON),
    WATER("10", "Water", LandInstallationEntityType.WATER_SUPPLY_INFRASTRUCTURE, IconType.MAIN),
    WATER_TREATMENT("11", "Water Treatment", LandInstallationEntityType.WATER_SUPPLY_INFRASTRUCTURE, IconType.MAIN);

    private final String id;
    private final String label;
    private final LandInstallationEntityType entityType;
    private final IconType iconType;
    
    private LandInstallationEntitySubType(String id, String label, LandInstallationEntityType entityType, IconType iconType) {
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