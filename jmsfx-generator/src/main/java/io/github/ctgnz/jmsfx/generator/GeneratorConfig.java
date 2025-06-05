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
import io.github.ctgnz.jmsfx.generator.model.ContextEnum;
import io.github.ctgnz.jmsfx.generator.model.DimensionEnum;
import io.github.ctgnz.jmsfx.generator.model.HqtfDummyEnum;
import io.github.ctgnz.jmsfx.generator.model.StandardIdentityEnum;
import io.github.ctgnz.jmsfx.generator.model.StandardIdentityGroupEnum;
import io.github.ctgnz.jmsfx.generator.model.StatusEnum;
import io.github.ctgnz.jmsfx.generator.model.VersionEnum;
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
    private String basePackage;
    private String iconPackage;
    private String commonPackage;
    private String amplifierPackage;
    private String libraryFile;
    private String extensionCountryCode;
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

    public Path getBasePackageDir() throws IOException {
        Path packageDir = outputDir.resolve(basePackage.replaceAll("\\.", "/"));
        if (Files.notExists(packageDir)) {
            Files.createDirectories(packageDir);
        }
        return packageDir;
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

    public StandardEnumConfig<ContextEnum, Context> getContext() {
        return new StandardEnumConfig<>(ContextEnum.class, Context.class, "Context", "contexts", library -> library.getContexts().getContext());
    }

    public StandardEnumConfig<DimensionEnum, Dimension> getDimension() {
        return new StandardEnumConfig<>(DimensionEnum.class, Dimension.class, "Dimension", "dimensions", library -> library.getDimensions().getDimension());
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

    public StandardEnumConfig<HqtfDummyEnum, HQTFDummy> getHqtfDummy() {
        return new StandardEnumConfig<>(HqtfDummyEnum.class, HQTFDummy.class, "HqtfDummy", "hqtfDummies", library -> library.getHQTFDummies().getHQTFDummy());
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

    public Path getOutputDir() {
        return outputDir;
    }

    public List<StandardAmplifierConfig> getStandardAmplifiers() {
        return standardAmplifiers;
    }

    public List<StandardEnumConfig<?, ?>> getStandardEnums() {
        return Arrays.asList(getDimension(), getContext(), getHqtfDummy(), getStatus(), getStandardIdentity(), getStandardIdentityGroup(), getVersion());
    }

    public StandardEnumConfig<StandardIdentityEnum, StandardIdentity> getStandardIdentity() {
        return new StandardEnumConfig<>(StandardIdentityEnum.class, StandardIdentity.class, "StandardIdentity", "identities",
                                        library -> library.getStandardIdentities().getStandardIdentity());
    }

    public StandardEnumConfig<StandardIdentityGroupEnum, StandardIdentityGroup> getStandardIdentityGroup() {
        return new StandardEnumConfig<>(StandardIdentityGroupEnum.class, StandardIdentityGroup.class, "StandardIdentityGroup", "identityGroups",
                                        library -> library.getStandardIdentityGroups().getStandardIdentityGroup());
    }

    public StandardEnumConfig<StatusEnum, Status> getStatus() {
        return new StandardEnumConfig<>(StatusEnum.class, Status.class, "Status", "statuses", library -> library.getStatuses().getStatus());
    }

    public Map<String, String> getSymbolGraphicLocations() {
        return symbolGraphicLocations;
    }

    public Configuration getTemplateConfig() throws IOException, URISyntaxException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_30);
        configuration.setDirectoryForTemplateLoading(new File(GeneratorConfig.class.getResource("/templates").toURI()));
        return configuration;
    }

    public List<String> getUnframedSymbolSets() {
        return unframedSymbolSets;
    }

    public StandardEnumConfig<VersionEnum, Version> getVersion() {
        return new StandardEnumConfig<>(VersionEnum.class, Version.class, "Version", "versions", library -> library.getVersions().getVersion());
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

    public void setOutputDir(Path outputDir) {
        this.outputDir = outputDir;
    }

    public void setStandardAmplifiers(List<StandardAmplifierConfig> amplifierGroups) {
        this.standardAmplifiers = amplifierGroups;
    }

    public void setSymbolGraphicLocations(Map<String, String> symbolGraphicLocations) {
        this.symbolGraphicLocations = symbolGraphicLocations;
    }

    public void setUnframedSymbolSets(List<String> unframedSymbolSets) {
        this.unframedSymbolSets = unframedSymbolSets;
    }
}
