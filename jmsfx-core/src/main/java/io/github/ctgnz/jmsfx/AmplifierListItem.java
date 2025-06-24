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

    default boolean isDeprecated() {
        try {
            return getClass().getField(getName()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    default boolean isExtension() {
        try {
            return getClass().getField(getName()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    boolean isGraphicalIcon();

    String getName();

}
