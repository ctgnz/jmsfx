package io.github.ctgnz.jmsfx;

import io.github.ctgnz.jmsfx.types.ModifierCategory;

public interface ModifierElement extends CodeElement {

    default SymbolSet getBaseSymbolSet() {
        return getSymbolSet();
    }

    ModifierCategory getCategory();

    String getGraphicIdentifier();

    default String getGroupId() {
        return "0";
    }

    SymbolSet getSymbolSet();

    @Override
    default boolean isUnknown() {
        return "00".equals(getId());
    }

}
