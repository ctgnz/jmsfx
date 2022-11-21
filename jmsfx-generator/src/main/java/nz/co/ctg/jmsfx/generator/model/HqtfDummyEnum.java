package nz.co.ctg.jmsfx.generator.model;

import nz.co.ctg.jmsfx.generator.schema.Library.HQTFDummies.HQTFDummy;

public class HqtfDummyEnum extends StandardEnum {

    public HqtfDummyEnum(HQTFDummy dummy) {
        super(dummy.getName(), dummy.getLabel(), Integer.toString(dummy.getHQTFDummyCode()));
    }

}
