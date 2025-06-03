package io.github.ctgnz.jmsfx.icon.dto;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.IconType;

public class EntityDto implements Entity {

    private final Entity entity;
    private final List<EntityType> entityTypes = new ArrayList<>();

    public EntityDto(Entity entity) {
        this.entity = entity;
        this.entityTypes.addAll(entity.getEntityTypes().stream().map(EntityTypeDto::new).toList());
    }

    @Override
    public Entity getEntity() {
        return entity;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return entityTypes;
    }

    public String getGraphicLocation(StandardIdentityDto identity) {
        String graphicLocation = getSymbolSet().getGraphicLocation();
        if (StringUtils.isBlank(graphicLocation)) {
            return "/svg/Appendices/98100000.svg";
        }
        if (entity.isFullFrameIcon()) {
            return String.format("/svg/Appendices/%s/%s_%s.svg", graphicLocation, entity.getGraphicIdentifier(), identity.getGroup().ordinal());
        } else {
            return String.format("/svg/Appendices/%s/%s.svg", graphicLocation, entity.getGraphicIdentifier());
        }
    }

    @Override
    public IconType getIconType() {
        return entity.getIconType();
    }

    @Override
    public String getId() {
        return entity.getId();
    }

    @Override
    public String getLabel() {
        return entity.getLabel();
    }

    @Override
    public boolean isUnknown() {
        return entity.isUnknown();
    }
}
