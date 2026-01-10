package io.github.ctgnz.jmsfx.generator.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@JsonIgnoreProperties({ "id", "label", "code", "extension", "deprecated", "remarks"})
@JsonPropertyOrder({ "details", "entitySubTypes"})
public class EntityTypeModel extends AbstractModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = { "code", "label", "remarks" })
    public record Details(String code, String id, GraphicType graphicType, String graphic, boolean extension, boolean deprecated, String label, String remarks) {}

    private @JsonBackReference EntityModel entity;
    private final @JsonManagedReference List<EntitySubTypeModel> entitySubTypes = new ArrayList<>();
    private @JsonIgnore GraphicType graphicType;
    private @JsonIgnore String graphic;

    public EntityTypeModel() {
    }

    public void addEntitySubType(EntitySubTypeModel subType) {
        subType.setEntityType(this);
        entitySubTypes.add(subType);
    }

    @JsonIgnore
    public String getBaseTypeName() {
        return StringUtils.deleteWhitespace(label);
    }

    public EntityModel getEntity() {
        return entity;
    }

    @JsonIgnore
    public String getEntityId() {
        return entity.getId();
    }

    public String getGraphic() {
        return graphic;
    }

    public GraphicType getGraphicType() {
        return graphicType;
    }

    public void setEntity(EntityModel entity) {
        this.entity = entity;
    }

    protected Stream<EntitySubTypeModel> streamEntitySubTypes() {
        return entitySubTypes.stream();
    }

    @JsonGetter("details")
    private Details getDetails() {
        return new Details(code, id, graphicType, graphic, extension, deprecated, label, remarks);
    }

    @JsonSetter("details")
    private void setDetails(Details details) {
        this.id = details.id;
        this.code = details.code;
        this.extension = details.extension;
        this.deprecated = details.deprecated;
        this.label = details.label;
        this.remarks = details.remarks;
        this.graphic = details.graphic;
        this.graphicType = details.graphicType;
    }

}
