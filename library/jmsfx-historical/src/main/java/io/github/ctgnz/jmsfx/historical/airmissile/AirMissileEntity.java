package io.github.ctgnz.jmsfx.historical.airmissile;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum AirMissileEntity implements Entity {
        MISSILE("11", "Missile", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#E6E65C\" points=\"324.043,437.925 337.383,450.81 337.383,487.167 306.826,457.561 277.201,487.167 277.201,450.503 290.229,437.925 289.919,313.205 306.671,284.167 324.043,313.205\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    AirMissileEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.AIR_MISSILE;
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}