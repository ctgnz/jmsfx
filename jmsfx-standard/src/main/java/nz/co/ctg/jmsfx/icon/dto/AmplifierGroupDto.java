package nz.co.ctg.jmsfx.icon.dto;

import nz.co.ctg.jmsfx.model.EnumeratedAmplifier;

public class AmplifierGroupDto<A extends EnumeratedAmplifier> {
    private final A amplifier;

    public AmplifierGroupDto(A amplifier) {
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
