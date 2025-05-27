package nz.co.ctg.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "LineLabelMethodType")
@XmlEnum
public enum LineLabelMethodType {

        NA("NA"),
        @XmlEnumValue("CenteredHorizontalOnLine")
        CENTERED_HORIZONTAL_ON_LINE("CenteredHorizontalOnLine"),
        @XmlEnumValue("CenteredStraightOnLine")
        CENTERED_STRAIGHT_ON_LINE("CenteredStraightOnLine"),
        @XmlEnumValue("CenteredCurvedOnLine")
        CENTERED_CURVED_ON_LINE("CenteredCurvedOnLine"),
        @XmlEnumValue("CenteredPerpendicularOnLine")
        CENTERED_PERPENDICULAR_ON_LINE("CenteredPerpendicularOnLine"),
        @XmlEnumValue("OffsetHorizontalFromLine")
        OFFSET_HORIZONTAL_FROM_LINE("OffsetHorizontalFromLine"),
        @XmlEnumValue("OffsetStraightFromLine")
        OFFSET_STRAIGHT_FROM_LINE("OffsetStraightFromLine"),
        @XmlEnumValue("OffsetCurvedFromLine")
        OFFSET_CURVED_FROM_LINE("OffsetCurvedFromLine"),
        @XmlEnumValue("OffsetPerpendicularFromLine")
        OFFSET_PERPENDICULAR_FROM_LINE("OffsetPerpendicularFromLine");

    public static LineLabelMethodType fromValue(String v) {
        for (LineLabelMethodType c : LineLabelMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    private final String value;

    LineLabelMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
