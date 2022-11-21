package ${basePackage};

import java.util.Collections;
import java.util.List;

public interface EntityType extends MainIconElement {

	@Override
    default String getGraphicIdentifier() {
        return String.format("%s%s%s00", getSymbolSet().getId(), getEntity().getId(), getId());
    }

    default List<EntitySubType> getEntitySubTypes() {
        return Collections.emptyList();
    }
    
}
