package io.github.ctgnz.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "LabelRuleType")
@XmlEnum
public enum LabelRuleType {

        @XmlEnumValue("Point")
        POINT("Point"),
        @XmlEnumValue("Line")
        LINE("Line"),
        @XmlEnumValue("Area")
        AREA("Area");

    public static LabelRuleType fromValue(String v) {
        for (LabelRuleType c : LabelRuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    private final String value;

    LabelRuleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
