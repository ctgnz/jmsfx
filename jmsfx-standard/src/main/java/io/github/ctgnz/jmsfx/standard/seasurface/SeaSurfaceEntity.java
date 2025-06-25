package io.github.ctgnz.jmsfx.standard.seasurface;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum SeaSurfaceEntity implements Entity {
    MILITARY("11", "Military", GraphicType.MAIN),
    MILITARY_COMBAT("12", "Military Combatant", GraphicType.MAIN),
    MILITARY_NON_COMBAT("13", "Military Noncombatant", GraphicType.MAIN),
    CIVILIAN("14", "Civilian", GraphicType.MAIN),
    OWN_SHIP("15", "Own Ship", GraphicType.FULL_OCTAGON),
    FUSED_TRACK("16", "Fused Track", GraphicType.FULL_OCTAGON),
    MANUAL_TRACK("17", "Manual Track", GraphicType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    SeaSurfaceEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.SEA_SURFACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return SeaSurfaceSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}