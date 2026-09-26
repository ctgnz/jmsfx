package io.github.ctgnz.jmsfx.generator;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import io.github.ctgnz.jmsfx.generator.yaml.JmsfxParser;

/**
 * Where a library is generated, and under what names.
 * <p>
 * Since jmsfx#116 this file lives in the library module it describes, beside the model it generates from and the SVG fragments that model carries bounds for - so it no longer has
 * to say where any of them are. The model is {@code model.yml} next to it, the resources it writes are the directory holding it, and the generated sources go in that directory's
 * sibling {@code java}.
 * <p>
 * Those used to be three configured paths, and absolute ones: machine-specific enough that {@code GeneratorConfigTest} could not assert against the real file and CLAUDE.md had to
 * warn about them. They are now derived from wherever the config was loaded from, and the file carries nothing but naming - which also means the same file works on a CI runner and
 * on anyone's clone.
 */
public class GeneratorConfig {

    /**
     * Reads a config from the filesystem, remembering where it came from.
     * <p>
     * Deliberately not a classpath resource. A config that lives in the library module it describes can never be on the generator's own classpath - the dependency runs the other
     * way, and making it circular is not an option - so loading by path is precisely what lets the file sit with the model and the fragments it belongs to.
     */
    public static GeneratorConfig load(Path configFile) throws IOException {
        Path absolute = configFile.toAbsolutePath()
            .normalize();
        if (Files.notExists(absolute)) {
            throw new IllegalArgumentException("no generator config at " + absolute);
        }
        try (InputStream stream = Files.newInputStream(absolute)) {
            GeneratorConfig config = new JmsfxParser().readConfig(stream);
            config.location = absolute.getParent();
            config.inheritFromBase();
            return config;
        }
    }

    /**
     * Takes from the base library's config what an overlay has no business restating.
     * <p>
     * Only {@code countryCodeClass}, and only when unset. The packages and the library prefix are what make this library distinct, so inheriting them would be wrong; the country
     * code class names a type generated from the base's own country codes, so an overlay that does not change them has nothing to say about it. Naming it anyway in every overlay
     * would be the duplication jmsfx#108 removed, one level up.
     */
    private void inheritFromBase() throws IOException {
        if (baseLibrary == null || countryCodeClass != null) {
            return;
        }
        countryCodeClass = load(getBaseModelFile().resolveSibling("config.yml")).getCountryCodeClass();
    }

    /** The directory the config was loaded from, which every path below is derived from. */
    private Path location;
    private String basePackage = "io.github.ctgnz.jmsfx";
    private String typePackage = "io.github.ctgnz.jmsfx.types";
    private String iconPackage;
    private String commonPackage;
    private String amplifierPackage;
    private String libraryPrefix;
    private String countryCodeClass;
    private String baseLibrary;
    private String libraryFile = "Base.xml";
    private String extensionCountryCode = "000";

    public String getAmplifierPackage() {
        return amplifierPackage;
    }

    public Path getAmplifierPackageDir() throws IOException {
        return packageDir(amplifierPackage);
    }

    /**
     * The library this one extends, named by its module directory - {@code jmsfx-standard}. Absent for a whole model, which is every library until jmsfx#81.
     * <p>
     * A module name rather than a path to the model, because the layout is already a convention jmsfx#116 relies on everywhere else here: a library's model is
     * {@code <module>/src/main/resources/model.yml}, and its modules are siblings under {@code library}. Spelling out
     * {@code ../../../../jmsfx-standard/src/main/resources/model.yml} would say the same thing less clearly and break if the tree moved.
     */
    public String getBaseLibrary() {
        return baseLibrary;
    }

    /** The model this one composes onto, or null when it is a whole model in its own right. */
    public Path getBaseModelFile() {
        return baseLibrary == null ? null
            : location.getParent()
                .getParent()
                .getParent()
                .resolveSibling(baseLibrary)
                .resolve("src/main/resources/model.yml");
    }

    public String getBasePackage() {
        return basePackage;
    }

    public String getCommonPackage() {
        return commonPackage;
    }

    public Path getCommonPackageDir() throws IOException {
        return packageDir(commonPackage);
    }

    public String getCountryCodeClass() {
        return countryCodeClass;
    }

    public String getExtensionCountryCode() {
        return extensionCountryCode;
    }

    public String getIconPackage() {
        return iconPackage;
    }

    public Path getIconPackageDir() throws IOException {
        return packageDir(iconPackage);
    }

    public String getLibraryFile() {
        return libraryFile;
    }

    public String getLibraryPrefix() {
        return libraryPrefix;
    }

    /**
     * The model this library generates from: {@code model.yml} beside the config.
     * <p>
     * One path where there used to be two. {@code modelFilePath} resolved the model from the classpath for reading and {@code modelSourceFile} named it on disk for
     * {@link FragmentMeasurer} to write measured bounds back to - the same file by two mechanisms, with nothing checking they agreed. Reading from the source tree serves both.
     */
    public Path getModelFile() {
        return location.resolve("model.yml");
    }

    /** Generated sources, in the module's {@code src/main/java} - the sibling of the resources directory this config sits in. */
    public Path getOutputDir() {
        return location.resolveSibling("java");
    }

    /** The resources this library owns: the {@code svg} tree, and the service file naming its generated {@code IconLibrary}. The config sits in it. */
    public Path getResourceDir() {
        return location;
    }

    public List<String> getStandardEnums() {
        return Arrays.asList("VersionEnum", "ContextEnum", "StandardIdentityEnum", "StandardIdentityGroupEnum", "StatusEnum", "HqtfDummyEnum", "DimensionEnum");
    }

    public Configuration getTemplateConfig() throws IOException, URISyntaxException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_30);
        configuration.setDirectoryForTemplateLoading(new File(GeneratorConfig.class.getResource("/templates")
            .toURI()));
        // FreeMarker's default handler writes the error into the output and carries on, which for a code
        // generator means a .java file containing a stack trace where an import should be. That is how a
        // config missing countryCodeClass produced 179 files of which one was garbage, caught by javac
        // rather than by generation. A template that cannot resolve something should stop.
        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        return configuration;
    }

    public String getTypePackage() {
        return typePackage;
    }

    public void setAmplifierPackage(String amplifierPackage) {
        this.amplifierPackage = amplifierPackage;
    }

    public void setBaseLibrary(String baseLibrary) {
        this.baseLibrary = baseLibrary;
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

    public void setTypePackage(String typePackage) {
        this.typePackage = typePackage;
    }

    /** Created on demand, because the generator writes into it straight after asking. */
    private Path packageDir(String packageName) throws IOException {
        Path packageDir = getOutputDir().resolve(packageName.replace('.', '/'));
        if (Files.notExists(packageDir)) {
            Files.createDirectories(packageDir);
        }
        return packageDir;
    }

    /** Only for a config assembled in a test, which has no file to have been loaded from. */
    void setLocation(Path location) {
        this.location = location;
    }

}
