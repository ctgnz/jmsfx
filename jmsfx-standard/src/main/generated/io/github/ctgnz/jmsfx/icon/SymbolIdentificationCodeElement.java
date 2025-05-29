package io.github.ctgnz.jmsfx.icon;

public interface SymbolIdentificationCodeElement {

    String getId();

    String getLabel();

    default boolean isUnknown() {
        return "00".equals(getId());
    }
    
}
