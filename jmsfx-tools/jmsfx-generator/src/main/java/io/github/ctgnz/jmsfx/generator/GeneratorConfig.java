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
            return config;
        }
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
     * The library this one extends, named by its {@code libraryPrefix} - {@code Standard}. Absent for a whole model, which is every library but jmsfx-battleorder.
     * <p>
     * A declaration, not a location. Where the base actually is comes from the second argument to {@link DomainModelGenerator}, and this is what that argument is checked against:
     * a positional path is easy to get wrong, and composing one extension onto another would otherwise be completely silent.
     * <p>
     * It used to name the base's module directory and resolve the model by walking up three levels and sideways, with {@code src/main/resources/model.yml} spelled out at the end.
     * That encoded the whole repository layout in one expression and would have broken the moment jmsfx#124 moved the model.
     */
    public String getBaseLibrary() {
        return baseLibrary;
    }

    /** Whether this config describes an overlay to compose onto another library, rather than a model complete in itself. */
    public boolean isOverlay() {
        return baseLibrary != null;
    }

    /**
     * Takes from the base what an overlay has no business restating.
     * <p>
     * Only {@code countryCodeClass}, and only when unset. The packages and the library prefix are what make this library distinct, so inheriting them would be wrong; the country
     * code class names a type generated from the base's own country codes, so an overlay that does not change them has nothing to say about it.
     */
    void inheritFrom(GeneratorConfig base) {
        if (countryCodeClass == null) {
            countryCodeClass = base.getCountryCodeClass();
        }
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

    /** Generated sources, in the module's {@code src/main/java} - the sibling of the model directory this config sits in. */
    public Path getOutputDir() {
        return location.resolveSibling("java");
    }

    /**
     * The library's generator input: the {@code svg} tree, the model, and this config. All of it lives in {@code src/main/model} since jmsfx#124.
     * <p>
     * Deliberately not a resource root, so none of it reaches the jar - which is what the per-pom {@code excludes} used to do for the two yaml files, and could never have done for
     * the fragments while they were still read from the classpath at render time. {@code src/main/resources} still exists next door, holding the service file that names the
     * generated {@code IconLibrary} and nothing else.
     */
    public Path getModelDir() {
        return location;
    }

    /**
     * The library's real resource root, {@code src/main/resources} - which since jmsfx#124 holds the service file naming the generated {@code IconLibrary} and nothing else.
     * <p>
     * Separate from {@link #getModelDir()} because the two now mean different things and one of them ships. Writing the service file relative to the model directory instead put it
     * outside the resource root, where it would have been silently dropped from the jar and taken {@code IconLibrary.discover()} with it.
     */
    public Path getResourcesDir() {
        return location.resolveSibling("resources");
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
