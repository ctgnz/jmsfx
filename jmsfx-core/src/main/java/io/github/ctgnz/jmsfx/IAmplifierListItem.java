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

    default String getGraphicLocation(IStandardIdentity identity) {
        return String.format("/svg/%s/%s%s.svg", getGraphicLocation(), identity.getGroupId(), getFullId());
    }

    boolean isGraphicalIcon();

}
