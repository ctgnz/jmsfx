package io.github.ctgnz.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.generator.schema.IconType;
import io.github.ctgnz.jmsfx.generator.schema.SymbolSet.Entities.Entity;

public class EntityEnum extends StandardEnum {

    private final IconType iconType;
    private String baseSymbolSet;

    public EntityEnum(Entity entity) {
        super(entity.getID().toString(), entity.getLabel(), entity.getEntityCode().getCodeString(), null);
        iconType = entity.getIcon();
    }

    public String getBaseSymbolSet() {
        return baseSymbolSet;
    }

    public String getBaseTypeName() {
        return StringUtils.deleteWhitespace(label);
    }

    public IconType getIconType() {
        return iconType;
    }

    public void setBaseSymbolSet(String baseSymbolSet) {
        this.baseSymbolSet = baseSymbolSet;
    }

}
