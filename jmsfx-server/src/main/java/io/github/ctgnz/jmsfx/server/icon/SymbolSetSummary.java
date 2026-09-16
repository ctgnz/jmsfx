package io.github.ctgnz.jmsfx.server.icon;

import io.github.ctgnz.jmsfx.SymbolSet;

public record SymbolSetSummary(String id, String label, String path) {

    public static SymbolSetSummary of(SymbolSet symbolSet) {
        return new SymbolSetSummary(symbolSet.getId(), symbolSet.getLabel(), pathFor(symbolSet));
    }

    public static String pathFor(SymbolSet symbolSet) {
        return symbolSet.getLabel()
            .replaceAll("\\s", "")
            .replaceAll("-", "");
    }

}
