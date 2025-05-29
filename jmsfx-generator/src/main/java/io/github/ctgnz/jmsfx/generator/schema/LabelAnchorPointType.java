package io.github.ctgnz.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "LabelAnchorPointType")
@XmlEnum
public enum LabelAnchorPointType {

        @XmlEnumValue("CenterOfLabel")
        CENTER_OF_LABEL("CenterOfLabel"),
        @XmlEnumValue("NearestSideOfLabel")
        NEAREST_SIDE_OF_LABEL("NearestSideOfLabel"),
        @XmlEnumValue("FurthestSideOfLabel")
        FURTHEST_SIDE_OF_LABEL("FurthestSideOfLabel");

    public static LabelAnchorPointType fromValue(String v) {
        for (LabelAnchorPointType c : LabelAnchorPointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    private final String value;

    LabelAnchorPointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
