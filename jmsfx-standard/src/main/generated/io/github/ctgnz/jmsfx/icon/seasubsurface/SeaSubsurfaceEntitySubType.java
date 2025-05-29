package io.github.ctgnz.jmsfx.icon.seasubsurface;

import io.github.ctgnz.jmsfx.icon.EntitySubType;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.IconType;

public enum SeaSubsurfaceEntitySubType implements EntitySubType {
    SUBMARINE_SURFACED("01", "Submarine-Surfaced", SeaSubsurfaceEntityType.SUBMARINE, IconType.MAIN),
    SUBMARINE_SNORKELING("02", "Submarine-Snorkeling", SeaSubsurfaceEntityType.SUBMARINE, IconType.MAIN),
    SUBMARINE_BOTTOMED("03", "Submarine-Bottomed", SeaSubsurfaceEntityType.SUBMARINE, IconType.MAIN);

    private final String id;
    private final String label;
    private final SeaSubsurfaceEntityType entityType;
    private final IconType iconType;
    
    private SeaSubsurfaceEntitySubType(String id, String label, SeaSubsurfaceEntityType entityType, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
        this.iconType = iconType;
    }
    

    @Override
    public IconType getIconType() {
        return iconType;
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