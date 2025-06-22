package io.github.ctgnz.jmsfx;

import java.util.Comparator;

public interface SectorTwoModifier extends ModifierElement {

    Comparator<SectorTwoModifier> VIEW_ORDER = Comparator.comparing(SectorTwoModifier::getCategory).thenComparing(SectorTwoModifier::getLabel);

    default String getFullGraphicLocation() {
        return String.format("/svg/Appendices/%s/mod2/%s.svg", getGraphicLocation(), getGraphicIdentifier());
    }

    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s2", getBaseSymbolSet().getId(), getId());
    }

    default String getGraphicLocation() {
        return getSymbolSet().getGraphicLocation();
    }

}
