package nz.co.ctg.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import nz.co.ctg.jmsfx.generator.schema.IconType;
import nz.co.ctg.jmsfx.generator.schema.SymbolSet.Entities.Entity;
import nz.co.ctg.jmsfx.generator.schema.SymbolSet.Entities.Entity.EntityTypes.EntityType;

public class EntityTypeEnum extends StandardEnum {

    private final String entityId;
    private final IconType iconType;
    private final String graphic;

    public EntityTypeEnum(Entity entity, EntityType entityType) {
        super(entityType.getID().toString(), entityType.getLabel(), entityType.getEntityTypeCode().getCodeString());
        this.iconType = entityType.getIcon();
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

    public IconType getIconType() {
        return iconType;
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
