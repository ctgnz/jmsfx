package io.github.ctgnz.jmsfx.standard.seasubsurface;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum SeaSubsurfaceEntitySubType implements EntitySubType {
    SUBMARINE_SURFACED("01", "Submarine-Surfaced", SeaSubsurfaceEntityType.SUBMARINE, GraphicType.MAIN),
    SUBMARINE_SNORKELING("02", "Submarine-Snorkeling", SeaSubsurfaceEntityType.SUBMARINE, GraphicType.MAIN),
    SUBMARINE_BOTTOMED("03", "Submarine-Bottomed", SeaSubsurfaceEntityType.SUBMARINE, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final SeaSubsurfaceEntityType entityType;
    private final GraphicType graphicType;

    SeaSubsurfaceEntitySubType(String id, String label, SeaSubsurfaceEntityType entityType, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
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
    public EntityType getEntityType() {
        return entityType;
    }

}