package io.github.ctgnz.jmsfx;

public interface AmplifierListItem extends CodeElement {

    AmplifierList getAmplifierList();

    default String getBackgroundFill() {
        return "";
    }

    default String getFullId() {
        return getId();
    }

    String getGraphicLocation();

    default String getGraphicLocation(StandardIdentity identity) {
        return String.format("/svg/%s/%s%s.svg", getGraphicLocation(), identity.getGroupId(), getFullId());
    }

    boolean isGraphicalIcon();

}
