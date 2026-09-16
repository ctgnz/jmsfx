package io.github.ctgnz.jmsfx.generator.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "AmplifierType")
@XmlEnum
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
