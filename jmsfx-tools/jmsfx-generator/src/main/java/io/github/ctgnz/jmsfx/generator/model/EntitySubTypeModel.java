package io.github.ctgnz.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class EntitySubTypeModel extends AbstractModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = {
        "code", "label", "remarks"
    })
    public record Details(String code, String id, String before, GraphicType graphicType, String graphic, boolean extension, boolean deprecated, String label, String remarks) {
    }

    private @JsonBackReference EntityTypeModel entityType;
    private @JsonIgnore GraphicType graphicType;
    private @JsonIgnore String graphic;

    public EntitySubTypeModel() {
    }

    @JsonIgnore
    public String getBaseTypeName() {
        return StringUtils.deleteWhitespace(label);
    }

    public EntityTypeModel getEntityType() {
        return entityType;
    }

    @JsonIgnore
    public String getEntityTypeId() {
        return entityType.getId();
    }

    public String getGraphic() {
        return graphic;
    }

    public GraphicType getGraphicType() {
        return graphicType;
    }

    public void setEntityType(EntityTypeModel entityType) {
        this.entityType = entityType;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    public void setGraphicType(GraphicType graphicType) {
        this.graphicType = graphicType;
    }

    @JsonGetter("details")
    private Details getDetails() {
        return new Details(code, id, before, graphicType, graphic, extension, deprecated, label, remarks);
    }

    @JsonSetter("details")
    private void setDetails(Details details) {
        this.code = details.code;
        this.id = details.id;
        this.before = details.before;
        this.graphicType = details.graphicType;
        this.graphic = details.graphic;
        this.extension = details.extension;
        this.deprecated = details.deprecated;
        this.label = details.label;
        this.remarks = details.remarks;
    }

}
