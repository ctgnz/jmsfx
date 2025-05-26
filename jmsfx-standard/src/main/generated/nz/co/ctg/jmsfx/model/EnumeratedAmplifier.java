package nz.co.ctg.jmsfx.model;

public interface EnumeratedAmplifier extends SymbolIdentificationCodeElement {

    default String getBackgroundFill() {
        return "";
    }
    
    String getGraphicLocation();
    
    boolean isGraphicalIcon();

    String getFullId();
    
}
