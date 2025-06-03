package ${basePackage};

public interface IconModifier extends SymbolIdentificationCodeElement {

    String getGraphicIdentifier();

    SymbolSet getSymbolSet();
    
    default SymbolSet getBaseSymbolSet() {
        return getSymbolSet();
    }
    
}
