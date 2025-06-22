package io.github.ctgnz.jmsfx;

import io.github.ctgnz.jmsfx.types.AmplifierType;

public interface Amplifier extends CodeElement {

    String getDescription();

    int getMax();

    int getMin();

    AmplifierType getType();

}