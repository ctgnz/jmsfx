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

    /** One directory per amplifier list, so Echelon sits beside Equipment Mobility rather than beside the container that holds them (jmsfx#136). */
    default String getGraphicKey(StandardIdentity identity) {
        return String.format("/svg/Amplifiers/%s/%s/%s.svg", getAmplifierList().getName(), identity.getGroup().getName(), getName());
    }

    /**
     * The markup this amplifier draws for an identity, or null when it has none.
     * <p>
     * Keyed by the identity group alone, which is the only thing that varies the fragment - the same key {@link StandardAmplifierItem#getAmplifierBounds(StandardIdentity)} uses,
     * and the same one {@link #getGraphicKey(StandardIdentity)} puts in the key. See jmsfx#130.
     */
    default String getGraphicMarkup(StandardIdentity identity) {
        return null;
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

}
