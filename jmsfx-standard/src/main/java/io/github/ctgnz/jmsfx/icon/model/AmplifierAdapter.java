package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.icon.Amplifier;
import io.github.ctgnz.jmsfx.icon.AmplifierType;

public class AmplifierAdapter implements IAmplifier {

    private final Amplifier amplifier;

    public AmplifierAdapter(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public Amplifier getAmplifier() {
        return amplifier;
    }

    @Override
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

    @Override
    public int getMax() {
        return amplifier.getMax();
    }

    @Override
    public int getMin() {
        return amplifier.getMin();
    }

    @Override
    public AmplifierType getType() {
        return amplifier.getType();
    }

}
