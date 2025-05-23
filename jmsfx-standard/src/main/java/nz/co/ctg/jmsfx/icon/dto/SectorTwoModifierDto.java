package nz.co.ctg.jmsfx.icon.dto;

import nz.co.ctg.jmsfx.model.SectorTwoModifier;

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
