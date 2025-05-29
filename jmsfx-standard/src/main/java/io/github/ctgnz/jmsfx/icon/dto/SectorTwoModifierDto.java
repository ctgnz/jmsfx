package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;

public class SectorTwoModifierDto<M extends SectorTwoModifier> {
    private final M modifier;

    public SectorTwoModifierDto(M modifier) {
        this.modifier = modifier;
    }

    public M getModifier() {
        return modifier;
    }

    public String getLabel() {
        return modifier.getLabel();
    }

    public String getId() {
        return modifier.getId();
    }

}
