package io.github.ctgnz.jmsfx;

import java.util.Comparator;

public interface ISectorOneModifier extends IModifierElement {

    Comparator<ISectorOneModifier> VIEW_ORDER = Comparator.comparing(ISectorOneModifier::getCategory).thenComparing(ISectorOneModifier::getLabel);

    String getCategory();

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
