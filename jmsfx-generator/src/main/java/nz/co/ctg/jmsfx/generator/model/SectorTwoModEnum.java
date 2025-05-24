package nz.co.ctg.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import nz.co.ctg.jmsfx.generator.schema.ModifiersType.Modifier;

public class SectorTwoModEnum extends StandardEnum {

    private String category;

    public SectorTwoModEnum(Modifier entity) {
        super(entity.getID().toString(), entity.getLabel(), entity.getModifierCode().getCodeString());
        this.category = StringUtils.defaultIfBlank(entity.getCategory(), "General");
    }

    public String getCategory() {
        return category;
    }

}
