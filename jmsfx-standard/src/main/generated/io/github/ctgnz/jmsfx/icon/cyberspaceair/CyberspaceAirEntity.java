package io.github.ctgnz.jmsfx.icon.cyberspaceair;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum CyberspaceAirEntity implements IEntity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA),
    MISSION_FORCE("11", "Mission Force", GraphicType.NA),
    CYBERSPACE_UNIT("12", "Cyberspace Unit", GraphicType.MAIN),
    THREAT_ACTOR("13", "Threat Actor", GraphicType.MAIN);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    CyberspaceAirEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSet.CYBERSPACE_AIR;
    }

    @Override
    public ISymbolSet getBaseSymbolSet() {
        return SymbolSet.CYBERSPACE;
    }

    @Override
    public List<IEntityType> getEntityTypes() {
        return CyberspaceAirSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}