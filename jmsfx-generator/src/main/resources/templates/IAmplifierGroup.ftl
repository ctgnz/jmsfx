package ${basePackage};

public interface AmplifierGroup extends SymbolIdentificationCodeElement {

    String getGraphicLocation();
    
    default boolean isGraphicalIcon() {
        return true;
    }

}
