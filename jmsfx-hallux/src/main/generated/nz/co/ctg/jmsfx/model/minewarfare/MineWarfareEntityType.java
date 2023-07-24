package nz.co.ctg.jmsfx.model.minewarfare;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.IconType;

public enum MineWarfareEntityType implements EntityType {
    SEA_MINE_BOTTOM("01", "Sea Mine-Bottom", MineWarfareEntity.SEA_MINE_GENERAL, IconType.FULL_OCTAGON),
    SEA_MINE_MOORED("02", "Sea Mine-Moored", MineWarfareEntity.SEA_MINE_GENERAL, IconType.FULL_OCTAGON),
    SEA_MINE_FLOATING("03", "Sea Mine-Floating", MineWarfareEntity.SEA_MINE_GENERAL, IconType.FULL_OCTAGON),
    SEA_MINE_RISING("04", "Sea Mine-Rising", MineWarfareEntity.SEA_MINE_GENERAL, IconType.FULL_OCTAGON),
    SEA_MINE_OTHER_POSITION("05", "Sea Mine-Other Position", MineWarfareEntity.SEA_MINE_GENERAL, IconType.FULL_OCTAGON),
    KINGFISHER("06", "Kingfisher", MineWarfareEntity.SEA_MINE_GENERAL, IconType.NA),
    SMALL_OBJECT_MINE_LIKE("07", "Small Object-Mine-Like", MineWarfareEntity.SEA_MINE_GENERAL, IconType.NA),
    EXERCISE_MINE_GENERAL("08", "Exercise Mine-General", MineWarfareEntity.SEA_MINE_GENERAL, IconType.FULL_OCTAGON),
    NEUTRALIZED_MINE_GENERAL("09", "Neutralized Mine-General", MineWarfareEntity.SEA_MINE_GENERAL, IconType.FULL_OCTAGON),
    SEA_MINE_DECOY_BOTTOM("01", "Sea Mine Decoy-Bottom", MineWarfareEntity.SEA_MINE_DECOY, IconType.FULL_OCTAGON),
    SEA_MINE_DECOY_MOORED("02", "Sea Mine Decoy-Moored", MineWarfareEntity.SEA_MINE_DECOY, IconType.FULL_OCTAGON),
    MILCO_GENERAL("01", "MILCO - General", MineWarfareEntity.MINE_LIKE_CONTACT_MILCO, IconType.FULL_OCTAGON),
    MILCO_BOTTOM("02", "MILCO - Bottom", MineWarfareEntity.MINE_LIKE_CONTACT_MILCO, IconType.FULL_OCTAGON),
    MILCO_MOORED("03", "MILCO - Moored", MineWarfareEntity.MINE_LIKE_CONTACT_MILCO, IconType.FULL_OCTAGON),
    MILCO_FLOATING("04", "MILCO - Floating", MineWarfareEntity.MINE_LIKE_CONTACT_MILCO, IconType.FULL_OCTAGON),
    MINE_LIKE_ECHO_BOTTOM("01", "Mine-Like Echo-Bottom", MineWarfareEntity.MINE_LIKE_ECHO_MILEC_GENERAL, IconType.FULL_OCTAGON),
    MINE_LIKE_ECHO_MOORED("02", "Mine-Like Echo-Moored", MineWarfareEntity.MINE_LIKE_ECHO_MILEC_GENERAL, IconType.FULL_OCTAGON),
    MINE_LIKE_ECHO_FLOATING("03", "Mine-Like Echo-Floating", MineWarfareEntity.MINE_LIKE_ECHO_MILEC_GENERAL, IconType.FULL_OCTAGON),
    NEGATIVE_REACQUISITION_BOTTOM("01", "Negative Reacquisition-Bottom", MineWarfareEntity.NEGATIVE_REACQUISITION_GENERAL, IconType.FULL_OCTAGON),
    NEGATIVE_REACQUISITION_MOORED("02", "Negative Reacquisition-Moored", MineWarfareEntity.NEGATIVE_REACQUISITION_GENERAL, IconType.FULL_OCTAGON),
    NEGATIVE_REACQUISITION_FLOATING("03", "Negative Reacquisition-Floating", MineWarfareEntity.NEGATIVE_REACQUISITION_GENERAL, IconType.FULL_OCTAGON),
    NEUTRALIZED_OBSTRUCTOR("01", "Neutralized Obstructor", MineWarfareEntity.OBSTRUCTOR, IconType.FULL_OCTAGON),
    NON_MINE_MINE_LIKE_BOTTOM("01", "Non-Mine Mine-Like Object-Bottom", MineWarfareEntity.NON_MINE_MINE_LIKE_NMLO_GENERAL, IconType.FULL_OCTAGON),
    NON_MINE_MINE_LIKE_MOORED("02", "Non-Mine Mine-Like Object-Moored", MineWarfareEntity.NON_MINE_MINE_LIKE_NMLO_GENERAL, IconType.FULL_OCTAGON),
    NON_MINE_MINE_LIKE_FLOATING("03", "Non-Mine Mine-Like Object-Floating", MineWarfareEntity.NON_MINE_MINE_LIKE_NMLO_GENERAL, IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final MineWarfareEntity entity;
    private final IconType iconType;
    
    private MineWarfareEntityType(String id, String label, MineWarfareEntity entity, IconType iconType) {
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
        return MineWarfareSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

}