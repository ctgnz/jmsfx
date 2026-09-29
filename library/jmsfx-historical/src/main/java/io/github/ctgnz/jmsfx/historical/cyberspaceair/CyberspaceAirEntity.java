package io.github.ctgnz.jmsfx.historical.cyberspaceair;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum CyberspaceAirEntity implements Entity {
        MISSION_FORCE("11", "Mission Force", GraphicType.NA),
        CYBERSPACE_UNIT("12", "Cyberspace Unit", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0.2539,0.60818)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(203.9658,430.25)\">CYB</text>\n  </g>";
            }
        },
        THREAT_ACTOR("13", "Threat Actor", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.87\" transform=\"translate(15.29002,-2.1213143)\">\n    <text font-family=\"sans-serif\" font-size=\"120px\" transform=\"translate(216,440.25)\">TA</text>\n  </g>";
            }
        };

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
    public String getName() {
        return name();
    }

    @Override
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.CYBERSPACE_AIR;
    }

    @Override
    public SymbolSet getBaseSymbolSet() {
        return SymbolSetEnum.CYBERSPACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return CyberspaceAirSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}