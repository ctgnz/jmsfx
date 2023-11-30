package nz.co.ctg.jmsfx.model.landequipment;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum LandEquipmentEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    WEAPON_SYSTEM("11", "Weapon/Weapon System", IconType.FULL_OCTAGON),
    VEHICLE("12", "Vehicle", IconType.FULL_OCTAGON),
    ENGINEER_VEHICLES_EQUIPMENT("13", "Engineer Vehicles and Equipment", IconType.FULL_OCTAGON),
    UTILITY_VEHICLES("14", "Utility Vehicles", IconType.NA),
    TRAIN("15", "Train", IconType.NA),
    CIVILIAN_VEHICLE("16", "Civilian Vehicle", IconType.NA),
    LAW_ENFORCEMENT("17", "Law Enforcement", IconType.FULL_OCTAGON),
    WORKING_ANIMALS("18", "Working Animals", IconType.FULL_OCTAGON),
    MISSILE_SUPPORT("19", "Missile Support", IconType.FULL_OCTAGON),
    OTHER_EQUIPMENT("20", "Other Equipment", IconType.NA),
    LAND_MINES("21", "Land Mines", IconType.NA),
    SENSORS("22", "Sensors", IconType.NA),
    EMERGENCY_OPERATION("23", "Emergency Operation", IconType.FULL_OCTAGON),
    MANUAL_TRACK("24", "Manual Track", IconType.FULL_OCTAGON),
    HARNESS_VEHICLES("25", "Harness Vehicles", IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private LandEquipmentEntity(String id, String label, IconType iconType) {
        this.id = id;
        this.label = label;
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
    public SymbolSet getSymbolSet() {
        return SymbolSet.SS_LAND_EQUIPMENT;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return LandEquipmentSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}