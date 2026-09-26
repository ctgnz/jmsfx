package io.github.ctgnz.jmsfx.generator.model;

public enum AmplifierType {

        GRAPHIC,
        ALPHA,
        ALPHANUMERIC,
        NUMERIC,
        LIST;

    public static AmplifierType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
