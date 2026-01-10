package io.github.ctgnz.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@YamlFlowStyle
@YamlForceQuote(properties = { "code", "label", "remarks" })
@JsonPropertyOrder({
    "code", "id", "graphicType", "graphic", "extension", "deprecated", "label", "remarks"
})
public class EntitySubTypeModel extends AbstractModel {
    private @JsonBackReference EntityTypeModel entityType;
    private GraphicType graphicType;
    private String graphic;

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

}
