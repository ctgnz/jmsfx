package io.github.ctgnz.jmsfx.generator.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@YamlFlowStyle
@YamlForceQuote(properties = { "id", "code", "label", "remarks" })
@JsonPropertyOrder({
    "id", "type", "min", "max", "code", "extension", "deprecated", "label", "description", "remarks"
})
public class AmplifierModel extends AbstractModel {

    private String description;
    private AmplifierType type;
    private int min;
    private int max;

    public AmplifierModel() {
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

}
