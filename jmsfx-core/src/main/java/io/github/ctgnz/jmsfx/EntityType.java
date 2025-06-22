package io.github.ctgnz.jmsfx;

import java.util.Collections;
import java.util.List;

public interface EntityType extends MainElement {

	@Override
    default String getGraphicIdentifier() {
        return String.format("%s%s%s00", getBaseSymbolSet().getId(), getEntity().getId(), getId());
    }

    default List<EntitySubType> getEntitySubTypes() {
        return Collections.emptyList();
    }

}
