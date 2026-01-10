package io.github.ctgnz.jmsfx.generator.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@YamlFlowStyle
@YamlForceQuote(properties = { "code", "label", "remarks" })
@JsonPropertyOrder({
    "code", "id", "groupId", "extension", "deprecated", "label", "remarks"
})
public class StandardIdentityModel extends AbstractModel {

    private static final Set<String> KNOWN_IDENTITIES = Set.of("SI_UNKNOWN", "SI_FRIEND", "SI_NEUTRAL", "SI_HOSTILE_FAKER");
    private static final Set<String> HOSTILE_IDENTITIES = Set.of("SI_SUSPECT_JOKER", "SI_HOSTILE_FAKER");
    private String groupID;

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

}
