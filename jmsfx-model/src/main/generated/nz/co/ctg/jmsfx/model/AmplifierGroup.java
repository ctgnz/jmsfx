package nz.co.ctg.jmsfx.model;

public interface AmplifierGroup extends SymbolIdentificationCodeElement {

    String getGraphicLocation();
    
    default boolean isGraphicalIcon() {
        return true;
    }

}
