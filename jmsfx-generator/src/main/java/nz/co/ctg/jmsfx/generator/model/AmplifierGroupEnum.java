package nz.co.ctg.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import nz.co.ctg.jmsfx.generator.schema.Library.AmplifierGroups.AmplifierGroup;
import nz.co.ctg.jmsfx.generator.schema.Library.AmplifierGroups.AmplifierGroup.Amplifiers.Amplifier;

public class AmplifierGroupEnum extends StandardEnum {
    private final String backgroundFill;

    public AmplifierGroupEnum(AmplifierGroup group, Amplifier amplifier) {
        super(amplifier.getName(), amplifier.getLabel(), amplifier.getAmplifierCode().getHexValue());
        this.backgroundFill = StringUtils.defaultIfBlank(amplifier.getRemarks(), "");
    }

    public String getBackgroundFill() {
        return backgroundFill;
    }

}
