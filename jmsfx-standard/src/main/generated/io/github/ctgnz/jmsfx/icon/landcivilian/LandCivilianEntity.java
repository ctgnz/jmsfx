package io.github.ctgnz.jmsfx.icon.landcivilian;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum LandCivilianEntity implements Entity {
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
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.LAND_CIVILIAN;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return LandCivilianSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}