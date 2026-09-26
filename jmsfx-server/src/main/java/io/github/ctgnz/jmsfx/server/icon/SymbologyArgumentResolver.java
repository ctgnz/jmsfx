package io.github.ctgnz.jmsfx.server.icon;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.HandlerMapping;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.CodeElement;
import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;

/**
 * Resolves a handler's symbology arguments against the library on the classpath, rather than by converting a path variable to a generated enum.
 * <p>
 * Conversion is what tied the icon API to one library. Spring converts a {@code @PathVariable} of an enum type through {@code Enum.valueOf}, so a handler had to <em>name</em> a
 * concrete enum in its signature - which meant a controller per symbol set, each binding {@link IconRestController}'s type parameters to one set's generated types, and the whole
 * lot recompiled for a different library. jmsfx#90 is what that costs: several of those bindings were wrong and only a request could reveal it.
 * <p>
 * A resolver can do what a {@code Converter} cannot: see the rest of the request. Every value here is resolved <em>within</em> the symbol set named earlier in the same path, so
 * the handlers can take the interface types from jmsfx-core and the concrete types never appear.
 * <p>
 * Values are matched on the Java enum constant name, which is what {@link CodeElementSummary} publishes as {@code name} and what the previous conversion consumed - so a caller's
 * URLs are unchanged. That every implementor is an enum is an assumption this shares with {@code CodeElementSummary}; it holds because they are all generated that way.
 */
@Component
public class SymbologyArgumentResolver implements HandlerMethodArgumentResolver {

    /** The path variable naming the symbol set, which every other value here is resolved within. */
    static final String SYMBOL_SET = "symbolSet";

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        Class<?> type = parameter.getParameterType();
        return SymbolSet.class == type || Entity.class == type || EntityType.class == type || EntitySubType.class == type || SectorOneModifier.class == type
               || SectorTwoModifier.class == type || AmplifierListItem.class == type;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer container, NativeWebRequest request, WebDataBinderFactory binderFactory) {
        SymbolSet symbolSet = symbolSet(request);
        Class<?> type = parameter.getParameterType();
        if (SymbolSet.class == type) {
            return symbolSet;
        }

        String name = parameter.getParameterName();
        // A path variable first, then a query parameter. Which one a value arrives in is a property of
        // the endpoint rather than of the value - an amplifier is a query parameter on /symbol and the
        // sector modifiers are path variables on /symbol/modifier/one - so the resolver takes it from
        // wherever it appears rather than needing an annotation on every argument to say which.
        String value = Optional.ofNullable(pathVariables(request).get(name))
            .orElseGet(() -> request.getParameter(name));
        if (value == null || value.isBlank()) {
            // Absent is a legitimate answer for the optional query parameters; a path variable cannot be
            // absent, because the mapping that matched the request is what put it there.
            return null;
        }
        return find(candidates(symbolSet, type), value, name);
    }

    /** The symbol set named in the path, matched by the same function that wrote the URL segment in the first place. */
    private SymbolSet symbolSet(NativeWebRequest request) {
        String path = pathVariables(request).get(SYMBOL_SET);
        if (path == null) {
            throw new IllegalStateException("a handler taking symbology arguments must be mapped under /{" + SYMBOL_SET + "}");
        }
        return IconLibrary.discover()
            .getSymbolSets()
            .stream()
            .filter(candidate -> SymbolSetSummary.pathFor(candidate)
                .equals(path))
            .findFirst()
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Unknown symbol set: " + path));
    }

    /**
     * What a value of this type could be, within this symbol set.
     * <p>
     * Entity types and sub-types are reached through their parents rather than held by the set directly, which is also what makes them unambiguous: a type's name is unique within
     * its set, so flattening loses nothing.
     */
    private List<? extends CodeElement> candidates(SymbolSet symbolSet, Class<?> type) {
        if (Entity.class == type) {
            return symbolSet.getEntities();
        }
        if (EntityType.class == type) {
            return symbolSet.getEntities()
                .stream()
                .flatMap(entity -> entity.getEntityTypes()
                    .stream())
                .toList();
        }
        if (EntitySubType.class == type) {
            return symbolSet.getEntities()
                .stream()
                .flatMap(entity -> entity.getEntityTypes()
                    .stream())
                .flatMap(entityType -> entityType.getEntitySubTypes()
                    .stream())
                .toList();
        }
        if (SectorOneModifier.class == type) {
            return symbolSet.getSectorOneModifiers();
        }
        if (SectorTwoModifier.class == type) {
            return symbolSet.getSectorTwoModifiers();
        }
        return symbolSet.getAmplifierList();
    }

    private CodeElement find(List<? extends CodeElement> candidates, String value, String what) {
        return candidates.stream()
            .filter(candidate -> candidate instanceof Enum<?> constant && constant.name()
                .equals(value))
            .findFirst()
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Unknown %s: %s", what, value)));
    }

    @SuppressWarnings("unchecked")
    private Map<String, String> pathVariables(NativeWebRequest request) {
        Map<String, String> variables = (Map<String, String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE, NativeWebRequest.SCOPE_REQUEST);
        return variables == null ? Map.of() : variables;
    }

}
