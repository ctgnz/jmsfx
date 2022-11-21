package nz.co.ctg.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import nz.co.ctg.jmsfx.generator.schema.Library.Amplifiers.Amplifier;

public class AmplifierEnum extends StandardEnum {
    private final String description;

    public AmplifierEnum(Amplifier amplifier) {
        super(amplifier.getID(), amplifier.getLabel(), createCode(amplifier));
        this.description = StringUtils.defaultIfBlank(amplifier.getDescription(), "");
    }

    private static String createCode(Amplifier amplifier) {
        String label = amplifier.getLabel();
        label = StringUtils.deleteWhitespace(label);
        label = StringUtils.remove(label, '/');
        label = StringUtils.remove(label, '(');
        label = StringUtils.remove(label, ')');
        return label;
    }

    public String getDescription() {
        return description;
    }

}
