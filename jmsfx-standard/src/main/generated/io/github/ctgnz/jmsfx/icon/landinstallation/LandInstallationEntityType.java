package io.github.ctgnz.jmsfx.icon.landinstallation;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum LandInstallationEntityType implements IEntityType {
    AMMUNITION_EXPLOSIVES_ASSEMBLY("02", "Ammunition and Explosives/Assembly", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON),
    AMMUNITION_CACHE("03", "Ammunition Cache", LandInstallationEntity.INSTALLATION, GraphicType.FULL_FRAME),
    ARMAMENT_PRODUCTION("04", "Armament Production", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON),
    BLACK_LIST_LOCATION("05", "Black List Location", LandInstallationEntity.INSTALLATION, GraphicType.MAIN),
    CBRN("06", "Chemical-Biological-Radiological and Nuclear (CBRN)", LandInstallationEntity.INSTALLATION, GraphicType.MAIN),
    ENGINEERING_EQUIPMENT_PRODUCTION("07", "Engineering Equipment Production", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON),
    EQUIPMENT_MANUFACTURE("08", "Equipment Manufacture", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON),
    GOVERNMENT_LEADERSHIP("09", "Government Leadership", LandInstallationEntity.INSTALLATION, GraphicType.MAIN),
    GRAY_LIST_LOCATION("10", "Gray List Location", LandInstallationEntity.INSTALLATION, GraphicType.MAIN),
    MASS_GRAVE_SITE("11", "Mass Grave Site", LandInstallationEntity.INSTALLATION, GraphicType.MAIN),
    MATERIEL("12", "Materiel", LandInstallationEntity.INSTALLATION, GraphicType.FULL_FRAME),
    MINE("13", "Mine", LandInstallationEntity.INSTALLATION, GraphicType.MAIN),
    MISSILE_SPACE_SYSTEM_PRODUCTION("14", "Missile and Space System Production", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON),
    NUCLEAR_DEFENSE("15", "Nuclear (Non CBRN Defense)", LandInstallationEntity.INSTALLATION, GraphicType.MAIN),
    PRINTED_MEDIA("16", "Printed Media", LandInstallationEntity.INSTALLATION, GraphicType.MAIN),
    SAFE_HOUSE("17", "Safe House", LandInstallationEntity.INSTALLATION, GraphicType.MAIN),
    WHITE_LIST_LOCATION("18", "White List Location", LandInstallationEntity.INSTALLATION, GraphicType.MAIN),
    TENTED_CAMP("19", "Tented Camp", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON),
    WAREHOUSE_STORAGE_FACILITY("20", "Warehouse/Storage Facility", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON),
    LAW_ENFORCEMENT("21", "Law Enforcement", LandInstallationEntity.INSTALLATION, GraphicType.NA),
    EMERGENCY_OPERATION("22", "Emergency Operation", LandInstallationEntity.INSTALLATION, GraphicType.FULL_OCTAGON),
    HOUSE("23", "House", LandInstallationEntity.INSTALLATION, GraphicType.MAIN),
    AGRICULTURE_FOOD_INFRASTRUCTURE("01", "Agriculture and Food Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON),
    BANKING_INFRASTRUCTURE("02", "Banking, Finance, and Insurance Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON),
    COMMERCIAL_INFRASTRUCTURE("03", "Commercial Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON),
    EDUCATIONAL_FACILITIES_INFRASTRUCTURE("04", "Educational Facilities Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON),
    ENERGY_FACILITY_INFRASTRUCTURE("05", "Energy Facility Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON),
    MEDICAL_INFRASTRUCTURE("07", "Medical Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.NA),
    MILITARY_INFRASTRUCTURE("08", "Military Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON),
    POSTAL_SERVICES_INFRASTRUCTURE("09", "Postal Services Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON),
    PUBLIC_VENUES_INFRASTRUCTURE("10", "Public Venues Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON),
    TELECOMMUNICATIONS_INFRASTRUCTURE("12", "Telecommunications Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON),
    TRANSPORTATION_INFRASTRUCTURE("13", "Transportation Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON),
    WATER_SUPPLY_INFRASTRUCTURE("14", "Water Supply Infrastructure", LandInstallationEntity.INFRASTRUCTURE, GraphicType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final LandInstallationEntity entity;
    private final GraphicType graphicType;

    LandInstallationEntityType(String id, String label, LandInstallationEntity entity, GraphicType graphicType) {
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
        return LandInstallationSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}