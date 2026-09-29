package io.github.ctgnz.jmsfx;

import java.util.Comparator;

public interface SectorOneModifier extends ModifierElement {

    Comparator<SectorOneModifier> VIEW_ORDER = Comparator.comparing(SectorOneModifier::getCategory)
        .thenComparing(SectorOneModifier::getLabel);

    /** Under the dimension its symbol set belongs to, in the sector's own directory - see {@link MainElement#getGraphicKey(StandardIdentity)}. */
    default String getGraphicKey() {
        return String.format("/svg/Dimensions/%s/mod1/%s.svg", getBaseSymbolSet().getDimension()
            .getName(), getGraphicIdentifier());
    }

    @Override
    default String getGraphicIdentifier() {
        return getName();
    }

}
