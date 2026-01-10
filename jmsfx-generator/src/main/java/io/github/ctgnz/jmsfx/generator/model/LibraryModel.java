package io.github.ctgnz.jmsfx.generator.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@JsonPropertyOrder({
    "config", "versions", "contexts", "identityGroups", "identities", "statuses", "hqtfDummies", "dimensions", "dimensionGraphics", "amplifiers", "amplifierGroups", "symbolSets"
})
public class LibraryModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = { "graphicLocation", "baseSymbolSet" })
    public record Config(String libraryPrefix, String countryCodeClass, String iconPackage, String amplifierPackage, String commonPackage) {}

    private final List<ContextModel> contexts = new ArrayList<>();
    private final List<HqtfDummyModel> hqtfDummies = new ArrayList<>();
    private final List<StandardIdentityModel> identities = new ArrayList<>();
    private final List<StandardIdentityGroupModel> identityGroups = new ArrayList<>();
    private final List<StatusModel> statuses = new ArrayList<>();
    private final List<VersionModel> versions = new ArrayList<>();
    private final List<DimensionModel> dimensions = new ArrayList<>();
    private @JsonIgnore final Map<String, String> dimensionGraphics = new TreeMap<>();
    private final List<AmplifierModel> amplifiers = new ArrayList<>();
    private final List<AmplifierListModel> amplifierGroups = new ArrayList<>();
    private final List<SymbolSetModel> symbolSets = new ArrayList<>();
    private @JsonIgnore String basePackage = "io.github.ctgnz.jmsfx";
    private @JsonIgnore String typePackage = "io.github.ctgnz.jmsfx.types";
    private @JsonIgnore String iconPackage;
    private @JsonIgnore String amplifierPackage;
    private @JsonIgnore String commonPackage;
    private @JsonIgnore String libraryPrefix;
    private @JsonIgnore String countryCodeClass;
    private @JsonIgnore SymbolSetModel symbolSet;
    private @JsonIgnore AmplifierListModel amplifier;

    public LibraryModel() {
    }

    public AmplifierListModel getAmplifier() {
        return amplifier;
    }

    public List<AmplifierListModel> getAmplifierGroups() {
        return amplifierGroups;
    }

    public AmplifierListModel getAmplifierList(String enumType) {
        return amplifierGroups.stream().filter(amp -> StringUtils.equals(amp.getTypeName(), enumType)).findFirst().orElseThrow();
    }

    public String getAmplifierPackage() {
        return amplifierPackage;
    }

    public List<AmplifierModel> getAmplifiers() {
        return amplifiers;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public String getCommonPackage() {
        return commonPackage;
    }

    public List<ContextModel> getContexts() {
        return contexts;
    }

    public String getCountryCodeClass() {
        return countryCodeClass;
    }

    public DimensionModel getDimension(String key) {
        return dimensions.stream().filter(dim -> StringUtils.equals(dim.getId(), key)).findFirst().orElseThrow();
    }

    public Map<String, String> getDimensionGraphics() {
        return dimensionGraphics;
    }

    public List<DimensionModel> getDimensions() {
        return dimensions;
    }

    public List<HqtfDummyModel> getHqtfDummies() {
        return hqtfDummies;
    }

    public String getIconPackage() {
        return iconPackage;
    }

    public List<StandardIdentityModel> getIdentities() {
        return identities;
    }

    public List<StandardIdentityGroupModel> getIdentityGroups() {
        return identityGroups;
    }

    public String getLibraryPrefix() {
        return libraryPrefix;
    }

    @SuppressWarnings("unchecked")
    public <E extends AbstractModel> List<E> getStandardEnum(String enumName) {
        return switch (enumName) {
            case "contexts" -> (List<E>) contexts;
            case "dimensions" -> (List<E>) dimensions;
            case "hqtfDummies" -> (List<E>) hqtfDummies;
            case "identities" -> (List<E>) identities;
            case "identityGroups" -> (List<E>) identityGroups;
            case "statuses" -> (List<E>) statuses;
            case "versions" -> (List<E>) versions;
            default -> throw new IllegalArgumentException("Unknown enum " + enumName);
        };
    }

    public List<StatusModel> getStatuses() {
        return statuses;
    }

    public SymbolSetModel getSymbolSet() {
        return symbolSet;
    }

    public List<SymbolSetModel> getSymbolSets() {
        return symbolSets;
    }

    public String getTypePackage() {
        return typePackage;
    }

    public List<VersionModel> getVersions() {
        return versions;
    }

    public void setAmplifier(AmplifierListModel amplifier) {
        this.amplifier = amplifier;
    }

    public void setAmplifierPackage(String amplifierPackage) {
        this.amplifierPackage = amplifierPackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public void setCommonPackage(String commonPackage) {
        this.commonPackage = commonPackage;
    }

    public void setCountryCodeClass(String countryCodeClass) {
        this.countryCodeClass = countryCodeClass;
    }

    public void setIconPackage(String iconPackage) {
        this.iconPackage = iconPackage;
    }

    public void setLibraryPrefix(String libraryPrefix) {
        this.libraryPrefix = libraryPrefix;
    }

    public void setSymbolSet(SymbolSetModel symbolSet) {
        this.symbolSet = symbolSet;
    }

    public void setTypePackage(String typePackage) {
        this.typePackage = typePackage;
    }

    @JsonGetter("config")
    private Config getConfig() {
        return new Config(libraryPrefix, countryCodeClass, iconPackage, amplifierPackage, commonPackage);
    }

    @JsonSetter("config")
    private void setConfig(Config config) {
        this.libraryPrefix = config.libraryPrefix;
        this.countryCodeClass = config.countryCodeClass;
        this.iconPackage = config.iconPackage;
        this.amplifierPackage = config.amplifierPackage;
        this.commonPackage = config.commonPackage;
    }

}
