package io.github.ctgnz.jmsfx.generator.model;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@YamlFlowStyle
@YamlForceQuote(properties = { "code", "label", "remarks" })
@JsonPropertyOrder({
    "code", "id", "extension", "deprecated", "label", "remarks", "dimensions"
})
public class StatusModel extends AbstractModel {

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

}
