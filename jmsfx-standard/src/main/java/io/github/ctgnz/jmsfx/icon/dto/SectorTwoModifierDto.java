package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public class SectorTwoModifierDto implements SectorTwoModifier {
    private final SectorTwoModifier modifier;

    public SectorTwoModifierDto(SectorTwoModifier modifier) {
        this.modifier = modifier;
    }

    public SectorTwoModifier getModifier() {
        return modifier;
    }

    @Override
    public String getLabel() {
        return modifier.getLabel();
    }

    @Override
    public String getId() {
        return modifier.getId();
    }

    @Override
    public SymbolSet getSymbolSet() {
        return modifier.getSymbolSet();
    }

    @Override
    public String getCategory() {
        return modifier.getCategory();
    }

}
