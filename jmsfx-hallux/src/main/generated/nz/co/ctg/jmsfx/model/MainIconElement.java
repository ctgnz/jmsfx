package nz.co.ctg.jmsfx.model;

public interface MainIconElement extends SymbolIdentificationCodeElement {

    String getGraphicIdentifier();

    IconType getIconType();
    
    default SymbolSet getSymbolSet() {
        return getEntity().getSymbolSet();
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
