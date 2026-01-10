package io.github.ctgnz.jmsfx.generator;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import freemarker.template.Configuration;

public class GeneratorConfig {
    private Path outputDir;
    private String basePackage = "io.github.ctgnz.jmsfx";
    private String typePackage = "io.github.ctgnz.jmsfx.types";
    private String iconPackage;
    private String commonPackage;
    private String amplifierPackage;
    private String modelFilePath;
    private String libraryPrefix;
    private String libraryFile = "Base.xml";
    private String extensionCountryCode = "000";

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

    public String getExtensionCountryCode() {
        return extensionCountryCode;
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

    public String getLibraryFile() {
        return libraryFile;
    }

    public String getLibraryPrefix() {
        return libraryPrefix;
    }

    public Path getModelFile() throws URISyntaxException {
        return Paths.get(DomainModelGenerator.class.getResource(modelFilePath).toURI());
    }

    public String getModelFilePath() {
        return modelFilePath;
    }

    public Path getOutputDir() {
        return outputDir;
    }

    public List<String> getStandardEnums() {
        return Arrays.asList("VersionEnum", "ContextEnum", "StandardIdentityEnum", "StandardIdentityGroupEnum", "StatusEnum", "HqtfDummyEnum", "DimensionEnum");
    }

    public Configuration getTemplateConfig() throws IOException, URISyntaxException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_30);
        configuration.setDirectoryForTemplateLoading(new File(GeneratorConfig.class.getResource("/templates").toURI()));
        return configuration;
    }

    public String getTypePackage() {
        return typePackage;
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

    public void setExtensionCountryCode(String extensionCountryCode) {
        this.extensionCountryCode = extensionCountryCode;
    }

    public void setIconPackage(String iconPackage) {
        this.iconPackage = iconPackage;
    }

    public void setLibraryFile(String libraryFile) {
        this.libraryFile = libraryFile;
    }

    public void setLibraryPrefix(String libraryPrefix) {
        this.libraryPrefix = libraryPrefix;
    }

    public void setModelFilePath(String modelFilePath) {
        this.modelFilePath = modelFilePath;
    }

    public void setOutputDir(Path outputDir) {
        this.outputDir = outputDir;
    }

    public void setTypePackage(String typePackage) {
        this.typePackage = typePackage;
    }
}
