package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISymbolSet;

public class SectorOneModifierAdapter implements ISectorOneModifier {
    private final ISectorOneModifier modifier;

    public SectorOneModifierAdapter(ISectorOneModifier modifier) {
        this.modifier = modifier;
    }

    @Override
    public String getCategory() {
        return modifier.getCategory();
    }

    public String getFullGraphicLocation() {
        return String.format("/svg/Appendices/%s/mod1/%s.svg", modifier.getGraphicLocation(), modifier.getGraphicIdentifier());
    }

    @Override
    public String getId() {
        return modifier.getId();
    }

    @Override
    public String getLabel() {
        return modifier.getLabel();
    }

    public ISectorOneModifier getModifier() {
        return modifier;
    }

    @Override
    public ISymbolSet getSymbolSet() {
        return modifier.getSymbolSet();
    }

    @Override
    public boolean isUnknown() {
        return modifier.isUnknown();
    }
}
