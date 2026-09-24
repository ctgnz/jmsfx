package io.github.ctgnz.jmsfx.generator;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

    /** One free canvas icon: the graphic identifier that names it, enough label to report it by, and the fragment it draws. */
    public record Icon(String identifier, String label, String symbolSet, Path fragment) {
    }

    private FreeCanvasIcons() {
    }

    /** Every free canvas icon in the model, in symbol set order, resolved against the {@code svg} directory of a resource tree. */
    public static List<Icon> collect(LibraryModel model, Path svgRoot) {
        List<Icon> icons = new ArrayList<>();
        for (SymbolSetModel symbolSet : model.getSymbolSets()) {
            Map<String, String> identifiers = identifiers(model, symbolSet);
            if (identifiers.isEmpty()) {
                continue;
            }
            // Asked for only once there is something to file, so a set that contributes no free canvas
            // icons is never required to say where fragments it does not have would live.
            String location = graphicLocation(model, symbolSet);
            if (location == null) {
                throw new IllegalStateException(String.format("symbol set %s has free canvas icons but no graphic location", symbolSet.getLabel()));
            }
            identifiers.forEach((identifier, label) -> icons.add(new Icon(identifier, label, symbolSet.getLabel(), svgRoot.resolve("Appendices")
                .resolve(location)
                .resolve(identifier + ".svg"))));
        }
        return icons;
    }

    /**
     * The graphic identifiers one symbol set contributes, mapped to the label that names each.
     * <p>
     * A {@link LinkedHashMap} rather than a list of pairs because an entity type and its sub-type can name the same graphic, and the set should hold it once.
     */
    private static Map<String, String> identifiers(LibraryModel model, SymbolSetModel symbolSet) {
        Map<String, String> identifiers = new LinkedHashMap<>();
        for (EntityModel entity : symbolSet.getEntities()) {
            if (entity.getGraphicType() == GraphicType.FREE_CANVAS) {
                identifiers.put(baseCode(model, symbolSet, entity) + entity.getCode() + "0000", entity.getLabel());
            }
        }
        for (EntityTypeModel entityType : symbolSet.getEntityTypes()) {
            if (entityType.getGraphicType() == GraphicType.FREE_CANVAS) {
                EntityModel entity = entityType.getEntity();
                String identifier = entityType.getGraphic() != null ? entityType.getGraphic()
                    : baseCode(model, symbolSet, entity) + entity.getCode() + entityType.getCode() + "00";
                identifiers.put(identifier, entityType.getLabel());
            }
        }
        for (EntitySubTypeModel subType : symbolSet.getEntitySubTypes()) {
            if (subType.getGraphicType() == GraphicType.FREE_CANVAS) {
                EntityTypeModel entityType = subType.getEntityType();
                EntityModel entity = entityType.getEntity();
                String identifier = subType.getGraphic() != null ? subType.getGraphic()
                    : baseCode(model, symbolSet, entity) + entity.getCode() + entityType.getCode() + subType.getCode();
                identifiers.put(identifier, subType.getLabel());
            }
        }
        return identifiers;
    }

    /** The symbol set an element's fragment is filed under, which is its own unless the entity borrows another set's numbering. */
    private static String baseCode(LibraryModel model, SymbolSetModel symbolSet, EntityModel entity) {
        if (entity.getBaseSymbolSet() == null) {
            return symbolSet.getCode();
        }
        return model.getSymbolSets()
            .stream()
            .filter(candidate -> entity.getBaseSymbolSet()
                .equals(candidate.getId()))
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
