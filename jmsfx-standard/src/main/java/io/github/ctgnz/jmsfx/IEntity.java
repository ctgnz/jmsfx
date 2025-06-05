package io.github.ctgnz.jmsfx;

import java.util.Collections;
import java.util.List;

public interface IEntity extends IMainElement {

    @Override
    default ISymbolSet getBaseSymbolSet() {
        return getSymbolSet();
    }

    @Override
    default IEntity getEntity() {
        return this;
    }

    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s0000", getBaseSymbolSet().getId(), getId());
    }

    default List<IEntityType> getEntityTypes() {
        return Collections.emptyList();
    }

}
