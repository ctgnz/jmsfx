package io.github.ctgnz.jmsfx.generator;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import freemarker.template.Configuration;
import io.github.ctgnz.jmsfx.generator.model.ContextModel;
import io.github.ctgnz.jmsfx.generator.model.DimensionModel;
import io.github.ctgnz.jmsfx.generator.model.HqtfDummyModel;
import io.github.ctgnz.jmsfx.generator.model.StandardIdentityGroupModel;
import io.github.ctgnz.jmsfx.generator.model.StandardIdentityModel;
import io.github.ctgnz.jmsfx.generator.model.StatusModel;
import io.github.ctgnz.jmsfx.generator.model.VersionModel;
import io.github.ctgnz.jmsfx.generator.schema.Library.Amplifiers.Amplifier;
import io.github.ctgnz.jmsfx.generator.schema.Library.Contexts.Context;
import io.github.ctgnz.jmsfx.generator.schema.Library.Dimensions.Dimension;
import io.github.ctgnz.jmsfx.generator.schema.Library.HQTFDummies.HQTFDummy;
import io.github.ctgnz.jmsfx.generator.schema.Library.StandardIdentities.StandardIdentity;
import io.github.ctgnz.jmsfx.generator.schema.Library.StandardIdentityGroups.StandardIdentityGroup;
import io.github.ctgnz.jmsfx.generator.schema.Library.Statuses.Status;
import io.github.ctgnz.jmsfx.generator.schema.Library.Versions.Version;

public class GeneratorConfig {
    private Path inputDir;
    private Path outputDir;
    private String basePackage = "io.github.ctgnz.jmsfx";
    private String typePackage = "io.github.ctgnz.jmsfx.types";
    private String iconPackage;
    private String commonPackage;
    private String amplifierPackage;
    private String libraryPrefix;
    private String libraryFile = "Base.xml";
    private String extensionCountryCode = "000";
    private List<String> unframedSymbolSets;
    private List<ListAmplifierConfig> enumeratedAmplifiers;
    private List<StandardAmplifierConfig> standardAmplifiers;
    private Map<String, String> dimensionGraphicLocations;
    private Map<String, String> symbolGraphicLocations;
    private Map<String, String> entitySymbolSets;

    public String getAmplifierPackage() {
        return amplifierPackage;
    }

    public Path getAmplifierPackageDir() throws IOException {
        Path packageDir = outputDir.resolve(amplifierPackage.replaceAll("\\.", "/"));
        if (Files.notExists(packageDir)) {
            Files.createDirectories(packageDir);
        }
        return packageDir;
    }

    @JsonIgnore
    public List<ListAmplifierConfig> getAmplifierValues(Amplifier amplifier) {
        return enumeratedAmplifiers.stream().filter(valConfig -> valConfig.getAmplifier().equals(amplifier.getID())).toList();
    }

    public String getBasePackage() {
        return basePackage;
    }

    public String getCommonPackage() {
        return commonPackage;
    }

    public Path getCommonPackageDir() throws IOException {
        Path packageDir = outputDir.resolve(commonPackage.replaceAll("\\.", "/"));
        if (Files.notExists(packageDir)) {
            Files.createDirectories(packageDir);
        }
        return packageDir;
    }

    public StandardEnumConfig<ContextModel, Context> getContext() {
        return new StandardEnumConfig<>(ContextModel.class, Context.class, "ContextEnum", "contexts", library -> library.getContexts().getContext());
    }

    public String getCountryCodeClass() {
        return enumeratedAmplifiers.stream().filter(amp -> amp.getEnumId().equals("COUNTRY_CODE")).findFirst().map(ListAmplifierConfig::getEnumType).orElse("NatoCountryCode");
    }

    public StandardEnumConfig<DimensionModel, Dimension> getDimension() {
        return new StandardEnumConfig<>(DimensionModel.class, Dimension.class, "DimensionEnum", "dimensions", library -> library.getDimensions().getDimension());
    }

    public Map<String, String> getDimensionGraphicLocations() {
        return dimensionGraphicLocations;
    }

    public Map<String, String> getEntitySymbolSets() {
        return entitySymbolSets;
    }

    public List<ListAmplifierConfig> getEnumeratedAmplifiers() {
        return enumeratedAmplifiers;
    }

    public String getExtensionCountryCode() {
        return extensionCountryCode;
    }

