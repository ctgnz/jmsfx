package io.github.ctgnz.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "PointLabelMethodType")
@XmlEnum
public enum PointLabelMethodType {

        NA("NA"),
        @XmlEnumValue("AroundPoint")
        AROUND_POINT("AroundPoint"),
        @XmlEnumValue("CenteredOnPoint")
        CENTERED_ON_POINT("CenteredOnPoint"),
        @XmlEnumValue("NorthOfPoint")
        NORTH_OF_POINT("NorthOfPoint"),
        @XmlEnumValue("NorthEastOfPoint")
        NORTH_EAST_OF_POINT("NorthEastOfPoint"),
        @XmlEnumValue("EastOfPoint")
        EAST_OF_POINT("EastOfPoint"),
        @XmlEnumValue("SouthEastOfPoint")
        SOUTH_EAST_OF_POINT("SouthEastOfPoint"),
        @XmlEnumValue("SouthOfPoint")
        SOUTH_OF_POINT("SouthOfPoint"),
        @XmlEnumValue("SouthWestOfPoint")
        SOUTH_WEST_OF_POINT("SouthWestOfPoint"),
        @XmlEnumValue("WestOfPoint")
        WEST_OF_POINT("WestOfPoint"),
        @XmlEnumValue("NorthWestOfPoint")
        NORTH_WEST_OF_POINT("NorthWestOfPoint");

    public static PointLabelMethodType fromValue(String v) {
        for (PointLabelMethodType c : PointLabelMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    private final String value;

    PointLabelMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
