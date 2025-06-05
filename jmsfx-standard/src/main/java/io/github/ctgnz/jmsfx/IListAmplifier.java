package io.github.ctgnz.jmsfx;

import io.github.ctgnz.jmsfx.icon.ListAmplifierType;

public interface IListAmplifier extends ICodeElement {

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
