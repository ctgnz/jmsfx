package io.github.ctgnz.jmsfx;

import java.util.Collections;
import java.util.List;

public interface IEntityType extends IMainElement {

	@Override
    default String getGraphicIdentifier() {
        return String.format("%s%s%s00", getBaseSymbolSet().getId(), getEntity().getId(), getId());
    }

    default List<IEntitySubType> getEntitySubTypes() {
        return Collections.emptyList();
    }
    
}
