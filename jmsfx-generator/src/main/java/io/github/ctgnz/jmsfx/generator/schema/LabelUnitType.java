package io.github.ctgnz.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "LabelUnitType")
@XmlEnum
public enum LabelUnitType {

        @XmlEnumValue("Map")
        MAP("Map"),
        MM("MM"),
        @XmlEnumValue("Inch")
        INCH("Inch"),
        @XmlEnumValue("Point")
        POINT("Point"),
        @XmlEnumValue("Percentage")
        PERCENTAGE("Percentage");

    public static LabelUnitType fromValue(String v) {
        for (LabelUnitType c : LabelUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    private final String value;

    LabelUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
