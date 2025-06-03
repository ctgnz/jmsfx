package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public class SectorTwoModifierDto implements SectorTwoModifier {
    private final SectorTwoModifier modifier;

    public SectorTwoModifierDto(SectorTwoModifier modifier) {
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

    public SectorTwoModifier getModifier() {
        return modifier;
    }

    @Override
    public SymbolSet getSymbolSet() {
        return modifier.getSymbolSet();
    }

    @Override
    public boolean isUnknown() {
        return modifier.isUnknown();
    }
}
