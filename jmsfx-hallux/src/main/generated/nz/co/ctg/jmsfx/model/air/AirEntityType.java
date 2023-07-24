package nz.co.ctg.jmsfx.model.air;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.IconType;

public enum AirEntityType implements EntityType {
    FIXED_WING("01", "Fixed-Wing", AirEntity.MILITARY, IconType.MAIN),
    ROTARY_WING("02", "Rotary-Wing", AirEntity.MILITARY, IconType.MAIN),
    UAV("03", "Unmanned Aircraft (UA)/Unmanned Aerial Vehicle (UAV)/Unmanned Aircraft System (UAS)/Remote Piloted Vehicle (RPV)", AirEntity.MILITARY, IconType.MAIN),
    VT_UAV("04", "Vertical-Takeoff UAV (VT-UAV)", AirEntity.MILITARY, IconType.MAIN),
    LIGHTER_THAN_AIR("05", "Lighter Than Air", AirEntity.MILITARY, IconType.MAIN),
    AIRSHIP("06", "Airship", AirEntity.MILITARY, IconType.MAIN),
    TETHERED_LTA("07", "Tethered Lighter Than Air", AirEntity.MILITARY, IconType.MAIN),
    CIV_FIXED_WING("01", "Fixed Wing", AirEntity.CIVILIAN, IconType.MAIN),
    CIV_ROTARY_WING("02", "Rotary Wing", AirEntity.CIVILIAN, IconType.MAIN),
    CIV_UAV("03", "Unmanned Aircraft (UA) / Unmanned Aerial Vehicle (UAV) / Unmanned Aircraft System (UAS) / Remote Piloted Vehicle (RPV)", AirEntity.CIVILIAN, IconType.MAIN),
    CIV_LTA("04", "Lighter Than Air", AirEntity.CIVILIAN, IconType.MAIN),
    CIV_AIRSHIP("05", "Airship", AirEntity.CIVILIAN, IconType.MAIN),
    CIV_TETHERED_LTA("06", "Tethered Lighter than Air", AirEntity.CIVILIAN, IconType.MAIN),
    BOMB("01", "Bomb", AirEntity.WEAPON, IconType.MAIN),
    DECOY("02", "Decoy", AirEntity.WEAPON, IconType.MAIN);

    private final String id;
    private final String label;
    private final AirEntity entity;
    private final IconType iconType;
    
    private AirEntityType(String id, String label, AirEntity entity, IconType iconType) {
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
        return AirSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

}