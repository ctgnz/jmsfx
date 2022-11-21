package nz.co.ctg.jmsfx.server.model;

import nz.co.ctg.jmsfx.model.AmplifierGroup;

public class AmplifierData<A extends AmplifierGroup> {
    private final A amplifier;

    public AmplifierData(A amplifier) {
        this.amplifier = amplifier;
    }

    public A getAmplifier() {
        return amplifier;
    }

    public String getLabel() {
        return amplifier.getLabel();
    }

    public String getId() {
        return amplifier.getId();
    }

}
