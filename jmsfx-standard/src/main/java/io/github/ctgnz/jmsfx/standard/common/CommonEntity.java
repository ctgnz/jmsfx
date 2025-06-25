package io.github.ctgnz.jmsfx.standard.common;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum CommonEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA),
    INVALID("10", "Invalid Symbol", GraphicType.FULL_FRAME);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    CommonEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.COMMON;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return CommonSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}