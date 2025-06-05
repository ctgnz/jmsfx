package io.github.ctgnz.jmsfx;

import io.github.ctgnz.jmsfx.icon.GraphicType;

public interface IMainElement extends ICodeElement {

    String getGraphicIdentifier();

    GraphicType getGraphicType();

    default ISymbolSet getSymbolSet() {
        return getEntity().getSymbolSet();
    }

    default ISymbolSet getBaseSymbolSet() {
        return getEntity().getBaseSymbolSet();
    }

    IEntity getEntity();

    default boolean isCivilian() {
        return getEntity().isCivilian();
    }

    default boolean isFullFrameIcon() {
        return getGraphicType() == GraphicType.FULL_FRAME;
    }

    default boolean isGraphicalIcon() {
        return getGraphicType() != GraphicType.NA;
    }

}
