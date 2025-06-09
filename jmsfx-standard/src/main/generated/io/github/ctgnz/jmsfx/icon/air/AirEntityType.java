package io.github.ctgnz.jmsfx.icon.air;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum AirEntityType implements IEntityType {
    FIXED_WING("01", "Fixed-Wing", AirEntity.MILITARY, GraphicType.MAIN),
    ROTARY_WING("02", "Rotary-Wing", AirEntity.MILITARY, GraphicType.MAIN),
    UAV("03", "Unmanned Aircraft (UA)/Unmanned Aerial Vehicle (UAV)/Unmanned Aircraft System (UAS)/Remote Piloted Vehicle (RPV)", AirEntity.MILITARY, GraphicType.MAIN),
    VT_UAV("04", "Vertical-Takeoff UAV (VT-UAV)", AirEntity.MILITARY, GraphicType.MAIN),
    LIGHTER_THAN_AIR("05", "Lighter Than Air", AirEntity.MILITARY, GraphicType.MAIN),
    AIRSHIP("06", "Airship", AirEntity.MILITARY, GraphicType.MAIN),
    TETHERED_LTA("07", "Tethered Lighter Than Air", AirEntity.MILITARY, GraphicType.MAIN),
    CIV_FIXED_WING("01", "Fixed Wing", AirEntity.CIVILIAN, GraphicType.MAIN),
    CIV_ROTARY_WING("02", "Rotary Wing", AirEntity.CIVILIAN, GraphicType.MAIN),
    CIV_UAV("03", "Unmanned Aircraft (UA) / Unmanned Aerial Vehicle (UAV) / Unmanned Aircraft System (UAS) / Remote Piloted Vehicle (RPV)", AirEntity.CIVILIAN, GraphicType.MAIN),
    CIV_LTA("04", "Lighter Than Air", AirEntity.CIVILIAN, GraphicType.MAIN),
    CIV_AIRSHIP("05", "Airship", AirEntity.CIVILIAN, GraphicType.MAIN),
    CIV_TETHERED_LTA("06", "Tethered Lighter than Air", AirEntity.CIVILIAN, GraphicType.MAIN),
    CIV_MEDEVAC("07", "Medical Evacuation (MEDEVAC)", AirEntity.CIVILIAN, GraphicType.MAIN),
    BOMB("01", "Bomb", AirEntity.WEAPON, GraphicType.MAIN),
    DECOY("02", "Decoy", AirEntity.WEAPON, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final AirEntity entity;
    private final GraphicType graphicType;

    AirEntityType(String id, String label, AirEntity entity, GraphicType graphicType) {
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
        return AirSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}