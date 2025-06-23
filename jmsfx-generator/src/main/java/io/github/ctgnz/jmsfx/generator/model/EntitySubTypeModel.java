package io.github.ctgnz.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.generator.schema.EntitySubTypeType;
import io.github.ctgnz.jmsfx.generator.schema.GraphicType;
import io.github.ctgnz.jmsfx.generator.schema.SymbolSet.Entities.Entity.EntityTypes.EntityType;

public class EntitySubTypeModel extends StandardEnumModel {

    private final String entityTypeId;
    private final GraphicType graphicType;
    private final String graphic;

    public EntitySubTypeModel(EntityType entityType, EntitySubTypeType entitySubType) {
        super(entitySubType.getID().toString(), entitySubType.getLabel(), entitySubType.getEntitySubTypeCode().getCodeString(), null);
        graphicType = entitySubType.getIcon();
        entityTypeId = entityType.getID();
        graphic = getNonStandardGraphic(entitySubType);
    }

    public String getBaseTypeName() {
        return StringUtils.deleteWhitespace(label);
    }

    public String getEntityTypeId() {
        return entityTypeId;
    }

    public String getGraphic() {
        return graphic;
    }

    public GraphicType getGraphicType() {
        return graphicType;
    }

    private String getNonStandardGraphic(EntitySubTypeType entitySubType) {
        String graphic = entitySubType.getGraphic();
        // graphic filename should be e.g. 10111200.svg, so if there
        // is more than one dot it is a non-standard name
        if (graphic.indexOf('.') != graphic.lastIndexOf('.')) {
            return graphic.substring(0, graphic.lastIndexOf('.'));
        }
        return null;
    }

}
