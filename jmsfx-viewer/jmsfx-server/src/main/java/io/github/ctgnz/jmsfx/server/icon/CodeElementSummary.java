package io.github.ctgnz.jmsfx.server.icon;

import io.github.ctgnz.jmsfx.CodeElement;

public record CodeElementSummary(String id, String label, String name) {

    /**
     * {@code name} is the Java enum constant name (e.g. {@code UNSPECIFIED}), not {@code id} (e.g. {@code 00}) - every {@link CodeElement} implementor in jmsfx-standard is a Java
     * enum, and Spring's default converter resolves a {@code @PathVariable} of an enum type via {@code Enum.valueOf}, which needs the constant name.
     */
    public static CodeElementSummary of(CodeElement element) {
        return new CodeElementSummary(element.getId(), element.getLabel(), ((Enum<?>) element).name());
    }

}
