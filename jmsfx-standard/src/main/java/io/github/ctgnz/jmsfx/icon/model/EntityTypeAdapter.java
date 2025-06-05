package io.github.ctgnz.jmsfx.icon.model;

import java.util.ArrayList;
import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.icon.GraphicType;

public class EntityTypeAdapter implements IEntityType {
    private final IEntityType entityType;
    private final List<IEntitySubType> entitySubTypes = new ArrayList<>();

    public EntityTypeAdapter(IEntityType entityType) {
        this.entityType = entityType;
        this.entitySubTypes.addAll(entityType.getEntitySubTypes().stream().map(EntitySubTypeAdapter::new).toList());
    }

    @Override
    public IEntity getEntity() {
        return entityType.getEntity();
    }

    @Override
    public List<IEntitySubType> getEntitySubTypes() {
        return entitySubTypes;
    }

    public IEntityType getEntityType() {
        return entityType;
    }

    public String getGraphicLocation(StandardIdentityAdapter identity) {
        String graphicLocation = getSymbolSet().getGraphicLocation();
        if (entityType.isFullFrameIcon()) {
            return String.format("/svg/Appendices/%s/%s%s.svg", graphicLocation, entityType.getGraphicIdentifier(), identity.getGroup().getGraphicSuffix());
        } else {
            return String.format("/svg/Appendices/%s/%s.svg", graphicLocation, entityType.getGraphicIdentifier());
        }
    }

    @Override
    public GraphicType getGraphicType() {
        return entityType.getGraphicType();
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
