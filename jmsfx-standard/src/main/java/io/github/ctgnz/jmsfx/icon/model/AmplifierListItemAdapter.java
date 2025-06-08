package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IAmplifierListItem;

public class AmplifierListItemAdapter<A extends IAmplifierListItem> {
    private final A model;

    public AmplifierListItemAdapter(A amplifier) {
        this.model = amplifier;
    }

    public String getFullId() {
        return model.getFullId();
    }

    public String getGraphicLocation(StandardIdentityAdapter identity) {
        return String.format("/svg/%s/%s%s.svg", model.getGraphicLocation(), identity.getGroup().getId(), model.getFullId());
    }

    public String getId() {
        return model.getId();
    }

    public String getLabel() {
        return model.getLabel();
    }

    public A getModel() {
        return model;
    }

}
