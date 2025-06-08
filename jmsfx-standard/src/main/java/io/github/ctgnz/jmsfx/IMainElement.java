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

    default String getGraphicLocation(IStandardIdentity identity) {
        String graphicLocation = getSymbolSet().getGraphicLocation();
        String graphicIdentifier = getGraphicIdentifier();
        if (isFullFrameIcon()) {
            return String.format("/svg/Appendices/%s/%s%s.svg", graphicLocation, graphicIdentifier, identity.getGroup().getGraphicSuffix());
        } else {
            return String.format("/svg/Appendices/%s/%s.svg", graphicLocation, graphicIdentifier);
        }
    }

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
