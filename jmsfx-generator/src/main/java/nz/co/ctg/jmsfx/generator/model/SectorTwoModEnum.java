package nz.co.ctg.jmsfx.generator.model;

import nz.co.ctg.jmsfx.generator.schema.ModifiersType.Modifier;

public class SectorTwoModEnum extends StandardEnum {

    public SectorTwoModEnum(Modifier entity) {
        super(entity.getID().toString(), entity.getLabel(), entity.getModifierCode().getCodeString());
    }

}
