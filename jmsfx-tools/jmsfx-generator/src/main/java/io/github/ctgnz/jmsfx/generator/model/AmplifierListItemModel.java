package io.github.ctgnz.jmsfx.generator.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

import io.github.ctgnz.yamlflock.YamlFlowStyle;
import io.github.ctgnz.yamlflock.YamlForceQuote;

@JsonIgnoreProperties({
    "id", "label", "code", "extension", "deprecated", "remarks", "before"
})
@JsonPropertyOrder({
    "details", "bounds"
})
public class AmplifierListItemModel extends AbstractModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = {
        "id", "code", "label", "remarks"
    })
    public record Details(@JsonInclude(Include.NON_NULL) String code, String id, String before, boolean extension, boolean deprecated, String label, String backgroundFill, String remarks) {
    }

    private @JsonIgnore String backgroundFill;

    public AmplifierListItemModel() {
    }

    public String getBackgroundFill() {
        return backgroundFill;
    }

    public void setBackgroundFill(String backgroundFill) {
        this.backgroundFill = backgroundFill;
    }

    @JsonGetter("details")
    private Details getDetails() {
        return new Details(code, id, before, extension, deprecated, label, backgroundFill, remarks);
    }

    @JsonSetter("details")
    private void setDetails(Details details) {
        this.code = details.code;
        this.id = details.id;
        this.before = details.before;
        this.extension = details.extension;
        this.deprecated = details.deprecated;
        this.label = details.label;
        this.backgroundFill = details.backgroundFill;
        this.remarks = details.remarks;
    }

}
