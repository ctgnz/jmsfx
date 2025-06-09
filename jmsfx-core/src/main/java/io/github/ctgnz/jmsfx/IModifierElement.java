package io.github.ctgnz.jmsfx;

public interface IModifierElement extends ICodeElement {

    default ISymbolSet getBaseSymbolSet() {
        return getSymbolSet();
    }

    String getCategory();

    String getGraphicIdentifier();

    default String getGroupId() {
        return "0";
    }

    ISymbolSet getSymbolSet();

    @Override
    default boolean isUnknown() {
        return "00".equals(getId());
    }

}
