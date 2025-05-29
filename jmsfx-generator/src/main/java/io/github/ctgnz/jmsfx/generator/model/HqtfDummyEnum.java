package io.github.ctgnz.jmsfx.generator.model;

import io.github.ctgnz.jmsfx.generator.schema.Library.HQTFDummies.HQTFDummy;

public class HqtfDummyEnum extends StandardEnum {

    public HqtfDummyEnum(HQTFDummy dummy) {
        super(dummy.getName(), dummy.getLabel(), Integer.toString(dummy.getHQTFDummyCode()), null);
    }

}
