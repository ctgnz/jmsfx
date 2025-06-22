package io.github.ctgnz.jmsfx.icon.cyberspacelandunit;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum CyberspaceLandUnitEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA),
    MISSION_FORCE("11", "Mission Force", GraphicType.NA),
    CYBERSPACE_UNIT("12", "Cyberspace Unit", GraphicType.MAIN),
    THREAT_ACTOR("13", "Threat Actor", GraphicType.MAIN);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    CyberspaceLandUnitEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.CYBERSPACE_LAND_UNIT;
    }

    @Override
    public SymbolSet getBaseSymbolSet() {
        return SymbolSetEnum.CYBERSPACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return CyberspaceLandUnitSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}