package ${basePackage};

public interface MainIconElement extends SymbolIdentificationCodeElement {

    String getGraphicIdentifier();

    IconType getIconType();
    
    default SymbolSet getSymbolSet() {
        return getEntity().getSymbolSet();
    }
    
    default SymbolSet getBaseSymbolSet() {
        return getEntity().getBaseSymbolSet();
    }
    
    Entity getEntity();

    default boolean isCivilian() {
        return getEntity().isCivilian();
    }

    default boolean isFullFrameIcon() {
        return getIconType() == IconType.FULL_FRAME;
    }

    default boolean isGraphicalIcon() {
        return getIconType() != IconType.NA;
    }

}
