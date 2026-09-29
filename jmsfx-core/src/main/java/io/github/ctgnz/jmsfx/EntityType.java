package io.github.ctgnz.jmsfx;

import java.util.Collections;
import java.util.List;

public interface EntityType extends MainElement {

    @Override
    default String getGraphicIdentifier() {
        return getEntity().getName() + "/" + getName();
    }

    default List<EntitySubType> getEntitySubTypes() {
        return Collections.emptyList();
    }

}
