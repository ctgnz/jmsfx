package io.github.ctgnz.jmsfx;

public interface ICodeElement {

    String getId();

    String getLabel();

    default boolean isUnknown() {
        return "00".equals(getId());
    }
    
}
