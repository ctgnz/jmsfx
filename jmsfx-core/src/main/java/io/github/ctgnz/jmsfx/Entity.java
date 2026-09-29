package io.github.ctgnz.jmsfx;

import java.util.Collections;
import java.util.List;

public interface Entity extends MainElement {

    @Override
    default SymbolSet getBaseSymbolSet() {
        return getSymbolSet();
    }

    @Override
    default Entity getEntity() {
        return this;
    }

    @Override
    default String getGraphicIdentifier() {
        return getName();
    }

    default List<EntityType> getEntityTypes() {
        return Collections.emptyList();
    }

}
