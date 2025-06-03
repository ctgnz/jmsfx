package io.github.ctgnz.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.generator.schema.Library.AmplifierGroups.AmplifierGroup;
import io.github.ctgnz.jmsfx.generator.schema.Library.AmplifierGroups.AmplifierGroup.Amplifiers.Amplifier;
import io.github.ctgnz.jmsfx.generator.schema.Library.Amplifiers.Amplifier.Values;

public class ListAmplifierEnum extends StandardEnum {
    private final String backgroundFill;

    public ListAmplifierEnum(AmplifierGroup group, Amplifier amplifier) {
        super(amplifier.getName(), amplifier.getLabel(), amplifier.getAmplifierCode().getHexValue(), null);
        this.backgroundFill = StringUtils.defaultIfBlank(amplifier.getRemarks(), "");
        this.extension = amplifier.isExtension();
    }

    public ListAmplifierEnum(Values.Value value) {
        super(value.getName(), value.getLabel(), value.getLabelAlias(), value.getRemarks());
        this.backgroundFill = null;
        this.extension = value.isExtension();
    }

    public String getBackgroundFill() {
        return backgroundFill;
    }

}
