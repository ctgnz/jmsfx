package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.icon.GraphicType;

public class EntitySubTypeAdapter implements IEntitySubType {

    private final IEntitySubType entitySubType;

    public EntitySubTypeAdapter(IEntitySubType subType) {
        this.entitySubType = subType;
    }

    public IEntitySubType getEntitySubType() {
        return entitySubType;
    }

    @Override
    public IEntityType getEntityType() {
        return entitySubType.getEntityType();
    }

    public String getGraphicLocation(StandardIdentityAdapter identity) {
        String graphicLocation = getSymbolSet().getGraphicLocation();
        if (entitySubType.isFullFrameIcon()) {
            return String.format("/svg/Appendices/%s/%s%s.svg", graphicLocation, entitySubType.getGraphicIdentifier(), identity.getGroup().getGraphicSuffix());
        } else {
            return String.format("/svg/Appendices/%s/%s.svg", graphicLocation, entitySubType.getGraphicIdentifier());
        }
    }

    @Override
    public GraphicType getGraphicType() {
        return entitySubType.getGraphicType();
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
