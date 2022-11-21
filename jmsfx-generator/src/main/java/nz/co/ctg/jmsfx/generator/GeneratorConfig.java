package nz.co.ctg.jmsfx.generator;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import nz.co.ctg.jmsfx.generator.model.ContextEnum;
import nz.co.ctg.jmsfx.generator.model.DimensionEnum;
import nz.co.ctg.jmsfx.generator.model.GeometryEnum;
import nz.co.ctg.jmsfx.generator.model.HqtfDummyEnum;
import nz.co.ctg.jmsfx.generator.model.StandardIdentityEnum;
import nz.co.ctg.jmsfx.generator.model.StandardIdentityGroupEnum;
import nz.co.ctg.jmsfx.generator.model.StatusEnum;
import nz.co.ctg.jmsfx.generator.model.VersionEnum;
import nz.co.ctg.jmsfx.generator.schema.Library.Contexts.Context;
import nz.co.ctg.jmsfx.generator.schema.Library.Dimensions.Dimension;
import nz.co.ctg.jmsfx.generator.schema.Library.Geometries.Geometry;
import nz.co.ctg.jmsfx.generator.schema.Library.HQTFDummies.HQTFDummy;
import nz.co.ctg.jmsfx.generator.schema.Library.StandardIdentities.StandardIdentity;
import nz.co.ctg.jmsfx.generator.schema.Library.StandardIdentityGroups.StandardIdentityGroup;
import nz.co.ctg.jmsfx.generator.schema.Library.Statuses.Status;
import nz.co.ctg.jmsfx.generator.schema.Library.Versions.Version;

import freemarker.template.Configuration;

public class GeneratorConfig {
    private Path inputDir;
    private Path outputDir;
    private String basePackage;
    private String libraryFile;
    private String extensionCountryCode;
    private String extensionSymbolSet;
    private List<AmplifierGroupConfig> amplifierGroups;
    private Map<String, String> simpleTypes;
    private Map<String, String> dimensionGraphicLocations;
    private Map<String, String> symbolGraphicLocations;
    private Map<String, List<AmplifierGuideConfig>> amplifierGuides;

    public List<AmplifierGroupConfig> getAmplifierGroups() {
        return amplifierGroups;
    }

    public Map<String, List<AmplifierGuideConfig>> getAmplifierGuides() {
        return amplifierGuides;
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

    public StandardEnumConfig<ContextEnum, Context> getContext() {
        return new StandardEnumConfig<>(ContextEnum.class, Context.class, "Context", "contexts", library -> library.getContexts().getContext());
    }

    public StandardEnumConfig<DimensionEnum, Dimension> getDimension() {
        return new StandardEnumConfig<>(DimensionEnum.class, Dimension.class, "Dimension", "dimensions", library -> library.getDimensions().getDimension());
    }

    public Map<String, String> getDimensionGraphicLocations() {
        return dimensionGraphicLocations;
    }

    public String getExtensionCountryCode() {
        return extensionCountryCode;
    }

    public String getExtensionSymbolSet() {
        return extensionSymbolSet;
    }

    public StandardEnumConfig<GeometryEnum, Geometry> getGeometry() {
        return new StandardEnumConfig<>(GeometryEnum.class, Geometry.class, "Geometry", "geometries", library -> library.getGeometries().getGeometry());
    }

    public StandardEnumConfig<HqtfDummyEnum, HQTFDummy> getHqtfDummy() {
        return new StandardEnumConfig<>(HqtfDummyEnum.class, HQTFDummy.class, "HqtfDummy", "hqtfDummies", library -> library.getHQTFDummies().getHQTFDummy());
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

    public Map<String, String> getSimpleTypes() {
        return simpleTypes;
    }

    public List<StandardEnumConfig<?, ?>> getStandardEnums() {
        return Arrays.asList(getGeometry(), getDimension(), getContext(), getHqtfDummy(), getStatus(), getStandardIdentity(), getStandardIdentityGroup(), getVersion());
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

    public StandardEnumConfig<VersionEnum, Version> getVersion() {
        return new StandardEnumConfig<>(VersionEnum.class, Version.class, "Version", "versions", library -> library.getVersions().getVersion());
    }

    public void setAmplifierGroups(List<AmplifierGroupConfig> amplifierGroups) {
        this.amplifierGroups = amplifierGroups;
    }

    public void setAmplifierGuides(Map<String, List<AmplifierGuideConfig>> amplifierGuides) {
        this.amplifierGuides = amplifierGuides;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public void setDimensionGraphicLocations(Map<String, String> dimensionGraphicLocations) {
        this.dimensionGraphicLocations = dimensionGraphicLocations;
    }

    public void setExtensionCountryCode(String extensionCountryCode) {
        this.extensionCountryCode = extensionCountryCode;
    }

    public void setExtensionSymbolSet(String extensionSymbolSet) {
        this.extensionSymbolSet = extensionSymbolSet;
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

    public void setSimpleTypes(Map<String, String> simpleTypes) {
        this.simpleTypes = simpleTypes;
    }

    public void setSymbolGraphicLocations(Map<String, String> symbolGraphicLocations) {
        this.symbolGraphicLocations = symbolGraphicLocations;
    }
}
