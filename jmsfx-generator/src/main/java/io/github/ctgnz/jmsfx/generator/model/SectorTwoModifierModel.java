package io.github.ctgnz.jmsfx.generator.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@YamlFlowStyle
@YamlForceQuote(properties = { "code", "label", "remarks" })
@JsonPropertyOrder({ "groupId", "code", "category", "id", "extension", "deprecated", "label", "remarks" })
public class SectorTwoModifierModel extends AbstractModel {

    private @JsonBackReference SymbolSetModel symbolSet;
    private String groupId;
    private String category;

    public SectorTwoModifierModel() {
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

}
