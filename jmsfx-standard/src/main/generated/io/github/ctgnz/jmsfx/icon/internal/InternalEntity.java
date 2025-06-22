package io.github.ctgnz.jmsfx.icon.internal;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum InternalEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA),
    INVALID("10", "Invalid Symbol", GraphicType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    InternalEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.INTERNAL;
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}