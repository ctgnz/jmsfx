package io.github.ctgnz.jmsfx;

public interface IModifierElement extends ICodeElement {

    String getGraphicIdentifier();

    ISymbolSet getSymbolSet();

    default ISymbolSet getBaseSymbolSet() {
        return getSymbolSet();
    }

}
