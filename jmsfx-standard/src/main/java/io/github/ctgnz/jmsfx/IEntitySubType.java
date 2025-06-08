package io.github.ctgnz.jmsfx;

public interface IEntitySubType extends IMainElement {

	@Override
    default IEntity getEntity() {
        return getEntityType().getEntity();
    }

    IEntityType getEntityType();

	@Override
    default String getGraphicIdentifier() {
        return String.format("%s%s%s%s", getBaseSymbolSet().getId(), getEntity().getId(), getEntityType().getId(), getId());
    }

}
