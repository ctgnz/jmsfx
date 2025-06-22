package io.github.ctgnz.jmsfx;

public interface ModifierElement extends CodeElement {

    default SymbolSet getBaseSymbolSet() {
        return getSymbolSet();
    }

    String getCategory();

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
