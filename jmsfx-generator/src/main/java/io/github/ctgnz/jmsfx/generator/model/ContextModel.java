package io.github.ctgnz.jmsfx.generator.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@YamlFlowStyle
@YamlForceQuote(properties = { "code", "label", "remarks" })
@JsonPropertyOrder({
    "code", "id", "extension", "deprecated", "label", "remarks"
})
public class ContextModel extends AbstractModel {

    public ContextModel() {
    }

}
