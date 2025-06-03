package io.github.ctgnz.jmsfx.icon.dto;

import java.util.ArrayList;
import java.util.List;

import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.EntitySubType;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.IconType;

public class EntityTypeDto implements EntityType {
    private final EntityType entityType;
    private final List<EntitySubType> entitySubTypes = new ArrayList<>();

    public EntityTypeDto(EntityType entityType) {
        this.entityType = entityType;
        this.entitySubTypes.addAll(entityType.getEntitySubTypes().stream().map(EntitySubTypeDto::new).toList());
    }

    @Override
    public Entity getEntity() {
        return entityType.getEntity();
    }

    @Override
    public List<EntitySubType> getEntitySubTypes() {
        return entitySubTypes;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public String getGraphicLocation(StandardIdentityDto identity) {
        String graphicLocation = getSymbolSet().getGraphicLocation();
        if (entityType.isFullFrameIcon()) {
            return String.format("/svg/Appendices/%s/%s_%s.svg", graphicLocation, entityType.getGraphicIdentifier(), identity.getGroup().ordinal());
        } else {
            return String.format("/svg/Appendices/%s/%s.svg", graphicLocation, entityType.getGraphicIdentifier());
        }
    }

    @Override
    public IconType getIconType() {
        return entityType.getIconType();
    }

    @Override
    public String getId() {
        return entityType.getId();
    }

    @Override
    public String getLabel() {
        return entityType.getLabel();
    }

    @Override
    public boolean isUnknown() {
        return entityType.isUnknown();
    }
}
