package io.github.ctgnz.jmsfx.icon;

import java.util.Collections;
import java.util.List;

public interface Entity extends MainIconElement {

    default SymbolSet getBaseSymbolSet() {
        return getSymbolSet();
    }
    
    @Override
    default Entity getEntity() {
        return (Entity) this;
    }
    
    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s0000", getBaseSymbolSet().getId(), getId());
    }
 
    default List<EntityType> getEntityTypes() {
        return Collections.emptyList();
    }
       
}
