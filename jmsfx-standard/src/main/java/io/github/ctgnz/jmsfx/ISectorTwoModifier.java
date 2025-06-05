package io.github.ctgnz.jmsfx;

import java.util.Comparator;

public interface ISectorTwoModifier extends IModifierElement {

    Comparator<ISectorTwoModifier> VIEW_ORDER = Comparator.comparing(ISectorTwoModifier::getCategory).thenComparing(ISectorTwoModifier::getLabel);
    
    String getCategory();

    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s2", getBaseSymbolSet().getId(), getId());
    }

    default String getGraphicLocation() {
        return getSymbolSet().getGraphicLocation();
    }

}
