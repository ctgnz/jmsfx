package io.github.ctgnz.jmsfx.generator.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@YamlFlowStyle
@YamlForceQuote(properties = { "id", "code", "label", "remarks" })
@JsonPropertyOrder({
    "code", "id", "extension", "deprecated", "label", "backgroundFill", "remarks"
})
public class AmplifierListItemModel extends AbstractModel {
    private String backgroundFill;

    public AmplifierListItemModel() {
    }

    public String getBackgroundFill() {
        return backgroundFill;
    }

    public void setBackgroundFill(String backgroundFill) {
        this.backgroundFill = backgroundFill;
    }

}
