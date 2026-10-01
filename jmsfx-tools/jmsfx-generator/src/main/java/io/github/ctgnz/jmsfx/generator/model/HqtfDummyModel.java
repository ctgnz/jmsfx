package io.github.ctgnz.jmsfx.generator.model;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class HqtfDummyModel extends AbstractModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = {
        "code", "label", "remarks"
    })
    public record Details(String code, String id, boolean extension, boolean deprecated, String label, String remarks, String[] dimensions) {
    }

    private final Set<String> dimensions = new TreeSet<>();

    public HqtfDummyModel() {
    }

    /**
     * The dimensions this applies to, live - as {@link LibraryModel#getDimensions()} is, and read-only in practice: the templates iterate it and nothing else touches it.
     * <p>
     * {@code @JsonIgnore} because it is written inside {@link Details} rather than beside it, so that the list reads as part of the element instead of as a block below its bounds.
     */
    @JsonIgnore
    public Set<String> getDimensions() {
        return dimensions;
    }

    @JsonGetter("details")
    private Details getDetails() {
        return new Details(code, id, extension, deprecated, label, remarks, dimensions.toArray(size -> new String[size]));
    }

    @JsonSetter("details")
    private void setDetails(Details details) {
        this.code = details.code;
        this.id = details.id;
        this.extension = details.extension;
        this.deprecated = details.deprecated;
        this.label = details.label;
        this.remarks = details.remarks;
        if (details.dimensions != null) {
            this.dimensions.addAll(Arrays.asList(details.dimensions));
        }
    }

}
