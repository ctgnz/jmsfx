package io.github.ctgnz.jmsfx.generator.model;

import java.util.Set;

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
public class StandardIdentityModel extends AbstractModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = {
        "code", "label", "remarks"
    })
    public record Details(String code, String id, String groupID, boolean extension, boolean deprecated, String label, String remarks) {
    }

    private static final Set<String> KNOWN_IDENTITIES = Set.of("UNKNOWN", "FRIEND", "NEUTRAL", "HOSTILE_FAKER");
    private static final Set<String> HOSTILE_IDENTITIES = Set.of("SUSPECT_JOKER", "HOSTILE_FAKER");
    private @JsonIgnore String groupID;

    public StandardIdentityModel() {
    }

    public String getGroupID() {
        return groupID;
    }

    @JsonIgnore
    public boolean isConfirmed() {
        return KNOWN_IDENTITIES.contains(id);
    }

    @JsonIgnore
    public boolean isHostile() {
        return HOSTILE_IDENTITIES.contains(id);
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    @JsonGetter("details")
    private Details getDetails() {
        return new Details(code, id, groupID, extension, deprecated, label, remarks);
    }

    @JsonSetter("details")
    private void setDetails(Details details) {
        this.code = details.code;
        this.id = details.id;
        this.groupID = details.groupID;
        this.extension = details.extension;
        this.deprecated = details.deprecated;
        this.label = details.label;
        this.remarks = details.remarks;
    }

}
