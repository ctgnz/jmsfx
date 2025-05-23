package nz.co.ctg.jmsfx.icon.dto;

import nz.co.ctg.jmsfx.model.EntitySubType;

public class EntitySubTypeDto<S extends EntitySubType> {

    private final S entitySubType;

    public EntitySubTypeDto(S subType) {
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
