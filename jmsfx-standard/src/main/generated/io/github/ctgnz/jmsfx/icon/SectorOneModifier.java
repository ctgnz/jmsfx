package io.github.ctgnz.jmsfx.icon;

import java.util.Comparator;

public interface SectorOneModifier extends IconModifier {

    Comparator<SectorOneModifier> VIEW_ORDER = Comparator.comparing(SectorOneModifier::getCategory).thenComparing(SectorOneModifier::getLabel);

    String getCategory();

    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s1", getSymbolSet().getId(), getId());
    }

    default String getGraphicLocation() {
        return getSymbolSet().getGraphicLocation();
    }

}
