package io.github.ctgnz.jmsfx.battleorder.dismountedindividual;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum DismountedIndividualEntity implements Entity {
        MILITARY("11", "Military", GraphicType.NA),
        CIVILIAN2("12", "Civilian", GraphicType.NA);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    DismountedIndividualEntity(String id, String label, GraphicType graphicType) {
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
    public String getName() {
        return name();
    }

    @Override
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.DISMOUNTED;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return DismountedIndividualSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}