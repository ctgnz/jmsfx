package nz.co.ctg.jmsfx.server.model;

import nz.co.ctg.jmsfx.model.EntitySubType;

public class EntitySubTypeData<S extends EntitySubType> {

    private final S entitySubType;

    public EntitySubTypeData(S subType) {
        this.entitySubType = subType;
    }

    public S getEntitySubType() {
        return entitySubType;
    }

    public String getLabel() {
        return entitySubType.getLabel();
    }

    public String getId() {
        return entitySubType.getId();
    }

}
