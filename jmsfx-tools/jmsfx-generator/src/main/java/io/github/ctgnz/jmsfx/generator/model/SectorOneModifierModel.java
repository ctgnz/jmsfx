package io.github.ctgnz.jmsfx.generator.model;

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
public class SectorOneModifierModel extends AbstractModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = {
        "code", "label", "remarks"
    })
    public record Details(String groupId, String code, String category, String id, String before, boolean extension, boolean deprecated, String label, String remarks) {
    }

    private @JsonBackReference SymbolSetModel symbolSet;
    private @JsonIgnore String groupId;
    private @JsonIgnore String category;

    public SectorOneModifierModel() {
    }

    public String getCategory() {
        return category;
    }

    public String getGroupId() {
        return groupId;
    }

    public SymbolSetModel getSymbolSet() {
        return symbolSet;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setSymbolSet(SymbolSetModel symbolSet) {
        this.symbolSet = symbolSet;
    }

    @JsonGetter("details")
    private Details getDetails() {
        return new Details(groupId, code, category, id, before, extension, deprecated, label, remarks);
    }

    @JsonSetter("details")
    private void setDetails(Details details) {
        this.groupId = details.groupId;
        this.code = details.code;
        this.category = details.category;
        this.id = details.id;
        this.before = details.before;
        this.extension = details.extension;
        this.deprecated = details.deprecated;
        this.label = details.label;
        this.remarks = details.remarks;
    }

}
