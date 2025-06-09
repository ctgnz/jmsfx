package io.github.ctgnz.jmsfx.icon.activity;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum ActivityEntity implements IEntity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA),
    INCIDENT("11", "Incident", GraphicType.NA),
    CIVIL_DISTURBANCE("12", "Civil Disturbance", GraphicType.FULL_OCTAGON),
    OPERATION("13", "Operation", GraphicType.NA),
    HAZARD_MATERIALS("15", "Hazard Materials", GraphicType.NA),
    TRANSPORTATION_INCIDENT("16", "Transportation Incident", GraphicType.FULL_OCTAGON),
    NATURAL_EVENT("17", "Natural Event", GraphicType.MAIN),
    INDIVIDUAL("18", "Individual", GraphicType.NA);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    ActivityEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSet.ACTIVITY;
    }

    @Override
    public List<IEntityType> getEntityTypes() {
        return ActivitySymbolSetInfo.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}