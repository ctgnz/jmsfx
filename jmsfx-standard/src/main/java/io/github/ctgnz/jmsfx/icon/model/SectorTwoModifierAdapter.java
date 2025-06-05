package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.ISymbolSet;

public class SectorTwoModifierAdapter implements ISectorTwoModifier {
    private final ISectorTwoModifier modifier;

    public SectorTwoModifierAdapter(ISectorTwoModifier modifier) {
        this.modifier = modifier;
    }

    @Override
    public String getCategory() {
        return modifier.getCategory();
    }

    public String getFullGraphicLocation() {
        return String.format("/svg/Appendices/%s/mod2/%s.svg", modifier.getGraphicLocation(), modifier.getGraphicIdentifier());
    }

    @Override
    public String getId() {
        return modifier.getId();
    }

    @Override
    public String getLabel() {
        return modifier.getLabel();
    }

    public ISectorTwoModifier getModifier() {
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
