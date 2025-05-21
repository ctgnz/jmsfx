package nz.co.ctg.jmsfx.model.landinstallation;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.IconType;

public enum LandInstallationEntityType implements EntityType {
    AMMUNITION_EXPLOSIVES_ASSEMBLY("02", "Ammunition and Explosives/Assembly", LandInstallationEntity.INSTALLATION, IconType.FULL_OCTAGON),
    AMMUNITION_CACHE("03", "Ammunition Cache", LandInstallationEntity.INSTALLATION, IconType.FULL_FRAME),
    ARMAMENT_PRODUCTION("04", "Armament Production", LandInstallationEntity.INSTALLATION, IconType.FULL_OCTAGON),
    BLACK_LIST_LOCATION("05", "Black List Location", LandInstallationEntity.INSTALLATION, IconType.MAIN),
    CBRN("06", "Chemical-Biological-Radiological and Nuclear (CBRN)", LandInstallationEntity.INSTALLATION, IconType.MAIN),
    ENGINEERING_EQUIPMENT_PRODUCTION("07", "Engineering Equipment Production", LandInstallationEntity.INSTALLATION, IconType.FULL_OCTAGON),
    EQUIPMENT_MANUFACTURE("08", "Equipment Manufacture", LandInstallationEntity.INSTALLATION, IconType.FULL_OCTAGON),
    GOVERNMENT_LEADERSHIP("09", "Government Leadership", LandInstallationEntity.INSTALLATION, IconType.MAIN),
    GRAY_LIST_LOCATION("10", "Gray List Location", LandInstallationEntity.INSTALLATION, IconType.MAIN),
    MASS_GRAVE_SITE("11", "Mass Grave Site", LandInstallationEntity.INSTALLATION, IconType.MAIN),
    MATERIEL("12", "Materiel", LandInstallationEntity.INSTALLATION, IconType.FULL_FRAME),
    MINE("13", "Mine", LandInstallationEntity.INSTALLATION, IconType.MAIN),
    MISSILE_SPACE_SYSTEM_PRODUCTION("14", "Missile and Space System Production", LandInstallationEntity.INSTALLATION, IconType.FULL_OCTAGON),
    NUCLEAR_DEFENSE("15", "Nuclear (Non CBRN Defense)", LandInstallationEntity.INSTALLATION, IconType.MAIN),
    PRINTED_MEDIA("16", "Printed Media", LandInstallationEntity.INSTALLATION, IconType.MAIN),
    SAFE_HOUSE("17", "Safe House", LandInstallationEntity.INSTALLATION, IconType.MAIN),
    WHITE_LIST_LOCATION("18", "White List Location", LandInstallationEntity.INSTALLATION, IconType.MAIN),
    TENTED_CAMP("19", "Tented Camp", LandInstallationEntity.INSTALLATION, IconType.FULL_OCTAGON),
    WAREHOUSE_STORAGE_FACILITY("20", "Warehouse/Storage Facility", LandInstallationEntity.INSTALLATION, IconType.FULL_OCTAGON),
    LAW_ENFORCEMENT("21", "Law Enforcement", LandInstallationEntity.INSTALLATION, IconType.FULL_OCTAGON),
    EMERGENCY_OPERATION("22", "Emergency Operation", LandInstallationEntity.INSTALLATION, IconType.FULL_OCTAGON),
    HOUSE("23", "House", LandInstallationEntity.INSTALLATION, IconType.MAIN),
    AGRICULTURE_FOOD_INFRASTRUCTURE("01", "Agriculture and Food Infrastructure", LandInstallationEntity.INFRASTRUCTURE, IconType.FULL_OCTAGON),
    BANKING_INFRASTRUCTURE("02", "Banking, Finance, and Insurance Infrastructure", LandInstallationEntity.INFRASTRUCTURE, IconType.FULL_OCTAGON),
    COMMERCIAL_INFRASTRUCTURE("03", "Commercial Infrastructure", LandInstallationEntity.INFRASTRUCTURE, IconType.FULL_OCTAGON),
    EDUCATIONAL_FACILITIES_INFRASTRUCTURE("04", "Educational Facilities Infrastructure", LandInstallationEntity.INFRASTRUCTURE, IconType.FULL_OCTAGON),
    ENERGY_FACILITY_INFRASTRUCTURE("05", "Energy Facility Infrastructure", LandInstallationEntity.INFRASTRUCTURE, IconType.FULL_OCTAGON),
    MEDICAL_INFRASTRUCTURE("07", "Medical Infrastructure", LandInstallationEntity.INFRASTRUCTURE, IconType.NA),
    MILITARY_INFRASTRUCTURE("08", "Military Infrastructure", LandInstallationEntity.INFRASTRUCTURE, IconType.FULL_OCTAGON),
    POSTAL_SERVICES_INFRASTRUCTURE("09", "Postal Services Infrastructure", LandInstallationEntity.INFRASTRUCTURE, IconType.FULL_OCTAGON),
    PUBLIC_VENUES_INFRASTRUCTURE("10", "Public Venues Infrastructure", LandInstallationEntity.INFRASTRUCTURE, IconType.FULL_OCTAGON),
    TELECOMMUNICATIONS_INFRASTRUCTURE("12", "Telecommunications Infrastructure", LandInstallationEntity.INFRASTRUCTURE, IconType.FULL_OCTAGON),
    TRANSPORTATION_INFRASTRUCTURE("13", "Transportation Infrastructure", LandInstallationEntity.INFRASTRUCTURE, IconType.FULL_OCTAGON),
    WATER_SUPPLY_INFRASTRUCTURE("14", "Water Supply Infrastructure", LandInstallationEntity.INFRASTRUCTURE, IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final LandInstallationEntity entity;
    private final IconType iconType;
    
    private LandInstallationEntityType(String id, String label, LandInstallationEntity entity, IconType iconType) {
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
        return LandInstallationSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

}