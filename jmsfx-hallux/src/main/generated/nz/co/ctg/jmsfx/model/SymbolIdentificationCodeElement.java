package nz.co.ctg.jmsfx.model;

public interface SymbolIdentificationCodeElement {

    String getId();

    String getLabel();

    default boolean isUnknown() {
        return "00".equals(getId());
    }
    
}
