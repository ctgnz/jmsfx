package nz.co.ctg.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import nz.co.ctg.jmsfx.generator.schema.IconType;
import nz.co.ctg.jmsfx.generator.schema.SymbolSet.Entities.Entity;

public class EntityEnum extends StandardEnum {

    private final IconType iconType;

    public EntityEnum(Entity entity) {
        super(entity.getID().toString(), entity.getLabel(), entity.getEntityCode().getCodeString());
        iconType = entity.getIcon();
    }

    public String getBaseTypeName() {
        return StringUtils.deleteWhitespace(label);
    }

    public IconType getIconType() {
        return iconType;
    }

}
