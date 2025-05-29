package io.github.ctgnz.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "LabelExternalZoneType")
@XmlEnum
public enum LabelExternalZoneType {

        NA("NA"),
        @XmlEnumValue("AboveLeft")
        ABOVE_LEFT("AboveLeft"),
        @XmlEnumValue("AboveCenter")
        ABOVE_CENTER("AboveCenter"),
        @XmlEnumValue("AboveRight")
        ABOVE_RIGHT("AboveRight"),
        @XmlEnumValue("CenterRight")
        CENTER_RIGHT("CenterRight"),
        @XmlEnumValue("BelowRight")
        BELOW_RIGHT("BelowRight"),
        @XmlEnumValue("BelowCenter")
        BELOW_CENTER("BelowCenter"),
        @XmlEnumValue("BelowLeft")
        BELOW_LEFT("BelowLeft"),
        @XmlEnumValue("CenterLeft")
        CENTER_LEFT("CenterLeft");

    public static LabelExternalZoneType fromValue(String v) {
        for (LabelExternalZoneType c : LabelExternalZoneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    private final String value;

    LabelExternalZoneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
