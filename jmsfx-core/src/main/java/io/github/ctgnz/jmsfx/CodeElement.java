package io.github.ctgnz.jmsfx;

public interface CodeElement {

    String getId();

    String getLabel();

    /**
     * The element's own name, as the generated constant spells it - {@code AIR_DEFENSE}, not {@code 01}.
     * <p>
     * This is what a fragment path is built from since jmsfx#136. It used to be that paths were composed of codes, so an element's identity in the tree was {@code 10130101} and a
     * wrong derivation produced a plausible-looking number that resolved to the wrong drawing, or to nothing. A name makes that visible.
     */
    String getName();

    default boolean isUnknown() {
        return "00".equals(getId());
    }

}
