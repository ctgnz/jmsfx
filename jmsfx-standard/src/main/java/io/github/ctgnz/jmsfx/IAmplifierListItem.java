package io.github.ctgnz.jmsfx;

public interface IAmplifierListItem extends ICodeElement {

    IAmplifierList getAmplifierList();

    default String getBackgroundFill() {
        return "";
    }

    default String getFullId() {
        return getId();
    }

    String getGraphicLocation();

    boolean isGraphicalIcon();
    
}
