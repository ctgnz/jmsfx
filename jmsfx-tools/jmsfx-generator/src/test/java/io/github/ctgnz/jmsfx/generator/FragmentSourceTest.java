package io.github.ctgnz.jmsfx.generator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.startsWith;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.yaml.JmsfxParser;

/**
 * Against the real library, because what needs checking is that the identifiers this derives are the ones the fragments are actually filed under - and a fixture would only prove
 * it agrees with itself. Every fragment the model names has to be found; {@link FragmentSource#collect} refuses the collection outright if one is missing, so a passing test here
 * is the assertion that all of them resolve.
 */
class FragmentSourceTest {

    private static final Path CONFIG = Path.of("../../library/jmsfx-standard/src/main/resources/config.yml");

    private static LibraryModel model;
    private static Path svgRoot;

    @BeforeAll
    static void readTheStandardLibrary() throws IOException {
        GeneratorConfig config = GeneratorConfig.load(CONFIG);
        svgRoot = config.getResourceDir()
            .resolve("svg");
        try (var in = Files.newInputStream(config.getModelFile())) {
            model = new JmsfxParser().readLibraryModel(in);
        }
    }

    @Test
    void findsEveryFragmentTheStandardModelNames() throws IOException {
        FragmentSource.Fragments fragments = FragmentSource.collect(model, svgRoot);

        assertThat(fragments.missing(), is(List.of()));
        assertThat(fragments.markup()
            .size(), is(greaterThan(1500)));
        assertThat(fragments.markup()
            .values(), everyItem(not(nullValue())));
    }

    /** Each category keyed the way the generated classes ask for it: a main icon, a symbol set's own modifier, and the common table's. */
    @Test
    void keysEachCategoryTheWayTheLibraryAsks() throws IOException {
        Map<String, String> fragments = FragmentSource.collect(model, svgRoot)
            .markup();

        assertThat(fragments, hasKey("10110100"));
        assertThat(fragments, hasKey("10011"));
        assertThat(fragments, hasKey("C1100"));
    }

    /** A FULL_FRAME element is four fragments, one per identity group, and all four have to be there. */
    @Test
    void expandsAFullFrameElementPerIdentityGroup() throws IOException {
        Map<String, String> fragments = FragmentSource.collect(model, svgRoot)
            .markup();
        List<String> suffixed = fragments.keySet()
            .stream()
            .filter(key -> key.contains("_"))
            .toList();

        assertThat(suffixed.size(), is(greaterThan(0)));
        assertThat(suffixed.size() % 4, is(0));
    }

    @Test
    void injectsTheContentRootRatherThanTheFile() throws IOException {
        Map<String, String> fragments = FragmentSource.collect(model, svgRoot)
            .markup();

        // No envelope, no scaffolding - the group itself, which is what makes the payload a quarter of
        // the file bytes. The envelope is added back at load time.
        assertThat(fragments.get("10110100"), startsWith("<g"));
        assertThat(fragments.get("10110100"), not(org.hamcrest.Matchers.containsString("id=\"octagon\"")));
        assertThat(fragments.get("10110100"), not(org.hamcrest.Matchers.containsString("<svg")));
    }

    @Test
    void leavesControlMeasuresOut() throws IOException {
        Map<String, String> fragments = FragmentSource.collect(model, svgRoot)
            .markup();

        assertThat(fragments, not(hasKey("25110100")));
    }

    @Test
    void readsNothingFromAFileWithoutThatGroup() {
        assertThat(FragmentSource.contentRoot("<svg><g id=\"main\"><path/></g></svg>", "mod1"), is(nullValue()));
    }

    /** Depth counting, not a lazy match on the first closing tag - these groups nest. */
    @Test
    void takesTheWholeGroupWhenItNests() {
        String svg = "<svg><g id=\"main\"><g id=\"inner\"><path/></g><line/></g></svg>";

        assertThat(FragmentSource.contentRoot(svg, "main"), is("<g id=\"main\"><g id=\"inner\"><path/></g><line/></g>"));
    }

}
