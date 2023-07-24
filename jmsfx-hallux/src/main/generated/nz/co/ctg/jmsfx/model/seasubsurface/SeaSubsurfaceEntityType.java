package nz.co.ctg.jmsfx.model.seasubsurface;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.IconType;

public enum SeaSubsurfaceEntityType implements EntityType {
    SUBMARINE("01", "Submarine", SeaSubsurfaceEntity.MILITARY, IconType.MAIN),
    OTHER_SUBMERSIBLE("02", "Other Submersible", SeaSubsurfaceEntity.MILITARY, IconType.MAIN),
    NONSUBMARINE("03", "Nonsubmarine", SeaSubsurfaceEntity.MILITARY, IconType.FULL_OCTAGON),
    AUV_UUV("04", "Autonomous Underwater Vehicle (AUV)/Unmanned Underwater Vehicle (UUV)", SeaSubsurfaceEntity.MILITARY, IconType.MAIN),
    DIVER("05", "Diver", SeaSubsurfaceEntity.MILITARY, IconType.MAIN),
    SUBMERSIBLE_CIV("01", "Submersible", SeaSubsurfaceEntity.CIVILIAN, IconType.MAIN),
    AUV_UUV_CIV("02", "Autonomous Underwater Vehicle (AUV)/ Underwater Vehicle (UUV)", SeaSubsurfaceEntity.CIVILIAN, IconType.FULL_OCTAGON),
    DIVER_CIV("03", "Diver", SeaSubsurfaceEntity.CIVILIAN, IconType.MAIN),
    TORPEDO("01", "Torpedo", SeaSubsurfaceEntity.WEAPON, IconType.MAIN),
    IMPROVISED_EXPLOSIVE_DEVICE_IED("02", "Improvised Explosive Device (IED)", SeaSubsurfaceEntity.WEAPON, IconType.MAIN),
    DECOY("03", "Decoy", SeaSubsurfaceEntity.WEAPON, IconType.MAIN);

    private final String id;
    private final String label;
    private final SeaSubsurfaceEntity entity;
    private final IconType iconType;
    
    private SeaSubsurfaceEntityType(String id, String label, SeaSubsurfaceEntity entity, IconType iconType) {
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
        return SeaSubsurfaceSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

}