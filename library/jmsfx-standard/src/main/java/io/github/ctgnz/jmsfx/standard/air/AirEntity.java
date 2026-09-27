package io.github.ctgnz.jmsfx.standard.air;

import java.util.List;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.IconBounds;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum AirEntity implements Entity {
        MILITARY("11", "Military", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"115\" transform=\"matrix(1 0 0 1 208.5005 436.3975)\">MIL</text>\n  </g>";
            }
        },
        CIVILIAN("12", "Civilian", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text fill=\"#FFFFFF\" font-family=\"sans-serif\" font-size=\"116.5535\" stroke=\"#000000\" stroke-width=\"5\" transform=\"matrix(1 0 0 1 208.0005 439.25)\">CIV</text>\n  </g>";
            }
        },
        WEAPON("13", "Weapon", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"92\" transform=\"matrix(1 0 0 1 198 432.25)\">WPN</text>\n  </g>";
            }
        },
        MANUAL_TRACK("14", "Manual Track", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 192 433.25)\">MAN</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    AirEntity(String id, String label, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
    }

    @Override
    public Rectangle2D getIconBounds() {
        return IconBounds.lookup(getGraphicIdentifier(), getGraphicType());
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
        return SymbolSetEnum.AIR;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return AirSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}