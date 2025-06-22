package io.github.ctgnz.jmsfx.icon.unknown;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum UnknownEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    UnknownEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.UNKNOWN;
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}