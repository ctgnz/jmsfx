package io.github.ctgnz.jmsfx.icon.landcivilian;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.icon.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum LandCivilianEntity implements IEntity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA),
    CIVILIAN("11", "Civilian", GraphicType.MAIN);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    LandCivilianEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSet.LAND_CIVILIAN;
    }

    @Override
    public List<IEntityType> getEntityTypes() {
        return LandCivilianSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}