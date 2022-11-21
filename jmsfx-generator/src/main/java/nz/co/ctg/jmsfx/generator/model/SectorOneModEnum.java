package nz.co.ctg.jmsfx.generator.model;

import nz.co.ctg.jmsfx.generator.schema.ModifiersType.Modifier;

public class SectorOneModEnum extends StandardEnum {

    public SectorOneModEnum(Modifier entity) {
        super(entity.getID().toString(), entity.getLabel(), entity.getModifierCode().getCodeString());
    }

}
