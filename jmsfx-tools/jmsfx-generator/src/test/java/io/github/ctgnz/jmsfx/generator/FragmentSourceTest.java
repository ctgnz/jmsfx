package io.github.ctgnz.jmsfx.generator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.startsWith;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.ctgnz.jmsfx.generator.model.AbstractModel;
import io.github.ctgnz.jmsfx.generator.model.DimensionModel;
import io.github.ctgnz.jmsfx.generator.model.GraphicType;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.model.SymbolSetModel;
import io.github.ctgnz.jmsfx.generator.yaml.JmsfxParser;

/**
 * Against the real library, because what needs checking is that the elements this finds are the ones the fragments are actually filed under - and a fixture would only prove it
 * agrees with itself.
 * <p>
 * The model is re-read for each test rather than shared, because injection mutates it: markup is hung on the elements, so a test that ran earlier would otherwise be visible in a
 * later one.
 */
class FragmentSourceTest {

    private static final Path CONFIG = Path.of("../../library/jmsfx-standard/src/main/model/config.yml");

    private LibraryModel model;
    private Path svgRoot;

    @BeforeEach
    void readTheStandardLibrary() throws IOException {
        GeneratorConfig config = GeneratorConfig.load(CONFIG);
        svgRoot = config.getModelDir()
            .resolve("svg");
        try (var in = Files.newInputStream(config.getModelFile())) {
            model = new JmsfxParser().readLibraryModel(in);
        }
    }

    @Test
    void findsEveryFragmentTheStandardModelNames() throws IOException {
        FragmentSource.Result result = FragmentSource.inject(model, svgRoot);

        assertThat(result.missing(), is(List.of()));
        assertThat(result.injected(), is(greaterThan(1500)));
    }

    /** The markup ends up on the element that draws it, which is the whole point - no table, and nothing keyed on a filename. */
    @Test
    void hangsTheMarkupOnTheElement() throws IOException {
        FragmentSource.inject(model, svgRoot);

        String markup = anEntityOf("Land Units").getGraphicMarkup();

        assertThat(markup, not(nullValue()));
        assertThat(markup, startsWith("<g"));
    }

    /** The content root only: no envelope, and none of the scaffolding that is three quarters of the file. */
    @Test
    void injectsTheContentRootRatherThanTheFile() throws IOException {
        FragmentSource.inject(model, svgRoot);

        String markup = anEntityOf("Land Units").getGraphicMarkup();

        assertThat(markup, not(containsString("id=\"octagon\"")));
        assertThat(markup, not(containsString("<svg")));
    }

    /** A FULL_FRAME element is four drawings, one per identity group, because the icon is the frame. */
    @Test
    void givesAFullFrameElementOnePerIdentityGroup() throws IOException {
        FragmentSource.inject(model, svgRoot);

        AbstractModel fullFrame = model.getSymbolSets()
            .stream()
            .flatMap(set -> set.getEntityTypes()
                .stream())
            .filter(type -> type.getGraphicType() == GraphicType.FULL_FRAME)
            .findFirst()
            .orElseThrow();

        assertThat(fullFrame.getGraphicMarkupByKey()
            .keySet(), hasSize(4));
        assertThat(fullFrame.getGraphicMarkup(), is(nullValue()));
    }

    /**
     * A frame hangs off the dimension, keyed by identity and status frame id - the third key shape, and the one that made frames a separate problem from main icons (jmsfx#123).
     * Land Unit is dimension 10, so identity 3 confirmed and present is the key "30".
     */
    @Test
    void hangsAFrameOnItsDimension() throws IOException {
        FragmentSource.inject(model, svgRoot);

        Map<String, String> frames = dimension("LAND_UNIT").getGraphicMarkupByKey();

        assertThat(frames.get("30"), startsWith("<g id=\"frame\""));
        assertThat(frames.keySet(), hasItems("00", "30", "60"));
    }

    /** Civilian frames were removed at jmsfx#123 and are derived from the military one at load time, so nothing should be injected under a "c" key. */
    @Test
    void injectsNoCivilianFrame() throws IOException {
        FragmentSource.inject(model, svgRoot);

        assertThat(dimension("LAND_UNIT").getGraphicMarkupByKey()
            .keySet()
            .stream()
            .filter(key -> key.endsWith("c"))
            .toList(), is(List.of()));
    }

    @Test
    void givesAModifierItsOwnMarkup() throws IOException {
        FragmentSource.inject(model, svgRoot);

        AbstractModel modifier = symbolSet("Land Units").getSectorOneMods()
            .stream()
            .filter(mod -> mod.getGraphicMarkup() != null)
            .findFirst()
            .orElseThrow();

        assertThat(modifier.getGraphicMarkup(), startsWith("<g"));
    }

    @Test
    void readsNothingFromAFileWithoutThatGroup() {
        assertThat(FragmentSource.contentRoot("<svg><g id=\"main\"><path/></g></svg>", "mod1"), is(nullValue()));
    }

    /**
     * An empty content root is legitimate and has to survive extraction.
     * <p>
     * "General" in the Dismounted set is effectively a synonym for Unknown and draws an empty frame, so its fragment is {@code <g id="main"/>}. Treating a self-closing tag as
     * something to skip left the depth count open and reported the fragment as having no content.
     */
    @Test
    void takesAnEmptySelfClosingGroup() {
        assertThat(FragmentSource.contentRoot("<svg><g id=\"octagon\"/><g id=\"main\"/></svg>", "main"), is("<g id=\"main\"/>"));
    }

    /** Depth counting, not a lazy match on the first closing tag - these groups nest. */
    @Test
    void takesTheWholeGroupWhenItNests() {
        String svg = "<svg><g id=\"main\"><g id=\"inner\"><path/></g><line/></g></svg>";

        assertThat(FragmentSource.contentRoot(svg, "main"), is("<g id=\"main\"><g id=\"inner\"><path/></g><line/></g>"));
    }

    private DimensionModel dimension(String id) {
        return model.getDimensions()
            .stream()
            .filter(dim -> id.equals(dim.getId()))
            .findFirst()
            .orElseThrow();
    }

    private AbstractModel anEntityOf(String label) {
        return symbolSet(label).getEntities()
            .stream()
            .filter(entity -> entity.getGraphicMarkup() != null)
            .findFirst()
            .orElseThrow();
    }

    private SymbolSetModel symbolSet(String label) {
        return model.getSymbolSets()
            .stream()
            .filter(set -> label.equals(set.getLabel()))
            .findFirst()
            .orElseThrow();
    }

}
