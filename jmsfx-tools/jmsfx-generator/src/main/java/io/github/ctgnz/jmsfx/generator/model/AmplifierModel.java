package io.github.ctgnz.jmsfx.generator.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@JsonIgnoreProperties({
    "id", "label", "code", "extension", "deprecated", "remarks", "before"
})
@JsonPropertyOrder({
    "details"
})
public class AmplifierModel extends AbstractModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = {
        "id", "code", "label", "remarks"
    })
    public record Details(String id, AmplifierType type, int min, int max, String code, boolean extension, boolean deprecated, String label, String description, String remarks) {
    }

    private @JsonIgnore String description;
    private @JsonIgnore AmplifierType type;
    private @JsonIgnore int min;
    private @JsonIgnore int max;

    public AmplifierModel() {
    }

    @JsonIgnore
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setType(AmplifierType type) {
        this.type = type;
    }

    @JsonGetter("details")
    private Details getDetails() {
        return new Details(id, type, min, max, code, extension, deprecated, label, description, remarks);
    }

    @JsonSetter("details")
    private void setDetails(Details details) {
        this.id = details.id;
        this.type = details.type;
        this.min = details.min;
        this.max = details.max;
        this.code = details.code;
        this.extension = details.extension;
        this.deprecated = details.deprecated;
        this.label = details.label;
        this.description = details.description;
        this.remarks = details.remarks;
    }

}
