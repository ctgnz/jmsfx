package io.github.ctgnz.jmsfx.icon.model;

import java.util.ArrayList;
import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.icon.GraphicType;

public class EntityTypeAdapter implements IEntityType {
    private final IEntityType model;
    private final List<IEntitySubType> entitySubTypes = new ArrayList<>();

    public EntityTypeAdapter(IEntityType entityType) {
        this.model = entityType;
        this.entitySubTypes.addAll(entityType.getEntitySubTypes().stream().map(EntitySubTypeAdapter::new).toList());
    }

    @Override
    public IEntity getEntity() {
        return model.getEntity();
    }

    @Override
    public List<IEntitySubType> getEntitySubTypes() {
        return entitySubTypes;
    }

    public String getGraphicLocation(StandardIdentityAdapter identity) {
        String graphicLocation = getSymbolSet().getGraphicLocation();
        if (model.isFullFrameIcon()) {
            return String.format("/svg/Appendices/%s/%s%s.svg", graphicLocation, model.getGraphicIdentifier(), identity.getGroup().getGraphicSuffix());
        } else {
            return String.format("/svg/Appendices/%s/%s.svg", graphicLocation, model.getGraphicIdentifier());
        }
    }

    @Override
    public GraphicType getGraphicType() {
        return model.getGraphicType();
    }

    @Override
    public String getId() {
        return model.getId();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    public IEntityType getModel() {
        return model;
    }

    @Override
    public boolean isUnknown() {
        return model.isUnknown();
    }
}
