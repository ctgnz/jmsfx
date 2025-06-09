package io.github.ctgnz.jmsfx.icon.space;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum SpaceEntity implements IEntity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA),
    MILITARY("11", "Military", GraphicType.MAIN),
    CIVILIAN("12", "Civilian", GraphicType.MAIN),
    MANUAL_TRACK("13", "Manual Track", GraphicType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    SpaceEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSet.SPACE;
    }

    @Override
    public List<IEntityType> getEntityTypes() {
        return SpaceSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}