package nz.co.ctg.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "AreaLabelMethodType")
@XmlEnum
public enum AreaLabelMethodType {

        NA("NA"),
        @XmlEnumValue("HorizontalInPolygon")
        HORIZONTAL_IN_POLYGON("HorizontalInPolygon"),
        @XmlEnumValue("StraightInPolygon")
        STRAIGHT_IN_POLYGON("StraightInPolygon"),
        @XmlEnumValue("CurvedInPolygon")
        CURVED_IN_POLYGON("CurvedInPolygon"),
        @XmlEnumValue("HorizontalAroundPolygon")
        HORIZONTAL_AROUND_POLYGON("HorizontalAroundPolygon"),
        @XmlEnumValue("RepeatAlongBoundary")
        REPEAT_ALONG_BOUNDARY("RepeatAlongBoundary"),
        @XmlEnumValue("CurvedAroundPolygon")
        CURVED_AROUND_POLYGON("CurvedAroundPolygon");

    public static AreaLabelMethodType fromValue(String v) {
        for (AreaLabelMethodType c : AreaLabelMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    private final String value;

    AreaLabelMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
