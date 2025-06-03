package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.Amplifier;
import io.github.ctgnz.jmsfx.icon.AmplifierType;
import io.github.ctgnz.jmsfx.icon.SymbolIdentificationCodeElement;

public class AmplifierDto implements SymbolIdentificationCodeElement {

    private final Amplifier amplifier;

    public AmplifierDto(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public Amplifier getAmplifier() {
        return amplifier;
    }

    public String getDescription() {
        return amplifier.getDescription();
    }

    @Override
    public String getId() {
        return amplifier.getId();
    }

    @Override
    public String getLabel() {
        return amplifier.getLabel();
    }

    public int getMax() {
        return amplifier.getMax();
    }

    public int getMin() {
        return amplifier.getMin();
    }

    public AmplifierType getType() {
        return amplifier.getType();
    }

}
