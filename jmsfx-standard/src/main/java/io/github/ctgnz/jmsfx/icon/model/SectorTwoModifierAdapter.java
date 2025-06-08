package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.ISymbolSet;

public class SectorTwoModifierAdapter implements ISectorTwoModifier {
    private final ISectorTwoModifier model;

    public SectorTwoModifierAdapter(ISectorTwoModifier modifier) {
        this.model = modifier;
    }

    @Override
    public String getCategory() {
        return model.getCategory();
    }

    public String getFullGraphicLocation() {
        return String.format("/svg/Appendices/%s/mod2/%s.svg", model.getGraphicLocation(), model.getGraphicIdentifier());
    }

    @Override
    public String getId() {
        return model.getId();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    public ISectorTwoModifier getModel() {
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
