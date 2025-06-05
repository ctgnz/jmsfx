package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IListAmplifier;

public class ListAmplifierValueAdapter<A extends IListAmplifier> {
    private final A amplifier;

    public ListAmplifierValueAdapter(A amplifier) {
        this.amplifier = amplifier;
    }

    public A getAmplifier() {
        return amplifier;
    }

    public String getFullId() {
        return amplifier.getFullId();
    }

    public String getGraphicLocation(StandardIdentityAdapter identity) {
        return String.format("/svg/%s/%s%s.svg", amplifier.getGraphicLocation(), identity.getGroup().getId(), amplifier.getFullId());
    }

    public String getId() {
        return amplifier.getId();
    }

    public String getLabel() {
        return amplifier.getLabel();
    }

}
