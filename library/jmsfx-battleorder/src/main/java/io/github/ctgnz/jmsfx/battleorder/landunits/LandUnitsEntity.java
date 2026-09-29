package io.github.ctgnz.jmsfx.battleorder.landunits;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum LandUnitsEntity implements Entity {
        COMMAND_AND_CONTROL("11", "Command and Control", GraphicType.NA),
        MOVEMENT_AND_MANEUVER("12", "Movement and Maneuver", GraphicType.NA),
        FIRES("13", "Fires", GraphicType.NA),
        PROTECTION("14", "Protection", GraphicType.NA),
        INTELLIGENCE("15", "Intelligence", GraphicType.NA),
        SUSTAINMENT("16", "Sustainment", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"85.4684\" transform=\"matrix(1 0 0 1 188 428.6367)\">SUST</text>\n  </g>";
            }
        },
        NAVAL("17", "Naval", GraphicType.NA),
        NAMED_HEADQUARTERS("18", "Named Headquarters", GraphicType.NA),
        EMERGENCY_OPERATION("19", "Emergency Operation", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(0 -30)\">\n      <ellipse cx=\"306\" cy=\"426\" rx=\"80\" ry=\"80\" stroke=\"#000000\"/>\n      <polygon fill=\"#FFFFFF\" points=\"306,346 375,466 237,466\" stroke=\"#000000\" stroke-linejoin=\"bevel\"/>\n    </g>\n  </g>";
            }
        },
        LAW_ENFORCEMENT("20", "Law Enforcement", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"304.5,297 333.355,346.522 390.67,346.75 362.21,396.5 390.67,446.25 333.355,446.479 304.5,496 275.645,446.479 218.33,446.25 246.79,396.5 218.33,346.75 275.645,346.522\" stroke=\"#000000\"/>\n    <ellipse cx=\"304\" cy=\"296\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"304\" cy=\"496\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"220\" cy=\"347\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"390\" cy=\"346\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"390\" cy=\"447\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"220\" cy=\"447\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        CYBERSPACE_OPERATION("21", "Cyberspace Operation", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-30.93654,-0.12131426)\">\n    <text font-family=\"sans-serif\" font-size=\"120px\" transform=\"translate(215,438.25)\">CYB</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    LandUnitsEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.LAND_UNIT;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return LandUnitsSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}