package io.github.ctgnz.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.generator.schema.GraphicType;
import io.github.ctgnz.jmsfx.generator.schema.SymbolSet.Entities.Entity;

public class EntityModel extends StandardEnumModel {

    private final GraphicType graphicType;
    private String baseSymbolSet;

    public EntityModel(Entity entity) {
        super(entity.getID().toString(), entity.getLabel(), entity.getEntityCode().getCodeString(), null);
        graphicType = entity.getIcon();
    }

    public String getBaseSymbolSet() {
        return baseSymbolSet;
    }

    public String getBaseTypeName() {
        return StringUtils.deleteWhitespace(label);
    }

    public GraphicType getGraphicType() {
        return graphicType;
    }

    public void setBaseSymbolSet(String baseSymbolSet) {
        this.baseSymbolSet = baseSymbolSet;
    }

}
