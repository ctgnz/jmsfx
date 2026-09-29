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
    "details", "bounds"
})
public class DimensionModel extends AbstractModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = {
        "code", "label", "remarks", "graphicLocation"
    })
    public record Details(String code, String id, String geometry, String graphicLocation, boolean extension, boolean deprecated, String label, String remarks) {
    }

    private @JsonIgnore String geometry;
    private @JsonIgnore String graphicLocation;

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

    @JsonGetter("details")
    private Details getDetails() {
        return new Details(code, id, geometry, graphicLocation, extension, deprecated, label, remarks);
    }

    @JsonSetter("details")
    private void setDetails(Details details) {
        this.code = details.code;
        this.id = details.id;
        this.geometry = details.geometry;
        this.graphicLocation = details.graphicLocation;
        this.extension = details.extension;
        this.deprecated = details.deprecated;
        this.label = details.label;
        this.remarks = details.remarks;
    }

}
