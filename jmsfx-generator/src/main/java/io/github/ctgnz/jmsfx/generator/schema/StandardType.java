package io.github.ctgnz.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "StandardType")
@XmlEnum
public enum StandardType {

        ALL("ALL"),
        MILSTD_2525("MILSTD_2525"),
        @XmlEnumValue("NATO_APP6")
        NATO_APP_6("NATO_APP6");

    public static StandardType fromValue(String v) {
        for (StandardType c : StandardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    private final String value;

    StandardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
