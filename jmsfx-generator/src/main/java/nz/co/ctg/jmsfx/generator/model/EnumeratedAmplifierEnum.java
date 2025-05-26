package nz.co.ctg.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import nz.co.ctg.jmsfx.generator.schema.Library.AmplifierGroups.AmplifierGroup;
import nz.co.ctg.jmsfx.generator.schema.Library.AmplifierGroups.AmplifierGroup.Amplifiers.Amplifier;
import nz.co.ctg.jmsfx.generator.schema.Library.Amplifiers.Amplifier.Values;

public class EnumeratedAmplifierEnum extends StandardEnum {
    private final String backgroundFill;

    public EnumeratedAmplifierEnum(AmplifierGroup group, Amplifier amplifier) {
        super(amplifier.getName(), amplifier.getLabel(), amplifier.getAmplifierCode().getHexValue());
        this.backgroundFill = StringUtils.defaultIfBlank(amplifier.getRemarks(), "");
    }

    public EnumeratedAmplifierEnum(Values.Value group) {
        super(group.getName(), group.getLabel(), group.getLabelAlias());
        this.backgroundFill = null;
    }

    public String getBackgroundFill() {
        return backgroundFill;
    }

}
