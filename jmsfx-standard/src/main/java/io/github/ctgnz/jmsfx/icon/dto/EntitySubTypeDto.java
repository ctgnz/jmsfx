package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.EntitySubType;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.IconType;

public class EntitySubTypeDto implements EntitySubType {

    private final EntitySubType entitySubType;

    public EntitySubTypeDto(EntitySubType subType) {
        this.entitySubType = subType;
    }

    public EntitySubType getEntitySubType() {
        return entitySubType;
    }

    @Override
    public EntityType getEntityType() {
        return entitySubType.getEntityType();
    }

    public String getGraphicLocation(StandardIdentityDto identity) {
        String graphicLocation = getSymbolSet().getGraphicLocation();
        if (entitySubType.isFullFrameIcon()) {
            return String.format("/svg/Appendices/%s/%s_%s.svg", graphicLocation, entitySubType.getGraphicIdentifier(), identity.getGroup().ordinal());
        } else {
            return String.format("/svg/Appendices/%s/%s.svg", graphicLocation, entitySubType.getGraphicIdentifier());
        }
    }

    @Override
    public IconType getIconType() {
        return entitySubType.getIconType();
    }

    @Override
    public String getId() {
        return entitySubType.getId();
    }

    @Override
    public String getLabel() {
        return entitySubType.getLabel();
    }

    @Override
    public boolean isUnknown() {
        return entitySubType.isUnknown();
    }

}
