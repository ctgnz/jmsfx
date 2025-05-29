package io.github.ctgnz.jmsfx.generator.model;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;

import io.github.ctgnz.jmsfx.generator.schema.AmplifierType;
import io.github.ctgnz.jmsfx.generator.schema.Library.Amplifiers.Amplifier;

public class AmplifierEnum extends StandardEnum {

    private final String description;
    private final AmplifierType type;
    private final int min;
    private final int max;

    public AmplifierEnum(Amplifier amplifier) {
        super(amplifier.getID(), amplifier.getLabel(), CaseUtils.toCamelCase(amplifier.getLabel(), true, ' ', '/', '(', ')'), null);
        this.description = StringUtils.defaultIfBlank(amplifier.getDescription(), "");
        this.type = amplifier.getType();
        this.min = ObjectUtils.defaultIfNull(amplifier.getMinLength(), 0);
        this.max = ObjectUtils.defaultIfNull(amplifier.getMaxLength(), 0);
        this.extension = amplifier.isExtension();
    }

    public String getConstantName() {
        return String.format("%s_%s", id, code);
    }

    public String getDescription() {
        return description;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public AmplifierType getType() {
        return type;
    }

}
