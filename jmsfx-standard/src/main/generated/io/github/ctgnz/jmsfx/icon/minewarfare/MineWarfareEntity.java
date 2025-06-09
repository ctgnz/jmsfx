package io.github.ctgnz.jmsfx.icon.minewarfare;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum MineWarfareEntity implements IEntity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA),
    SEA_MINE_GENERAL("11", "Sea Mine-General", GraphicType.FULL_OCTAGON),
    UNEXPLODED_ORDNANCE("12", "Unexploded Ordnance", GraphicType.FULL_OCTAGON),
    SEA_MINE_DECOY("13", "Sea Mine Decoy", GraphicType.FULL_OCTAGON),
    MINE_LIKE_CONTACT_MILCO("14", "Mine-Like Contact (MILCO)", GraphicType.NA),
    MINE_LIKE_ECHO_MILEC_GENERAL("15", "Mine-Like Echo (MILEC)-General", GraphicType.FULL_OCTAGON),
    NEGATIVE_REACQUISITION_GENERAL("16", "Negative Reacquisition-General", GraphicType.FULL_OCTAGON),
    OBSTRUCTOR("17", "Obstructor", GraphicType.FULL_OCTAGON),
    GENERAL_MINE_ANCHOR("18", "General Mine Anchor", GraphicType.FULL_OCTAGON),
    NON_MINE_MINE_LIKE_NMLO_GENERAL("19", "Non-Mine Mine-Like Object (NMLO)-General", GraphicType.FULL_OCTAGON),
    ENVIRONMENTAL_REPORT_LOCATION("20", "Environmental Report Location", GraphicType.FULL_OCTAGON),
    DIVE_REPORT_LOCATION("21", "Dive Report Location", GraphicType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    MineWarfareEntity(String id, String label, GraphicType graphicType) {
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
    public ISymbolSet getSymbolSet() {
        return SymbolSet.MINE_WARFARE;
    }

    @Override
    public List<IEntityType> getEntityTypes() {
        return MineWarfareSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}