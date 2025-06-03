package io.github.ctgnz.jmsfx.icon;

public interface IconModifier extends SymbolIdentificationCodeElement {

    String getGraphicIdentifier();

    SymbolSet getSymbolSet();
    
    default SymbolSet getBaseSymbolSet() {
        return getSymbolSet();
    }
    
}
