package io.github.ctgnz.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "ConstrainOffsetType")
@XmlEnum
public enum ConstrainOffsetType {

        @XmlEnumValue("NoConstraint")
        NO_CONSTRAINT("NoConstraint"),
        @XmlEnumValue("AboveLine")
        ABOVE_LINE("AboveLine"),
        @XmlEnumValue("BelowLine")
        BELOW_LINE("BelowLine"),
        @XmlEnumValue("LeftOfLine")
        LEFT_OF_LINE("LeftOfLine"),
        @XmlEnumValue("RightOfLine")
        RIGHT_OF_LINE("RightOfLine");

    public static ConstrainOffsetType fromValue(String v) {
        for (ConstrainOffsetType c : ConstrainOffsetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    private final String value;

    ConstrainOffsetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
