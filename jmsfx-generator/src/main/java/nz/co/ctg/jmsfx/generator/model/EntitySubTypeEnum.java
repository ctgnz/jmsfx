package nz.co.ctg.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import nz.co.ctg.jmsfx.generator.schema.EntitySubTypeType;
import nz.co.ctg.jmsfx.generator.schema.IconType;
import nz.co.ctg.jmsfx.generator.schema.SymbolSet.Entities.Entity.EntityTypes.EntityType;

public class EntitySubTypeEnum extends StandardEnum {

    private final String entityTypeId;
    private final IconType iconType;
    private final String graphic;

    public EntitySubTypeEnum(EntityType entityType, EntitySubTypeType entitySubType) {
        super(entitySubType.getID().toString(), entitySubType.getLabel(), entitySubType.getEntitySubTypeCode().getCodeString());
        iconType = entitySubType.getIcon();
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

    public IconType getIconType() {
        return iconType;
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
