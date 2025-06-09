package io.github.ctgnz.jmsfx.icon.airmissile;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum AirMissileEntity implements IEntity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA),
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
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public ISymbolSet getSymbolSet() {
        return SymbolSet.AIR_MISSILE;
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}