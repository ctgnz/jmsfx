package io.github.ctgnz.jmsfx.historical.cyberspacelandequipment;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum CyberspaceLandEquipmentEntity implements Entity {
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
        },
        END_POINT("18", "End Point", GraphicType.MAIN) {
            @Override
            public SymbolSet getBaseSymbolSet() {
                return SymbolSetEnum.CYBERSPACE_LAND_EQUIPMENT;
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"m 309.5731,386.80748 -38.7761,-9.21727 m 0.9535,-5.54315 a 21.29507,21.29507 0 0 1 -21.29507,21.29507 21.29507,21.29507 0 0 1 -21.29507,-21.29507 21.29507,21.29507 0 0 1 21.29507,-21.29507 21.29507,21.29507 0 0 1 21.29507,21.29507 z m 126.49908,23.67886 a 44.97392,44.97392 0 0 1 -44.9739,44.97392 44.97392,44.97392 0 0 1 -44.97392,-44.97392 44.97392,44.97392 0 0 1 44.97392,-44.97392 44.97392,44.97392 0 0 1 44.9739,44.97392 z\" style=\"fill:#000000;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-dasharray:none;fill-opacity:1\"/>\n  </g>";
            }
        },
        WEARABLE("19", "Wearable", GraphicType.MAIN) {
            @Override
            public SymbolSet getBaseSymbolSet() {
                return SymbolSetEnum.CYBERSPACE_LAND_EQUIPMENT;
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(0.78,0,0,0.78,-74.01618,205.0188)\">\n    <path d=\"m 451.737,306.102 v -80.9079 l -17.481,16.9299 -23.348,-22.998 34.687,-34.386 h 21.8738 c 2.47219,19.55278 33.48694,18.42906 36.85811,0 H 526.5 l 34.462,34.386 -22.824,22.998 -17.679,-18.27837 V 306.102 Z\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <circle cx=\"466.8502\" cy=\"288.40292\" r=\"5\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:6.36364;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 464.547,274.18842 c 14.38365,0.44949 17.0807,9.21454 17.5302,17.97958\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 464.547,262.0522 c 21.57548,0.89898 28.54268,13.93418 28.76742,30.1158\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 464.547,250.59024 c 27.387,0.10868 41.14843,17.9227 40.528,41.57776\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    CyberspaceLandEquipmentEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.CYBERSPACE_LAND_EQUIPMENT;
    }

    @Override
    public SymbolSet getBaseSymbolSet() {
        return SymbolSetEnum.CYBERSPACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return CyberspaceLandEquipmentSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}