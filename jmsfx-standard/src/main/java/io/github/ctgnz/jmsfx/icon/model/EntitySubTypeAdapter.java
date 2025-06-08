package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.IStandardIdentity;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class EntitySubTypeAdapter extends MainIconAdapter implements IEntitySubType {
    private final ObjectProperty<IEntityType> entityType = new SimpleObjectProperty<>();

    public EntitySubTypeAdapter() {
    }

    public EntitySubTypeAdapter(IEntitySubType subType) {
        super(subType);
    }

    public ObjectProperty<IEntityType> entityTypeProperty() {
        return entityType;
    }

    @Override
    public IEntityType getEntityType() {
        return entityType.get();
    }

    @Override
    public String getGraphicLocation(IStandardIdentity identity) {
        String graphicLocation = getSymbolSet().getGraphicLocation();
        String graphicIdentifier = getGraphicIdentifier();
        if (isFullFrameIcon()) {
            return String.format("/svg/Appendices/%s/%s%s.svg", graphicLocation, graphicIdentifier, identity.getGroup().getGraphicSuffix());
        } else {
            return String.format("/svg/Appendices/%s/%s.svg", graphicLocation, graphicIdentifier);
        }
    }

    @Override
    public String toString() {
        return getLabel();
    }

    protected void setEntityType(EntityTypeAdapter entityType) {
        this.entityType.set(entityType);
    }

}
