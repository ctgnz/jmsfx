package io.github.ctgnz.jmsfx.icon.landequipment;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum LandEquipmentEntity implements Entity {
    WEAPON_SYSTEM("11", "Weapon/Weapon System", GraphicType.FULL_OCTAGON),
    VEHICLE("12", "Vehicle", GraphicType.FULL_OCTAGON),
    ENGINEER_VEHICLES_EQUIPMENT("13", "Engineer Vehicles and Equipment", GraphicType.FULL_OCTAGON),
    UTILITY_VEHICLES("14", "Utility Vehicles", GraphicType.NA),
    TRAIN("15", "Train", GraphicType.NA),
    CIVILIAN_VEHICLE("16", "Civilian Vehicle", GraphicType.NA),
    LAW_ENFORCEMENT("17", "Law Enforcement", GraphicType.FULL_OCTAGON),
    PACK_ANIMALS("18", "Pack Animals", GraphicType.FULL_OCTAGON),
    MISSILE_SUPPORT("19", "Missile Support", GraphicType.FULL_OCTAGON),
    OTHER_EQUIPMENT("20", "Other Equipment", GraphicType.NA),
    LAND_MINES("21", "Land Mines", GraphicType.NA),
    SENSORS("22", "Sensors", GraphicType.NA),
    EMERGENCY_OPERATION("23", "Emergency Operation", GraphicType.FULL_OCTAGON),
    MANUAL_TRACK("24", "Manual Track", GraphicType.FULL_OCTAGON),
    ROTARY_WING("25", "Rotary Wing", GraphicType.MAIN_1);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    LandEquipmentEntity(String id, String label, GraphicType graphicType) {
        this.id = id;
        this.label = label;
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
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.LAND_EQUIPMENT;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return LandEquipmentSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}