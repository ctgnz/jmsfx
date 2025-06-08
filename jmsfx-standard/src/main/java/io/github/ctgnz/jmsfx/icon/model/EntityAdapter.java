package io.github.ctgnz.jmsfx.icon.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.icon.GraphicType;

public class EntityAdapter implements IEntity {

    private final IEntity model;
    private final List<IEntityType> entityTypes = new ArrayList<>();

    public EntityAdapter(IEntity entity) {
        this.model = entity;
        this.entityTypes.addAll(entity.getEntityTypes().stream().map(EntityTypeAdapter::new).toList());
    }

    @Override
    public IEntity getEntity() {
        return model;
    }

    @Override
    public List<IEntityType> getEntityTypes() {
        return entityTypes;
    }

    public String getGraphicLocation(StandardIdentityAdapter identity) {
        String graphicLocation = getSymbolSet().getGraphicLocation();
        if (StringUtils.isBlank(graphicLocation)) {
            return "/svg/Appendices/98100000.svg";
        }
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

    public IEntity getModel() {
        return model;
    }

    @Override
    public boolean isUnknown() {
        return model.isUnknown();
    }
}
