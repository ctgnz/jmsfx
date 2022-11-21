package nz.co.ctg.jmsfx.server.model;

import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public class SectorTwoModifierData<M extends SectorTwoModifier> {
    private final M modifier;

    public SectorTwoModifierData(M modifier) {
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
