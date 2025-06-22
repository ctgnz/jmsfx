package io.github.ctgnz.jmsfx;

public interface CodeElement {

    String getId();

    String getLabel();

    default boolean isUnknown() {
        return "00".equals(getId());
    }
    
}
