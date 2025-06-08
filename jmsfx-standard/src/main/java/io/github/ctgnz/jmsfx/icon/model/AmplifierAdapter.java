package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.icon.Amplifier;
import io.github.ctgnz.jmsfx.icon.AmplifierType;

public class AmplifierAdapter implements IAmplifier {

    private final Amplifier model;

    public AmplifierAdapter(Amplifier amplifier) {
        this.model = amplifier;
    }

    public Amplifier getModel() {
        return model;
    }

    @Override
    public String getDescription() {
        return model.getDescription();
    }

    @Override
    public String getId() {
        return model.getId();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    @Override
    public int getMax() {
        return model.getMax();
    }

    @Override
    public int getMin() {
        return model.getMin();
    }

    @Override
    public AmplifierType getType() {
        return model.getType();
    }

}
