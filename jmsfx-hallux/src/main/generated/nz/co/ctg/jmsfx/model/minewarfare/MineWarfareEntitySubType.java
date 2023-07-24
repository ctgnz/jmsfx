package nz.co.ctg.jmsfx.model.minewarfare;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum MineWarfareEntitySubType implements EntitySubType {
    EXERCISE_MINE_BOTTOM("01", "Exercise Mine-Bottom", MineWarfareEntityType.EXERCISE_MINE_GENERAL, IconType.FULL_OCTAGON),
    EXERCISE_MINE_MOORED("02", "Exercise Mine-Moored", MineWarfareEntityType.EXERCISE_MINE_GENERAL, IconType.FULL_OCTAGON),
    EXERCISE_MINE_FLOATING("03", "Exercise Mine-Floating", MineWarfareEntityType.EXERCISE_MINE_GENERAL, IconType.FULL_OCTAGON),
    EXERCISE_MINE_RISING("04", "Exercise Mine-Rising", MineWarfareEntityType.EXERCISE_MINE_GENERAL, IconType.FULL_OCTAGON),
    NEUTRALIZED_MINE_BOTTOM("01", "Neutralized Mine-Bottom", MineWarfareEntityType.NEUTRALIZED_MINE_GENERAL, IconType.FULL_OCTAGON),
    NEUTRALIZED_MINE_MOORED("02", "Neutralized Mine-Moored", MineWarfareEntityType.NEUTRALIZED_MINE_GENERAL, IconType.FULL_OCTAGON),
    NEUTRALIZED_MINE_FLOATING("03", "Neutralized Mine-Floating", MineWarfareEntityType.NEUTRALIZED_MINE_GENERAL, IconType.FULL_OCTAGON),
    NEUTRALIZED_MINE_RISING("04", "Neutralized Mine-Rising", MineWarfareEntityType.NEUTRALIZED_MINE_GENERAL, IconType.FULL_OCTAGON),
    NEUTRALIZED_MINE_OTHER_POSITION("05", "Neutralized Mine-Other Position", MineWarfareEntityType.NEUTRALIZED_MINE_GENERAL, IconType.FULL_OCTAGON),
    MILCO_GENERAL_CONFIDENCE_LEVEL_1("01", "MILCO - General-Confidence-Level 1", MineWarfareEntityType.MILCO_GENERAL, IconType.FULL_OCTAGON),
    MILCO_GENERAL_CONFIDENCE_LEVEL_2("02", "MILCO - General-Confidence-Level 2", MineWarfareEntityType.MILCO_GENERAL, IconType.FULL_OCTAGON),
    MILCO_GENERAL_CONFIDENCE_LEVEL_3("03", "MILCO - General-Confidence-Level 3", MineWarfareEntityType.MILCO_GENERAL, IconType.FULL_OCTAGON),
    MILCO_GENERAL_CONFIDENCE_LEVEL_4("04", "MILCO - General-Confidence-Level 4", MineWarfareEntityType.MILCO_GENERAL, IconType.FULL_OCTAGON),
    MILCO_GENERAL_CONFIDENCE_LEVEL_5("05", "MILCO - General-Confidence-Level 5", MineWarfareEntityType.MILCO_GENERAL, IconType.FULL_OCTAGON),
    MILCO_BOTTOM_CONFIDENCE_LEVEL_1("01", "MILCO - Bottom-Confidence-Level 1", MineWarfareEntityType.MILCO_BOTTOM, IconType.FULL_OCTAGON),
    MILCO_BOTTOM_CONFIDENCE_LEVEL_2("02", "MILCO - Bottom-Confidence-Level 2", MineWarfareEntityType.MILCO_BOTTOM, IconType.FULL_OCTAGON),
    MILCO_BOTTOM_CONFIDENCE_LEVEL_3("03", "MILCO - Bottom-Confidence-Level 3", MineWarfareEntityType.MILCO_BOTTOM, IconType.FULL_OCTAGON),
    MILCO_BOTTOM_CONFIDENCE_LEVEL_4("04", "MILCO - Bottom-Confidence-Level 4", MineWarfareEntityType.MILCO_BOTTOM, IconType.FULL_OCTAGON),
    MILCO_BOTTOM_CONFIDENCE_LEVEL_5("05", "MILCO - Bottom-Confidence-Level 5", MineWarfareEntityType.MILCO_BOTTOM, IconType.FULL_OCTAGON),
    MILCO_MOORED_CONFIDENCE_LEVEL_1("01", "MILCO - Moored-Confidence-Level 1", MineWarfareEntityType.MILCO_MOORED, IconType.FULL_OCTAGON),
    MILCO_MOORED_CONFIDENCE_LEVEL_2("02", "MILCO - Moored-Confidence-Level 2", MineWarfareEntityType.MILCO_MOORED, IconType.FULL_OCTAGON),
    MILCO_MOORED_CONFIDENCE_LEVEL_3("03", "MILCO - Moored-Confidence-Level 3", MineWarfareEntityType.MILCO_MOORED, IconType.FULL_OCTAGON),
    MILCO_MOORED_CONFIDENCE_LEVEL_4("04", "MILCO - Moored-Confidence-Level 4", MineWarfareEntityType.MILCO_MOORED, IconType.FULL_OCTAGON),
    MILCO_MOORED_CONFIDENCE_LEVEL_5("05", "MILCO - Moored-Confidence-Level 5", MineWarfareEntityType.MILCO_MOORED, IconType.FULL_OCTAGON),
    MILCO_FLOATING_CONFIDENCE_LEVEL_1("01", "MILCO - Floating-Confidence-Level 1", MineWarfareEntityType.MILCO_FLOATING, IconType.FULL_OCTAGON),
    MILCO_FLOATING_CONFIDENCE_LEVEL_2("02", "MILCO - Floating-Confidence-Level 2", MineWarfareEntityType.MILCO_FLOATING, IconType.FULL_OCTAGON),
    MILCO_FLOATING_CONFIDENCE_LEVEL_3("03", "MILCO - Floating-Confidence-Level 3", MineWarfareEntityType.MILCO_FLOATING, IconType.FULL_OCTAGON),
    MILCO_FLOATING_CONFIDENCE_LEVEL_4("04", "MILCO - Floating-Confidence-Level 4", MineWarfareEntityType.MILCO_FLOATING, IconType.FULL_OCTAGON),
    MILCO_FLOATING_CONFIDENCE_LEVEL_5("05", "MILCO - Floating-Confidence-Level 5", MineWarfareEntityType.MILCO_FLOATING, IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final MineWarfareEntityType entityType;
    private final IconType iconType;
    
    private MineWarfareEntitySubType(String id, String label, MineWarfareEntityType entityType, IconType iconType) {
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