package io.github.ctgnz.jmsfx.generator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.github.ctgnz.jmsfx.generator.model.AbstractModel;
import io.github.ctgnz.jmsfx.generator.model.AmplifierListModel;
import io.github.ctgnz.jmsfx.generator.model.EntityModel;
import io.github.ctgnz.jmsfx.generator.model.EntityTypeModel;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.model.SymbolSetModel;
import io.github.ctgnz.jmsfx.generator.yaml.JmsfxParser;

/**
 * Compares two symbology models element by element, and reports whether one is a true superset of the other.
 * <p>
 * This is the model-level counterpart of {@link FragmentComparator}, and exists for jmsfx#81. Generating a library from a base model plus an extension overlay is only sound if an
 * overlay is purely <em>additive</em> - it may introduce elements the base does not have, and may not remove, rename or alter one the base does. That is a deliberate rule rather
 * than an accident of how the models happen to relate today, so it wants enforcing rather than assuming: an overlay that quietly changed a shared element would produce a library
 * whose codes no longer mean what the standard says they mean, and nothing downstream would notice.
 * <p>
 * Elements are keyed by their position in the model rather than by identity, because a code is only unique within its parent - an entity type's code is SIDC positions 13-14, which
 * repeat under every entity. So the key is the path that reaches it, {@code symbolSet/10/entity/11/type/01}, which is both unique and readable in a report.
 * <p>
 * What counts as "altered" is every scalar field the element itself carries, taken from its serialised form rather than from a hand-written list of properties - so a field added
 * to a model class in future is compared without anyone having to remember to come back here. Child collections are excluded, or every parent of an added element would be reported
 * as altered too, which is exactly the noise this is meant to cut through.
 *
 * <pre>
 * java io.github.ctgnz.jmsfx.generator.ModelComparator [/config.yml] [/config-historical.yml]
 * </pre>
 *
 * Reports only; nothing is written.
 * <p>
 * No longer bound to {@code verify}. Since jmsfx#137 every extension is an overlay composed onto its base, so the superset property holds by construction and a build-time check of
 * it asserts what composition already guarantees. What the tool is still good for is answering what an extension actually adds, and comparing two whole models - which is how the
 * shape of jmsfx#137 was worked out in the first place. Run it by hand:
 *
 * <pre>
 * java io.github.ctgnz.jmsfx.generator.ModelComparator library/jmsfx-standard/.../config.yml library/jmsfx-historical/.../config.yml
 * </pre>
 */
public class ModelComparator {

