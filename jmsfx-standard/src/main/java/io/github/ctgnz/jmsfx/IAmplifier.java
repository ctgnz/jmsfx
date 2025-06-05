package io.github.ctgnz.jmsfx;

import io.github.ctgnz.jmsfx.icon.AmplifierType;

public interface IAmplifier extends ICodeElement {

    String getDescription();

    int getMax();

    int getMin();

    AmplifierType getType();

}