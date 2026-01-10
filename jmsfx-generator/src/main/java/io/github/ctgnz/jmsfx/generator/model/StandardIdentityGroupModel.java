package io.github.ctgnz.jmsfx.generator.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@YamlFlowStyle
@YamlForceQuote(properties = { "code", "label", "remarks" })
@JsonPropertyOrder({
    "code", "id", "graphicSuffix", "extension", "deprecated", "label", "remarks"
})
public class StandardIdentityGroupModel extends AbstractModel {

    private String graphicSuffix;

    public StandardIdentityGroupModel() {
    }

    public String getGraphicSuffix() {
        return graphicSuffix;
    }

    public void setGraphicSuffix(String graphicSuffix) {
        this.graphicSuffix = graphicSuffix;
    }

}