    public StandardEnumConfig<HqtfDummyModel, HQTFDummy> getHqtfDummy() {
        return new StandardEnumConfig<>(HqtfDummyModel.class, HQTFDummy.class, "HqtfDummyEnum", "hqtfDummies", library -> library.getHQTFDummies().getHQTFDummy());
    }

    public String getIconPackage() {
        return iconPackage;
    }

    public Path getIconPackageDir() throws IOException {
        Path packageDir = outputDir.resolve(iconPackage.replaceAll("\\.", "/"));
        if (Files.notExists(packageDir)) {
            Files.createDirectories(packageDir);
        }
        return packageDir;
    }

    public Path getInputDir() {
        return inputDir;
    }

    public String getLibraryFile() {
        return libraryFile;
    }

    public String getLibraryPrefix() {
        return libraryPrefix;
    }

    public Path getOutputDir() {
        return outputDir;
    }

    public List<StandardAmplifierConfig> getStandardAmplifiers() {
        return standardAmplifiers;
    }

    public List<StandardEnumConfig<?, ?>> getStandardEnums() {
        return Arrays.asList(getDimension(), getContext(), getHqtfDummy(), getStatus(), getStandardIdentity(), getStandardIdentityGroup(), getVersion());
    }

    public StandardEnumConfig<StandardIdentityModel, StandardIdentity> getStandardIdentity() {
        return new StandardEnumConfig<>(StandardIdentityModel.class, StandardIdentity.class, "StandardIdentityEnum", "identities",
                                        library -> library.getStandardIdentities().getStandardIdentity());
    }

    public StandardEnumConfig<StandardIdentityGroupModel, StandardIdentityGroup> getStandardIdentityGroup() {
        return new StandardEnumConfig<>(StandardIdentityGroupModel.class, StandardIdentityGroup.class, "StandardIdentityGroupEnum", "identityGroups",
                                        library -> library.getStandardIdentityGroups().getStandardIdentityGroup());
    }

    public StandardEnumConfig<StatusModel, Status> getStatus() {
        return new StandardEnumConfig<>(StatusModel.class, Status.class, "StatusEnum", "statuses", library -> library.getStatuses().getStatus());
    }

    public Map<String, String> getSymbolGraphicLocations() {
        return symbolGraphicLocations;
    }

    public Configuration getTemplateConfig() throws IOException, URISyntaxException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_30);
        configuration.setDirectoryForTemplateLoading(new File(GeneratorConfig.class.getResource("/templates").toURI()));
        return configuration;
    }

    public String getTypePackage() {
        return typePackage;
    }

    public List<String> getUnframedSymbolSets() {
        return unframedSymbolSets;
    }

    public StandardEnumConfig<VersionModel, Version> getVersion() {
        return new StandardEnumConfig<>(VersionModel.class, Version.class, "VersionEnum", "versions", library -> library.getVersions().getVersion());
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

    public void setDimensionGraphicLocations(Map<String, String> dimensionGraphicLocations) {
        this.dimensionGraphicLocations = dimensionGraphicLocations;
    }

    public void setEntitySymbolSets(Map<String, String> entitySymbolSets) {
        this.entitySymbolSets = entitySymbolSets;
    }

    public void setEnumeratedAmplifiers(List<ListAmplifierConfig> amplifierValues) {
        this.enumeratedAmplifiers = amplifierValues;
    }

    public void setExtensionCountryCode(String extensionCountryCode) {
        this.extensionCountryCode = extensionCountryCode;
    }

    public void setIconPackage(String iconPackage) {
        this.iconPackage = iconPackage;
    }

    public void setInputDir(Path inputDir) {
        this.inputDir = inputDir;
    }

    public void setLibraryFile(String libraryFile) {
        this.libraryFile = libraryFile;
    }

    public void setLibraryPrefix(String libraryPrefix) {
        this.libraryPrefix = libraryPrefix;
    }

    public void setOutputDir(Path outputDir) {
        this.outputDir = outputDir;
    }

    public void setStandardAmplifiers(List<StandardAmplifierConfig> amplifierGroups) {
        this.standardAmplifiers = amplifierGroups;
    }

    public void setSymbolGraphicLocations(Map<String, String> symbolGraphicLocations) {
        this.symbolGraphicLocations = symbolGraphicLocations;
    }

    public void setTypePackage(String typePackage) {
        this.typePackage = typePackage;
    }

    public void setUnframedSymbolSets(List<String> unframedSymbolSets) {
        this.unframedSymbolSets = unframedSymbolSets;
    }
}
