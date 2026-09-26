package io.github.ctgnz.jmsfx.hallux.airmissile;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.hallux.IconBounds;
import io.github.ctgnz.jmsfx.hallux.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum AirMissileEntity implements Entity {
        MISSILE("11", "Missile", GraphicType.MAIN);

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
        return SymbolSetEnum.AIR_MISSILE;
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}