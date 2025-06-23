package io.github.ctgnz.jmsfx.generator.model;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.ctgnz.jmsfx.generator.schema.AmplifierType;
import io.github.ctgnz.jmsfx.generator.schema.Library.Amplifiers.Amplifier;

public class AmplifierModel extends StandardEnumModel {

    private final String description;
    private final AmplifierType type;
    private final int min;
    private final int max;

    public AmplifierModel(Amplifier amplifier) {
        super(amplifier.getID(), amplifier.getLabel(), CaseUtils.toCamelCase(amplifier.getLabel(), true, ' ', '/', '(', ')'), null);
        this.description = StringUtils.defaultIfBlank(amplifier.getDescription(), "");
        this.type = amplifier.getType();
        this.min = ObjectUtils.defaultIfNull(amplifier.getMinLength(), 0);
        this.max = ObjectUtils.defaultIfNull(amplifier.getMaxLength(), 0);
        this.extension = amplifier.isExtension();
    }

    @JsonCreator
    public AmplifierModel(@JsonProperty("id") String id,
                         @JsonProperty("label") String label,
                         @JsonProperty("code") String code,
                         @JsonProperty("remarks") String remarks,
                         @JsonProperty("type") AmplifierType type,
                         @JsonProperty("description") String description,
                         @JsonProperty("min") int min,
                         @JsonProperty("max") int max) {
        super(id, label, code, remarks);
        this.type = type;
        this.description = description;
        this.min = min;
        this.max = max;
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
