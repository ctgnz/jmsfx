package io.github.ctgnz.jmsfx.icon;

public interface EnumeratedAmplifier extends SymbolIdentificationCodeElement {

    default String getBackgroundFill() {
        return "";
    }
    
    String getGraphicLocation();
    
    boolean isGraphicalIcon();

    String getFullId();
    
}
