package io.github.ctgnz.jmsfx.icon.cyberspaceseasubsurface;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum CyberspaceSeaSubsurfaceEntity implements Entity {
    MISSION_FORCE("11", "Mission Force", GraphicType.NA),
    CYBERSPACE_UNIT("12", "Cyberspace Unit", GraphicType.MAIN),
    THREAT_ACTOR("13", "Threat Actor", GraphicType.MAIN);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    CyberspaceSeaSubsurfaceEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE;
    }

    @Override
    public SymbolSet getBaseSymbolSet() {
        return SymbolSetEnum.CYBERSPACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return CyberspaceSeaSubsurfaceSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}