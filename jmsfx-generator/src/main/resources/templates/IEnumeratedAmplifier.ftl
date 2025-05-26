package ${basePackage};

public interface EnumeratedAmplifier extends SymbolIdentificationCodeElement {

    default String getBackgroundFill() {
        return "";
    }
    
    String getGraphicLocation();
    
    boolean isGraphicalIcon();

    String getFullId();
    
}
