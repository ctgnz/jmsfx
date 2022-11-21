package nz.co.ctg.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import nz.co.ctg.jmsfx.generator.schema.EntitySubTypeType;

public class SpecialEntitySubTypeEnum extends StandardEnum {

    private final String graphic;

    public SpecialEntitySubTypeEnum(EntitySubTypeType entitySubType) {
        super(entitySubType.getID().toString(), entitySubType.getLabel(), entitySubType.getEntitySubTypeCode().getCodeString());
        String graphicFilename = entitySubType.getRectangleGraphic();
        graphic = graphicFilename.substring(0, graphicFilename.lastIndexOf('_'));
    }

    public String getBaseTypeName() {
        return StringUtils.deleteWhitespace(label);
    }

    public String getGraphic() {
        return graphic;
    }

}
