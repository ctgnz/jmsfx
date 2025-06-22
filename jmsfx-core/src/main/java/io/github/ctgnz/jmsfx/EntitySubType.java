package io.github.ctgnz.jmsfx;

public interface EntitySubType extends MainElement {

	@Override
    default Entity getEntity() {
        return getEntityType().getEntity();
    }

    EntityType getEntityType();

	@Override
    default String getGraphicIdentifier() {
        return String.format("%s%s%s%s", getBaseSymbolSet().getId(), getEntity().getId(), getEntityType().getId(), getId());
    }

}
