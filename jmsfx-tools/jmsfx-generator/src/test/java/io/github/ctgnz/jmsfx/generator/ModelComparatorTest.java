package io.github.ctgnz.jmsfx.generator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.yaml.JmsfxParser;

/**
 * Small hand-written models rather than the real ones, because what needs testing is the classification of a <em>difference</em>, and the real models differ in exactly one way -
 * which would leave every other branch unexercised. {@code JmsfxParserTest} takes the opposite approach for the opposite reason.
 */
class ModelComparatorTest {

    /** One symbol set, one entity with a type and sub-type, and the two common-modifier groups that share a code. */
    private static final String BASE = """
                    symbolSets:
                    - details: {code: "00", dimensionId: COMMON, id: COMMON, label: "Common"}
                      config: {useFrame: true}
                      entities:
                      - details: {code: "00", id: UNSPECIFIED, graphicType: NA, label: "Unspecified"}
                        entityTypes:
                        - details: {code: "01", id: A_TYPE, graphicType: NA, label: "A Type"}
                          entitySubTypes:
                          - details: {code: "02", id: A_SUB_TYPE, graphicType: NA, label: "A Sub Type"}
                      sectorOneMods:
                      - details: {groupId: 1, code: "00", category: Mobility, id: ROBOTIC, label: "Robotic"}
                      - details: {groupId: 2, code: "00", category: MissionArea, id: BOMBER, label: "Bomber"}
                    """;

    private final ModelComparator comparator = new ModelComparator();
    private final JmsfxParser parser = new JmsfxParser();

    @Test
    void acceptsAModelIdenticalToTheBase() throws IOException {
        assertThat(comparator.compare(model(BASE), model(BASE)), is(true));
    }

    @Test
    void acceptsAnOverlayThatOnlyAdds() throws IOException {
        String overlay = BASE.replace("""
                          - details: {groupId: 2, code: "00", category: MissionArea, id: BOMBER, label: "Bomber"}
                        """, """
                          - details: {groupId: 2, code: "00", category: MissionArea, id: BOMBER, label: "Bomber"}
                          - details: {groupId: 2, code: "01", category: MissionArea, id: FIGHTER, label: "Fighter"}
                        """);

        assertThat(comparator.compare(model(BASE), model(overlay)), is(true));
    }

    /**
     * Setting a field the base left unset introduces an amplifier rather than changing what anything means, and is the one in-place difference the historical model actually has.
     */
    @Test
    void acceptsAnOverlayThatFillsInAnUnsetField() throws IOException {
        String overlay = BASE.replace("config: {useFrame: true}", "config: {useFrame: true, amplifierTwoClass: EquipmentMobility}");

        assertThat(comparator.compare(model(BASE), model(overlay)), is(true));
    }

    @Test
    void rejectsAnOverlayThatChangesASetField() throws IOException {
        String overlay = BASE.replace("config: {useFrame: true}", "config: {useFrame: false}");

        assertThat(comparator.compare(model(BASE), model(overlay)), is(false));
    }

    @Test
    void rejectsAnOverlayThatRenamesASharedElement() throws IOException {
        String overlay = BASE.replace("id: A_SUB_TYPE", "id: RENAMED_SUB_TYPE");

        assertThat(comparator.compare(model(BASE), model(overlay)), is(false));
    }

    @Test
    void rejectsAnOverlayThatDropsASharedElement() throws IOException {
        String overlay = BASE.replace("""
                          - details: {groupId: 2, code: "00", category: MissionArea, id: BOMBER, label: "Bomber"}
                        """, "");

        assertThat(comparator.compare(model(BASE), model(overlay)), is(false));
    }

    /**
     * SIDC digit 21 selects which common table a sector-one modifier comes from, so a group id is part of a modifier's identity. Keying on the code alone made these two collide
     * and reported the collision as an alteration - twenty-five times over against the real models.
     */
    @Test
    void doesNotConfuseTwoCommonModifiersSharingACode() throws IOException {
        assertThat(comparator.compare(model(BASE), model(BASE)), is(true));

        String overlay = BASE.replace("id: BOMBER, label: \"Bomber\"", "id: CHANGED, label: \"Changed\"");
        assertThat(comparator.compare(model(BASE), model(overlay)), is(false));
    }

    private LibraryModel model(String yaml) throws IOException {
        return parser.readLibraryModel(new ByteArrayInputStream(yaml.getBytes(StandardCharsets.UTF_8)));
    }

}
