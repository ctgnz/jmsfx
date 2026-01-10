package io.github.ctgnz.jmsfx.generator.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@JsonIgnoreProperties({ "id", "label", "code", "extension", "deprecated", "remarks"})
@JsonPropertyOrder({ "details", "config", "values" })
public class AmplifierListModel extends AbstractModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = { "code", "label", "remarks" })
    public record Details(String code, String id, boolean extension, boolean deprecated, String label, String amplifierId, String remarks) {}

    @YamlFlowStyle
    @YamlForceQuote(properties = { "graphicLocation", "baseSymbolSet", "enumDesc" })
    public record Config(String typeName, String graphicLocation, boolean standard, boolean country, boolean coded, boolean frameAmplifier, boolean unknown, String enumId, String enumDesc, String[] symbolSets) {}

    private final List<AmplifierListItemModel> values = new ArrayList<>();
    private @JsonIgnore String typeName;
    private @JsonIgnore String graphicLocation;
    private @JsonIgnore final List<String> symbolSets = new ArrayList<String>();
    private @JsonIgnore String enumId;
    private @JsonIgnore String enumDesc;
    private @JsonIgnore boolean standard;
    private @JsonIgnore boolean country;
    private @JsonIgnore boolean coded;
    private @JsonIgnore boolean frameAmplifier;
    private @JsonIgnore boolean unknown;
    private @JsonIgnore String amplifierId;

    public AmplifierListModel() {
    }

    public String getAmplifierId() {
        return amplifierId;
    }

    public String getEnumDesc() {
        return enumDesc;
    }

    public String getEnumId() {
        return enumId;
    }

    public String getGraphicLocation() {
        return graphicLocation;
    }

    public List<String> getSymbolSets() {
        return symbolSets;
    }

    public String getTypeName() {
        return typeName;
    }

    public List<AmplifierListItemModel> getValues() {
        return values;
    }

    public boolean isCoded() {
        return coded;
    }

    public boolean isCountry() {
        return country;
    }

    @Override
    @JsonIgnore
    public boolean isExtension() {
        return values.stream().anyMatch(AmplifierListItemModel::isExtension);
    }

    public boolean isFor(String symbolSetId) {
        return symbolSets.stream().anyMatch(id -> id.equals(symbolSetId));
    }

    public boolean isFrameAmplifier() {
        return frameAmplifier;
    }

    public boolean isStandard() {
        return standard;
    }

    public boolean isUnknown() {
        return unknown;
    }

    public void setAmplifierId(String amplifierId) {
        this.amplifierId = amplifierId;
    }

    @JsonGetter("config")
    private Config getConfig() {
        return new Config(typeName, graphicLocation, standard, country, coded, frameAmplifier, unknown, enumId, enumDesc, symbolSets.toArray(size -> new String[size]));
    }

    @JsonGetter("details")
    private Details getDetails() {
        return new Details(code, id, extension, deprecated, label, amplifierId, remarks);
    }

    @JsonSetter("config")
    private void setConfig(Config config) {
        this.typeName = config.typeName;
        this.graphicLocation = config.graphicLocation;
        this.standard = config.standard;
        this.country = config.country;
        this.coded = config.coded;
        this.frameAmplifier = config.frameAmplifier;
        this.unknown = config.unknown;
        this.enumId = config.enumId;
        this.enumDesc = config.enumDesc;
        if (config.symbolSets != null) {
            Arrays.stream(config.symbolSets).forEach(symbolSets::add);
        }
    }

    @JsonSetter("details")
    private void setDetails(Details details) {
        this.id = details.id;
        this.code = details.code;
        this.extension = details.extension;
        this.deprecated = details.deprecated;
        this.label = details.label;
        this.remarks = details.remarks;
        this.amplifierId = details.amplifierId;
    }

}
