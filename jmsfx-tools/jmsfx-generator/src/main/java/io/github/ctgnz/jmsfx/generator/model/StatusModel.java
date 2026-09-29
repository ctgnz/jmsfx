package io.github.ctgnz.jmsfx.generator.model;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@JsonIgnoreProperties({
    "id", "label", "code", "extension", "deprecated", "remarks", "before"
})
@JsonPropertyOrder({
    "details", "bounds", "dimensions"
})
public class StatusModel extends AbstractModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = {
        "code", "label", "remarks"
    })
    public record Details(String code, String id, boolean extension, boolean deprecated, String label, String remarks) {
    }

    private final Set<String> dimensions = new TreeSet<>();

    public StatusModel() {
    }

    public Set<String> getDimensions() {
        return new TreeSet<>(dimensions);
    }

    @JsonSetter("dimensions")
    protected void loadDimensions(List<String> dimensions) {
        this.dimensions.addAll(dimensions);
    }

    @JsonGetter("details")
    private Details getDetails() {
        return new Details(code, id, extension, deprecated, label, remarks);
    }

    @JsonSetter("details")
    private void setDetails(Details details) {
        this.code = details.code;
        this.id = details.id;
        this.extension = details.extension;
        this.deprecated = details.deprecated;
        this.label = details.label;
        this.remarks = details.remarks;
    }

}
