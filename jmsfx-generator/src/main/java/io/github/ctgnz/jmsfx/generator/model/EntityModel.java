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
@JsonPropertyOrder({ "details", "entityTypes"})
public class EntityModel extends AbstractModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = { "code", "label", "remarks" })
    public record Details(String code, String id, GraphicType graphicType, String baseSymbolSet, boolean extension, boolean deprecated, String label, String remarks) {}

    private @JsonBackReference SymbolSetModel symbolSet;
    private final @JsonManagedReference List<EntityTypeModel> entityTypes = new ArrayList<>();
    private @JsonIgnore GraphicType graphicType;
    private @JsonIgnore String baseSymbolSet;

    public EntityModel() {
    }

    public void addEntityType(EntityTypeModel entityType) {
        entityType.setEntity(this);
        entityTypes.add(entityType);
    }

    public String getBaseSymbolSet() {
        return baseSymbolSet;
    }

    @JsonIgnore
    public String getBaseTypeName() {
        return StringUtils.deleteWhitespace(label);
    }

    public List<EntityTypeModel> getEntityTypes() {
        return entityTypes;
    }

    public GraphicType getGraphicType() {
        return graphicType;
    }

    public SymbolSetModel getSymbolSet() {
        return symbolSet;
    }

    public void setBaseSymbolSet(String baseSymbolSet) {
        this.baseSymbolSet = baseSymbolSet;
    }

    public void setSymbolSet(SymbolSetModel symbolSet) {
        this.symbolSet = symbolSet;
    }

    protected Stream<EntitySubTypeModel> streamEntitySubTypes() {
        return entityTypes.stream().flatMap(EntityTypeModel::streamEntitySubTypes);
    }

    protected Stream<EntityTypeModel> streamEntityTypes() {
        return entityTypes.stream();
    }

    @JsonGetter("details")
    private Details getDetails() {
        return new Details(code, id, graphicType, baseSymbolSet, extension, deprecated, label, remarks);
    }

    @JsonSetter("details")
    private void setDetails(Details details) {
        this.id = details.id;
        this.code = details.code;
        this.extension = details.extension;
        this.deprecated = details.deprecated;
        this.label = details.label;
        this.remarks = details.remarks;
        this.baseSymbolSet = details.baseSymbolSet;
        this.graphicType = details.graphicType;
    }

}
