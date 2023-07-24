package nz.co.ctg.jmsfx.model.minewarfare;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum MineWarfareEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    SEA_MINE_GENERAL("11", "Sea Mine-General", IconType.FULL_OCTAGON),
    UNEXPLODED_ORDNANCE("12", "Unexploded Ordnance", IconType.FULL_OCTAGON),
    SEA_MINE_DECOY("13", "Sea Mine Decoy", IconType.FULL_OCTAGON),
    MINE_LIKE_CONTACT_MILCO("14", "Mine-Like Contact (MILCO)", IconType.NA),
    MINE_LIKE_ECHO_MILEC_GENERAL("15", "Mine-Like Echo (MILEC)-General", IconType.FULL_OCTAGON),
    NEGATIVE_REACQUISITION_GENERAL("16", "Negative Reacquisition-General", IconType.FULL_OCTAGON),
    OBSTRUCTOR("17", "Obstructor", IconType.FULL_OCTAGON),
    GENERAL_MINE_ANCHOR("18", "General Mine Anchor", IconType.FULL_OCTAGON),
    NON_MINE_MINE_LIKE_NMLO_GENERAL("19", "Non-Mine Mine-Like Object (NMLO)-General", IconType.FULL_OCTAGON),
    ENVIRONMENTAL_REPORT_LOCATION("20", "Environmental Report Location", IconType.FULL_OCTAGON),
    DIVE_REPORT_LOCATION("21", "Dive Report Location", IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private MineWarfareEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.SS_MINE_WARFARE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return MineWarfareSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}