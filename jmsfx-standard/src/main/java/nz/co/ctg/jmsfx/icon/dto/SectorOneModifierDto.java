package nz.co.ctg.jmsfx.icon.dto;

import nz.co.ctg.jmsfx.model.SectorOneModifier;

public class SectorOneModifierDto<M extends SectorOneModifier> {
    private final M modifier;

    public SectorOneModifierDto(M modifier) {
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
