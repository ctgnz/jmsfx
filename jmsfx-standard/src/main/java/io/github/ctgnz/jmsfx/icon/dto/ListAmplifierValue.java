package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.ListAmplifier;

public class ListAmplifierValue<A extends ListAmplifier> {
    private final A amplifier;

    public ListAmplifierValue(A amplifier) {
        this.amplifier = amplifier;
    }

    public A getAmplifier() {
        return amplifier;
    }

    public String getFullId() {
        return amplifier.getFullId();
    }

    public String getGraphicLocation(StandardIdentityDto identity) {
        return String.format("/svg/%s/%s%s.svg", amplifier.getGraphicLocation(), identity.getGroup().getId(), amplifier.getFullId());
    }

    public String getId() {
        return amplifier.getId();
    }

    public String getLabel() {
        return amplifier.getLabel();
    }

}
