package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.icon.GraphicType;

public class EntitySubTypeAdapter implements IEntitySubType {

    private final IEntitySubType model;

    public EntitySubTypeAdapter(IEntitySubType subType) {
        this.model = subType;
    }

    public IEntitySubType getModel() {
        return model;
    }

    @Override
    public IEntityType getEntityType() {
        return model.getEntityType();
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

    @Override
    public boolean isUnknown() {
        return model.isUnknown();
    }

}
