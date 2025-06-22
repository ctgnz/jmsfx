package io.github.ctgnz.jmsfx;

import java.util.Comparator;

public interface SectorOneModifier extends ModifierElement {

    Comparator<SectorOneModifier> VIEW_ORDER = Comparator.comparing(SectorOneModifier::getCategory).thenComparing(SectorOneModifier::getLabel);

    default String getFullGraphicLocation() {
        return String.format("/svg/Appendices/%s/mod1/%s.svg", getGraphicLocation(), getGraphicIdentifier());
    }

    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s1", getBaseSymbolSet().getId(), getId());
    }

    default String getGraphicLocation() {
        return getSymbolSet().getGraphicLocation();
    }

}
