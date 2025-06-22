package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class EntitySubTypeImpl extends MainIconImpl implements EntitySubType {
    private final ObjectProperty<EntityType> entityType = new SimpleObjectProperty<>();

    public EntitySubTypeImpl() {
    }

    public EntitySubTypeImpl(EntitySubType subType) {
        super(subType);
        this.entityType.set(subType.getEntityType());
    }

    public ObjectProperty<EntityType> entityTypeProperty() {
        return entityType;
    }

    @Override
    public EntityType getEntityType() {
        return entityType.get();
    }

    @Override
    public String getGraphicLocation(StandardIdentity identity) {
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

    protected void setEntityType(EntityTypeImpl entityType) {
        this.entityType.set(entityType);
    }

}