    /**
     * Fields holding an element's children rather than its own data.
     * <p>
     * {@code symbolSets} is deliberately absent: on {@link AmplifierListModel} it is a list of the sets an amplifier applies to, which is data worth comparing, and no element type
     * uses the name for children.
     */
    private static final Set<String> CHILD_FIELDS = Set.of("entities", "entityTypes", "entitySubTypes", "values", "sectorOneMods", "sectorTwoMods", "amplifierGuides");

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("usage: ModelComparator <base>/config.yml <overlay>/config.yml");
            return;
        }
        new ModelComparator().check(Path.of(args[0]), Path.of(args[1]));
    }

    /**
     * Compares the two, and throws when the overlay is not a true superset.
     * <p>
     * Thrown rather than exited, because this runs in Maven's own JVM under {@code exec:java}: {@code System.exit} takes that JVM down where it stands, which ends the reactor
     * silently after whichever module was current and still reports success. Four of eleven modules built that way before it was noticed. {@link FragmentShapeChecker} carries the
     * same warning, and it is worth heeding.
     */
    public void check(Path baseConfig, Path overlayConfig) throws Exception {
        if (!compare(baseConfig, overlayConfig)) {
            throw new IllegalStateException("The extension model is not a true superset of the base - see the removed and altered elements listed above, and jmsfx#81.");
        }
    }

    private final JmsfxParser parser = new JmsfxParser();
    private final ObjectMapper mapper = new ObjectMapper();

    /** @return true when the overlay model is a true superset of the base. */
    public boolean compare(Path baseConfig, Path extensionConfig) throws Exception {
        LibraryModel base = read(baseConfig);
        GeneratorConfig extension = GeneratorConfig.load(extensionConfig);
        LibraryModel model = read(extensionConfig);
        if (extension.isOverlay()) {
            // Composed first, or this compares a whole model against a few hundred additions and reports
            // the entire base as removed. Since jmsfx#137 both extensions are overlays, so this is the
            // normal path rather than the exception.
            System.out.format("Composing %s onto the base first%n", extension.getLibraryPrefix());
            model = new ModelComposer().compose(read(baseConfig), model);
            base = read(baseConfig);
        }
        return compare(base, model);
    }

    /** @return true when the overlay model is a true superset of the base. */
    public boolean compare(LibraryModel base, LibraryModel overlay) {
        Map<String, ObjectNode> baseElements = index(base);
        Map<String, ObjectNode> overlayElements = index(overlay);

        List<String> removed = new ArrayList<>();
        List<String> altered = new ArrayList<>();
        List<String> extended = new ArrayList<>();
        int identical = 0;

        for (Map.Entry<String, ObjectNode> entry : baseElements.entrySet()) {
            ObjectNode counterpart = overlayElements.get(entry.getKey());
            if (counterpart == null) {
                removed.add(entry.getKey());
                continue;
            }
            Difference difference = difference(entry.getValue(), counterpart);
            if (difference.isEmpty()) {
                identical++;
            } else if (difference.isAdditiveOnly()) {
                extended.add(String.format("%s  %s", entry.getKey(), String.join(", ", difference.additions())));
            } else {
                altered.add(String.format("%s  %s", entry.getKey(), String.join(", ", difference.alterations())));
            }
        }

        List<String> added = new ArrayList<>(overlayElements.keySet());
        added.removeAll(baseElements.keySet());

        report(baseElements.size(), overlayElements.size(), identical, added, extended, removed, altered);
        return removed.isEmpty() && altered.isEmpty();
    }

    private void report(int baseSize, int overlaySize, int identical, List<String> added, List<String> extended, List<String> removed, List<String> altered) {
        System.out.format("base     %d elements%n", baseSize);
        System.out.format("overlay  %d elements%n%n", overlaySize);
        System.out.format("  shared, identical  %d%n", identical);
        System.out.format("  added by overlay   %d%n", added.size());
        System.out.format("  extended in place  %d   (a field the base left unset)%n", extended.size());
        System.out.format("  removed            %d%s%n", removed.size(), removed.isEmpty() ? "" : "   <- not additive");
        System.out.format("  altered            %d%s%n", altered.size(), altered.isEmpty() ? "" : "   <- not additive");

        extended.forEach(entry -> System.out.format("%n  extended: %s", entry));
        System.out.println();
        removed.forEach(key -> System.out.format("%n  removed: %s", key));
        altered.forEach(entry -> System.out.format("%n  altered: %s", entry));
        if (!removed.isEmpty() || !altered.isEmpty()) {
            System.out.format("%n%nAn overlay may only add. See jmsfx#81.%n");
        }
    }

    /**
     * How two versions of the same element differ, split by whether the difference is additive.
     * <p>
     * Setting a field the base left empty is an addition, not an alteration: the historical model binds {@code frameAmplifierClass} and {@code amplifierTwoClass} on symbol sets
     * where the standard leaves them unset, which introduces an amplifier rather than changing the meaning of anything. Overwriting a value the base had set is the case that must
     * fail, because then a code means something different depending on which library answered.
     * <p>
     * Nested objects are flattened to dotted paths, so a symbol set reports {@code config.frameAmplifierClass: null -> "ServiceTier"} rather than two whole config blocks for the
     * reader to diff by eye.
     */
    private record Difference(List<String> additions, List<String> alterations) {

        boolean isEmpty() {
            return additions.isEmpty() && alterations.isEmpty();
        }

        boolean isAdditiveOnly() {
            return alterations.isEmpty();
        }
    }

    private Difference difference(ObjectNode left, ObjectNode right) {
        Map<String, JsonNode> before = flatten(left);
        Map<String, JsonNode> after = flatten(right);
        List<String> additions = new ArrayList<>();
        List<String> alterations = new ArrayList<>();
        Set<String> fields = new TreeSet<>(before.keySet());
        fields.addAll(after.keySet());
        for (String field : fields) {
            JsonNode a = before.get(field);
            JsonNode b = after.get(field);
            if (a == null ? b == null : a.equals(b)) {
                continue;
            }
            String described = String.format("%s: %s -> %s", field, a, b);
            if (isAbsent(a) && !isAbsent(b)) {
                additions.add(described);
            } else {
                alterations.add(described);
            }
        }
        return new Difference(additions, alterations);
    }

    private static boolean isAbsent(JsonNode node) {
        return node == null || node.isNull();
    }

    /** Scalars by dotted path. Arrays are compared whole, since no element's own data is a list of objects worth descending into. */
    private Map<String, JsonNode> flatten(ObjectNode node) {
        Map<String, JsonNode> flat = new TreeMap<>();
        flatten("", node, flat);
        return flat;
    }

    private void flatten(String prefix, ObjectNode node, Map<String, JsonNode> flat) {
        node.fieldNames()
            .forEachRemaining(name -> {
                String path = prefix.isEmpty() ? name : prefix + "." + name;
                JsonNode value = node.get(name);
                if (value instanceof ObjectNode nested) {
                    flatten(path, nested, flat);
                } else {
                    flat.put(path, value);
                }
            });
    }

    /**
     * The element serialised without its children, so an added child does not make its parent look altered.
     * <p>
     * Takes any element rather than an {@link AbstractModel}: an amplifier guide carries a code and is part of the model, but sits outside that hierarchy.
     */
    private ObjectNode shallow(Object element) {
        ObjectNode node = mapper.valueToTree(element);
        CHILD_FIELDS.forEach(node::remove);
        return node;
    }

    /**
     * Every element in the model, serialised and keyed by the path that reaches it.
     * <p>
     * Top-level collections are keyed by code alone; everything below a symbol set carries its ancestors, since codes repeat between parents. The flattened views a symbol set
     * offers are used for the nested types, with the path rebuilt from each element's back-reference to its parent - which is cheaper than walking the nesting twice and gives the
     * same set.
     */
    private Map<String, ObjectNode> index(LibraryModel model) {
        Map<String, ObjectNode> elements = new TreeMap<>();
        put(elements, "version", model.getVersions());
        put(elements, "context", model.getContexts());
        put(elements, "identityGroup", model.getIdentityGroups());
        put(elements, "identity", model.getIdentities());
        put(elements, "status", model.getStatuses());
        put(elements, "hqtfDummy", model.getHqtfDummies());
        put(elements, "dimension", model.getDimensions());
        put(elements, "amplifier", model.getAmplifiers());

        for (AmplifierListModel group : model.getAmplifierGroups()) {
            String prefix = String.format("amplifierGroup/%s", group.getCode());
            elements.put(prefix, shallow(group));
            put(elements, prefix + "/value", group.getValues());
        }

        for (SymbolSetModel symbolSet : model.getSymbolSets()) {
            String prefix = String.format("symbolSet/%s", symbolSet.getCode());
            elements.put(prefix, shallow(symbolSet));
            put(elements, prefix + "/sectorOne", symbolSet.getSectorOneMods());
            put(elements, prefix + "/sectorTwo", symbolSet.getSectorTwoMods());
            symbolSet.getAmplifierGuides()
                .forEach(guide -> elements.put(String.format("%s/guide/%s", prefix, guide.getCode()), shallow(guide)));
            symbolSet.getEntities()
                .forEach(entity -> elements.put(entityPath(entity), shallow(entity)));
            symbolSet.getEntityTypes()
                .forEach(entityType -> elements.put(typePath(entityType), shallow(entityType)));
            symbolSet.getEntitySubTypes()
                .forEach(subType -> elements.put(String.format("%s/subType/%s", typePath(subType.getEntityType()), subType.getCode()), shallow(subType)));
        }
        return elements;
    }

    private String entityPath(EntityModel entity) {
        return String.format("symbolSet/%s/entity/%s", entity.getSymbolSet()
            .getCode(), entity.getCode());
    }

    private String typePath(EntityTypeModel entityType) {
        return String.format("%s/type/%s", entityPath(entityType.getEntity()), entityType.getCode());
    }

    private void put(Map<String, ObjectNode> elements, String prefix, List<? extends AbstractModel> values) {
        if (values == null) {
            return;
        }
        values.forEach(value -> {
            ObjectNode node = shallow(value);
            elements.put(String.format("%s/%s", prefix, localKey(node, value.getCode())), node);
        });
    }

    /**
     * What distinguishes an element from its siblings.
     * <p>
     * Usually the code, but a common modifier needs its group id too: SIDC digit 21 selects which common table a sector-one modifier comes from, so {@code groupId 0 code 00} and
     * {@code groupId 1 code 00} are different modifiers that share a code. Keying on the code alone collapsed twenty-five of them onto each other and reported every collision as
     * an alteration - which is how this was found. Taken from the serialised node rather than a cast, so any element that grows a group id is handled without another change here.
     */
    private String localKey(ObjectNode node, String code) {
        JsonNode groupId = node.get("groupId");
        return groupId == null || groupId.isNull() ? code : String.format("%s-%s", groupId.asText(), code);
    }

    private LibraryModel read(Path configFile) throws Exception {
        GeneratorConfig config = GeneratorConfig.load(configFile);
        return parser.readLibraryModel(Files.newInputStream(config.getModelFile()));
    }

}
