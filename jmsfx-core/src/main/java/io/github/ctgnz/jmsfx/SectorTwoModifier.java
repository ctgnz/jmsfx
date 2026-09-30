package io.github.ctgnz.jmsfx;

import java.util.Comparator;

public interface SectorTwoModifier extends ModifierElement {

    Comparator<SectorTwoModifier> VIEW_ORDER = Comparator.comparing(SectorTwoModifier::getCategory).thenComparing(SectorTwoModifier::getLabel);

    /** Under the dimension its symbol set belongs to, in the sector's own directory - see {@link MainElement#getGraphicKey(StandardIdentity)}. */
    default String getGraphicKey() {
        return String.format("/svg/Dimensions/%s/mod2/%s.svg", getBaseSymbolSet().getDimension().getName(), getGraphicIdentifier());
    }

    @Override
    default String getGraphicIdentifier() {
        return getName();
    }

}
