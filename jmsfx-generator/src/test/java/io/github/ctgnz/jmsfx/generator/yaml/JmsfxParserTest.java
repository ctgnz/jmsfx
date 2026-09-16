package io.github.ctgnz.jmsfx.generator.yaml;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.ctgnz.jmsfx.generator.GeneratorConfig;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.model.SymbolSetModel;
import io.github.ctgnz.jmsfx.generator.model.VersionModel;

/**
 * The {@link LibraryModel} tests read the real {@code model-standard.yml} (jmsfx-generator's own {@code src/main/resources}, on the test classpath) rather than a hand-built
 * fixture - several model classes map YAML through nested {@code @JsonGetter("details")}/{@code @JsonSetter("config")} records (e.g. {@link SymbolSetModel}) while others rely on
 * plain bean properties, and exercising the real, already-working configuration against real production data is a more reliable check of that mapping than guessing at a synthetic
 * fixture's shape. The {@link GeneratorConfig} test uses its own small fixture instead, since the real {@code config.yml}'s {@code outputDir} is a hardcoded absolute Windows path
 * - not portable to read on other platforms.
 */
class JmsfxParserTest {

    private JmsfxParser candidate;

    @BeforeEach
    void setUp() {
        candidate = new JmsfxParser();
    }

    @Test
    void testReadConfigParsesEachField() throws IOException {
        // Not read from the real config.yml here: its outputDir is a hardcoded absolute Windows path, which
        // isn't portable to parse into a Path on other platforms (including CI). A relative path exercises the
        // same field mapping without that portability problem.
        String yaml = """
                        modelFilePath: "/model-standard.yml"
                        outputDir: "build/generated-sources"
                        iconPackage: "io.github.ctgnz.jmsfx.standard"
                        commonPackage: "io.github.ctgnz.jmsfx.standard.common"
                        amplifierPackage: "io.github.ctgnz.jmsfx.standard.amplifier"
                        libraryPrefix: "Standard"
                        """;

        GeneratorConfig config = candidate.readConfig(new ByteArrayInputStream(yaml.getBytes(StandardCharsets.UTF_8)));

        assertThat(config.getModelFilePath(), is("/model-standard.yml"));
        assertThat(config.getOutputDir(), is(Path.of("build/generated-sources")));
        assertThat(config.getIconPackage(), is("io.github.ctgnz.jmsfx.standard"));
        assertThat(config.getCommonPackage(), is("io.github.ctgnz.jmsfx.standard.common"));
        assertThat(config.getAmplifierPackage(), is("io.github.ctgnz.jmsfx.standard.amplifier"));
        assertThat(config.getLibraryPrefix(), is("Standard"));
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
        assertThat(common.getEntities(), hasSize(2));

        var unspecified = common.getEntities()
            .stream()
            .filter(entity -> "UNSPECIFIED".equals(entity.getId()))
            .findFirst()
            .orElseThrow();
        assertThat(unspecified.getEntityTypes(), hasSize(1));
        assertThat(common.getEntitySubTypes(), hasSize(1));
    }

    @Test
    void testReadLibraryModelParsesTopLevelConfigAndVersions() throws IOException {
        LibraryModel library = readRealLibraryModel();

        assertThat(library.getLibraryPrefix(), is("Standard"));
        assertThat(library.getCountryCodeClass(), is("NatoCountryCode"));
        assertThat(library.getIconPackage(), is("io.github.ctgnz.jmsfx.standard"));
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
        assertThat(roundTrippedCommon.getEntities(), hasSize(2));
    }

    private LibraryModel readRealLibraryModel() throws IOException {
        try (InputStream input = getClass().getResourceAsStream("/model-standard.yml")) {
            return candidate.readLibraryModel(input);
        }
    }
}
