package io.github.ctgnz.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.generator.schema.GraphicType;
import io.github.ctgnz.jmsfx.generator.schema.SymbolSet.Entities.Entity;
import io.github.ctgnz.jmsfx.generator.schema.SymbolSet.Entities.Entity.EntityTypes.EntityType;

public class EntityTypeEnum extends StandardEnum {

    private final String entityId;
    private final GraphicType graphicType;
    private final String graphic;

    public EntityTypeEnum(Entity entity, EntityType entityType) {
        super(entityType.getID().toString(), entityType.getLabel(), entityType.getEntityTypeCode().getCodeString(), null);
        this.graphicType = entityType.getIcon();
        this.entityId = entity.getID();
        this.graphic = getNonStandardGraphic(entityType);
    }

    public String getBaseTypeName() {
        return StringUtils.deleteWhitespace(label);
    }

    public String getEntityId() {
        return entityId;
    }

    public String getGraphic() {
        return graphic;
    }

    public GraphicType getGraphicType() {
        return graphicType;
    }

    private String getNonStandardGraphic(EntityType entityType) {
        String graphic = entityType.getGraphic();
        // graphic filename should be e.g. 10111200.svg, so if there
        // is more than one dot it is a non-standard name
        if (graphic.indexOf('.') != graphic.lastIndexOf('.')) {
            return graphic.substring(0, graphic.lastIndexOf('.'));
        }
        return null;
    }

}
