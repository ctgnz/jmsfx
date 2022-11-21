package nz.co.ctg.jmsfx.model;

public interface EntitySubType extends MainIconElement {

	@Override    
    default Entity getEntity() {
        return getEntityType().getEntity();
    }
    
    EntityType getEntityType();

	@Override    
    default String getGraphicIdentifier() {
        return String.format("%s%s%s%s", getSymbolSet().getId(), getEntity().getId(), getEntityType().getId(), getId());
    }

}
