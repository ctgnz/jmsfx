package io.github.ctgnz.jmsfx.icon;

public interface ListAmplifier extends SymbolIdentificationCodeElement {

    default String getBackgroundFill() {
        return "";
    }

    default String getFullId() {
        return getId();
    }

    String getGraphicLocation();

    ListAmplifierType getType();

    boolean isGraphicalIcon();
    
}
