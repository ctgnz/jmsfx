package io.github.ctgnz.jmsfx.generator;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import io.github.ctgnz.jmsfx.generator.model.AbstractModel;
import io.github.ctgnz.jmsfx.generator.model.DimensionModel;
import io.github.ctgnz.jmsfx.generator.model.EntityModel;
import io.github.ctgnz.jmsfx.generator.model.EntitySubTypeModel;
import io.github.ctgnz.jmsfx.generator.model.EntityTypeModel;
import io.github.ctgnz.jmsfx.generator.model.GraphicType;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.model.SymbolSetModel;

/**
 * The main icons that carry {@code FREE_CANVAS}, each paired with the fragment it draws.
 * <p>
 * These are the Control Measures and a few Cyberspace path and terrain graphics: GIS construction samples showing how a measure is drawn on a map, rather than icons composed into
 * a symbol. APP-6E 8.1.3 exempts them from the composition rules, and #59 gave them {@code FREE_CANVAS} for the same reason. Two tools need to find exactly this set -
 * {@link FragmentMeasurer}, because only these have an extent that has to be measured rather than derived, and {@link FragmentShapeChecker}, because only these carry illustrative
 * scaffolding alongside their content - so the collection lives here rather than in either of them.
 * <p>
 * The identifier is derived the same three ways {@code MainElement.getGraphicIdentifier()} derives it. jmsfx#52 is a caution against duplicating that kind of derivation, which is
 * the reason for one copy here instead of one per caller; every path is handed back whether or not it exists, so a caller reports what is missing rather than quietly skipping it.
 */
public final class FreeCanvasIcons {

    /**
     * One main icon: the graphic identifier that names it, enough label to report it by, its graphic type, the model element it belongs to, the appendix directory its fragments
     * are filed under, and the fragment it draws.
     * <p>
     * The location is carried as well as the resolved path because a {@code FULL_FRAME} element draws four fragments, one per identity group, and the canonical name it is
     * collected under is not one of them - so that path resolves nowhere and cannot be used to find the siblings that do exist. See {@link #sibling(FragmentTree, String)}.
     */
    public record Icon(String identifier, String label, String symbolSet, GraphicType graphicType, AbstractModel element, String location, Path fragment) {

        /** A fragment filed beside this one, searched through the tree rather than resolved against this one's directory - which may be a root that holds nothing. */
        public Path sibling(FragmentTree tree, String siblingIdentifier) {
            return tree.resolve("Appendices", location, siblingIdentifier + ".svg");
        }
    }

    /** What an identifier maps to while collecting: enough to build an {@link Icon} once the symbol set's location is known. */
    private record Entry(String label, GraphicType graphicType, AbstractModel element) {
    }

    private FreeCanvasIcons() {
    }

    /** Every free canvas icon in the model, in symbol set order, resolved against the {@code svg} directory of a resource tree. */
    public static List<Icon> collect(LibraryModel model, FragmentTree tree) {
        return collect(model, tree, type -> type == GraphicType.FREE_CANVAS);
    }

    /**
     * Every main icon whose graphic type the predicate accepts.
     * <p>
     * Opened up for {@link FragmentSource}, which needs all of them rather than the free canvas ones. The identifier derivation stays here and has one copy, which is the whole
     * reason this class exists - see the note about jmsfx#52 above.
     */
    public static List<Icon> collect(LibraryModel model, FragmentTree tree, Predicate<GraphicType> wanted) {
        List<Icon> icons = new ArrayList<>();
        for (SymbolSetModel symbolSet : model.getSymbolSets()) {
            Map<String, Entry> identifiers = identifiers(model, symbolSet, wanted);
            if (identifiers.isEmpty()) {
                continue;
            }
            // Asked for only once there is something to file, so a set that contributes no free canvas
            // icons is never required to say where fragments it does not have would live.
            String location = graphicLocation(model, symbolSet);
            if (location == null) {
                throw new IllegalStateException(String.format("symbol set %s has free canvas icons but no graphic location", symbolSet.getLabel()));
            }
            identifiers.forEach((identifier, entry) -> icons.add(new Icon(identifier, entry.label(), symbolSet.getLabel(), entry.graphicType(), entry.element(), location,
                                                                          tree.resolve("Appendices", location, identifier + ".svg"))));
        }
        return icons;
    }

    /**
     * The graphic identifiers one symbol set contributes, mapped to the label that names each.
     * <p>
     * A {@link LinkedHashMap} rather than a list of pairs because an entity type and its sub-type can name the same graphic, and the set should hold it once.
     */
    private static Map<String, Entry> identifiers(LibraryModel model, SymbolSetModel symbolSet, Predicate<GraphicType> wanted) {
        Map<String, Entry> identifiers = new LinkedHashMap<>();
        for (EntityModel entity : symbolSet.getEntities()) {
            if (wanted.test(entity.getGraphicType())) {
                identifiers.put(baseCode(model, symbolSet, entity) + entity.getCode() + "0000", new Entry(entity.getLabel(), entity.getGraphicType(), entity));
            }
        }
        for (EntityTypeModel entityType : symbolSet.getEntityTypes()) {
            if (wanted.test(entityType.getGraphicType())) {
                EntityModel entity = entityType.getEntity();
                String identifier = entityType.getGraphic() != null ? entityType.getGraphic()
                    : baseCode(model, symbolSet, entity) + entity.getCode() + entityType.getCode() + "00";
                identifiers.put(identifier, new Entry(entityType.getLabel(), entityType.getGraphicType(), entityType));
            }
        }
        for (EntitySubTypeModel subType : symbolSet.getEntitySubTypes()) {
            if (wanted.test(subType.getGraphicType())) {
                EntityTypeModel entityType = subType.getEntityType();
                EntityModel entity = entityType.getEntity();
                String identifier = subType.getGraphic() != null ? subType.getGraphic()
                    : baseCode(model, symbolSet, entity) + entity.getCode() + entityType.getCode() + subType.getCode();
                identifiers.put(identifier, new Entry(subType.getLabel(), subType.getGraphicType(), subType));
            }
        }
        return identifiers;
    }

    /**
     * The symbol set an element's fragment is filed under, which is its own unless something borrows another set's numbering.
     * <p>
     * Declared in two places, and both have to be honoured. An entity may name a base symbol set of its own, and a whole symbol set may name one in its config - which is what the
     * nine Cyberspace variants do, all filing their fragments under Cyberspace's numbering. The generated classes reflect that by overriding {@code getBaseSymbolSet} per constant
     * in the first case and per class in the second, so both end up at the same identifier; reading only the entity's left every variant set resolving to fragments that do not
     * exist.
     */
    static String baseCode(LibraryModel model, SymbolSetModel symbolSet, EntityModel entity) {
        String baseId = entity != null && entity.getBaseSymbolSet() != null ? entity.getBaseSymbolSet() : symbolSet.getBaseSymbolSet();
        if (baseId == null) {
            return symbolSet.getCode();
        }
        return model.getSymbolSets()
            .stream()
            .filter(candidate -> baseId.equals(candidate.getId()))
            .findFirst()
            .map(SymbolSetModel::getCode)
            .orElse(symbolSet.getCode());
    }

    /** Where a symbol set's fragments live, which falls back to the dimension's directory when the set does not name its own - as {@code SymbolSetEnum} does. */
    private static String graphicLocation(LibraryModel model, SymbolSetModel symbolSet) {
        if (symbolSet.getGraphicLocation() != null) {
            return symbolSet.getGraphicLocation();
        }
        DimensionModel dimension = model.getDimension(symbolSet.getDimensionId());
        return dimension == null ? null : dimension.getGraphicLocation();
    }

}
