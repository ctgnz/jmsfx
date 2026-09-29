package io.github.ctgnz.jmsfx.generator.yaml;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.ctgnz.jmsfx.generator.GeneratorConfig;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.model.SymbolSetModel;
import io.github.ctgnz.jmsfx.generator.model.VersionModel;

/**
 * These tests read the real files rather than hand-built fixtures - several model classes map YAML through nested {@code @JsonGetter("details")}/{@code @JsonSetter("config")}
 * records (e.g. {@link SymbolSetModel}) while others rely on plain bean properties, and exercising the real, already-working configuration against real production data is a more
 * reliable check of that mapping than guessing at a synthetic fixture's shape.
 * <p>
 * The config test used a synthetic fixture until jmsfx#116, because the real {@code config.yml} carried absolute Windows paths that would not parse anywhere else. It now carries
 * no paths at all, so the real one can be read - which is worth more, since a config that cannot be asserted against is a config whose format nothing checks.
 */
class JmsfxParserTest {

    private static final Path STANDARD_CONFIG = Path.of("../../library/jmsfx-standard/src/main/model/config.yml");

    private JmsfxParser candidate;

    @BeforeEach
    void setUp() {
        candidate = new JmsfxParser();
    }

    @Test
    void testReadConfigParsesEachField() throws IOException {
        GeneratorConfig config = GeneratorConfig.load(STANDARD_CONFIG);

        assertThat(config.getIconPackage(), is("io.github.ctgnz.jmsfx.standard"));
        assertThat(config.getCommonPackage(), is("io.github.ctgnz.jmsfx.standard.common"));
        assertThat(config.getAmplifierPackage(), is("io.github.ctgnz.jmsfx.standard.amplifier"));
        assertThat(config.getCountryCodeClass(), is("NatoCountryCode"));
        assertThat(config.getLibraryPrefix(), is("Standard"));
    }

    /** The paths the config no longer carries, derived from where it was loaded from. This is what jmsfx#116 replaced three absolute paths with. */
    @Test
    void testDerivesEveryPathFromTheConfigsOwnLocation() throws IOException {
        GeneratorConfig config = GeneratorConfig.load(STANDARD_CONFIG);
        Path library = STANDARD_CONFIG.getParent()
            .toAbsolutePath()
            .normalize();

        assertThat(config.getModelDir(), is(library));
        assertThat(config.getModelFile(), is(library.resolve("model.yml")));
        assertThat(config.getOutputDir(), is(library.resolveSibling("java")));
    }

    @Test
    void testRefusesAConfigThatIsNotThere() {
        assertThrows(IllegalArgumentException.class, () -> GeneratorConfig.load(Path.of("no/such/config.yml")));
    }

    @Test
    void testReadLibraryModelParsesSymbolSetDetailsAndNestedEntities() throws IOException {
        LibraryModel library = readRealLibraryModel();

        SymbolSetModel common = library.getSymbolSets()
            .stream()
            .filter(sym -> "COMMON".equals(sym.getId()))
            .findFirst()
            .orElseThrow();

        assertThat(common.getCode(), is("00"));
        assertThat(common.getDimensionId(), is("COMMON"));
        assertThat(common.getLabel(), is("Common"));
        assertThat(common.isUseFrame(), is(true));
        assertThat(common.getEntities(), hasSize(3));

        var unspecified = common.getEntities()
            .stream()
            .filter(entity -> "UNSPECIFIED".equals(entity.getId()))
            .findFirst()
            .orElseThrow();
        assertThat(unspecified.getEntityTypes(), hasSize(1));
        assertThat(common.getEntitySubTypes(), hasSize(1));
    }

    /**
     * The naming a library is generated under is no longer in the model file, so the parser does not supply it - {@code DomainModelGenerator.parse} stamps it on from
     * {@code config-*.yml} afterwards. See jmsfx#108. Asserted as absent here rather than dropped silently, because a model file growing a {@code config:} block again is exactly
     * the regression this is guarding.
     */
    @Test
    void testReadLibraryModelLeavesGenerationNamingToTheConfig() throws IOException {
        LibraryModel library = readRealLibraryModel();

        assertThat(library.getLibraryPrefix(), is(nullValue()));
        assertThat(library.getCountryCodeClass(), is(nullValue()));
        assertThat(library.getIconPackage(), is(nullValue()));
    }

    @Test
    void testReadLibraryModelParsesVersions() throws IOException {
        LibraryModel library = readRealLibraryModel();

        assertThat(library.getVersions(), hasSize(4));

        VersionModel original = library.getVersions()
            .get(0);
        assertThat(original.getId(), is("ORIGINAL"));
        assertThat(original.getCode(), is("10"));
        assertThat(original.getLabel(), is("APP-6(D)/MIL-STD-2525D October 2017"));
    }

    @Test
    void testWriteLibraryModelRoundTripsThroughYaml() throws IOException {
        LibraryModel original = readRealLibraryModel();

        String written = candidate.writeLibraryModel(original);
        LibraryModel roundTripped = candidate.readLibraryModel(new ByteArrayInputStream(written.getBytes(StandardCharsets.UTF_8)));

        assertThat(roundTripped.getVersions(), hasSize(original.getVersions()
            .size()));
        assertThat(roundTripped.getSymbolSets(), hasSize(original.getSymbolSets()
            .size()));
        assertThat(roundTripped.getLibraryPrefix(), is(original.getLibraryPrefix()));

        SymbolSetModel roundTrippedCommon = roundTripped.getSymbolSets()
            .stream()
            .filter(sym -> "COMMON".equals(sym.getId()))
            .findFirst()
            .orElseThrow();
        assertThat(roundTrippedCommon.getLabel(), is("Common"));
        assertThat(roundTrippedCommon.getEntities(), hasSize(3));
    }

    /**
     * Read from the library module rather than the classpath: since jmsfx#116 the model lives with the library it describes, which is not on this module's classpath and cannot be.
     * Relative to this module, which is where surefire runs.
     */
    private LibraryModel readRealLibraryModel() throws IOException {
        try (InputStream input = Files.newInputStream(STANDARD_CONFIG.resolveSibling("model.yml"))) {
            return candidate.readLibraryModel(input);
        }
    }
}
