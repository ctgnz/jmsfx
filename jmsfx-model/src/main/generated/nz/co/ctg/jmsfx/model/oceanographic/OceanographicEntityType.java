package nz.co.ctg.jmsfx.model.oceanographic;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.IconType;

public enum OceanographicEntityType implements EntityType {
    ICEBERGS("01", "Icebergs", OceanographicEntity.ICE_SYSTEMS, IconType.NA),
    ICE_CONCENTRATION("02", "Ice Concentration", OceanographicEntity.ICE_SYSTEMS, IconType.NA),
    DYNAMIC_PROCESSES("03", "Dynamic Processes", OceanographicEntity.ICE_SYSTEMS, IconType.NA),
    SEA_ICE("04", "Sea Ice", OceanographicEntity.ICE_SYSTEMS, IconType.MAIN),
    ICE_LIMITS("05", "Limits", OceanographicEntity.ICE_SYSTEMS, IconType.NA),
    OPENINGS_IN_THE_ICE("06", "Openings in the Ice", OceanographicEntity.ICE_SYSTEMS, IconType.NA),
    SNOW_COVER("07", "Snow Cover", OceanographicEntity.ICE_SYSTEMS, IconType.MAIN),
    TOPOGRAPHICAL_FEATURES("08", "Topographical Features", OceanographicEntity.ICE_SYSTEMS, IconType.NA),
    DEPTH("01", "Depth", OceanographicEntity.HYDROGRAPHY, IconType.NA),
    COASTAL_HYDROGRAPHY("02", "Coastal Hydrography", OceanographicEntity.HYDROGRAPHY, IconType.NA),
    PORTS_HARBORS("03", "Ports and Harbors", OceanographicEntity.HYDROGRAPHY, IconType.NA),
    AIDS_NAVIGATION("04", "Aids to Navigation", OceanographicEntity.HYDROGRAPHY, IconType.NA),
    DANGERS_HAZARDS("05", "Dangers/Hazards", OceanographicEntity.HYDROGRAPHY, IconType.NA),
    BOTTOM_FEATURES("06", "Bottom Features", OceanographicEntity.HYDROGRAPHY, IconType.NA),
    TIDE_AND_CURRENT("07", "Tide and Current", OceanographicEntity.HYDROGRAPHY, IconType.NA),
    BIOLUMINESCENCE("01", "Bioluminescence", OceanographicEntity.OCEANOGRAPHY, IconType.NA),
    BEACH_SLOPE("02", "Beach Slope", OceanographicEntity.OCEANOGRAPHY, IconType.NA),
    MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS("01", "Mine Warfare (MIW) Bottom Descriptors", OceanographicEntity.GEOPHYSICS_ACOUSTICS, IconType.NA),
    MARITIME_LIMIT_BOUNDARY("01", "Maritime Limit Boundary", OceanographicEntity.MARITIME_LIMITS, IconType.MAIN),
    MARITIME_AREA("02", "Maritime Area", OceanographicEntity.MARITIME_LIMITS, IconType.MAIN),
    RESTRICTED_AREA("03", "Restricted Area", OceanographicEntity.MARITIME_LIMITS, IconType.MAIN),
    SWEPT_AREA("04", "Swept Area", OceanographicEntity.MARITIME_LIMITS, IconType.MAIN),
    TRAINING_AREA("05", "Training Area", OceanographicEntity.MARITIME_LIMITS, IconType.MAIN),
    LIMITS_OPERATOR_DEFINED("06", "Operator-Defined", OceanographicEntity.MARITIME_LIMITS, IconType.MAIN),
    SUBMARINE_CABLE("01", "Submarine Cable", OceanographicEntity.MAN_MADE_STRUCTURES, IconType.MAIN),
    SUBMERGED_CRIB("02", "Submerged Crib", OceanographicEntity.MAN_MADE_STRUCTURES, IconType.MAIN),
    CANAL("03", "Canal", OceanographicEntity.MAN_MADE_STRUCTURES, IconType.MAIN),
    FORD("04", "Ford", OceanographicEntity.MAN_MADE_STRUCTURES, IconType.MAIN),
    LOCK("05", "Lock", OceanographicEntity.MAN_MADE_STRUCTURES, IconType.MAIN),
    OIL_GAS_RIG("06", "Oil/Gas Rig", OceanographicEntity.MAN_MADE_STRUCTURES, IconType.MAIN),
    OIL_GAS_RIG_FIELD("07", "Oil/Gas Rig Field", OceanographicEntity.MAN_MADE_STRUCTURES, IconType.MAIN),
    PIPELINES_PIPE("08", "Pipelines/Pipe", OceanographicEntity.MAN_MADE_STRUCTURES, IconType.MAIN),
    PILE_PILING_POST("09", "Pile/Piling/Post", OceanographicEntity.MAN_MADE_STRUCTURES, IconType.MAIN);

    private final String id;
    private final String label;
    private final OceanographicEntity entity;
    private final IconType iconType;
    
    private OceanographicEntityType(String id, String label, OceanographicEntity entity, IconType iconType) {
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
        return OceanographicSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

}