package io.github.ctgnz.jmsfx;

import io.github.ctgnz.jmsfx.types.GraphicType;

public interface MainElement extends CodeElement {

    String getGraphicIdentifier();

    GraphicType getGraphicType();

    default SymbolSet getSymbolSet() {
        return getEntity().getSymbolSet();
    }

    default SymbolSet getBaseSymbolSet() {
        return getEntity().getBaseSymbolSet();
    }

    Entity getEntity();

    default String getGraphicLocation(StandardIdentity identity) {
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
