package io.github.ctgnz.jmsfx.generator.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@YamlFlowStyle
@YamlForceQuote(properties = { "code", "label", "remarks", "graphicLocation" })
@JsonPropertyOrder({
    "code", "id", "geometry", "graphicLocation", "extension", "deprecated", "label", "remarks"
})
public class DimensionModel extends AbstractModel {

    private String geometry;
    private String graphicLocation;

    public DimensionModel() {
    }

    public String getGeometry() {
        return geometry;
    }

    public String getGraphicLocation() {
        return graphicLocation;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }

    public void setGraphicLocation(String graphicLocation) {
        this.graphicLocation = graphicLocation;
    }

}
