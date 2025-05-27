package nz.co.ctg.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "LabelInternalZoneType")
@XmlEnum
public enum LabelInternalZoneType {

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
        CENTER_LEFT("CenterLeft"),
        @XmlEnumValue("Center")
        CENTER("Center");

    public static LabelInternalZoneType fromValue(String v) {
        for (LabelInternalZoneType c : LabelInternalZoneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    private final String value;

    LabelInternalZoneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
