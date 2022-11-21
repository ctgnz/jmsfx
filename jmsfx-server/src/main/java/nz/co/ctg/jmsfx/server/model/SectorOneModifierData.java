package nz.co.ctg.jmsfx.server.model;

import nz.co.ctg.jmsfx.model.SectorOneModifier;

public class SectorOneModifierData<M extends SectorOneModifier> {
    private final M modifier;

    public SectorOneModifierData(M modifier) {
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
