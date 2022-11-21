package nz.co.ctg.jmsfx.model;

import java.util.Collections;
import java.util.List;

public interface Entity extends MainIconElement {

    @Override
    default Entity getEntity() {
        return (Entity) this;
    }
    
    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s0000", getSymbolSet().getId(), getId());
    }
 
    default List<EntityType> getEntityTypes() {
        return Collections.emptyList();
    }
       
}
