package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISymbolSet;

public class SectorOneModifierAdapter implements ISectorOneModifier {
    private final ISectorOneModifier model;

    public SectorOneModifierAdapter(ISectorOneModifier modifier) {
        this.model = modifier;
    }

    @Override
    public String getCategory() {
        return model.getCategory();
    }

    public String getFullGraphicLocation() {
        return String.format("/svg/Appendices/%s/mod1/%s.svg", model.getGraphicLocation(), model.getGraphicIdentifier());
    }

    @Override
    public String getId() {
        return model.getId();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    public ISectorOneModifier getModel() {
        return model;
    }

    @Override
    public ISymbolSet getSymbolSet() {
        return model.getSymbolSet();
    }

    @Override
    public boolean isUnknown() {
        return model.isUnknown();
    }
}
