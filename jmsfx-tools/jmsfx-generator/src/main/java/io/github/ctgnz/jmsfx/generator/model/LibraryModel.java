package io.github.ctgnz.jmsfx.generator.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "versions", "contexts", "identityGroups", "identities", "statuses", "hqtfDummies", "dimensions", "amplifiers", "amplifierGroups", "iconBounds", "modifierBounds", "symbolSets"
})
public class LibraryModel {

    private final List<ContextModel> contexts = new ArrayList<>();
    private final List<HqtfDummyModel> hqtfDummies = new ArrayList<>();
    private final List<StandardIdentityModel> identities = new ArrayList<>();
    private final List<StandardIdentityGroupModel> identityGroups = new ArrayList<>();
    private final List<StatusModel> statuses = new ArrayList<>();
    private final List<VersionModel> versions = new ArrayList<>();
    private final List<DimensionModel> dimensions = new ArrayList<>();
    private final List<AmplifierModel> amplifiers = new ArrayList<>();
    private final List<AmplifierListModel> amplifierGroups = new ArrayList<>();
    private final List<SymbolSetModel> symbolSets = new ArrayList<>();
    private Map<String, BoundsModel> iconBounds;
    private Map<String, BoundsModel> modifierBounds;
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
        return amplifierGroups.stream()
            .filter(amp -> Objects.equals(amp.getTypeName(), enumType))
            .findFirst()
            .orElseThrow();
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
        return dimensions.stream()
            .filter(dim -> Objects.equals(dim.getId(), key))
            .findFirst()
            .orElseThrow();
    }

    public List<DimensionModel> getDimensions() {
        return dimensions;
    }

    public List<HqtfDummyModel> getHqtfDummies() {
        return hqtfDummies;
    }

    /**
     * Measured bounds for the main icon fragments that carry {@code FREE_CANVAS}, keyed by graphic identifier.
     * <p>
     * Every other main icon is built within the octagon, or is {@code FULL_FRAME} and takes its frame's bounds, so its extent follows from its graphic type and needs no data at
     * all. APP-6E 8.1.3 exempts Control Measures from those composition rules, and a few Cyberspace path and terrain graphics are the same kind of thing, so for those the only way
     * to know the extent is to measure the fragment.
     */
    public Map<String, BoundsModel> getIconBounds() {
        return iconBounds;
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

    /**
     * Measured bounds for the few sector modifier fragments that draw outside the bounding octagon, keyed by graphic identifier - the file stem, which is what
     * {@code ModifierElement.getGraphicIdentifier()} produces. Everything else takes the octagon by rule, so only the exceptions are carried.
     * <p>
     * Keyed by identifier rather than hung off the modifier models because the identifier is derived three different ways - symbol set modifiers, and common modifiers in each
     * sector - and duplicating that derivation in {@code FragmentMeasurer} is what went wrong in jmsfx#52. The measurer scans the directories instead.
     */
    public Map<String, BoundsModel> getModifierBounds() {
        return modifierBounds;
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

    public void setIconBounds(Map<String, BoundsModel> iconBounds) {
        this.iconBounds = iconBounds;
    }

    public void setIconPackage(String iconPackage) {
        this.iconPackage = iconPackage;
    }

    public void setLibraryPrefix(String libraryPrefix) {
        this.libraryPrefix = libraryPrefix;
    }

    public void setModifierBounds(Map<String, BoundsModel> modifierBounds) {
        this.modifierBounds = modifierBounds;
    }

    public void setSymbolSet(SymbolSetModel symbolSet) {
        this.symbolSet = symbolSet;
    }

    public void setTypePackage(String typePackage) {
        this.typePackage = typePackage;
    }

    /*
     * No config block. The generated package names and the library prefix used to be declared here as well as in config-*.yml, and the two were read for different things - this
     * copy is what the templates interpolate into a package statement, while GeneratorConfig decides which directory the file is written to. Disagree and the generator writes a
     * file to one package that declares another, which fails to compile somewhere unrelated rather than reporting a configuration error. See jmsfx#108. GeneratorConfig now owns
     * them and applies them onto this model after parsing, so there is one place to edit. The fields below stay, because the templates read them from here.
     */
}
